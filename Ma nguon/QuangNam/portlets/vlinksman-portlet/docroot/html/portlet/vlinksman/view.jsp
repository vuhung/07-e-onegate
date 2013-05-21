<%@include file="/html/portlet/vlinksman/init.jsp"%>

<%
	String tabs1 = ParamUtil.getString(request, "tabs1",
			"VLinksman.title.link");
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("jspPage", "/html/portlet/vlinksman/view.jsp");

	String tabsNames = "VLinksman.title.link,VLinksman.title.linkgroup";

	// 	tabsNames = "VAdvman.title.item";	
	//boolean showTabItem = showTabs && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeysExt.VADVMAN , ActionKeysExt.VIEW_ITEM_TAB);
	//boolean showTabType = showTabs && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeysExt.VADVMAN, ActionKeysExt.VIEW_TYPE_TAB);	

	//if (showTabType){
	//	tabsNames += ",VAdvman.title.type";
	//}
%>

<form action="<%=portletURL.toString()%>" method="post"
	name="<portlet:namespace />fm">
	<liferay-ui:tabs names="<%=tabsNames%>"
		url="<%=portletURL.toString()%>" />
	<c:choose>
		<c:when
			test='<%=tabs1
							.equalsIgnoreCase("VLinksman.title.linkgroup")%>'>
						<%@ include file="/html/portlet/vlinksman/linkgroup/view_linkgroup.jsp"%>
		</c:when>
		<c:otherwise>
				   		<%@ include file="/html/portlet/vlinksman/link/view_link.jsp" %>
		</c:otherwise>
	</c:choose>

</form>