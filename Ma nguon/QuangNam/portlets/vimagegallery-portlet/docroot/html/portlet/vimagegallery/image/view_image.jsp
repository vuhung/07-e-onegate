<!-- Javascript -->
<%@page import="com.vportal.portlet.vimagegallery.util.PortletKeyExt"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<script type="text/javascript">

	
	function <portlet:namespace />changeCategory(){		
		submitForm(document.<portlet:namespace />fm,'<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>">
			<portlet:param name="jspPage" value="/html/portlet/vimagegallery/image/edit_image.jsp" />
			</portlet:renderURL>');		
	}
	
	function <portlet:namespace />updateIsShow(selector) {

		<portlet:actionURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>" var="updateDisplay">
			<portlet:param name="jspPage" value="/html/portlet/vimagegallery/image/edit_image.jsp" />
			<portlet:param name="cmd" value="update_isShow" />
		</portlet:actionURL>
		//updateIsShow		
		myCheckBox = document.getElementById("<portlet:namespace/>check_" + selector);
		url = "<%= updateDisplay %>";
		url = url + "&id=" + selector;
		url = url + "&isShow=" + (myCheckBox.checked ? 'true' : 'false');
		AjaxUtil.update(url, "ajax");
	}
	
</script>
<div id="ajax" style="display: none">
</div>
<!-- Java -->
<%	
	String name = ParamUtil.getString(request,"name");		
	String strCategoryId = ParamUtil.getString(request,"categoryId","0");
		
	long categoryId = 0;
	List listImageByCategory = new ArrayList();
	List listCategory = new ArrayList();	
	
	if (!strCategoryId.equals("0")){		
        listImageByCategory = TFImageServiceUtil.getByG_C(groupId, Long.parseLong(strCategoryId));
	}else{		
		listImageByCategory = (List)TFImageServiceUtil.getByGroupId(groupId);
		
	}		
	
	listCategory = TFCategoryServiceUtil.getByGroupId(groupId);
	String portletId= portletDisplay.getId();
	boolean showAddImageButton = showButtons && PortletPermissionUtil
			.contains(permissionChecker , plid.longValue() , PortletKeyExt.VIMAGEGALLERY , "ADD_IMAGE_");
 
	%>

<%
	PortletURL imageURL = renderResponse.createRenderURL();
	imageURL.setParameter("jspPage", "/html/portlet/vimagegallery/image/view_image.jsp");
	imageURL.setParameter("tabs1", tabs1);
	PortletURL portletURL1 = renderResponse.createRenderURL();
	portletURL1.setParameter("jspPage", "/html/portlet/vimagegallery/image/edit_image.jsp");
	portletURL1.setParameter("tabs1", tabs1);
	List headerNames = new ArrayList();
	headerNames.add("thumbnail");
	headerNames.add("name");
	headerNames.add("Hi\u1ec3n th\u1ecb");
	headerNames.add("Ng\u00e0y t\u1ea1o");
	headerNames.add("");

	SearchContainer searchCtn = new SearchContainer(renderRequest,
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 8, imageURL,
			headerNames, null);
	searchCtn.setEmptyResultsMessage("there-are-no-image");	
	
	List results = new ArrayList();
	int total = 0;
	for (int i = 0; i < listImageByCategory.size(); i++) {
		TFImage image = (TFImage) listImageByCategory.get(i);
		results.add(image);
	}

	results = ListUtil.subList(results, searchCtn.getStart(), searchCtn.getEnd());
	total = results.size();
	
	searchCtn.setResults(results);	
	searchCtn.setTotal(total);

	List resultRows = searchCtn.getResultRows();
	for (int i = 0; i < results.size(); i++) {

		TFImage image = (TFImage) results.get(i);
		ResultRow row = new ResultRow(image, Long.toString(image.getId()), i);
		boolean isShow = image.getIsShow();
		
		PortletURL rowURL = renderResponse.createRenderURL();
		rowURL.setWindowState(WindowState.MAXIMIZED);
		rowURL.setParameter("jspPage", "/html/portlet/vimagegallery/image/view_image.jsp");
		rowURL.setParameter(Constants.CMD, "showupdate");
		rowURL.setParameter("id", Long.toString(image.getId()));
		rowURL.setParameter("redirect", currentURL);

		//Image
		row.addJSP(SearchEntry.DEFAULT_ALIGN,SearchEntry.DEFAULT_VALIGN,
			"/html/portlet/vimagegallery/image/image_thumbnail.jsp", application, request, response);
		//Name & Description
		StringBuffer sb = new StringBuffer();
		sb.append("<p ");		
		sb.append("><b>");
		sb.append(image.getName());
		sb.append("</b>");

		if (Validator.isNotNull(image.getDescription())) {
			sb.append("<br>");
			sb.append("<span style=\"font-size: xx-small;\">");
			sb.append(image.getDescription());
			sb.append("</span>");
		}
		sb.append("</p>");
		row.addText(sb.toString());	
				
		if (image.getIsShow()){
			row.addText("<img src='" + themeDisplay.getPathThemeImage() + "/vlegal/enabled.gif' valign='middle'/>");
			
		} else {
			row.addText("");
		}
		//created date		
		TextSearchEntry rowCreatedate = new TextSearchEntry(SearchEntry.DEFAULT_ALIGN, 
			SearchEntry.DEFAULT_VALIGN,	VImagegalleryUtil.dateParser(image.getCreateDate()));
			row.addText(rowCreatedate);

		// add image Action
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN,"/html/portlet/vimagegallery/image/image_action.jsp", application, request, response);
		resultRows.add(row);
	}
%>
<input name="<portlet:namespace />cmd" type="hidden" value="">
<input name="<portlet:namespace />id" type="hidden" value="">
<input name="<portlet:namespace />isShow" type="hidden" value="">	
<input name="<portlet:namespace />redirect" type="hidden" value="<%= currentURL %>">
	
<!--Commbo category -->
<div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px">
	<!-- Check listCategory -->	
	<select name="<portlet:namespace />categoryId" style=" width: 150px;" onChange="javascript:<portlet:namespace />changeCategory();"> 
		<c:if test="<%= (listCategory !=null) && (listCategory.size() != 0 )%>">
			<option value="0">-- T&#7845;t c&#7843; --</option>
			<%	for (int i = 0; i < listCategory.size(); i++) {
				TFCategory category = (TFCategory) listCategory.get(i);	%>					
				<option value="<%= category.getId() %>" <%= (String.valueOf(category.getId()).equals(strCategoryId)) ? "selected":"" %>><%=category.getName()%></option>
			<%	}	%> 
			</c:if>	
</div>
<br>
<br>	
				
<!--Check permission view Add button -->
<c:if test='<%= showAddImageButton%>'>
	<div class="portlet-font" style="font-weight: bold; float: left; margin-right: 10px">	
		<c:if test="<%=(listCategory==null)  || (listCategory.size() == 0)%>">
			<input class="portlet-form-button" type="button" value="<%= LanguageUtil.get(pageContext, "VImageGallery.form.addImage") %>"
			onclick="window.location.href='<%= portletURL1.toString() %>'"/>
<%-- 				onclick="javascript:<portlet:namespace />alert()"/> --%>
		</c:if>
		<c:if test="<%= (listCategory != null) && (listCategory.size() != 0)%>">
			<input  type="button" value="<liferay-ui:message key="add-image"/>"
			onclick="window.location.href='<%= portletURL1.toString() %>'"/>
<%-- 				onclick="javascript:document.location='<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"> --%>
<%-- 					<portlet:param name="tabs1" value="<%= LanguageUtil.get(pageContext, \"VImageGallery.form.image\") %>" /> --%>
<%-- 					<portlet:param name="jspPage" value="/html/portlet/vimagegallery/view.jsp" />					 --%>
<%-- 					<portlet:param name="redirect" value="<%= currentURL %>"/> --%>
<%-- 					<portlet:param name="cmd" value="doadd" /> --%>
<%-- 				</portlet:renderURL>';"/> --%>
		</c:if>	
	</div>
</c:if>
	
<!--Button viewSlideshow-->
<div class="portlet-font" style="float: left; margin-right: 10px">
	<c:if test="<%= (listImageByCategory !=null) && (listImageByCategory.size() != 0)%>">
		<input class="portlet-form-button" type="button" 
			value='<%= LanguageUtil.get(pageContext, "VImageGallery.form.slideShow") %>' 
			onClick="var slideShowWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
			<portlet:param name="jspPage" value="/html/portlet/vimagegallery/view_slide_show.jsp" />		
			</portlet:renderURL>', 'slideShow', 'directories=no,location=no,menubar=no,resizable=yes,scrollbars=no,status=no,toolbar=no'); void(''); slideShowWindow.focus();">		
	</c:if>
</div>	

<br>
<br>
<liferay-ui:search-iterator searchContainer="<%= searchCtn %>" />
<br>
