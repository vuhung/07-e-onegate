
<ul>
	<% 
		for (int i=0; i < attachmentList.size(); i++) { 
			Attachment att = (Attachment)attachmentList.get(i);
			DLFileEntry entry = DLFileEntryLocalServiceUtil.getFileEntry(att.getFileEntryId());
	%>
			<li id="pos_<%= entry.getFileEntryId() %>">
				<a href="/c/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %>&folderId=<%= entry.getFolderId() %>&name=<%= entry.getName() %>">
					<%= entry.getName() %>
				</a>
			</li>
	<% } %>
</ul>