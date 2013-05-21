<%@page import="com.vportal.portlet.vcalendar.model.impl.VFileImpl"%>
<%@page import="com.liferay.portal.kernel.util.Time"%>
<%@page import="java.util.Date"%>
<%@ include file="/html/portlet/vcalendar/init.jsp" %>
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
	VFile vfile=null;
	String dateweek = ParamUtil.getString(request,"dateweek");
	switch(cal.get(Calendar.DAY_OF_WEEK)){
	  case 1:
	    break;
	  case 2:
	    cal.add(Calendar.DATE, -1);
	    break;
	  case 3:
	 	 cal.add(Calendar.DATE, -2);
	    break;
	  case 4:
	 	 cal.add(Calendar.DATE, -3);
	    break;
	  case 5:
		  cal.add(Calendar.DATE, -4);
	    break;
	  case 6:
	  	cal.add(Calendar.DATE, -5);
	    break;
	  case 7:
		cal.add(Calendar.DATE, -6);
		break;
	}
%>
<table cellpadding="0" cellspacing="0" border="0" width="100%">	
<tr>
	<td style="font-size:24px;color:#CC3300" align="center"><p>
	  <%=title%></p>
	</td>
</tr>
</table>      
<br />

<table cellpadding="0" cellspacing="0" border="0" width="100%">	
<tr>
	<td width="80%">
		<div>L&#7883;ch c&#244;ng t&#225;c tu&#7847;n <%=dateweek%></div>
	<td width="20%">
		<div align="right" >
			<img src="/html/portlet/vcmsviewcontent/images/fileprint.png" onclick="javascript:window.print();">&nbsp;&nbsp;
				<a href="#" onclick="javascript:window.print();">In </a>
		</div>
</td></tr>
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
		  cal.add(Calendar.DATE, 1);        		         
		  Date monday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));

		  List listmonday = VCalServiceUtil.findByD_S_G(monday,0,groupId);
		  if(listmonday.size()==0){
		  %>
        <tr valign="top"><td class="col1" >Th&#7913; hai<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
	        <td class="col1" >&nbsp;</td>
        	<td class="col1" >&nbsp;</td>
            <td class="col1" >&nbsp;</td>
            <td class="col1" >&nbsp;</td>            
			<td class="col3" >&nbsp;</td>
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
		     <tr valign="top"><td class="col1">Th&#7913; hai<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
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
		    <tr valign="top">
		    	<td class="col2"></td>
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
        <tr valign="top"><td class="col1" >Th&#7913; ba<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
	        <td class="col1">&nbsp;</td>
        	<td class="col1" >&nbsp;</td>
            <td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>
			<td class="col3">&nbsp;</td>
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
		     <tr valign="top"><td class="col1">Th&#7913; ba<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
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
		 Date wedday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
		  List listweb = VCalServiceUtil.findByD_S_G(wedday,0,groupId);
		  if(listweb.size()==0){
		  %>
        <tr valign="top"><td class="col1" >Th&#7913; t&#432;<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
	        <td class="col1" >&nbsp;</td>
        	<td class="col1" >&nbsp;</td>
            <td class="col1" >&nbsp;</td>
            <td class="col1" >&nbsp;</td>			
			<td class="col3"></td>
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
		     <tr valign="top"><td class="col1">Th&#7913; t&#432;<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
					<td class="col1"><%=listUser.getTime()%></td>
					<td class="col1"><%=listUser.getDescription()%>
						<br/>
						<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
					</td>
					<td class="col1"><%=vfile.getFullname()%></td>
					<td class="col1"><%=listUser.getGuest()%></td>
					<td class="col3"><%=listUser.getLocation()%></td>					
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
		     <tr valign="top"><td class="col1">Th&#7913; n&#259;m<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
					<td class="col1"><%=listUser.getTime()%></td>
					<td class="col1"><%=listUser.getDescription()%>
						<br/>
						<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
					</td>
					<td class="col1"><%=vfile.getFullname()%></td>
					<td class="col1"><%=listUser.getGuest()%></td>
					<td class="col3"><%=listUser.getLocation()%></td>					
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
		 Date friday = new Date(Integer.toString(cal.get(Calendar.MONTH)+1)+"/"+Integer.toString(cal.get(Calendar.DATE))+"/"+Integer.toString(cal.get(Calendar.YEAR)));
		  List listfri = VCalServiceUtil.findByD_S_G(friday,0,groupId);
		  if(listfri.size()==0){
		  %>
        <tr valign="top"><td class="col1">Th&#7913; s&#225;u<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
	        <td class="col1">&nbsp;</td>
        	<td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>            
			<td class="col3">&nbsp;</td>
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
		     <tr valign="top"><td class="col1">Th&#7913; s&#225;u<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
					<td class="col1"><%=listUser.getTime()%></td>
					<td class="col1"><%=listUser.getDescription()%>
						<br/>
						<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
					</td>
					<td class="col1"><%=vfile.getFullname()%></td>
					<td class="col1"><%=listUser.getGuest()%></td>
					<td class="col3"><%=listUser.getLocation()%></td>					
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
        <tr valign="top"><td class="col1">Th&#7913; b&#7849;y<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
	        <td class="col1">&nbsp;</td>
        	<td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>            
			<td class="col3">&nbsp;</td>			
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
					<td class="col1"><%=listUser.getTime()%></td>
					<td class="col1"><%=listUser.getDescription()%>
						<br/>
						<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
					</td>
					<td class="col1"><%=vfile.getFullname()%></td>
					<td class="col1"><%=listUser.getGuest()%></td>
					<td class="col3"><%=listUser.getLocation()%></td>					
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
        <tr valign="top"><td class="col1">Ch&#7911; nh&#7853;t<br /><%= dateFormatDate.format(Time.getDate(cal)) %></td>
	        <td class="col1">&nbsp;</td>
        	<td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>
            <td class="col1">&nbsp;</td>			
			<td class="col3">&nbsp;</td>
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
					<td class="col1"><%=listUser.getDescription()%>
						<br/>
						<vportal:file-download entryId="<%= listUser.getCalId() %>" entryClass="<%= VCal.class %>" />
					</td>
					<td class="col1"><%=vfile.getFullname()%></td>
					<td class="col1"><%=listUser.getGuest()%></td>
					<td class="col3"><%=listUser.getLocation()%></td>					
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
      <br/>