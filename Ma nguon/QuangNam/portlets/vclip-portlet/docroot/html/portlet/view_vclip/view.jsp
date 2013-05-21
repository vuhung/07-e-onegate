<%@ include file="/html/portlet/view_vclip/init.jsp"%>
<%
	String displayStyle = prefs.getValue("displayStyleExt","1");

%><form>
	<c:if test= '<%= (displayStyle.equals("1")) %>' >
		<%@ include file="/html/portlet/view_vclip/style/style1.jsp" %>		
	</c:if>
	<c:if test= '<%= (displayStyle.equals("2")) %>' >
		<%@ include file="/html/portlet/view_vclip/style/style2.jsp" %>
	</c:if>
</form>