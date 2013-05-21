<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.test.service.VlookuppriceServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/html/quantri/tabs.jsp"%>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%
PortletURL portletPrice=renderResponse.createRenderURL();
portletPrice.setParameter("jspPage", "/html/quantri/edit_price.jsp");
PortletURL portletViews=renderResponse.createRenderURL();
portletViews.setParameter("jspPage", "/html/quantri/price.jsp");
// List types = new ArrayList();
// types = (List)VcmsTypeServiceUtil.getTypesByS_L(groupId, "vi_VN");

// List prices=new ArrayList();
List prices=new ArrayList();
  prices=(List)VlookuppriceServiceUtil.findByAll();
%>
<form action="" method="post">
  <table>
   <tr>
    <td align="left">
     <input TYPE="BUTTON" VALUE="<%=LanguageUtil.get(pageContext, "lookup.area.add") %>" ONCLICK="window.location.href='<%=portletPrice.toString()%>'" />
    </td>
   </tr>
  </table>
  
  <liferay-ui:search-container emptyResultsMessage="lookup.area.khuvuc" delta="4"  iteratorURL="<%=portletViews %>">
<liferay-ui:search-container-results >

<%

List sublist=ListUtil.subList(prices, searchContainer.getStart(), searchContainer.getEnd());
  pageContext.setAttribute("results", sublist);
   pageContext.setAttribute("total", prices.size());
%>

</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="com.test.model.Vlookupprice" modelVar="vlooupprice">

  
    <liferay-ui:search-container-column-text name="lookup.area.tite"  value='<%= vlooupprice.getTitle() %>'/>
   <liferay-ui:search-container-column-text name="description" value='<%=vlooupprice.getContent() %>'/>
  		
	
   <liferay-ui:search-container-column-jsp path="/html/quantri/price_action.jsp"/>

</liferay-ui:search-container-row>
<liferay-ui:search-iterator/>
</liferay-ui:search-container>
</form>