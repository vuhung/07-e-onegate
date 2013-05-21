<%@page import="com.test.service.AdvItemServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.test.service.AdvTypeServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<portlet:defineObjects />
<%
ThemeDisplay themeDisplay5= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long groupId5= themeDisplay5.getPortletGroupId();
List listType = AdvTypeServiceUtil.getTypeByG(groupId5);


PortletURL typeURLS = renderResponse.createRenderURL();
typeURLS.setWindowState(WindowState.MAXIMIZED);
typeURLS.setParameter("jspPage","/html/quangcao/manage/edit_type.jsp" );


PortletURL rowUrls = renderResponse.createRenderURL();
// rowUrl.setParameter("jspPage", "/html/quantrinoidung/view.jsp");
// rowUrl.setParameter("tabs", "portlet.vcms.tabs.manage");
rowUrls.setParameter("jspPage","/html/quangcao/view.jsp");
rowUrls.setParameter("tabs", "advquangcao.quangcao.tabs.type");


%>
<%
%>
<form action="<%=typeURLS.toString() %>" method="post">
<input name="<portlet:namespace />ids" type="hidden" value="">
<input name="<portlet:namespace />cmd" type="hidden" value="">
<div>
<input input TYPE="BUTTON" VALUE="<%=LanguageUtil.get(pageContext, "viewAdd") %>" ONCLICK="window.location.href='<%=typeURLS.toString()%>'">
</div>
</form>
<br>

<liferay-ui:search-container emptyResultsMessage="viewtype" delta="4"  iteratorURL="<%=rowUrls %>">
<liferay-ui:search-container-results >

<%
List sublist=ListUtil.subList(listType, searchContainer.getStart(), searchContainer.getEnd());
pageContext.setAttribute("results", sublist);
pageContext.setAttribute("total",listType.size());
%>

</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="com.test.model.AdvType" modelVar="AdType">
   <%

   rowUrls.setParameter("row_typeId", Long.toString(AdType.getTypeId()));
   StringBuffer name=new StringBuffer();
   
 
   
   %>

    <liferay-ui:search-container-column-text name="viewTypename"  value='<%= AdType.getName() %>'/>
		
		<liferay-ui:search-container-column-text name="viewTypeDescription" value='<%= AdType.getDescription()%>'/>
		<%
			int itemCount = AdvItemServiceUtil.countItemByG_T(groupId5,AdType.getTypeId());
		%>
		<liferay-ui:search-container-column-text name="viewTypecode" value='<%= String.valueOf(itemCount) %>'/>
		<liferay-ui:search-container-column-text name="viewTypeDate">
			<fmt:formatDate value="<%=AdType.getCreateDate() %>" pattern="dd/MM/yyyy"/>
		</liferay-ui:search-container-column-text>
		
	<liferay-ui:search-container-column-jsp path="/html/quangcao/manage/type_action.jsp"/>	

</liferay-ui:search-container-row>
<liferay-ui:search-iterator/>
</liferay-ui:search-container>