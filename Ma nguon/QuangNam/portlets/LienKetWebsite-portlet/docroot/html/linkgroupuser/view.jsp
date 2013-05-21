<%@page import="javax.portlet.RenderResponse"%>
<%@include file="/init.jsp" %>
<%@page contentType="text/html; charset=UTF-8"%>

<% List<LinkGroup> list =  ActionUtil.getLinkGroups(renderRequest);

   List<String> myList=  new ArrayList<String>();     
   int listLinkSize =0;
   final int MAXLINE = 45;
if(list.size()>0)
{	
	for(int i = 0; i < list.size();i++)
	{			
		long linkgroupId = list.get(i).getLinkgroupId();
		List<Links> listLinks = ActionUtil.getLinksByLinkGroupId(linkgroupId);
		listLinkSize= listLinks.size();
		String linkGroupName = list.get(i).getName();	
		int needAdd = (int)(MAXLINE - linkGroupName.length())/2;
		String groupTitle = "";
		for(int k = 0; k<needAdd;k++)
		{
			groupTitle +="-";
		}
		groupTitle +=list.get(i).getName().toUpperCase();
		for(int h = 0; h<needAdd;h++)
		{
			groupTitle +="-";
		}
		myList.add(groupTitle);
		
		//myList.add("--------------"+list.get(i).getName()+"--------------");
		int temp =0;
		while(temp<listLinkSize)
		{
			myList.add(listLinks.get(temp).getName());
			//length++;		
									
				temp++;					
		}			
	}	
}
%>
<portlet:actionURL name="findAndRedirect" var="linkRequestURL">
</portlet:actionURL>
<aui:form name="fm" action="<%=linkRequestURL.toString()%>" method="post">
<aui:fieldset> 
    <aui:select name="linksFromRequest" onChange="doRedirect();">
      <aui:option value="-1">
        <liferay-ui:message key="chon-lien-ket" />
      </aui:option>
      <%     
      for (int i = 0; i < myList.size(); i++) { 	 
      %>
      <aui:option value="<%= myList.get(i) %>">
        <%= myList.get(i).toString() %>
      </aui:option>       
      <%
      }
      %>
    </aui:select>
</aui:fieldset>	
</aui:form>
<script type="text/javascript">

function doRedirect(){
	//alert("hello");
	submitForm(document.<portlet:namespace/>fm, '<%= linkRequestURL %>' );	
};
</script>
