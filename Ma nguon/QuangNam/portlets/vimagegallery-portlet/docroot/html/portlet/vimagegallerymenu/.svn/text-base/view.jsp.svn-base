<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@ include file="/html/portlet/vimagegallerymenu/init.jsp"%>
<%@ include file="/html/portlet/vimagegallerymenu/css.jsp"%>
<link href="/html/js/media/css/common.css" rel="stylesheet"
	type="text/css" />

<%
	List listCategory = new ArrayList();
	listCategory = (List) TFCategoryServiceUtil.getByGroupId(groupId);

	// 	
	ViewAction viewaction = new ViewAction();
	PortletURL categoryURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	categoryURL.setParameter("jspPage",
			"/html/portlet/vimagegalleryview/view.jsp");
	categoryURL.setParameter("groupId", String.valueOf(groupId));
%>

<c:choose>
	<c:when test="<%=themeType.equals(\"2\")%>">
		<%@ include file="/html/portlet/vimagegallerymenu/includes/style2.jsp"%>
	</c:when>
	<c:when test="<%=themeType.equals(\"1\")%>">
		<%@ include file="/html/portlet/vimagegallerymenu/includes/style1.jsp"%>
	</c:when>
</c:choose>
