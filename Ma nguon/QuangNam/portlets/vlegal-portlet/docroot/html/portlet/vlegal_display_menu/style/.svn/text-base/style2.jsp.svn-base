<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%
	PortletURL vlegalContentURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	vlegalContentURL.setParameter("jspPage", "/html/portlet/vlegal_display_menu/view.jsp");	
	vlegalContentURL.setParameter("cmd","viewForward");
	
	PortletURL URL = PortletURLFactoryUtil.create(request,portletSelectId, plId, false);
	URL.setParameter("jspPage","/html/portlet/vlegal_display_content/view.jsp");
	URL.setParameter("cmd","sendTo");
%>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>	
	<td background="/vlegal-portlet/html/portlet/vlegal_display_menu/i_02.gif">
		<table width="100%" cellspacing="0" cellpadding="0" border="0">
		<tr>
			<td><img width="27" height="27" src="/vlegal-portlet/html/portlet/vlegal_display_menu/i_08.gif"></td>
			<td class="title_left">Công v&#259;n n&#7897;i b&#7897;</td>
		</tr>
		</table>	
	</td>
</tr>
	
<tr>
	<td class="menu_left">
    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
       	<tr>
        	<td width="21">
    			<img width="21" height="23" src="/vlegal-portlet/html/portlet/vlegal_display_menu/i_10.gif"/>
    	  	</td>
    	  	<td>
    		 	<a href="<%= vlegalContentURL %>" style="text-decoration :none;">Công v&#259;n &#273;&#7871;n</a>
          	</td>
       	</tr>	
       	</table>	
	</td>
</tr>
	
<tr>
	<td class="menu_left">
    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
       	<tr>
        	<td width="21">
    			<img width="21" height="23" src="/vlegal-portlet/html/portlet/vlegal_display_menu/i_10.gif"/>
    	  	</td>
    	  	<td>
    		 	<a href="/web/guest/congvandi" style="text-decoration :none;">Công v&#259;n &#273;i</a>
          	</td>
       	</tr>	
       	</table>
	</td>
</tr>
</table>