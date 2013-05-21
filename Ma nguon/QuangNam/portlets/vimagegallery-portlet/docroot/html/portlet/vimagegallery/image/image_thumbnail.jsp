<%@ include file="/html/portlet/vimagegallery/init.jsp" %>	
<!-- CSS view image -->
<style type="text/css">
	.thumbnail{
		position: relative;
		z-index: 0;
	}

	.thumbnail:hover{
		background-color: transparent;
		z-index: 50;
	}

	.thumbnail span{ /*CSS for enlarged image*/
		position: absolute;
		background-color: white;
		padding: 5px;
		left: -1000px;
		border: 1px dashed gray;
		visibility: hidden;
		color: black;
		text-decoration: none;
	}

	.thumbnail span img{ /*CSS for enlarged image*/
		border-width: 0;
		padding: 2px;
	}

	.thumbnail:hover span{ /*CSS for enlarged image on hover*/
		visibility: visible;
		top: 0;
		left: 60px; /*position where enlarged image should offset horizontally */
	}
</style>	

<%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TFImage image = (TFImage)row.getObject();
%>

<a class="thumbnail" href="<%= themeDisplay.getPathImage() %>/vimagegallery?img_id=<%= image.getImage() %>&large=1" target="_blank">
	<img border="1" width="80" height="60" src="<%= themeDisplay.getPathImage() %>/vimagegallery?img_id=<%= image.getImage() %>&small=1">
	<span><img src="<%= themeDisplay.getPathImage()%>/vimagegallery?img_id=<%= image.getImage()%>" /><br /><%=image.getDescription()%></span>
</a>	
