
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.test.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.test.service.AdvTypeServiceUtil"%>

<%@page import="com.test.model.impl.AdvItemImpl"%>
<%@page import="com.test.model.AdvItem"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>



<portlet:defineObjects />
<%

String redirect = ParamUtil.getString(request, "redirect");		

AdvItem item = (AdvItem)request.getAttribute("item");
if (item == null){
	item = new AdvItemImpl();
}	
String cmdSearchFlag = ParamUtil.getString(request,"cmd-search-flag",StringPool.BLANK);
ThemeDisplay themeDisplay3= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long groupId3= themeDisplay3.getPortletGroupId();
List listType = AdvTypeServiceUtil.getTypeByG(groupId3);


String itemId = ((item != null && Long.toString(item.getItemId()) != null) ? Long.toString(item.getItemId()) : null);

PortletURL formAction = renderResponse.createActionURL();

formAction.setParameter(ActionRequest.ACTION_NAME,"Item_new");
AdvItem vportion = (AdvItem)request.getAttribute("AdvItems");
String portion_lang = "vi_VN";

Calendar currentDate = new GregorianCalendar();

int expiredYear = currentDate.get(Calendar.YEAR);
int expiredMonth = currentDate.get(Calendar.MONTH);
int expiredDay = currentDate.get(Calendar.DATE);



try {
	if (Validator.isNotNull(itemId)){
		
		expiredYear = item.getExpriedDate().getYear() + 1900 ;
		expiredMonth = item.getExpriedDate().getMonth();
		expiredDay = item.getExpriedDate().getDate();
	}
} catch(Exception ex){}


int expiredDateDate = ParamUtil.getInteger(request,"expiredDay", expiredDay);
int expiredDateMonth = ParamUtil.getInteger(request,"expiredMonth", expiredMonth);
int expiredDateYear = ParamUtil.getInteger(request,"expiredYear" , expiredYear);
%>
<script language="javascript">	
	function <portlet:namespace />disableInputDate() {		
		var checkbox = document.getElementById('<portlet:namespace />neverExpired');
		var date = document.getElementById('<portlet:namespace />date');		
		
		if (checkbox.checked){
			date.style.display = 'none';
		}else {
			date.style.display = '';
		}		
	};	
	
	function <portlet:namespace />submitForm(type) {
		var myform = document.<portlet:namespace />fm;
		myform.action="<%= formAction.toString() %>";
		myform.method="post";
		
		var name = myform.<portlet:namespace />name
		var description = myform.<portlet:namespace />description;	
		var icon = myform.<portlet:namespace/>icon;
		
		if (type == 0) {
			myform.submit();
			return ;
		}
		resetField(name);
		resetField(description);
		
		if (name.value.length<1) {
			alert("<%= LanguageUtil.get(pageContext, "VSitemap.form.nameLink.cannotBlank") %>");
			showErrorField(name);
			name.focus();
			return false;			
		}
		myform.submit();
	}
</script>

<form action="<%=formAction.toString() %>" name="<portlet:namespace/>fm" method="post">
       <input type="hidden" name="<portlet:namespace/>itemId" value="<%= (itemId != null) ? itemId : "" %>" />
       <input type="hidden" name="<portlet:namespace/>groupId" value="<%=String.valueOf(groupId3)  %>" />
       <input type="hidden" name="<portlet:namespace/>cmd" value="<%=Validator.isNotNull(item.getItemId()) ? "doupdate" : "doadd" %>"/> 
<table>
  <tr height="30">
<td><%= LanguageUtil.get(pageContext, "VAdvman") %></td>
   
   <td >
		<select name="<portlet:namespace />typeId" id="<portlet:namespace />typeId" style="width:140px;" align="left">
			<%	for(int i=0; i<listType.size();i++)	{
					AdvType type = (AdvType)listType.get(i);	 %>
				<option value="<%= type.getTypeId()%>" <%= (String.valueOf(type.getTypeId()).equals(String.valueOf(item.getTypeId()))  ? "selected":"") %> ><%= type.getName() %></option>
			<%	}	%>	
		</select>
	
   </td>
  </tr>
  <tr height="30">
  <td>T&#234;n qu&#7843;ng c&#225;o:
  </td>
  
  <td>

  <input type="file" class="form-text" width="200" style="width:200px" name="<portlet:namespace />name" />
	</td>	
  
  
  </tr>
  <tr height="30">
    <td>
    M&#244; t&#7843;
    </td>
    <td>
    <textarea name="<portlet:namespace />description" class="lfr-textarea" ><%= (item != null) ? item.getDescription() : "" %></textarea>
    </td>
  </tr>
  <tr height="30">
  <td>&#272;&#432;&#7901;ng d&#7851;n:</td>
  <td>
  <liferay-ui:input-field model="<%= AdvItem.class %>" bean="<%= item %>" field="url" /></td>
  </td>
  </tr>
  <tr>
  <td>Tooltip</td>
  <td>
  <liferay-ui:input-field model="<%= AdvItem.class %>" bean="<%= item %>" field="txtMouseOver" />
  </td>
  </tr>
  <tr height="30">
  <td>Ng&#224;y h&#7871;t h&#7841;n:</td>
  <td>
  <table width="100%">
    <tr height="30" id="<portlet:namespace/>date" style="<%=Validator.isNull(item.getExpriedDate())? "display:none":""%>;">
       <td align="left"  >
       <liferay-ui:input-date  
       monthParam="expiredMonth"
       monthValue="<%= expiredMonth %>"
       dayParam="expiredDay"
				dayValue="<%= expiredDay %>"
				yearParam="expiredYear"
				yearValue="<%= expiredYear %>"
				
       yearRangeStart="<%= expiredYear-10 %>" yearRangeEnd="<%= expiredYear+10 %>" ></liferay-ui:input-date>
       </td>
    </tr>
     <tr height="30">
     <td>
     &nbsp;<input type="checkbox" name="<portlet:namespace/>neverExpired" id="<portlet:namespace/>neverExpired" 
					onClick="javascript:<portlet:namespace />disableInputDate();" <%= Validator.isNull(item.getExpriedDate())? "checked":""%>/>
				<label for="<portlet:namespace/>neverExpired" >Vô h&#7841;n</label>
     </td>
     </tr>
  </table>

  </td>
  </tr>
  <tr>
  <td>Li&#234;n K&#7871;t t&#7899;i trang m&#7899;i:</td>
  <td>		
		&nbsp;<input type="checkbox" name="<portlet:namespace />isTargetBlank" id="<portlet:namespace />isTargetBlank" <%= ((item != null) && item.getIsTargetBlank()) ? "checked" : "" %>/></td>
  </tr>
  <tr>
   <td><input type="submit" value="<%=LanguageUtil.get(pageContext, "save") %>"/></td>
<td><input type="button" value="<%=LanguageUtil.get(pageContext, "cancel") %>" onclick="history.back();"/></td>

  </tr>
</table>
<br>



</form>
