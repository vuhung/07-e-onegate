
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.liferay.portlet.polls.DuplicateVoteException" %>
<%@ page import="com.liferay.portlet.polls.NoSuchChoiceException" %>
<%@ page import="com.liferay.portlet.polls.NoSuchQuestionException" %>
<%@ page import="com.liferay.portlet.polls.QuestionExpiredException" %>
<%@ page import="com.liferay.portlet.polls.model.PollsChoice" %>
<%@ page import="com.liferay.portlet.polls.model.PollsQuestion" %>
<%@ page import="com.liferay.portlet.polls.model.PollsVote" %>
<%@ page import="com.liferay.portlet.polls.service.PollsChoiceLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.polls.service.PollsQuestionLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.polls.service.PollsVoteLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.polls.service.PollsVoteServiceUtil" %>

<%
	PortletPreferences prefs = renderRequest.getPreferences();

	String portletResource = ParamUtil.getString(request, "portletResource");

	if (Validator.isNotNull(portletResource)) {
		prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}

	long questionId = GetterUtil.getLong(prefs.getValue("question-id", StringPool.BLANK));
	String titlePortlet = prefs.getValue("titlePortlet", "Th&#259;m dò d&#432; lu&#7853;n");

	DateFormat dateFormatDateTime = DateFormats.getDateTime(locale, timeZone);
	String styleBorder = prefs.getValue("styleBorder","");
	String styleBullet = prefs.getValue("styleBullet","");
	String styleTitle = prefs.getValue("styleTitle","");
	String styleContent = prefs.getValue("styleContent","");	
	
	String themeType = prefs.getValue("themeType","2");
	String themeSelected = prefs.getValue("themeSelected","");
	boolean isBorder = GetterUtil.getBoolean(prefs.getValue("isBorder",""), false);
	String bgcolor = prefs.getValue("bgcolor","#ffffff");
	
	int paddingLeft = GetterUtil.getInteger(prefs.getValue("paddingLeft",""),4);
	int paddingRight = GetterUtil.getInteger(prefs.getValue("paddingRight",""),4);
%>