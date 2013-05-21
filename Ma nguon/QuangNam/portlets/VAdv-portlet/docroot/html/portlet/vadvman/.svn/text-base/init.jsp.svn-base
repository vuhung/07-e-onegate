<%@include file="/html/portlet/init.jsp"%>
<%@page import="com.vportal.portlet.vadvman.util.PortletKeysExt" %>
<%@page import="com.vportal.portlet.vadvman.util.ActionKeysExt"%>
<%@page import="com.vportal.portlet.vadvman.model.AdvType"%>
<%@page import="com.vportal.portlet.vadvman.service.AdvTypeServiceUtil"%>
<%@page import="com.vportal.portlet.vadvman.service.AdvItemServiceUtil"%>
<%@page import="com.vportal.portlet.vadvman.util.VAdvmanUtil"%>
<%@page import="com.vportal.portlet.vadvman.model.impl.AdvTypeImpl"%>
<%@page import="com.vportal.portlet.vadvman.service.permission.AdvTypePermission"%>
<%@page import="com.vportal.portlet.vadvman.model.AdvItem"%>
<%@page import="com.vportal.portlet.vadvman.service.permission.AdvItemPermission"%>
<%@page import="com.vportal.portlet.vadvman.InvalidItemDescriptionException"%>
<%@page import="com.vportal.portlet.vadvman.ItemExpirationDateException"%>
<%@page import="com.vportal.portlet.vadvman.model.impl.AdvItemImpl"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@page import="com.liferay.portal.kernel.util.HttpUtil" %>

<%@ taglib uri="http://www.vietsoftware.com/tld" prefix="vportal" %>
<script language="javascript">
	function showErrorField(field) {
		field.style.border="2px solid red";
		field.focus();
	}
	function resetField(field) {
		field.style.border="1px solid #CCC";
	}
	
	function clearField(field){
		field.value = "";
	}
</script>
	
