<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@ include file="/init.jsp"%>
<%@page import="com.vportal.portal.util.PortalUtilExt"%>
<%@page import="com.liferay.portal.model.LayoutTypePortlet"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@ page import="com.vportal.portal.util.*"%>
<%@ page import="com.vportal.portal.util.PortalUtilExt"%>
<%@ page import="com.vportal.portlet.vsearch.portletIdException"%>
<%
	String redirect = ParamUtil.getString(request,"redirect");
String cmd = ParamUtil.getString(request,Constants.CMD,Constants.ADD);

long layoutIdSelected = ParamUtil.getLong(request, "layoutIdSelected",0);

String portletSelectId = ParamUtil.getString(request, "portletSelectId","0");

String tgid = ParamUtil.getString(request, "tgid","0");

DateFormat dateFormatDateTime = DateFormats.getDateTime(locale, timeZone);

String language = ParamUtil.getString(request, "language", "vi_VN");

long companyId = PortalUtil.getCompanyId(request);

long groupId = PortalUtilExt.getPortletGroupId(request);

long currentPlid = PortalUtilExt.getPlid(request);
List selectLayouts=LayoutLocalServiceUtil.getLayouts(groupId, false); 
List portletIds=null;
try{
Layout layoutSelected = (Layout)LayoutLocalServiceUtil.getLayout(layoutIdSelected);

LayoutTypePortlet layoutPortlet = (LayoutTypePortlet) layoutSelected.getLayoutType();

portletIds = layoutPortlet.getPortletIds();

}catch(Exception e){
}/* 
PortletURL articleURL = new PortletURLImpl(request ,portletSelectId, layoutIdSelected, PortletRequest.RENDER_PHASE); */
PortletURL articleURL=PortletURLFactoryUtil.create(request, portletSelectId, layoutIdSelected, PortletRequest.RENDER_PHASE);
PortletURL personelURL = renderResponse.createRenderURL();
%>
<%@ include file="/html/vsearch/tabs.jsp"%>
<portlet:actionURL name="processAction" var="processActionURL" />
<liferay-ui:error exception="<%=portletIdException.class%>"
	message="L&#7895;i,B&#7841;n &#273;&#227; c&#7847;u h&#236;nh r&#7891;i!" />
<form method="post" name="<portlet:namespace/>fm"
	action="<%=processActionURL%>">
	<input name="<portlet:namespace /><%=Constants.CMD%>" type="hidden"
		value="<%=cmd%>" /> <input name="<portlet:namespace />strutsaction"
		type="hidden" value="<%=strutsaction%>" /> <input
		name="<portlet:namespace />redirect" type="hidden"
		value="<%=redirect%>" /> <input
		name="<portlet:namespace />layoutIdSelected" type="hidden" value="" />
	<input name="<portlet:namespace />portletId" type="hidden"
		value="<%=portletId%>" />
	<table width="100%" border="0" cellpadding="4" cellspacing="1">
		<tr>
		
			<td width="40%"><img
				src='<%=renderResponse.encodeURL(renderRequest.getContextPath()+"/images/editcopy.png")%>'/> L&#7921;a
				ch&#7885;n Layout Tab <b>ch&#7913;a Portlet Hi&#7875;n th&#7883;
					bài vi&#7871;t</b> :</td>
			<td><select name="<portlet:namespace/>layoutPortletId"
				onchange="javascript:<portlet:namespace/>findPortletLayout();">
					<option value="0">---------</option>
					<%
						if(selectLayouts != null && selectLayouts.size()>0){
								for(int count = 0; count<selectLayouts.size();count++){
									Layout selectLayout = (Layout)selectLayouts.get(count);
									if(selectLayout.isPrivateLayout()==false){
					%>
					<option value="<%=selectLayout.getPlid()%>"
						<%=(selectLayout.getPlid()==layoutIdSelected)?"selected":""%>><%=selectLayout.getHTMLTitle(language)%></option>
					<%
						}
								}
							}
					%>
			</select></td>
		</tr>
		<tr>
			<td width="40%"><img
				src='<%=renderResponse.encodeURL(renderRequest.getContextPath()+"/images/editcopy.png")%>'/> L&#7921;a
				ch&#7885;n <b>Portlet Hi&#7875;n th&#7883; bài vi&#7871;t</b>:</td>
			<td><select name="<portlet:namespace/>portletSelectId">
					<%
						if(portletIds != null && portletIds.size()>0){
									for(int count = 0; count<portletIds.size();count++){
										String portletLayoutId = (String)portletIds.get(count);
										if((portletLayoutId.indexOf("vcmsviewcontent_INSTANCE_")==0)&&(tabs.equals("vcms"))){
					%>
					<option value="<%=portletLayoutId%>"
						<%=(portletLayoutId.equals(portletSelectId))?"selected":""%>><%=portletLayoutId%></option>
					<%
						}else if(tabs.equals("vfaq")&&(portletLayoutId.equals(PortletKeysExt.FAQ_QUESTION))){
					%>
					<option value="<%=portletLayoutId%>"
						<%=(portletLayoutId.equals(portletSelectId))?"selected":""%>><%=portletLayoutId%></option>
					<%
						}else if((portletLayoutId.indexOf("vlegalcontent_INSTANCE_")==0)&&(tabs.equals("vlegal"))){
					%>
					<option value="<%=portletLayoutId%>"
						<%=(portletLayoutId.equals(portletSelectId))?"selected":""%>><%=portletLayoutId%></option>
					<%
						}
								}
							 }
					%>
			</select></td>
		</tr>
		<tr>
			<td><input type="submit"
				value="<liferay-ui:message key="save" />" /></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	function <portlet:namespace/>findPortletLayout(){
		var layoutPlId = document.<portlet:namespace />fm.<portlet:namespace />layoutPortletId.value;
		if(layoutPlId != "0"){
			document.<portlet:namespace />fm.<portlet:namespace />layoutIdSelected.value = layoutPlId;
		
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%=WindowState.MAXIMIZED.toString()%>"><portlet:param name="struts_action" value="/vsearch/editsearch" /><portlet:param name="tabs" value="<%=tabs%>" /></portlet:renderURL>');
		}
	}
	
</script>
