<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="com.portlet.vdoc.service.impl.vdocDocumentLocalServiceImpl"%>
<%@ page import="com.portlet.vdoc.Util.ActionUtil"%>
<%@ page import="com.portlet.vdoc.service.persistence.vdocDocumentPersistence"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.portlet.vdoc.model.vdocDocument"%>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil " %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="java.util.List"%>

<%@ page import="com.portlet.vdoc.service.vdocDocumentLocalService"%>
<%@ page import="com.portlet.vdoc.service.vdocDocumentLocalServiceUtil" %>
<%@ page import="com.portlet.vdoc.model.vdocDocument" %>
<%@ page import="com.portlet.vdoc.service.vdocDORelLocalService"%>
<%@ page import="com.portlet.vdoc.service.vdocDORelLocalServiceUtil" %>
<%@ page import="com.portlet.vdoc.model.vdocDORel" %>
<%@ page import="com.portlet.vdoc.service.vdocOrgLocalService"%>
<%@ page import="com.portlet.vdoc.service.vdocOrgLocalServiceUtil" %>
<%@ page import="com.portlet.vdoc.model.vdocOrg" %>
<%@ page import="com.portlet.vdoc.model.impl.vdocOrgImpl" %>

<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jstl/xml_rt" prefix="x" %>
<%@ taglib uri="http://www.vietsoftware.com/tld" prefix="vportal" %>
<portlet:defineObjects />
<liferay-theme:defineObjects/>


<%
	String language = ParamUtil.getString(request, "language", "vi_VN");
	long groupId = ParamUtil.getLong(request, "groupId", portletGroupId.longValue());
	
	PortletPreferences prefs = renderRequest.getPreferences();

	String titlePortlet = prefs.getValue("titlePortlet", "Thu tuc hanh chinh");
	int numberItem = GetterUtil.getInteger(prefs.getValue("numberItem",""), 10);
%>









