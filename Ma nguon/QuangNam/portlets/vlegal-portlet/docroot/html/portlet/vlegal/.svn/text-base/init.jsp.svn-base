<!-- 
*@author: Nguyen Tien Toi
*@since: 2012
*@school: Ha Noi Open University (HOU)
 -->
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.CompanyLocalServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.util.PrefsPropsUtil"%>
<%@page import="com.vportal.portlet.vlegal.action.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.CalendarUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.DateFormats"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.vportal.portlet.vlegal.util.PropsUtilExt"%>
<%@page import="java.util.prefs.PreferenceChangeEvent"%>
<%@page import="java.util.prefs.Preferences"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.vportal.portlet.vlegal.util.permission.ActionKeysExt"%>
<%@page import="com.vportal.portlet.vlegal.util.PortletKeysExt"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.service.permission.PortletPermission"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.language.Language"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.vportal.portlet.vlegal.util.VLegalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDFRel"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="com.liferay.portlet.blogs.model.BlogsEntry"%>
<%@page import="com.liferay.portal.kernel.bean.BeanParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.vportal.portlet.vlegal.util.WebkeysExt"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDocument"%>
<%@page import="com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalField"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactory"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.util.List"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalSigner"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.impl.VLegalOrgImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.persistence.VLegalOrgUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalOrg"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>

<%@taglib uri="http://www.vietsoftware.com/tld" prefix="vportal" %>
<%@include file="/html/portlet/init.jsp" %>

<portlet:defineObjects />
<liferay-theme:defineObjects/>

<%
	PortletPreferences prefs = renderRequest.getPreferences();

	String portletResource = ParamUtil.getString(request, "portletResource");

	if (Validator.isNotNull(portletResource)) {
		prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}

	String language = ParamUtil.getString(request, "language", "vi_VN");
	
	long groupId = themeDisplay.getScopeGroupId();
	
// 	long groupId = ParamUtil.getLong(request, "groupId", portletGroupId.longValue());
// 	String domain = "liferay.com";
// 	Company company = CompanyLocalServiceUtil.getCompanyByWebId(domain);
// 	long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

	String tabs1 = ParamUtil.getString(request, "tabs1");
	String tabs2 = ParamUtil.getString(request, "tabs2");
	String tabs3 = ParamUtil.getString(request, "tabs3");

	DateFormat dateFormatDateTime = DateFormats.getDateTime(locale, timeZone);
	Locale[] locales = LanguageUtil.getAvailableLocales();

	String monthParam = request.getParameter("month");
	String dayParam = request.getParameter("day");
	String yearParam = request.getParameter("year");

	Calendar selCal = CalendarFactoryUtil.getCalendar(timeZone, locale);

	try {
		selCal.set(Calendar.YEAR, Integer.parseInt(yearParam));
	}
	catch (NumberFormatException nfe) {
	}

	try {
		if (dayParam != null) {
			selCal.set(Calendar.DATE, 1);
		}

		selCal.set(Calendar.MONTH, Integer.parseInt(monthParam));
	}
	catch (NumberFormatException nfe) {
	}

	try {
		int maxDayOfMonth = selCal.getActualMaximum(Calendar.DATE);

		int dayParamInt = Integer.parseInt(dayParam);

		if (dayParamInt > maxDayOfMonth) {
			dayParamInt = maxDayOfMonth;
		}

		selCal.set(Calendar.DATE, dayParamInt);
	}catch (NumberFormatException nfe) { }
	

	int selMonth = selCal.get(Calendar.MONTH);
	int selDay = selCal.get(Calendar.DATE);
	int selYear = selCal.get(Calendar.YEAR);

	Calendar curCal = CalendarFactoryUtil.getCalendar(timeZone, locale);

	int curMonth = curCal.get(Calendar.MONTH);
	int curDay = curCal.get(Calendar.DATE);
	int curYear = curCal.get(Calendar.YEAR);

	int[] monthIds = CalendarUtil.getMonthIds();
	String[] months = CalendarUtil.getMonths(locale);
	String[] days = CalendarUtil.getDays(locale);

	long companyId = PortalUtil.getCompanyId(request);
	long userId = themeDisplay.getUserId();

	String titlePortlet = "H&#7879; th&#7889;ng qu&#7843;n lý v&#259;n b&#7843;n pháp quy";
	
	String parentId = ParamUtil.get(request, "parentId", StringPool.BLANK);

	if (Validator.isNull(parentId))
		parentId = ActionUtil.DEFAULT_DEPARTMENT_ID;
%>

<%
	int styleDisplay = GetterUtil.getInteger(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_STYLE,""), 1);
	
	int totalItemSuggestionPerPage = GetterUtil.getInteger(prefs.getValue(PropsUtilExt.VLEGAL_SUGGESTION_TOTALITEM_PERPAGE, ""), 20);
	
	int totalItemDocumentPerPage = GetterUtil.getInteger(prefs.getValue(PropsUtilExt.VLEGAL_DOCUMENT_TOTALITEM_PERPAGE, ""), 10);	
	
	int totalItemDraftPerPage = GetterUtil.getInteger(prefs.getValue( PropsUtilExt.VLEGAL_DRAFT_TOTALITEM_PERPAGE, "20"), 20);
	
	int maxAttachmentDocument = GetterUtil.getInteger(prefs.getValue(PropsUtilExt.VLEGAL_DOCUMENT_MAX_ATTACHMENT, ""), 5);
	
	int maxAttachmentDraft = GetterUtil.getInteger(prefs.getValue(PropsUtilExt.VLEGAL_DRAFT_MAX_ATTACHMENT, ""), 5);	
	
	int maxAttachmentSuggestion = GetterUtil.getInteger(prefs.getValue(PropsUtilExt.VLEGAL_SUGGESTION_MAX_ATTACHMENT, ""), 5);
	
 	boolean approveDoc = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_DOCUMENT, ""), true);
	
 	boolean approveDraft = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_DRAFT,""), true);
	
	boolean approveSuggest = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_APPROVE_SUGGESTION,""), true);	

	boolean cancel_approveDoc = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_CANCEL_APPROVE_DOCUMENT,""), true);
	
	boolean cancel_approveDraft = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_CANCEL_APPROVE_DRAFT,""), true);
	
	boolean publishDoc = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_PUBLISH_DOCUMENT,""), true);
	
	boolean publishDraft = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_BUTTON_PUBLISH_DRAFT,""), true);
	
	boolean quickAction = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_DISPLAY_QUICK_ACTION,""), true);

	boolean forwardDoc = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_FUNCTION_FORWARED_DOCUMENT, ""), true);

	boolean manageDraftSuggestion = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_FUNCTION_MANAGE_DRAFT_SUGGESTION, ""), false);	

	String statisticsStyle = prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_STATISTICS_STYLE,"1");
		
	boolean viewLog = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_LOG, ""), true);

	boolean viewGeneral = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_VIEW_GENERAL, ""), true);

	boolean searchDoc = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH, ""), true);	

 	boolean searchDocByPromul = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_PROMUL_DATE, ""), true);

// 	boolean searchDocByEffective = VLegalUtil.getBooleanPrefsPropsUtil(companyId,PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EFFECTIVE_DATE, false );
	boolean searchDocByEffective = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EFFECTIVE_DATE, ""), false);

// 	boolean searchDocByExpired = VLegalUtil.getBooleanPrefsPropsUtil(companyId,PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EXPIRED_DATE, false );
	boolean searchDocByExpired = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_DOCUMENT_SEARCH_BY_EXPIRED_DATE, ""), false);

// 	boolean autoDraftSendMail = VLegalUtil.getBooleanPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_DRAFT_AUTO_SEND_MAIL);
	boolean autoDraftSendMail = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_DRAFT_AUTO_SEND_MAIL, ""));

// 	String customTitle = VLegalUtil.getPrefsPropsUtil(companyId,PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TITLE,titlePortlet);
	String customTitle = prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TITLE, titlePortlet);	

//  	String customTab = VLegalUtil.getPrefsPropsUtil(companyId,PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TAB,"");
	String customTab = prefs.getValue(PropsUtilExt.VLEGAL_PORTLET_CUSTOMIZATION_TAB, "");	

// 	String emailAddressDraft = VLegalUtil.getPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_DRAFT_EMAIL_ADDRESS);
	String emailAddressDraft = prefs.getValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_ADDRESS, "");	

// 	String autoNotificationDraftEmailSubject = VLegalUtil.getPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_DRAFT_EMAIL_SUBJECT);
	String autoNotificationDraftEmailSubject = prefs.getValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_SUBJECT, "");	

// 	String autoNotificationDraftEmailEditor = VLegalUtil.getPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_DRAFT_EMAIL_CONTENT);		
	String autoNotificationDraftEmailEditor = prefs.getValue(PropsUtilExt.VLEGAL_DRAFT_EMAIL_CONTENT, "");	

// 	String emailAddressSender = VLegalUtil.getPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_SUGGESTION_SENDER_MAIL);	
	String emailAddressSender = prefs.getValue(PropsUtilExt.VLEGAL_SUGGESTION_SENDER_MAIL, "");

//  	boolean autoSuggestionSendMail = VLegalUtil.getBooleanPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_SUGGESTION_AUTO_SEND_MAIL);
	boolean autoSuggestionSendMail = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_SUGGESTION_AUTO_SEND_MAIL, ""));	

// 	String autoSuggestionEmailSubject = VLegalUtil.getPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_SUBJECT);
	String autoSuggestionEmailSubject = prefs.getValue(PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_SUBJECT, "");
	
// 	String autoSuggestionEmailContent = VLegalUtil.getPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_CONTENT);
	String autoSuggestionEmailContent = prefs.getValue(PropsUtilExt.VLEGAL_SUGGESTION_EMAIL_CONTENT, "");
	
//  	boolean autoClearLogging = VLegalUtil.getBooleanPrefsPropsUtil(companyId, PropsUtilExt.VLEGAL_LOGGING_AUTO_CLEAR);
 	boolean autoClearLogging = GetterUtil.getBoolean(prefs.getValue(PropsUtilExt.VLEGAL_LOGGING_AUTO_CLEAR, ""));
	
// 	String emailFromName = ParamUtil.getString(request, "emailFromName", PrefsPropsUtil.getString(company.getCompanyId(), PropsKeys.ADMIN_EMAIL_FROM_NAME));
	String emailFromName = prefs.getValue(PropsKeys.ADMIN_EMAIL_FROM_NAME, "");
	
// 	String emailFromAddress = ParamUtil.getString(request, "emailFromAddress", PrefsPropsUtil.getString(company.getCompanyId(), PropsKeys.ADMIN_EMAIL_FROM_ADDRESS));
	String emailFromAddress = prefs.getValue(PropsKeys.ADMIN_EMAIL_FROM_ADDRESS, "");
	
	boolean showButtons = false;

	if (portletConfig.getPortletName().equals(PortletKeysExt.VLEGAL)) {
		showButtons = true;
	}

	
%>


<script language="javascript">
	var dtCh = "/";
	var minYear=1900;
	var maxYear=2100;

	function isInteger(s){
		var i;
	    for (i = 0; i < s.length; i++){   
	        var c = s.charAt(i);
	        if (((c < "0") || (c > "9"))) return false;
	    }
	    return true;
	}

	function stripCharsInBag(s, bag){
		var i;
	    var returnString = "";
	    // Search through string's characters one by one.
	    // If character is not in bag, append to returnString.
	    for (i = 0; i < s.length; i++){   
	        var c = s.charAt(i);
	        if (bag.indexOf(c) == -1) returnString += c;
	    }
	    return returnString;
	}

	function daysInFebruary (year){
	    return (((year % 4 == 0) && ( (!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28 );
	}
	function DaysArray(n) {
		for (var i = 1; i <= n; i++) {
			this[i] = 31
			if (i==4 || i==6 || i==9 || i==11) {this[i] = 30}
			if (i==2) {this[i] = 29}
	   } 
	   return this
	}
	
	function isDate(dtStr){
		var daysInMonth = DaysArray(12)
		var pos1=dtStr.indexOf(dtCh)
		var pos2=dtStr.indexOf(dtCh,pos1+1)
		var strDay=dtStr.substring(0,pos1)
		var strMonth=dtStr.substring(pos1+1,pos2)
		var strYear=dtStr.substring(pos2+1)
		strYr=strYear
		if (strDay.charAt(0)=="0" && strDay.length>1) strDay=strDay.substring(1)
		if (strMonth.charAt(0)=="0" && strMonth.length>1) strMonth=strMonth.substring(1)
		for (var i = 1; i <= 3; i++) {
			if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
		}
		month=parseInt(strMonth)
		day=parseInt(strDay)
		year=parseInt(strYr)
		
		if (pos1==-1 || pos2==-1){
			alert("<%= LanguageUtil.get(pageContext, "pEdir.form.dateFormat") %> : dd/mm/yyyy")
			return false
		}
		if (strMonth.length<1 || month<1 || month>12){
			alert("<%= LanguageUtil.get(pageContext, "pEdir.form.enterValidMonth") %>")
			return false
		}
		if (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){
			alert("<%= LanguageUtil.get(pageContext, "pEdir.form.enterValidDay") %>")
			return false
		}
		if (strYear.length != 4 || year==0 || year<minYear || year>maxYear){
			alert("<%= LanguageUtil.get(pageContext, "pEdir.form.enterValidYear") %> "+minYear+" <%= LanguageUtil.get(pageContext, "pEdir.form.and") %> "+maxYear)
			return false
		}
		if (dtStr.indexOf(dtCh,pos2+1)!=-1 || isInteger(stripCharsInBag(dtStr, dtCh))==false){
			alert("<%= LanguageUtil.get(pageContext, "pEdir.form.enterValidDate") %>")
			return false
		}
		return  new Date(strYear, strMonth-1, strDay);
	}

	function showErrorField(field) {
		field.style.border="2px solid red";
		field.focus();
	}
	function resetField(field) {
		field.style.border="1px solid #CCC";
	}
	
	function clearField(field){
		field.value = "";
	}
</script>