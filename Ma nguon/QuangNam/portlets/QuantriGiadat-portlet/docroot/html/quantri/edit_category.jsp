<%@page import="java.util.Locale"%>
<%@page import="com.test.action.ActionUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.test.service.VlookuppriceCategoryServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.test.model.VlookuppriceCategory"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/html/quantri/init.jsp" %>
<%
String redirect = ParamUtil.getString(request, "redirect");
String catId = ParamUtil.getString(request, "catId","");
String categoryId=ParamUtil.getString(request, "categoryId");
String cmd = ParamUtil.getString(request,Constants.CMD,Constants.ADD);
language ="vi_VN";
groupId = 10157;


PortletURL portalUrl=renderResponse.createActionURL();
portalUrl.setParameter(ActionRequest.ACTION_NAME, "Category_New");


VlookuppriceCategory vlookuppriceCategory=null;
if(Validator.isNotNull(categoryId))
	vlookuppriceCategory=VlookuppriceCategoryServiceUtil.findById(categoryId);
else
	vlookuppriceCategory=(VlookuppriceCategory)request.getAttribute("CategoryUpdata");
if(vlookuppriceCategory!=null)
{ language=vlookuppriceCategory.getLanguage();
	}
String categoryIds=(vlookuppriceCategory!=null)?vlookuppriceCategory.getCategoryId():null;
String _parentId = ((vlookuppriceCategory != null) ? vlookuppriceCategory.getParentId() : "0");
Locale[] locales = LanguageUtil.getAvailableLocales();


%>
<form action="<%=portalUrl.toString() %>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= cmd%>" />
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>" />
<input name="<portlet:namespace />catId" type="hidden" value="<%= catId %>" />
<liferay-ui:tabs
	names="Thay &#273;&#7893;i d&#7919; li&#7879;u"
	backURL="<%= redirect %>"
/>
  <table>
    <tr>
     <td>
		<liferay-ui:message key="title" />
	</td>
	<td>
	   <input id="<portlet:namespace />name" name="<portlet:namespace />name" style="width: 350px;" value="<%=(vlookuppriceCategory!=null)?vlookuppriceCategory.getName():""%>" type="text">
	</td>
    </tr>
    <tr>
    <td>
		Ch&#7885;n danh m&#7909;c
	</td>
	<td>
	   <select name="<portlet:namespace />parentId">
	    <option value="0">Danh m&#7909;c g&#7889;c</option>

         <%=ActionUtil.getCategory(groupId,"0", language, parentId) %>
	   </select>
	</td>
    </tr>
    <tr>
	<td>
		<liferay-ui:message key="description" />
	</td>
	<td>
		<textarea id="<portlet:namespace />description" name="<portlet:namespace />description" style="height: 105px; width: 500px;"><%=(vlookuppriceCategory!=null)?vlookuppriceCategory.getDescription():""%></textarea>
	</td>
   </tr>
   <tr>
     <td><input type="submit" value="<%=LanguageUtil.get(pageContext, "lookup.area.Save") %>" /></td>
    <td><input type="button" value="<%=LanguageUtil.get(pageContext, "lookup.area.cancel") %>" onclick="history.back();"/></td>
   </tr>
  </table>
 
</form>
