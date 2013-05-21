<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.test.model.AdvItem"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.test.service.AdvItemServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.test.model.AdvType"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.test.service.AdvTypeServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/portlet_2_0"  prefix="portlet"%>
    <%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
   
  
    <liferay-theme:defineObjects />
    <portlet:defineObjects/>
   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />deleteArticles',
		function() {
		document.<portlet:namespace />fm.<portlet:namespace />loggerIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "itemId");
		if(document.<portlet:namespace />fm.<portlet:namespace />loggerIds.value.length>0)
		{
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-log") %>')) {
<%-- 				document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");				 --%>
		        document.<portlet:namespace />fm.<portlet:namespace />loggerIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "itemId");
				<portlet:namespace/>submitForm();
			}
		}	else{
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-log-to-delete") %>');
			}
		},
		['liferay-util-list-fields']
	);
</aui:script>

<%
String strTypeId = (String)request.getAttribute("typeId");
String keywords = ParamUtil.getString(request,"keywords");	
String status = ParamUtil.getString(request,"status", "0");

long typeId = ParamUtil.getLong(request,"typeId");

String cmdSearchFlag = ParamUtil.getString(request,"cmd-search-flag",StringPool.BLANK);
ThemeDisplay themeDisplay2= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long groupId2= themeDisplay2.getPortletGroupId();
List listItem=AdvItemServiceUtil.getItemByG(groupId2);
//List listType = AdvTypeServiceUtil.getTypeByG(groupId);
List listType=AdvTypeServiceUtil.getTypeByG(groupId2);
if(listType == null) {
	listType = new ArrayList();
}

%>
<%
ThemeDisplay themeDisplay= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long groupId= themeDisplay.getPortletGroupId();
PortletURL p = renderResponse.createRenderURL();
p.setParameter("tabs", tabs1);

PortletURL advquangcao1 = renderResponse.createRenderURL();
advquangcao1.setParameter("jspPage", "/html/quangcao/manage/edit_item.jsp");


List types = new ArrayList();

%>
<%
PortletURL typeURL = renderResponse.createRenderURL();
typeURL.setWindowState(WindowState.MAXIMIZED);
typeURL.setParameter("jspPage","/html/quangcao/view.jsp" );

typeURL.setParameter("tabs","advquangcao.quangcao.tabs.item");

	
 List headerNames = new ArrayList();
// headerNames.add("name");
// headerNames.add("url");
// headerNames.add("M&#7903; c&#7917;a s&#7893; m&#7899;i");
// headerNames.add("expired");	
// headerNames.add(StringPool.BLANK);
SearchContainer searchCtn = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, typeURL, headerNames, null);	
searchCtn.setEmptyResultsMessage("there-are-no-items");	
List resultss = new ArrayList();	
int totals = 0;
if (Validator.isNotNull(cmdSearchFlag) && Validator.equals(cmdSearchFlag,"true")){		
	
	resultss =  AdvItemServiceUtil.getItemByParam(groupId, keywords, typeId, Integer.parseInt(status), searchCtn.getStart(), searchCtn.getEnd());
	totals = resultss.size();
	
} else {
	
	resultss = AdvItemServiceUtil.getItemByG(groupId, searchCtn.getStart(), searchCtn.getEnd());
	totals = AdvItemServiceUtil.countItemByG(groupId);
}
searchCtn.setTotal(totals);	
searchCtn.setResults(resultss);

// for (int i = 0; i < results.size(); i++) {
// 	AdvItem item = (AdvItem)results.get(i);
	
// 	attachFiles = AttachmentLocalServiceUtil.getDLFileEntries(AdvItem.class, item.getItemId());
				
// 	extensionFile = "."+DLUtil.getFileExtension(item.getName());	

// 	for (int z = 0; z < imageExtensions.length; z++) {		
// 		if (extensionFile.equals(imageExtensions[z])) {
// 			validImageExtension = true;
// 		}
// 	}		
	
// 	boolean isTargetBlank = item.getIsTargetBlank();



	
%>
<br/><br/>	
<form name="<portlet:namespace />fm" method="post">	
<div>
<input TYPE="BUTTON" VALUE="<%=LanguageUtil.get(pageContext, "viewAdd") %>" ONCLICK="window.location.href='<%=advquangcao1.toString()%>'" />
<input type="button" value="<%=LanguageUtil.get(pageContext,"viewdelete") %>" onclick="window.location.href='<%=typeURL.toString() %>'"/>
</div>	
<table width="100%">			
<tr>	
	<td>T&#7915; khóa</td>	
	<td>Ki&#7875;u qu&#7843;ng cáo</td>
	<td>Tr&#7841;ng thái</td>
	<td>&nbsp;</td>
</tr>
<tr>
<td><input type="text" name="<portlet:namespace/>keywords" value="<%=keywords%>" style="width:200px;"/></td>
	<td>
	<select name="<portlet:namespace />typeId" style=" width: 150px;" onChange="javascript:<portlet:namespace />submitForm('');"> 
		<option value="">---<liferay-ui:message key="advquangcao.quangcao.tabs.all" />---</option>
		<%	for (int i = 0; i < listType.size(); i++) {
			AdvType type = (AdvType) listType.get(i);	%>					
			<option value="<%= type.getTypeId() %>" <%= (type.getTypeId()== typeId) ? "selected":"" %>><%=type.getName()%></option>
		<%	}	%> 		
	</select></td>	
	<td>
		<select name="<portlet:namespace />status" style="width: 150px" onchange="javascript:<portlet:namespace />submitForm('');">
			<option value="0" <%= (status.equals("0"))? "selected":""%>>---<liferay-ui:message key="advquangcao.quangcao.tabs.all" />---</option>
			<option value="1" <%= (status.equals("1"))? "selected":""%>>Còn h&#7841;n</option>
			<option value="2" <%= (status.equals("2"))? "selected":""%>>&#272;ã h&#7871;t h&#7841;n</option>
		</select>
	</td>
		<td>			
		<input class="portlet-form-button" type="button" style="width:150px;height:23px;font-weight:bold" value="<%= LanguageUtil.get(pageContext, "search") %>" 
				onclick="javascript:<portlet:namespace />submitForm('');"></td>
</tr>

</table>
<liferay-ui:search-container emptyResultsMessage="viewtype" delta="4"  iteratorURL="<%=typeURL %>">
<liferay-ui:search-container-results >

<%
List sublist=ListUtil.subList(listItem, searchContainer.getStart(), searchContainer.getEnd());
pageContext.setAttribute("results", sublist);
pageContext.setAttribute("total",listItem.size());
%>

</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="com.test.model.AdvItem" modelVar="AdItem">
   <%

   typeURL.setParameter("row_ItemId", Long.toString(AdItem.getItemId() ));
   StringBuffer name=new StringBuffer();
   String name1="<input type='checkbox' name='<portlet:namespace />itemId' onclick='Liferay.Util.checkAll(AUI().one(this).ancestor('table.advquangcao.quangcao.tabs.item'), '<portlet:namespace/>itemId', this);'/>";
   String names="<input type='checkbox'  onclick=\"Liferay.Util.checkAll(AUI().one(this).ancestor('table.advquangcao.quangcao.tabs.item'), '<portlet:namespace />itemId', this);\" />";
   String input1 ="<input type='checkbox' name='<portlet:namespace />itemId' value='"+ AdItem.getItemId()+"'/>";
   String input ="<input type='checkbox' name='<portlet:namespace />itemId' value='"+ AdItem.getItemId()+"'/>";
   %>

   <liferay-ui:search-container-column-text  name="<%=names %>" value="<%=input %>" />
    <liferay-ui:search-container-column-text name="viewTypename"  value='<%= AdItem.getDescription() %>'/>
		
		<liferay-ui:search-container-column-text name="itemUrl" value='<%= AdItem.getUrl()%>'/>
		
<%-- 		<liferay-ui:search-container-column-text name="itemOpen" value='<%=AdItem.getIsTargetBlank() %>'/> --%>
		<liferay-ui:search-container-column-text name="expired">
			<fmt:formatDate value="<%=AdItem.getExpriedDate() %>" pattern="dd/MM/yyyy"/>
		</liferay-ui:search-container-column-text>
		
	<liferay-ui:search-container-column-jsp path="/html/quangcao/manage/item_action.jsp"/>	

</liferay-ui:search-container-row>
<liferay-ui:search-iterator/>
</liferay-ui:search-container>
</form>
<script  language="javascript">
function <portlet:namespace/>submitForm(page){
	var myform = document.<portlet:namespace />fm;
	if(page != ''){
		myform.<portlet:namespace/>page.value=page;
	}
	myform.action="<%= typeURL.toString() %>";
	myform.submit();
}


</script>


