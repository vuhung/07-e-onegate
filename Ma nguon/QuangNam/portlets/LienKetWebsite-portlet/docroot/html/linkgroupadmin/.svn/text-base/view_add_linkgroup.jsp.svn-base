
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.vsi.lienketwebsite.service.LinkGroupServiceUtil"%>
<%@include file="/init.jsp"%>
<%@page contentType="text/html; charset=UTF-8"%>


<portlet:renderURL var="LinkGroupPageURL">
	<portlet:param name="jspPage"
		value="/html/linkgroupadmin/view_add_linkgroup.jsp"></portlet:param>
</portlet:renderURL>
<portlet:renderURL var="LinkPageURL">
	<portlet:param name="jspPage"
		value="/html/linkgroupadmin/view_add_link.jsp"></portlet:param>
</portlet:renderURL>

<div id="attributeError">
	<liferay-ui:error key="LinkGroupErrorSaving"	message="loi-them-nhom-lien-ket"></liferay-ui:error>
	<liferay-ui:success key="LinkGroupSaved"	message="linkgroup-saved-successfully" />
	<liferay-ui:success key="LinkGroupUpdated"	message="cap-nhap-nhom-lien-ket-thanh-cong"></liferay-ui:success>
	<liferay-ui:success key="LinkGroupDeleted"	message="xoa-nhom-lien-ket-thanh-cong"></liferay-ui:success>
	<liferay-ui:error key="LinkGroupErrorUpdating"	message="loi-cap-nhat-nhom-lien-ket"></liferay-ui:error>
	<liferay-ui:error key="LinkGroupErrorDeleting"	message="loi-xoa-nhom-lien-ket"></liferay-ui:error>
</div>
	
<a href="<%=LinkGroupPageURL%>">Nhóm liên kết</a>
&nbsp;&nbsp;
<a href="<%=LinkPageURL%>">Liên kết</a>

<h1>Quản lý nhóm liên kết</h1>
<portlet:actionURL name="addLinkGroup" var="addLinkGroupURL" />
<aui:form name="fm" action="<%=addLinkGroupURL%>" method="post">
	<aui:fieldset>
		<div id="attributeError">
			<liferay-ui:error key="name-required" message="chua-nhap-ten-nhom-lien-ket" />			
		</div>			
		<aui:input type="text" name="linkGroupName" value="" size="45" />		
		<aui:input 
		style="width:250px"
		name="description" 
		type="textarea" 
		value=""
		></aui:input>	
		<aui:button type="submit" name="addLinkGroup" value="Lưu"></aui:button>
	</aui:fieldset>
</aui:form>
<div>
	<br><br>
</div>
<liferay-ui:search-container
	emptyResultsMessage="xin-loi-khong-tim-thay-ket-qua-nao" delta="5">

	<liferay-ui:search-container-results>
		<%
					List<LinkGroup> tempResults = ActionUtil
							.getLinkGroups(renderRequest);
					results = ListUtil.subList(tempResults,
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = tempResults.size();

					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="com.vsi.lienketwebsite.model.LinkGroup"
		keyProperty="linkgroupId" modelVar="linkGroup">

		<liferay-ui:search-container-column-text name="linkGroupName"
			property="name" />
		<liferay-ui:search-container-column-text name="description"
			property="description" />
		<liferay-ui:search-container-column-jsp
			path="/html/linkgroupadmin/admin_actions.jsp" align="right" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>