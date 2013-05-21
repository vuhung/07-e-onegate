<%@ page import="com.liferay.portal.theme.PortletDisplay" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="com.vportal.portlet.vlegal.*" %>
<%@ page import="com.vportal.portlet.vlegal.model.*" %>
<%@ page import="com.vportal.portlet.vlegal.action.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.impl.*" %>
	
<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>
<%@ include file="/html/portlet/vlegal_display_content/css.jsp"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/faces" prefix="liferay-faces" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>
	
<%
	String printDocId = request.getParameter("printDocId");	
	VLegalDocument printDoc = (VLegalDocument)VLegalDocumentServiceUtil.getDocument(printDocId);
%>

<table width="100%" border="0" class="container" cellpadding="4" cellspacing="1">
<tr>
    <td align="center" valign="top"><img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/banner.jpg" width="600"/></td>
</tr>	

<tr>
	<td>
		<div id="hr_banner">
			<div id="hr_image">
				<img width="1" height="1" src="/vlegal-portlet/html/portlet/vlegal_display_content/images/0.jpg">
			</div>
		</div>
	</td>
</tr>

<tr>
	<td>&nbsp;</td>
</tr>		
	
<tr>
    <td align="right" valign="top" ><img src="/vlegal-portlet/html/portlet/images/fileprint.png"> <a href="#" onclick="javascript:window.print();">In v&#259;n b&#7843;n</a></td>
</tr>
	
<tr>
	<td valign="top"><%= printDoc.getContent()%></td>
</tr>
<tr>
	<td>
		<div id="above_footer">&nbsp;</div>
		<div id="footer">
		<table width="100%">
		<tr>
			<td height="70" background="/html/portlet/vlegal_display_content/i_04.gif">
				<div class="text_none" align="center" style="font-size:11px;">
					<b>C&#7892;NG TH&Ocirc;NG TIN &#272;I&#7878;N T&#7916; T&#7880;NH &#272;I&#7878;N BI&Ecirc;N</b><br />
&#272;&#7883;a ch&#7881;: Ph&#432;&#7901;ng M&#432;&#7901;ng Thanh, Th&agrave;nh ph&#7889; &#272;i&#7879;n Bi&ecirc;n Ph&#7911;, T&#7881;nh &#272;i&#7879;n Bi&ecirc;n<br />
Email: portal@dienbien.gov.vn    &#272;i&#7879;n tho&#7841;i: 0230.3827726 - 0230.3827319<br />
Tr&#432;&#7903;ng Ban Bi&ecirc;n t&#7853;p: L&ecirc; Th&agrave;nh &#272;&ocirc; - Ch&aacute;nh V&#259;n ph&ograve;ng UBND t&#7881;nh<br />
Ghi r&otilde; ngu&#7891;n C&#7893;ng Th&ocirc;ng tin &#273;i&#7879;n t&#7917; t&#7881;nh &#272;i&#7879;n Bi&ecirc;n (www.dienbien.gov.vn) khi tr&iacute;ch d&#7851;n tin t&#7915; &#273;&#7883;a ch&#7881; n&agrave;y.<br/>

				</div>			
			</td>
		</tr>
		</table>
		</div>
	</td>
</tr>
</table>



