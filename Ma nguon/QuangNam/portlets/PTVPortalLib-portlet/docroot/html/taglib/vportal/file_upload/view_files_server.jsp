<%@ include file="init.jsp" %>
<%

	List listFiles = (List)request.getAttribute("LIST_FILE_BY_FOLDER_ID");
	String folderId = (String)request.getAttribute("FOLDER_ID");
	String keyword = (String)request.getAttribute("KEY_WORD");
	
	String vsiFolderName = "vsi-portlet-folder";
	
	DLFolder dlfolder = DLFolderServiceUtil.getFolder(14, 0 , vsiFolderName);
	
	List vsiFolders = (List)DLFolderLocalServiceUtil.getFolders(14, dlfolder.getFolderId());
	
	if(vsiFolders == null){
		vsiFolders = new ArrayList();
	}
	
	if(listFiles == null){
		listFiles = new ArrayList();
	}
%>
<div id="list-files-by-folder" >
<table border="0" cellspacing="0" cellpadding="4" width="100%">
		<tr class="portlet-section-body">
		  <td colspan="4" align="right" valign="top">
			<strong>T&igrave;m ki&#7871;m File : </strong>
	      		<input name="search_file" id="search_file" type="text" size="40" maxlength="100" value="<%=Validator.isNotNull(keyword)?keyword:""%>"/>
				<img src="/html/taglib/vportal/file_upload/images/filefind.png" onclick="javascript:searchFiles(<%=folderId%>);" style="cursor:pointer;" alt="Tìm ki&#7871;m File"/>
		  </td>
 	 </tr>
</table>
<table border="0" cellspacing="0" cellpadding="4" width="100%" align="center">
	<tr>
		<td width="27%" valign="top">
		<b>Th&#432; m&#7909;c trên Server :</b>
			<%if(vsiFolders != null && vsiFolders.size()>0){%>
				<table border="0" cellspacing="0" cellpadding="4" width="100%">
						<%
						for(int i=0;i<vsiFolders.size();i++){
							DLFolder folder = (DLFolder)vsiFolders.get(i);
						%>
							<tr>
								<td style="font-weight:bold">
									<img src="/html/taglib/vportal/file_upload/images/folder.png"/> <a href="javascript:void(0);" onclick="javascript:getFilesByFolder(<%=folder.getFolderId()%>);"><%=folder.getName()%></a>
								</td>
							</tr>
						<%}
					%>
				</table>
			<%}%>
		</td>
		
		<td valign="top" style="padding-left: 10px; border-left:1px dotted gray">
				<table border="0" cellspacing="0" cellpadding="4" width="100%">
						<tr>
							<td colspan="4">
								<div id="progressbar-load-files" style="display:none" align="center">
									<img src="/html/taglib/vportal/file_upload/images/progressbar.gif"/>								</div>							</td>
						</tr>
						<tr class="portlet-section-header">
							<td align="center">
								<b>STT</b>							</td>
							<td>
								<b>Tên file trong th&#432; m&#7909;c</b>							</td>
							<td>
								<b>Size</b>							</td>
							<td></td>
						</tr>

						<%if(listFiles != null && listFiles.size()>0){
							for (int i = 0; i < listFiles.size(); i++) {
								DLFileEntry entryFile = (DLFileEntry)listFiles.get(i);

								StringBuffer sb = new StringBuffer();
								
								/* String title = entryFile.getTitleWithExtension();
								int fileSize = entryFile.getSize()/1000;
								String extension = title.substring(title.lastIndexOf(".")+1,title.length()); */
								String title = entryFile.getName() +"" + entryFile.getExtension();
								long fileSize = entryFile.getSize()/1000;
								String extension = title.substring(title.lastIndexOf(".")+1,title.length()); 
								
						%>
							<tr class='<%=(i%2==0)?"portlet-section-body":"portlet-section-alternate"%>'>
								<td  width="1%">
									<b><%=i%></b>								</td>
								<td width="80%">
									<a href="javascript:void(0);" onclick="" title="T&#7843;i v&#7873;">
										<img src="<%=themeDisplay.getPathThemeImage()%>/document_library/<%=extension%>.png"/>
											<span id="file_<%=entryFile.getFolderId()%>_<%=entryFile.getFileEntryId()%>"><b><%=title%></b></span>									</a>								</td>
								<td  width="5%">
									<b><%=String.valueOf(fileSize)%></b>Kb								</td>
								<td  width="5%">
									<b><a href="javascript:void(0);" onclick='javascript:selectFileFolder("<%=title%>","<%=entryFile.getFileEntryId()%>")'>[Ch&#7885;n]</a></b>								</td>
							</tr>
						<%	
							}
						}else{
						%>
							<b>Không tìm th&#7845;y File...</b>
						<%}%>
					</table>
		</td>
	</tr>
	<tr>
		<td valign="top" colspan="2">
			<div id="selected_file_popup"></div>
		</td>
	</tr>
	<tr>
		<td valign="bottom" align="right" colspan="2">
		</td>
	</tr>
</table>
<table border="0" cellspacing="0" cellpadding="4" width="100%" valign="bottom">				
	<tr>
		<td valign="bottom" align="right">
			<img src="/html/taglib/vportal/file_upload/images/exit.png" style="cursor:pointer" title="&#272;óng c&#7917;a s&#7893;" onclick="javascript:closeLiferayPopup()"/>
		</td>
	</tr>
</table>
</div>
