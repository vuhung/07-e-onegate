<%@ include file="/init.jsp" %>


<link href="/html/portlet/edirectoryview/css/common.css" rel="stylesheet" type="text/css" />
<%
	String language = ParamUtil.getString(request, "language", "vi_VN");
	long groupId = ParamUtil.getLong(request, "groupId", portletGroupId.longValue());
	long _parentId = 0;
	
	PortletPreferences prefs = renderRequest.getPreferences();

	String titlePortlet = prefs.getValue("titlePortlet", "Danh b&#7841; &#273;i&#7879;n t&#7917;");
	String themeType = prefs.getValue("themeType","1");
	String themeSelected = prefs.getValue("themeSelected","");
	int numberItem = GetterUtil.getInteger(prefs.getValue("numberItem",""), 10);
	
	boolean showPortletBorders = GetterUtil.getBoolean(prefs.getValue("show-portlet-borders", "true"));	
%>