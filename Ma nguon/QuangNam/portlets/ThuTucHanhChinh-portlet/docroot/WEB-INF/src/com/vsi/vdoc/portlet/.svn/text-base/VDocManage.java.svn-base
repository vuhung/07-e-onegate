package com.vsi.vdoc.portlet;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.portlet.vdoc.DeleteOrgException;
import com.portlet.vdoc.InvalidFieldDocException;
import com.portlet.vdoc.InvalidNameOrgException;
import com.portlet.vdoc.NoSuchvdocOrgException;

import com.portlet.vdoc.model.vdocField;
import com.portlet.vdoc.model.vdocDocument;
import com.portlet.vdoc.model.impl.vdocDocumentImpl;
import com.portlet.vdoc.model.vdocOrg;

import com.portlet.vdoc.service.vdocDORelLocalServiceUtil;
import com.portlet.vdoc.service.vdocDocumentServiceUtil;
import com.portlet.vdoc.service.vdocFieldLocalServiceUtil;
import com.portlet.vdoc.service.vdocOrgLocalServiceUtil;
import com.portlet.vdoc.service.vdocDocumentLocalServiceUtil;
import com.portlet.vdoc.service.impl.vdocDocumentLocalServiceImpl;
import com.portlet.vdoc.service.persistence.vdocDocumentFinderUtil;
import com.portlet.vdoc.service.persistence.vdocDocumentPersistence;

import com.vportal.portal.service.AccessCounterServiceUtil;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.taglib.FileUploadUtil;
import com.vportal.portal.util.PortletKeysExt;

public class VDocManage extends MVCPortlet{
	
	public static final int APPROVAL_PENDING = 0;

	public static final int PUBLISH_PENDING = 1;

	public static final int PUBLISHED = 2;
 
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws SystemException
	 * @throws PortalException
	 * @throws RemoteException
	 */
	public void updateField(ActionRequest req, ActionResponse res) throws SystemException, PortalException, RemoteException{
		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		
		Layout layout = themeDisplay.getLayout();
		
		String fieldId = ParamUtil.getString(req, "fieldId");
		String parentId = ParamUtil.getString(req, "parentId", "0");
		long groupId = layout.getGroupId();
		long userId = themeDisplay.getUserId();
		String name = ParamUtil.getString(req, "name");
		String description = ParamUtil.getString(req, "description");
		String language = ParamUtil.getString(req, "language");		
		int position = 0;
		int positionForm = ParamUtil.getInteger(req, "position");
		if(positionForm == 0){
			position += 1;
		}else{
			position = positionForm;
		}
		boolean statusField = Validator.isNotNull(ParamUtil.getString(req,
				"status")) ? true : false;
		
		vdocField field = null;
		
		String[] communityPermissions = req.getParameterValues("communityPermissions");
		String[] guestPermissions = req.getParameterValues("guestPermissions");
		
		String listParent = "0";
		if(!parentId.equals("0")){
			listParent = vdocFieldLocalServiceUtil.getField(parentId).getListparent();
			System.out.println("List parent: " + listParent);
		}
		
		if(fieldId.equals("0") || Validator.isNull(fieldId)){
			field = vdocFieldLocalServiceUtil.addField(groupId, userId, language, parentId, name, 
					description, statusField, position, listParent, communityPermissions, guestPermissions, themeDisplay);
		}else{
			field = vdocFieldLocalServiceUtil.getField(fieldId);
			field.setName(name);
			field.setDescription(description);
			field.setLanguage(language);
			field.setPosition(position);
			field.setListparent(listParent);
			vdocFieldLocalServiceUtil.updateField(field, userId);
		}
		
		res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=field-tab");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void deleteField(ActionRequest req, ActionResponse res) throws PortalException, SystemException{		
		String fieldId = ParamUtil.getString(req, "fieldId");
		if(Validator.isNotNull(fieldId)){
			vdocFieldLocalServiceUtil.deleteField(fieldId);
		}
		res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=field-tab");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws SystemException
	 * @throws PortalException
	 * @throws RemoteException
	 */
	public void updateOrg(ActionRequest req, ActionResponse res) throws SystemException, PortalException, RemoteException{
		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		
		Layout layout = themeDisplay.getLayout();
		
		long groupId = layout.getGroupId();
		long userId = themeDisplay.getUserId();
		
		String orgId = ParamUtil.getString(req, "orgId");
		String parentId = ParamUtil.get(req, "parentId", "0");
		String name = ParamUtil.getString(req, "name");
		String description = ParamUtil.getString(req, "description");
		String address = ParamUtil.getString(req, "address");
		String phone = ParamUtil.getString(req, "phone");
		int position = 0;
		int positionForm = ParamUtil.getInteger(req, "position");
		if(positionForm == 0){
			position += 1;
		}else{
			position = positionForm;
		}
		boolean statusOrg = Validator.isNotNull(ParamUtil.getString(req,
				"status")) ? true : false;
		String fax = ParamUtil.getString(req, "fax");
		String language = ParamUtil.getString(req, "language");	
		
		vdocOrg org = null;
		
		String[] communityPermissions = req.getParameterValues("communityPermissions");
		String[] guestPermissions = req.getParameterValues("guestPermissions");
		
		String listParent = "0";
		if(!parentId.equals("0")){
			listParent = vdocOrgLocalServiceUtil.getOrg(parentId).getListparent();
			System.out.println("List parent: " + listParent);
		}
		
		if(orgId.equals("0") || Validator.isNull(orgId)){
			org = vdocOrgLocalServiceUtil.addOrg(groupId, userId, language, parentId, name, description, address, phone, 
					statusOrg, position, fax, listParent, communityPermissions, guestPermissions, themeDisplay);
		}else{
			org = vdocOrgLocalServiceUtil.getOrg(orgId);
			org.setName(name);
			org.setDescription(description);
			org.setAddress(address);
			org.setPhone(phone);
			org.setPosition(position);
			org.setFax(fax);
			org.setLanguage(language);
			org.setListparent(listParent);
			
			vdocOrgLocalServiceUtil.updateOrg(org, userId);
		}
		
		res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=organization-tab");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws NoSuchvdocOrgException
	 * @throws DeleteOrgException
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void deleteOrg(ActionRequest req, ActionResponse res) throws NoSuchvdocOrgException, DeleteOrgException, PortalException, SystemException{
		String orgId = ParamUtil.getString(req, "orgId");
		if(Validator.isNotNull(orgId)){
			vdocOrgLocalServiceUtil.deleteOrg(orgId);
		}
		res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=organization-tab");
	}
	
	@SuppressWarnings("rawtypes")
	public void updateDocument(ActionRequest req, ActionResponse res) throws SystemException, PortalException, RemoteException{
		UploadPortletRequest uploadReq = PortalUtil.getUploadPortletRequest(req);
			
		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		Layout layout = themeDisplay.getLayout();
		
		String docId = ParamUtil.getString(uploadReq, "docId");
		long groupId = layout.getGroupId();
		String language = ParamUtil.getString(uploadReq, "language");
		long userId = themeDisplay.getUserId();
		
		String fieldId = ParamUtil.getString(uploadReq, "fieldId");
		
		String fieldRels = "";
		String orgRels = "";
		
		if ((Validator.isNull(fieldId)) || (fieldId.equals("0"))) {
			throw new InvalidFieldDocException();
		} else {
			vdocField field = vdocFieldLocalServiceUtil.getField(fieldId);
			fieldRels = field.getName();
		}
		
		String orgIds[] = uploadReq.getParameterValues("orgId");
		
		int typeDoc = vdocDocumentLocalServiceImpl.SINGLE;

		if (Validator.isNotNull(orgIds) && orgIds.length > 1) {
			typeDoc = vdocDocumentLocalServiceImpl.MULTI;
		}
		if (Validator.isNull(orgIds) || (orgIds.length < 1)) {
			throw new InvalidNameOrgException();
		}
		String title = ParamUtil.getString(uploadReq, "title");
//		if (Validator.isNull(title)) {
//			throw new InvalidTitleDocException();
//		}

		String process = ParamUtil.getString(uploadReq, "process");
		String base = ParamUtil.getString(uploadReq, "base");
		String cost = ParamUtil.getString(uploadReq, "cost");
		String require = ParamUtil.getString(uploadReq, "require");
		String result = ParamUtil.getString(uploadReq, "result");
		String objects = ParamUtil.getString(uploadReq, "objects");
		String style = ParamUtil.getString(uploadReq, "style");
		String time = ParamUtil.getString(uploadReq, "time");
		String content = ParamUtil.getString(uploadReq, "content");
//		if (Validator.isNull(content)) {
//			throw new InvalidContentDocException();
//		}

		String note = ParamUtil.getString(uploadReq, "note");

		String save_approve = ParamUtil.getString(uploadReq,
				"saveAndApprove");
		String save_publish = ParamUtil.getString(uploadReq,
				"saveAndPublish");

		Date promulDate = null;
		Date effectivedDate = null;
		Date expiredDate = null;

		boolean hasAttachment = false;

		String[] communityPermissions = uploadReq
				.getParameterValues("communityPermissions");

		String[] guestPermissions = uploadReq
				.getParameterValues("guestPermissions");

		vdocDocument vdoc = new vdocDocumentImpl();
		
		if ((docId.equals("0")) ||  (Validator.isNull(docId))) {
			docId = String.valueOf(CounterLocalServiceUtil.increment());

			for (int i = 0; i < orgIds.length; i++) {
				vdocOrg org = vdocOrgLocalServiceUtil.getOrg(orgIds[i]);
				vdocDORelLocalServiceUtil.addRelation(docId, orgIds[i]);
				orgRels += org.getName() + (i < orgIds.length - 1 ? "," : "");
			}
			System.out.println("ADD DOCUMENT+++++++++++++++++++++++++++");
			vdoc = vdocDocumentLocalServiceUtil.addDocument(docId, groupId,
					language, userId, title, content, process, base, time, cost,
					result, require, objects, style, note, promulDate,
					effectivedDate, expiredDate, fieldId, orgRels, fieldRels,
					hasAttachment, typeDoc, communityPermissions,
					guestPermissions, themeDisplay);

		} else {
			vdocDORelLocalServiceUtil.deleteRelByDoc(docId);
			for (int i = 0; i < orgIds.length; i++) {
				vdocOrg org = vdocOrgLocalServiceUtil.getOrg(orgIds[i]);
				vdocDORelLocalServiceUtil.addRelation(docId, orgIds[i]);
				orgRels += org.getName() + (i < orgIds.length - 1 ? "," : "");
			}
			
			vdoc = vdocDocumentLocalServiceUtil.updateDocument(docId, groupId, language, userId, typeDoc, title, content, 
					process, base, time, cost, result, require, objects, style, note, promulDate, effectivedDate,
					expiredDate, fieldId, orgRels, fieldRels, hasAttachment, typeDoc);
			System.out.println("UPDATE DOCUMENT+++++++++++++++++++++++++++");
		}
		
		if (save_approve.equalsIgnoreCase("save-approve")) {

			vdoc.setStatusDoc(vdocDocumentLocalServiceImpl.PUBLISH_PENDING);
			vdoc.setApprovedDate(new Date());
			vdoc.setApprovedByUser(themeDisplay.getUserId());
			System.out.println("save-approve+++++++++++++++++++++++++++");
			
			vdocDocumentLocalServiceUtil.updateDocument(vdoc);

		} else if (save_publish.equalsIgnoreCase("save-publish")) {

			vdoc.setStatusDoc(vdocDocumentLocalServiceImpl.PUBLISHED);
			vdoc.setPublishedDate(new Date());
			vdoc.setPublishedByUser(themeDisplay.getUserId());
			System.out.println("save-publish+++++++++++++++++++++++++++");
			vdocDocumentLocalServiceUtil.updateDocument(vdoc);
		}
		
		String portletId = PortletKeysExt.VDOC;
		FileUploadUtil.uploadFile(req,uploadReq, portletId, vdocDocument.class,
				Long.parseLong(vdoc.getDocId()));

		List addedAttachments = AttachmentLocalServiceUtil.getAttachments(Long
				.parseLong(vdoc.getDocId()), vdocDocument.class);

		hasAttachment = ((addedAttachments != null) && (addedAttachments.size() > 0));

		if (hasAttachment) {
			vdoc.setHasAttachment(true);
			vdocDocumentLocalServiceUtil.updateDocument(vdoc);
		}
		
		res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=document-tab");
	}
	
	/**
	 * 
	 * Approve Document
	 * 
	 */
	public void approveDocument(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		String docId = ParamUtil.getString(req, "docId");
		String[] docIds = StringUtil.split(ParamUtil.get(req, "allRowIds",StringPool.BLANK));
		long userId = PortalUtil.getUserId(req);
		
		if(Validator.isNotNull(docId)){
			vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docId);
			doc.setApprovedByUser(userId);
			doc.setApprovedDate(new Date());
			doc.setStatusDoc(PUBLISH_PENDING);
			vdocDocumentLocalServiceUtil.updateDocument(doc);			
			res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=document-tab");
		}else{
			for(int i = 0; i < docIds.length; i++){
				vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docIds[i]);
				doc.setApprovedByUser(userId);
				doc.setApprovedDate(new Date());
				doc.setStatusDoc(PUBLISH_PENDING);
				vdocDocumentLocalServiceUtil.updateDocument(doc);	
			}
		}
	}
	
	/**
	 * 
	 * Publish Document
	 * 
	 */
	public void publishDocument(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		String docId = ParamUtil.getString(req, "docId");
		String[] docIds = StringUtil.split(ParamUtil.get(req, "allRowIds",StringPool.BLANK));
		long userId = PortalUtil.getUserId(req);
		
		if(Validator.isNotNull(docId)){
			vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docId);
			doc.setPublishedByUser(userId);
			doc.setPublishedDate(new Date());
			doc.setStatusDoc(PUBLISHED);
			vdocDocumentLocalServiceUtil.updateDocument(doc);
			res.setRenderParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=document-tab&tabs2=approved");
		}else{
			for(int i = 0; i < docIds.length; i++){
				vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docIds[i]);
				doc.setPublishedByUser(userId);
				doc.setPublishedDate(new Date());
				doc.setStatusDoc(PUBLISHED);
				vdocDocumentLocalServiceUtil.updateDocument(doc);	
			}
		}
	}
	
	/**
	 * Cancel Approve Publish Document
	 * 
	 */
	public void cancelApprovePublish(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		String docId = ParamUtil.getString(req, "docId");
		String url = "";
		
		if(Validator.isNotNull(docId)){
			vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docId);
			if(doc.getStatusDoc() == PUBLISH_PENDING){
				doc.setApprovedByUser(0);
				doc.setApprovedDate(null);
				doc.setStatusDoc(APPROVAL_PENDING);
				url = "/html/vdoc_manage/view.jsp?tabs1=document-tab&tabs2=approved";
			}else if(doc.getStatusDoc() == PUBLISHED){
				doc.setPublishedByUser(0);
				doc.setPublishedDate(null);
				doc.setStatusDoc(PUBLISH_PENDING);
				url = "/html/vdoc_manage/view.jsp?tabs1=document-tab&tabs2=published";
			}
			vdocDocumentLocalServiceUtil.updateDocument(doc);
			res.setRenderParameter("jspPage", url);
		}
	}
	
	public void deleteDocument(ActionRequest req, ActionResponse res) throws PortalException, SystemException, RemoteException{
		String docId = ParamUtil.getString(req, "docId");
		String[] docIds = StringUtil.split(ParamUtil.get(req, "allRowIds",StringPool.BLANK));
		
		if(Validator.isNotNull(docId)){
			String url1 = "";
			vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docId);
			if(doc.getStatusDoc() == APPROVAL_PENDING){
				url1 = "/html/vdoc_manage/view.jsp?tabs1=document-tab";
			}else if(doc.getStatusDoc() == PUBLISH_PENDING){
				url1 = "/html/vdoc_manage/view.jsp?tabs1=document-tab&tabs2=approved";
			}
			vdocDocumentLocalServiceUtil.deletevdocDocument(doc);		
			res.setRenderParameter("jspPage",url1);
		}
		else{
			// Delete Documentss
			for(int i = 0; i < docIds.length; i++){
				vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docIds[i]);
				vdocDocumentLocalServiceUtil.deleteDocument(doc);
			}
		}
	}
	
	public void searchDoc(ActionRequest req, ActionResponse res){
		ThemeDisplay themeDisplay = (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getLayout().getGroupId();
		String language = themeDisplay.getLanguageId();
		System.out.println("GroupId: " +groupId + "Language : " + language);
		System.out.println("Search Doc Method++++++++++++++++++++++++++++");
		
		List<vdocDocument> listVdoc = vdocDocumentLocalServiceUtil.searchDocument(groupId, language, "105", "101", "Test TV", 2);
		for(vdocDocument doc : listVdoc){
			System.out.println("Title : " + doc.getTitle());
		}
	}

}
