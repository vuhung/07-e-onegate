<%@ page import="com.vportal.util.HtmlExt" %>
<%@ page import="com.liferay.portal.theme.PortletDisplay" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="com.vportal.portlet.vcms.*" %>
<%@ page import="com.vportal.portlet.vcms.model.*" %>
<%@ page import="com.vportal.portlet.vcms.action.*" %>
<%@ page import="com.vportal.portlet.vcms.service.*" %>
<%@ page import="com.vportal.portlet.vcms.service.impl.*" %>
<%@ include file="/html/portlet/vcmsviewcontent/css.jsp"%> 
<liferay-theme:defineObjects />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%
	String printArticleId =  request.getParameter("printArticleId");
	VcmsArticle printArticle = (VcmsArticle)VcmsArticleServiceUtil.getArticle(printArticleId);
%>


<div  style="position: relative; ;z-index: 20;">
	<img width="620" height="90" src="/html/portlet/vcmsviewcontent/images/banner.jpg">	
</div>

<div style="heigth:28px;width:620px;" >	
	<table width="100%">
	<tr>
		<td background="/html/portlet/vdocview/images/nav.jpg">&nbsp;</td>
	</tr>
	</table>
</div>	
	
<div>	
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	 <tr>
	    <td height="8" align="right" style="padding-right:15px;">
			<img src="/html/portlet/vdocview/images/fileprint.gif"><a href="#" onclick="javascript:window.print();" style="font-size: 12px; font-family: Arial;">In bài vi&#7871;t</a>
		</td>	     
    </tr>     
    
	<tr>
		<td align="justify" valign="top">
			<div style="font-family:Arial; padding-left:15x;padding-right:5px;padding-bottom:5px; color:#0260AA; float:left; font-size:12px;font-weight:bold;text-decoration:none;width:99%;">
				<%=printArticle.getTitle()%>
			</div>
			<div style="padding-top:0px;">
				<%
					if(printArticle.getHasImage()){
				%>
				
					<table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
						<tr>
					  		<td valign="top">
					  			<div style="background-color:#FFFFFF;border:1px solid #78A3B9;float:left;margin-right:5px;padding:4px;">
					  				<img src="/image/images?img_id=<%=printArticle.getImage()  %>" width="183" align="absmiddle" />
					  			</div>
					  			<div style="padding: 4px;margin-right:5px; font-size: 12px; font-family: Arial; text-align: justify;"><%=printArticle.getImageTitle() %></div>
					  		</td>
						</tr>
				  	</table>
				<%
					}
				%>
			 	<div align="justify">
			 		<b><span style="color:gray; font-family: Arial; size:10px;"><%=printArticle.getLead()%></span></b>
			 	</div>
			 	<div align="justify">
			 		<%=printArticle.getContent()%>
			 	</div>			 							 	
			</div>
		</td>
	</tr>
	
	</table>
</div>	
	
<div align="center" style="background-color:#f1e6d7; padding: 3px 0px;margin-bottom: 11px;"></div>
<div style="font-size: 13px; font-family: Arial;">
	<strong>C&#7893;ng giao ti&#7871;p &#273;i&#7879;n t&#7917; t&#7881;nh Ph&#250; Th&#7885; - C&#417; quan ch&#7911; qu&#7843;n: UBND T&#7881;nh Ph&#250; Th&#7885; </strong>
         <p class="text_03">S&#7889; gi&#7845;y ph&#233;p: 15/GP-BC, c&#7845;p ng&#224;y: 06/10/2006<br/>
           Ch&#7883;u tr&#225;ch nhi&#7879;m: &#212;ng Phan Quang Thao - Gi&#225;m &#272;&#7889;c S&#7903; TT&TT Ph&#250; Th&#7885;<br/>
           &#272;&#7883;a ch&#7881;: T&#7847;n 3 - Nh&#224; v&#259;n h&#243;a lao &#273;&#7897;ng - &#272;&#7841;i l&#7897; H&#249;ng V&#432;&#417;ng, Ph&#432;&#7901;ng Ti&#234;n C&#225;t, TP. Vi&#7879;t Tr&#236;, Ph&#250; Th&#7885;<br/>
           &#272;i&#7879;n tho&#7841;i: 0210.3812494     Fax: 0210.3811485</p>
</div>
