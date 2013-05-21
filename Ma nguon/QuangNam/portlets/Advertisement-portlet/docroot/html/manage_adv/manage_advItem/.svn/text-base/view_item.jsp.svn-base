<%@page import="com.vsi.advertisement.portlet.util.ActionUtil"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

<%@page import="com.vsi.advertisement.portlet.service.AdvItemServiceUtil" %>
<%@page import="com.vsi.advertisement.portlet.service.AdvTypeServiceUtil" %>
<%@page import="com.vsi.advertisement.portlet.model.AdvItem" %>
<%@page import="com.vsi.advertisement.portlet.model.AdvType" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<portlet:defineObjects/>
<liferay-theme:defineObjects />

<portlet:actionURL name="deleteItem" var="deleteItemURL"></portlet:actionURL>

<script type="text/javascript">
function <portlet:namespace />submitdeleteItem() {
		submitForm(document.<portlet:namespace/>fm1, '<%= deleteItemURL.toString() %>');
}
</script>

<%
	List<AdvType> typeList = AdvTypeServiceUtil.getAllType();	
%>

<portlet:actionURL name="searchItem" var="searchItemURL"/>

<portlet:renderURL  var="addItemURL">
	<portlet:param name="jspPage" value="/html/manage_adv/manage_advItem/add_item.jsp"></portlet:param>
</portlet:renderURL>

<br/><br/>

<!-- Button ADD and DELETE -->
<input type="button" value='<%= LanguageUtil.get(pageContext, "actions.add","Them")%>' onClick="window.location.href='<%= addItemURL.toString() %>' "/>
<input type="button" value='<%= LanguageUtil.get(pageContext, "actions.delete","Xoa") %>' ONCLICK="<portlet:namespace/>deleteItem();">
<br/><br/><br/>
<!-- Form Search Item -->
<aui:form name="fm" action="<%= searchItemURL.toString() %>" Method="post">
	<table width="100%">
		<tr>
			<td><b><%=LanguageUtil.get(pageContext, "item.keyword","Tu khoa") %></b></td>
			<td><b><%=LanguageUtil.get(pageContext, "item.type","Kieu quang cao") %></b></td>
			<td><b><%=LanguageUtil.get(pageContext, "item.status","Trang thai") %></b></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td><input type="text" name="keyword" value="" style="width: 200px;"/> </td>
			<td>
				<aui:select name="typeId" label="" style="width: 200px;" >
					<aui:option value="0">---<%=LanguageUtil.get(pageContext, "actions.searchAll","Tat ca") %>---</aui:option>
					<% for(AdvType type : typeList){ %>
					<aui:option value="<%=type.getTypeId() %>"><%= type.getName() %></aui:option>
					<%} %>
				</aui:select>
			</td>
			<td>
				<aui:select name="status" label="" style="width: 150px">
					<aui:option value="0" >---<%=LanguageUtil.get(pageContext, "actions.searchAll","Tat ca") %>---</aui:option>
					<aui:option value="1" ><%=LanguageUtil.get(pageContext, "actions.searchStatusNonExprired","Con han") %></aui:option>
					<aui:option value="2" ><%=LanguageUtil.get(pageContext, "actions.searchStatusExpired","Het han") %></aui:option>
				</aui:select>
			</td>
			<td>
				<aui:input name="" type="submit" value='<%=LanguageUtil.get(pageContext, "actions.search","Tim kiem") %>'/>
			</td>
		</tr>
	</table>
	
</aui:form>

<aui:form name="fm1" Method="post">
	<input name="<portlet:namespace />allRowIds" type="hidden" value="">
	<input name="<portlet:namespace />docids" type="hidden" value="">

<br/><br/><br/>
<!-- Danh sách Cán bộ -->
<% 		
	List<AdvItem> itemListSearch = (List<AdvItem>) request.getAttribute("items");
%>

<br/><br/>
<liferay-ui:search-container emptyResultsMessage='<%=LanguageUtil.get(pageContext, "message.display.table.item","Chua co quang cao") %>' delta="15">
	<liferay-ui:search-container-results>
		<%		
			results = AdvItemServiceUtil.getAllItem();
			if(itemListSearch != null ){
			results = ListUtil.subList(itemListSearch, searchContainer.getStart(), searchContainer.getEnd());
			total = itemListSearch.size();
			}
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
 		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="com.vsi.advertisement.portlet.model.AdvItem" keyProperty="itemId" modelVar="item">
		<%	
	         String name1 = "<input type='checkbox' name='<portlet:namespace />allRowIds' onclick='Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace/> allRowId', this);'/>";
	         String name="<input type='checkbox'  onclick=\"Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace />allRowIds', this);\" />";
	         String input="<input type='checkbox' name='<portlet:namespace />allRowIds' value='"+item.getItemId()+"'/>";	       
		%>
		<liferay-ui:search-container-column-text  name="<%= name %>" value="<%= input %>" />
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "item.name","Ten") %>' property="description"/>
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "item.url","URL") %>' property="url"  />
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "item.expriedDate","Ngay het hieu luc") %>' value="<%= ActionUtil.parseDateToString(item.getExpriedDate()) %>"/>
		<liferay-ui:search-container-column-jsp	path="/html/manage_adv/manage_advItem/actions_item.jsp" align="right" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>

<aui:script >
	Liferay.provide(
		window,
		'<portlet:namespace />deleteItem',
		function() {
		
		document.<portlet:namespace />fm1.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm1, "allRowIds");
		
		if(document.<portlet:namespace />fm1.<portlet:namespace />allRowIds.value.length>0)
		{
			if (confirm('<%= LanguageUtil.get(pageContext, "are-you-want-to-delete-this-item","Ban co muon xoa Item nay?") %>')) {
			
		        document.<portlet:namespace />fm1.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm1, "allRowIds");
		    
				<portlet:namespace/>submitdeleteItem();
			}
		}	else{
			alert('<%= LanguageUtil.get(pageContext, "you-must-select-log-to-delete","Ban phai chon Item truoc khi muon xoa!") %>');
			}
		},
		['liferay-util-list-fields']
	);
</aui:script>