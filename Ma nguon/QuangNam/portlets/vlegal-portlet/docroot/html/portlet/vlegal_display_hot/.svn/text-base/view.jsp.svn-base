<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/faces" prefix="liferay-faces" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ include file="/html/portlet/vlegal_display_hot/init.jsp" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>



<%
	String redirect = StringPool.BLANK;
	String cmd = ParamUtil.getString(request, Constants.CMD);
	
	int _period = Integer.valueOf(period);
	
	// Initial date values	
	Calendar currentDate = new GregorianCalendar();
	int proFromDay = currentDate.get(Calendar.DATE);
	int proFromMonth = currentDate.get(Calendar.MONTH) - _period;
	int proFromYear = currentDate.get(Calendar.YEAR);
	int proFromHour = currentDate.get(Calendar.HOUR);
	int proFromMinute = currentDate.get(Calendar.MINUTE);
	
	int proToDay = currentDate.get(Calendar.DATE);
	int proToMonth = currentDate.get(Calendar.MONTH);
	int proToYear = currentDate.get(Calendar.YEAR);
	int proToHour = currentDate.get(Calendar.HOUR);
	int proToMinute = currentDate.get(Calendar.MINUTE);

	Date proDateFrom = new GregorianCalendar(proFromYear, proFromMonth, proFromDay, proFromHour, proFromMinute).getTime();	
	Date proDateTo = new GregorianCalendar(proToYear, proToMonth, proToDay, proToHour, proToMinute).getTime();

	List documents = VLegalDocumentServiceUtil.getDocByPromulDate(groupId, language, proDateFrom, proDateTo, VLegalDocumentServiceImpl.PUBLISHED,documentPerPortlet);
	
	PortletURL vlegalContentURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	vlegalContentURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/view.jsp");
	vlegalContentURL.setParameter("language", language);
	vlegalContentURL.setParameter("groupId", String.valueOf(groupId));
	vlegalContentURL.setParameter(Constants.CMD, "documentview");

	String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
	String temp2 = styleBorder;		
%>
<% if(themeType.equals("1")){%> 
<div class="<%=temp1%>">
	<div class="title">
		<div class="title_wrap">
			<div><%=title%></div>
		</div> 
	</div>
	
	<div class="<%=temp2%>">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">			
		<tr>
			<td class="text_none" style="padding: 4px;">
				<%if(isMarquee){%>
				<marquee onmouseover="this.stop()" onmouseout="this.start()" scrolldelay="0" scrollamount="2" height="220" direction="up">
					<p align="justify">
					<%
					    String description = "";
						if (documents!= null && documents.size()>0){
							if (documents.size() >0){
								for (int i=0; i<documents.size();i++){
									VLegalDocument doc = (VLegalDocument)documents.get(i);
									vlegalContentURL.setParameter("docid",doc.getDocId());
									if(doc.getSummary().length()<60){
									   description = doc.getSummary();
									}else{
									   description = doc.getSummary().substring(0,60);
									}
					%>
						<a href="<%=vlegalContentURL%>"><%= description%>...</a>
					<p style="border-top:1px dotted #CCCCCC;"></p>						
					<%	}}}	%>
					</p>
				</marquee>
				<%} else {%>
					<p align="justify">
					<%   String description = "";
						if (documents!= null && documents.size()>0){
							if (documents.size() >0){
								for (int i=0; i<documents.size();i++){
									VLegalDocument doc = (VLegalDocument)documents.get(i);
									vlegalContentURL.setParameter("docid",doc.getDocId());
									if(doc.getSummary().length()<60){
									   description = doc.getSummary();
									}else{
									   description = doc.getSummary().substring(0,60);
									}%>
						<a href="<%=vlegalContentURL%>"><%= description%>...</a>
					<%if(i<documents.size()-1){%>		
					<p style="border-top:1px dotted #CCCCCC;"></p>						
					<%	}}}}	%>
					</p>	
				<%}%>		
			</td>
		</tr>
	</table>
	</div>					
</div>
<%} else if(themeType.equals("2")){%>
				
<%if(isBorder){%>		
<div align="center"  style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;padding-top:3px;" class="boder9b9e9f">	
<%}else{%>	
<div align="center"  style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;">		
<%}%>						
<table cellspacing="3" cellpadding="5" border="0" width="100%">
<tr>
    <td bgcolor="#ffffff">
	    <table cellspacing="0" cellpadding="0" border="0" width="100%">	
		<tr>	
			<td <%=(Validator.isNotNull(themeSelected))? "class='title_menuleft_xanh2'":"class='title_menuleft_xanh'"%>>&nbsp;<%=title%></td>	
		</tr>
		<tr>
			<td>
			<table cellspacing="0" cellpadding="0" border="0" align="center" width="95%">
			<tr>
				<td class="text_none" style="padding: 4px;">
					<%if(isMarquee){%>
					<marquee onmouseover="this.stop()" onmouseout="this.start()" scrolldelay="0" scrollamount="2" height="220" direction="up">
						<p align="justify">
						<%
						    String description = "";
							if (documents!= null && documents.size()>0){
								if (documents.size() >0){
									for (int i=0; i<documents.size();i++){
										VLegalDocument doc = (VLegalDocument)documents.get(i);
										vlegalContentURL.setParameter("docid",doc.getDocId());
										if(doc.getSummary().length()<60){
										   description = doc.getSummary();
										}else{
										   description = doc.getSummary().substring(0,60);
										}
						%>
							<a href="<%=vlegalContentURL%>"><%= description%>...</a>
						<%if(i<documents.size()-1){%>	
						<p style="border-top:1px dotted #CCCCCC;"></p>						
						<%	}}}}	%>
						</p>
					</marquee>
					<%} else {%>
						<p align="justify">
						<%   String description = "";
							if (documents!= null && documents.size()>0)
							{
								if (documents.size() >0)
								{
									for (int i=0; i<documents.size();i++)
									{
										VLegalDocument doc = (VLegalDocument)documents.get(i);
										vlegalContentURL.setParameter("docid",doc.getDocId());
										if(doc.getSummary().length()<60)
										{
										   description = doc.getSummary();
										}
										else
										{
										   description = doc.getSummary().substring(0,60);
										}%>
											<a href="<%=vlegalContentURL%>"><%= description%>...</a>
										<%if(i<documents.size()-1)
										{
										%>		
										<p style="border-top:1px dotted #CCCCCC;"></p>						
										<%	
										}
						
								}
									
							}
								
						}	
						%>
						</p>	
					<%}%>		
				</td>
			</tr>
			</table>				
			</td>
		</td>
		</table>
	</td>
</tr>
<tr><td height="5"></td></tr>					
</table>
</div>

<c:if test="<%=isBorder%>">
<div style="height:5px;">&nbsp;</div>
</c:if>
		
<%} else if(themeType.equals("3")){%>	
		
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
	<td width="4" align="left" height="5">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/1.gif" width="4" height="5"/></td>	
	<td height="3" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/3.gif"></td>
	<td width="4" align="right">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/2.gif" width="4" height="5" /></td>
</tr>
		
<tr>
   	<td width="4" align="left" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/7.gif"></td>
	<td>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" >
		<tr><td height="3px"></td></tr>
	
		<tr><td width="3px"></td>
		    <td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="17"><img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/9.gif" width="17" height="30"/></td>
					<td width="100%" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/10.gif" height="30" style="color:#FFFFFF;font-size:11px;font-weight:bold;text-transform:uppercase;" valign="middle">&nbsp;<%=title%></td>
				</tr>
				<tr>
					<td colspan="2">			
				
						<table width="100%" border="0" cellspacing="0" cellpadding="0">			
						<tr>
							<td class="text_none" style="padding: 4px;">
								<%if (isMarquee){%>					
								<marquee onmouseover="this.stop()" onmouseout="this.start()" scrolldelay="0" scrollamount="2" height="220" direction="up">
									<p align="justify">
									<%
									    String description = "";
										if (documents!= null && documents.size()>0){
											if (documents.size() >0){
												for (int i=0; i<documents.size();i++){
													VLegalDocument doc = (VLegalDocument)documents.get(i);
													vlegalContentURL.setParameter("docid",doc.getDocId());
													if(doc.getSummary().length()<60){
													   description = doc.getSummary();
													}else{
													   description = doc.getSummary().substring(0,60);
													}
									%>
										<a href="<%=vlegalContentURL%>"><%= description%>...</a>
									<% if(i<documents.size()-1){%>								
										<p style="border-top:1px dotted #CCCCCC;"></p>						
									<%	}}}}	%>
									</p>
								</marquee>
								<%}else{%>
									<p align="justify">
									<%
									    String description = "";
										if (documents!= null && documents.size()>0){
											if (documents.size() >0){
												for (int i=0; i<documents.size();i++){
													VLegalDocument doc = (VLegalDocument)documents.get(i);
													vlegalContentURL.setParameter("docid",doc.getDocId());
													if(doc.getSummary().length()<60){
													   description = doc.getSummary();
													}else{
													   description = doc.getSummary().substring(0,60);
													}
									%>
										<a href="<%=vlegalContentURL%>"><%= description%>...</a>
									<% if(i<documents.size()-1){%>								
										<p style="border-top:1px dotted #CCCCCC;"></p>						
									<%	}}}}	%>
									</p>		
								<%}%>		
							</td>
						</tr>
						</table>
										
					</td>
				</tr>
				</table>
			</td>
			<td width="3px"></td>
		</tr>		 
		</table>
	</td>
	<td width="4" align="right" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/8.gif"></td>	
</tr>
			
<tr>
	<td width="4" align="left" height="5">
	<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/6.gif" width="4" height="5"/></td>
	<td background="<%= themeDisplay.getPathThemeImage() %>/DB_image/4.gif" height="5"></td>
	<td width="4" align="right">
	<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/5.gif" width="4" height="5" /></td>
</tr>
	
<tr><td colspan="3" height="4px"></td></tr>			
</table>	
		
								
<%}%>						