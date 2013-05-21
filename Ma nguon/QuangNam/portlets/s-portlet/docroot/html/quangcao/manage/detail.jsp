<%@page import="com.test.model.AdvType"%>
<%@page import="com.test.service.AdvTypeServiceUtil"%>
<%@page import="com.test.model.AdvItem"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryServiceUtil"%>
<%@page import="com.test.service.AdvItemServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	
String redirect = ParamUtil.getString(request, "redirect");
String itemId = (String)request.getAttribute("itemId");
String extension = StringPool.BLANK;
AdvItem item = null;
AdvType type = null;
try {
	if(Validator.isNotNull(itemId))
	{
	item = AdvItemServiceUtil.getItem(Long.parseLong(itemId));
	type = AdvTypeServiceUtil.getType(item.getTypeId());
	}
	
}catch(Exception ex)
    {
	ex.printStackTrace();
	
	}
%>
<table class="lfr-table" width="100%">
<tr>
<td width="50%" valign="top">		
		<fieldset style="border:1px dotted gray;">
		<legend><strong>Thông tin qu&#7843;ng cáo</strong></legend>
		<table class="lfr-table">
		<tr>
				<td><b>Tên file:</b></td>
						
			</tr>
				
			<tr>
				<td><b>Mô t&#7843;:</b></td>				
				
			</tr>
				
			<tr>
				<td><b>&#272;&#432;&#7901;ng d&#7851;n:</b></td>
			
			</tr>			
			
			<tr>
				<td colspan="2"><br/></td>
			</tr>
				
			<tr>
				<td><b>Ki&#7875;u qu&#7843;ng cáo:</b></td>
			
			</tr>	
				
			<tr>
				
			</tr>
		</table>
</fieldset>
</td>
</tr>
</table>