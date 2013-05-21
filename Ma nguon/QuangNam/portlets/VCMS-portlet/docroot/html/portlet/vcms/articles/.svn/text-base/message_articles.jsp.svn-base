<%@ include file="/html/portlet/vcms/init.jsp" %>
<script language="javascript">
	function <portlet:namespace />save(){		
		
		var content = document.getElementsByName("<portlet:namespace />messageContent");
		alert(content.value);
		
		//var content = document.<portlet:namespace/>fm.<portlet:namespace/>messageContent.value;
		//document.<portlet:namespace />fm.<portlet:namespace />messageContent.value = content;				
		//document.getElementById('<portlet:namespace />articlesMessage').innerHTML = '[<a href="#addMessage" onClick="javascript:<portlet:namespace />showFormMessage()"><%= LanguageUtil.get(pageContext, "portlet.vcms.article.edit.add-message") %>...</a>] ' + '<br/>'+content;
	}
	
</script>	
	

	
<table cellspacing="0" cellpadding="4" width="100%" border="0">	
<tr>	
	<td valign="top"><%= LanguageUtil.get(pageContext, "portlet.vcms.article.message.content") %> :</td>	
	<td>
		<input type="text" name="<portlet:namespace />messageContent" style="width:250px;" value="" />
	</td>
</tr>
		
<tr>
	<td align="center" colspan="2">
		<input class="form-button" type="button" value="<liferay-ui:message key="save" />" style="margin: 10px" onClick="javascript:<portlet:namespace />save();"/>
		<input class="form-button" type="button" value="<liferay-ui:message key="close" />" style="margin: 10px" onClick="Liferay.Popup.close(this);"/>
	</td>		
</tr>
