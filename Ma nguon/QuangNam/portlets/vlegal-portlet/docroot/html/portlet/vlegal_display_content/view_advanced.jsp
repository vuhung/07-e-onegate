<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@ include file="/html/portlet/vlegal_display_content/init.jsp" %>
<link rel="stylesheet" href="/html/js/calendar/dhtmlgoodies_calendar.css" media="screen"></link>
<script type="text/javascript" src="/html/js/calendar/dhtmlgoodies_calendar.js"></script>
<%
	String redirect = StringPool.BLANK;
	String cmd = ParamUtil.getString(request, Constants.CMD, StringPool.BLANK);
		
	// Parameter Search Advanced
	String _fieldId =  ParamUtil.getString(request, "fieldId", StringPool.BLANK);
	String _summary = ParamUtil.getString(request, "summary", StringPool.BLANK);	
	String num = ParamUtil.getString(request, "num", StringPool.BLANK);
	String symbol = ParamUtil.getString(request, "symbol", StringPool.BLANK);	
	String content = ParamUtil.getString(request, "content", StringPool.BLANK);
	
	String proDateFrom = ParamUtil.getString(request, "proDateFrom");
	String proDateTo = ParamUtil.getString(request, "proDateTo");
	String expDateFrom = ParamUtil.getString(request, "expDateFrom");
	String expDateTo = ParamUtil.getString(request, "expDateTo");	
	
	PortletURL portletURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	portletURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/view.jsp");
	portletURL.setParameter("language", language);
	portletURL.setParameter("groupId", String.valueOf(groupId));
	
	List typeIds = new ArrayList();	
	String[] tId = request.getParameterValues("typeIds");	
	if(Validator.isNotNull(tId)){
		for(int i=0;i<tId.length;i++){
			typeIds.add(tId[i]);
		}
	}
	
	List orgIds = new ArrayList();
	String[] oId = request.getParameterValues("orgIds");
	if(Validator.isNotNull(oId)){
		for(int i=0;i<oId.length;i++){
			orgIds.add(oId[i]);
		}
	}
	
	List sigIds = new ArrayList();
	String[] sId = request.getParameterValues("sigIds");
	if (Validator.isNotNull(sId)){
		for(int i=0;i<sId.length;i++){
			sigIds.add(sId[i]);
		}
	}
	

	List documents = new ArrayList();
	List fields = new ArrayList();  // field
	try {
		fields = VLegalFieldServiceUtil.getVFieldByS_L(groupId, true, language); // fields
	} catch (Exception ex){
		// Ignore..
	}
	
	List organizations = new ArrayList(); // org
	try {
		organizations = VLegalOrgServiceUtil.getAllOrgByS_L(portletGroupId.longValue(), true, language);
	} catch (Exception ex) {
		// Ignore..
	}
	
	List types = new ArrayList(); // type
	try {
		types = VLegalTypeServiceUtil.getTypesByL_S(portletGroupId.longValue(), language, true);
	} catch(Exception ex) {
		// Ignore
	}

	List signers = new ArrayList(); // signer
	try {
		signers = VLegalSignerServiceUtil.getAllSignerByG_L(portletGroupId.longValue(), language);
	} catch(Exception ex) {
		// Ignore
	}	

	documents = (List)request.getAttribute("documents");
	
	String minYear = "2008";
	if(documents != null && documents.size() > 0 ) {
		for(int i = 0; i< documents.size(); i++) {	
			VLegalDocument doc = (VLegalDocument) documents.get(i);
			if(i+1 < documents.size() ) {
				VLegalDocument doc2 = (VLegalDocument) documents.get(i+1);
				if(Integer.parseInt(yearFormat.format(doc.getPromulDate())) <= Integer.parseInt(yearFormat.format(doc2.getPromulDate()))) {
					minYear = yearFormat.format(doc.getPromulDate());
				}
			}
		}
	}
	
	Date now = new Date();
	int currYear = Integer.parseInt(yearFormat.format(now)) ;
	
	// portletURL search Advanced
	PortletURL searchURL = renderResponse.createRenderURL();
	searchURL.setParameter("jspPage","/html/portlet/vlegal_display_content/view_advanced.jsp");
	searchURL.setParameter("language",language);
	searchURL.setParameter("groupId",String.valueOf(groupId));
	searchURL.setParameter("cmd","searchAdvanced");	
	
	//Phan trang
	
	int total = documents.size();	
	int per = documentPerPage;
	
	int sPageNum = ParamUtil.getInteger(request, "pagenum", 1);			
	int pages = (total % per == 0) ? total / per : total / per + 1;
	int begin = per * (sPageNum - 1);
	int end = (total>per * sPageNum) ? per * sPageNum : total;
	List listItem = documents.subList(begin,end);

%>

<script type="text/javascript">
	pathToImages = "<%= request.getContextPath() %>html/themes/classic/images/edir/calendar/";
	function <portlet:namespace/>submitForm(numPage){
		var myform = document.<portlet:namespace />fm;
		if(numPage!=''){
			myform.<portlet:namespace/>pagenum.value=numPage;
		}
		myform.action="<%= searchURL.toString() %>";
		myform.submit();
	}
</script>

<form method="post" name="<portlet:namespace />fm">
<input type="hidden" name="<portlet:namespace/>cmd" value=""/>
<input type="hidden" name="<portlet:namespace/>pagenum" value="1" />	

<% if (themeType.equals("1")){%>		
<div class="box_left_portlet border_blue bullet_yellow title_light_blue">
<div class="title">
	<div class="title_wrap">
		<div><%=titlePortlet%></div>
	</div> 
</div>	
	<div>		
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="text_none">
		<table width="90%" height="90" border="0" cellspacing="0" cellpadding="0" align="center">
		<tr>
			<td width="58">
				<img width="58" height="56" src="/vlegal-portlet/html/portlet/vlegal_display_content/images/zoom.gif" /></td>			
			<td width="10"/>
			<td>
				<table width="100%" cellspacing="0" cellpadding="0" border="0">		
				<tr height="30">
					<td><strong>Ch&#7885;n l&#297;nh v&#7921;c</strong></td>
					<td>	
						<select name="<portlet:namespace/>fieldId" class="text_none">
							<option value="0">-- T&#7845;t c&#7843; các l&#297;nh v&#7921;c --</option>
							<%	if(fields != null && fields.size() >0) {
									for(int i=0; i<fields.size(); i++) {
										VLegalField vField = (VLegalField) fields.get(i);	%>
							<option value="<%= vField.getFieldId()%>" <%= _fieldId.equals(vField.getFieldId())? "selected":""%>><%=vField.getName()%></option>
							<%	}}	%>
						</select>
					</td>
					<td width="69"/>
					<td/>
				</tr>
								
				<tr height="30">
					<td><strong>N&#259;m ban hành</strong></td>
					<td>								
						<select class="text_none" name="<portlet:namespace/>pyear" disabled>
							<option value="0">-- T&#7845;t c&#7843; các n&#259;m --</option>
						</select>
					</td>
					<td width ="69"/>
					<td/>
				</tr>
											
				<tr height="30">
					<td width="100"><strong>Trích y&#7871;u</strong></td>
					<td width="100">	
						<input name="<portlet:namespace/>summary" class="text_none" type="text" value="<%= _summary %>"/>
					</td>
					<td width ="69"/>
					<td/>
				</tr>
				</table>
			</td>
		</tr>
		</table>
		</td>
	</tr>

	<tr>
		<td class="text_none">
		<table width="100%" cellspacing="2" cellpadding="5" border="0">	
		<tr>
			<td style="font-size: 12px;">
				<table width="100%" cellspacing="0" cellpadding="5" border="0">
				<tr height="30">
					<td class="text_none"><strong><label>&nbsp;&nbsp;Ban hành:</label></strong></td>
					<td class="text_none"/>
					<td/>
					<td class="text_none"/>
					<td class="text_none"/>
					<td/>
				</tr>
				</table>
			</td>
		</tr>
		
		<tr height="30">
			<td class="text_none" width="100"><label>&nbsp;&nbsp;T&#7915; ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>proDateFrom" class="text_none"  value="<%= proDateFrom %>"/>
			</td>
			<td width="40">						
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />proDateFrom,'dd/mm/yyyy',this)">
				</a>					
			</td>
			<td class="text_none" width="90"><label>&#272;&#7871;n ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>proDateTo" class="text_none" value="<%= proDateTo %>"/>
			</td>
			<td class="text_none">
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />proDateTo,'dd/mm/yyyy',this)">
				</a>					
			</td>
		</tr>
			
		<tr height="30">
			<td class="text_none"><lable>&nbsp;&nbsp;S&#7889; hi&#7879;u v&#259;n b&#7843;n:</lable></td>
			<td class="text_none">
				<input type="text" name="<portlet:namespace/>num" class="text_none" value="<%= num %>"/>
			</td>
			<td/>
			<td class="text_none" width="90"><lable>Kí hi&#7879;u v&#259;n b&#7843;n:</lable></td>
			<td class="text_none">
				<input type="text" name="<portlet:namespace/>symbol" class="text_none" value="<%= symbol %>"/>
			</td>
		</tr>
			
		<tr height="30">
			<td class="text_none"><strong><label>&nbsp;&nbsp;H&#7871;t hi&#7879;u l&#7921;c:</label></strong></td>
			<td class="text_none"/>
			<td/>
			<td class="text_none" width="90"/>
			<td class="text_none"/>
		</tr>	
					
		<tr height="30">
			<td class="text_none" width="100"><label>&nbsp;&nbsp;T&#7915; ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>expDateFrom" class="text_none" value="<%= expDateFrom%>"/>
			</td>					
			<td class="text_none" width="40">
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expDateFrom,'dd/mm/yyyy',this)">
				</a>
			</td>
			<td class="text_none" width="90"><label>&#272;&#7871;n ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>expDateTo" class="text_none" value="<%= expDateTo%>"/>
			</td>
			<td class="text_none">
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expDateTo,'dd/mm/yyyy',this)">
				</a>
			</td>
		</tr>
				
		<tr height="30">
			<td class="text_none"><label>&nbsp;&nbsp;N&#7897;i dung v&#259;n b&#7843;n:</label></td>
			<td class="text_none">
				<input type="text" name="<portlet:namespace/>content" class="text_none" value="<%= content%>"/>
			</td>
			<td class="text_none"/>
			<td class="text_none" width="90"/>
			<td class="text_none"/>
		</tr>
					
		<tr height="30">	
			<td class="text_none"/>
			<td/>
			<td class="text_none"/>
			<td class="text_none" width="90"/>
			<td class="text_none">							
				<img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/search_button.gif" onclick="<portlet:namespace />submitForm();"/>	
			</td>
		</tr>	
		</table>		
		</td>
	</tr>
			
	<tr>
		<td class="text_none">
		<table width="100%" cellspacing="2" cellpadding="5" border="0">	
		<tr>
			<td style="padding-left:10px; padding-right:10px">
				<table width="100%" cellspacing="1" cellpadding="10" border="1" />
				<tr height="30">
					<td class="text_none" width="33%" bgcolor="#fef2da">
						<strong>&nbsp;&nbsp; Lo&#7841;i v&#259;n b&#7843;n :</strong>
					</td>
					<td class="text_none" width="34%" bgcolor="#fef2da">
						<strong>&nbsp;&nbsp; C&#417; quan ban hành :</strong>
					</td>
					<td class="text_none" bgcolor="#fef2da">
						<strong>&nbsp;&nbsp; Ng&#432;&#7901;i ký :</strong>
					</td>
				</tr>
						
				<tr height="30">
					<td class="text_none" bgcolor="#ffffff"  valign="top">
						<% 	for(int i=0;i<types.size();i++){
								VLegalType type = (VLegalType)types.get(i);		%>
						<div style="height:25px;"  valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>typeIds_<%=type.getTypeId()%>" name="<portlet:namespace/>typeIds" value="<%= type.getTypeId()%>" <%=typeIds.contains(type.getTypeId()) ? "checked" : ""%>/>
									&nbsp;&nbsp;<label for="<portlet:namespace/>typeIds_<%=type.getTypeId()%>" ><%= type.getName()%></label></div>
						<%	}	%>
					</td>
							
					<td class="text_none" bgcolor="#ffffff"  valign="top">
						<%	for(int i=0;i<organizations.size();i++)	{
								VLegalOrg org = (VLegalOrg)organizations.get(i);	%>
						<div style="height:25px;" valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>orgIds_<%=org.getOrgId()%>" name="<portlet:namespace/>orgIds" value="<%= org.getOrgId()%>" <%=orgIds.contains(org.getOrgId()) ? "checked":""%>/>
									&nbsp;&nbsp;<label for="<portlet:namespace/>orgIds_<%=org.getOrgId()%>" ><%= org.getName()%></label></div>
						<%	}	%>	
					</td>
							
					<td class="text_none" bgcolor="#ffffff" valign="top">
						<%	for(int i=0;i<signers.size();i++)	{
								VLegalSigner singer = (VLegalSigner)signers.get(i);	%>
						<div style="height:25px;"  valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>sigIds_<%=singer.getSigId()%>" name="<portlet:namespace/>sigIds" value="<%= singer.getSigId()%>" <%=sigIds.contains(singer.getSigId()) ? "checked":""%>/>
									&nbsp;&nbsp;<label for="<portlet:namespace/>sigIds_<%=singer.getSigId()%>"><%= singer.getFirstName()%> <%= singer.getLastName()%></div>
						<%	}	%>
					</td>
				</tr>
				</table>			
			</td>
		</tr>
		</table>			
		</td>				
	</tr>	
						
	<tr>
		<td style="padding-top:10px;">
			<table width="100%" cellspacing="0" cellpadding="0" border="0">
			<tr>	
				<td width="21"><img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/i_10.gif"/></td>
				<td><strong>K&#7871;t qu&#7843; tìm ki&#7871;m</strong></td>
			</tr>
			</table>
		</td>
	</tr>
				
	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
	</tr>

	<c:if test="<%= (documents == null) || (documents.size()==0) %>">
	<tr>
		<td class="text_none" align="center">
			<h4><font color="red"><strong>Không tìm th&#7845;y thông tin yêu c&#7847;u</strong></font></h4>
		</td>
	</tr>
		
	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
	</tr>	
	</c:if>


			
	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px"/>
			<table width="100%" cellspacing="1" cellpadding="5" border="0" bgcolor="#cccccc" align="center">
			<tr  height="25">
				<td class="text_none" width="110" bgcolor="#eaflf9"><div align="left"><strong>S&#7889;/kí hi&#7879;u</strong></div></td>
				<td class="text_none" width="100" bgcolor="#eaflf9"><div align="left"><strong>Ngày ban hành</strong></div></td>
				<td class="text_none" bgcolor="#eaflf9"><strong>Trích y&#7871;u</strong></td>
			</tr>
			<%	for(int i=0; i <listItem.size();i++){				
					VLegalDocument document = (VLegalDocument) listItem.get(i);
						portletURL.setParameter("docid",document.getDocId());
						portletURL.setParameter("cmd","documentview");	%>
			<tr  height="18">
				<td class="text_detail" width="60" bgcolor="#ffffff">
					<div align="left"><%=document.getNum()%>/<%= document.getSymbol()%></div>
				</td>
				<td class="text_download" width="50" bgcolor="#ffffff">
					<div align="left"><%= VAdvmanUtil.dateParser(document.getPromulDate())%></div>
				</td>		
				<td class="text_detail" bgcolor="#ffffff">			
				<%	if (document.getSummary().length()<150){	%>	
					<div><a href="<%= portletURL%>"><%= document.getSummary()%></a></div>
				<%	}else{	%>	
					<div><a href="<%= portletURL%>"><%= document.getSummary().substring(0,150)%></a>...</div>			
				<%	}	%>
				</td>
			</tr>			
			<%}	%>		
			</table>
		</td>
	</tr>

	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
	</tr>					

	<c:if test='<%= pages > 1 %>'>			
	<tr>
		<td class="text_none" height="40">
		<p>
			<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
			<% 	if(sPageNum >1){
					int intPrev = sPageNum-1;%>
					<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vlegalcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
						<portlet:param name="language" value="<%= language %>" />
						<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
						<portelt:param name="summary" value="<%= _summary %>" />
						<portlet:param name="cmd" value="<%=cmd%>" />	
						</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
			<%	}	%>
				
			
			<% 	for(int i = 1;i <= pages;i++){ 	
					if( i == sPageNum ){%>
					<strong><a class="menu_left" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
			<%	}else{	%>	
					<strong><a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
			<%	}} %>
		 	
				
			<% 	if(sPageNum < pages){
					int intNext = sPageNum + 1;	%>
					<a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=intNext%>');"  >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
			<%	}	%>		
		</td>
	</tr>
	</c:if>
					
	</table>
	</div>	
</div>		
				
<% }else if (themeType.equals("2")){%>			
		
<table cellspacing="0" cellpadding="0" border="0" width="98%" align="center">
<tr>	
	<td class="bg_title_news2">
	<table cellspacing="0" cellpadding="0" border="0" align="left" width="100%">
	<tr>
		<td width="40">&nbsp;</td>
		<td width="<%=titlePortlet.length() + 150%>" align="center" class="title_news"><%=titlePortlet%></td>
		<td>&nbsp;</td>
	</tr>
	</table>
	</td>
</tr>	
</table>	
<div>		

	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="text_none">
		<table width="90%" height="90" border="0" cellspacing="0" cellpadding="0" align="center">
		<tr>
			<td width="58">
				<img width="58" height="56" src="/vlegal-portlet/html/portlet/vlegal_display_content/images/zoom.gif" /></td>			
			<td width="10"/>
			<td>
				<table width="100%" cellspacing="0" cellpadding="0" border="0">		
				<tr><td colspan="4" height="5"></td></tr>
				<tr height="30">
					<td><strong>Ch&#7885;n l&#297;nh v&#7921;c</strong></td>
					<td>	
						<select name="<portlet:namespace/>fieldId" class="text_none">
							<option value="0">-- T&#7845;t c&#7843; các l&#297;nh v&#7921;c --</option>
							<%	if(fields != null && fields.size() >0) {
									for(int i=0; i<fields.size(); i++) {
										VLegalField vField = (VLegalField) fields.get(i);	%>
							<option value="<%= vField.getFieldId()%>" <%= _fieldId.equals(vField.getFieldId())? "selected":""%>><%=vField.getName()%></option>
							<%	}}	%>
						</select>
					</td>
					<td width="69"/>
					<td/>
				</tr>
								
				<tr height="30">
					<td><strong>N&#259;m ban hành</strong></td>
					<td>								
						<select class="text_none" name="<portlet:namespace/>pyear" disabled>
							<option value="0">-- T&#7845;t c&#7843; các n&#259;m --</option>
						</select>
					</td>
					<td width ="69"/>
					<td/>
				</tr>
											
				<tr height="30">
					<td width="100"><strong>Trích y&#7871;u</strong></td>
					<td width="100">	
						<input name="<portlet:namespace/>summary" class="text_none" type="text" value="<%= _summary %>"/>
					</td>
					<td width ="69"/>
					<td/>
				</tr>
				</table>
			</td>
		</tr>
		</table>
		</td>
	</tr>

	<tr>
		<td class="text_none">
		<table width="100%" cellspacing="2" cellpadding="5" border="0">	
		<tr>
			<td style="font-size: 12px;">
				<table width="100%" cellspacing="0" cellpadding="5" border="0">
				<tr height="30">
					<td class="text_none"><strong><label>&nbsp;&nbsp;Ban hành:</label></strong></td>
					<td class="text_none"/>
					<td/>
					<td class="text_none"/>
					<td class="text_none"/>
					<td/>
				</tr>
				</table>
			</td>
		</tr>
		
		<tr height="30">
			<td class="text_none" width="100"><label>&nbsp;&nbsp;T&#7915; ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>proDateFrom" class="text_none"  value="<%= proDateFrom %>"/>
			</td>
			<td width="40">						
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />proDateFrom,'dd/mm/yyyy',this)">
				</a>					
			</td>
			<td class="text_none" width="90"><label>&#272;&#7871;n ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>proDateTo" class="text_none" value="<%= proDateTo %>"/>
			</td>
			<td class="text_none">
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />proDateTo,'dd/mm/yyyy',this)">
				</a>					
			</td>
		</tr>
			
		<tr height="30">
			<td class="text_none"><lable>&nbsp;&nbsp;S&#7889; hi&#7879;u v&#259;n b&#7843;n:</lable></td>
			<td class="text_none">
				<input type="text" name="<portlet:namespace/>num" class="text_none" value="<%= num %>"/>
			</td>
			<td/>
			<td class="text_none" width="90"><lable>Kí hi&#7879;u v&#259;n b&#7843;n:</lable></td>
			<td class="text_none">
				<input type="text" name="<portlet:namespace/>symbol" class="text_none" value="<%= symbol %>"/>
			</td>
		</tr>
			
		<tr height="30">
			<td class="text_none"><strong><label>&nbsp;&nbsp;H&#7871;t hi&#7879;u l&#7921;c:</label></strong></td>
			<td class="text_none"/>
			<td/>
			<td class="text_none" width="90"/>
			<td class="text_none"/>
		</tr>	
					
		<tr height="30">
			<td class="text_none" width="100"><label>&nbsp;&nbsp;T&#7915; ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>expDateFrom" class="text_none" value="<%= expDateFrom%>"/>
			</td>					
			<td class="text_none" width="40">
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expDateFrom,'dd/mm/yyyy',this)">
				</a>
			</td>
			<td class="text_none" width="90"><label>&#272;&#7871;n ngày</label></td>
			<td class="text_none" width="100">
				<input type="text" name="<portlet:namespace/>expDateTo" class="text_none" value="<%= expDateTo%>"/>
			</td>
			<td class="text_none">
				<a href="javascript:void(0);">
					&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
						onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expDateTo,'dd/mm/yyyy',this)">
				</a>
			</td>
		</tr>
				
		<tr height="30">
			<td class="text_none"><label>&nbsp;&nbsp;N&#7897;i dung v&#259;n b&#7843;n:</label></td>
			<td class="text_none">
				<input type="text" name="<portlet:namespace/>content" class="text_none" value="<%= content%>"/>
			</td>
			<td class="text_none"/>
			<td class="text_none" width="90"/>
			<td class="text_none"/>
		</tr>
					
		<tr height="30">	
			<td class="text_none"/>
			<td/>
			<td class="text_none"/>
			<td class="text_none" width="90"/>
			<td class="text_none">							
				<img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/search_button.gif" onclick="<portlet:namespace />submitForm();"/>	
			</td>
		</tr>	
		</table>		
		</td>
	</tr>
			
	<tr>
		<td class="text_none">
		<table width="100%" cellspacing="2" cellpadding="5" border="0">	
		<tr>
			<td style="padding-left:10px; padding-right:10px">
				<table width="100%" cellspacing="1" cellpadding="10" border="1" />
				<tr height="30">
					<td class="text_none" width="33%" bgcolor="#fef2da">
						<strong>&nbsp;&nbsp; Lo&#7841;i v&#259;n b&#7843;n :</strong>
					</td>
					<td class="text_none" width="34%" bgcolor="#fef2da">
						<strong>&nbsp;&nbsp; C&#417; quan ban hành :</strong>
					</td>
					<td class="text_none" bgcolor="#fef2da">
						<strong>&nbsp;&nbsp; Ng&#432;&#7901;i ký :</strong>
					</td>
				</tr>
						
				<tr height="30">
					<td class="text_none" bgcolor="#ffffff"  valign="top">
						<% 	for(int i=0;i<types.size();i++){
								VLegalType type = (VLegalType)types.get(i);		%>
						<div style="height:25px;"  valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>typeIds_<%=type.getTypeId()%>" name="<portlet:namespace/>typeIds" value="<%= type.getTypeId()%>" <%=typeIds.contains(type.getTypeId()) ? "checked" : ""%>/>
									&nbsp;&nbsp;<label for="<portlet:namespace/>typeIds_<%=type.getTypeId()%>" ><%= type.getName()%></label></div>
						<%	}	%>
					</td>
							
					<td class="text_none" bgcolor="#ffffff"  valign="top">
						<%	for(int i=0;i<organizations.size();i++)	{
								VLegalOrg org = (VLegalOrg)organizations.get(i);	%>
						<div style="height:25px;" valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>orgIds_<%=org.getOrgId()%>" name="<portlet:namespace/>orgIds" value="<%= org.getOrgId()%>" <%=orgIds.contains(org.getOrgId()) ? "checked":""%>/>
									&nbsp;&nbsp;<label for="<portlet:namespace/>orgIds_<%=org.getOrgId()%>" ><%= org.getName()%></label></div>
						<%	}	%>	
					</td>
							
					<td class="text_none" bgcolor="#ffffff" valign="top">
						<%	for(int i=0;i<signers.size();i++)	{
								VLegalSigner singer = (VLegalSigner)signers.get(i);	%>
						<div style="height:25px;"  valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>sigIds_<%=singer.getSigId()%>" name="<portlet:namespace/>sigIds" value="<%= singer.getSigId()%>" <%=sigIds.contains(singer.getSigId()) ? "checked":""%>/>
									&nbsp;&nbsp;<label for="<portlet:namespace/>sigIds_<%=singer.getSigId()%>"><%= singer.getFirstName()%> <%= singer.getLastName()%></div>
						<%	}	%>
					</td>
				</tr>
				</table>			
			</td>
		</tr>
		</table>			
		</td>				
	</tr>	
						
	<tr>
		<td style="padding-top:10px;">
			<table width="100%" cellspacing="0" cellpadding="0" border="0">
			<tr>	
				<td width="21"><img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/i_10.gif"/></td>
				<td><strong>K&#7871;t qu&#7843; tìm ki&#7871;m</strong></td>
			</tr>
			</table>
		</td>
	</tr>
				
	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
	</tr>

	<c:if test="<%= (documents == null) || (documents.size()==0) %>">
	<tr>
		<td class="text_none" align="center">
			<h4><font color="red"><strong>Không tìm th&#7845;y thông tin yêu c&#7847;u</strong></font></h4>
		</td>
	</tr>
		
	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
	</tr>	
	</c:if>


			
	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px"/>
			<table width="100%" cellspacing="1" cellpadding="5" border="1" bordercolor="#999999" align="center">
			<tr height="30" bgcolor="#cccccc">
				<td class="text_none" width="110"  style="padding-left:5px;"><div align="center"><strong>S&#7889;/kí hi&#7879;u</strong></div></td>
				<td class="text_none" width="100" ><div align="center"><strong>Ngày ban hành</strong></div></td>
				<td class="text_none" ><strong>&nbsp;&nbsp;Trích y&#7871;u</strong></td>
			</tr>
			<%
					for(int i=0; i <listItem.size();i++){				
						VLegalDocument document = (VLegalDocument) listItem.get(i);
							portletURL.setParameter("docid",document.getDocId());
							portletURL.setParameter("cmd","documentview");
						
			%>
			<tr height="30">
				<td width="60" bgcolor="#ffffff" >
					<div align="center"><%=document.getNum()%>/<%= document.getSymbol()%></div>
				</td>
				<td width="50" bgcolor="#ffffff" >
					<div align="center"><%= VLegalUtil.dateParser(document.getPromulDate())%></div>
				</td>		
				<td bgcolor="#ffffff" style="padding-left:5px;">			
				<%	if (document.getSummary().length()<150){	%>	
					<div><a href="<%= portletURL%>"><%= document.getSummary()%></a></div>
				<%	}else{	%>	
					<div><a href="<%= portletURL%>"><%= document.getSummary().substring(0,150)%></a>...</div>			
				<%	}	%>
				</td>
			</tr>
			<%	}	%>
			</table>
		</td>
	</tr>

	<tr>
		<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
	</tr>					

	<c:if test='<%= pages > 1 %>'>			
	<tr>
		<td class="text_none" height="40">
		<p>
			<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
			<% 	if(sPageNum >1){
					int intPrev = sPageNum-1;%>
					<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
						<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
						<portlet:param name="language" value="<%= language %>" />
						<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
						<portelt:param name="summary" value="<%= _summary %>" />
						<portlet:param name="cmd" value="<%=cmd%>" />	
						</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
			<%	}	%>
				
			
			<% 	for(int i = 1;i <= pages;i++){ 	
					if( i == sPageNum ){%>
					<strong><a class="menu_left" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
			<%	}else{	%>	
					<strong><a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
			<%	}} %>
		 	
				
			<% 	if(sPageNum < pages){
					int intNext = sPageNum + 1;	%>
					<a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=intNext%>');"  >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
			<%	}	%>		
		</td>
	</tr>
	</c:if>		
	</table>		
		
</div>	
			
<% }else if (themeType.equals("3")){%>	
	
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
		<tr>
			<td width="17"><img height="30" width="17" src="/DB-theme/images/DB_image/9.gif"/></td>
			<td width="100%" height="30" background="/DB-theme/images/DB_image/10.gif" valign="middle" style="color: rgb(255, 255, 255); font-size: 11px; font-weight: bold; text-transform: uppercase;">&nbsp;<%=titlePortlet%></td>
		</tr>
	
		<tr>
			<td colspan="2">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td class="text_none">
				<table width="90%" height="90" border="0" cellspacing="0" cellpadding="0" align="center">
				<tr>
					<td width="58">
						<img width="58" height="56" src="/vlegal-portlet/html/portlet/vlegal_display_content/images/zoom.gif" /></td>			
					<td width="10"/>
					<td>
						<table width="100%" cellspacing="0" cellpadding="0" border="0">		
						<tr height="30">
							<td><strong>Ch&#7885;n l&#297;nh v&#7921;c</strong></td>
							<td>	
								<select name="<portlet:namespace/>fieldId" class="text_none">
									<option value="0">-- T&#7845;t c&#7843; các l&#297;nh v&#7921;c --</option>
									<%	if(fields != null && fields.size() >0) {
											for(int i=0; i<fields.size(); i++) {
												VLegalField vField = (VLegalField) fields.get(i);	%>
									<option value="<%= vField.getFieldId()%>" <%= _fieldId.equals(vField.getFieldId())? "selected":""%>><%=vField.getName()%></option>
									<%	}}	%>
								</select>
							</td>
							<td width="69"/>
							<td/>
						</tr>
										
						<tr height="30">
							<td><strong>N&#259;m ban hành</strong></td>
							<td>								
								<select class="text_none" name="<portlet:namespace/>pyear" disabled>
									<option value="0">-- T&#7845;t c&#7843; các n&#259;m --</option>
								</select>
							</td>
							<td width ="69"/>
							<td/>
						</tr>
													
						<tr height="30">
							<td width="100"><strong>Trích y&#7871;u</strong></td>
							<td width="100">	
								<input name="<portlet:namespace/>summary" class="text_none" type="text" value="<%= _summary %>"/>
							</td>
							<td width ="69"/>
							<td/>
						</tr>
						</table>
					</td>
				</tr>
				</table>
				</td>
			</tr>

			<tr>
				<td class="text_none">
				<table width="100%" cellspacing="2" cellpadding="5" border="0">	
				<tr>
					<td style="font-size: 12px;">
						<table width="100%" cellspacing="0" cellpadding="5" border="0">
						<tr height="30">
							<td class="text_none"><strong><label>&nbsp;&nbsp;Ban hành:</label></strong></td>
							<td class="text_none"/>
							<td/>
							<td class="text_none"/>
							<td class="text_none"/>
							<td/>
						</tr>
						</table>
					</td>
				</tr>
				
				<tr height="30">
					<td class="text_none" width="100"><label>&nbsp;&nbsp;T&#7915; ngày</label></td>
					<td class="text_none" width="100">
						<input type="text" name="<portlet:namespace/>proDateFrom" class="text_none"  value="<%= proDateFrom %>"/>
					</td>
					<td width="40">						
						<a href="javascript:void(0);">
							&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
								onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />proDateFrom,'dd/mm/yyyy',this)">
						</a>					
					</td>
					<td class="text_none" width="90"><label>&#272;&#7871;n ngày</label></td>
					<td class="text_none" width="100">
						<input type="text" name="<portlet:namespace/>proDateTo" class="text_none" value="<%= proDateTo %>"/>
					</td>
					<td class="text_none">
						<a href="javascript:void(0);">
							&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
								onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />proDateTo,'dd/mm/yyyy',this)">
						</a>					
					</td>
				</tr>
					
				<tr height="30">
					<td class="text_none"><lable>&nbsp;&nbsp;S&#7889; hi&#7879;u v&#259;n b&#7843;n:</lable></td>
					<td class="text_none">
						<input type="text" name="<portlet:namespace/>num" class="text_none" value="<%= num %>"/>
					</td>
					<td/>
					<td class="text_none" width="90"><lable>Kí hi&#7879;u v&#259;n b&#7843;n:</lable></td>
					<td class="text_none">
						<input type="text" name="<portlet:namespace/>symbol" class="text_none" value="<%= symbol %>"/>
					</td>
				</tr>
					
				<tr height="30">
					<td class="text_none"><strong><label>&nbsp;&nbsp;H&#7871;t hi&#7879;u l&#7921;c:</label></strong></td>
					<td class="text_none"/>
					<td/>
					<td class="text_none" width="90"/>
					<td class="text_none"/>
				</tr>	
							
				<tr height="30">
					<td class="text_none" width="100"><label>&nbsp;&nbsp;T&#7915; ngày</label></td>
					<td class="text_none" width="100">
						<input type="text" name="<portlet:namespace/>expDateFrom" class="text_none" value="<%= expDateFrom%>"/>
					</td>					
					<td class="text_none" width="40">
						<a href="javascript:void(0);">
							&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
								onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expDateFrom,'dd/mm/yyyy',this)">
						</a>
					</td>
					<td class="text_none" width="90"><label>&#272;&#7871;n ngày</label></td>
					<td class="text_none" width="100">
						<input type="text" name="<portlet:namespace/>expDateTo" class="text_none" value="<%= expDateTo%>"/>
					</td>
					<td class="text_none">
						<a href="javascript:void(0);">
							&nbsp;<img style="margin:2px" src="<%= request.getContextPath() %>/vlegal-portlet/html/portlet/images/calendar.jpg" 
								onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expDateTo,'dd/mm/yyyy',this)">
						</a>
					</td>
				</tr>
						
				<tr height="30">
					<td class="text_none"><label>&nbsp;&nbsp;N&#7897;i dung v&#259;n b&#7843;n:</label></td>
					<td class="text_none">
						<input type="text" name="<portlet:namespace/>content" class="text_none" value="<%= content%>"/>
					</td>
					<td class="text_none"/>
					<td class="text_none" width="90"/>
					<td class="text_none"/>
				</tr>
							
				<tr height="30">	
					<td class="text_none"/>
					<td/>
					<td class="text_none"/>
					<td class="text_none" width="90"/>
					<td class="text_none">							
						<img src="/html/portlet/vlegal_display_content/images/search_button.gif" onclick="<portlet:namespace />submitForm();"/>	
					</td>
				</tr>	
				</table>		
				</td>
			</tr>
					
			<tr>
				<td class="text_none">
				<table width="100%" cellspacing="2" cellpadding="5" border="0">	
				<tr>
					<td style="padding-left:10px; padding-right:10px">
						<table width="100%" cellspacing="1" cellpadding="10" border="1" />
						<tr height="30">
							<td class="text_none" width="33%" bgcolor="#fef2da">
								<strong>&nbsp;&nbsp; Lo&#7841;i v&#259;n b&#7843;n :</strong>
							</td>
							<td class="text_none" width="34%" bgcolor="#fef2da">
								<strong>&nbsp;&nbsp; C&#417; quan ban hành :</strong>
							</td>
							<td class="text_none" bgcolor="#fef2da">
								<strong>&nbsp;&nbsp; Ng&#432;&#7901;i ký :</strong>
							</td>
						</tr>
								
						<tr height="30">
							<td class="text_none" bgcolor="#ffffff"  valign="top">
								<% 	for(int i=0;i<types.size();i++){
										VLegalType type = (VLegalType)types.get(i);		%>
								<div style="height:25px;"  valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>typeIds_<%=type.getTypeId()%>" name="<portlet:namespace/>typeIds" value="<%= type.getTypeId()%>" <%=typeIds.contains(type.getTypeId()) ? "checked" : ""%>/>
											&nbsp;&nbsp;<label for="<portlet:namespace/>typeIds_<%=type.getTypeId()%>" ><%= type.getName()%></label></div>
								<%	}	%>
							</td>
									
							<td class="text_none" bgcolor="#ffffff"  valign="top">
								<%	for(int i=0;i<organizations.size();i++)	{
										VLegalOrg org = (VLegalOrg)organizations.get(i);	%>
								<div style="height:25px;" valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>orgIds_<%=org.getOrgId()%>" name="<portlet:namespace/>orgIds" value="<%= org.getOrgId()%>" <%=orgIds.contains(org.getOrgId()) ? "checked":""%>/>
											&nbsp;&nbsp;<label for="<portlet:namespace/>orgIds_<%=org.getOrgId()%>" ><%= org.getName()%></label></div>
								<%	}	%>	
							</td>
									
							<td class="text_none" bgcolor="#ffffff" valign="top">
								<%	for(int i=0;i<signers.size();i++)	{
										VLegalSigner singer = (VLegalSigner)signers.get(i);	%>
								<div style="height:25px;"  valign="middle">&nbsp;&nbsp;&nbsp;<input type="checkbox" id="<portlet:namespace/>sigIds_<%=singer.getSigId()%>" name="<portlet:namespace/>sigIds" value="<%= singer.getSigId()%>" <%=sigIds.contains(singer.getSigId()) ? "checked":""%>/>
											&nbsp;&nbsp;<label for="<portlet:namespace/>sigIds_<%=singer.getSigId()%>"><%= singer.getFirstName()%> <%= singer.getLastName()%></div>
								<%	}	%>
							</td>
						</tr>
						</table>			
					</td>
				</tr>
				</table>			
				</td>				
			</tr>	
								
			<tr>
				<td style="padding-top:10px;">
					<table width="100%" cellspacing="0" cellpadding="0" border="0">
					<tr>	
						<td width="21"><img src="/vlegal-portlet/html/portlet/vlegal_display_content/images/i_10.gif"/></td>
						<td><strong>K&#7871;t qu&#7843; tìm ki&#7871;m</strong></td>
					</tr>
					</table>
				</td>
			</tr>
						
			<tr>
				<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
			</tr>

			<c:if test="<%= (documents == null) || (documents.size()==0) %>">
			<tr>
				<td class="text_none" align="center">
					<h4><font color="red"><strong>Không tìm th&#7845;y thông tin yêu c&#7847;u</strong></font></h4>
				</td>
			</tr>
				
			<tr>
				<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
			</tr>	
			</c:if>


					
			<tr>
				<td class="text_none" style="padding-left:10px; padding-right:10px"/>
					<table width="100%" cellspacing="1" cellpadding="5" border="1" bordercolor="#999999" align="center">
					<tr height="30" bgcolor="#cccccc">
						<td class="text_none" width="110"  style="padding-left:5px;"><div align="center"><strong>S&#7889;/kí hi&#7879;u</strong></div></td>
						<td class="text_none" width="100" ><div align="center"><strong>Ngày ban hành</strong></div></td>
						<td class="text_none" ><strong>&nbsp;&nbsp;Trích y&#7871;u</strong></td>
					</tr>
					<%
							for(int i=0; i <listItem.size();i++){				
								VLegalDocument document = (VLegalDocument) listItem.get(i);
									portletURL.setParameter("docid",document.getDocId());
									portletURL.setParameter("cmd","documentview");
								
					%>
					<tr height="30">
						<td width="60" bgcolor="#ffffff" >
							<div align="center"><%=document.getNum()%>/<%= document.getSymbol()%></div>
						</td>
						<td width="50" bgcolor="#ffffff" >
							<div align="center"><%= VLegalUtil.dateParser(document.getPromulDate())%></div>
						</td>		
						<td bgcolor="#ffffff" style="padding-left:5px;">			
						<%	if (document.getSummary().length()<150){	%>	
							<div><a href="<%= portletURL%>"><%= document.getSummary()%></a></div>
						<%	}else{	%>	
							<div><a href="<%= portletURL%>"><%= document.getSummary().substring(0,150)%></a>...</div>			
						<%	}	%>
						</td>
					</tr>
					<%	}	%>
					</table>
				</td>
			</tr>

			<tr>
				<td class="text_none" style="padding-left:10px; padding-right:10px;"/>&nbsp;
			</tr>					

			<c:if test='<%= pages > 1 %>'>			
			<tr>
				<td class="text_none" height="40">
				<p>
					<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
					<% 	if(sPageNum >1){
							int intPrev = sPageNum-1;%>
							<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
								<portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/view.jsp" />
								<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
								<portlet:param name="language" value="<%= language %>" />
								<portlet:param name="groupId" value="<%= String.valueOf(groupId) %>" />
								<portelt:param name="summary" value="<%= _summary %>" />
								<portlet:param name="cmd" value="<%=cmd%>" />	
								</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>
					<%	}	%>
						
					
					<% 	for(int i = 1;i <= pages;i++){ 	
							if( i == sPageNum ){%>
							<strong><a class="menu_left" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
					<%	}else{	%>	
							<strong><a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=i%>');" > <%=i%></a></strong>
					<%	}} %>
				 	
						
					<% 	if(sPageNum < pages){
							int intNext = sPageNum + 1;	%>
							<a class="text_download" href="#" onclick="<portlet:namespace/>submitForm('<%=intNext%>');"  >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
					<%	}	%>		
				</td>
			</tr>
			</c:if>
							
			</table>
			</td>
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
</table>	
			
<%}%>
</form>
