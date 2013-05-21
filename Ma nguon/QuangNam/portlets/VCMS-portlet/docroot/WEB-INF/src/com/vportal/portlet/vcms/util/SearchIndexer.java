/*
 * @(#)SearchIndexer.java
 *
 * Copyright (c) 2007 VietSoftware, Inc.
 * 51 Le Dai Hanh street, Hai Ba Trung district, Hanoi, Vietnam.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * VietSoftware, Inc. ("Confidential Information").  You shall not 
 * disclose such Confidential Information and shall use it only in 
 * accordance with the terms of the license agreement you entered 
 * into with VietSoftware, Inc.
 *
 */

package com.vportal.portlet.vcms.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.portlet.PortletURL;

import com.liferay.documentlibrary.service.DLLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vcms.model.VcmsArticle;
import com.vportal.portlet.vcms.model.VcmsCARelation;
import com.vportal.portlet.vcms.service.VcmsArticleServiceUtil;
import com.vportal.portlet.vcms.service.VcmsCARelationServiceUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.vportal.util.FileUtilExt;
/**
 * @author donghh
 * @version 1.0.00, Jul 14, 2008
 */

public class SearchIndexer implements Indexer {

	public static final String PORTLET_ID = PortletKeysExt.VCMS;
	
	public static void addArticle(
			long companyId, long groupId, String articleId,
			String title, String description, String content)
		throws IOException, NumberFormatException, PortalException, SystemException {
		Document doc = getAddArticleDocument(companyId, groupId, articleId, title, description, content);
		SearchEngineUtil.addDocument(companyId, doc);
	}

	public static void deleteArticle(long companyId, String articleId)
		throws IOException, SearchException, NumberFormatException {

		SearchEngineUtil.deleteDocument(companyId, getEntryUID(Long.parseLong(articleId)));
	}

	public static Document getAddArticleDocument(
		long companyId, long groupId, String articleId,
		String title, String description, String content) throws NumberFormatException, PortalException, SystemException {
		
		InputStream is = null;
		List addedAttachments = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(articleId), VcmsArticle.class);
		for(int i=0;i<addedAttachments.size();i++){
			Attachment attachment = (Attachment)addedAttachments.get(i);
			DLFileEntry entry = null; 
			try{
				entry = (DLFileEntry)DLFileEntryLocalServiceUtil.getFileEntry(attachment.getFileEntryId());
				/*String fileExtension = entry.getTitleWithExtension();
				String extension = fileExtension.substring(fileExtension.lastIndexOf(".")+1,fileExtension.length());*/
				String extension = entry.getExtension();
				is = DLLocalServiceUtil.getFileAsStream(companyId, entry.getFolderId(), entry.getName());			
				content = FileUtilExt.getContentFile(is,content,extension);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		content = HtmlUtil.extractText(content);
		Document doc = new DocumentImpl();
		doc.addUID(PORTLET_ID, articleId);
		
		doc.addKeyword(Field.COMPANY_ID, companyId);
		doc.addKeyword(Field.PORTLET_ID, PORTLET_ID);
		doc.addKeyword(Field.GROUP_ID, groupId);

		doc.addText(Field.TITLE, title);
		doc.addText(Field.CONTENT, content);
		doc.addText(Field.DESCRIPTION, description);
		doc.addModifiedDate();

		doc.addKeyword(Field.ENTRY_CLASS_NAME, VcmsArticle.class.getName());
		doc.addKeyword(Field.ENTRY_CLASS_PK, articleId);
		return doc;
	}

	public static void updateArticle(
			long companyId, long groupId, String articleId,
			String title, String description, String content)
		throws IOException, NumberFormatException, PortalException, SystemException {
		Document doc = getAddArticleDocument(companyId, groupId, articleId, title, description, content);
		/*SearchEngineUtil.updateDocument(companyId, doc.get(Field.UID), doc);*/
		SearchEngineUtil.updateDocument(companyId, doc);

	}
	public static String getEntryUID(long quesId) {
		Document doc = new DocumentImpl();
		doc.addUID(PORTLET_ID, quesId);

		return doc.get(Field.UID);
	}
	public Summary getDocumentSummary(
		com.liferay.portal.kernel.search.Document doc, PortletURL portletURL) {

		// Title

		String title = doc.get(Field.TITLE);

		// Content

		String content = doc.get(Field.CONTENT);

		content = StringUtil.shorten(content, 200);

		// Portlet URL

		String articleId = doc.get(Field.ENTRY_CLASS_PK);

		portletURL.setParameter("struts_action", "/vcmsviewcontent/view");
		portletURL.setParameter("articleId", articleId);
		VcmsCARelation category = null;
		try{
			category = VcmsCARelationServiceUtil.findRelationsByArticle(articleId);
		}catch (Exception e) {
			// TODO: handle exception
		}
		String categoryId = "";
		if(category!= null){
			categoryId = String.valueOf(category.getCategoryId());
		}
		portletURL.setParameter("categoryId", categoryId);
		return new Summary(title, content, portletURL);
	}

	public void reindex(String[] ids) throws SearchException {
		try {
			VcmsArticleServiceUtil.reIndex(ids);
		}
		catch (Exception e) {
			throw new SearchException(e);
		}
	}

	@Override
	public void delete(Object obj) throws SearchException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getClassNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document getDocument(Object obj) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Summary getSummary(Document document, String snippet,
			PortletURL portletURL) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reindex(Object obj) throws SearchException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reindex(String className, long classPK) throws SearchException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hits search(SearchContext searchContext) throws SearchException {
		// TODO Auto-generated method stub
		return null;
	}
}
