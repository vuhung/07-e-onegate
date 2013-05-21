
<%@ include file="/html/portlet/vsitemap/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%
    String tabs1 = ParamUtil.getString(request, "tabs1", "portletSitemap.title.branch");

	PortletURL mainURL = renderResponse.createRenderURL();
	mainURL.setWindowState(WindowState.MAXIMIZED);
	mainURL.setParameter("jspPage", "/vsitemap/view");
	mainURL.setParameter("tabs1", tabs1);
	PortletURL redirectURL = mainURL;
%>
<script type="text/javascript">
function <portlet:namespace />updateBranchPosition(selector) {
		document.<portlet:namespace />fm.<portlet:namespace />position.value = selector.value;
		document.<portlet:namespace />fm.<portlet:namespace />cmd.value = 'update_position';
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/vsitemap/edit_branch.jsp" /></portlet:actionURL>');
	}
</script>
<div class="content_border">
<br />	
<form method="post" name="<portlet:namespace />fm" enctype="multipart/form-data">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirectURL.toString() %>">
<jsp:include page="/html/portlet/vsitemap/view_branch.jsp"></jsp:include>
</form>
</div>