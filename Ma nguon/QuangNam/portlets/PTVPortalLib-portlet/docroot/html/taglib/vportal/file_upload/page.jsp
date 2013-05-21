<%@ include file="/html/taglib/init.jsp" %>
<%@page import="com.liferay.documentlibrary.NoSuchFileException"%>
<%@page import="com.liferay.portlet.documentlibrary.NoSuchFileEntryException"%>
<%@page import="com.vportal.portal.attachment.AttachmentManager"%>
<%@page import="com.vportal.portal.model.Attachment"%>	
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.vportal.portal.service.AttachmentLocalServiceUtil"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<liferay-theme:defineObjects />
<portlet:actionURL  name="deleteFileDL" var="deleteFileDLUrl">
</portlet:actionURL>
<script language="javascript">
	var fileHtml;
	var fileHtmlPopup;
	var arrFileIds = "";
	var fileServerBox;
	
	function deleteAttachment(folderId, name,companyId,attachmentId, position) {
	     jQuery("#progressbar-delete-file").fadeIn("fast");
		//delete document
		jQuery.ajax(
			{
				type: 'POST',
				url: '<%= deleteFileDLUrl %>',
				data: {
				   folderId: folderId,
				   name: name,
				   attachmentId: attachmentId
				},
				success: function(){
				  	jQuery("#" + position).css("display", "none"),
					jQuery("#progressbar-delete-file").fadeOut("fast"),
					jQuery("#delete-content").fadeIn("fast"),
					jQuery("#delete-content").animate({opacity: "1"}, 2000),
					jQuery("#delete-content").fadeOut("fast")
				}
			}
		);
		//add upload field
		attached =  document.getElementById("upload_attached");
		currentId = attached.value;
		attached.value ++;
		
		if (document.getElementById("upload_box").childNodes.length < 2) {
			insertedText = "<div class=\"upload_browse\"><input type=\"file\" name=\"file_0\" value=\"\" /></div>";
			insertedText = "<div class=\"upload_elem\">" + insertedText + "<div>";
		} else {
			insertedText = document.getElementById("upload_box").childNodes[1].innerHTML;
			insertedText = insertedText.replace("title_0", "title_" + currentId);
			insertedText = insertedText.replace("description_0", "description_" + currentId);
			insertedText = insertedText.replace("file_0", "file_" + currentId);
			insertedText = "<div class=\"upload_elem\">" + insertedText + "<div>";
		}
		originalFields = document.getElementById("upload_box");
		originalFields.innerHTML = originalFields.innerHTML + insertedText;
		
	}
	
	function uploadFile(valueBox){
		
		var filename = document.getElementById(valueBox).value;
		
		if(filename == ""){
			alert("Ban hay chon duong dan File truoc khi Upload...");
			document.getElementById(valueBox).focus();
			return;
		}else{
			jQuery("#progressbar-upload-file").fadeIn("fast");
		}
	
	}
	function browserFileServer(){
		fileServerBox = Liferay.Popup({modal:true, title: '<%= LanguageUtil.get(pageContext, "taglib.uploadfile.browser-server") %>', width: 850,height: 400});
		url = "<%= themeDisplay.getPathMain() %>/document_library/taglib_browser_file_server";
		AjaxUtil.update(url, fileServerBox , {onComplete: function(){Liferay.Popup.center()}});
	}
	
	function getFilesByFolder(folderId){
			//delete document
		url = "/c/document_library/taglib_browser_file_server?cmd=get_files";
		url = url + "&folderId=" + folderId;
		//url = "";
		
		//alert(url);
		jQuery("#progressbar-load-files").fadeIn("fast");
		
		AjaxUtil.update(url,"list-files-by-folder", 
				{
					onComplete: function()
					{
						jQuery("#progressbar-load-files").fadeOut("fast"),
						jQuery("#selected_file_popup").append(document.getElementById("selected_file_folder").innerHTML)
					}
	 			}
		);
		
	}

	function selectFileFolder(fileName,fileId){
		var extension = fileName.substring(fileName.lastIndexOf(".")+1,fileName.length);
		arrFileIds = arrFileIds + fileId + ",";
		
		fileHtml = "<div id="+fileId+"><img src='<%=themeDisplay.getPathThemeImage()%>/document_library/"+extension+".png'/><b>"+fileName+"</b>" + "  <img src='/html/taglib/vportal/file_upload/images/button_cancel.png' style='cursor:pointer' onclick='javascript:deleteFileSelected("+fileId+")'/></div>";
		fileHtmlPopup = "<div id="+fileId+"_popup ><img src='<%=themeDisplay.getPathThemeImage()%>/document_library/"+extension+".png'/><b>"+fileName+"</b>" + "  <img src='/html/taglib/vportal/file_upload/images/button_cancel.png' style='cursor:pointer' onclick='javascript:deleteFileSelected("+fileId+")'/></div>";		
		
		jQuery("#selected_file_folder").fadeIn("fast");
		jQuery("#selected_file_folder").append(fileHtml);
		jQuery("#selected_file_popup").append(fileHtmlPopup);
		
		document.getElementById("listFileIds").value = arrFileIds;
	}
	
	function deleteFileSelected(fileId){
		jQuery("#"+fileId).fadeOut("fast");
		jQuery("#"+fileId+"_popup").fadeOut("fast");
		arrFileIds = arrFileIds.replace(fileId+",","");
		
		document.getElementById("listFileIds").value = arrFileIds;
	}
	
	function closeLiferayPopup(){
		 Liferay.Popup.close(fileServerBox);
	}
	
	function searchFiles(folderId){
			var keyword = document.getElementById("search_file").value;
			url = "/c/document_library/taglib_browser_file_server?cmd=search_files";
			url = url + "&folderId=" + folderId;
			url = url + "&keyword=" + keyword;
			//url = "";
			
			//alert(url);
			jQuery("#progressbar-load-files").fadeIn("fast");
			
			AjaxUtil.update(url,"list-files-by-folder", 
					{
						onComplete: function(){
							jQuery("#progressbar-load-files").fadeOut("fast"),
							jQuery("#selected_file_popup").append(document.getElementById("selected_file_folder").innerHTML)
							document.getElementById("search_file").focus();
						}
				}
			);
	}
</script>	

<%
	List attachmentList = (List)request.getAttribute("vportal:fileupload:attachmentList");
	if (attachmentList == null) {
		attachmentList = new ArrayList();
	}
	String title = (String)request.getAttribute("vportal:fileupload:title");
	String description = (String)request.getAttribute("vportal:fileupload:description");
	int maxAttachment = (Integer)request.getAttribute("vportal:fileupload:maxAttachment");
	int style = (Integer)request.getAttribute("vportal:fileupload:style");	
%>

<div id="delete-content" style="display:none">
	<b>File &#273;ã &#273;&#432;&#7907;c xóa thành công...</b>
</div>
<div id="delete-content" style="display:none">
	<b>File &#273;ã upload xóa thành công...</b>
</div>
<div id="progressbar-delete-file" style="display:none">
	<img src="/html/taglib/vportal/file_upload/images/progressbar.gif"/> <b>&#272;ang xóa file...</b>
</div>
<div id="progressbar-upload-file" style="display:none">
	<img src="/html/taglib/vportal/file_upload/images/progressbar.gif"/> <b>&#272;ang upload file...</b>
</div>
<table border="0" cellspacing="0" cellpadding="4" width="100%" valign="bottom">				
	<tr>
		<% if(style==1){%>		
		<td align="left" width="40%">
		<%} else {%>
		<td>	
		<%}%>
			<div class="file_upload">
					<% if (attachmentList.size() > 0) { %>
						<table>
							<% 
								for (int i=0; i < attachmentList.size(); i++) { 
									Attachment att = (Attachment)attachmentList.get(i);
									DLFileEntry entry = null;
									
									try{
										entry = (DLFileEntry)DLFileEntryLocalServiceUtil.getFileEntry(att.getFileEntryId());
									}catch(NoSuchFileEntryException ex){
									AttachmentLocalServiceUtil.deleteAttachment(att
				.getAttachmentId());
										System.out.println("Not exist file entry...");
									}
									
									if(entry != null){
									long folderId = entry.getFolderId();
									String name = entry.getName();
									//hoan
										//String extension = entry.getExtension();
										String fileExtension =entry.getTitle();
										String extension = fileExtension.substring(fileExtension.lastIndexOf(".")+1,fileExtension.length());
									//hoan
							%>
									<tr id="pos_<%= att.getAttachmentId() %>">
										<td>
											<a href="/c/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %>&folderId=<%= folderId %>&name=<%= name %>"><img src="<%=themeDisplay.getPathThemeImage()%>/document_library/<%=extension%>.png"/><%= entry.getTitle() %></a>
										</td>
										<td>
											<a href="#<%= att.getFileEntryId() %>" onclick="deleteAttachment('<%= folderId %>', '<%= name %>',<%=entry.getCompanyId()%>,<%=att.getAttachmentId()%>,'pos_<%= att.getAttachmentId() %>');" style="margin-left: 10px;">
												<img valign="absmiddle" src="/html/taglib/vportal/file_upload/images/button_cancel.png" />												
											</a>
										</td>
									</tr>
							<% }
							} %>
						</table>
					<% } %>
					<div id="upload_box">
						<% if (attachmentList.size() < maxAttachment) { 
							for (int i=0; i < (maxAttachment - attachmentList.size()); i++) { 
						%>
								<div class="upload_elem">
									<div class="upload_browse">
										<input type="file" name="file_<%= i %>" value="" id="file_<%= i %>"/>
										<!--<input type="button" name="Upload" value="Upload..." onclick="javascript:uploadFile('file_<%= i %>');"/>-->
									</div>
								</div>
						<% }
						} %>
					</div>
					<input type="hidden" name="attached" id="upload_attached" value="<%= maxAttachment - attachmentList.size() %>" />
					<input type="hidden" name="listFileIds" id="listFileIds" value="" />
				</div>
		</td>
		<% if (style==1){%>
		<td>	
		</td>
		<% } %>
	</tr>
</table>

