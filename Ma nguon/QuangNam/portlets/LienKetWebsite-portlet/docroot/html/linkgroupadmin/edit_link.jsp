
<%@include file="/init.jsp" %>
<%@page contentType="text/html; charset=UTF-8"%>
<%
Links links = (Links)request.getAttribute("links");
%>
<div id="attributeError">
<liferay-ui:error key="URLInvalid" message="loi-url-khong-hop-le" />
<liferay-ui:error key="LinksErrorUpdating" message="loi-cap-nhat-lien-ket"></liferay-ui:error>
</div>
<portlet:renderURL var="cancelURL">
  <portlet:param name="jspPage" value="/html/linkgroupadmin/view_add_link.jsp" />
</portlet:renderURL>

<portlet:actionURL name="updateLink" var="updateLinkURL" />

<h2>Sửa thông tin liên kết</h2>

<aui:form
    name="fm"
    action="<%= updateLinkURL.toString() %>"
    method="post">

  <aui:fieldset>

    <aui:input
        name="resourcePrimKey"
        value="<%= links.getLinkId() %>"
        type="hidden"
    />
    <% List<LinkGroup> listLinkGroup =  ActionUtil.getLinkGroups(renderRequest);%>
    <liferay-ui:error key="linkGroupId-required" message="chua-chon-nhom-lien-ket" />
    <aui:select name="linkGroup">
      <aui:option value="-1">
        <liferay-ui:message key="lua-chon" />
      </aui:option>
      
      <%//load nhom lien ket cua lien ket hien tai trong combobox
      
      long itemLinkGroupId = 0;
      long linkgroupId = links.getLinkgroupId();
      for (int i = 0; i < listLinkGroup.size(); i++) {
    	  boolean isSelected = false;
    	  itemLinkGroupId = listLinkGroup.get(i).getLinkgroupId();    	  
    	  if(itemLinkGroupId == linkgroupId)
    	  {
    		  isSelected = true;     		  
    	  }
      %>
      <aui:option value="<%= listLinkGroup.get(i).getLinkgroupId() %>" selected="<%=isSelected %>">
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
        name="linkName"
        value="<%= links.getName() %>"
        size="45"
    />
    <aui:input style="width:250px"
        name="description"
        type="textarea"
        value="<%= links.getDescription() %>"
        size="45"
    />
    <div id="attributeError">
    <liferay-ui:error key="url-required" message="chua-nhap-url" />
    </div>    
    <aui:input
        name="url"
        value="<%= links.getUrl() %>"
        size="45"
    />

    <aui:button-row>

      <aui:button type="submit" value="Cập nhật"/>
      <aui:button
          type="cancel"
          value="Trở lại"
          onClick="<%= cancelURL.toString() %>"
    />
    </aui:button-row>

  </aui:fieldset>

</aui:form>