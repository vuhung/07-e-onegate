
<%@page import="com.vportal.portlet.vcalendar.model.impl.VFileImpl"%>
<%@page import="com.vportal.portlet.vcalendar.service.VFileServiceWrapper"%>
<%@page import="com.vportal.portlet.vcalendar.model.VFileModel"%>
<%@page import="com.vportal.portlet.vcalendar.util.VCalUtil"%>
<%@page import="com.vportal.portlet.vcalendar.model.VCal"%>
<%@page import="com.vportal.portlet.vcalendar.service.VFileServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="com.vportal.portlet.vcalendar.service.VCalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.vportal.portlet.vcalendar.model.VFile"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.Time"%>
<%@ include file="/html/portlet/vcalendarview/javascript.jsp" %>
<style type="text/css">
td.col1 {
	border-left:1px solid #D2D4D3;
	border-top:1px solid #D2D4D3; 
	padding:5px;
	}
	td.col2 {
	border-left:1px solid #D2D4D3;
	padding:5px;
	}
	td.col3 {
	border-left:1px solid #D2D4D3;
	border-right:1px solid #D2D4D3;
	border-top:1px solid #D2D4D3;
	padding:5px;
	}	
</style>
<%
    String title = prefs.getValue("title","");
	PortletURL vcalendarURL = renderResponse.createRenderURL();
	vcalendarURL.setParameter("struts_action","/vcalendar/display");
	PortletURL vcalendarListURL = renderResponse.createRenderURL();
	vcalendarListURL.setParameter("struts_action","/vcalendar/display");
	Calendar cal = (Calendar)selCal.clone();
	
	DateFormat dateFormatDayOfWeek = new SimpleDateFormat("EEE", locale);
	DateFormat dateFormatMonthAndDay = new SimpleDateFormat("M/d", locale);
	DateFormat dateFormat = new SimpleDateFormat("MMMM, yyyy", locale);
	DateFormat timeFormat = new SimpleDateFormat("h:mma", locale);
	
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	int month = cal.get(Calendar.MONTH);
	int day = cal.get(Calendar.DATE);
	int year = cal.get(Calendar.YEAR);
	int maxDayOfMonth = cal.getActualMaximum(Calendar.DATE);
	cal.add(Calendar.DATE, 1);	
	VFile vfile=null;
	
	cal = VCalUtil.getFirstDayOfWeek(cal);
		
	int pMonth = cal.get(Calendar.MONTH);
	int pDay = cal.get(Calendar.DATE);
	int pYear = cal.get(Calendar.YEAR);
	
	long month1 = ParamUtil.getLong(request, "month",selMonth);
	
	
%>
<table cellspacing="0" cellpadding="0" border="0" width="100%" bgcolor="#FFFFFF">
<tbody>	
	<tr>	   	
		<td>
			<table cellspacing="0" cellpadding="0" border="0" width="100%">
				<tbody>
	   			<tr><td height="3"/></tr>
				<tr>
	   				<td width="3"/>
	    			<td>
						<table cellspacing="0" cellpadding="0" border="0" width="100%">
							<tbody>
								<tr>									
									<td align="center"><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/lichcongtac.jpg"></td>
								</tr>
			
							</tbody>
						</table>
	     			</td>
	    			<td width="3"/>
				</tr>
				<tr>
	  				<td width="3"/>
	  				<td bgcolor="#EAF1FF">	
	 					<table cellpadding="0" cellspacing="0" border="0" width="100%">	
	  						<tr>
	    						<td style="font-size:24px;color:#CC3300" align="center">
	    							<p></p>
	    							<p><%=title%></p>
								</td>
							</tr>
						</table>      
						<br />
	
	 					<table cellpadding="0" cellspacing="0" border="0" width="100%">	
	  						<tr>
	  							<td width="37"><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_65.gif"></td>
	  							<td bgcolor="#D2E6FE">
	  								N&#259;m&nbsp;&nbsp;
									<select onChange="self.location = '<%= vcalendarListURL.toString() %>&<portlet:namespace />month=0&<portlet:namespace />day=1&<portlet:namespace />year=' + this.value;">
										<%
											for (int i = -10; i <= 10; i++) {
										%>
											<option <%= ((curYear - selYear + i) == 0) ? "selected" : "" %> value="<%= Integer.toString(curYear + i) %>"><%= curYear + i %> </option>
								
										<%
											}
										%>
										
									</select>
									
									Th&#225;ng&nbsp;
									<select onChange="self.location = '<%= vcalendarListURL.toString() %>&<portlet:namespace />year=<%=curYear %>&<portlet:namespace />day=0&<portlet:namespace />month=' + this.value;" name="<portlet:namespace/>month">
										<%											
											for (int i = 0; i <12; i++) {
										%>
											<option <%= (i == month1) ? "selected" : "" %> value="<%= i %>"><%= i+1 %> </option>
								
										<%
											}
										%>
										
									</select>									
									<%
										
										cal.add(Calendar.DATE, 1);
										String dateweek = dateFormatDate.format(Time.getDate(cal)) +" - "; 
										cal.add(Calendar.DATE, 6);
										dateweek = dateweek + dateFormatDate.format(Time.getDate(cal)) ;
										cal.add(Calendar.DATE, 1);
										
									%>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tu&#7847;n Th&#7913;&nbsp;&nbsp;
									 <select onChange="<portlet:namespace />submitForm(''+this.value);">
									 
											<%
											for (int i = 1; i <= 52; i++) {
												Calendar tempcal = (Calendar)selCal.clone();
												tempcal.set(Calendar.YEAR, year);
												tempcal.set(Calendar.WEEK_OF_YEAR, i-1);												
												
												Calendar firstTempCal = (Calendar)tempcal.clone();
												firstTempCal = VCalUtil.getFirstDayOfWeek(firstTempCal);
												firstTempCal.add(Calendar.DATE, 1);
												
												Calendar nextTempCal = (Calendar)firstTempCal.clone();
												nextTempCal.add(Calendar.DATE, 6);												
											%>
								
												<option value="<%= dateFormatDate.format(Time.getDate(tempcal)) %>" <%= ((cal.get(Calendar.WEEK_OF_YEAR)) == i) ? "selected" : "" %>>Tu&#7847;n <%= i %> <%= ((cal.get(Calendar.WEEK_OF_YEAR)) == i) ? "( "+dateweek+" )" : "( "+dateFormatDate.format(Time.getDate(firstTempCal))  +" - "+dateFormatDate.format(Time.getDate(nextTempCal)) +" )" %></option>
												
											<%											
											}
											%>
								
										</select>
									<%
										Calendar nextCal = (Calendar)selCal.clone();
										nextCal.set(Calendar.YEAR,year);
										nextCal.set(Calendar.WEEK_OF_YEAR, (cal.get(Calendar.WEEK_OF_YEAR)));
										
										Calendar prevCal = (Calendar)selCal.clone();
										prevCal.set(Calendar.YEAR,year);
										prevCal.set(Calendar.WEEK_OF_YEAR, (cal.get(Calendar.WEEK_OF_YEAR)-2));									
										
									%>
									
									<a href="#" onClick="<portlet:namespace />submitForm('<%= dateFormatDate.format(Time.getDate(prevCal)) %>')">Tu&#7847;n tr&#432;&#7899;c</a><b> | </b>
									<a href="#" onClick="<portlet:namespace />submitForm('<%= dateFormatDate.format(Time.getDate(nextCal)) %>')">Tu&#7847;n k&#7871; ti&#7871;p</a> 
									
								</td>
								<td bgcolor="#D2E6FE">
									<div align="right" >			
										<img src="fileprint.png" onClick="var slideShowWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">				
											<portlet:param name="struts_action" value="/html/portlet/vcalendarview/print_calendar.jsp" />
											<portlet:param name="year" value="<%=String.valueOf(pYear)%>" />
											<portlet:param name="month" value="<%=String.valueOf(pMonth+1)%>" />
											<portlet:param name="day" value="<%=String.valueOf(pDay)%>" />	
											<portlet:param name="dateweek" value="<%=dateweek%>" />
											</portlet:renderURL>', 'slideShow', 'directories=no,width=1000,height=500,scrollbars=yes,location=no,menubar=no,resizable=yes,left='.concat((screen.width - 400)/2).concat(',top=').concat((screen.height - 300)/2)); void(''); slideShowWindow.focus();">&nbsp;&nbsp;
										
										<a href="#" onClick="var slideShowWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
											<portlet:param name="jspPage" value="/html/portlet/vcalendarview/print_calendar.jsp" />	
											<portlet:param name="year" value="<%=String.valueOf(pYear)%>" />
											<portlet:param name="month" value="<%=String.valueOf(pMonth)%>" />
											<portlet:param name="day" value="<%=String.valueOf(pDay)%>" />	
											<portlet:param name="dateweek" value="<%=dateweek%>" />
											</portlet:renderURL>', 'slideShow', 'directories=no,width=1000,height=500,scrollbars=yes,location=no,menubar=no,resizable=yes,left='.concat((screen.width - 400)/2).concat(',top=').concat((screen.height - 300)/2)); void(''); slideShowWindow.focus();"><b>In l&#7883;ch</b></a></div>
								  </td>
								  <td width="25"><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/in.gif"></td>
								</tr>
							</table>      
							<br />
							<table cellpadding="0" cellspacing="1" border="0" width="100%" align="left" class="tbl_calender" style="border-bottom:1px solid #D2D4D3;">
								<tr>
									<td colspan="2" width="8%">
										<table cellpadding="0" cellspacing="0" width="100%" border="0">
								    		<tr>
								    			<td width="13" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_07_left.gif"/></td>
								       			<td style="background:url(<%= themeDisplay.getPathThemeImages() %>/HN_image/i_08_center.gif) repeat-x" align="center"><b>Th&#7901;i gian</b>
												</td>
								        		<td width="14" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_10_right.gif"/></td>
											</tr>
										</table>
									</td>
									<td width="32%">
										<table cellpadding="0" cellspacing="0" width="100%" border="0">
						        			<tr><td width="13" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_07_left.gif"/></td>
						                    	<td style="background:url(<%= themeDisplay.getPathThemeImages() %>/HN_image/i_08_center.gif) repeat-x" align="center"><b>N&#7897;i dung c&#244;ng vi&#7879;c</b></td>
						                        <td width="14" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_10_right.gif"/></td>
						                    </tr>
							        	</table>
									</td>
							        <td width="10%">
							        	<table cellpadding="0" cellspacing="0" width="100%" border="0">
							        		<tr>
							        			<td width="13" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_07_left.gif"/></td>
							                    <td style="background:url(<%= themeDisplay.getPathThemeImages() %>/HN_image/i_08_center.gif) repeat-x" align="center"><b>L&#227;nh &#273;&#7841;o</b></td>
							                    <td width="14" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_10_right.gif"/></td>
											</tr>
							        	</table>
							        </td>
									<td width="40%">
										<table cellpadding="0" cellspacing="0" width="100%" border="0">
								        	<tr><td width="13" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_07_left.gif"/></td>
								        		<td style="background:url(<%= themeDisplay.getPathThemeImages() %>/HN_image/i_08_center.gif) repeat-x" align="center"><b>Th&#224;nh ph&#7847;n</b></td>
								                <td width="14" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_10_right.gif"/></td>
											</tr>
								        </table>
									</td>
									 <td width="10%">
									 	<table cellpadding="0" cellspacing="0" width="100%" border="0">
						        			<tr><td width="13" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_07_left.gif"/></td>
						                    	<td style="background:url(<%= themeDisplay.getPathThemeImages() %>/HN_image/i_08_center.gif) repeat-x" align="center"><b>&#272;&#7883;a &#273;i&#7875;m</b></td>
						                        <td width="14" ><img src="<%= themeDisplay.getPathThemeImages() %>/HN_image/i_10_right.gif"/></td>
						                    </tr>
						        		</table>
						            </td>
						            
								</tr>
							          <%
										cal.add(Calendar.DATE, -7);        		         
									  Date monday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
									 
									  List listmonday = VCalServiceUtil.findByD_S_G(monday,0,groupId);
									  if(listmonday.size()==0){
									  %>
							        <tr valign="top"><td class="col1">Th&#7913; hai<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1">&nbsp;</td>
							        	<td class="col1">&nbsp;</td>
							            <td class="col1">&nbsp;</td>
							            <td class="col1">&nbsp;</td>										
										<td class="col3">&nbsp;</td>
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<listmonday.size();j++){
										  VCal listUser =(VCal)listmonday.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     <tr valign="top">
									     		<td class="col1">Th&#7913; hai<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1"><%=listUser.getTime()%></td>
												<td class="col1"><%=listUser.getDescription()%>
													<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
												</td>
												<td class="col1"><%=vfile.getFullname()%></td>
												<td class="col1"><%=listUser.getGuest()%></td>
												<td class="col3">
													<%=listUser.getLocation()%>													
												</td>												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top"><td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>											
										</tr>
									 <%  
									    }
									   }
									}
									%>
							          <%
										 cal.add(Calendar.DATE, 1);
										 Date stuDate = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
										  List liststu = VCalServiceUtil.findByD_S_G(stuDate,0,groupId);
									  if(liststu.size()==0){
									  %>
							        <tr valign="top">
							        	<td class="col1" >Th&#7913; ba<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1" >&nbsp;</td>
							        	<td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
										<td class="col3" >&nbsp;</td>										
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<liststu.size();j++){
										  VCal listUser =(VCal)liststu.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     <tr valign="top">
									     		<td class="col1">Th&#7913; ba<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1" ><%=listUser.getTime()%></td>
												<td class="col1" ><%=listUser.getDescription()%><br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
												</td>
												<td class="col1" ><%=vfile.getFullname()%></td>
												<td class="col1" ><%=listUser.getGuest()%></td>
												<td class="col3" ><%=listUser.getLocation()%></td>
												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top">
									    	<td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>
											
										</tr>
									 <%  
									    }
									   }
									}
									%>
							         <%
										cal.add(Calendar.DATE, 1);
									 Date wedday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
									  List listweb = VCalServiceUtil.findByD_S_G(wedday,0,groupId);
									  if(listweb.size()==0){
									  %>
							        <tr valign="top">
							        	<td class="col1" >Th&#7913; t&#432;<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1" >&nbsp;</td>
							        	<td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
										<td class="col3" >&nbsp;</td>										
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<listweb.size();j++){
										  VCal listUser =(VCal)listweb.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     	<tr valign="top">
									     		<td class="col1">Th&#7913; t&#432;<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1" ><%=listUser.getTime()%></td>
												<td class="col1" ><%=listUser.getDescription()%>
													<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
												</td>
												<td class="col1" ><%=vfile.getFullname()%></td>
												<td class="col1" ><%=listUser.getGuest()%></td>
												<td class="col3" ><%=listUser.getLocation()%></td>
												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top"><td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>
											
										</tr>
									 <%  
									    }
									   }
									}
									%>
									  <%
									  	cal.add(Calendar.DATE, 1);
										 Date thusday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
										  List listthus = VCalServiceUtil.findByD_S_G(thusday,0,groupId);
									  if(listthus.size()==0){
									  %>
							        <tr valign="top"><td class="col1" >Th&#7913; n&#259;m<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1" >&nbsp;</td>
							        	<td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
										<td class="col3" >&nbsp;</td>
										
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<listthus.size();j++){
										  VCal listUser =(VCal)listthus.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     <tr valign="top"><td class="col1" >Th&#7913; n&#259;m<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1" ><%=listUser.getTime()%></td>
												<td class="col1" ><%=listUser.getDescription()%>
													<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />												
												</td>
												<td class="col1" ><%=vfile.getFullname()%></td>
												<td class="col1" ><%=listUser.getGuest()%></td>
												<td class="col3" ><%=listUser.getLocation()%></td>
												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top"><td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />s
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>
											
										</tr>
									 <%  
									    }
									   }
									}
									%>
									  <%
									  	cal.add(Calendar.DATE, 1);
									 Date friday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
									  List listfri = VCalServiceUtil.findByD_S_G(friday,0,groupId);
									  if(listfri.size()==0){
									  %>
							        <tr valign="top"><td class="col1" >Th&#7913; s&#225;u<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1" >&nbsp;</td>
							        	<td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
										
										<td class="col3"></td>
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<listfri.size();j++){
										  VCal listUser =(VCal)listfri.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     <tr valign="top"><td class="col1" >Th&#7913; s&#225;u<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1" ><%=listUser.getTime()%></td>
												<td class="col1" ><%=listUser.getDescription()%>
													<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
												</td>
												<td class="col1" ><%=vfile.getFullname()%></td>
												<td class="col1" ><%=listUser.getGuest()%></td>
												<td class="col3" ><%=listUser.getLocation()%></td>												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top"><td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>											
										</tr>
									 <%  
									    }
									   }
									}
									%>
									 <%
									 	cal.add(Calendar.DATE, 1);
									 Date satday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
									  List listsat = VCalServiceUtil.findByD_S_G(satday,0,groupId);
									  if(listsat.size()==0){
									  %>
							        <tr valign="top"><td class="col1" >Th&#7913; b&#7849;y<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1" >&nbsp;</td>
							        	<td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
										<td class="col3" >&nbsp;</td>
										
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<listsat.size();j++){
										  VCal listUser =(VCal)listsat.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     <tr valign="top"><td class="col1">Th&#7913; b&#7849;y<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1" ><%=listUser.getTime()%></td>
												<td class="col1" ><%=listUser.getDescription()%>												
													<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
												</td>
												<td class="col1" ><%=vfile.getFullname()%></td>
												<td class="col1" ><%=listUser.getGuest()%></td>
												<td class="col3" ><%=listUser.getLocation()%></td>												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top"><td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />											
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>											
										</tr>
									 <%  
									    }
									   }
									}
									%>
									 <%
									 cal.add(Calendar.DATE, 1);
										 Date sunday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
										  List listsun = VCalServiceUtil.findByD_S_G(sunday,0,groupId);
									  if(listsun.size()==0){
									  %>
							        <tr valign="top">
							        	<td class="col1" >Ch&#7911; nh&#7853;t<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
								        <td class="col1" >&nbsp;</td>
							        	<td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
							            <td class="col1" >&nbsp;</td>
										<td class="col3" >&nbsp;</td>										
							        </tr>
							        <%
									}else{
									    for(int j = 0;j<listsun.size();j++){
										  VCal listUser =(VCal)listsun.get(j);
										  if(listUser.getFileId() == 0)
										  {
											  vfile =  new VFileImpl();
											  vfile.setFullname("");
										  }else
										  {  
										  	vfile=VFileServiceUtil.findById(listUser.getFileId());
										  }
										  if(j==0){
									%>
									     <tr valign="top"><td class="col1">Ch&#7911; nh&#7853;t<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
												<td class="col1"><%=listUser.getTime()%></td>
												<td class="col1" ><%=listUser.getDescription()%>
													<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
												</td>
												<td class="col1" ><%=vfile.getFullname()%></td>
												<td class="col1" ><%=listUser.getGuest()%></td>
												<td class="col3" ><%=listUser.getLocation()%></td>												
											</tr>
									<%
									   }else{
									   %>
									    <tr valign="top"><td class="col2"></td>
											<td class="col1"><%=listUser.getTime()%></td>
											<td class="col1" ><%=listUser.getDescription()%>
												<br/>
													<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
											</td>
											<td class="col1" ><%=vfile.getFullname()%></td>
											<td class="col1" ><%=listUser.getGuest()%></td>
											<td class="col3" ><%=listUser.getLocation()%></td>											
										</tr>
									 <%  
									    }
									   }
									}
									%>
							      </table>
								</td>
	  							<td width="3"/>
							</tr>
							<tr><td height="3"/></tr>			 
						</tbody>
					</table>
				</td>					
			</tr>			
		</tbody>
	</table>	

<script type="text/javascript">
function <portlet:namespace />submitForm(value){	
    var value_array=value.split("/");	
	self.location = '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"></portlet:renderURL>&<portlet:namespace />month=' + (value_array[1]-1) + '&<portlet:namespace />day=' + value_array[0] + '&<portlet:namespace />year=' + value_array[2];
}
	var offsetxpoint=-60 //Customize x offset of tooltip
	var offsetypoint=20 //Customize y offset of tooltip
	var ie=document.all
	var ns6=document.getElementById && !document.all
	var enabletip=false
	if (ie||ns6)
	var tipobj=document.all? document.all["dhtmltooltip"] : document.getElementById? document.getElementById("dhtmltooltip") : ""
	
	function ietruebody(){
	return (document.compatMode && document.compatMode!="BackCompat")? document.documentElement : document.body
	}
	
	function ddrivetip(thetext, thecolor, thewidth){
	if (ns6||ie){
	if (typeof thewidth!="undefined") tipobj.style.width=thewidth+"px"
	if (typeof thecolor!="undefined" && thecolor!="") tipobj.style.backgroundColor=thecolor
	tipobj.innerHTML=thetext
	enabletip=true
	return false
	}
	}
	
	function positiontip(e){
	if (enabletip){
	var curX=(ns6)?e.pageX : event.clientX+ietruebody().scrollLeft;
	var curY=(ns6)?e.pageY : event.clientY+ietruebody().scrollTop;
	//Find out how close the mouse is to the corner of the window
	var rightedge=ie&&!window.opera? ietruebody().clientWidth-event.clientX-offsetxpoint : window.innerWidth-e.clientX-offsetxpoint-20
	var bottomedge=ie&&!window.opera? ietruebody().clientHeight-event.clientY-offsetypoint : window.innerHeight-e.clientY-offsetypoint-20
	
	var leftedge=(offsetxpoint<0)? offsetxpoint*(-1) : -1000
	
	//if the horizontal distance isn't enough to accomodate the width of the context menu
	if (rightedge<tipobj.offsetWidth)
	//move the horizontal position of the menu to the left by it's width
	tipobj.style.left=ie? ietruebody().scrollLeft+event.clientX-tipobj.offsetWidth+"px" : window.pageXOffset+e.clientX-tipobj.offsetWidth+"px"
	else if (curX<leftedge)
	tipobj.style.left="5px"
	else
	//position the horizontal position of the menu where the mouse is positioned
	tipobj.style.left=curX+offsetxpoint+"px"
	
	//same concept with the vertical position
	if (bottomedge<tipobj.offsetHeight)
	tipobj.style.top=ie? ietruebody().scrollTop+event.clientY-tipobj.offsetHeight-offsetypoint+"px" : window.pageYOffset+e.clientY-tipobj.offsetHeight-offsetypoint+"px"
	else
	tipobj.style.top=curY+offsetypoint+"px"
	tipobj.style.visibility="visible"
	}
	}
	
	function hideddrivetip(){
	if (ns6||ie){
	enabletip=false
	tipobj.style.visibility="hidden"
	tipobj.style.left="-1000px"
	tipobj.style.backgroundColor=''
	tipobj.style.width=''
	}
	}
	
	document.onmousemove=positiontip
</script>