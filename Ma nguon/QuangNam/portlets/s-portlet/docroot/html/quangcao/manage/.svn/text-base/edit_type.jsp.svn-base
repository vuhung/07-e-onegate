<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.test.model.impl.AdvTypeImpl"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.test.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.Locale"%>
<%@taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<portlet:defineObjects/>
<style type="text/css">
	.divstyle{
		padding-bottom: 15px;
		padding-left: 30px;
	}
	.labelStyle{
		float: left;
		width: 200px;
		text-align: left;
		
	}
</style>
<%@page import="javax.portlet.ActionRequest"%>
<%
	String a = "quay lai";
String typeId=ParamUtil.getString(request, "typeId","0");
	ThemeDisplay themeDisplay_edit= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId7= themeDisplay_edit.getPortletGroupId();
	PortletURL portionNew = renderResponse.createActionURL();
	portionNew.setParameter(ActionRequest.ACTION_NAME, "Type_new");
	
	AdvType vportion = (AdvType)request.getAttribute("AdvTypes");

 if(vportion!=null)
   typeId=String.valueOf(vportion.getTypeId()); 
	String portion_lang = "vi_VN";
	
	String portionid = ((vportion!=null)?(String.valueOf(vportion.getTypeId())):null);
	Locale[] portion_locales = LanguageUtil.getAvailableLocales();
%>
	<form action="<%=portionNew.toString()%>" name="<portlet:namespace/>fm" method="post">
		<input type="hidden" name="<portlet:namespace/>portionid" value="<%=portionid%>"/>
		<input type="hidden" name="<portlet:namespace/>groupId" value="<%=groupId7%>"/>
		
		<div class="divstyle">
			<label class="labelStyle"><liferay-ui:message key="VAdvman"></liferay-ui:message> </label>
			<input type="text" style="width: 500px" name="<portlet:namespace/>name" value='<%= (vportion != null) ? vportion.getName() : "" %>'/>
		</div>
		<div class="divstyle">
			<label class="labelStyle"><liferay-ui:message key="viewTypeDescription"></liferay-ui:message> </label>
			<textarea name="<portlet:namespace />description" id="<portlet:namespace />description" class="lfr-textarea" ><%= (vportion != null) ? vportion.getDescription() : "" %></textarea>
		</div>

	
		<div class="divstyle">
			<input type="submit" value="<%=LanguageUtil.get(pageContext, "save") %>"/>
			<input type="button" value="<%=LanguageUtil.get(pageContext, "cancel") %>" onclick="history.back();"/>
		</div>
	</form>