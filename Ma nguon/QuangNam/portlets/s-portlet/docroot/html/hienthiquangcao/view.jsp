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



<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.portlat.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%-- <%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%> --%>
<%@page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.test.service.AdvItemServiceUtil"%>
<%@page import="com.test.model.AdvItem"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<portlet:defineObjects />
<% 
PortletPreferences prefss = renderRequest.getPreferences();
String itemId = prefss.getValue("itemId", "");
String height = prefss.getValue("height","400");
String width = prefss.getValue("width","300");	
String defaultSize = prefss.getValue("defaultSize","true");
String autoStart = prefss.getValue("autoStart","true");	
String controlBar = prefss.getValue("controlBar","none");	
String titlePortlet = prefss.getValue("titlePortlet","");
String selectstyleBorder = prefss.getValue("selectstyleBorder","1");

boolean _defaultSize = Boolean.valueOf(defaultSize);
boolean _autoStart = Boolean.valueOf(autoStart);

int h = Integer.valueOf(height);
int w = Integer.valueOf(width);
boolean validImageExtension = false;
ThemeDisplay themeDisplay10= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);


try	{
 if(Validator.isNotNull(itemId)){
  
	 AdvItem item = AdvItemServiceUtil.getItem(Long.valueOf(itemId));
   
   String[] imageExtensions = PropsUtil.getArray(PropsKeys.IG_IMAGE_EXTENSIONS);
    //String extensionFile = "."+DLUtil.getFileIcon(item.getName());  
    item.getName();
   String extensionFile="."+DLUtil.getFileExtension(item.getName());
    for (int i = 0; i < imageExtensions.length; i++) {  
 	if (extensionFile.equals(imageExtensions[i])) {
 	 validImageExtension = true;
 	}
   }
    String[] arrParam = StringUtil.split(themeDisplay10.getThemeId(), "_");
	String themesId = arrParam[0];

%>

<div align="center">
<c:choose>
	<c:when test='<%= selectstyleBorder.equals("1") %>'>
	  

      <%@ include file="/html/hienthiquangcao/style1.jsp" %>
	</c:when>
	<c:when test='<%= selectstyleBorder.equals("3") %>'>
		<%@ include file="/html/hienthiquangcao/style3.jsp" %>
	</c:when>
</c:choose>

</div>
<% 
}

	} catch(Exception ex){
		out.println("<b>B&#7841;n vui lòng ch&#7885;n file qu&#7843;ng cáo &#273;&#7875; hi&#7875;n th&#7883; !</b>");
	}
%>

