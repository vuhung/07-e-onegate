<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.vportal.portal.util.PortalUtilExt"%>
<%@page import="javax.portlet.filter.RenderRequestWrapper"%>
<%@ page import="com.vportal.portal.util.PropsUtilExt" %>
<%@ include file="/init.jsp"%>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>	
<%@ page import="com.vsi.edirectory.portlet.util.LayoutPortletUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@ page import="javax.portlet.PortletMode" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<% 		long currentPlId1 = themeDisplay.getPlid();

// get current portlet layout (lay layout hien tai)
	Layout currentLayout = LayoutLocalServiceUtil.getLayout(currentPlId1);
	PortletPreferences prefs = renderRequest.getPreferences();
	String portletSelectId = prefs.getValue("portletSelectId", "contentedirectory_WAR_EDirectoryportlet");
	String selectPortletLayout = prefs.getValue("selectPortletLayout","");
	String layoutPortletId = prefs.getValue("layoutPortletId","");
	String portletIds = prefs.getValue("portletIds","");
	List selectLayouts = (List)request.getAttribute("SELECT_LAYOUTS");
	String language = ParamUtil.getString(request, "language", "vi_VN");
	String url = prefs.getValue("url","");
	long currentPlid = PortalUtilExt.getPlid(request);

	long plId = ParamUtil.getLong(request, "PLID_LAYOUT",currentPlId1);
	if (plId==0){
		plId=currentPlId1;
	}
	long groupId = ParamUtil.getLong(request, "groupId",0);
	if(groupId == 0){
		groupId = portletGroupId.longValue();
	}
	
	String titlePortlet = prefs.getValue("titlePortlet","Danh b&#7841; &#273;i&#7879;n t&#7917;");
	try{
		if(Validator.isNotNull(selectPortletLayout) && selectPortletLayout.equals("1")){
			//Automatically find layout & portlet id
			
			Layout firstLayout = (Layout)selectLayouts.get(0);
			long firstLayoutId = firstLayout.getPlid();
			String firstPortletId = LayoutPortletUtil.getPortletIdsByLayout(firstLayoutId).get(0).toString();
			
			plId = PortalUtilExt.getPlid(groupId, currentPlid, firstPortletId);
			
			portletSelectId = firstPortletId;
			
		}else{
		
			plId = PortalUtilExt.getPlid(groupId, currentPlid, portletSelectId);
		}
	}catch(Exception ex){
		System.out.println(ex.toString());
	}
%>
<%

WindowState windowState = null;
PortletMode portletMode = null;

PortletURL currentURLObj = null;

if (renderRequest != null) {
	windowState = renderRequest.getWindowState();
	portletMode = renderRequest.getPortletMode();

	currentURLObj = PortletURLUtil.getCurrent(renderRequest, renderResponse);
}
else if (resourceRequest != null) {
	windowState = resourceRequest.getWindowState();
	portletMode = resourceRequest.getPortletMode();
	
	//currentURLObj = PortletURLUtil.getCurrent(resourceRequest, resourceResponse);
}


//String currentURL = currentURLObj.toString();
String currentURL = PortalUtil.getCurrentURL(request);

%>