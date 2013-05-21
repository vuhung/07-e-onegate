<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.test.model.Vlookupprice"%>
<%@page import="com.test.service.VlookuppriceServiceUtil"%>
<%@page import="com.test.model.VlookuppriceCategory"%>
<%@page import="com.test.service.VlookuppriceCategoryServiceUtil"%>
<%@page import="java.util.List"%>
<%@include file="/html/quantri/init.jsp" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<%
PortletURL portletURL = renderResponse.createActionURL();
portletURL.setWindowState(WindowState.MAXIMIZED);	
portletURL.setParameter(ActionRequest.ACTION_NAME, "Hienthi_Displays");

int formPrice = ParamUtil.getInteger(request, "formPrice",0);
int toPrice = ParamUtil.getInteger(request, "toPrice",0);
String title = ParamUtil.getString(request, "title","");
String listParent = "0";
String areaId = ParamUtil.getString(request, "areaId","0");
String group = ParamUtil.getString(request, "group","0");
String categoryId = ParamUtil.getString(request, "categoryId","0");
String streetId = ParamUtil.getString(request, "streetId","0");
ThemeDisplay themeDisplay6= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

Long groupId2=Long.valueOf(themeDisplay6.getPortletGroupId());
if(!areaId.equals("0")){
	listParent = areaId;
}
if(!group.equals("0")){
	listParent = group;
}
if(!categoryId.equals("0")){
	listParent = categoryId;
}
if(!streetId.equals("0")){
	listParent = streetId;
}
String search = ParamUtil.getString(request, "search","");
%>

<form action="" method="post" onsubmit="return doValidation();" name="<portlet:namespace />fm">
<input name="<portlet:namespace />search" value="" type="hidden">
  <div id="fulltwocol">
  	<div class="ctn-center clearfix">
    	<div class="line-top">
        	<div class="line-bottom">
            	<div class="line-left">
                	<div class="line-right">
                    	<div class="goc-left-top">
                        	<div class="goc-right-top">
                            	<div class="goc-left-bottom">
                                	<div class="goc-right-bottom">
										<div class="ct">
									      <table cellpadding="0" cellspacing="0" border="0" width="100%">
									      <tr>
									      <td></td>
									      </tr>
									      
									      </table>
									    <div class="smallpage">
												
												<table cellspacing="0" cellpadding="0" border="0" width="100%">
												<tr>
													<td valign="top" width="25%"><img height="225" width="182" /></td>
													<td valign="middle">
														<table cellspacing="3" cellpadding="3" border="0" width="100%">
														<tr height="30">
															<td><b>Khu v&#7921;c</b></td>
															<td colspan="2">
																<select name="<portlet:namespace />areaId"  onchange="<portlet:namespace />findByParentId();">
																	<option value="0">Xin m&#7901;i b&#7841;n ch&#7885;n danh m&#7909;c</option>
																	<%	List listparent = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId2,"0",language);
																			for(int i=0;i<listparent.size();i++){
																			VlookuppriceCategory category = (VlookuppriceCategory)listparent.get(i);
																	%>
																	<option value="<%=category.getCategoryId() %>" <%=(areaId.equals(category.getCategoryId()))?"selected":"" %>><%= category.getName()%> </option>
																		<%}%>
																</select>
															</td>
														</tr> 
																	
														<tr height="30"><td><b>Nh&#243;m &#273;&#7845;t</b></td>
															<td colspan="2">
										 			           <select onchange="<portlet:namespace />findByParentId();" name="<portlet:namespace />group"> 
															   		<%if(!areaId.equals("0")){%>
																	<option value="0">Xin m&#7901;i b&#7841;n ch&#7885;n danh m&#7909;c</option>
																	<%List listAreaId = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,areaId,language);
															    		for(int i=0;i<listAreaId.size();i++){
															    			VlookuppriceCategory category = (VlookuppriceCategory)listAreaId.get(i);
															    		%>
															      	<option value="<%=category.getCategoryId() %>" <%=(group.equals(category.getCategoryId()))?"selected":"" %>><%= category.getName()%> </option>
															    	<%}}%>
															   </select>
															</td>
														</tr> 
														<tr height="30"><td><b>Lo&#7841;i &#273;&#7845;t</b></td>
															<td colspan="2">
															 	<select onchange="<portlet:namespace />findByParentId();" name="<portlet:namespace />categoryId"> 
															    	<%if(!group.equals("0")&&!areaId.equals("0")){%>
																	<option value="0">Xin m&#7901;i b&#7841;n ch&#7885;n danh m&#7909;c</option>
																	<%List listGroupId = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,group,language);
																	    for(int i=0;i<listGroupId.size();i++){
																	    	VlookuppriceCategory category = (VlookuppriceCategory)listGroupId.get(i);
															    	%>
															      	<option value="<%=category.getCategoryId() %>" <%=(categoryId.equals(category.getCategoryId()))?"selected":"" %>><%= category.getName()%> </option>
															    	<%}}%>
															   </select>
															</td>
														</tr> 
															
														<tr height="30">
															<td><b>T&#234;n &#273;&#432;&#7901;ng</b></td>
															<td colspan="2">  
																<select onchange="<portlet:namespace />findByParentId();" name="<portlet:namespace />streetId"> 
														    	<%	if(!group.equals("0")&&!areaId.equals("0")&&!categoryId.equals("0")){%>
															
																	<option value="0">Xin m&#7901;i b&#7841;n ch&#7885;n danh m&#7909;c</option>
																<%
																    List listStreetId = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,categoryId,language);
																    for(int i=0;i<listStreetId.size();i++){
																    	VlookuppriceCategory category = (VlookuppriceCategory)listStreetId.get(i);
															    %>
														      <option value="<%=category.getCategoryId() %>" <%=(streetId.equals(category.getCategoryId()))?"selected":"" %>><%= category.getName()%> </option>
														    	<%}}%>
																</select>
													   	   </td>
														</tr> 
																	
														<tr height="30">
															<td><b>&#272;o&#7841;n v&#7883; tr&#237;</b></td>
															<td colspan="2">
																<select name="<portlet:namespace />title">
																	<option value="">Xin m&#7901;i b&#7841;n ch&#7885;n v&#7883; tr&#237;</option>
																    <%	if(!streetId.equals("0")&&!group.equals("0")&&!areaId.equals("0")&&!categoryId.equals("0")){
																			List listSubparentId = VlookuppriceServiceUtil.findByS_P(0,streetId);
																			for(int i=0;i<listSubparentId.size();i++){
																				 Vlookupprice vlookupprice = ( Vlookupprice)listSubparentId.get(i);
																    %>
															      	<option value="<%=vlookupprice.getTitle() %>" <%=(title.equals(vlookupprice.getTitle()))?"selected":"" %>><%= vlookupprice.getTitle()%> </option>
															    	<%}}%>
															   	</select>
														   	</td>
														</tr> 
														<tr height="30">
															<td><b>Gi&#225; &#273;&#7845;t t&#7915;</b></td>
															<td>
																<input type="text" name="<portlet:namespace />formPrice" value="" style="width: 80px;"/>   <b>&#272;&#7871;n</b>   
																<input type="text" name="<portlet:namespace />toPrice" value="" style="width: 80px;">	
															</td>
															<td>		
                                                               <input type="button" value="<%=LanguageUtil.get(pageContext, "lookup.category.search") %>" onclick="<portlet:namespace />findBysearch();"/>
															</td>
														</tr>                       
														</table>
													</td>
												</tr>
												</table>
																	
																	
												<table cellspacing="0" cellpadding="0" border="0" width="100%" class="calc">
												<tr bgcolor="#fcedd4"><td colspan="2"><div><b>K&#7871;t qu&#7843;</b></div></td>
													<td align="right" colspan="7"><div><b>&#272;&#417;n v&#7883; t&#237;nh 1000 m<sup>2</sup></b></div></td>
												</tr>
													
												<tr bgcolor="#fffdf9">
													<td align="center" width="6%"><div>STT</div></td>
													<td width="20%"><div>T&#234;n &#273;&#432;&#7901;ng</div></td>
													<td width="20%"><div>Gi&#7899;i h&#7841;n</div></td>
													<td colspan="5"><div style="border-bottom: 1px solid rgb(247, 229, 213);"><center>Gi&#225; &#273;&#7845;t</center></div>
														<div style="border-right: 1px solid rgb(247, 229, 213); width: 16%; float: left;">V&#7883; tr&#237; 1</div>
														<div style="border-right: 1px solid rgb(247, 229, 213); width: 16%; float: left;">V&#7883; tr&#237; 2</div>
														<div style="border-right: 1px solid rgb(247, 229, 213); width: 16%; float: left;">V&#7883; tr&#237; 3</div>
														<div style="border-right: 1px solid rgb(247, 229, 213); width: 16%; float: left;">V&#7883; tr&#237; 4</div>
														<div style="width: 16%; float: left;">V&#7883; tr&#237; 5</div>
													</td>
												</tr>
													
												  <%
												      if(!search.equals("")){
											    	    int total = VlookuppriceServiceUtil.countByprice(title, listParent, formPrice, toPrice);
											    		int numberPage = ParamUtil.getInteger(request, "pagenum", 1);
											    		int per = 15;
											    		int pages = (total % per == 0) ? total / per : total / per + 1;
											    		int begin = per * (numberPage - 1);
											    		int end = (total>per * numberPage) ? per * numberPage : total;
											   
										             List list = VlookuppriceServiceUtil.findByprice(title,listParent,formPrice,toPrice,begin,end);	
										             for(int i=0;i<list.size();i++){
										            	 Vlookupprice price = (Vlookupprice)list.get(i);
										            	 VlookuppriceCategory category = VlookuppriceCategoryServiceUtil.findById(price.getParentId());
									             %>
									          
													
												<tr bgcolor="#fffdf9">
													<td align="center" width="6%"><div><%=i+1 %></div></td>
													<td width="20%"><div><%=category.getName() %></div></td>
													<td width="20%"><div><%=price.getTitle() %></div></td>
													<td width="10%"><div><%= (!price.getPosition1().equals("0"))?price.getPosition1():"" %></div></td>
													<td width="10%"><div><%= (!price.getPosition2().equals("0"))?price.getPosition2():"" %></div></td>
													<td width="10%"><div><%= (!price.getPosition3().equals("0"))?price.getPosition3():"" %></div></td>
													<td width="10%"><div><%= (!price.getPosition4().equals("0"))?price.getPosition4():"" %></div></td>
													<td width="10%"><div><%= (!price.getPosition5().equals("0"))?price.getPosition5():"" %></div></td>
												</tr>
												
												<%}%>
												
												 <%	if(total==0){	%>
								                <tr bgcolor="#fffdf9">
								                	<td colspan="8" class="title_lookup" align="center"> 
								                		Hi&#7879;n d&#7919; li&#7879;u &#273;ang &#273;&#432;&#7907;c c&#7853;p nh&#7853;t
								                	</td>
								                </tr> 	 
								                <%}%>	
													
												<c:if test='<%= pages > 1 %>'>			
												<tr>
													<td height="40" colspan="8" align="right"> 
													<p>
														<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
														<% 	
															if(numberPage >1){
																int intPrev = numberPage-1;%>
																<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
																	<portlet:param name="struts_action" value="/lookupprice/display" />
																	<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />				
																    <portlet:param name="areaId" value="<%=areaId%>"/>
																    <portlet:param name="group" value="<%=group%>"/>
																    <portlet:param name="categoryId" value="<%=categoryId%>"/>
																    <portlet:param name="streetId" value="<%=streetId%>"/>
																    <portlet:param name="title" value="<%=title%>"/>
																	<portlet:param name="search" value="<%=search%>"/>
																	</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
											
														<%
															}
														%>				
														
														<% 
															for(int i = 1;i <= pages;i++){ 	
																if( i == numberPage ){%>
																<strong><a class="menu_left" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
																	<portlet:param name="struts_action" value="/lookupprice/display" />
																	<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
																	<portlet:param name="areaId" value="<%=areaId%>"/>
																    <portlet:param name="group" value="<%=group%>"/>
																    <portlet:param name="categoryId" value="<%=categoryId%>"/>
																    <portlet:param name="streetId" value="<%=streetId%>"/>
																    <portlet:param name="title" value="<%=title%>"/>
																    <portlet:param name="search" value="<%=search%>"/>
																	</portlet:renderURL>';" > <%=i%></a></strong>
														<%
															}else{
																
														%>	
																<strong><a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
																	<portlet:param name="struts_action" value="/lookupprice/display" />
																	<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
																   <portlet:param name="areaId" value="<%=areaId%>"/>
																    <portlet:param name="group" value="<%=group%>"/>
																    <portlet:param name="categoryId" value="<%=categoryId%>"/>
																    <portlet:param name="streetId" value="<%=streetId%>"/>
																    <portlet:param name="title" value="<%=title%>"/>
																    <portlet:param name="search" value="<%=search%>"/>
																	</portlet:renderURL>';" > <%=i%></a></strong>
														<%
																}
															} 
														%>
														
															
														<% 	
															if(numberPage < pages){
																int intNext = numberPage + 1;
														%>
																<a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
																	<portlet:param name="struts_action" value="/lookupprice/display" />
																	<portlet:param name="pagenum" value="<%= String.valueOf(intNext) %>" />					
															    	<portlet:param name="areaId" value="<%=areaId%>"/>
																    <portlet:param name="group" value="<%=group%>"/>
																    <portlet:param name="categoryId" value="<%=categoryId%>"/>
																    <portlet:param name="streetId" value="<%=streetId%>"/>
																    <portlet:param name="title" value="<%=title%>"/>
																    <portlet:param name="search" value="<%=search%>"/>
																	</portlet:renderURL>';" >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
														<%
															}
														%>	
													  &nbsp;&nbsp;		
													</td>
												</tr>
												</c:if>	
												<%}%>		
												</table>
												
											</div>		
									     
									     </div>
										
										</div>				
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>	
     
</form>
<script type="text/javascript">
function <portlet:namespace />findByParentId(){
	submitForm(document.<portlet:namespace />fm, 
'<portlet:actionURL name="Hienthi_Displays"></portlet:actionURL>');
	
}

function <portlet:namespace />findBysearch(){

document.<portlet:namespace />fm.<portlet:namespace />search.value="search";
if(<portlet:namespace />doValidation()){
	
submitForm(document.<portlet:namespace />fm, 
'<portlet:actionURL name="Hienthi_Displays"></portlet:actionURL>');

}

	
}


function <portlet:namespace />doValidation(){
    var formPrice = document.<portlet:namespace />fm.<portlet:namespace />formPrice.value
	var toPrice = document.<portlet:namespace />fm.<portlet:namespace />toPrice.value
	if ((formPrice!='') && isNaN(formPrice))
	{
		document.getElementById("errorPrice").style.display = '';
		document.<portlet:namespace />fm.<portlet:namespace />formPrice.focus();
		return false;
	}

if ((toPrice!='') && isNaN(toPrice))
{
	document.getElementById("errorPrice").style.display = '';
	document.<portlet:namespace />fm.<portlet:namespace />toPrice.focus();
	return false;
}
if (toPrice < formPrice)
{
	document.getElementById("errorPrice").style.display = '';
	document.<portlet:namespace />fm.<portlet:namespace />toPrice.focus();
	return false;
}
return true;

}
</script>

