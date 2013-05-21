<%@ include file="/html/taglib/init.jsp" %>
<%@page import="com.vportal.portal.model.Attachment"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.vportal.portal.service.AttachmentServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.NoSuchFileEntryException"%>

<%
	List attachmentList = (List)request.getAttribute("vportal:filedownload:attachmentList");
	
	if(attachmentList == null){
		attachmentList = new ArrayList();
	}

	String displayStyle = (String)request.getAttribute("vportal:filedownload:displayStyle");
	
%>

<div class="file_download">
	<%if (attachmentList.size() > 0) {%>		
		<table width="100%" border="0" cellspacing="4" cellpadding="4" style="margin-left:4px">
			<% 
				for (int i=0; i < attachmentList.size(); i++) { 
					Attachment att = (Attachment)attachmentList.get(i);
					DLFileEntry entry = null;
									
					try{
						entry = (DLFileEntry)DLFileEntryLocalServiceUtil.getFileEntry(att.getFileEntryId());
					}catch(NoSuchFileEntryException ex){
						System.out.println("Not exist file entry...");
					}
					
					if(entry != null){
					long folderId = entry.getFolderId();
					String name = entry.getName();
					
					String fileExtension = entry.getTitle();
				
					String extension = fileExtension.substring(fileExtension.lastIndexOf(".")+1,fileExtension.length());
					//String extension = entry.getExtension();
					
			%>
					<tr id="pos_<%= entry.getFileEntryId() %>">
						<td>
							<a href="/c/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %>&folderId=<%= folderId %>&name=<%= name %>">
								<img src="<%=themeDisplay.getPathThemeImage()%>/document_library/<%=extension%>.png"/><%=fileExtension  %>
							</a>
						</td>
					</tr>
			<% }
		} %>
		</table>
	<%
		}
	%>
</div>
<br/>