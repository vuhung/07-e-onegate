<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.vportal.portlet.vfaq.*" %>
<%@ page import="com.vportal.portlet.vfaq.model.*" %>
<%@ page import="com.vportal.portlet.vfaq.action.*" %>
<%@ page import="com.vportal.portlet.vfaq.service.*" %>
<%@ page import="com.vportal.portlet.vfaq.service.impl.*" %>
<%@ page import="com.vportal.portlet.vfaq.service.permission.*" %>
<%@page import="com.vportal.portlet.vfaq.util.FAQUtil"%>
<%@page import="com.vportal.portlet.vfaq.service.FAQCategoryServiceUtil"%>
<%@page import="com.vportal.portal.model.Attachment"%>
<%@page import="com.vportal.portlet.vfaq.util.WebKeysExt"%>
<%@page import="com.vportal.portlet.vfaq.util.ActionKeysExt"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.vportal.portal.service.AttachmentServiceUtil"%>	
<%@page import="com.vportal.portal.util.PortalUtilExt"%>

<%
	String language = ParamUtil.getString(request, "language", "vi_VN");
	long groupId = ParamUtil.getLong(request, "groupId", portletGroupId.longValue());

	String parentId1 = ParamUtil.get(request, "parentId1", "0");
	String tabs1 = ParamUtil.getString(request, "tabs1");	
	String tabs2 = ParamUtil.getString(request, "tabs2");	
%>

<script language="javascript">	
	function <portlet:namespace />updateQuestion(cmd, render) {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;		
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vfaq/edit_question" /></portlet:renderURL>');
		} else {
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vfaq/edit_question" /></portlet:actionURL>');
		}
	}	
</script>	