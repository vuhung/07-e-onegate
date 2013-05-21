<%@page import="com.vsi.advertisement.portlet.util.ActionUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import ="com.vsi.advertisement.portlet.model.AdvType" %>
<%@page import ="com.vsi.advertisement.portlet.model.AdvItem" %>
<%@page import ="com.vsi.advertisement.portlet.service.AdvTypeServiceUtil" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<portlet:defineObjects/>


<%
		ThemeDisplay themeDisplay1 = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay1.getScopeGroupId();

%>

<portlet:renderURL windowState="normal" var="addTypeURL">
	<portlet:param name="jspPage" value="/html/manage_adv/manage_advType/add_type.jsp"/>
</portlet:renderURL>

<br/>
<input type="button" value='<%= LanguageUtil.get(pageContext, "actions.add","Them")%>' onClick="window.location.href='<%= addTypeURL.toString() %>' "/>
<br/><br/><br/>

<!-- Danh sách Kiểu quảng cáo-->

<liferay-ui:search-container emptyResultsMessage='<%=LanguageUtil.get(pageContext, "message.display.table.type","Chua co quang cao") %>' delta="3">
	
	<liferay-ui:search-container-results>
		<%
			
			List<AdvType> types = AdvTypeServiceUtil.getAllType();
			results = ListUtil.subList(types, searchContainer.getStart(), searchContainer.getEnd());
			total = types.size();
			
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="com.vsi.advertisement.portlet.model.AdvType" keyProperty="typeId" modelVar="type">
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "type.name","Ten") %>' property="name"/>
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "type.description","Mo ta") %>' property="description"/>
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "type.numberItem","So item thuoc kieu") %>'  />
		<liferay-ui:search-container-column-text name='<%=LanguageUtil.get(pageContext, "type.createDate","Ngay tao") %>' value="<%= ActionUtil.parseDateToString(type.getCreateDate()) %>"  />
		<liferay-ui:search-container-column-jsp	path="/html/manage_adv/manage_advType/actions_type.jsp" align="right" />
		
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />

</liferay-ui:search-container>














