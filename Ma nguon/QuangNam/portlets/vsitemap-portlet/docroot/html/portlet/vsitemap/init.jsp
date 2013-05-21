<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.vportal.portlet.vsitemap.*" %>
<%@ page import="com.vportal.portlet.vsitemap.model.*" %>
<%@ page import="com.vportal.portlet.vsitemap.model.impl.*" %>	
<%@ page import="com.vportal.portlet.vsitemap.service.permission.*" %>
	
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.vportal.portlet.vsitemap.service.*" %>
<%@ page import="com.vportal.portlet.vsitemap.action.*" %>
<%@ page import="com.vportal.portlet.vsitemap.util.*" %>
<%@ page import="com.vportal.portlet.vsitemap.IconSizeException" %>
<%@ page import="com.vportal.portlet.vsitemap.IconNameException" %>
<%@ page import="com.vportal.portlet.vsitemap.NoSuchVsmBranchException" %>
<%@ page import="com.vportal.portlet.vsitemap.BranchNameException" %>

<%@ page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@ page import="com.vportal.portal.util.PortletKeysExt"%>
	
<%@ page import="com.liferay.portal.theme.*" %>
<%@ page import="com.liferay.portal.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
	
<script language="javascript">
	function showErrorField(field) {
		field.style.border="2px solid red";
		field.focus();
	}
	function resetField(field) {
		field.style.border="1px solid #CCC";
	}
</script>
	
<%
	String language = ParamUtil.getString(request, "language", "vi_VN");
	long groupId = ParamUtil.getLong(request, "groupId",0);	
	if(groupId == 0){
		groupId = portletGroupId.longValue();
	}

	boolean showTabs = false;
	boolean showButtons = false;
	if (portletConfig.getPortletName().equals(PortletKeysExt.VSITEMAP)) {		
		showButtons = true;
		showTabs = true;
	}	
%>
