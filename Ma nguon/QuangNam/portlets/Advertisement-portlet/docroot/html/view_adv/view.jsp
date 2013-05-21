<%@page import="com.liferay.portal.kernel.util.HttpUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.vsi.advertisement.portlet.util.ActionUtil"%>
<%@include file="/html/view_adv/init.jsp" %>
<%@ include file="css.jsp"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>

<%@page import="com.vsi.advertisement.portlet.model.impl.AdvItemImpl"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.model.AdvItem" %>
<%-- <%@page import="com.liferay.portal.kernel.util.PropsUtil" %> --%>
<%-- <%@page import="com.liferay.portal.kernel.util.FileUtil" %> --%>
<%@page import="com.liferay.portal.kernel.util.PropsKeys" %>

<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


<portlet:defineObjects />
<liferay-theme:defineObjects />
<%


	String sItemId = prefs.getValue("itemId", "");
	String height = prefs.getValue("height","0");
	String width = prefs.getValue("width","0");	
	String defaultSize = prefs.getValue("defaultSize","true");
	String autoStart = prefs.getValue("autoStart","true");	
	String controlBar = prefs.getValue("controlBar","none");	
	String titlePortlet = prefs.getValue("titlePortlet","");
	String selectstyleBorder = prefs.getValue("selectstyleBorder","1");
	
	boolean _defaultSize = Boolean.valueOf(defaultSize);
	boolean _autoStart = Boolean.valueOf(autoStart);
		
	int h = Integer.valueOf(height);
	int w = Integer.valueOf(width);

	try{
	AdvItem item = new AdvItemImpl();
	if(Validator.isNotNull(sItemId)) {
		item = AdvItemServiceUtil.getAdvItemById(Long.valueOf(sItemId));
		boolean validImageExtension = false;
		   String[] imageExtensions = {"jpg", "gif","png","bmp"};
		   String extensionFile = ActionUtil.getExtension(item.getName());
		   
		   for (int i = 0; i < imageExtensions.length; i++) {  
			if (extensionFile.equals(imageExtensions[i])) {	
				validImageExtension = true;
				break;
			}
		   }	   
%>		   
<!-- <div align="center"> -->
<c:choose>
	<c:when test='<%= selectstyleBorder.equals("1") %>'>
		<%
 			String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
 			String temp2 = styleBorder;
		%>

<%-- 		<% if(themeType.equals("1")){%> <!-- THEMES DIEN BIEN --> --%>
<%-- 		<%	String style_portlet = styleBullet + " " + styleTitle; %> 	 --%>
<%-- 		<div class="<%=temp1%>">	 --%>
<!-- 			<div class="title"> -->
<!-- 				<div class="title_wrap"> -->
<%-- 				<div><%=titlePortlet%></div> --%>
<!-- 			</div> -->
<!-- 		</div> -->
	
		<div align="center" style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;">		   
			<table width="100%" cellpadding="0" cellspacing="1" border="0">			
			<tr>
				<td>
				<c:if test="<%= validImageExtension%>">
<!-- 					Hien thi voi kich thuoc mac dinh		 -->
				
					<%	if (item.isExpired()){	%>
					<div align="center">
						<b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n hi&#7875;n th&#7883;</b>
					</div>	
					<% } else {%>
					<c:if test="<%= _defaultSize%>">	
						<div align="center">		
							<a href="<%=item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" > <img alt="Anh quang cao chua duoc chon" src="<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(item.getName())) %>"></a>
						</div>
					</c:if>
				
<!-- 					Hien thi voi kich thuoc tuy chon -->
					<c:if test="<%= !_defaultSize%>">
						<div align="center">		
							<a href="<%=item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" > <img alt="Anh quang cao chua duoc chon" src="<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(item.getName())) %>" title="<%= item.getTxtMouseOver()%>" width="<%=w%>" height="<%=h%>" ></a>
						</div>
					</c:if>	
					<%}%>
				</c:if>	
					
				<c:if test="<%= !validImageExtension%>">
						<script type="text/javascript" src="/js/swfobject.js"></script>
						<%	if (item.isExpired()){	%>
						<div align="center">
							<b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n hi&#7875;n th&#7883;</b>
						</div>	
						<% } else {%>	
							
							<object classid="clsid27CDB6E-AE6D-11cf-96B8-444553540000"
								id="<portlet:namespace/>" width="<%= w %>" height="<%= h %>"
								codebase="http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab" >
								<param name="movie" value="<%= request.getContextPath() %>/swf/VisualContract.swf" />
								<param name="quality" value="high" />
								<param name="bgcolor" value="#869ca7" />
								<param name="allowScriptAccess" value="always" />

								<embed src="<%= request.getContextPath()+"/"+ item.getName() %>" quality="high" bgcolor="#869ca7"
									 	name="VisualContract" align="left"	play="true" loop="true"
										quality="high" allowScriptAccess="always" type="application/x-shockwave-flash"
										pluginspage="http://www.adobe.com/go/getflashplayer">
								</embed>
							</object> 

						<%}%>	
<%-- 						<aui:script> --%>
<!-- 							AUI().ready('aui-swf', function(A){ -->
<!--  							var advancedSWF = new A.SWF( -->
<!--  								{ -->
<!--  									boundingBox : '#demo',  -->
<!--  									url:'/Advertisment-portlet/docroot/html/view_adv/bookmark.swf', -->
<!--  									version: 9.115 -->
<!--  								}); -->
<!--  						}); -->
<%-- 						</aui:script> --%>
				</c:if>				
				</td>
			</tr>
			</table>
	  	</div>
<!-- 		</div> -->
<%-- 		<% }%>  --%>
	</c:when>
	
	<c:when test='<%= selectstyleBorder.equals("2") %>'>
		<%@ include file="/html/view_adv/style2.jsp" %>
	</c:when>
	
</c:choose>
<!-- </div> -->

<!-- <table> -->
<!--   <tr> -->

<%--     <td> <a href="<%=item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" > <img alt="Anh quang cao chua duoc chon" src="<%= request.getContextPath()+"/"+ item.getName() %> "></a>   </td> --%>
<!--   </tr> -->
<!-- </table> -->
<%	
	}
	}catch(Exception e){	
		out.println("<b>Ban vui long chon quang cao de hien thi !</b>");
	}
%>
