<%@page import="com.vportal.portlet.vcms.service.persistence.VcmsStatusUtil"%>
<%
/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial types of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
%>

<%@ include file="/html/portlet/vcms/init.jsp" %>
<%
	String redirect = ParamUtil.getString(request, "redirect");

	List listArticle = new ArrayList();
	//VcmsType type = (VcmsType) request.getAttribute(WebKeysExt.VCMS_TYPE);
		VcmsType type = null;
	String typeIdTemp = ParamUtil.getString(request, "typeId","");
	if(typeIdTemp != "")
		type = VcmsTypeServiceUtil.getType(typeIdTemp);
	//String typeId2 = ((type != null) ? type.getTypeId() : null);

	long _typeId = ((type != null) ? Long.parseLong(type.getTypeId()): 0);
	int total = 0;
	int numberPage = 1;
	int per = 0;
	int pages = 0;
	
	total = VcmsArticleTypeLocalServiceUtil.countByTypeId(_typeId);
	int sPageNum = ParamUtil.getInteger(request, "pagenum", 1);		
	per = 5;		
	pages = (total % per == 0) ? total / per : total / per + 1;
	int begin = per * (sPageNum - 1);
	int end = (total>per * sPageNum) ? per * sPageNum : total;
	
	listArticle = (List)VcmsArticleTypeLocalServiceUtil.getByTypeId(_typeId, begin, end);
	
%>

<script type="text/javascript">
	function <portlet:namespace />saveType() {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = "<%= type == null ? Constants.ADD : Constants.UPDATE %>";
		submitForm(document.<portlet:namespace />fm);
	}

</script>

<form action="<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" name="updateType">
</portlet:actionURL>" method="post" name="<portlet:namespace />fm" >
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace />typeId" type="hidden" value="<%= (type != null) ? type.getTypeId() : "" %>">
<input name="<portlet:namespace />groupId" type="hidden" value="<%= groupId %>">

<liferay-ui:error exception="<%= InvalidTypeNameException.class %>" message="portlet.vcms.type.exception.please-enter-a-valid-type-name" />
<liferay-ui:error exception="<%= InvalidTypeCodeException.class %>" message="portlet.vcms.type.exception.please-enter-a-valid-type-code" />
<liferay-ui:error exception="<%= DuplicateTypeCodeException.class %>" message="portlet.vcms.type.exception.the-portal-code-you-have-entered-is-already-used" />

<c:if test='<%= type != null %>'>
	<liferay-ui:tabs names="<%= LanguageUtil.get(pageContext, \"portlet.vcms.type.edit.update\") %>" backURL="<%= redirect %>" />
</c:if>
<c:if test='<%= type == null %>'>
	<liferay-ui:tabs names="<%= LanguageUtil.get(pageContext, \"portlet.vcms.type.edit.add-new\") %>" backURL="<%= redirect %>" />
</c:if>	
	
<table border="0" cellpadding="4" cellspacing="0" width="100%">
<tr height="30">
	<td>
		<%= LanguageUtil.get(pageContext, "language") %>:
	</td>
	<td>
		<input type="hidden" name="<portlet:namespace />language" value="<%= (type != null) ? type.getLanguage() : language %>" />
		<select name="<portlet:namespace />language_tmp" disabled style="width: 180px">
			<%	for (int i = 0; i < locales.length; i++) {	%>			
				<option <%= (language.equals(locales[i].getLanguage() + "_" + locales[i].getCountry())) ? "selected" : "" %> value="<%= locales[i].getLanguage() + "_" + locales[i].getCountry() %>"><%= locales[i].getDisplayName(locales[i]) %></option>
			
			<%	}	%>
		</select>
	</td>
</tr>
<tr height="30">
	<td>
		<%= LanguageUtil.get(pageContext, "code") %>:
	</td>
	<td>
		<input type="text" style="width: 300px" maxlength="150" name="<portlet:namespace />code" value="<%= (type != null) ? type.getCode() : "" %>" />
	</td>
</tr>
<tr height="30">
	<td>
		<%= LanguageUtil.get(pageContext, "name") %>:
	</td>
	<td>
		<input type="text" style="width: 300px" maxlength="150" name="<portlet:namespace />name" value="<%= (type != null) ? type.getName() : "" %>" />
	</td>
</tr>

<tr height="30">
	<td valign="top">
		<%= LanguageUtil.get(pageContext, "description") %>:
	</td>
	<td>
		<textarea class="form-text" style="width: 300px" maxlength="500" rows="5" name="<portlet:namespace />description"><%= (type != null) ? type.getDescription() : "" %></textarea>
	</td>
</tr>

<c:if test="<%= type == null %>">
	<tr height="30">
		<td>
			<liferay-ui:message key="permissions" />:
		</td>
		<td>
			<liferay-ui:input-permissions
				modelName="<%= VcmsType.class.getName() %>"
			/>
		</td>
	</tr>
</c:if>
</table>

<c:if test="<%=listArticle.size()>0%>">
<div><liferay-ui:message key="article-of-type" /> : <b><%=type.getName()%></b></div>
	<table class="taglib-search-iterator">
	<tr class="portlet-section-header results-header">
		<td>&nbsp;</td>	
		<td><liferay-ui:message key="title" /></td>
		<td align="center"><liferay-ui:message key="position" /></td>
	</tr>		

<%	for (int i = 0; i < listArticle.size(); i++) {
		VcmsArticleType vArticleType = (VcmsArticleType)listArticle.get(i);
		try{
			VcmsArticle article = VcmsArticleServiceUtil.getArticle(vArticleType.getArticleId());
		
		%>				
			
<tr height="60" <%=(i%2==0)? "class='portlet-section-body results-row'":"class='portlet-section-alternate results-row alt'"%> >
	
	<td width="5%" align="center">
		<input type="checkbox" name="<portlet:namespace/>articleId" value="<%=article.getArticleId()%>">
	</td>
	<td width="85%">
		<table width="100%" cellpadding="5" cellspacing="5" style="padding:5px;">
		<tr>		
			<td style="padding-left:10px;" colspan="2">		
				<b><%=article.getTitle()%></b>
			</td>		
		</tr>
		<tr>			
			<td style="padding-left:10px;padding-bottom:5px;"><%if(article.getHasImage()){%>
				<img width="80" height="60" style="float: left; padding-right: 5px;" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage() %>" >
				<%} else {%>		
				<img width="80" height="60" style="float: left; padding-right: 5px;" src="/html/portlet/vcms/images.jpg" border="1"/>	
				<%}%>	
			</td>					
			<td valign="top" align="justify" style="padding-right:10px;"><%=article.getLead()%></td>
		</tr>		
		</table>
	</td>
				
	<td align="center">
		<select name="<portlet:namespace/>position" onChange="javascript:<portlet:namespace />updateArticlePosition(this)">
			<%for(int j=1;j< listArticle.size()+1; j++){%>	
			<option value="<%=article.getArticleId() +"_"+ j%>" <%=(j==vArticleType.getPosition())?"selected":""%>><%=j%></option>
			<%}%>	
		</select>
	</td>			
</tr>	
<%}catch(Exception ex){}
			}%>
			
<c:if test='<%= pages > 1 %>'>			
<tr height="30">
	<td height="40" colspan="3" align="right"> 
	<p><strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
	<% 	if(sPageNum >1){
			int intPrev = sPageNum-1;%>
		<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.MAXIMIZED.toString() %>"> 
				<portlet:param name="jspPage" value="/html/portlet/vcms/manage/type/edit_type.jsp" />
				<portlet:param name="groupId" value="<%=String.valueOf(groupId)%>" />
				<portlet:param name="language" value="<%=language%>" />
				<portlet:param name="redirect" value="<%=redirect%>" />
				<portlet:param name="typeId" value="<%=String.valueOf(typeId)%>" />				
				<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />	
				</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>

		<%	}	%>

		<% 	for(int i = 1;i <= pages;i++){ 					
				if( i == sPageNum ){%>
					<strong><a class="menu_left" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.MAXIMIZED.toString() %>"> 
					<portlet:param name="jspPage" value="/html/portlet/vcms/manage/type/edit_type.jsp" />
					<portlet:param name="groupId" value="<%=String.valueOf(groupId)%>" />
					<portlet:param name="language" value="<%=language%>" />
					<portlet:param name="redirect" value="<%=redirect%>" />
					<portlet:param name="typeId" value="<%=String.valueOf(typeId)%>" />					
					<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />				
					</portlet:renderURL>';" > [<%=i%>]</a></strong>
		
			<%	}else{	%>	
				<a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.MAXIMIZED.toString() %>"> 
						<portlet:param name="jspPage" value="/html/portlet/vcms/manage/type/edit_type.jsp" />
						<portlet:param name="groupId" value="<%=String.valueOf(groupId)%>" />
						<portlet:param name="language" value="<%=language%>" />
						<portlet:param name="redirect" value="<%=redirect%>" />
						<portlet:param name="typeId" value="<%=String.valueOf(typeId)%>" />						
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
						</portlet:renderURL>';" > <%=i%></a>
			<%	}}	%>
			
				
			<% 	if(sPageNum < pages){
					int intNext = sPageNum + 1;%>
					
					<a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.MAXIMIZED.toString() %>"> 
						<portlet:param name="jspPage" value="/html/portlet/vcms/manage/type/edit_type.jsp" />
						<portlet:param name="groupId" value="<%=String.valueOf(groupId)%>" />
						<portlet:param name="language" value="<%=language%>" />
						<portlet:param name="redirect" value="<%=redirect%>" />
						<portlet:param name="typeId" value="<%=String.valueOf(typeId)%>" />						
						<portlet:param name="pagenum" value="<%= String.valueOf(intNext) %>" />						
						</portlet:renderURL>';" >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
			<%	}  %>
			&nbsp;&nbsp;		
	</td>
</tr>
</c:if>	
</table>		
</c:if>	
					
	
<div>		
	<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "portlet.vcms.button.save") %>'>		
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "portlet.vcms.button.cancel") %>' onClick="self.location = '<%= redirect %>';">
</div>	

</form>

<script type="text/javascript">
	document.<portlet:namespace />fm.<portlet:namespace />code.focus();

	function <portlet:namespace />updateArticlePosition(selector) {
		document.<portlet:namespace />fm.<portlet:namespace />position.value = selector.value;
		//document.<portlet:namespace />fm.<portlet:namespace />redirect.value = currentURL;
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = 'update_position';
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vcms/manage/type/edit_type.jsp" /></portlet:actionURL>');
	}
</script>
