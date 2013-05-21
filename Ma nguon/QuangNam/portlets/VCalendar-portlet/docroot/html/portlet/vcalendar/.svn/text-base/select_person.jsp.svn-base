<%@ include file="/html/portlet/vcalendar/init.jsp" %>
<%
List listGroup = VCalServiceUtil.findByAllGroupOrg();
%>
<form action="" method="post" name="<portlet:namespace />fm1" >
<table cellpadding="0" cellspacing="0" width="100%" border="0">
<%
String name = ParamUtil.getString(request,"name","");
int count =0;
for(int i=0;i<listGroup.size();i++){
	Group group = (Group)listGroup.get(i);
	Organization org = OrganizationLocalServiceUtil.getOrganization(group.getClassPK());
%>
 <tr>
  <td>
   <fieldset style="border:1px dotted gray">
	<legend><b><%=org.getName() %></b></legend>
     <table width="100%" border="0" cellpadding="4" cellspacing="1">
       <%
       List listUser = VCalServiceUtil.findByUserGroup(group.getGroupId());
       for(int j=0;j<listUser.size();j++){
       User groupUser = (User)listUser.get(j);
       if(j%5==0){
       %>
       <tr>
       <%
       }
       %>
        <td>
          <input type="checkbox" value="<%=groupUser.getUserId()+"/"+groupUser.getFullName() %>" name="<portlet:namespace />person"><%=groupUser.getFullName() %>
        </td>
        <td width="3">
        </td>
        <%
        if(j%5==4){
        %>
       </tr>
       <%
        }
        count++;
       }
       %>
     </table>
   </fieldset>  
  </td>
 </tr> 
<%
}
%> 
<tr>
 <td>
   <br>
   <input type="button" value="<liferay-ui:message key="select" />" onclick="<portlet:namespace />selectPerson(document.<portlet:namespace />fm1.<portlet:namespace />person);"/>
   
 </td>
</tr> 
</table>
</form>
<script language="javascript">
    <portlet:namespace />selected();
    function <portlet:namespace />selected() {
     var chk = document.<portlet:namespace />fm1.<portlet:namespace />person;
	 var obj = parent.opener.document.<portlet:namespace />fm.<portlet:namespace /><%=name%>;
	  for (var i=0;i<obj.length;i++) {
	      var str =  obj[i].value+"/"+obj[i].text; 
	      for(var j=0;j<chk.length;j++){
	        if(chk[j].value==str){
	          chk[j].checked=true
	        }
	      }
	  }
	}     
	function <portlet:namespace />selectPerson(chk) {
	 var obj = parent.opener.document.<portlet:namespace />fm.<portlet:namespace /><%=name%>;
	  for (var i=0;i<obj.length;i++) {
	      obj.remove(i);
	  }
		  
	  var listUser="";
	  var j=0;
	  for(var i=0;i<chk.length;i++){
	      var user = chk[i].value;
	      if((chk[i].checked==true) && (listUser.indexOf(user)==-1)){
	        var arrUser = user.split("/")
	        parent.opener.document.<portlet:namespace />fm.<portlet:namespace /><%=name%>.options[j]=new Option(arrUser[1],arrUser[0]);
	        listUser = listUser+","+ chk[i].value;
	        j++;
	      }
	  }		
	  window.close();
	}	
	
</script>