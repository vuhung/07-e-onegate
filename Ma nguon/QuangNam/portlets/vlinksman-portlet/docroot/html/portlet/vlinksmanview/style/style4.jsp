<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.HttpUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
	String temp2 = styleBorder;
	
	List listLinks = new ArrayList();
%>

<style type="text/css">
	a {
				text-decoration: none;
				color:#000;
	}
	a:hover{
				color:#039;
	}
	.tr_style1{
		line-height: 30px;
	}
	.td_style1{
		padding-left: 10px;
	}
	.imglk
	{
		float: left;
	}
	.ndlk{
		float: left;
		padding-left: 10px;
	}
</style>

<table style="width: 100%; background-color: #edecec;">
     <tr>
     	<%	for(int i=0;i<linkGroupIds.length;i++){
			LinkGroup linkGroup = LinkGroupServiceUtil.getLinkGroup(Long.parseLong(linkGroupIds[i]));
			listLinks = LinksServiceUtil.getByLinkG_GL(groupId, linkGroup.getLinkgroupId());
						
			%>
        <td style="width: 30%; height:211px; background-color: white; margin:10px 0px 10px 15px; float: left;" >
        	<div style="padding-top: 10px;">
            <table>
            <%	for(int j=0;j<listLinks.size();j++){
							Links link = (Links)listLinks.get(j);	%>
                   <tr class="tr_style1"><td class="td_style1">
                   		<div class="imglk">
                   			<img src= "<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + link.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(link.getImageName())) %>"/>
<%--                    			<% System.out.print(themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + link.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(link.getImageName()))); %> --%>
                   		</div>
	                   <div class="ndlk">
	                   		<a href="<%=link.getUrl()%>" target="<%= (link.getIsTargetBlank())? "_blank":"_self"%>"><%=link.getName()%></a>
	                   </div>	                   
	                   </td>
                   </tr>
              <%}%>
                   
            </table>
            </div>
       </td>
              
            <%}%>  
    </tr>                        	
</table>




