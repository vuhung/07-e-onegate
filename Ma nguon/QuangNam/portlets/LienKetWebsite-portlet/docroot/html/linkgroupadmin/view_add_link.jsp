<%@page import="com.vsi.lienketwebsite.LinkGroupAdmin"%>
<%@page import="javax.portlet.Portlet"%>
<%@page import="com.vsi.lienketwebsite.service.persistence.LinkGroupUtil"%>
<%@page import="com.vsi.lienketwebsite.service.impl.LinkGroupServiceImpl"%>
<%@include file="/init.jsp" %>
<%@page contentType="text/html; charset=UTF-8"%>

<portlet:renderURL var="LinkGroupPageURL">
<portlet:param name="jspPage" value="/html/linkgroupadmin/view_add_linkgroup.jsp"></portlet:param>
</portlet:renderURL>
<portlet:renderURL var="LinkPageURL">
<portlet:param name="jspPage" value="/html/linkgroupadmin/view_add_link.jsp"></portlet:param>
</portlet:renderURL>

<a href="<%=LinkGroupPageURL %>">Nhóm liên kết</a>&nbsp;&nbsp;
<a href="<%=LinkPageURL %>">Liên kết</a>
<div id="attributeError">
	<liferay-ui:success key="LinksSaved" message="them-lien-ket-thanh-cong"></liferay-ui:success>
	<liferay-ui:error key="LinksErrorSaving" message="loi-them-lien-ket"></liferay-ui:error>
	<liferay-ui:success key="LinkUpdated" message="cap-nhap-lien-ket-thanh-cong"></liferay-ui:success>
	<liferay-ui:error key="LinksErrorUpdating" message="loi-cap-nhat-lien-ket"></liferay-ui:error>
	<liferay-ui:success key="LinksDeleted" message="xoa-lien-ket-thanh-cong"></liferay-ui:success>
	<liferay-ui:error key="LinksErrorDeleting" message="loi-xoa-lien-ket"></liferay-ui:error>
	<liferay-ui:error key="URLInvalid" message="loi-url-khong-hop-le" />
</div>

<h1>Quản lý liên kết</h1>
<portlet:actionURL name="addLink" var="addLinkURL" />

<aui:form name="fm" action="<%=addLinkURL %>" method="post">
<aui:fieldset>
<% List<LinkGroup> listLinkGroup =  ActionUtil.getLinkGroups(renderRequest);%>
	<div id="attributeError">
		<liferay-ui:error key="linkGroupId-required" message="chua-chon-nhom-lien-ket" />
	</div> 	 
	 <aui:select name="linkGroup">	
      <aui:option value="-1">
        <liferay-ui:message key="lua-chon" />
      </aui:option>
      <%     
      for (int i = 0; i < listLinkGroup.size(); i++) { 	 
      %>
      <aui:option value="<%= listLinkGroup.get(i).getLinkgroupId() %>">
        <%= listLinkGroup.get(i).getName() %>
      </aui:option>      
      <%
      }
      %>
    </aui:select>  
    <div id="attributeError">
    	<liferay-ui:error key="linkName-required" message="chua-nhap-ten-lien-ket" />
    </div>	
    <aui:input
        type="text"
        name="linkName"
        value=""
        size="45" />
    <aui:input style="width:250px"
    name="description"
    type="textarea"
    value="">
    </aui:input>    
    <div id="attributeError">
    	<liferay-ui:error key="url-required" message="chua-nhap-url" />    	
    </div>
    <aui:input
        type="text"
        name="url"
        value=""
        size="45" />     
     <aui:button
     type="submit"
     name="addLink"
     value="Lưu"     
     >
     </aui:button>   
    </aui:fieldset>
</aui:form> 

<% List<LinkGroup> list =  ActionUtil.getLinkGroups(renderRequest);%>
<portlet:actionURL name="findByLinkGroup" var="findByLinkGroupURL">
</portlet:actionURL>
<aui:form name="find" action="<%=findByLinkGroupURL %>" method="post">
<aui:fieldset>    
    <aui:select name="findLinkGroup" onChange="doFind();">
      <aui:option value="-1">
        <liferay-ui:message key="hay-chon-nhom-can-tim" />
      </aui:option>
      <%     
      for (int i = 0; i < list.size(); i++) { 	 
      %>
      <aui:option value="<%= list.get(i).getLinkgroupId() %>">
        <%= list.get(i).getName() %>
      </aui:option>       
      <%
      }
      %>
    </aui:select>  
   <liferay-ui:search-container emptyResultsMessage="xin-loi-khong-tim-thay-ket-qua-nao" delta="10" >
    <liferay-ui:search-container-results>
    	<%        
			List<Links> other = (List<Links>)request.getAttribute("ListByGroup");
    	    List<Links> tempResults = ActionUtil.getLinks(renderRequest);
    	    results = ListUtil.subList(
    	    tempResults, searchContainer.getStart(), searchContainer.getEnd());
    	    total = tempResults.size();
    	    if(other != null){
    	    	results = ListUtil.subList(other, searchContainer.getStart(), searchContainer.getEnd());
    	    	total = other.size();
    	    }
    	    pageContext.setAttribute("results", results);
    	    pageContext.setAttribute("total", total);    
    %>   
    </liferay-ui:search-container-results>
    <liferay-ui:search-container-row 
    className="com.vsi.lienketwebsite.model.Links" 
    keyProperty="linkId" modelVar="link">       
	<liferay-ui:search-container-column-text
          name="linkURL"
          property="url" />     
    <liferay-ui:search-container-column-text
          name="linkName" property="name" href="<%=link.getUrl() %>">          	
   </liferay-ui:search-container-column-text>
    <liferay-ui:search-container-column-text
          name="linkDescription"
          property="description" />                       
     <liferay-ui:search-container-column-text
          name="linkGroup"
          value="<%=LinkGroupUtil.fetchByPrimaryKey(link.getLinkgroupId()).getName() %>" />          
     <liferay-ui:search-container-column-jsp
          path="/html/linkgroupadmin/link_actions.jsp"
          align="right" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
  </liferay-ui:search-container>
</aui:fieldset>	
</aui:form>

<%//PortletURL viewURL = renderResponse.createRenderURL();
//viewURL.setParameter("jspPage", "/html/linkgroupadmin/view_add_link.jsp");
%>
 
  
<script type="text/javascript">
function doFind(){
	//alert("hello");
	submitForm(document.<portlet:namespace/>find, '<%= findByLinkGroupURL %>' );	
};
</script>