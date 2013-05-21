package com.portlet.vdoc.Util;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.portlet.vdoc.model.vdocField;
import com.portlet.vdoc.model.vdocOrg;
import com.portlet.vdoc.service.vdocFieldLocalServiceUtil;
import com.portlet.vdoc.service.vdocFieldServiceUtil;
import com.portlet.vdoc.service.vdocOrgLocalServiceUtil;
import com.portlet.vdoc.service.vdocOrgServiceUtil;


public class ActionUtil {
	
	public static final String DEFAULT_FIELD_ID = "0";

	public static final String DEFAULT_ORG_ID = "0";



	public static String getOrgTree(long groupId, String language,
			String parentId, String orgId, String[] orgIds) throws Exception {

		StringBuffer sb = new StringBuffer();

		List<vdocOrg> orgList = new ArrayList<vdocOrg>();

		try {
			orgList = vdocOrgLocalServiceUtil.getOrgByG_L_P(groupId, language,
					DEFAULT_ORG_ID);
			
		} catch (Exception e) {
		}

		int indent = 0;

		traverseOrgTree(sb, orgList, indent, parentId, orgId, orgIds);

		return sb.toString();
	}

	private static void traverseOrgTree(StringBuffer sb, List<vdocOrg> orgList,
			int indent, String parentId, String orgId, String[] orgIds)
			throws Exception {

		if ((orgList == null) || (orgList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < orgList.size(); i++) {

			vdocOrg org = (vdocOrg) orgList.get(i);

			sb.append("<option value=\"" + org.getOrgId() + "\" ");

			if (Validator.isNull(orgIds)) {
				sb.append((org.getOrgId().equals(parentId) ? "selected" : ""));

			} else if (Validator.isNotNull(orgIds) && orgIds.length > 0) {
				for (int j = 0; j < orgIds.length; j++) {
					sb.append((org.getOrgId().equals(orgIds[j]) ? "selected"
							: ""));
				}
			}
			sb.append(">");

			// Indent
			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);

			}

			sb.append(org.getName());
			sb.append("</option>");

			try {

				traverseOrgTree(sb, vdocOrgLocalServiceUtil.getOrgByG_L_P(org
						.getGroupId(), org.getLanguage(), org.getOrgId()),
						indent + 3, parentId, orgId, orgIds);

			} catch (Exception ex) {
				// Ignore..
			}
		}
	}

	public static String getFieldTree(long groupId, String language,
			String parentId, String fieldId) throws Exception {

		StringBuffer sb = new StringBuffer();

		List<vdocField> fieldList = new ArrayList<vdocField>();

		try {
			fieldList = vdocFieldLocalServiceUtil.getFieldByG_L_P(groupId,
					language, DEFAULT_FIELD_ID);

		} catch (Exception ex) {
		}

		int indent = 0;

		traverseFieldTree(sb, fieldList, indent, parentId, fieldId);

		return sb.toString();
	}

	private static void traverseFieldTree(StringBuffer sb, List<vdocField> fieldList,
			int indent, String parentId, String fieldId) throws Exception {

		if ((fieldList == null) || (fieldList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < fieldList.size(); i++) {

			vdocField field = (vdocField) fieldList.get(i);

			sb.append("<option value=\"" + field.getFieldId() + "\" ");
			sb.append((field.getFieldId().equals(parentId) ? "selected" : ""));
			sb.append(">");

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);

			}

			sb.append(field.getName());
			sb.append("</option>");

			try {
				traverseFieldTree(sb, vdocFieldLocalServiceUtil.getFieldByG_L_P(
						field.getGroupId(), field.getLanguage(), field
								.getFieldId()), indent + 3, parentId, fieldId);

			} catch (Exception ex) {
				// Ignore..
			}
		}
	}

	public static String getOrgTree(long groupId, String language,
			String parentId, String orgId) throws Exception {

		StringBuffer sb = new StringBuffer();

		List<vdocOrg> orgList = new ArrayList<vdocOrg>();

		try {

			orgList = vdocOrgLocalServiceUtil.getOrgByG_L_P(groupId,
					language, DEFAULT_ORG_ID);

		} catch (Exception ex) {
		}

		int indent = 0;

		traverseOrgTree(sb, orgList, indent, parentId, orgId);

		return sb.toString();
	}

	private static void traverseOrgTree(StringBuffer sb, List<vdocOrg> orgList,
			int indent, String parentId, String orgId) throws Exception {

		if ((orgList == null) || (orgList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < orgList.size(); i++) {

			vdocOrg org = (vdocOrg) orgList.get(i);

			sb.append("<option value=\"" + org.getOrgId() + "\" ");
			sb.append((org.getOrgId().equals(parentId) ? "selected" : ""));
			sb.append(">");

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);

			}

			sb.append(org.getName());
			sb.append("</option>");

			try {
				traverseOrgTree(sb, vdocOrgLocalServiceUtil.getOrgByG_L_P(org
						.getGroupId(), org.getLanguage(), org.getOrgId()),
						indent + 3, parentId, orgId);

			} catch (Exception ex) {
				// Ignore..
			}
		}
	}

	// Tree Checkbox
	public static String getFieldCheckbox(List<vdocField> fields, String portletNamespace)
			throws SystemException, PortalException {

		StringBuffer sb = new StringBuffer();

		int indent = 2;

		traverseFieldTreeCheckbox(sb, fields, indent, portletNamespace);

		return sb.toString();
	}

	private static void traverseFieldTreeCheckbox(StringBuffer sb,
			List<vdocField> fieldList, int indent, String portletNamespace)
			throws SystemException, PortalException {

		if ((fieldList == null) || (fieldList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < fieldList.size(); i++) {

			vdocField field = (vdocField) fieldList.get(i);

			sb.append("<tr>");
			sb.append("<td width=\"100%\" valign=\"middle\" ");
			sb.append(" />");

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
				sb.append(StringPool.NBSP);
			}

			sb.append("<input type=\"checkbox\" name=\"");
			sb.append(portletNamespace + "field\" id=\"");
			sb.append(portletNamespace + "field_" + field.getFieldId() + "\" ");
			sb.append("value=\"" + field.getFieldId() + "\" ");
			sb.append(" />");
			sb.append("<label for=\"");
			sb
					.append(portletNamespace + "field_" + field.getFieldId()
							+ "\" >");
			sb.append(field.getName());
			sb.append("</label>");
			sb.append("</td>");
			sb.append("</tr>");

			try {
				traverseFieldTreeCheckbox(sb, vdocFieldLocalServiceUtil
						.getFieldByG_L_P(field.getGroupId(), field
								.getLanguage(), field.getFieldId()),
						(indent + 5), portletNamespace);

			} catch (Exception ex) {
				// Ignore ...
			}

		}

	}

	public static String getOrgCheckbox(List<vdocOrg> orgs, String portletNamespace)
			throws SystemException, PortalException {

		StringBuffer sb = new StringBuffer();

		int indent = 2;

		traverseOrgTreeCheckbox(sb, orgs, indent, portletNamespace);

		return sb.toString();
	}

	private static void traverseOrgTreeCheckbox(StringBuffer sb, List<vdocOrg> orgList,
			int indent, String portletNamespace) throws SystemException,
			PortalException {

		if ((orgList == null) || (orgList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < orgList.size(); i++) {

			vdocOrg org = (vdocOrg) orgList.get(i);

			sb.append("<tr>");
			sb.append("<td width=\"100%\" valign=\"middle\" ");
			sb.append(" />");

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
				sb.append(StringPool.NBSP);
			}

			sb.append("<input type=\"checkbox\" name=\"");
			sb.append(portletNamespace + "org\" id=\"");
			sb.append(portletNamespace + "org_" + org.getOrgId() + "\" ");
			sb.append("value=\"" + org.getOrgId() + "\" ");
			sb.append(" />");
			sb.append("<label for=\"");
			sb.append(portletNamespace + "org_" + org.getOrgId() + "\" >");
			sb.append(org.getName());
			sb.append("</label>");
			sb.append("</td>");
			sb.append("</tr>");

			try {
				traverseOrgTreeCheckbox(sb, vdocOrgLocalServiceUtil.getOrgByG_L_P(
						org.getGroupId(), org.getLanguage(), org.getOrgId()),
						(indent + 5), portletNamespace);

			} catch (Exception ex) {
				// Ignore ...
			}
		}
	}

	// Tree Radio
	public static String getFieldRadio(List<vdocField> fields, String portletNamespace)
			throws SystemException, PortalException {

		StringBuffer sb = new StringBuffer();

		int indent = 2;

		traverseFieldTreeRadio(sb, fields, indent, portletNamespace);

		return sb.toString();
	}

	private static void traverseFieldTreeRadio(StringBuffer sb, List<vdocField> fieldList,
			int indent, String portletNamespace) throws SystemException,
			PortalException {

		if ((fieldList == null) || (fieldList.size() <= 0)) {
			return;
		}

		for (int i = 0; i < fieldList.size(); i++) {

			vdocField field = (vdocField) fieldList.get(i);

			sb.append("<tr>");
			sb.append("<td width=\"100%\" valign=\"middle\" ");
			sb.append(" />");

			for (int j = 0; j < indent; j++) {
				sb.append(StringPool.NBSP);
				sb.append(StringPool.NBSP);
			}

			sb.append("<input type=\"radio\" name=\"");
			sb.append(portletNamespace + "field\" id=\"");
			sb.append(portletNamespace + "field_" + field.getFieldId() + "\" ");
			sb.append("value=\"" + field.getFieldId() + "\" ");
			sb.append(" />");
			sb.append("<label for=\"");
			sb
					.append(portletNamespace + "field_" + field.getFieldId()
							+ "\" >");
			sb.append(field.getName());
			sb.append("</label>");
			sb.append("</td>");
			sb.append("</tr>");

			try {
				traverseFieldTreeCheckbox(sb, vdocFieldLocalServiceUtil
						.getFieldByG_L_P(field.getGroupId(), field
								.getLanguage(), field.getFieldId()),
						(indent + 5), portletNamespace);

			} catch (Exception ex) {
				// Ignore ...
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
		vdocOrg vOrg = vdocOrgLocalServiceUtil.getOrg(orgId);
		if (!vOrg.getParentId().equals("0")) {
			sb.append("," + vOrg.getParentId());
			getParent(sb, vOrg.getParentId());
		}
	}

	public static String getListParentField(String fieldId)
			throws PortalException, SystemException, RemoteException {
		StringBuffer sb = new StringBuffer();
		sb.append(fieldId);
		getParentField(sb, fieldId);
		return sb.toString();
	}

	public static void getParentField(StringBuffer sb, String fieldId)
			throws PortalException, SystemException, RemoteException {
		vdocField vField = vdocFieldLocalServiceUtil.getField(fieldId);
		if (!vField.getParentId().equals("0")) {
			sb.append("," + vField.getParentId());
			getParentField(sb, vField.getParentId());
		}
	}
	
	public static String parseDateToString(Date myDate){
		if(myDate == null){
			return "";
		}
		Calendar cal = Calendar.getInstance();
		String date = "";
		cal.setTime(myDate);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		date = day + "/" + month + "/" + year;
		return date;				
	}

}
