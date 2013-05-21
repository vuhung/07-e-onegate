<%@ include file="/init.jsp" %>
<%
	PortletPreferences prefs = renderRequest.getPreferences();

	String portletResource = ParamUtil.getString(request, "portletResource");

	if (Validator.isNotNull(portletResource)) {
		prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}
 	
 	long groupId = ParamUtil.getLong(request, "groupId",0);
	if(groupId == 0){
		groupId = portletGroupId.longValue();
	}
%>