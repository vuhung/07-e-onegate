<%@ include file="/html/portlet/vcmsview/init.jsp"%>
	
<%
String categoryId = ParamUtil.getString(request, ConstantsExt.CATEGORY_ID);
String articleId = ParamUtil.getString(request, ConstantsExt.ARTICLE_ID);
%>

<% if (Validator.isNotNull(articleId)) { %>
	<%@ include file="/html/portlet/vcmsview/article_view.jsp" %>
<% } else if (Validator.isNotNull(articleId) && Validator.isNotNull(categoryId)) { %>
	<%@ include file="/html/portlet/vcmsview/category_view.jsp" %>
<% } else {%>
	<%@ include file="/html/portlet/vcmsview/overall_view.jsp" %>
<% } %>