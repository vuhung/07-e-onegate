
<%@page import="com.vportal.portlet.vlegal.util.PortletKeysExt"%>
<%@page import="com.vportal.portlet.vlegal.util.permission.ActionKeysExt"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.service.persistence.VLegalTypeUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalLogger"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/faces" prefix="liferay-faces" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@page import="com.liferay.util.bridges.javascript.JavaScriptPortlet" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>

<portlet:actionURL name="deleteLog" var="deleteLogURL">
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
</portlet:actionURL>

<script type="text/javascript">

	function <portlet:namespace />submitFormdeleteLogs() {
		alert("I Love You");
		submitForm(document.<portlet:namespace/>fm, '<%= deleteLogURL.toString() %>');
	}
	
</script>

<%
	boolean showDeleteAllLogButton = showButtons && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeysExt.VLEGAL , ActionKeysExt.DELETE_ALL_LOGGER);
	
	PortletURL p = renderResponse.createRenderURL();
	p.setParameter("tabs1", tabs1);
	
	PortletURL portlet1 = renderResponse.createRenderURL();
	portlet1.setParameter("jspPage", "/html/portlet/vlegal/log_view.jsp");
%>

<form name="<portlet:namespace />fm" method="post">
	
	<c:if test="<%=showDeleteAllLogButton%>">	
		<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "delete") %>' onClick="javascript:<portlet:namespace />deleteLogs();" />
		<input type="hidden" name="<portlet:namespace />loggerIds" value="" />
		<input type="hidden" name="<portlet:namespace />allRowIds" value="" />
	</c:if>
	<liferay-ui:search-container emptyResultsMessage="chua co du lieu" delta="20" iteratorURL="<%=p %>" >
	
	<liferay-ui:search-container-results >
	<% 
	
	
		List list = VLegalLoggerServiceUtil.findLogs();
		List sublist = ListUtil.subList(list, searchContainer.getStart(), searchContainer.getEnd());
		pageContext.setAttribute("results", sublist);
		pageContext.setAttribute("total", list.size());
	%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="com.vportal.portlet.vlegal.model.VLegalLogger"  modelVar="vc">
	
	<%	
	   String name1 = "<input type='checkbox' name=\"<portlet:namespace />allRowIds' onclick='Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace/> allRowIds', this);\" />";
	   String name="<input type='checkbox'  onclick=\"Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace />allRowIds', this);\" />";
       String input="<input type='checkbox' name='<portlet:namespace />allRowIds' value='" + vc.getLoggerId() + "'/>";
	       
	%>
			<liferay-ui:search-container-column-text  name="<%= name %>" value="<%= input %>" />
			<liferay-ui:search-container-column-text name="portlet.vlegal.logger.list.content"  value='<%=vc.getContent() %>'/>

		
	<liferay-ui:search-container-column-jsp path="/html/portlet/vlegal/log_action.jsp"/>
	</liferay-ui:search-container-row>	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>

</form>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />deleteLogs',
		function() {
		
		var abc = document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");
		alert(abc);
		if(document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value.length>0)
		{
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are you want to delete staff") %>')) {
			
		        document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");
		    
				<portlet:namespace/>submitFormdeleteLogs();
			}
		}	else{
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you must select log to delete") %>');
			}
		},
		['liferay-util-list-fields']
	);
</aui:script>		