<%@ include file="/html/portlet/vclipcontent/init.jsp" %>

<c:choose>
	<c:when test=' <%= Validator.isNotNull(request.getParameter("ajax_type")) %>'>
		<%@ include file="/html/portlet/vclipcontent/clip_by_type.jsp"%>
	</c:when>
	<c:when test=' <%= Validator.isNotNull(request.getParameter("ajax")) %> '>
		<%@ include file="/html/portlet/vclipcontent/clip_detail.jsp"%>
	</c:when>	
	<c:when test='<%= displayStyle.equals("2") %>'>
		<%@ include file="/html/portlet/vclipcontent/style/style2.jsp"%>
	</c:when>
	<c:otherwise>
		<%@ include file="/html/portlet/vclipcontent/style/style1.jsp"%>
	</c:otherwise>
</c:choose>