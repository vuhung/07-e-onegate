
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.vportal.portlet.vlegal.util.VLegalUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalOrg"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDocument"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalField"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/faces" prefix="liferay-faces" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@include file="/html/portlet/vlegal_display_content/css.jsp" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>

<%
	String redirect = StringPool.BLANK;
	String cmd = ParamUtil.getString(request, "cmd",StringPool.BLANK);	
	String organizationId =  ParamUtil.getString(request, "organizationid", StringPool.BLANK);
	String typeDocId =  ParamUtil.getString(request, "typedocid", StringPool.BLANK);
	
	//Search Parameter 
	String _fieldId =  ParamUtil.getString(request, "fieldId", StringPool.BLANK);	
	String keywords = ParamUtil.getString(request, "summary", StringPool.BLANK);
	String _proYear = ParamUtil.getString(request, "pyear", "0");
	
	String num = ParamUtil.getString(request, "number", StringPool.BLANK);
	String symbol = ParamUtil.getString(request, "symbol", StringPool.BLANK);
	
	String pager = ParamUtil.getString(request, "numPager", StringPool.BLANK);
	
	PortletURL portletURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
// 	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/document_view.jsp");
	portletURL.setParameter("language", language);
	portletURL.setParameter("groupId", String.valueOf(groupId));
	
	PortletURL portletURL1 = renderResponse.createRenderURL();
	portletURL1.setParameter("jspPage", "/html/portlet/vlegal_display_content/document_view.jsp");
	portletURL1.setParameter("language", language);
	portletURL1.setParameter("groupId", String.valueOf(groupId));
	
	// url link to View Advanced
	//TIM KIEM NANG CAO. BAN 6.0 KO DUNG
	PortletURL url = renderResponse.createRenderURL();
	url.setWindowState(WindowState.NORMAL);
	url.setParameter("jspPage","/html/portlet/vlegal_display_content/view_advanced.jsp");
	url.setParameter("language",language);
	url.setParameter("groupId",String.valueOf(groupId));
	
	// portletURL search Basic
	PortletURL searchURL = renderResponse.createRenderURL();
	searchURL.setParameter("jspPage","/html/portlet/vlegal_display_content/view.jsp");
	searchURL.setParameter("language",language);
	searchURL.setParameter("groupId",String.valueOf(groupId));
	searchURL.setParameter("cmd","searchBasic");
	
	PortletURL numPageURL = renderResponse.createRenderURL();
	numPageURL.setParameter("jspPage","/html/portlet/vlegal_display_content/view.jsp");
	numPageURL.setParameter("language",language);
	numPageURL.setParameter("groupId",String.valueOf(groupId));
	numPageURL.setParameter("cmd","searchBasic");
	
	String typeId = ParamUtil.getString(request, "typeid", StringPool.BLANK);
	String orgId = ParamUtil.getString(request, "orgid", StringPool.BLANK);
	String sigId = ParamUtil.getString(request, "sigid", StringPool.BLANK);
	
	List fields = new ArrayList();
	List listItem = null;
	VLegalOrg currentOrg = null;
	VLegalType currentType = null;

	if(Validator.isNotNull(typeDocId)) {
		try {
			currentType = (VLegalType)VLegalTypeServiceUtil.getType(typeDocId);
		} catch( Exception ex) {
			// Ignore
		}
	} else if(Validator.isNotNull(organizationId)) {
		try {
			currentOrg = (VLegalOrg)VLegalOrgServiceUtil.getOrg(organizationId);
		} catch( Exception ex) {
			// Ignore
		}
	}
	
	fields = VLegalFieldServiceUtil.getVFieldByS_L(groupId, true, language);
// 	fields = VLegalFieldServiceUtil.getVFieldByS_L(language, true);
	
	Date now = new Date();
	int currYear = Integer.parseInt(yearFormat.format(now)) ;
	
	PortletURL fieldURL = renderResponse.createRenderURL();
	if (Validator.isNotNull(organizationId)){
		fieldURL.setParameter("organizationid", organizationId);
	}
	fieldURL.setParameter("typedocid", typeDocId);

	//phan trang
	int total = 0;
	int numberPage = 1;
	int per = 0;
	int pages = 0;
	if (Validator.isNull(organizationId) && Validator.isNull(typeDocId) && Validator.isNull(_fieldId)){
		total = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISHED);
// 		total = VLegalDocumentServiceUtil.countDocumentByP_L_S(language, VLegalDocumentServiceImpl.PUBLISHED);
		
	} else if (Validator.isNotNull(cmd)	&& cmd.equalsIgnoreCase("searchBasic")) {
		Date proDateFrom = null;
		Date proDateTo = null;	
        if (Integer.parseInt(_proYear) > 0) {
			proDateFrom = new GregorianCalendar(Integer.parseInt(_proYear), 0, 1).getTime();
			proDateTo = new GregorianCalendar(Integer.parseInt(_proYear), 11, 31).getTime();
		}	
		
		total = VLegalDocumentServiceUtil.countDocument_Basic(groupId,
				language, num, symbol, _fieldId, organizationId ,typeDocId , proDateFrom, proDateTo, keywords,
				VLegalDocumentServiceImpl.PUBLISHED);	
// 		total = VLegalDocumentServiceUtil.countDocument_Basic(language, num, symbol, _fieldId, organizationId, typeDocId, proDateFrom, proDateTo, keywords, VLegalDocumentServiceImpl.PUBLISHED);

	}else {
			
		total = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId,
				language, VLegalDocumentServiceImpl.PUBLISHED);
// 		total = VLegalDocumentServiceUtil.countDocumentByP_L_S(
// 				language, VLegalDocumentServiceImpl.PUBLISHED);
	}

	int numPager = ParamUtil.getInteger(request, "numPager", 0);

	int sPageNum = ParamUtil.getInteger(request, "pagenum", 1);
	if(numPager != 0)
	{
		per = numPager;
	}
	else
	{
		per = documentPerPage;		
	}
	pages = (total % per == 0) ? total / per : total / per + 1;
	int begin = per * (sPageNum - 1);
	int end = (total>per * sPageNum) ? per * sPageNum : total;
	
	if (Validator.isNull(organizationId) && Validator.isNull(typeDocId) && Validator.isNull(_fieldId)){
		
		listItem = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISHED,begin,end);
// 		listItem = VLegalDocumentServiceUtil.getDocumentByP_L_S(language, VLegalDocumentServiceImpl.PUBLISHED, begin, end);

	} else if (Validator.isNotNull(cmd)	&& cmd.equalsIgnoreCase("searchBasic")) {
		Date proDateFrom = null;
		Date proDateTo = null;	
        if (Integer.parseInt(_proYear) > 0) {
			proDateFrom = new GregorianCalendar(Integer.parseInt(_proYear), 0, 1).getTime();
			proDateTo = new GregorianCalendar(Integer.parseInt(_proYear), 11, 31).getTime();
		}	
		listItem = VLegalDocumentServiceUtil.getDocument_Basic(groupId,
				language, num, symbol, _fieldId, organizationId,typeDocId ,proDateFrom, proDateTo, keywords,
				VLegalDocumentServiceImpl.PUBLISHED,begin,end);	
// 		listItem = VLegalDocumentServiceUtil.getDocument_Basic(language, 
// 				num, symbol, _fieldId, organizationId,typeDocId ,proDateFrom, proDateTo, keywords,
// 				VLegalDocumentServiceImpl.PUBLISHED,begin,end);	

	}else {
			listItem = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId,
					language, VLegalDocumentServiceImpl.PUBLISHED,begin,end);
// 			listItem = VLegalDocumentServiceUtil.getDocumentByP_L_S(
// 					language, VLegalDocumentServiceImpl.PUBLISHED,begin,end);

	}
	
	String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
	String temp2 = styleBorder;
%>

<script type="text/javascript">	
	function <portlet:namespace/>submitForm(numPage){
		var myform = document.<portlet:namespace />fm;
		if(numPage!=''){
			myform.<portlet:namespace/>pagenum.value=numPage;
		}
		myform.action="<%= searchURL.toString() %>";
		myform.submit();
	}
	function <portlet:namespace/>pageEvent()
	{
		var numpage;
		var myform = document.<portlet:namespace />fm;
		numpage = myform.<portlet:namespace />numpage.value;
		if(numpage == 1){
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>">
						<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
						<portlet:param name="numPager" value="10" />
<%-- 						<portlet:param name="language" value=<%= language %> /> --%>
<%-- 						<portlet:param name="groupId" value=<%= String.valueOf(groupId) %> /> --%>
						<portlet:param name="cmd" value="searchBasic" />
					</portlet:renderURL>');
		}
		else if(numpage == 2){
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>">
				<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
				<portlet:param name="numPager" value="20" />>
<%-- 				<portlet:param name="language" value=<%= language %> /> --%>
<%-- 				<portlet:param name="groupId" value=<%= String.valueOf(groupId) %> /> --%>
				<portlet:param name="cmd" value="searchBasic" />
			</portlet:renderURL>');
		}
		else if(numpage == 3){
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>">
				<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
				<portlet:param name="numPager" value="50" />
<%-- 				<portlet:param name="language" value=<%= language %> /> --%>
<%-- 				<portlet:param name="groupId" value=<%= String.valueOf(groupId) %> /> --%>
				<portlet:param name="cmd" value="searchBasic" />
			</portlet:renderURL>');
			
		}
		else if(numpage == 4){
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>">
				<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
				<portlet:param name="numPager" value="100" />
<%-- 				<portlet:param name="language" value=<%= language %> /> --%>
<%-- 				<portlet:param name="groupId" value=<%= String.valueOf(groupId) %> /> --%>
				<portlet:param name="cmd" value="searchBasic" />
			</portlet:renderURL>');
		}
		else if(numpage == 5){
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>">
				<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
				<portlet:param name="numPager" value="200" />
<%-- 				<portlet:param name="language" value=<%= language %> /> --%>
<%-- 			<portlet:param name="groupId" value=<%= String.valueOf(groupId) %> /> --%>
				<portlet:param name="cmd" value="searchBasic" />
			</portlet:renderURL>');
		}
		else{
			myform.submit();
		}
	}
</script>
	
<form method="post" name="<portlet:namespace />fm" >
<input type="hidden" name="<portlet:namespace/>cmd" value=""/>
<input type="hidden" name="<portlet:namespace/>pagenum" value="1" />
<input type="hidden" name="<portlet:namespace/>organizationid" value="<%= organizationId %>" />
<input type="hidden" name="<portlet:namespace/>typedocid" value="<%= typeDocId %>" />

<% 
	if(themeType.equals("1"))
	{
%>

<div class="<%= temp1 %>">
<!-- 	<div class="title"> -->
<!-- 		<div class="title_wrap"> -->
<%-- 			<div><%=titlePortlet%></div> --%>
<!-- 		</div>  -->
<!-- 	</div> -->
	<div style="font-family: Arial, Helvetica, sans-serif; font-size: 12px; color: #475D72; background-color: #fff; margin-right: 2px;" class="<%= temp2 %>">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<c:if test='<%= organizationId.equals("") && typeDocId.equals("") %>'>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= titlePortlet %>
<%-- 						<%= LanguageUtil.get(pageContext, "toan.bo.van.ban") %> --%>
					</div>
				</td>
			</tr>
			</c:if>
			<!--View Document by organizationId -->
			<c:if test='<%= !organizationId.equals("")%>'>
			<%	currentOrg = (VLegalOrg)VLegalOrgServiceUtil.getOrg(organizationId);%>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "co.quan.ban.hanh") %> &rsaquo;&rsaquo; <%=currentOrg.getName()%> 
					</div>
				</td>
			</tr>
			</c:if>	
				
			<!--View Document by typeDocId -->		
			<c:if test='<%= !typeDocId.equals("")%>'>	
			<%	currentType = (VLegalType)VLegalTypeServiceUtil.getType(typeDocId);	%>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "loai.van.ban") %> &rsaquo;&rsaquo; <%=currentType.getName()%> 
					</div>
				</td>
			</tr>	
			</c:if>	
			
			<tr>
				<td style="background-color: #fff;">			
					<table style="width: 100%;">
					<tr>
						<td width="100%"  bgcolor="#96CAF9">
							<% 	
								int number = 0;
								if (Validator.isNotNull(fields) && fields.size()>0){
								for (int i=0;i<fields.size();i++)
								{
									VLegalField field = (VLegalField)fields.get(i);						
									
									portletURL.setParameter("fieldId", field.getFieldId());
									portletURL.setParameter("cmd", "searchBasic");
									
									number = VLegalDocumentServiceUtil.countDocumentByG_L_F_S(groupId, language, field.getFieldId(), 2);
// 									number = VLegalDocumentServiceUtil.countDocumentByL_F_S(language, field.getFieldId(), 2);
							%>
									
							<%
									if( i%3 == 0 )
									{
								%>
								<div class="left" style="padding-top:5px; padding-bottom:5px">
								<%
									}
									else if(i%3 == 1) 
									{
								%>
								<div class="center" style="padding-top:5px; padding-bottom:5px">
								<%
									}
									else if(i%3 == 2)
									{
								%>
								<div class="right" style="padding-top:5px; padding-bottom:5px">
								<%
									}
								%>
									<b>
										<a href="<%= portletURL %>">
											<%= field.getName() %>
										</a>
									</b>
									(<%= number %>)
								</div>
								
							<%
									}
									if(fields.size()%2 == 1)
									{
							%>
										<div class="right">&nbsp;</div>
							<%		}
								}
							%>
									
						</td>
					</tr>
							
					<tr>
						<td  bgcolor="#F3F7FC">&nbsp;</td>
					</tr>
							
					<tr>
						<td  bgcolor="#F3F7FC">
						<table style="cellspacing: 0; cellspadding: 5; border: 0; background-color: #4A8BC3; width: 100%;">								
							<tr height="30">
								<td style="padding-left:20px;padding-bottom:3px;" width="30%"><strong><%= LanguageUtil.get(pageContext, "tat.ca.cac.linh.vuc") %></strong></td>
								<td>	
									<select name="<portlet:namespace/>fieldId" class="text_none" onchange="<portlet:namespace/>submitForm('');">
										<option value="0">-- T&#7845;t c&#7843; các l&#297;nh v&#7921;c --</option>
										<% 	for(int i=0; i<fields.size(); i++) {
												VLegalField vField = (VLegalField) fields.get(i);%>
											<option <%= _fieldId.equals(vField.getFieldId())? "selected":""%> value="<%= vField.getFieldId()%>"><%=vField.getName()%></option>
										<%	}%>
									</select>
								</td>	
							</tr>
						</table>
						</td>
					</tr>				
				</table>					
				<table width="100%" border="0" cellspacing="0" cellpadding="0" style="background-color: #96CAF9; margin-top: 15px; margin-bottom: 15px;"  >
					<tr>
						<td colspan="4">
							&nbsp;
						</td>
					</tr>
					<tr>		
						<td style="width: 30%px;">
							<div style="padding-left: 20px;">
								<input type="text" style="width: 95%;" name="<portlet:namespace/>summary" value="<%= keywords%>" onKeyUp="telexingVietUC(this,event);"/>
							</div>
						</td>
						<td>
							<div style="height: 100%; padding-top: 5px;">
								&nbsp;&nbsp;<img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/bg_search.jpg" onclick="<portlet:namespace />submitForm();">
							</div>
						</td>
						<td align="left"">
							<label><%= LanguageUtil.get(pageContext, "nam.ban.hanh") %> :</label>	
							<select name="<portlet:namespace/>pyear" class="text_none" onchange="<portlet:namespace/>submitForm();"> 
								<option value="0">-- <%= LanguageUtil.get(pageContext, "tat.ca") %> --</option>
								<%	for(int i= (currYear-10); i<=currYear; i++) {%>
									<option value="<%=i%>" <%=(Validator.isNotNull(_proYear) && Integer.parseInt(_proYear)==i) ? "selected=selected" : "" %> ><%=i %></option>
								<%}%>
							</select>
						</td>
						<td style="padding-right:5px;">	
							<label><%= LanguageUtil.get(pageContext, "hien.thi.moi.trang") %> :</label>
								<select name="<portlet:namespace />numpage" onchange="<portlet:namespace />pageEvent();">
									<option value="1" <%= (per==10)? "selected" : "" %> >10</option>
									<option value="2" <%= (per==20)? "selected" : "" %>>20</option>
									<option value="3" <%= (per==50)? "selected" : "" %>>50</option>
									<option value="4" <%= (per==100)? "selected" : "" %>>100</option>
									<option value="5" <%= (per==200)? "selected" : "" %>>200</option>
								</select>					
						</td>		
					</tr>
					<tr style="width: 20px;">
						<td colspan="4" style="padding-top: 10px; padding-bottom: 10px; padding-left: 20px;">
							<input type="radio" id="<portlet:namespace/>OFF" name="<portlet:namespace/>switch" value="OFF"   onFocus="setTypingMode(0)" />&nbsp;<label for="<portlet:namespace />OFF">T&#7855;t</label> &nbsp;
							<input type="radio" id="<portlet:namespace/>TELEX" name="<portlet:namespace/>switch" value="TELEX" onFocus="setTypingMode(1)" checked/>&nbsp;<label for="<portlet:namespace />TELEX">Telex</label>&nbsp;				
						</td>
					</tr>	
				</table>
			</td>
		</tr>
			
		<c:if test="<%= (listItem == null) || (listItem.size()==0) %>">
		<tr>
			<td class="text_none" align="center">
				<h4><font color="red"><strong><%= LanguageUtil.get(pageContext, "khong.co.du.lieu") %></strong></font></h4>
			</td>
		</tr>
			
		<tr>
			<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
		</tr>	
		</c:if>	
			
		<tr>
			<td class="text_none"/>
				<table style="width: 100%; cellspacing: 1px; cellpadding: 5px; background-color: #96CAF9; border: solid 1px #BFBFBF;">
				<tr height="25" bgcolor="#96CAF9" style="border: solid 1px #BFBFBF;">
					<td class="text_none" width="110" bgcolor="#96CAF9" style="text-align: center; border: solid 1px #BFBFBF;"><div style="color: #fff;"><strong><%= LanguageUtil.get(pageContext, "so") %>/<%= LanguageUtil.get(pageContext, "ki.hieu") %></strong></div></td>
					<td class="text_none" width="100" bgcolor="#96CAF9" style="text-align: center; border: solid 1px #BFBFBF;"><div style="color: #fff;"><strong><%= LanguageUtil.get(pageContext, "ngay.ban.hanh") %></strong></div></td>
					<td class="text_none" bgcolor="#96CAF9"  style="text-align: center; color: #fff; font-weight: bold; border: solid 1px #BFBFBF;"><strong><%= LanguageUtil.get(pageContext, "trich.yeu") %></strong></td>
				</tr>
				<%
						for(int i=0; i <listItem.size();i++)
						{				
							VLegalDocument document = (VLegalDocument) listItem.get(i);
								portletURL.setParameter("docid",document.getDocId());
								portletURL.setParameter("cmd","documentview");
							
				%>
				<tr height="18" style="border-color: #BFBFBF;">
					<td class="text_detail" width="60" bgcolor="#ffffff" style="border: solid 1px #BFBFBF;">
						<div style="color: #000; text-align: center; padding-left: 20px; padding-right: 20px;">
							<%=document.getNum()%>/<%= document.getSymbol()%>
						</div>
					</td>
					<td class="text_download" width="50" bgcolor="#ffffff" style="border: solid 1px #BFBFBF;">
						<div style="text-align: center; color: #000;"><%= VLegalUtil.dateParser(document.getPromulDate())%></div>
					</td>		
					<td class="text_detail" bgcolor="#ffffff" style="border: solid 1px #BFBFBF; text-align: center; ">			
					<%	if (document.getSummary().length()<150)
						{	
					%>	
						<div style="color: #639DCD;"><a href="<%= portletURL%>" class="hover_summary"><%= document.getSummary()%></a></div>
					<%	}
						else
						{	
					%>	
						<div style="color: #639DCD;"><a href="<%= portletURL%>" class="hover_summary"><%= document.getSummary().substring(0,150)%></a>...</div>			
					<%	
						}	
					%>
					</td>
				</tr>
				<%	
					}	
				%>
				</table>
			</td>
		</tr>
					
		<tr>
			<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
		</tr>
				
		<!-- Phan trang -->
		<c:if test='<%= pages > 1 %>'>			
		<tr>
			<td class="text_none" height="40">
				<strong><%= begin %> - <%= end %></strong>
				<strong> | <%= total %> | </strong>
				<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
				<% 	
					if(sPageNum >1)
					{
						int intPrev = sPageNum-1;%>
						<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
							<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
							<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
							<portlet:param name="language" value="<%= language %>" />
							<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
							<% 
								if(Validator.isNotNull(organizationId))
								{
							%>
							<portlet:param name="organizationid" value="<%= organizationId %>" />
							<%
								} 
								if(Validator.isNotNull(typeId))
								{
							%>	
							<portelt:param name="typeId" value="<%= typeDocId %>" />
							<%
								}
							%>
							<portelt:param name="summary" value="<%= keywords %>" />
							<portlet:param name="cmd" value="<%= cmd %>" />	
							</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
				<%
					}
				%>
					
				
				<% 
					for(int i = 1;i <= pages;i++){ 	
						if( i == sPageNum ){%>
						<strong><a class="menu_left" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
				<%
					}else{
				%>	
						<strong><a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
				<%
						}
				 	} 
			 	%>
			 	
					
				<% 	
					if(sPageNum < pages){
						int intNext = sPageNum + 1;
				%>
						<a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=intNext%>');"  >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
				<%
					}
				%>		
			</td>
		</tr>
		</c:if>
						
		</table>
	</div>
</div>

<%
	}
	else if(themeType.equals("2"))
	{
		
%>
	<table cellspacing="0" cellpadding="0" border="0" width="98%" align="center">
		<tr>	
			<td class="bg_title_news2">
			<table cellspacing="0" cellpadding="0" border="0" align="left" width="100%">
			<tr>
				<td width="40">&nbsp;</td>
				<td width="<%= titlePortlet.length() + 150%>" align="center" class="title_news"><%= titlePortlet %></td>
				<td>&nbsp;</td>
			</tr>
			</table>
			</td>
		</tr>	
	</table>	
	
	<div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<c:if test='<%= organizationId.equals("") && typeDocId.equals("") %>'>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "toan.bo.van.ban") %>
					</div>
				</td>
			</tr>
			</c:if>
			<!--View Document by organizationId -->
			<c:if test='<%= !organizationId.equals("")%>'>
			<%	currentOrg = (VLegalOrg)VLegalOrgServiceUtil.getOrg(organizationId);%>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "co.quan.ban.hanh") %> &rsaquo;&rsaquo; <%=currentOrg.getName()%> 
					</div>
				</td>
			</tr>
			</c:if>	
				
			<!--View Document by typeDocId -->		
			<c:if test='<%= !typeDocId.equals("")%>'>	
			<%	currentType = (VLegalType)VLegalTypeServiceUtil.getType(typeDocId);	%>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "loai.van.ban") %> &rsaquo;&rsaquo; <%=currentType.getName()%> 
					</div>
				</td>
			</tr>	
			</c:if>	
			
			<tr>
				<td style="background-color: #fff;">			
					<table style="width: 100%;">
					<tr>
						<td width="100%"  bgcolor="#96CAF9">
							<% 	
								int number = 0;
								if (Validator.isNotNull(fields) && fields.size()>0){
								for (int i=0;i<fields.size();i++)
								{
									VLegalField field = (VLegalField)fields.get(i);						
									
									portletURL.setParameter("fieldId", field.getFieldId());
									portletURL.setParameter("cmd", "searchBasic");
									
									number = VLegalDocumentServiceUtil.countDocumentByG_L_F_S(groupId, language, field.getFieldId(), 2);
// 									number = VLegalDocumentServiceUtil.countDocumentByL_F_S(language, field.getFieldId(), 2);
							%>
									
							<%
									if( i%3 == 0 )
									{
								%>
								<div class="left" style="padding-top:5px; padding-bottom:5px">
								<%
									}
									else if(i%3 == 1) 
									{
								%>
								<div class="center" style="padding-top:5px; padding-bottom:5px">
								<%
									}
									else if(i%3 == 2)
									{
								%>
								<div class="right" style="padding-top:5px; padding-bottom:5px">
								<%
									}
								%>
									<b>
										<a href="<%= portletURL %>">
											<%= field.getName() %>
										</a>
									</b>
									(<%= number %>)
								</div>
								
							<%
									}
									if(fields.size()%2 == 1)
									{
							%>
										<div class="right">&nbsp;</div>
							<%		}
								}
							%>
									
						</td>
					</tr>
							
					<tr>
						<td  bgcolor="#F3F7FC">&nbsp;</td>
					</tr>
							
					<tr>
						<td  bgcolor="#F3F7FC">
						<table style="cellspacing: 0; cellspadding: 5; border: 0; background-color: #4A8BC3; width: 100%;">								
							<tr height="30">
								<td style="padding-left:20px;padding-bottom:3px;" width="30%"><strong><%= LanguageUtil.get(pageContext, "tat.ca.cac.linh.vuc") %></strong></td>
								<td>	
									<select name="<portlet:namespace/>fieldId" class="text_none" onchange="<portlet:namespace/>submitForm('');">
										<option value="0">-- T&#7845;t c&#7843; các l&#297;nh v&#7921;c --</option>
										<% 	for(int i=0; i<fields.size(); i++) {
												VLegalField vField = (VLegalField) fields.get(i);%>
											<option <%= _fieldId.equals(vField.getFieldId())? "selected":""%> value="<%= vField.getFieldId()%>"><%=vField.getName()%></option>
										<%	}%>
									</select>
								</td>	
							</tr>
						</table>
						</td>
					</tr>				
				</table>					
				<table width="100%" border="0" cellspacing="0" cellpadding="0" style="background-color: #96CAF9; margin-top: 15px; margin-bottom: 15px;"  >
					<tr>
						<td colspan="4">
							&nbsp;
						</td>
					</tr>
					<tr>		
						<td style="width: 30%px;">
							<div style="padding-left: 20px;">
								<input type="text" style="width: 95%;" name="<portlet:namespace/>summary" value="<%= keywords%>" onKeyUp="telexingVietUC(this,event);"/>
							</div>
						</td>
						<td>
							<div style="height: 100%; padding-top: 5px;">
								&nbsp;&nbsp;<img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/bg_search.jpg" onclick="<portlet:namespace />submitForm();">
							</div>
						</td>
						<td align="left"">
							<label><%= LanguageUtil.get(pageContext, "nam.ban.hanh") %> :</label>	
							<select name="<portlet:namespace/>pyear" class="text_none" onchange="<portlet:namespace/>submitForm();"> 
								<option value="0">-- <%= LanguageUtil.get(pageContext, "tat.ca") %> --</option>
								<%	for(int i= (currYear-10); i<=currYear; i++) {%>
									<option value="<%=i%>" <%=(Validator.isNotNull(_proYear) && Integer.parseInt(_proYear)==i) ? "selected=selected" : "" %> ><%=i %></option>
								<%}%>
							</select>
						</td>
						<td style="padding-right:5px;">	
							<label><%= LanguageUtil.get(pageContext, "hien.thi.moi.trang") %> :</label>
								<select name="<portlet:namespace />numpage" onchange="<portlet:namespace />pageEvent();">
									<option value="1" <%= (per==10)? "selected" : "" %> >10</option>
									<option value="2" <%= (per==20)? "selected" : "" %>>20</option>
									<option value="3" <%= (per==50)? "selected" : "" %>>50</option>
									<option value="4" <%= (per==100)? "selected" : "" %>>100</option>
									<option value="5" <%= (per==200)? "selected" : "" %>>200</option>
								</select>					
						</td>		
					</tr>
					<tr style="width: 20px;">
						<td colspan="4" style="padding-top: 10px; padding-bottom: 10px; padding-left: 20px;">
							<input type="radio" id="<portlet:namespace/>OFF" name="<portlet:namespace/>switch" value="OFF"   onFocus="setTypingMode(0)" />&nbsp;<label for="<portlet:namespace />OFF">T&#7855;t</label> &nbsp;
							<input type="radio" id="<portlet:namespace/>TELEX" name="<portlet:namespace/>switch" value="TELEX" onFocus="setTypingMode(1)" checked/>&nbsp;<label for="<portlet:namespace />TELEX">Telex</label>&nbsp;				
						</td>
					</tr>	
				</table>
			</td>
		</tr>
			
		<c:if test="<%= (listItem == null) || (listItem.size()==0) %>">
		<tr>
			<td class="text_none" align="center">
				<h4><font color="red"><strong><%= LanguageUtil.get(pageContext, "khong.co.du.lieu") %></strong></font></h4>
			</td>
		</tr>
			
		<tr>
			<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
		</tr>	
		</c:if>	
			
		<tr>
			<td class="text_none"/>
				<table style="width: 100%; cellspacing: 1px; cellpadding: 5px; background-color: #96CAF9; border: solid 1px #BFBFBF;">
				<tr height="25" bgcolor="#96CAF9" style="border: solid 1px #BFBFBF;">
					<td class="text_none" width="110" bgcolor="#96CAF9" style="text-align: center; border: solid 1px #BFBFBF;"><div style="color: #fff;"><strong><%= LanguageUtil.get(pageContext, "so") %>/<%= LanguageUtil.get(pageContext, "ki.hieu") %></strong></div></td>
					<td class="text_none" width="100" bgcolor="#96CAF9" style="text-align: center; border: solid 1px #BFBFBF;"><div style="color: #fff;"><strong><%= LanguageUtil.get(pageContext, "ngay.ban.hanh") %></strong></div></td>
					<td class="text_none" bgcolor="#96CAF9"  style="text-align: center; color: #fff; font-weight: bold; border: solid 1px #BFBFBF;"><strong><%= LanguageUtil.get(pageContext, "trich.yeu") %></strong></td>
				</tr>
				<%
						for(int i=0; i <listItem.size();i++)
						{				
							VLegalDocument document = (VLegalDocument) listItem.get(i);
								portletURL.setParameter("docid",document.getDocId());
								portletURL.setParameter("cmd","documentview");
							
				%>
				<tr height="18" style="border-color: #BFBFBF;">
					<td class="text_detail" width="60" bgcolor="#ffffff" style="border: solid 1px #BFBFBF;">
						<div style="color: #000; text-align: center; padding-left: 20px; padding-right: 20px;">
							<%=document.getNum()%>/<%= document.getSymbol()%>
						</div>
					</td>
					<td class="text_download" width="50" bgcolor="#ffffff" style="border: solid 1px #BFBFBF;">
						<div style="text-align: center; color: #000;"><%= VLegalUtil.dateParser(document.getPromulDate())%></div>
					</td>		
					<td class="text_detail" bgcolor="#ffffff" style="border: solid 1px #BFBFBF; text-align: center; ">			
					<%	if (document.getSummary().length()<150)
						{	
					%>	
						<div style="color: #639DCD;"><a href="<%= portletURL%>" class="hover_summary"><%= document.getSummary()%></a></div>
					<%	}
						else
						{	
					%>	
						<div style="color: #639DCD;"><a href="<%= portletURL%>" class="hover_summary"><%= document.getSummary().substring(0,150)%></a>...</div>			
					<%	
						}	
					%>
					</td>
				</tr>
				<%	
					}	
				%>
				</table>
			</td>
		</tr>
					
		<tr>
			<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
		</tr>
				
		<!-- Phan trang -->
		<c:if test='<%= pages > 1 %>'>			
		<tr>
			<td class="text_none" height="40">
				<strong><%= begin %> - <%= end %></strong>
				<strong> | <%= total %> | </strong>
				<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
				<% 	
					if(sPageNum >1)
					{
						int intPrev = sPageNum-1;%>
						<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
							<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
							<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
							<portlet:param name="language" value="<%= language %>" />
							<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
							<% 
								if(Validator.isNotNull(organizationId))
								{
							%>
							<portlet:param name="organizationid" value="<%= organizationId %>" />
							<%
								} 
								if(Validator.isNotNull(typeId))
								{
							%>	
							<portelt:param name="typeId" value="<%= typeDocId %>" />
							<%
								}
							%>
							<portelt:param name="summary" value="<%= keywords %>" />
							<portlet:param name="cmd" value="<%= cmd %>" />	
							</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
				<%
					}
				%>
					
				
				<% 
					for(int i = 1;i <= pages;i++){ 	
						if( i == sPageNum ){%>
						<strong><a class="menu_left" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
				<%
					}else{
				%>	
						<strong><a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
				<%
						}
				 	} 
			 	%>
			 	
					
				<% 	
					if(sPageNum < pages){
						int intNext = sPageNum + 1;
				%>
						<a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=intNext%>');"  >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
				<%
					}
				%>		
			</td>
		</tr>
		</c:if>
						
		</table>
	</div>
<%
	}
	else if(themeType.equals("3"))
	{
%>
	
	
	
	<div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<c:if test='<%= organizationId.equals("") && typeDocId.equals("") %>'>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "toan.bo.van.ban") %>
					</div>
				</td>
			</tr>
			</c:if>
			<!--View Document by organizationId -->
			<c:if test='<%= !organizationId.equals("")%>'>
			<%	currentOrg = (VLegalOrg)VLegalOrgServiceUtil.getOrg(organizationId);%>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "co.quan.ban.hanh") %> &rsaquo;&rsaquo; <%=currentOrg.getName()%> 
					</div>
				</td>
			</tr>
			</c:if>	
				
			<!--View Document by typeDocId -->		
			<c:if test='<%= !typeDocId.equals("")%>'>	
			<%	currentType = (VLegalType)VLegalTypeServiceUtil.getType(typeDocId);	%>
			<tr style="width: 100%;">
				<td style="width: 100%;">
					<div class="header_vlegal_content">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "loai.van.ban") %> &rsaquo;&rsaquo; <%=currentType.getName()%> 
					</div>
				</td>
			</tr>	
			</c:if>	
			
			<tr>
				<td style="background-color: #fff;">			
					<table style="width: 100%;">
					<tr>
						<td width="100%"  bgcolor="#96CAF9">
							<% 	
								int number = 0;
								if (Validator.isNotNull(fields) && fields.size()>0){
								for (int i=0;i<fields.size();i++)
								{
									VLegalField field = (VLegalField)fields.get(i);						
									
									portletURL.setParameter("fieldId", field.getFieldId());
									portletURL.setParameter("cmd", "searchBasic");
									
									number = VLegalDocumentServiceUtil.countDocumentByG_L_F_S(groupId, language, field.getFieldId(), 2);
// 									number = VLegalDocumentServiceUtil.countDocumentByL_F_S(language, field.getFieldId(), 2);
							%>
									
							<%
									if( i%3 == 0 )
									{
								%>
								<div class="left" style="padding-top:5px; padding-bottom:5px">
								<%
									}
									else if(i%3 == 1) 
									{
								%>
								<div class="center" style="padding-top:5px; padding-bottom:5px">
								<%
									}
									else if(i%3 == 2)
									{
								%>
								<div class="right" style="padding-top:5px; padding-bottom:5px">
								<%
									}
								%>
									<b>
										<a href="<%= portletURL %>">
											<%= field.getName() %>
										</a>
									</b>
									(<%= number %>)
								</div>
								
							<%
									}
									if(fields.size()%2 == 1)
									{
							%>
										<div class="right">&nbsp;</div>
							<%		}
								}
							%>
									
						</td>
					</tr>
							
					<tr>
						<td  bgcolor="#F3F7FC">&nbsp;</td>
					</tr>
							
					<tr>
						<td  bgcolor="#F3F7FC">
						<table style="cellspacing: 0; cellspadding: 5; border: 0; background-color: #4A8BC3; width: 100%;">								
							<tr height="30">
								<td style="padding-left:20px;padding-bottom:3px;" width="30%"><strong><%= LanguageUtil.get(pageContext, "tat.ca.cac.linh.vuc") %></strong></td>
								<td>	
									<select name="<portlet:namespace/>fieldId" class="text_none" onchange="<portlet:namespace/>submitForm('');">
										<option value="0">-- T&#7845;t c&#7843; các l&#297;nh v&#7921;c --</option>
										<% 	for(int i=0; i<fields.size(); i++) {
												VLegalField vField = (VLegalField) fields.get(i);%>
											<option <%= _fieldId.equals(vField.getFieldId())? "selected":""%> value="<%= vField.getFieldId()%>"><%=vField.getName()%></option>
										<%	}%>
									</select>
								</td>	
							</tr>
						</table>
						</td>
					</tr>				
				</table>					
				<table width="100%" border="0" cellspacing="0" cellpadding="0" style="background-color: #96CAF9; margin-top: 15px; margin-bottom: 15px;"  >
					<tr>
						<td colspan="4">
							&nbsp;
						</td>
					</tr>
					<tr>		
						<td style="width: 30%px;">
							<div style="padding-left: 20px;">
								<input type="text" style="width: 95%;" name="<portlet:namespace/>summary" value="<%= keywords%>" onKeyUp="telexingVietUC(this,event);"/>
							</div>
						</td>
						<td>
							<div style="height: 100%; padding-top: 5px;">
								&nbsp;&nbsp;<img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/bg_search.jpg" onclick="<portlet:namespace />submitForm();">
							</div>
						</td>
						<td align="left"">
							<label><%= LanguageUtil.get(pageContext, "nam.ban.hanh") %> :</label>	
							<select name="<portlet:namespace/>pyear" class="text_none" onchange="<portlet:namespace/>submitForm();"> 
								<option value="0">-- <%= LanguageUtil.get(pageContext, "tat.ca") %> --</option>
								<%	for(int i= (currYear-10); i<=currYear; i++) {%>
									<option value="<%=i%>" <%=(Validator.isNotNull(_proYear) && Integer.parseInt(_proYear)==i) ? "selected=selected" : "" %> ><%=i %></option>
								<%}%>
							</select>
						</td>
						<td style="padding-right:5px;">	
							<label><%= LanguageUtil.get(pageContext, "hien.thi.moi.trang") %> :</label>
								<select name="<portlet:namespace />numpage" onchange="<portlet:namespace />pageEvent();">
									<option value="1" <%= (per==10)? "selected" : "" %> >10</option>
									<option value="2" <%= (per==20)? "selected" : "" %>>20</option>
									<option value="3" <%= (per==50)? "selected" : "" %>>50</option>
									<option value="4" <%= (per==100)? "selected" : "" %>>100</option>
									<option value="5" <%= (per==200)? "selected" : "" %>>200</option>
								</select>					
						</td>		
					</tr>
					<tr style="width: 20px;">
						<td colspan="4" style="padding-top: 10px; padding-bottom: 10px; padding-left: 20px;">
							<input type="radio" id="<portlet:namespace/>OFF" name="<portlet:namespace/>switch" value="OFF"   onFocus="setTypingMode(0)" />&nbsp;<label for="<portlet:namespace />OFF">T&#7855;t</label> &nbsp;
							<input type="radio" id="<portlet:namespace/>TELEX" name="<portlet:namespace/>switch" value="TELEX" onFocus="setTypingMode(1)" checked/>&nbsp;<label for="<portlet:namespace />TELEX">Telex</label>&nbsp;				
						</td>
					</tr>	
				</table>
			</td>
		</tr>
			
		<c:if test="<%= (listItem == null) || (listItem.size()==0) %>">
		<tr>
			<td class="text_none" align="center">
				<h4><font color="red"><strong><%= LanguageUtil.get(pageContext, "khong.co.du.lieu") %></strong></font></h4>
			</td>
		</tr>
			
		<tr>
			<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
		</tr>	
		</c:if>	
			
		<tr>
			<td class="text_none"/>
				<table style="width: 100%; cellspacing: 1px; cellpadding: 5px; background-color: #96CAF9; border: solid 1px #BFBFBF;">
				<tr height="25" bgcolor="#96CAF9" style="border: solid 1px #BFBFBF;">
					<td class="text_none" width="110" bgcolor="#96CAF9" style="text-align: center; border: solid 1px #BFBFBF;"><div style="color: #fff;"><strong><%= LanguageUtil.get(pageContext, "so") %>/<%= LanguageUtil.get(pageContext, "ki.hieu") %></strong></div></td>
					<td class="text_none" width="100" bgcolor="#96CAF9" style="text-align: center; border: solid 1px #BFBFBF;"><div style="color: #fff;"><strong><%= LanguageUtil.get(pageContext, "ngay.ban.hanh") %></strong></div></td>
					<td class="text_none" bgcolor="#96CAF9"  style="text-align: center; color: #fff; font-weight: bold; border: solid 1px #BFBFBF;"><strong><%= LanguageUtil.get(pageContext, "trich.yeu") %></strong></td>
				</tr>
				<%
						for(int i=0; i <listItem.size();i++)
						{				
							VLegalDocument document = (VLegalDocument) listItem.get(i);
								portletURL.setParameter("docid",document.getDocId());
								portletURL.setParameter("cmd","documentview");
							
				%>
				<tr height="18" style="border-color: #BFBFBF;">
					<td class="text_detail" width="60" bgcolor="#ffffff" style="border: solid 1px #BFBFBF;">
						<div style="color: #000; text-align: center; padding-left: 20px; padding-right: 20px;">
							<%=document.getNum()%>/<%= document.getSymbol()%>
						</div>
					</td>
					<td class="text_download" width="50" bgcolor="#ffffff" style="border: solid 1px #BFBFBF;">
						<div style="text-align: center; color: #000;"><%= VLegalUtil.dateParser(document.getPromulDate())%></div>
					</td>		
					<td class="text_detail" bgcolor="#ffffff" style="border: solid 1px #BFBFBF; text-align: center; ">			
					<%	if (document.getSummary().length()<150)
						{	
					%>	
						<div style="color: #639DCD;"><a href="<%= portletURL%>" class="hover_summary"><%= document.getSummary()%></a></div>
					<%	}
						else
						{	
					%>	
						<div style="color: #639DCD;"><a href="<%= portletURL%>" class="hover_summary"><%= document.getSummary().substring(0,150)%></a>...</div>			
					<%	
						}	
					%>
					</td>
				</tr>
				<%	
					}	
				%>
				</table>
			</td>
		</tr>
					
		<tr>
			<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
		</tr>
				
		<!-- Phan trang -->
		<c:if test='<%= pages > 1 %>'>			
		<tr>
			<td class="text_none" height="40">
				<strong><%= begin %> - <%= end %></strong>
				<strong> | <%= total %> | </strong>
				<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
				<% 	
					if(sPageNum >1)
					{
						int intPrev = sPageNum-1;%>
						<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
							<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
							<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
							<portlet:param name="language" value="<%= language %>" />
							<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
							<% 
								if(Validator.isNotNull(organizationId))
								{
							%>
							<portlet:param name="organizationid" value="<%= organizationId %>" />
							<%
								} 
								if(Validator.isNotNull(typeId))
								{
							%>	
							<portelt:param name="typeId" value="<%= typeDocId %>" />
							<%
								}
							%>
							<portelt:param name="summary" value="<%= keywords %>" />
							<portlet:param name="cmd" value="<%= cmd %>" />	
							</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
				<%
					}
				%>
					
				
				<% 
					for(int i = 1;i <= pages;i++){ 	
						if( i == sPageNum ){%>
						<strong><a class="menu_left" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
				<%
					}else{
				%>	
						<strong><a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
				<%
						}
				 	} 
			 	%>
			 	
					
				<% 	
					if(sPageNum < pages){
						int intNext = sPageNum + 1;
				%>
						<a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=intNext%>');"  >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
				<%
					}
				%>		
			</td>
		</tr>
		</c:if>
						
		</table>
	</div>
	
<%
	}
%>
</form>	