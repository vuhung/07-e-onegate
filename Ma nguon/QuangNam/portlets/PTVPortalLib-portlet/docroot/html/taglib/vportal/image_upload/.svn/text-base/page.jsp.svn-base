<%@ include file="/html/taglib/init.jsp" %>
<%@page import="com.liferay.portlet.imagegallery.model.IGImage"%>

<%
	List imageList = (List)request.getAttribute("vportal:imageupload:imageList");
	String title = (String)request.getAttribute("vportal:imageupload:title");
	String description = (String)request.getAttribute("vportal:imageupload:description");
	int maxImage = (Integer)request.getAttribute("vportal:imageupload:maxImage");
%>

<div class="image_upload">
	<% if (imageList.size() > 0) { %>
		<ul>
			<% 
				for (int i=0; i < imageList.size(); i++) { 
					IGImage att = (IGImage)imageList.get(i);
			%>
					<li>
						<img src="<%= themeDisplay.getPathImage() %>/image_gallery?img_id=<%= att.getLargeImageId() %>" />
					</li>
			<% } %>
		</ul>
	<% } %>
	<% if (imageList.size() < maxImage) { %>
		<div id="upload_box">
			<div class="upload_elem">
				<% if (title!= null && !title.equals("")) { %>
				<div class="upload_title">
					<%= title %>
					<input type="text" name="title_0" value="" />
				</div>
				<% } %>
				<% if (description!= null && !description.equals("")) { %>
				<div class="upload_desc">
					<%= description %>
					<input type="text" name="description_0" value="" />
				</div>
				<% } %>
				<div class="upload_browse">
					<input type="file" name="image_0" value="" />
				</div>
			</div>
		</div>
	<% } %>
</div>