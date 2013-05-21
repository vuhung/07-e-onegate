		<%
		if(Validator.isNotNull(selectCategories)){
			for(int i=0; i<selectCategories.length; i++){
				VcmsCategory category = VcmsCategoryServiceUtil.getCategory(selectCategories[i]);
				if(Validator.isNotNull(category)){
				%>
					<table width="100%" align="center" class="new-vb org" border="0" cellspacing="0" cellpadding="0">
		              <tr>
		                <th class="t4"><%= category.getName() %></th>
		              </tr>
		              <tr>
		                <td>
		                  <table class="f-table" align="center" border="0" cellspacing="0" cellpadding="0">
		                    <tr>
		                      <td><a href="#"><img src="<%= category.getHasImage() ? ("/image/images?img_id="+category.getImage()):"/html/portlet/vcmsview/images/f01.gif" %>" width="156" height="101" border="0"></a></td>
		                    </tr>
		                  </table></td>
		              </tr>
		            </table>
				<%
				}
			}
		}
		%>
