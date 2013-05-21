<%@ include file="/html/portlet/view_vclip/init.jsp" %>	
<%
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("jspPage","/html/portlet/view_vclip/edit.jsp");	
%>
<script type="text/javascript">
	function <portlet:namespace />savePreferences() {
		submitForm(document.<portlet:namespace />fm);
	}
</script>
<script type = "text/javascript">
	function <portlet:namespace/>submitForms(){
		submitForm(document.<portlet:namespace/>fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString()%>">
													<portlet:param name = "jspPage" value = "/html/portlet/view_vclip/edit.jsp" />
													<portlet:param name ="<%=Constants.CMD%>" value = "<%=Constants.UPDATE%>" />
													</portlet:renderURL>');
	}

</script>
<%	
	String redirect = ParamUtil.getString(request, "redirect");
	String displayStyle = prefs.getValue("displayStyle", "1");
	List listCategory = ClipTypeServiceUtil.findAll();	

%>
<portlet:actionURL name="EditPreferenceAction" var="EditPreferenceActionURL"/>
<form  action="<%= EditPreferenceActionURL.toString() %>" name="<portlet:namespace />fm" method="POST">			
	<input name="<portlet:namespace />cmd" type="hidden" value="update">
<%-- 	<input name="<portlet:namespace />redirect" type="hidden" value="<%= currentURL %>" />	 --%>
				
	
	
<!--Style 02-->
<fieldset style="border:1px dotted gray">
<legend><b><%= LanguageUtil.get(pageContext, "vclipview.form.selectCategorys") %></b></legend>		
	
		<table class="lft-table">			
			<%
				List cats = new ArrayList();
				if(Validator.isNotNull(selectCategories))
					for(int j=0;j<selectCategories.length;j++){
						cats.add(selectCategories[j]);
					}
				
				for(int i=0;i<listCategory.size();i++){
					ClipType category = (ClipType)listCategory.get(i);
			%>		
				<tr>
					<td>
						<input type="checkbox" value="<%=category.getId()%>" name="<%= renderResponse.getNamespace()%>selectCategories" 
							<%= (cats.contains(String.valueOf(category.getId())) ? "checked":"" )%>/>
					</td>
					<td><%=category.getName()%></td>
				</tr>
			<%		
				}
			%>
			<tr><td colspan="2"> &nbsp </td></tr>			
		</table>
</fieldset>	
<br>
<fieldset>
	<legend><b>C&#7845;u hình ki&#7875;u hi&#7875;n th&#7883;</b></legend>
	<table>	
	<tr>
			<td>
				Ki&#7875;u hi&#7875;n th&#7883; (style 1): 			
			</td>
			<td>
				<input type="radio" name="<portlet:namespace/>displayStyle" value= "1" <%= displayStyle.equals("1")?"checked":"" %>/>	
				</td>
				<td>
				 		    <td>  (style 2): </td>
				<td><input type="radio" name="<portlet:namespace/>displayStyle" value= "2" <%= displayStyle.equals("2")?"checked":"" %>/>	
				
			</td>				
		</tr>
	</table>
</fieldset><br>	
	<div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px">		
		<input type="button" class="portlet-form-button" value="<liferay-ui:message key="save" />" onClick="<portlet:namespace />savePreferences();"/>		
	</div><br><br>
</form>
