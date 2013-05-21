<%@ include file="/html/portlet/init.jsp" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.model.Layout"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>
<%@ page import="java.util.*" %>
<%@page import="com.vportal.portal.attachment.AttachmentManager"%>
<%@page import="com.vportal.portal.model.Attachment"%>	
<%@page import="com.liferay.portlet.documentlibrary.model.*"%>
<%@page import="com.liferay.portlet.documentlibrary.service.*"%>
<%@page import="com.liferay.documentlibrary.NoSuchFileException"%>
<%@page import="com.liferay.portlet.documentlibrary.NoSuchFileEntryException"%>
<%@page import="com.vportal.portal.service.PortletFolderLocalServiceUtil"%>

<%
		//long groupId = layout.getGroupId();
long groupId = ParamUtil.getLong(request, "groupId",0);
if(groupId == 0){
	groupId = portletGroupId.longValue();
}
%>
