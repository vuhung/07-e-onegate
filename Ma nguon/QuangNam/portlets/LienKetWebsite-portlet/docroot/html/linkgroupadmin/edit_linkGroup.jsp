
<%@include file="/init.jsp" %>
<%@page contentType="text/html; charset=UTF-8"%>

<%
LinkGroup linkGroup = (LinkGroup)request.getAttribute("linkGroup");
%>

<portlet:renderURL var="cancelURL">
  <portlet:param name="jspPage" value="/html/linkgroupadmin/view_add_linkgroup.jsp" />
</portlet:renderURL>

<portlet:actionURL name="updateLinkGroup" var="updateLinkGroupURL" />

<h2>Sửa thông tin về nhóm liên kết</h2>

<aui:form
    name="fm"
    action="<%= updateLinkGroupURL.toString() %>"
    method="post">

  <aui:fieldset>	
    <aui:input
        name="resourcePrimKey"
        value="<%= linkGroup.getLinkgroupId() %>"
        type="hidden"
    />
    <div id="attributeError">
    	<liferay-ui:error key="name-required" message="chua-nhap-ten-nhom-lien-ket" />
    </div>    
    <aui:input
        name="linkGroupName"
        value="<%= linkGroup.getName() %>"
        size="45"
    />
    <aui:input style="width:250px"
        name="description"
        type="textarea"
        value="<%= linkGroup.getDescription() %>"       
    />

    <aui:button-row>

      <aui:button type="submit" value="Lưu"/>
      <aui:button
          type="cancel"
          value="Quay lại"
          onClick="<%= cancelURL.toString() %>"
    />
    </aui:button-row>

  </aui:fieldset>

</aui:form>