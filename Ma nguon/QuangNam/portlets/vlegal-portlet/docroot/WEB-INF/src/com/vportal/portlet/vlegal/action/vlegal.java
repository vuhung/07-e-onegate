package com.vportal.portlet.vlegal.action;

import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.mail.internet.InternetAddress;
import javax.management.InvalidApplicationException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.documentlibrary.service.DLLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.persistence.PortletUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.servlet.ServletResponseUtil;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.service.AttachmentServiceUtil;
import com.vportal.portal.taglib.FileUploadUtil;
import com.vportal.portal.util.WebKeysExt;
import com.vportal.portlet.vlegal.InvalidEffectivedDateException;
import com.vportal.portlet.vlegal.InvalidExpiredDateException;
import com.vportal.portlet.vlegal.InvalidFieldNameExceptionException;
import com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.model.VLegalDraftDocument;
import com.vportal.portlet.vlegal.model.VLegalField;
import com.vportal.portlet.vlegal.model.VLegalOrg;
import com.vportal.portlet.vlegal.model.VLegalSigner;
import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;
import com.vportal.portlet.vlegal.model.VLegalTags;
import com.vportal.portlet.vlegal.model.VLegalType;
import com.vportal.portlet.vlegal.model.impl.VLegalOrgImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalSignerImpl;
import com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFORelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFTRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTDRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil;
import com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl;
import com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl;
import com.vportal.portlet.vlegal.util.DocumentValidator;
import com.vportal.portlet.vlegal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.util.PropsUtilExt;
import com.vportal.portlet.vlegal.util.VLegalUtil;
import com.vportal.util.MailUtil;
/**
 *@Portlet implementation class vlegal
 *@Author: Nguyen Tien Toi
 *@Since:  2012
 *@School: Ha Noi Open University(FITHOU)
 */

public class vlegal extends MVCPortlet {
	
	// ------------------------- Document ------------------------- //
	
	//Process Action Form
	
	public void processDocument(ActionRequest request, ActionResponse response)
	{
		try
		{
			String cmd = ParamUtil.get(request, Constants.CMD, StringPool.BLANK);
			
			if(cmd.equals(Constants.ADD) || cmd.equals(Constants.UPDATE))
			{
				updateDocument(request, response);
			}
			else if(cmd.equals("approve"))
			{
				approveDocument(request, true);
			}
			else if(cmd.equals("cancel_approve"))
			{
				approveDocument(request, false);
			}
			else if(cmd.equals("publish"))
			{
				publishDocument(request, true);
			}
			else if(cmd.equals("cancel_publish"))
			{
				publishDocument(request, false);
			}
			else if(cmd.equals("forward"))
			{
				forwardDocument(request, true);
			}
			else if(cmd.equals("cancel_forward"))
			{
				forwardDocument(request, false);
			}
			else if(cmd.equals("delete"))
			{
				deleteDocument(request, response);
			}
			
		}catch(Exception ex)
		{
			
		}
	}
	
	// Action for Document
	@SuppressWarnings({ "unused", "rawtypes" })
	public void updateDocument(ActionRequest reqs, ActionResponse res) throws Exception
	{
		UploadPortletRequest req = PortalUtil.getUploadPortletRequest(reqs); 
		String docId = ParamUtil.getString(req, "docid");

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
		long userId = PortalUtil.getUserId(req);

		String symbol = ParamUtil.getString(req, "symbol");
		String num = ParamUtil.getString(req, "num");
		boolean repType = Validator.isNotNull(ParamUtil.getString(req,
				"reptype")) ? true : false;

		boolean hasAttachment = false;

		VLegalDocument doc = null;

		Date now = new Date();
		String summary = ParamUtil.getString(req, "summary");
		String content = ParamUtil.getString(req, "content");
		String language = ParamUtil.getString(req, "language");
		String typeId = ParamUtil.getString(req, "typeid");

		String replaceDoc = "";
		String repDocIds = ParamUtil.getString(req, "listRepDocs");
		String[] repDocId = StringUtil.split(repDocIds, StringPool.COMMA);

		try {
			if (Validator.isNotNull(repDocId) && repDocId.length > 0) {
				for (int i = 0; i < repDocId.length; i++) {

					doc = VLegalDocumentServiceUtil.getDocument(repDocId[i]);

					replaceDoc += doc.getDocId()
							+ (i < repDocId.length - 1 ? "," : "");

					doc.setExpiredDate(now);

					VLegalDocumentServiceUtil.updateDocument(doc);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		String orgId = ParamUtil.getString(req, "orgid");
		String[] signerIds = StringUtil.split(ParamUtil.getString(req,
				"signerIds", StringPool.COMMA));

		String fieldId = ParamUtil.getString(req, "fieldid");
		String[] fieldIds = StringUtil.split(ParamUtil.getString(req,
				"fieldids", StringPool.BLANK), StringPool.COMMA);

		String[] strDepartmentIds = req.getParameterValues("departmentids");
		if (Validator.isNotNull(strDepartmentIds)) {
			long[] departmentIds = new long[strDepartmentIds.length];
			for (int i = 0; i < strDepartmentIds.length; i++) {
				departmentIds[i] = Long.parseLong(strDepartmentIds[i]);
			}
		}

		// Only num
		String numRels = ParamUtil.getString(req, "numrels");

		String[] tags = StringUtil.split(ParamUtil.getString(req, "tags",
				StringPool.BLANK), StringPool.COMMA);
		String[] tagids = StringUtil.split(ParamUtil.getString(req, "tagids",
				StringPool.BLANK), StringPool.COMMA);
		String docCode = ParamUtil.getString(req, "doccode", StringPool.BLANK);

		String save_approve = ParamUtil.getString(req, "saveAndApprove");
		String save_publish = ParamUtil.getString(req, "saveAndPublish");

		// Promul Date
		int promulMonth = ParamUtil.getInteger(req, "promulMonth");
		int promulDate = ParamUtil.getInteger(req, "promulDay");
		int promulYear = ParamUtil.getInteger(req, "promulYear");

		// Effectived Date
		int effectMonth = ParamUtil.getInteger(req, "effectivedMonth");
		int effectDate = ParamUtil.getInteger(req, "effectivedDay");
		int effectYear = ParamUtil.getInteger(req, "effectivedYear");

		// Expired Date
		int expiredMonth = ParamUtil.getInteger(req, "expiredMonth");
		int expiredDate = ParamUtil.getInteger(req, "expiredDay");
		int expiredYear = ParamUtil.getInteger(req, "expiredYear");

		Locale locale = null;
		TimeZone timeZone = null;

		locale = LocaleUtil.getDefault();
		timeZone = TimeZoneUtil.getDefault();

		Calendar promulDay = CalendarFactoryUtil.getCalendar(timeZone, locale);

		promulDay.set(Calendar.MONTH, promulMonth);
		promulDay.set(Calendar.DATE, promulDate);
		promulDay.set(Calendar.YEAR, promulYear);

		Calendar effectDay = CalendarFactoryUtil.getCalendar(timeZone, locale);

		effectDay.set(Calendar.MONTH, effectMonth);
		effectDay.set(Calendar.DATE, effectDate);
		effectDay.set(Calendar.YEAR, effectYear);

		Calendar expiredDay = CalendarFactoryUtil.getCalendar(timeZone, locale);

		if (effectDay.getTime().before(promulDay.getTime())) {
			throw new InvalidEffectivedDateException();
		}

		if ((expiredMonth == 0) && (expiredDate == 0) && (expiredYear == 0)) {

			expiredDay = null;

		} else {
			expiredDay.set(Calendar.MONTH, expiredMonth);
			expiredDay.set(Calendar.DATE, expiredDate);
			expiredDay.set(Calendar.YEAR, expiredYear);

			if (expiredDay.getTime().before(effectDay.getTime())) {
				throw new InvalidExpiredDateException();
			}

		}

		String[] communityPermissions = req
				.getParameterValues("communityPermissions");

		String[] guestPermissions = req.getParameterValues("guestPermissions");

		VLegalDocument document = null;

		VLegalOrg vOrg = null;
		VLegalField vField = null;
		VLegalSigner vSigner = null;

		String orgRels = "";
		String fieldRels = "";
		String signerRels = "";

		if (Validator.isNotNull(orgId)) {
			vOrg = VLegalOrgServiceUtil.getOrg(orgId);
			orgRels = vOrg.getName() + "," + orgId;
		}

		if (Validator.isNull(docId)) {

			if (Validator.isNull(expiredDay)) {

				document = VLegalDocumentServiceUtil.addDocument(groupId,
						symbol, num, replaceDoc, summary, content, language,
						promulDay.getTime(), effectDay.getTime(), null, typeId,
						fieldId, orgId, orgRels, signerRels, fieldRels,
						numRels, docCode, null, hasAttachment,
						communityPermissions, guestPermissions, themeDisplay);

			} else {

				document = VLegalDocumentServiceUtil.addDocument(groupId,
						symbol, num, replaceDoc, summary, content, language,
						promulDay.getTime(), effectDay.getTime(), expiredDay
								.getTime(), typeId, fieldId, orgId, orgRels,
						signerRels, fieldRels, numRels, docCode, null,
						hasAttachment, communityPermissions, guestPermissions,
						themeDisplay);
			}

			docId = document.getDocId();
			VLegalDocumentServiceUtil.updateDocument(document);

		} else {

			VLegalDFRelServiceUtil.deleteRelByDoc(docId);

			document = VLegalDocumentServiceUtil.getDocument(docId);

			document.setReplaceDoc(replaceDoc);
			document.setNum(num);
			document.setSymbol(symbol);
			document.setSummary(summary);
			document.setContent(content);
			document.setTypeDocId(typeId);
			document.setFieldId(fieldId);
			document.setOrgId(orgId);
			document.setOrgRels(orgRels);
			document.setFieldRels(fieldRels);
			document.setNumRels(numRels);
			document.setPromulDate(promulDay.getTime());
			document.setEffectivedDate(effectDay.getTime());

			if (Validator.isNull(expiredDay)) {
				document.setExpiredDate(null);
			} else {
				document.setExpiredDate(expiredDay.getTime());
			}

			document = VLegalDocumentServiceUtil.updateDocument(document);

			docId = document.getDocId();

			// Delete tag of this legal document
			VLegalTDRelServiceUtil.deleteRelByDoc(docId);
		}

		// Update Tags
		if (Validator.isNotNull(tags) || tags.length > 0) {
			for (int i = 0; i < tags.length; i++) {
				String[] tag = StringUtil.split(tags[i], "|");
				VLegalTags vTag = null;
				try {

				} catch (Exception ex) {

				}
				if (vTag != null)
					VLegalTDRelServiceUtil.addRelation(docId, tag[0]);
			}
		}

		// Add relation with signers
		try {
			VLegalDSRelServiceUtil.deleteRelByDoc(docId);
		} catch (Exception e) {
			// TODO: handle exception
		}

		if (Validator.isNotNull(signerIds) && signerIds.length > 0) {
			for (int i = 0; i < signerIds.length; i++) {

				VLegalDSRelServiceUtil.addRelation(docId, signerIds[i]);
				vSigner = VLegalSignerServiceUtil.getSigner(signerIds[i]);
				signerRels += vSigner.getFirstName() + " "
						+ vSigner.getLastName()
						+ (i < signerIds.length - 1 ? ", " : "");
			}

			document = VLegalDocumentServiceUtil.getDocument(docId);
			document.setSignerRels(signerRels);
			VLegalDocumentServiceUtil.updateDocument(document);
		}

		// Add relation: field-org

		if (fieldIds.length > 0 && fieldIds != null) {
			for (int i = 0; i < fieldIds.length; i++) {
				vField = VLegalFieldServiceUtil.getVField(fieldIds[i]);
				fieldRels += vField.getName()
						+ (i < fieldIds.length - 1 ? ", " : "");

				VLegalDFRelServiceUtil.addRelation(docId, fieldIds[i]);

				if (ActionUtil.checkDupFO(fieldIds[i], orgId) == false)
					VLegalFORelServiceUtil.addRelation(fieldIds[i], orgId);

				if (ActionUtil.checkDupFT(fieldIds[i], typeId) == false)
					VLegalFTRelServiceUtil.addRelation(fieldIds[i], typeId);
			}

			document = VLegalDocumentServiceUtil.getDocument(docId);
			document.setFieldRels(fieldRels);
			VLegalDocumentServiceUtil.updateDocument(document);
		}

		// Save && Approve
		if (save_approve.equalsIgnoreCase("save-approve")) {

			document.setStatusDoc(VLegalDocumentServiceImpl.PUBLISH_PENDING);
			document.setApprovedDate(new Date());
			document.setApprovedByUser(themeDisplay.getUserId());

			VLegalDocumentServiceUtil.updateDocument(document);

		} else if (save_publish.equalsIgnoreCase("save-publish")) {

			document.setStatusDoc(VLegalDocumentServiceImpl.PUBLISHED);
			document.setPublishedDate(new Date());
			document.setPublishedByUser(themeDisplay.getUserId());

			VLegalDocumentServiceUtil.updateDocument(document);
		}

		// Attachment File
		String portletId = PortletKeysExt.VLEGAL;
//		
//		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(reqs);
		
		FileUploadUtil.uploadFile(reqs, req, portletId, VLegalDocument.class, Long
				.parseLong(document.getDocId()));

		List addedAttachments = AttachmentLocalServiceUtil.getAttachments(Long
				.parseLong(document.getDocId()), VLegalDocument.class);

		hasAttachment = ((addedAttachments != null) && (addedAttachments.size() > 0));

		if (hasAttachment) {
			document.setHasAttachment(true);
			VLegalDocumentServiceUtil.updateDocument(document);
		}

		req.setAttribute(WebKeysExt.VLEGAL_DOCUMENT, document);
		
	}
	
	// delete Document
	@SuppressWarnings("unused")
	private void deleteDocument(ActionRequest request, ActionResponse response) throws com.liferay.portal.kernel.exception.SystemException, NumberFormatException, com.liferay.portal.kernel.exception.PortalException, RemoteException, IOException
	{
		String[] docIds = StringUtil.split(ParamUtil.get(request, "docids", StringPool.BLANK));
		
		long companyId = PortalUtil.getCompanyId(request);
		
		String portletId = PortletKeysExt.VLEGAL;
		
		if((docIds == null) || docIds.length <= 0)
		{
			return;
		}
		
		for(int i = 0; i < docIds.length; i++)
		{
			String docId = docIds[i];
			
			VLegalDocument document = VLegalDocumentServiceUtil.getDocument(docId);
			
			//Delete attachmet
			if(document.getHasAttachment())
			{
				AttachmentLocalServiceUtil.deleteAttachments(VLegalDocument.class, Long.parseLong(docId));
			}
			
			VLegalDocumentServiceUtil.deleteDocument(docId, companyId);
			
			VLegalDSRelServiceUtil.deleteRelByDoc(docId); // Delete Relation
			
			// Signer
			
			VLegalDFRelServiceUtil.deleteRelByDoc(docId); // Delete Relation
			// Field
			
			VLegalDDRelServiceUtil.deleteRelByDoc(docId);
		}
	}
	
	
	// approve Document or Documents
	@SuppressWarnings("unused")
	private void approveDocument(ActionRequest req, boolean approve)
			throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long userId = PortalUtil.getUserId(req);
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
		long groupId = layout.getGroupId();

		String[] docIds = StringUtil.split(ParamUtil.get(req, "docids",
				StringPool.BLANK));

		if ((docIds == null) || (docIds.length <= 0)) {
			return;
		}

		String message = ParamUtil.get(req, "message", StringPool.BLANK);

		for (int i = 0; i < docIds.length; i++) {

			String docId = docIds[i];

			VLegalDocument document = VLegalDocumentServiceUtil
					.getDocument(docId);

			if (approve) {
				document.setApprovedByUser(userId);
				document.setApprovedDate(new Date());
				document
						.setStatusDoc(VLegalDocumentServiceImpl.PUBLISH_PENDING);
			} else {
				document.setApprovedByUser(0);
				document.setApprovedDate(null);
				document
						.setStatusDoc(VLegalDocumentServiceImpl.APPROVAL_PENDING);
			}

			VLegalDocumentServiceUtil.updateDocument(document);

			// Add msg
			if (Validator.isNotNull(message))
				VLegalAttachedMessageServiceUtil.addMessage(groupId, docIds[i],
						message, false);
		}
	}

	// forward Document to Department
	@SuppressWarnings("unused")
	private void forwardDocument(ActionRequest req, boolean forward)
			throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long userId = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

		String docId = ParamUtil.getString(req, "docId");
		String message = ParamUtil.getString(req, "message");
		String departmentRels = "";

		String[] strIds = req.getParameterValues("departmentId");

		if (Validator.isNotNull(strIds) || strIds.length > 0) {

			long[] departmentIds = new long[strIds.length];
			for (int i = 0; i < strIds.length; i++) {

				departmentIds[i] = Long.parseLong(strIds[i]);
				VLegalDDRelServiceUtil.addRelation(departmentIds[i], docId);
//Note				EDDepartment department = EDDepartmentLocalServiceUtil
//						.getDepartment(departmentIds[i]);

				departmentRels += 1 < departmentIds.length - 1 ? "," : "";

			}
		}

		VLegalDocument document = VLegalDocumentServiceUtil.getDocument(docId);

		if (forward) {
			document.setForwardedByUser(userId);
			document.setForwardedDate(new Date());
			document.setDepartmentRels(departmentRels);
			document.setStatusDoc(VLegalDocumentServiceImpl.FORWARDED);

		} else {
			document.setForwardedByUser(0);
			document.setForwardedDate(null);
			document.setDepartmentRels(null);
			document.setStatusDoc(VLegalDocumentServiceImpl.APPROVAL_PENDING);

			VLegalDDRelServiceUtil.deleteRelByDoc(document.getDocId());

		}

		VLegalDocumentServiceUtil.updateDocument(document);

		if (Validator.isNotNull(message)) {

			VLegalAttachedMessageServiceUtil.addMessage(groupId, docId,
					message, false);
		}
	}

	// publish Document or Documents
	@SuppressWarnings("unused")
	private void publishDocument(ActionRequest req, boolean publish)
			throws Exception {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long userId = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

		String[] docIds = StringUtil.split(ParamUtil.get(req, "docids",
				StringPool.BLANK));

		if ((docIds == null) || (docIds.length <= 0)) {
			return;
		}

		for (int i = 0; i < docIds.length; i++) {

			String docId = docIds[i];

			String message = ParamUtil.get(req, "message", StringPool.BLANK);

			VLegalDocument document = VLegalDocumentServiceUtil
					.getDocument(docId);

			if (publish) {
				document.setPublishedByUser(userId);
				document.setPublishedDate(new Date());
				document.setStatusDoc(VLegalDocumentServiceImpl.PUBLISHED);
			} else {
				document.setPublishedByUser(0);
				document.setPublishedDate(null);
				document
						.setStatusDoc(VLegalDocumentServiceImpl.APPROVAL_PENDING);
			}

			VLegalDocumentServiceUtil.updateDocument(document);

			// Add msg
			if (Validator.isNotNull(message)) {

				VLegalAttachedMessageServiceUtil.addMessage(groupId, docId,
						message, false);
			}

		}
	}

	// -------------------------------------------------------------------------------- TYPE ---------------------------------------------------------------------------- //
	
	//Action for Update Type
	@SuppressWarnings("null")
	public void updateType(ActionRequest request, ActionResponse response) throws PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException, RemoteException
	{
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		Layout layout = themeDisplay.getLayout();
		
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
		
		// get id field
		String typeId = ParamUtil.getString(request, "fieldid", StringPool.BLANK);
		
		//Other fields
		String name = ParamUtil.getString(request, "name", StringPool.BLANK);
		String description = ParamUtil.getString(request, "description", StringPool.BLANK);
		
		String language = ParamUtil.getString(request, "language", StringPool.BLANK);
		
		boolean status = Validator.isNotNull(ParamUtil.getString(request, "status"))? true : false;
		boolean rssable = Validator.isNotNull(ParamUtil.getString(request, "rssable"))? true : false;
		
		String[] communityPermissions = request.getParameterValues("communityPermissions");
		String[] guestPermissions = request.getParameterValues("guestPermissions");
		
		VLegalType ltype = null;
		
		if(Validator.isNull(typeId))
		{
			// Add new type
			ltype = VLegalTypeServiceUtil.addType(groupId, name, description, 
					language, status, rssable, communityPermissions, guestPermissions, themeDisplay);
		}
		else
		{
			// Update type
			ltype = VLegalTypeServiceUtil.getType(typeId);
			
			ltype = VLegalTypeServiceUtil.updateType(groupId, typeId, language, name, description, ltype.getPosition(), status, rssable);
		}
		
	}
	
	// Action for delete Type
	public void deleteType(ActionRequest request, ActionResponse response) throws PortalException, SystemException, RemoteException
	{
		String[] typeIds = StringUtil.split(ParamUtil.get(request, "typeids", StringPool.BLANK));
		
		if((typeIds == null) || typeIds.length < 0)
		{
			return;
		}
	
		for(int i = 0; i < typeIds.length; i++)
		{
			VLegalTypeServiceUtil.deleteType(typeIds[i]);
		}
		
	}
	
	// Update Position Type
	public void updatePostionType(ActionRequest request, ActionResponse response) throws PortalException, SystemException, RemoteException
	{
		String typeId = null;
		int position = 0;
		String compoundParam = ParamUtil.getString(request, "position");
		
		if(Validator.isNotNull(compoundParam) && (compoundParam.indexOf("|") > 0))
		{
			String[] cpIds = StringUtil.split(compoundParam, "|");
			
			position = Integer.parseInt(cpIds[0]);
			typeId = cpIds[1];
		}
		
		if(Validator.isNull(typeId))
		{
			return;
		}
		
		VLegalType type = VLegalTypeServiceUtil.getType(typeId);
		
		if(type != null)
		{
			type.setPosition(position);
			VLegalTypeServiceUtil.updateType(type);
		}
	}
	
	// -------------------------------------------- FIELD -------------------------------------------------- //
	
	// Action for Field
	@SuppressWarnings("unused")
	public void updateField(ActionRequest request, ActionResponse response) throws Exception {
		String fieldId = ParamUtil.getString(request, "fieldid");

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = ParamUtil.getLong(request, "groupId");
		String name = ParamUtil.getString(request, "name");
		String description = ParamUtil.getString(request, "description");
		String language = ParamUtil.getString(request, "language");

		boolean status = Validator
				.isNotNull(ParamUtil.getString(request, "status")) ? true : false;
		boolean rssable = Validator.isNotNull(ParamUtil.getString(request,
				"rssable")) ? true : false;
		VLegalField vField = null;

		String[] communityPermissions = request
				.getParameterValues("communityPermissions");

		String[] guestPermissions = request.getParameterValues("guestPermissions");

		if (Validator.isNull(fieldId)) {
			// Add a new field
			try {
				vField = VLegalFieldServiceUtil.addField(groupId, name,
						description, language, status, rssable,
						communityPermissions, guestPermissions, themeDisplay);
			} catch (Exception e) {
				if (e instanceof InvalidFieldNameExceptionException) {
					SessionErrors.add(request, e.getClass().getName());
				}
			}
		} else {
			vField = VLegalFieldServiceUtil.getVField(fieldId);
			vField.setName(name);
			vField.setDescription(description);
			vField.setLanguage(language);
			vField.setRssable(rssable);
			vField.setStatusField(status);
			vField = VLegalFieldServiceUtil.updateField(groupId, fieldId, name,
					description, language, status, rssable);
		}
	}

	@SuppressWarnings("unused")
	public void deleteField(ActionRequest req, ActionResponse response) throws Exception {
		String[] fieldIds = StringUtil.split(ParamUtil.get(req, "fieldids",
				StringPool.BLANK));

		if ((fieldIds == null) || (fieldIds.length <= 0)) {
			return;
		}
		for (int i = 0; i < fieldIds.length; i++) {
			VLegalFieldServiceUtil.deleteField(fieldIds[i]);
		}
	}
	
	// ------------------------------------------------------------------------------------ ORG -------------------------------------------------------------- //
	
	// Action for Org
	@SuppressWarnings("unused")
	public void updateOrg(ActionRequest req, ActionResponse response) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

		String orgId = ParamUtil.getString(req, "orgid");

		String name = ParamUtil.getString(req, "name");
		String description = ParamUtil.getString(req, "description");
		String language = ParamUtil.getString(req, "language");

		boolean status = ParamUtil.getBoolean(req, "status");
		boolean rssable = ParamUtil.getBoolean(req, "rssable");

		String[] communityPermissions = req
				.getParameterValues("communityPermissions");

		String[] guestPermissions = req.getParameterValues("guestPermissions");

		VLegalOrg vOrg = new VLegalOrgImpl();

		if (Validator.isNull(orgId)) {

			vOrg = VLegalOrgServiceUtil.addOrg(groupId, name, description,
					language, rssable, status, communityPermissions,
					guestPermissions, themeDisplay);

		} else {

			vOrg = VLegalOrgServiceUtil.getOrg(orgId);
			vOrg.setName(name);
			vOrg.setDescription(description);
			vOrg.setLanguage(language);
			vOrg.setRssable(rssable);
			vOrg.setStatusOrg(status);

			vOrg = VLegalOrgServiceUtil.updateOrg(groupId, orgId, name,
					description, language, rssable, status, vOrg.getPosition());
		}
	}

	@SuppressWarnings("unused")
	public void deleteOrg(ActionRequest req, ActionResponse res) throws Exception {
		String[] orgIds = StringUtil.split(ParamUtil.get(req, "orgids",
				StringPool.BLANK));

		if ((orgIds == null) || (orgIds.length <= 0)) {
			return;
		}
		for (int i = 0; i < orgIds.length; i++) {
			String orgId = orgIds[i];
			VLegalOrgServiceUtil.deleteOrg(orgId);
			VLegalFORelServiceUtil.deleteRelByOrg(orgId);
		}
	}

	// ------------------------------------------------------------------------------------ POSITION -------------------------------------------------------------- //
	
	public void updatePosition(ActionRequest req, ActionResponse res) throws Exception {

		String orgId = null;
		int position = 0;
		String compoundParam = ParamUtil.getString(req, "position");

		if (Validator.isNotNull(compoundParam)
				&& (compoundParam.indexOf("|") > 0)) {
			String[] cpIds = StringUtil.split(compoundParam, "|");

			position = Integer.parseInt(cpIds[0]);
			orgId = cpIds[1];
		}

		if (Validator.isNull(orgId)) {
			return;
		}

		VLegalOrg org = VLegalOrgServiceUtil.getOrg(orgId);

		if (org != null) {
			org.setPosition(position);
			VLegalOrgServiceUtil.updateOrg(org);
		}
	}
	
	// ------------------------------------------------------------------------SIGNER---------------------------------------------------- //
	
	// Action for Signer
	
	@SuppressWarnings("unused")
	public void updateSigner(ActionRequest req, ActionResponse res) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

		String sigId = ParamUtil.getString(req, "sigid");

		String firstName = ParamUtil.getString(req, "firstName");
		String lastName = ParamUtil.getString(req, "lastName");
		String language = ParamUtil.getString(req, "language");
		boolean statusSigner = ParamUtil.getBoolean(req, "status");

		String[] communityPermissions = req
				.getParameterValues("communityPermissions");

		String[] guestPermissions = req.getParameterValues("guestPermissions");

		VLegalSigner vSigner = new VLegalSignerImpl();

		if (Validator.isNull(sigId)) {

			vSigner = VLegalSignerServiceUtil.addSigner(groupId, firstName,
					lastName, language, statusSigner, communityPermissions,
					guestPermissions, themeDisplay);

		} else {
			vSigner = VLegalSignerServiceUtil.getSigner(sigId);

			VLegalSignerServiceUtil.updateSigner(groupId, sigId, firstName,
					lastName, language, statusSigner);
		}
	}

	@SuppressWarnings("unused")
	public void deleteSigner(ActionRequest req, ActionResponse res) throws Exception {

		String[] sigIds = StringUtil.split(ParamUtil.get(req, "sigids",
				StringPool.BLANK));

		if ((sigIds == null) || (sigIds.length <= 0)) {
			return;
		}
		for (int i = 0; i < sigIds.length; i++) {
			VLegalSignerServiceUtil.deleteSigner(sigIds[i]);
		}

	}
	
	// Action for Logger
	
	// Action for Configuration
	
	// ------------------------------------------------------------------------- Draft --------------------------------------------------------------//
	
	// Action for Draft Document
	
	@SuppressWarnings("rawtypes")
	public Object[] updateDraft(ActionRequest req, String cmd) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();
		User user = PortalUtil.getUser(req);
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

		String draftId = ParamUtil.getString(req, "draftId", StringPool.BLANK);

		// Other Fields
		String title = ParamUtil.getString(req, "title");
		String content = ParamUtil.getString(req, "content");
		String language = ParamUtil
				.getString(req, "language", StringPool.BLANK);

		String typeId = ParamUtil.getString(req, "typeId", StringPool.BLANK);
		String fieldId = ParamUtil.getString(req, "fieldId", StringPool.BLANK);

		// Expired Date
		int expiredMonth = ParamUtil.getInteger(req, "expiredMonth");
		int expiredDate = ParamUtil.getInteger(req, "expiredDay");
		int expiredYear = ParamUtil.getInteger(req, "expiredYear");

		Locale locale = null;
		TimeZone timeZone = null;

		locale = LocaleUtil.getDefault();
		timeZone = TimeZoneUtil.getDefault();

		Calendar expiredDay = CalendarFactoryUtil.getCalendar(timeZone, locale);

		if ((expiredMonth == 0) && (expiredDate == 0) && (expiredYear == 0)) {

			expiredDay = null;

		} else {
			expiredDay.set(Calendar.MONTH, expiredMonth);
			expiredDay.set(Calendar.DATE, expiredDate);
			expiredDay.set(Calendar.YEAR, expiredYear);

		}

		Date expDate = expiredDay.getTime();

		String[] communityPermissions = req
				.getParameterValues("communityPermissions");

		String[] guestPermissions = req.getParameterValues("guestPermissions");

		VLegalDraftDocument ldraft = null, ldraftlevel = null;

		if (Validator.isNull(draftId)) {

			if (Validator.isNull(expiredDay)) {
				ldraft = VLegalDraftDocumentServiceUtil.addDraft(groupId,
						title, content, language, typeId, fieldId, 0, null,
						null, false, communityPermissions, guestPermissions,
						themeDisplay);
			} else {
				ldraft = VLegalDraftDocumentServiceUtil.addDraft(groupId,
						title, content, language, typeId, fieldId, 0, null,
						expDate, false, communityPermissions, guestPermissions,
						themeDisplay);
			}

		} else {
			if (cmd.equals(Constants.UPDATE)) {
				// Update draft...
				ldraft = VLegalDraftDocumentServiceUtil.getDraft(draftId);

				ldraft = VLegalDraftDocumentServiceUtil.updateDraft(draftId,
						groupId, title, content, language, typeId, fieldId,
						expDate, ldraft.getStatusDraft(), ldraft
								.getHasAttachment());
			} else {
				// Create draft level from draft before...
				ldraft = VLegalDraftDocumentServiceUtil.getDraft(draftId);

				ldraftlevel = VLegalDraftDocumentServiceUtil.addDraft(groupId,
						title, content, language, typeId, fieldId, ldraft
								.getDraftLevel() + 1, ldraft.getDocCode(),
						expDate, false, communityPermissions, guestPermissions,
						themeDisplay);
			}
		}

		// Attachment...
		boolean hasAttachment = false;

		List attachmentList = null;

		if (attachmentList == null) {
			attachmentList = new ArrayList();
		}

		// Attachment File
		String portletId = PortletKeysExt.VLEGAL;

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(req);
		
		FileUploadUtil.uploadFile(req, uploadRequest, portletId, VLegalDraftDocument.class,
				Long.parseLong(ldraft.getDraftId()));

		attachmentList = AttachmentLocalServiceUtil.getAttachments(Long
				.parseLong(ldraft.getDraftId()), VLegalDraftDocument.class);

		hasAttachment = ((attachmentList != null) && (attachmentList.size() > 0));

		if (hasAttachment) {
			ldraft.setHasAttachment(true);
			VLegalDraftDocumentServiceUtil.updateDraft(ldraft);
		}

		req.setAttribute(WebKeysExt.VLEGAL_DRAFT, ldraft);

		return new Object[] { ldraft };
	}

	// Action for delete Draft Document
	@SuppressWarnings("unused")
	public void deleteDraft(ActionRequest req) throws Exception {

		String[] draftIds = StringUtil.split(ParamUtil.getString(req,
				"draftIds", StringPool.BLANK));

		long companyId = PortalUtil.getCompanyId(req);

		if (Validator.isNull(draftIds) || draftIds.length <= 0) {
			return;
		}

		for (int i = 0; i < draftIds.length; i++) {

			String draftId = draftIds[i];
			VLegalDraftDocument ldraft = VLegalDraftDocumentServiceUtil
					.getDraft(draftId);

			// 1. Remove suggestion of draft
			VLegalSuggestDocumentServiceUtil.deleteSuggestions(draftId);

			// 2. Remove attachment
			if (ldraft.getHasAttachment()) {

				AttachmentLocalServiceUtil.deleteAttachments(
						VLegalDraftDocument.class, Long.parseLong(draftId));

			}
			// 3. Remove draft itself
			VLegalDraftDocumentServiceUtil.deleteDraft(draftId);
		}

	}

	// Approved Draft
	public void approvedDraft(ActionRequest req, boolean approved)
			throws Exception {

		String[] draftIds = StringUtil.split(ParamUtil.getString(req,
				"draftIds", StringPool.BLANK));

		long userId = PortalUtil.getUserId(req);

		if (Validator.isNull(draftIds) || draftIds.length <= 0) {
			return;
		}

		for (int i = 0; i < draftIds.length; i++) {

			String draftId = draftIds[i];
			VLegalDraftDocument ldraft = VLegalDraftDocumentServiceUtil
					.getDraft(draftId);

			if (approved) {
				ldraft
						.setStatusDraft(VLegalDraftDocumentServiceImpl.PUBLISH_PENDING);
				ldraft.setApprovedByUser(userId);
				ldraft.setApprovedDate(new Date());
			} else {
				ldraft
						.setStatusDraft(VLegalDraftDocumentServiceImpl.APPROVAL_PENDING);
				ldraft.setApprovedByUser(0);
				ldraft.setApprovedDate(null);
			}

			VLegalDraftDocumentServiceUtil.updateDraft(ldraft);
		}
	}

	// Published Draft
	public void publishedDraft(ActionRequest req, boolean published)
			throws Exception {
		String[] draftIds = StringUtil.split(ParamUtil.getString(req,
				"draftIds", StringPool.BLANK));

		long userId = PortalUtil.getUserId(req);

		if (Validator.isNull(draftIds) || draftIds.length <= 0) {
			return;
		}

		for (int i = 0; i < draftIds.length; i++) {

			String draftId = draftIds[i];

			VLegalDraftDocument ldraft = VLegalDraftDocumentServiceUtil
					.getDraft(draftId);

			if (published) {
				ldraft.setStatusDraft(VLegalDraftDocumentServiceImpl.PUBLISHED);
				ldraft.setPublishedByUser(userId);
				ldraft.setPublishedDate(new Date());
			} else {

				ldraft
						.setStatusDraft(VLegalDraftDocumentServiceImpl.APPROVAL_PENDING);
				ldraft.setPublishedByUser(0);
				ldraft.setPublishedDate(new Date());

				ldraft.setApprovedByUser(0);
				ldraft.setApprovedDate(null);
			}

			VLegalDraftDocumentServiceUtil.updateDraft(ldraft);

		}
	}

	// Remove Suggestions of draft
	public void removeSuggestionDraft(ActionRequest req) throws Exception {

		String suggestionId = ParamUtil.getString(req, "suggestionId",
				StringPool.BLANK);

		if (Validator.isNull(suggestionId)) {
			return;
		}

		VLegalSuggestDocumentServiceUtil.deleteSuggestion(suggestionId);
	}
	
	// Action for Suggestion
	
	// update suggestion
	
	//-----------------------------------------------------------------------------SUGGESTION-----------------------------------------//
	
	// update suggestion
	
		public void updateSuggestion(ActionRequest req) throws Exception {

			ThemeDisplay themeDisplay = (ThemeDisplay) req
					.getAttribute(WebKeys.THEME_DISPLAY);

			Layout layout = themeDisplay.getLayout();

			long groupId = layout.getGroupId();
//			long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

			// Id fields
			String suggestionId = ParamUtil.getString(req, "suggestionId",
					StringPool.BLANK);

			// other fields
			String title = ParamUtil.getString(req, "title", StringPool.BLANK);
			String content = ParamUtil.getString(req, "content", StringPool.BLANK);
			String language = ParamUtil
					.getString(req, "language", StringPool.BLANK);

			// Get information of visitor who send suggestion...
			String visitorName = ParamUtil.getString(req, "visitorName",
					StringPool.BLANK);
			String visitorEmail = ParamUtil.getString(req, "visitorEmail",
					StringPool.BLANK);
			String visitorTel = ParamUtil.getString(req, "visitorTel",
					StringPool.BLANK);
			String visitorAddress = ParamUtil.getString(req, "visitorAddress",
					StringPool.BLANK);

			boolean approved = ParamUtil.getBoolean(req, "approved");

			String draftId = ParamUtil.getString(req, "draftId", StringPool.BLANK);

			VLegalSuggestDocument lsuggest = null;

			String[] communityPermissions = req
					.getParameterValues("communityPermissions");

			String[] guestPermissions = req.getParameterValues("guestPermissions");

			long companyId = PortalUtil.getCompanyId(req);

			if (Validator.isNull(suggestionId)) {
				lsuggest = VLegalSuggestDocumentServiceUtil.addSuggestion(title,
						content, language, visitorName, visitorEmail, visitorTel,
						visitorAddress, groupId, draftId, false,
						communityPermissions, guestPermissions, themeDisplay);

				// Auto send mail to visitor suggestion...
				boolean sendThanksEmail = VLegalUtil.getBooleanPrefsPropsUtil(companyId,
						PropsUtilExt.VLEGAL_SUGGESTION_AUTO_SEND_MAIL);

				String senderEmail = VLegalUtil.getPrefsPropsUtil(companyId,
						PropsUtilExt.VLEGAL_SUGGESTION_SENDER_MAIL);
				String emailSubject = VLegalUtil.getPrefsPropsUtil(companyId,
						PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_SUBJECT);
				String emailContent = VLegalUtil.getPrefsPropsUtil(companyId,
						PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_CONTENT);

				VLegalDraftDocument ldraft = null;

				try {
					if (Validator.isNotNull(draftId)) {
						ldraft = VLegalDraftDocumentServiceUtil.getDraft(draftId);
					}
				} catch (Exception ex) {
					// Ignore..
				}

				if (sendThanksEmail == true
						&& Validator.isEmailAddress(senderEmail)
						&& Validator.isNotNull(emailSubject)
						&& Validator.isNotNull(emailContent) && (ldraft != null)) {

					emailSubject = StringUtil.replace(emailSubject,
							"[$PORTAL_URL$]", PortalUtil.getPortalURL(req));

					emailContent = StringUtil.replace(emailContent, new String[] {
							"[$TO_NAME$]", "[$PORTAL_URL$]", "[$DRAFT_TITLE$]",
							"[$FROM_ADDRESS$]" }, new String[] { visitorName,
							PortalUtil.getPortalURL(req), ldraft.getTitle(),
							senderEmail });

					InternetAddress emailFrom = new InternetAddress(senderEmail);
					emailFrom.setPersonal(senderEmail);

					InternetAddress emailTo = new InternetAddress(visitorEmail);
					emailTo.setPersonal(visitorName);

					boolean htmlFormat = true;

					MailUtil.send(emailFrom, emailTo, emailSubject, emailContent,
							htmlFormat);
				}

			} else {

				lsuggest = VLegalSuggestDocumentServiceUtil
						.getSuggestion(suggestionId);
				lsuggest = VLegalSuggestDocumentServiceUtil.updateSuggestion(
						suggestionId, draftId, groupId, title, content, language,
						visitorName, visitorEmail, visitorTel, visitorAddress,
						approved, lsuggest.getHasAttachment());
			}

			// Attachment...

			boolean hasAttachment = false;

			List attachmentList = null;
			if (attachmentList == null) {
				attachmentList = new ArrayList();
			}

			// Attachment File
			String portletId = PortletKeysExt.VLEGAL;
			
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(req);
			
			FileUploadUtil.uploadFile(req, uploadRequest, portletId, VLegalSuggestDocument.class,
					Long.parseLong(lsuggest.getSugId()));

			attachmentList = AttachmentLocalServiceUtil.getAttachments(Long
					.parseLong(lsuggest.getSugId()), VLegalSuggestDocument.class);

			hasAttachment = ((attachmentList != null) && (attachmentList.size() > 0));

			if (hasAttachment) {
				lsuggest.setHasAttachment(true);
				VLegalSuggestDocumentServiceUtil.updateSuggestion(lsuggest);
			}
		}

		// delete suggestion
		@SuppressWarnings("unused")
		public void deleteSuggestion(ActionRequest req) throws Exception {

			String arrSuggestionId = ParamUtil.getString(req, "suggestionIds",
					StringPool.BLANK);

			String suggestionIds[] = arrSuggestionId.split(",");
			long companyId = PortalUtil.getCompanyId(req);

			for (int i = 0; i < suggestionIds.length; i++) {

				String suggestionId = suggestionIds[i];

				AttachmentLocalServiceUtil.deleteAttachments(
						VLegalSuggestDocument.class, Long.parseLong(suggestionId));

				// 2. Delete suggestion...
				VLegalSuggestDocumentServiceUtil.deleteSuggestion(suggestionId);
			}

		}

		// approve suggestion
		@SuppressWarnings("unused")
		public void approveSuggestion(ActionRequest req, boolean approved)
				throws Exception {
			String suggestionId = ParamUtil.getString(req, "suggestionId",
					StringPool.BLANK);

			VLegalSuggestDocument lsuggest = VLegalSuggestDocumentServiceUtil
					.getSuggestion(suggestionId);
			lsuggest.setApproved(approved);

			VLegalSuggestDocumentServiceUtil.updateSuggestion(lsuggest);

			VLegalDraftDocument vDraft = null;

		}

		// remove suggestion attachment
		public void removeSuggestionAttachment(ActionRequest req) throws Exception {
			String suggestionId = ParamUtil.getString(req, "suggestionId",
					StringPool.BLANK);
			long attachmentId = ParamUtil.getLong(req, "attachmentId", 0);
			long companyId = PortalUtil.getCompanyId(req);

			if (Validator.isNull(suggestionId)) {
				return;
			}

			// 1. Remove the attachment
			AttachmentServiceUtil.deleteAttachment(attachmentId, companyId);

			// 2. Update the attachment status
			List attachments = AttachmentServiceUtil.getAttachments(Long
					.parseLong(suggestionId), VLegalSuggestDocument.class);

			if ((attachments == null) || (attachments.size() <= 0)) {
				VLegalSuggestDocument suggestion = VLegalSuggestDocumentServiceUtil
						.getSuggestion(suggestionId);
				suggestion.setHasAttachment(false);
				VLegalSuggestDocumentServiceUtil.updateSuggestion(suggestion);
			}
		}
	
	// --------------------------------------------------------------------- LOGGER ----------------------------------------------------------------------- //
		
		public void deleteLog(ActionRequest req, ActionResponse res) throws Exception 
		{

			String cmd = ParamUtil.getString(req, Constants.CMD);

			if (Validator.isNotNull(cmd) && cmd.equals(Constants.DELETE)) {
				String[] loggerIds = StringUtil.split(ParamUtil.getString(req,
						"allRowIds", StringPool.BLANK));
				try {
					for (int i = 0; i < loggerIds.length; i++) {
						VLegalLoggerServiceUtil.removeLogs(loggerIds[i]);
					}

					sendRedirect(req, res);

				} catch (Exception ex) {
					if (ex instanceof NoSuchVLegalLoggerException
							|| ex instanceof PrincipalException) {

						SessionErrors.add(req, ex.getClass().getName());
//						setForward(req, "portlet.vcms.error");

					} else {
						throw ex;
					}
				}
			}
			
//			res.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.nhat.ky");

		}
		
	// --------------------------------------------------------------------- CONFIGURATION -------------------------------------------------------------------------- //
		
		public void updateConfiguration(ActionRequest request, ActionResponse response) throws ReadOnlyException, ValidatorException, IOException, PortalException, SystemException
		{
			// get information from configuration form...

			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);

			Layout layout = themeDisplay.getLayout();

			String groupId = String.valueOf(layout.getGroupId());
//			long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
			
			int styleDisplay = ParamUtil.getInteger(request, "styleDisplay");

			int maxAttachmentDocument = ParamUtil.getInteger(request,
					"maxAttachmentDocument");

			int maxAttachmentDraft = ParamUtil
					.getInteger(request, "maxAttachmentDraft");

			int maxAttachmentSuggestion = ParamUtil.getInteger(request,
					"maxAttachmentSuggestion");

			int itemPerPageDocument = ParamUtil.getInteger(request,
					"itemPerPageDocument");

			int itemPerPageSuggestion = ParamUtil.getInteger(request,
					"itemPerPageSuggestion");

			int itemPerPageDraft = ParamUtil.getInteger(request, "itemPerPageDraft");

			String emailAddressDraft = ParamUtil.getString(request,
					"emailAddressDraft", StringPool.BLANK);
			String autoNotificationDraftEmailSubject = ParamUtil.getString(request,
					"autoNotificationDraftEmailSubject", StringPool.BLANK);
			String autoNotificationDraftEmailContent = ParamUtil.getString(request,
					"autoNotificationDraftEmailContent", StringPool.BLANK);

			boolean autoSuggestionSendMail = ParamUtil.getBoolean(request,
					"autoSuggestionSendMail");

			boolean autoDraftSendMail = ParamUtil.getBoolean(request,
					"autoDraftSendMail");

			boolean approveDoc = ParamUtil.getBoolean(request, "approveDoc");

			boolean approveDraft = ParamUtil.getBoolean(request, "approveDraft");

			boolean approveSuggest = ParamUtil.getBoolean(request, "approveSuggest");

			boolean cancel_approveDoc = ParamUtil.getBoolean(request,
					"cancel_approveDoc");

			boolean cancel_approveDraft = ParamUtil.getBoolean(request,
					"cancel_approveDraft");

			boolean publishDoc = ParamUtil.getBoolean(request, "publishDoc");

			boolean publishDraft = ParamUtil.getBoolean(request, "publishDraft");

			boolean quickAction = ParamUtil.getBoolean(request, "quickAction");

			boolean forwardDoc = ParamUtil.getBoolean(request, "forwardDoc");

			boolean manageDraftSuggestion = ParamUtil.getBoolean(request,
					"manageDraftSuggestion");

			String statisticsStyle = ParamUtil.getString(request, "statisticsStyle");

			boolean viewLog = ParamUtil.getBoolean(request, "viewLog");

			boolean viewGeneral = ParamUtil.getBoolean(request, "viewGeneral");

			boolean searchDoc = ParamUtil.getBoolean(request, "searchDoc");

			boolean searchDocByPromul = ParamUtil.getBoolean(request,
					"searchDocByPromul");

			boolean searchDocByEffective = ParamUtil.getBoolean(request,
					"searchDocByEffective");

			boolean searchDocByExpired = ParamUtil.getBoolean(request,
					"searchDocByExpired");

			boolean searchDocByForwarded = ParamUtil.getBoolean(request,
					"searchDocByForwarded");

			String customTitle = ParamUtil.getString(request, "customTitle");

			String customTab = ParamUtil.getString(request, "customTab");

			String emailAddressSender = ParamUtil.getString(request,
					"emailAddressSender");

			String autoSuggestionEmailSubject = ParamUtil.getString(request,
					"autoSuggestionEmailSubject");

			String autoSuggestionEmailContent = ParamUtil.getString(request,
					"autoSuggestionEmailContent");

			// Save these settings to preferences
			long companyId = PortalUtil.getCompanyId(request);

			PortletPreferences prefs = request.getPreferences();
			
			prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_STYLE, String.valueOf(styleDisplay));

			prefs.setValue(
					PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_DOCUMENT,
					String.valueOf(approveDoc));

			prefs.setValue(
					PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_DRAFT,
					String.valueOf(approveDraft));

			prefs.setValue(
					PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_SUGGESTION,
					String.valueOf(approveSuggest));

			prefs
					.setValue(
							PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_CANCEL_APPROVE_DOCUMENT,
							String.valueOf(cancel_approveDoc));

			prefs
					.setValue(
							PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_CANCEL_APPROVE_DRAFT,
							String.valueOf(cancel_approveDraft));

			prefs.setValue(
					PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_PUBLISH_DOCUMENT,
					String.valueOf(publishDoc));

			prefs.setValue(
					PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_PUBLISH_DRAFT,
					String.valueOf(publishDraft));

			prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_QUICK_ACTION, String
					.valueOf(quickAction));

			prefs.setValue(PropsUtilExt.VLEGAL_FUNCTION_FORWARED_DOCUMENT, String
					.valueOf(forwardDoc));

			prefs.setValue(PropsUtilExt.VLEGAL_FUNCTION_MANAGE_DRAFT_SUGGESTION,
					String.valueOf(manageDraftSuggestion));

			prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_GENERAL, String
					.valueOf(viewGeneral));

			prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_LOG, String
					.valueOf(viewLog));

			prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_STATISTICS_STYLE,
					statisticsStyle);

			prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TITLE,
					customTitle);

			prefs
					.setValue(PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TAB,
							customTab);

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH, String
					.valueOf(searchDoc));

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_PROMUL_DATE,
					String.valueOf(searchDocByPromul));

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EFFECTIVE_DATE,
					String.valueOf(searchDocByEffective));

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EXPIRED_DATE,
					String.valueOf(searchDocByExpired));

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_FORWARDED_DATE,
					String.valueOf(searchDocByForwarded));

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_MAX_ATTACHMENT, String
					.valueOf(maxAttachmentDocument));

			prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_MAX_ATTACHMENT, String
					.valueOf(maxAttachmentDraft));

			prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_MAX_ATTACHMENT, String
					.valueOf(maxAttachmentSuggestion));

			prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_TOTALITEM_PERPAGE, String
					.valueOf(itemPerPageDocument));

			prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_TOTALITEM_PERPAGE, String
					.valueOf(itemPerPageDraft));

			prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_TOTALITEM_PERPAGE, String
					.valueOf(itemPerPageSuggestion));

			prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_AUTO_SEND_MAIL, String
					.valueOf(autoDraftSendMail));

			prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_ADDRESS, String
					.valueOf(emailAddressDraft));

			prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_SUBJECT, String
					.valueOf(autoNotificationDraftEmailSubject));

			prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_CONTENT, String
					.valueOf(autoNotificationDraftEmailContent));

			// Save setting of Suggestion to preferences
			prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_SENDER_MAIL, String
					.valueOf(emailAddressSender));

			prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_AUTO_SEND_MAIL, String
					.valueOf(autoSuggestionSendMail));

			prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_SUBJECT, String
					.valueOf(autoSuggestionEmailSubject));

			prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_CONTENT, String
					.valueOf(autoSuggestionEmailContent));

			prefs.store();

			sendRedirect(request, response);
		}
	
	
		/*--------------------------------------------------------Version thu nghiem------------------------------------------------------------------*/
	/*--------------------------------------------------------Version thu nghiem------------------------------------------------------------------*/
		/*--------------------------------------------------------Version thu nghiem------------------------------------------------------------------*/
		/*--------------------------------------------------------Version thu nghiem------------------------------------------------------------------*/
		/*--------------------------------------------------------Version thu nghiem------------------------------------------------------------------*/
		/*--------------------------------------------------------Version thu nghiem------------------------------------------------------------------*/
	
	
	public void approveEditDocument(ActionRequest request, ActionResponse response)
	{
		String docid = request.getParameter("docid");
		response.setRenderParameter("docid", docid);
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/document/approval/edit_approval.jsp");
	}
	
	public void dosearch(ActionRequest req,
			ActionResponse response) throws Exception {
		// ID
				String userid = String.valueOf(PortalUtil.getUserId(req));
				ThemeDisplay themeDisplay = (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);

				Layout layout = themeDisplay.getLayout();

				long groupId = layout.getGroupId();
//				long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
				String language = themeDisplay.getLanguageId();
				String summary = ParamUtil.getString(req, "summary");
				String number = ParamUtil.getString(req, "num");
				String symbol = ParamUtil.getString(req, "symbol");
				String sigId = ParamUtil.getString(req, "_sigId");
				String fieldId = ParamUtil.getString(req, "_fieldId");
				String orgId = ParamUtil.getString(req, "_orgId");
				String typeId = ParamUtil.getString(req, "_typeId");
				String content = ParamUtil.getString(req, "symbol");
				String style = ParamUtil.getString(req, "summary");
				int status = ParamUtil.getInteger(req, "statusDoc");
				int orderBy = ParamUtil.getInteger(req, "statusDoc");
				final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
				Date proDateFrom =  ParamUtil.getDate(req,"fdasfsfasf",dateFormat);
				Date proDateTo = ParamUtil.getDate(req,"fsdfdfs",dateFormat);
				List<VLegalDocument>  vlegalsearch = null;
//				vlegalsearch =   VLegalDocumentServiceUtil.getDocumentByStatus(groupId, language, number, symbol, fieldId, orgId, 
//						typeId, proDateFrom, proDateTo, summary, content, 
//						status, style, orderBy, -1, -1);
				req.setAttribute("VLegalsearch", vlegalsearch);
				response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.van.ban.phap.luat&abs2=tab.cho.xuat.ban");
	}
	
	//Thao tac nhanh
	public void doSelect(ActionRequest request, ActionResponse response)
	{
		int choose = ParamUtil.getInteger(request, "action");
		if(choose == 0)
		{
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp");
		}
		else if(choose == 1)
		{
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/document/approval/edit_approval.jsp");
		}
		else if(choose == 2)
		{
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/type/type_edit.jsp");
		}
		else if(choose == 3)
		{
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/field/field_edit.jsp");
		}
		else if(choose == 4)
		{
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/org/org_edit.jsp");
		}
		else if(choose == 5)
		{
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/siger/signer_edit.jsp");
		}
	}
	
	public void delete_approval(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		
		String[] loggerIds = StringUtil.split(ParamUtil.get(request, "allRowIds",
				StringPool.BLANK));
		long companyId = PortalUtil.getCompanyId(request);

		if ((loggerIds == null) || (loggerIds.length <= 0)) {
			return;
		}

		for (int i = 0; i < loggerIds.length; i++) {
	        try{
			  VLegalDocumentServiceUtil.deleteDocument(loggerIds[i], companyId);
	        }catch(Exception e){
	        	
	        	e.printStackTrace();
	        }  

		}
		
		
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.van.ban.phap.luatb&abs2=tab.cho.xuat.ban");
	}
	
	
	public void Type_Manager_New(ActionRequest req,
			ActionResponse response) throws PortletException {
		// ID
		
		try
		{
			VLegalType ltype = null;
			
			ThemeDisplay themeDisplay = (ThemeDisplay) req
					.getAttribute(WebKeys.THEME_DISPLAY);
	
			Layout layout = themeDisplay.getLayout();
	
			long groupId = layout.getGroupId();
//			long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
			long companyId = PortalUtil.getCompanyId(req);
			long userid = PortalUtil.getUserId(req);    
			// get id field
			String typeId = ParamUtil.getString(req, "typeid", StringPool.BLANK);
	
			// other fields
			String name = ParamUtil.getString(req, "name", StringPool.BLANK);
			String description = ParamUtil.getString(req, "description",
					StringPool.BLANK);
	
			String language = ParamUtil
					.getString(req, "language", StringPool.BLANK);
	
			boolean status = Validator
					.isNotNull(ParamUtil.getString(req, "status")) ? true : false;
			boolean rssable = Validator.isNotNull(ParamUtil.getString(req,
					"rssable")) ? true : false;
	
			if (Validator.isNull(typeId)) 
			{
				// Add new type
				ltype = VLegalTypeServiceUtil.addTypeNew(groupId,userid,companyId, name, description,
						language, status, rssable,themeDisplay);	
	        }
			else
			{
				ltype = VLegalTypeServiceUtil.getType(typeId);
	
				VLegalTypeServiceUtil.updateTypeNew(userid,groupId, typeId, language, name,
						description, ltype.getPosition(), status, rssable);
			}
			
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.the.loai.van.ban");
		
		}catch(Exception e){e.printStackTrace();}	
	}
	
	public void type_Edit(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String typeId = ParamUtil.getString(request, "typeid");
		VLegalType vcp = null;
		
			try {
				vcp = VLegalTypeServiceUtil.getType(typeId);
			} catch (com.liferay.portal.kernel.exception.PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (com.liferay.portal.kernel.exception.SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("VLegalType", vcp);
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/type/type_edit.jsp");
		
	}
	public void type_Delete(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String typeId = ParamUtil.getString(request, "typeid");
	   try{
			VLegalTypeServiceUtil.deleteType(typeId);
	   }catch(Exception e){e.printStackTrace();}
	
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.the.loai.van.ban");
	}
	public void field_Manager_New(ActionRequest req,
			ActionResponse response) throws PortletException {
		String fieldId = ParamUtil.getString(req, "fieldid");
	
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
	
		Layout layout = themeDisplay.getLayout(); 
	    long companyId = PortalUtil.getCompanyId(req);
		long userid = PortalUtil.getUserId(req);
		long groupId = ParamUtil.getLong(req, "groupId");
		String name = ParamUtil.getString(req, "name");
		String description = ParamUtil.getString(req, "description");
		String language = ParamUtil.getString(req, "language");
	
		boolean status = Validator
				.isNotNull(ParamUtil.getString(req, "status")) ? true : false;
		boolean rssable = Validator.isNotNull(ParamUtil.getString(req,
				"rssable")) ? true : false;
		VLegalField vField = null;
	
		if (Validator.isNull(fieldId)) {
			// Add a new field
			try {
				vField = VLegalFieldServiceUtil.addField(companyId,userid,groupId, name,
						description, language, status, rssable,themeDisplay);
			} catch (Exception e) {
				if (e instanceof InvalidApplicationException) {
					SessionErrors.add(req, e.getClass().getName());
				}
			}
		} else {
			try{
			vField = VLegalFieldServiceUtil.getVField(fieldId);
	
			vField.setName(name);
			vField.setDescription(description);
			vField.setLanguage(language);
			vField.setRssable(rssable);
			vField.setStatusField(status);
			vField = VLegalFieldServiceUtil.updateField(groupId, fieldId, name,
					description, language, status, rssable);
			}catch(Exception e){e.printStackTrace();}
		}
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.linh.vuc");
	}
	public void field_update(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String fieldid = ParamUtil.getString(request, "fieldid");
		VLegalField vcp = null;
		
			vcp = VLegalFieldServiceUtil.getVField(fieldid);
			request.setAttribute("VLegalField", vcp);
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/field/field_edit.jsp");
		
	}
	public void field_delete(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String fieldid = ParamUtil.getString(request, "fieldid");
	   try{
			VLegalFieldServiceUtil.deleteField(fieldid);
	   }catch(Exception e){e.printStackTrace();}
	
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.linh.vuc");
	}
	
	public void signer_New(ActionRequest req, ActionResponse response) throws PortletException, PortalException, SystemException {
	   
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
	
		Layout layout = themeDisplay.getLayout();
		long companyId = PortalUtil.getCompanyId(req);
		long userid = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
	
		String sigId = ParamUtil.getString(req, "sigid");
	
		String firstName = ParamUtil.getString(req, "firstName");
		String lastName = ParamUtil.getString(req, "lastName");
		String language = ParamUtil.getString(req, "language");
		boolean statusSigner = ParamUtil.getBoolean(req, "status");
	
		VLegalSigner vSigner = new VLegalSignerImpl();
	
		if (Validator.isNull(sigId)) {
	
			try {
				vSigner = VLegalSignerServiceUtil.addSigner(groupId,companyId,userid, firstName,
						lastName, language, statusSigner, themeDisplay);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		} else {
			vSigner = VLegalSignerServiceUtil.getSigner(sigId);
	
			try {
				VLegalSignerServiceUtil.updateSigner(groupId, sigId, firstName,
						lastName, language, statusSigner);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.nguoi.ky");
	}
	public void signer_update(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String sigId = ParamUtil.getString(request, "sigid");
		VLegalSigner vcp = null;
		
			vcp = VLegalSignerServiceUtil.getSigner(sigId);
			request.setAttribute("VLegalSigner", vcp);
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/siger/signer_edit.jsp");
		
	}
	public void signer_delete(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String sigId = ParamUtil.getString(request, "sigid");
	   try{
			VLegalSignerServiceUtil.deleteSigner(sigId);
	   }catch(Exception e){e.printStackTrace();}
	
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.nguoi.ky");
	}
	
	
	public void orgnew_New(ActionRequest req, ActionResponse response) throws PortletException, PortalException, SystemException {
	
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
	
		Layout layout = themeDisplay.getLayout();
	
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
	
		long companyId = PortalUtil.getCompanyId(req);
		long userid = PortalUtil.getUserId(req);   
		String orgId = ParamUtil.getString(req, "orgid");
	
		String name = ParamUtil.getString(req, "name");
		String description = ParamUtil.getString(req, "description");
		String language = ParamUtil.getString(req, "language");
		String parentId = ParamUtil.getString(req, "parentId");
	
		boolean status = ParamUtil.getBoolean(req, "status");
		boolean rssable = ParamUtil.getBoolean(req, "rssable");
	
		VLegalOrg vOrg = new VLegalOrgImpl();
	
		if (Validator.isNull(orgId)) {
	
			try {
				vOrg = VLegalOrgServiceUtil.addOrg(groupId,companyId,userid, name, description,
						language, rssable, status, parentId, themeDisplay);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		} else {
	
			vOrg = VLegalOrgServiceUtil.getOrg(orgId);
			vOrg.setName(name);
			vOrg.setDescription(description);
			vOrg.setLanguage(language);
			vOrg.setRssable(rssable);
			vOrg.setStatusOrg(status);
	
			try {
				vOrg = VLegalOrgServiceUtil.updateOrg(groupId, orgId, name,
						description, language, rssable, status, parentId, vOrg
								.getPosition());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.co.quan.ban.hanh");
	}
	public void org_update(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String orgid = ParamUtil.getString(request, "orgid");
		VLegalOrg vcp = null;
		
			vcp = VLegalOrgServiceUtil.getOrg(orgid);
			request.setAttribute("VLegalOrg", vcp);
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/manage/org/org_edit.jsp");
		
	}
	public void org_delete(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String orgid = ParamUtil.getString(request, "orgid");
	   try{
			VLegalOrgServiceUtil.deleteOrg(orgid);
	   }catch(Exception e){e.printStackTrace();}
	
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?tabs1=tab.quan.ly.chung&tabs2=tab.co.quan.ban.hanh");
	}
	
	/*--------------Cau Hinh (Configuration)--------------------*/
	
	public void configurations(ActionRequest req,
			ActionResponse response) throws PortletException, PortalException, SystemException {
		// get information from configuration form...
	
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
	
		Layout layout = themeDisplay.getLayout();
	
		String groupId = String.valueOf(layout.getGroupId());
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
		
		int styleDisplay = ParamUtil.getInteger(req, "styleDisplay");
	
		int maxAttachmentDocument = ParamUtil.getInteger(req,
				"maxAttachmentDocument");
	
		int maxAttachmentDraft = ParamUtil
				.getInteger(req, "maxAttachmentDraft");
	
		int maxAttachmentSuggestion = ParamUtil.getInteger(req,
				"maxAttachmentSuggestion");
	
		int itemPerPageDocument = ParamUtil.getInteger(req,
				"itemPerPageDocument");
	
		int itemPerPageSuggestion = ParamUtil.getInteger(req,
				"itemPerPageSuggestion");
	
		int itemPerPageDraft = ParamUtil.getInteger(req, "itemPerPageDraft");
	
		String emailAddressDraft = ParamUtil.getString(req,
				"emailAddressDraft", StringPool.BLANK);
		String autoNotificationDraftEmailSubject = ParamUtil.getString(req,
				"autoNotificationDraftEmailSubject", StringPool.BLANK);
		String autoNotificationDraftEmailContent = ParamUtil.getString(req,
				"autoNotificationDraftEmailContent", StringPool.BLANK);
	
		boolean autoSuggestionSendMail = ParamUtil.getBoolean(req,
				"autoSuggestionSendMail");
	
		boolean autoDraftSendMail = ParamUtil.getBoolean(req,
				"autoDraftSendMail");
	
		boolean approveDoc = ParamUtil.getBoolean(req, "approveDoc");
	
		boolean approveDraft = ParamUtil.getBoolean(req, "approveDraft");
	
		boolean approveSuggest = ParamUtil.getBoolean(req, "approveSuggest");
	
		boolean cancel_approveDoc = ParamUtil.getBoolean(req,
				"cancel_approveDoc");
	
		boolean cancel_approveDraft = ParamUtil.getBoolean(req,
				"cancel_approveDraft");
	
		boolean publishDoc = ParamUtil.getBoolean(req, "publishDoc");
	
		boolean publishDraft = ParamUtil.getBoolean(req, "publishDraft");
	
		boolean quickAction = ParamUtil.getBoolean(req, "quickAction");
	
		boolean forwardDoc = ParamUtil.getBoolean(req, "forwardDoc");
	
		boolean manageDraftSuggestion = ParamUtil.getBoolean(req,
				"manageDraftSuggestion");
	
		String statisticsStyle = ParamUtil.getString(req, "statisticsStyle");
	
		boolean viewLog = ParamUtil.getBoolean(req, "viewLog");
	
		boolean viewGeneral = ParamUtil.getBoolean(req, "viewGeneral");
	
		boolean searchDoc = ParamUtil.getBoolean(req, "searchDoc");
	
		boolean searchDocByPromul = ParamUtil.getBoolean(req,
				"searchDocByPromul");
	
		boolean searchDocByEffective = ParamUtil.getBoolean(req,
				"searchDocByEffective");
	
		boolean searchDocByExpired = ParamUtil.getBoolean(req,
				"searchDocByExpired");
	
		boolean searchDocByForwarded = ParamUtil.getBoolean(req,
				"searchDocByForwarded");
	
		String customTitle = ParamUtil.getString(req, "customTitle");
	
		String customTab = ParamUtil.getString(req, "customTab");
	
		String emailAddressSender = ParamUtil.getString(req,
				"emailAddressSender");
	
		String autoSuggestionEmailSubject = ParamUtil.getString(req,
				"autoSuggestionEmailSubject");
	
		String autoSuggestionEmailContent = ParamUtil.getString(req,
				"autoSuggestionEmailContent");
	
		// Save these settings to preferences
		long companyId = PortalUtil.getCompanyId(req);
	
		PortletPreferences prefs = req.getPreferences();
		prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_STYLE, String.valueOf(styleDisplay));
	
		prefs.setValue(
				PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_DOCUMENT,
				String.valueOf(approveDoc));
	
		prefs.setValue(
				PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_DRAFT,
				String.valueOf(approveDraft));
	
		prefs.setValue(
				PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_SUGGESTION,
				String.valueOf(approveSuggest));
	
		prefs
				.setValue(
						PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_CANCEL_APPROVE_DOCUMENT,
						String.valueOf(cancel_approveDoc));
	
		prefs
				.setValue(
						PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_CANCEL_APPROVE_DRAFT,
						String.valueOf(cancel_approveDraft));
	
		prefs.setValue(
				PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_PUBLISH_DOCUMENT,
				String.valueOf(publishDoc));
	
		prefs.setValue(
				PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_PUBLISH_DRAFT,
				String.valueOf(publishDraft));
	
		prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_QUICK_ACTION, String
				.valueOf(quickAction));
	
		prefs.setValue(PropsUtilExt.VLEGAL_FUNCTION_FORWARED_DOCUMENT, String
				.valueOf(forwardDoc));
	
		prefs.setValue(PropsUtilExt.VLEGAL_FUNCTION_MANAGE_DRAFT_SUGGESTION,
				String.valueOf(manageDraftSuggestion));
	
		prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_GENERAL, String
				.valueOf(viewGeneral));
	
		prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_LOG, String
				.valueOf(viewLog));
	
		prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_STATISTICS_STYLE,
				statisticsStyle);
	
		prefs.setValue(PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TITLE,
				customTitle);
	
		prefs
				.setValue(PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TAB,
						customTab);
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH, String
				.valueOf(searchDoc));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_PROMUL_DATE,
				String.valueOf(searchDocByPromul));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EFFECTIVE_DATE,
				String.valueOf(searchDocByEffective));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EXPIRED_DATE,
				String.valueOf(searchDocByExpired));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_FORWARDED_DATE,
				String.valueOf(searchDocByForwarded));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_MAX_ATTACHMENT, String
				.valueOf(maxAttachmentDocument));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_MAX_ATTACHMENT, String
				.valueOf(maxAttachmentDraft));
	
		prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_MAX_ATTACHMENT, String
				.valueOf(maxAttachmentSuggestion));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DOCUMENT_TOTALITEM_PERPAGE, String
				.valueOf(itemPerPageDocument));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_TOTALITEM_PERPAGE, String
				.valueOf(itemPerPageDraft));
	
		prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_TOTALITEM_PERPAGE, String
				.valueOf(itemPerPageSuggestion));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_AUTO_SEND_MAIL, String
				.valueOf(autoDraftSendMail));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_ADDRESS, String
				.valueOf(emailAddressDraft));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_SUBJECT, String
				.valueOf(autoNotificationDraftEmailSubject));
	
		prefs.setValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_CONTENT, String
				.valueOf(autoNotificationDraftEmailContent));
	
		// Save setting of Suggestion to preferences
		prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_SENDER_MAIL, String
				.valueOf(emailAddressSender));
	
		prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_AUTO_SEND_MAIL, String
				.valueOf(autoSuggestionSendMail));
	
		prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_SUBJECT, String
				.valueOf(autoSuggestionEmailSubject));
	
		prefs.setValue(PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_CONTENT, String
				.valueOf(autoSuggestionEmailContent));
	
		try {
			prefs.store();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Huy xuat ban
	public void published(ActionRequest req,
			ActionResponse response) throws PortletException {
		try
		{
			boolean publish = false;
			ThemeDisplay themeDisplay = (ThemeDisplay) req
					.getAttribute(WebKeys.THEME_DISPLAY);
		
			Layout layout = themeDisplay.getLayout();
		
			long userId = PortalUtil.getUserId(req);
			long groupId = layout.getGroupId();
//			long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
		
			String[] docIds = StringUtil.split(ParamUtil.get(req, "docids",
					StringPool.BLANK));
		
			if ((docIds == null) || (docIds.length <= 0)) {
				return;
			}
		
			for (int i = 0; i < docIds.length; i++) {
		
				String docId = docIds[i];
		
				String message = ParamUtil.get(req, "message", StringPool.BLANK);
		
				VLegalDocument document = VLegalDocumentServiceUtil
						.getDocument(docId);
		
				if (publish) {
					document.setPublishedByUser(userId);
					document.setPublishedDate(new Date());
					document.setStatusDoc(VLegalDocumentServiceImpl.PUBLISHED);
				} else {
					document.setPublishedByUser(0);
					document.setPublishedDate(null);
					document
							.setStatusDoc(VLegalDocumentServiceImpl.APPROVAL_PENDING);
				}
		
				VLegalDocumentServiceUtil.updateDocument(document);
		
				// Add msg
				if (Validator.isNotNull(message)) {
		
					VLegalAttachedMessageServiceUtil.addMessage(groupId, docId,
							message, false);
			}
	
		}
		
		}catch(Exception e){e.printStackTrace();}

		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?_vlegal_WAR_vlegalportlet_tabs1=tab.van.ban.phap.luat&_vlegal_WAR_vlegalportlet_tabs3=&_vlegal_WAR_vlegalportlet_tabs4=&_vlegal_WAR_vlegalportlet_language=vi_VN&_vlegal_WAR_vlegalportlet_groupId=10157&tabs2=tab.da.xuat.ban");
	}
	
	public void publishDocuments(ActionRequest req,
			ActionResponse response) throws PortletException {
		try{	
		boolean publish = true;
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
	
		Layout layout = themeDisplay.getLayout();
	
		long userId = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
	
		String[] docIds = StringUtil.split(ParamUtil.get(req, "allRowIds",
				StringPool.BLANK));
	
		if ((docIds == null) || (docIds.length <= 0)) {
			return;
		}
		for (int i = 0; i < docIds.length; i++) {
		       
			String docId = docIds[i];
	        if(!docIds[i].equals("on"))
	        {
			String message = ParamUtil.get(req, "message", StringPool.BLANK);
	
			VLegalDocument document = VLegalDocumentServiceUtil
					.getDocument(docId);
	
			if (publish) {
				document.setPublishedByUser(userId);
				document.setPublishedDate(new Date());
				document.setStatusDoc(VLegalDocumentServiceImpl.PUBLISHED);
			} else {
				document.setPublishedByUser(0);
				document.setPublishedDate(null);
				document
						.setStatusDoc(VLegalDocumentServiceImpl.APPROVAL_PENDING);
			}
	
			VLegalDocumentServiceUtil.updateDocument(document);
	
			// Add msg
			if (Validator.isNotNull(message)) {
	
				VLegalAttachedMessageServiceUtil.addMessage(groupId, docId,
						message, false);
			}
	
		}
	    
		}
		}catch(Exception e){e.printStackTrace();}
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?_vlegal_WAR_vlegalportlet_tabs1=tab.van.ban.phap.luat&_vlegal_WAR_vlegalportlet_tabs3=&_vlegal_WAR_vlegalportlet_tabs4=&_vlegal_WAR_vlegalportlet_language=vi_VN&_vlegal_WAR_vlegalportlet_groupId=10157&tabs2=tab.da.xuat.ban");
	}
	
	public void publishs(ActionRequest req,
			ActionResponse response) throws PortletException {
		try
		{	
		boolean publish = true;
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
	
		Layout layout = themeDisplay.getLayout();
	
		long userId = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();
//		long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
	
		String[] docIds = StringUtil.split(ParamUtil.get(req, "docids",
				StringPool.BLANK));
	
		if ((docIds == null) || (docIds.length <= 0)) {
			return;
		}
	   
		for (int i = 0; i < docIds.length; i++) {
	       
			String docId = docIds[i];
	        if(!docIds[i].equals("on"))
	        {
			String message = ParamUtil.get(req, "message", StringPool.BLANK);
	
			VLegalDocument document = VLegalDocumentServiceUtil
					.getDocument(docId);
	
			if (publish) {
				document.setPublishedByUser(userId);
				document.setPublishedDate(new Date());
				document.setStatusDoc(VLegalDocumentServiceImpl.PUBLISHED);
			} else {
				document.setPublishedByUser(0);
				document.setPublishedDate(null);
				document
						.setStatusDoc(VLegalDocumentServiceImpl.APPROVAL_PENDING);
			}
	
			VLegalDocumentServiceUtil.updateDocument(document);
	
			// Add msg
			if (Validator.isNotNull(message)) {
	
				VLegalAttachedMessageServiceUtil.addMessage(groupId, docId,
						message, false);
			}
	        }
		}
	    
		}catch(Exception e){e.printStackTrace();}
		response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?_vlegal_WAR_vlegalportlet_tabs1=tab.van.ban.phap.luat&_vlegal_WAR_vlegalportlet_tabs3=&_vlegal_WAR_vlegalportlet_tabs4=&_vlegal_WAR_vlegalportlet_language=vi_VN&_vlegal_WAR_vlegalportlet_groupId=10157&tabs2=tab.da.xuat.ban");
	}
	
	public void expiredDocument(ActionRequest req,ActionResponse response) throws PortletException {
	  try{
			String[] docIds = StringUtil.split(ParamUtil.get(req, "docids",
					StringPool.BLANK));
		
			if ((docIds == null) || (docIds.length <= 0)) {
				return;
			}
		
			for (int i = 0; i < docIds.length; i++) {
		
				String docId = docIds[i];
		
				VLegalDocument document = VLegalDocumentServiceUtil
						.getDocument(docId);
		
				document.setExpiredDate(new Date());
		
				VLegalDocumentServiceUtil.updateDocument(document);
		
			}
		  }catch(Exception e){e.printStackTrace();}
			response.setRenderParameter("jspPage", "/html/portlet/vlegal/view.jsp?_vlegal_WAR_vlegalportlet_tabs1=tab.van.ban.phap.luat&_vlegal_WAR_vlegalportlet_tabs3=&_vlegal_WAR_vlegalportlet_tabs4=&_vlegal_WAR_vlegalportlet_language=vi_VN&_vlegal_WAR_vlegalportlet_groupId=10157&tabs2=tab.da.xuat.ban");
		}
	
	public void cancel_publish(ActionRequest request, ActionResponse response)throws PortletException
	{
		
	}
	
	//Download File
	public void downloadFile(ActionRequest request, ActionResponse response)
	{
		
		try {
			long folderId = ParamUtil.getLong(request, "folderId");
			String name = ParamUtil.getString(request, "name");
			double version = ParamUtil.getDouble(request, "version");

			long fileShortcutId = ParamUtil.getLong(
					request, "fileShortcutId");

			String uuid = ParamUtil.getString(request, "uuid");
			long groupId = ParamUtil.getLong(request, "groupId");

			String targetExtension = ParamUtil.getString(
					request, "targetExtension");

			ThemeDisplay themeDisplay =
				(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

			HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(
					request);
			HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(
				response);

			getFile(
				folderId, name, version, fileShortcutId, uuid, groupId,
				targetExtension, themeDisplay, httpRequest, httpResponse);

		}
		catch (Exception e) {
//			PortalUtil.sendError(e, request, response);
		}
	}

	protected void getFile(
			long folderId, String name, double version, long fileShortcutId,
			String uuid, long groupId, String targetExtension,
			ThemeDisplay themeDisplay, HttpServletRequest request,
			HttpServletResponse response)
		throws Exception {

		InputStream is = null;

		try {
			long companyId = themeDisplay.getCompanyId();
			long userId = themeDisplay.getUserId();

			DLFileEntry fileEntry = null;

			if (Validator.isNotNull(uuid) && (groupId > 0)) {
				try {
					fileEntry = DLFileEntryLocalServiceUtil.
						getFileEntryByUuidAndGroupId(
							uuid, groupId);

					folderId = fileEntry.getFolderId();
					name = fileEntry.getName();
				}
				catch (Exception e) {
				}
			}

//			if (fileShortcutId <= 0) {
//				DLFileEntryPermission.check(
//					themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId() ,folderId, name,
//					ActionKeys.VIEW);
//			}
//			else {
//				DLFileShortcut fileShortcut =
//					DLFileShortcutServiceUtil.getFileShortcut(fileShortcutId);
//
//				folderId = fileShortcut.getToFolderId();
//				name = fileShortcut.getToName();
//			}

			if (fileEntry == null) {
				fileEntry = DLFileEntryLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
					folderId, name);
			}

			if (version == 0) {
				String abc = fileEntry.getVersion();
				version = Double.parseDouble(abc);
			}

			is = DLLocalServiceUtil.getFileAsStream(companyId, folderId, name);

			String fileName = fileEntry.getTitle();

//			if (Validator.isNotNull(targetExtension)) {
//				String id = DocumentConversionUtil.getTempFileId(
//					fileEntry.getFileEntryId(), String.valueOf(version));
//
//				String sourceExtension = FileUtil.getExtension(name);
//
//				InputStream convertedIS = DocumentConversionUtil.convert(
//					id, is, sourceExtension, targetExtension);
//
//				if ((convertedIS != null) && (convertedIS != is)) {
//					StringBuilder sb = new StringBuilder();
//
//					sb.append(fileEntry.getTitle());
//					sb.append(StringPool.PERIOD);
//					sb.append(targetExtension);
//
//					fileName = sb.toString();
//
//					is = convertedIS;
//				}
//			}

			String contentType = MimeTypesUtil.getContentType(fileName);

			ServletResponseUtil.sendFile(response, fileName, is, contentType);
		}
		finally {
//			ServletResponseUtil.cleanUp(is);
		}
	}

	protected boolean isCheckMethodOnProcessAction() {
		return _CHECK_METHOD_ON_PROCESS_ACTION;
	}

	private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;
	
}

	
