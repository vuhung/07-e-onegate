<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvTypeServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.lang.Long"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>

<%
	String tabsName = "tab.adv.item";
						
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);	
	portletURL.setParameter("tab1", tab1);
	
	long itemId = Long.valueOf(renderRequest.getParameter("itemId"));
	AdvItem item = AdvItemLocalServiceUtil.getItemById(itemId);
	
	List<AdvType> typeList = AdvTypeServiceUtil.getAllType();
	
	Calendar currentDate = new GregorianCalendar();

	int expiredYear = currentDate.get(Calendar.YEAR);
	int expiredMonth = currentDate.get(Calendar.MONTH);
	int expiredDay = currentDate.get(Calendar.DATE);
	
	boolean neverExpired = false;
	// Lấy ExpriedDate của Item
	if(item.getExpriedDate() != null){
		currentDate.setTime(item.getExpriedDate());
		expiredYear = currentDate.get(Calendar.YEAR);
		expiredMonth = currentDate.get(Calendar.MONTH);
		expiredDay = currentDate.get(Calendar.DAY_OF_MONTH);
		neverExpired = true;
	}
%>

<script type="text/javascript">	
	function <portlet:namespace />disableInputDate() {		
		var checkbox = document.getElementById('<portlet:namespace />neverExpired');
		var date = document.getElementById('<portlet:namespace />date');		
		
		if (checkbox.checked){
			date.style.display = 'none';
		}else {
			date.style.display = '';
		}		
	};	
</script>

<portlet:actionURL name="updateItem" var="updateItemURL" />

<liferay-ui:tabs names="<%= tabsName %>" param="tab1" url="<%= portletURL.toString() %>" > 

	<aui:form name="fm" Method="post" action="<%= updateItemURL.toString() %>" enctype="multipart/form-data" >
		<input type="hidden" name="itemId" value="<%= item.getItemId() %>" />
		<input type="hidden" name="languageId" value="vi_VN" />
		<input type="hidden" name="show" value="true" />
		<table >
			<tr height="30">
				<td width="20%"><b><%= LanguageUtil.get(pageContext, "item.type","Kieu quang cao") %></b></td>
				<td>
					<aui:select name="typeId" label="" style="width:180px;">
						<aui:option value="0">---<%= LanguageUtil.get(pageContext, "actions.searchAll","Tat ca kieu quang cao") %>---</aui:option>
						<%for(AdvType type : typeList){%>
						<aui:option value="<%= type.getTypeId() %>" selected="<%= item.getTypeId() == type.getTypeId() %>"><%= type.getName() %></aui:option>
						<%} %>
					</aui:select>
				</td>
			</tr>
			
			<tr height="30">
				<td><b><%= LanguageUtil.get(pageContext, "item.name","Ten quang cao") %> :</b></td>
				<td>
					<vportal:file-upload entryId="<%=GetterUtil.getLong(itemId , 0)%>" entryClass="<%=AdvItem.class%>" style="2" />
				</td>	
			</tr>
			
			<tr height="30">
				<td width="20%"><b><%= LanguageUtil.get(pageContext, "item.description","Mo ta") %> :</b></td>
				<td><liferay-ui:input-textarea param="description" defaultValue="<%= item.getDescription() %>" /> </td>
			</tr>
			
			<tr>
				<td><b><%= LanguageUtil.get(pageContext, "item.url","URL") %> :</b></td>
				<td> <aui:input name="url" label="" value="<%= item.getUrl() %>" /> </td>
			</tr>
			
			<tr>
				<td><b><%= LanguageUtil.get(pageContext, "item.toolTip","Tooltip") %> :</b></td>
				<td> <aui:input name="txtMouseOver" label="" value="<%= item.getTxtMouseOver() %>" /> </td>
			</tr>
			
			<tr height="30">
  				<td><b><%= LanguageUtil.get(pageContext, "item.expriedDate","Ngay het hieu luc") %> :</b></td>
  				<td>
  					<table>
    					<tr height="30" id="<portlet:namespace/>date" >
       						<td align="left"  >
       							<liferay-ui:input-date  
       								monthParam="expiredMonth"
       								monthValue="<%= expiredMonth %>"      								
       								dayParam="expiredDay"
									dayValue="<%= expiredDay %>"
									yearParam="expiredYear"
									yearValue="<%= expiredYear %>"
       								yearRangeStart="<%= expiredYear-10 %>" 
       								yearRangeEnd="<%= expiredYear+10 %>" 
       							></liferay-ui:input-date>
       						</td>
    					</tr>
     					<tr height="30">
     						<td>
    							 &nbsp;<input type="checkbox" name="<portlet:namespace/>neverExpired" id="<portlet:namespace/>neverExpired" checked="<%= neverExpired == true ? "checked" : "" %>"
								 onClick="javascript:<portlet:namespace />disableInputDate();" />
								<label for="<portlet:namespace/>neverExpired" ><b><%= LanguageUtil.get(pageContext, "item.infinite","Vo han") %></b></label>
     						</td>
     					</tr>
  					</table>
  				</td>
  			</tr>
  			
  			<tr>
  				<td><b><%= LanguageUtil.get(pageContext, "item.targetBlank","Lien ket trang moi") %>: </b></td>
  				<td><input type="checkbox" name="isTargetBlank" checked="<%=item.getIsTargetBlank() == true ? "checked" : "" %>" /> </td>
  			</tr>
  			 
		</table>
		<br>
			<aui:button type="submit" value='<%= LanguageUtil.get(pageContext, "actions.save","Luu") %>'/>
			<aui:button type="button" value='<%= LanguageUtil.get(pageContext, "actions.cancel","Thoat") %>' onClick="history.back();"/>	
	</aui:form>
</liferay-ui:tabs>
