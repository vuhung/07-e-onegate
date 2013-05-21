
<%
	String tabs2Names = "portlet.vlegal.type-tab,portlet.vlegal.field-tab,portlet.vlegal.organization-tab,portlet.vlegal.signer-tab";//,type-tab,field-tab,organization-tab,signer-tab,logger-tab";
	String tabs2Icons = "vlegal/tab_types.gif,vlegal/tab_fields.gif,vlegal/tab_organizations.gif,vlegal/tab_signers.gif";
%>

<liferay-ui:tabs names="<%= tabs2Names %>" param="tabs2" url="<%= portletURL.toString() %>" />
		<c:choose>
	
			<c:when test='<%=tabs2.equals("portlet.vlegal.organization-tab") %>'>
				<%@include file="/html/portlet/vlegal/org_view.jsp" %>
			</c:when>
	
			<c:when test='<%=tabs2.equals("portlet.vlegal.signer-tab") %>'>
				<%@include file="/html/portlet/vlegal/signer_view.jsp" %>
			</c:when>
	
			<c:when test='<%=tabs2.equals("portlet.vlegal.field-tab") %>'>
				<%@include file="/html/portlet/vlegal/field_view.jsp" %>
			</c:when>
				
			<c:otherwise>
				<%@include file="/html/portlet/vlegal/type_view.jsp" %>
			</c:otherwise>
		</c:choose>
