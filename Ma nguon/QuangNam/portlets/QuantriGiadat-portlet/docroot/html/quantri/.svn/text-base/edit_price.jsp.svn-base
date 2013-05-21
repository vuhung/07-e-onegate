<%@page import="java.util.Locale"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.test.action.ActionUtil"%>
<%@page import="com.test.service.VlookuppriceServiceUtil"%>
<%@page import="com.test.model.Vlookupprice"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/html/quantri/init.jsp" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>

<%
String redirect = ParamUtil.getString(request, "redirect");
String priceId = ParamUtil.getString(request, "priceId","");
String lookuppriceId=ParamUtil.getString(request,"lookuppriceId");
String cmd = ParamUtil.getString(request,Constants.CMD,Constants.ADD);
language ="vi_VN";
groupId = 10157;




PortletURL portalPrice=renderResponse.createActionURL();
portalPrice.setParameter(ActionRequest.ACTION_NAME, "PriceAdd");



Vlookupprice vlookupprice=null;
if(Validator.isNotNull(lookuppriceId))
	vlookupprice=VlookuppriceServiceUtil.getLookuppriceId(lookuppriceId);
else
	vlookupprice=(Vlookupprice)request.getAttribute("VlookuppriceUpdata");
if(vlookupprice!=null)
{ language=vlookupprice.getLanguage();
	}
String categoryIds=(vlookupprice!=null)?vlookupprice.getLookuppriceId():null;
String _parentId = ((vlookupprice != null) ? vlookupprice.getParentId() : "0");
Locale[] locales = LanguageUtil.getAvailableLocales();

%>
<form action="<%=portalPrice.toString() %>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= cmd%>" />
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>" />
<input name="<portlet:namespace />priceId" type="hidden" value="<%= priceId %>" />
  <table class="lfr-table">
    <tr>
      <td><liferay-ui:message key="title" /></td>
      <td>  <input id="<portlet:namespace />name" name="<portlet:namespace />name" style="width: 350px;" value="<%=(vlookupprice!=null)?vlookupprice.getTitle():""%>" type="text"></td>
    </tr>
    <tr>
    <td>Ch&#7885;n danh m&#7909;c</td>
    <td><select name="<portlet:namespace />parentId">
	     <%= ActionUtil.getListCategory(groupId,"0",language,parentId) %>
	   </select>
	   </td>
    </tr>
    <tr>
    <td><liferay-ui:message key="description" /></td>
    <td>
    <textarea id="<portlet:namespace />content" name="<portlet:namespace />content" style="height: 105px; width: 500px;"><%=(vlookupprice!=null)?vlookupprice.getContent():""%></textarea>
    </td>
    </tr>
    <tr>
    <td>Gi&#225; v&#7883; tr&#237; 1
    </td>
    <td>
    <input type="text" id="<portlet:namespace />position1" name="<portlet:namespace />position1" style="width: 50px;" value="<%=(vlookupprice!=null)?vlookupprice.getPosition1():""%>" >
    </td>
    </tr>
    <tr>
    <td>
    Gi&#225; v&#7883; tr&#237; 2
    </td>
    <td>
    <input type="text" id="<portlet:namespace />position2" name="<portlet:namespace />position2" style="width: 50px;" value="<%=(vlookupprice!=null)?vlookupprice.getPosition2():""%>" >
    </td>
    </tr>
    <tr>
    <td>Gi&#225; v&#7883; tr&#237; 3</td>
    <td><input type="text" id="<portlet:namespace />position3" name="<portlet:namespace />position3" style="width: 50px;" value="<%=(vlookupprice!=null)?vlookupprice.getPosition3():""%>" ></td>
    </tr>
    <tr>
    <td>Gi&#225; v&#7883; tr&#237; 4</td>
    <td><input type="text" id="<portlet:namespace />position4" name="<portlet:namespace />position4" style="width: 50px;" value="<%=(vlookupprice!=null)?vlookupprice.getPosition4():""%>" ></td>
    </tr>
    <tr>
    <td>Gi&#225; v&#7883; tr&#237; 5</td>
    <td><input type="text" id="<portlet:namespace />position5" name="<portlet:namespace />position5" style="width: 50px;" value="<%=(vlookupprice!=null)?vlookupprice.getPosition5():""%>" ></td>
    </tr>
    <tr>
     <td><input type="submit" value="<%=LanguageUtil.get(pageContext, "lookup.area.Save") %>" /></td>
    <td><input type="button" value="<%=LanguageUtil.get(pageContext, "lookup.area.cancel") %>" onclick="history.back();"/></td>
    </tr>
  </table>
</form>
