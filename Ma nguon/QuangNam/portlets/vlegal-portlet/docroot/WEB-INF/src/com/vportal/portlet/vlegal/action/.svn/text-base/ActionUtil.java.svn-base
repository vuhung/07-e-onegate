package com.vportal.portlet.vlegal.action;

/**
 * @author NGUYEN TIEN TOI
 * @since 2012
 * @School Ha Noi Open University(HOU)
 */
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.model.VLegalDraftDocument;
import com.vportal.portlet.vlegal.model.VLegalFORel;
import com.vportal.portlet.vlegal.model.VLegalFTRel;
import com.vportal.portlet.vlegal.model.VLegalField;
import com.vportal.portlet.vlegal.model.VLegalOrg;
import com.vportal.portlet.vlegal.model.VLegalSigner;
import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;
import com.vportal.portlet.vlegal.model.VLegalTags;
import com.vportal.portlet.vlegal.model.VLegalType;
import com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFORelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFTRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil;
import com.vportal.portlet.vlegal.util.WebkeysExt;

@SuppressWarnings("deprecation")
public class ActionUtil {

	public static final String DEFAULT_DEPARTMENT_ID = "0";

	public static final String DEFAULT_ORG_ID = "0";
	
	// Get DraftDocument by ActionRequest
	public static void getDraft(ActionRequest request, ActionResponse response) throws com.liferay.portal.kernel.exception.PortalException, SystemException, RemoteException
	{
		String draftId = ParamUtil.getString(request, "draftId");
		
		VLegalDraftDocument ldraft = null;
		if(Validator.isNotNull(ldraft))
		{
			ldraft = VLegalDraftDocumentServiceUtil.getDraft(draftId);
		}
		
		request.setAttribute(WebkeysExt.VLEGAL_DRAFT, ldraft);
	}
	
	// Get Suggestion by HttpServletRequest
	public static void getSuggestion(ActionRequest request, ActionResponse response) throws Exception {
		String suggestionId = ParamUtil.getString(request, "suggestionId");

		VLegalSuggestDocument lsuggestion = null;
		if (Validator.isNotNull(suggestionId)) {
			lsuggestion = VLegalSuggestDocumentServiceUtil
					.getSuggestion(suggestionId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_SUGGESTION, lsuggestion);
	}
	
	// Get Type by HttpServletRequest
	public static void getType(ActionRequest request, ActionResponse response) throws Exception {
		String typeId = ParamUtil.getString(request, "typeid");

		VLegalType ltype = null;

		if (Validator.isNotNull(typeId)) {
			ltype = VLegalTypeServiceUtil.getType(typeId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_TYPE, ltype);
	}
	
	public static void getTypes(RenderRequest request) throws Exception
	{
		@SuppressWarnings("rawtypes")
		List listTypes = VLegalTypeServiceUtil.getAllTypes();
		
		request.setAttribute(WebkeysExt.VLEGAL_LIST_TYPE, listTypes);
	}
	
	// Get Document by HttpServletRequest
	public static void getDocument(ActionRequest request, ActionResponse response) throws Exception {
		String docId = ParamUtil.getString(request, "docid");
		VLegalDocument ldocument = null;

		if (Validator.isNotNull(docId)) {
			ldocument = VLegalDocumentServiceUtil.getDocument(docId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_DOCUMENT, ldocument);
	}
	
	// Get Organization by HttpServletRequest
	public static void getOrg(ActionRequest request, ActionResponse response) throws Exception {
		String orgId = ParamUtil.getString(request, "orgid");

		VLegalOrg vOrg = null;

		if (Validator.isNotNull(orgId)) {
			vOrg = VLegalOrgServiceUtil.getOrg(orgId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_ORGANIZATION, vOrg);
	}
	
	// Get Organization by HttpServletRequest
	public static void getSigner(ActionRequest request, ActionResponse response) throws Exception {
		String sigId = ParamUtil.getString(request, "sigid");

		VLegalSigner vSigner = null;

		if (Validator.isNotNull(sigId)) {
			vSigner = VLegalSignerServiceUtil.getSigner(sigId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_SIGNER, vSigner);
	}
	
	// Get Field by HttpServletRequest
	public static void getField(ActionRequest request, ActionResponse response) throws Exception {
		String fieldId = ParamUtil.getString(request, "fieldid");

		VLegalField lfield = null;

		if (Validator.isNotNull(fieldId)) {
			lfield = VLegalFieldServiceUtil.getVField(fieldId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_FIELD, lfield);
	}
	
	@SuppressWarnings("rawtypes")
	public static void getFields(RenderRequest request) throws Exception
	{
		List listFields = VLegalFieldServiceUtil.getAllFields();
		request.setAttribute(WebkeysExt.VLEGAL_LIST_FIELD, listFields);
	}
	
	// Get Tags by HttpServletRequest
	public static void getTag(ActionRequest request, ActionResponse response) throws Exception {
		String tagId = ParamUtil.getString(request, "tagid");

		VLegalTags ltags = null;

		if (Validator.isNotNull(tagId)) {
//			ltags = VLegalTagsServiceUtil.getTag(tagId);
		}

		request.setAttribute(WebkeysExt.VLEGAL_TAG, ltags);
	}
	
	/*public static void getDepartment(ActionRequest request, ActionResponse response) throws Exception {

		long departmentId = ParamUtil.getLong(request, "departmentId");
		EDDepartment department;
		if (departmentId > 0) {
			department = EDDepartmentLocalServiceUtil
					.getDepartment(departmentId);
		} else {
			department = new EDDepartmentImpl();
		}
		request.setAttribute(WebkeysExt.DEPARTMENT, department);

		long groupId = PortalUtil.getPortletGroupId(req);

		List departmentList = EDDepartmentLocalServiceUtil
				.getByLanguageAndGroup(LanguageUtil.getLanguageId(req),
						groupId, WebKeysExt.DOMAIN_DIR);
		departmentList = EdirectoryUtil.formatByLevel(departmentList);
		request.setAttribute(WebKeysExt.DEPARTMENT_LIST, departmentList);
	}*/
	
	// Print Department Tree
		/*public static String getDepartmentTree(String language, long groupId,
				long parentId) throws Exception {

			StringBuffer sb = new StringBuffer();

			List departmentList = new ArrayList();

			departmentList = EDDepartmentLocalServiceUtil.getDepartmentByL_G_P(
					language, groupId, parentId);

			int indent = 0;
			traverseDepartmentTree(sb, departmentList, indent, parentId);

			return sb.toString();
		}*/
	
	/*private static void traverseDepartmentTree(StringBuffer sb,
			List departments, int indent, long parentId) throws Exception {

		if ((departments == null) || (departments.size() <= 0)) {
			return;
		}

		for (int i = 0; i < departments.size(); i++) {

			EDDepartment depart = (EDDepartment) departments.get(i);

			sb.append("<option value=\"" + depart.getId() + "\" ");
			sb.append((depart.getId() == parentId) ? "\"selected\"" : "");
			sb.append(">");

			// Indent

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
			}

			sb.append(depart.getName());
			sb.append("</option>");

			try {
				traverseDepartmentTree(sb, EDDepartmentLocalServiceUtil
						.getDepartmentByL_G_P(depart.getLanguageId(), depart
								.getGroupId(), depart.getId()), indent + 3,
						parentId);

			} catch (Exception ex) {
				// Ignore..
			}

		}
	}*/
	
	@SuppressWarnings("rawtypes")
	public static boolean checkDupFO(String fieldId, String orgId)
			throws Exception {
		boolean dup = false;

		List vFoList = VLegalFORelServiceUtil.getRelByOrg(orgId);
		for (int i = 0; i < vFoList.size(); i++) {
			VLegalFORel vFo = (VLegalFORel) vFoList.get(i);
			if (fieldId.equals(vFo.getFieldId())) {
				dup = true;
			}
		}
		return dup;
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean checkDupFT(String fieldId, String typeId)
			throws Exception {
		boolean dup = false;

		List vFtList = VLegalFTRelServiceUtil.getRelByType(typeId);
		for (int i = 0; i < vFtList.size(); i++) {
			VLegalFTRel vFt = (VLegalFTRel) vFtList.get(i);
			if (fieldId.equals(vFt.getFieldId())) {
				dup = true;
			}
		}
		return dup;
	}
	
	@SuppressWarnings("rawtypes")
	public static void getAttachmentList(ActionRequest request, ActionResponse response)
			throws Exception 
			{

		String docId = ParamUtil.getString(request, "docid");

		if (Validator.isNull(docId)) {
			return;
		}
		// get attachment
		List listAttachment = AttachmentLocalServiceUtil.getAttachments(Long
				.parseLong(docId), VLegalDocument.class);

		if (listAttachment == null) {
			listAttachment = new ArrayList();
		}

		request.setAttribute(WebkeysExt.VLEGAL_LIST_ATTACHMENT, listAttachment);
	}
	
	@SuppressWarnings("rawtypes")
	public static void getAttachmentListDraft(ActionRequest request, ActionResponse response)
			throws Exception {

		String draftId = ParamUtil.getString(request, "draftId");

		if (Validator.isNull(draftId)) {
			return;
		}
		// get attachment
		List listAttachment = AttachmentLocalServiceUtil.getAttachments(Long
				.parseLong(draftId), VLegalDraftDocument.class);

		if (listAttachment == null) {
			listAttachment = new ArrayList();
		}

		request.setAttribute(WebkeysExt.VLEGAL_LIST_ATTACHMENT_DRAFT,
				listAttachment);
	}
	
	public static void getAttachmentListSuggest(ActionRequest request, ActionResponse response)
			throws Exception {
		String suggestId = ParamUtil.getString(request, "suggestId");

		if (Validator.isNull(suggestId)) {
			return;
		}

		List listAttachment = AttachmentLocalServiceUtil.getAttachments(Long
				.parseLong(suggestId), VLegalSuggestDocument.class);

		if (listAttachment == null) {
			listAttachment = new ArrayList();
		}

		request.setAttribute(WebkeysExt.VLEGAL_LIST_ATTACHMENT_SUGGEST,
				listAttachment);
	}
	
	/*--------------------Lay ve danh sach VLegalDocument ------------------------*/
	public static List<VLegalDocument> getVLegalDocument(RenderRequest request, int approve)
	{	
		List<VLegalDocument> tempResults = null;
		
		try
		{
//			tempResults = VLegalDocumentServiceUtil.getAllVLegalDocument(approve);
			
		}catch(Exception ex)
		{
			tempResults = Collections.emptyList();
		}
		return tempResults;
	}
	
	/*-----------Lay du lieu tu Form Van ban phap luat-------*/
	public static VLegalDocument documentFormRequest(ActionRequest request )
	{
		VLegalDocument document = new VLegalDocumentImpl();
		
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		Layout layout = themeDisplay.getLayout();
		
		document.setCompanyId(themeDisplay.getCompanyId());
		document.setGroupId(layout.getCompanyId());
		document.setUserId(themeDisplay.getUserId());
		document.setLanguage(ParamUtil.getString(request, "language"));
		
		document.setCreatedByUser(themeDisplay.getUserId());
		document.setCreatedDate(new Date());
		document.setSymbol(ParamUtil.getString(request, "symbol"));
		document.setNum(ParamUtil.getString(request, "num"));
		boolean repType = Validator.isNotNull(ParamUtil.getString(request, "reptype"))? true : false;
		
		int promulMonth = ParamUtil.getInteger(request, "promulMonth");
		int promulDay = ParamUtil.getInteger(request, "promulDay");
		int promulYear = ParamUtil.getInteger(request, "promulYear");
		
		document.setPromulDate(PortalUtil.getDate(promulMonth, promulDay, promulYear));
		
		int effectivedMonth = ParamUtil.getInteger(request, "effectivedMonth");
		int effectivedDay = ParamUtil.getInteger(request, "effectivedDay");
		int effectivedYear = ParamUtil.getInteger(request, "effectivedYear");
		
		document.setEffectivedDate(PortalUtil.getDate(effectivedMonth, effectivedDay, effectivedYear));
		
		int expiredMonth = ParamUtil.getInteger(request, "expiredMonth");
		int expiredDay = ParamUtil.getInteger(request, "expiredDay");
		int expiredYear = ParamUtil.getInteger(request, "expiredYear");
		
		document.setExpiredDate(PortalUtil.getDate(expiredMonth, expiredDay, expiredYear));
		
		document.setReplaceDoc(ParamUtil.getString(request, "repDoc"));
		
		document.setSummary(ParamUtil.getString(request, "summary"));
		document.setContent(ParamUtil.getString(request, "content"));
		document.setTypeDocId(ParamUtil.getString(request, "typeid"));
		document.setFieldId(ParamUtil.getString(request, "fieldid"));
		document.setOrgId(ParamUtil.getString(request, "orgid"));
		document.setOrgRels(ParamUtil.getString(request, "select_fieldrels"));
		document.setSignerRels(ParamUtil.getString(request, "signerid"));
		document.setFieldRels(ParamUtil.getString(request, "select_fieldrels"));
		document.setNumRels(ParamUtil.getString(request, "select_fieldrels"));
		
		/*String[] numRels =(String) ParamUtil.getString(request, "select_fieldrels");
		String [] nums = request.getParameterValues("select_fieldrels");
		String[] statusIds = StringUtil.split(ParamUtil.get(request, "select_fieldrels",
				StringPool.BLANK));*/
		
		return document;
	}
	
	@SuppressWarnings({"rawtypes" })
	public static String getOrgTree(long groupId, String language,
			String parentId, String orgId) throws Exception {

		StringBuffer sb = new StringBuffer();

		List orgList = new ArrayList();

		try {

			orgList = (List) VLegalOrgServiceUtil.getOrgByG_L_P(groupId,
					language, DEFAULT_ORG_ID);

		} catch (Exception ex) {
		}

		int indent = 0;

		traverseOrgTree(sb, orgList, indent, parentId, orgId);

		return sb.toString();
	}
	
	@SuppressWarnings("rawtypes")
	private static void traverseOrgTree(StringBuffer sb, 
			List orgList, int indent, String parentId, String orgId) throws Exception 
	{

		if ((orgList == null) || (orgList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < orgList.size(); i++) 
		{

			VLegalOrg org = (VLegalOrg) orgList.get(i);

			sb.append("<option value=\"" + org.getOrgId() + "\" ");
			sb.append((org.getOrgId().equals(parentId) ? "selected" : ""));
			sb.append(">");

			for (int j = 0; j < indent; j++) 
			{
				sb.append(StringPool.NBSP);
			}

			sb.append(org.getName());
			sb.append("</option>");

			try 
			{
				traverseOrgTree(sb, VLegalOrgServiceUtil.getOrgByG_L_P(org.getGroupId(), 
						org.getLanguage(), org.getOrgId()), indent + 3, parentId, orgId);

			} catch (Exception ex) 
			{
				// Ignore..
			}
		}
	}
	
	public static String getListParent(String orgId) throws PortalException,
	SystemException, RemoteException {
						StringBuffer sb = new StringBuffer();
						sb.append(orgId);
						getParent(sb, orgId);
						return sb.toString();
	}
	
	public static void getParent(StringBuffer sb, String orgId)
			throws PortalException, SystemException, RemoteException {
		VLegalOrg vOrg = VLegalOrgServiceUtil.getOrg(orgId);
		if (!vOrg.getParentId().equals("0")) {
			sb.append("," + vOrg.getParentId());
			getParent(sb, vOrg.getParentId());
		}
		
	}
	
}
