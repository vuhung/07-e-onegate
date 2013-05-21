<%@ include file="/init.jsp" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.vportal.portal.util.PortletKeysExt" %>

<%
String tabs = ParamUtil.getString(request, "tabs", "vcms");
String strutsaction = ParamUtil.getString(request, "strutsaction", "");
String portletId = ParamUtil.getString(request,"portletId",PortletKeysExt.VCMS);
PortletURL vcmsURL = renderResponse.createRenderURL();
vcmsURL.setWindowState(WindowState.MAXIMIZED);
vcmsURL.setParameter("struts_action","/vsearch/configsearch");
vcmsURL.setParameter("tabs","vcms");
vcmsURL.setParameter("portletId",PortletKeysExt.VCMS);
vcmsURL.setParameter("strutsaction","/vcmsviewcontent/view");
PortletURL vfaqURL = renderResponse.createRenderURL();
vfaqURL.setWindowState(WindowState.MAXIMIZED);
vfaqURL.setParameter("struts_action","/vsearch/configsearch");
vfaqURL.setParameter("tabs","vfaq");
vfaqURL.setParameter("strutsaction","/vfaqcontent/contentview");
vfaqURL.setParameter("portletId",PortletKeysExt.FAQ_QUESTION);
PortletURL vlegalURL = renderResponse.createRenderURL();
vlegalURL.setWindowState(WindowState.MAXIMIZED);
vlegalURL.setParameter("struts_action","/vsearch/configsearch");
vlegalURL.setParameter("tabs","vlegal");
vlegalURL.setParameter("strutsaction","/vlegalcontent/view");
vlegalURL.setParameter("portletId",PortletKeysExt.VLEGAL);
%>
<liferay-ui:tabs names="vcms,vfaq,vlegal" url0="<%= vcmsURL.toString() %>"	url1="<%= vfaqURL.toString() %>"	url2="<%= vlegalURL.toString() %>" param="tabs"/>     