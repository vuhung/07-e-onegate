<%@ include file="/html/portlet/vadvman/init.jsp" %>
<%	
	String redirect = ParamUtil.getString(request, "redirect");
	String itemId = (String)request.getAttribute("itemId");
	String extension = StringPool.BLANK;
	try {
		if(Validator.isNotNull(itemId)){

			AdvItem item = AdvItemServiceUtil.getItem(Long.parseLong(itemId));
			AdvType type = AdvTypeServiceUtil.getType(item.getTypeId());


			DLFileEntry fileEntry = DLFileEntryServiceUtil.getFileEntry(item.getFolderId(),item.getName());		
			extension = FileUtil.getExtension(fileEntry.getName());
		
			//Check format file to show
			boolean validImageExtension = false;	

			String[] imageExtensions = PropsUtil.getArray(PropsKeys.IG_IMAGE_EXTENSIONS);	
			String extensionFile = "."+DLUtil.getFileExtension(item.getName());	

			for (int i = 0; i < imageExtensions.length; i++) {		
				if (extensionFile.equals(imageExtensions[i])) {
					validImageExtension = true;
				}
			}

%>
<input name="<portlet:namespace />redirect" type="hidden" value="<%= currentURL %>"/>
	
<table class="lfr-table" width="100%">
<tr>
	<td width="50%" valign="top">		
		<fieldset style="border:1px dotted gray;">
		<legend><strong>Thông tin qu&#7843;ng cáo</strong></legend>
		<table class="lfr-table">
			<tr>
				<td><b>Tên file:</b></td>
				<td><%= item.getName()%></td>		
			</tr>
				
			<tr>
				<td><b>Mô t&#7843;:</b></td>				
				<td><%= item.getDescription()%></td>
			</tr>
				
			<tr>
				<td><b>&#272;&#432;&#7901;ng d&#7851;n:</b></td>
				<td><%= item.getUrl()%></td>
			</tr>			
			
			<tr>
				<td colspan="2"><br/></td>
			</tr>
				
			<tr>
				<td><b>Ki&#7875;u qu&#7843;ng cáo:</b></td>
				<td><%= type.getName()%></td>
			</tr>	
				
			<tr>
				<td><b>Kích th&#432;&#7899;c:</b></td>
				<td><%= fileEntry.getSize()%> k</td>
			</tr>
				
			<tr>
				<td><b>Download</b></td>
				<td>
					<img src="<%= themeDisplay.getPathThemeImage() %>/document_library/<%=extension%>.png"/ title="<%=extension%>">
					<a href="/c/document_library/get_file?p_l_id=<%= layout.getPlid()%>&folderId=<%=item.getFolderId()%>&name=<%=item.getName()%>"><font color="blue"><%= fileEntry.getTitle()%></font></a></td>
			</tr>
				
			<c:if test="<%=(item.isExpired())%>">
			<tr>
				<td colspan="2"><font color="red"><b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n !</b></font></td>
			</tr>
			</c:if>	
		
		</table>
		</fieldset>
	</td>
				
	<td width="50%">
		<table class="lfr-table" align="center">	
		<tr>
			<!--Display Image-->
			<c:if test="<%= validImageExtension  %>">
				<td>
					<div>
						<img src="<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(item.getName())) %>">
					</div>
				</td>
			</c:if>
			<!--Display Flash & Video-->
			<c:if test="<%= !validImageExtension %>">
				<td>
					<script type="text/javascript" src="/html/portlet/vadvman/swfobject.js"></script>
					  <div id="preview">This div will be replaced</div>
					  	  
					  <script type="text/javascript">
						  var s1 = new SWFObject("/html/portlet/vadvman/player.swf","ply","470","300","9","#ffffff");
						  var fileURL = encodeURIComponent("<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(item.getName())) %>");						  
						  s1.addParam("allowfullscreen","false");
						  s1.addParam("allowscriptaccess","always");
						  s1.addParam("wmode","opaque");
						  s1.addParam("flashvars",'&file=' + fileURL +  '&controlbar=none&autostart=true');
						  s1.write("preview");
					</script>
				</td>
			</c:if>
		</tr>	
		</table>
	</td>
</tr>
</table>
	
<%
		}
	} catch(Exception ex){
		out.println("<b>File qu&#7843;ng cáo này không t&#7891;n t&#7841;i !</b><br/>");
	}
%>

<br/>	
<input type="button" class="portlet-form-button" value="<liferay-ui:message key="back"/>" onClick="self.location = '<%= redirect %>';" >