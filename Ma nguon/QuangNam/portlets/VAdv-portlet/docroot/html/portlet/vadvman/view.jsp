<%@include file="/html/portlet/vadvman/init.jsp"%>
<%	
    String tabs1 = ParamUtil.getString(request, "tabs1", "VImageGallery.title.image");
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("jspPage", "/html/portlet/vadvman/view.jsp");
	portletURL.setParameter("tabs1", tabs1);	
			
	String tabsNames = "";
	
	tabsNames = "VAdvman.title.item";	
	boolean showTabItem = showTabs && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeysExt.VADVMAN , ActionKeysExt.VIEW_ITEM_TAB);
	boolean showTabType = showTabs && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeysExt.VADVMAN, ActionKeysExt.VIEW_TYPE_TAB);	
	if (showTabType){
		tabsNames += ",VAdvman.title.type";
	}	
%>

<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm">
<liferay-ui:tabs names="<%= tabsNames %>"
			url="<%= portletURL.toString() %>" />
	<c:choose>
		<c:when test="<%=tabs1.equalsIgnoreCase(\"VAdvman.title.type\")%>">
			<%@ include file="/html/portlet/vadvman/vadvtype/view_type.jspf" %>	
		</c:when>
		<c:otherwise>
	   		<%@ include file="/html/portlet/vadvman/vadvitem/view_item.jspf" %>
		</c:otherwise>
	</c:choose>
			
</form>