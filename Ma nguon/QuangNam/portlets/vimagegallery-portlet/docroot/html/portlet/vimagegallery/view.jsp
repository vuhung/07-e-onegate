<%@ include file="/html/portlet/vimagegallery/init.jsp" %>

<%	
    String tabs1 = ParamUtil.getString(request, "tabs1", "VImageGallery.title.image");
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("jspPage", "/html/portlet/vimagegallery/view.jsp");
	portletURL.setParameter("tabs1", tabs1);	
			
	String tabsNames = "";
	String tabsIcons = "";

	tabsNames = "VImageGallery.title.image";
	tabsIcons = "vimagegallery/tab-image.png";
		
	boolean showTabImage = showTabs && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeyExt.VIMAGEGALLERY, ActionKeysExt.VIEW_IMAGE_TAB);
	boolean showTabCategory = showTabs && PortletPermissionUtil.contains(permissionChecker , plid.longValue() , PortletKeyExt.VIMAGEGALLERY, ActionKeysExt.VIEW_CATEGORY_TAB);	

	
	//Check Permission to view Tabs
	if(showTabCategory){
		tabsNames += ",VImageGallery.title.category";
		tabsIcons += ",vimagegallery/tab-categories.gif";
	}
		
%>
	
<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm">
	
<liferay-ui:tabs names="<%= tabsNames %>" url="<%= portletURL.toString() %>" />
	<c:choose>
		<c:when test="<%=tabs1.equalsIgnoreCase(\"VImageGallery.title.category\")%>">
			<%@ include file="/html/portlet/vimagegallery/category/view_category.jsp" %>	
		</c:when>
	
		<c:otherwise>
	   		<%@ include file="/html/portlet/vimagegallery/image/view_image.jsp" %>
		</c:otherwise>	
	</c:choose>
			
</form>