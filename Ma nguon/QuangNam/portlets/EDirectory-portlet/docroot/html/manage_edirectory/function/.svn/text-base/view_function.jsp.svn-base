<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.service.permission.PortletPermissionUtil" %>

<%@page import="com.vsi.edirectory.portlet.service.EDFunctionLocalServiceUtil"%>
<%@page import="com.vsi.edirectory.portlet.model.EDFunction"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.vsi.edirectory.portlet.ActionUtil"%>
<%@page import="javax.portlet.PortletURL"%>

<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<portlet:defineObjects/>
<liferay-theme:defineObjects />

<%
		ThemeDisplay themeDisplay1 = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay1.getScopeGroupId();

%>

<portlet:renderURL windowState="normal" var="themchucvuURL">
	<portlet:param name="jspPage" value="/html/manage_edirectory/function/add_function.jsp"/>
</portlet:renderURL>

<br/>
<c:if test='<%= PortletPermissionUtil.contains(permissionChecker,plid, portletDisplay.getId(), "ADD_FUNCTION") %>'>
<input type="button" value='<%=LanguageUtil.get(pageContext, "managecontacts.position.view-button.add.position") %>' onClick="window.location.href='<%= themchucvuURL.toString() %>' "/>
</c:if>
<br/><br/><br/>

<!-- Danh sách Chức vụ-->
<%-- <portlet:renderURL var="renderTabFunctionURL"> --%>
<%-- 	<portlet:param name="jspPage" value="/html/manage_edirectory/view.jsp?tab1=tab.danhba.chucvu"/> --%>
<%-- </portlet:renderURL> --%>
<%
	PortletURL renderTabFunctionURL = renderResponse.createRenderURL();
	renderTabFunctionURL.setParameter("jspPage", "/html/manage_edirectory/view.jsp?tab1=tab.danhba.chucvu");
	
%>

<liferay-ui:search-container emptyResultsMessage='<%=LanguageUtil.get(pageContext, "message.display.table") %>' delta="4" iteratorURL="<%= renderTabFunctionURL %>">
	
	<liferay-ui:search-container-results>
		<%
			List<EDFunction> functionList = EDFunctionLocalServiceUtil.getAllFunction();
			results = ListUtil.subList(functionList, searchContainer.getStart(), searchContainer.getEnd());
			total = functionList.size();
			
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
			
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="com.vsi.edirectory.portlet.model.EDFunction" keyProperty="id" modelVar="chucvu">
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "managecontacts.position.view-title.table.position") %>' property="name"/>
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "managecontacts.position.view-title.table.describe") %>' property="description"/>
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "managecontacts.position.view-title.table.level") %>' property="levelEd" />
		<liferay-ui:search-container-column-jsp	path="/html/manage_edirectory/function/actions_function.jsp" align="right" />		
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />

</liferay-ui:search-container>














