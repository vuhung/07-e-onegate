package com.vportal.portlet.vlegal.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.portlet.PortletURL;

import com.liferay.documentlibrary.service.DLLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Summary;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.servlet.MainServlet;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.util.FileUtilExt;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;


public class SearchIndexer implements Indexer {

	public static final long DEFAULT_COMPANY_ID = MainServlet.DEFAULT_COMPANY_ID;

	public static final String GROUP_ID = "groupId";

	public static final String LANGUAGE = "language";

	public static final String DOCUMENT_ID = "docId";
	
	public static final String PORTLET_ID = PortletKeysExt.VLEGAL;
	
	@SuppressWarnings("deprecation")
	public static void addDocument(String docId,long companyId) throws IOException, NumberFormatException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		Document doc = getAddLegalDocument(docId,companyId);
		SearchEngineUtil.addDocument(companyId, doc);

	}
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static Document getAddLegalDocument(String docId,long companyId) throws NumberFormatException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException{
		VLegalDocument document = null;
		try {
			document = VLegalDocumentServiceUtil.getDocument(docId);
		} catch (Exception ex) {
			// TO EXCEPTION HERE
		}
		String numSymbol = document.getNum() + "/" + document.getSymbol();
		String summary = HtmlUtil.stripHtml(document.getSummary());
		InputStream is = null;
		List addedAttachments = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(docId),VLegalDocument.class);
		String content =document.getContent();
		for(int i=0;i<addedAttachments.size();i++){
			Attachment attachment = (Attachment)addedAttachments.get(i);
			DLFileEntry entry = null; 
			try{
				entry = (DLFileEntry)DLFileEntryLocalServiceUtil.getFileEntry(attachment.getFileEntryId());
				String fileExtension = entry.getExtension();
				String extension = fileExtension.substring(fileExtension.lastIndexOf(".")+1,fileExtension.length());
				is = DLLocalServiceUtil.getFileAsStream(companyId, entry.getFolderId(), entry.getName());			
				content = FileUtilExt.getContentFile(is,content,extension);
				
			}catch (Exception e) {
			}
		}
		content = HtmlUtil.stripHtml(content);
		Document doc = new DocumentImpl();
		doc.addUID(PORTLET_ID, docId);
		
		doc.addKeyword(Field.COMPANY_ID, companyId);
		doc.addKeyword(Field.PORTLET_ID, PORTLET_ID);
		doc.addKeyword(Field.GROUP_ID, document.getGroupId());

		doc.addText(Field.TITLE, numSymbol);
		doc.addText(Field.DESCRIPTION, summary);
		doc.addText(Field.CONTENT, content);

		doc.addModifiedDate();

		doc.addKeyword(Field.ENTRY_CLASS_NAME, VLegalDocument.class.getName());
		doc.addKeyword(Field.ENTRY_CLASS_PK, docId);
		
		return doc;
	}
	
	
	public static void deleteDocument(String docId,long companyId) throws IOException, SearchException, NumberFormatException {
		SearchEngineUtil.deleteDocument(companyId, getEntryUID(Long.parseLong(docId)));
	}

	@SuppressWarnings("deprecation")
	public static void updateDocument(String docId,long companyId) throws IOException, NumberFormatException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		Document doc = getAddLegalDocument(docId,companyId);
		SearchEngineUtil.updateDocument(companyId, doc);
	}
	public static String getEntryUID(long quesId) {
		Document doc = new DocumentImpl();
		doc.addUID(PORTLET_ID, quesId);

		return doc.get(Field.UID);
	}
	public void reIndex(String[] ids) throws SearchException {
		try {
			VLegalDocumentServiceUtil.reIndex(ids);
		} catch (Exception e) {
			throw new SearchException(e);
		}
	}

//	public DocumentSummary getDocumentSummary(
//			com.liferay.portal.kernel.search.Document doc, PortletURL portletURL) {
//
//		int contentLength = 200;
//
//		// Title
//
//		String title = doc.get(Field.TITLE);
//
//		// Content
//
//		String content = doc.get(Field.CONTENT);
//
//		content = StringUtil.shorten(content, 200);
//
//		// Portlet URL
//
//		String documentId = doc.get(Field.ENTRY_CLASS_PK);
//		content = StringUtil.shorten(content, contentLength);
//
//		portletURL.setParameter(DOCUMENT_ID, documentId);
//
//		return new DocumentSummary(title, content, portletURL);
//	}
	@Override
	public void delete(Object arg0) throws SearchException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] getClassNames() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Document getDocument(Object arg0) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Summary getSummary(Document arg0, String arg1, PortletURL arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void reindex(Object arg0) throws SearchException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reindex(String[] arg0) throws SearchException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reindex(String arg0, long arg1) throws SearchException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Hits search(SearchContext arg0) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}
}
