<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.HttpUtil"%>
<c:if test="<%= validImageExtension%>">
	<%	if (item.getExpriedDate()!=null && item.getExpriedDate().before(new Date())){	%>
		<div align="center">
			<b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n hi&#7875;n th&#7883;</b>
		</div>	
	<% } else {%>
		<a href="<%=item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" title="<%= item.getTxtMouseOver()%>" style="font-weight: bold;color: #06c;display: block;font-size: 14px; text-decoration: none; background: url(<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(item.getName())) %>) no-repeat 5px 7px; padding: 7px 5px 7px 46px; text-transform: uppercase;">
			<span style="line-height: 26px;"><%= item.getDescription() %></span>
		</a>
	<%}%>
</c:if>