package com.vportal.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.poi.hslf.HSLFSlideShow;
import org.apache.poi.hslf.model.AutoShape;
import org.apache.poi.hslf.model.Line;
import org.apache.poi.hslf.model.Picture;
import org.apache.poi.hslf.model.Shape;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.SlideShow;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.pdfbox.cos.COSDocument;
import org.pdfbox.pdfparser.PDFParser;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.util.PDFTextStripper;

public class FileUtilExt {
    public static String getContentFile(InputStream is,String content,String typeFile) throws IOException{
    	StringBuffer sb = new StringBuffer();
    	sb.append(content);
    	try{
	    	if(typeFile.equals("doc")){
				HWPFDocument file = new HWPFDocument(is);
				Range r = file.getRange();
				sb.append(r.text());	
			}else if(typeFile.equals("pdf")){
				COSDocument cosDoc =null;
				try{
					PDFParser  parser= new PDFParser(is);
					parser.parse();
					cosDoc =parser.getDocument();
					PDFTextStripper pdfStripper = new PDFTextStripper();
					PDDocument pdDoc = new PDDocument(cosDoc);
					sb.append(pdfStripper.getText(pdDoc));
				}catch (Exception e) {
					// TODO: handle exception
				}finally{
					cosDoc.close();
				}
			}else if(typeFile.equals("xls")){
					HSSFWorkbook  workBook = new HSSFWorkbook (is);
					int totalSheet = workBook.getNumberOfSheets();
					for(int i=0;i<totalSheet;i++){
						HSSFSheet sheet    = workBook.getSheetAt (i);
						Iterator<Row> rows     = sheet.rowIterator ();
						while (rows.hasNext ())
						{
						   Row row = rows.next ();
						   Iterator<Cell> cells = row.cellIterator ();
						   while (cells.hasNext ())
						   {
						   Cell cell = cells.next ();
						   switch (cell.getCellType ())
						   {
						   	case HSSFCell.CELL_TYPE_NUMERIC :
						   	{
						   		// cell type numeric.
						   		sb.append(Double.toString(cell.getNumericCellValue()));
						   		break;
						   	}
						   	
						   	case HSSFCell.CELL_TYPE_STRING :
						   	{
						   		
						   		// cell type string.
						   		RichTextString richTextString = cell.getRichStringCellValue ();
						   		sb.append(richTextString.toString());
						   		break;
						   	}
						   	
						   	default :
						   	{
						   		// types other than String and Numeric type not support
						   		break;
						   	}
						   }
						 }
						}
						sb.append("  ");
					}
			}else if(typeFile.equals("ppt")){
				 SlideShow ppt = new SlideShow(new HSLFSlideShow(is));
				 Slide[] slide = ppt.getSlides();
				  for (int i = 0; i < slide.length; i++){
				    Shape[] sh = slide[i].getShapes();
				    for (int j = 0; j < sh.length; j++){
				        //name of the shape
				        String name = sh[j].getShapeName();

				        //shapes's anchor which defines the position of this shape in the slide
				        java.awt.Rectangle anchor = sh[j].getAnchor();

				        if (sh[j] instanceof Line){
				          Line line = (Line)sh[j];
				          //work with Line
				        } else if (sh[j] instanceof AutoShape){
				          AutoShape shape = (AutoShape)sh[j];
				          //work with AutoShape
				        } else if (sh[j] instanceof TextBox){
				          TextBox shape = (TextBox)sh[j];
				          sb.append(shape.getText());
				          //work with TextBox
				        } else if (sh[j] instanceof Picture){
				          Picture shape = (Picture)sh[j];
				          //work with Picture
				        }
				      }
				  }
			}else if(typeFile.equals("html") || typeFile.equals("htm")){
				if (is != null) {
					InputStreamReader isr =null;
					BufferedReader reader = null;
					try{
						isr = new InputStreamReader(is);
						reader = new BufferedReader(isr);
						String text = "";
						while ((text = reader.readLine()) != null) {
							sb.append(text);
						}
					}catch (Exception e) {
						// TODO: handle exception
					}finally{
						isr.close();
						reader.close();
					}
				}
			}
    	 }catch (Exception e) {
			// TODO: handle exception
		}finally{
			is.close();
		}
    	return sb.toString();
    }
}
