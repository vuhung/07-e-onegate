	  <table width="100%" class="intro-mode" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td>
		<%
		if(Validator.isNotNull(selectCategories)){
			for(int i=0; i<selectCategories.length; i++){
				VcmsCategory category = VcmsCategoryServiceUtil.getCategory(selectCategories[i]);
				if(Validator.isNotNull(category)){
				%>
				    <a href="#"><img src="<%= category.getHasImage() ? ("/image/images?img_id="+category.getImage()):"/html/portlet/vcmsview/images/f01.gif" %>" width="158" height="88" border="0"></a>
					<p>&nbsp;</p>
				<%
				}
			}
		}
		%>
			</td>
        </tr>
      </table>
