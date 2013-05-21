/**
 * 
 */
package com.vportal.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import com.liferay.portal.kernel.util.HtmlUtil;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.cyberneko.html.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author Nguyen Tuan Anh
 * @version 1.0
 * @since CVN 2.0beta2-build08072006
 */
public class HtmlExt extends HtmlUtil {

	public static String welform(String html) {
		InputSource is = new InputSource(new StringReader(html));
		DOMParser dom = new DOMParser();
		Document doc = null;

		try {
			dom.parse(is);
			doc = dom.getDocument();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (doc == null) {
			return null;
		}

		return dom2String(doc);
	}

	public static String welform(String html, boolean fullHTML) {

		if (fullHTML) {
			return welform(html);
		}

		InputSource is = new InputSource(new StringReader(html));
		DOMParser dom = new DOMParser();
		Document doc = null;

		try {
			dom.parse(is);
			doc = dom.getDocument();

			if (doc != null) {
				NodeList list = doc.getElementsByTagName("BODY");
				NodeList list2 = doc.getElementsByTagName("HTML");

				if ((list != null) && (list.getLength() > 0) && (list2 != null)
						&& (list2.getLength() > 0)) {

					Element bodyNode = (Element) list.item(0);
					Element htmlNode = (Element) list2.item(0);

					doc.renameNode(bodyNode, null, "div");
					doc.removeChild(htmlNode);
					doc.normalize();

					doc.appendChild(bodyNode);
				}
			}

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (doc == null) {
			return null;
		}

		return dom2String(doc);
	}

	public static String dom2String(Document doc) {

		StringWriter stringOut = new StringWriter();

		try {
			OutputFormat format = new OutputFormat(doc, "UTF-8", false);
			format.setOmitXMLDeclaration(true);
			format.setOmitDocumentType(true);
			
			XMLSerializer serializer = new XMLSerializer(stringOut, format);

			serializer.serialize(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stringOut.toString();
	}

	public static void main(String[] args) throws Exception {
		String input = "<HTML><HEAD></HEAD><BODY><H1>Hello World</H1><p>Do something interesting!<h2>Testing..</HTML>";

		System.out.println(welform(input, false));
	}

}
