<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="javax.portlet.RenderRequest" %>
<%@ page import="javax.portlet.RenderResponse" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>

<%@ page import="java.util.List" %>
<%@ page import="com.portlet.vdoc.Util.ActionUtil" %>
<%@ page import="com.portlet.vdoc.model.vdocOrg" %>
<%@ page import="com.portlet.vdoc.model.impl.vdocOrgImpl"%>
<%@ page import="com.portlet.vdoc.service.vdocOrgLocalService"%>
<%@ page import="com.portlet.vdoc.service.vdocOrgLocalServiceUtil" %>
<%@page import="com.portlet.vdoc.service.vdocDocumentLocalServiceUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>

<portlet:actionURL name="updateOrgPosition" var="updateOrgPositionURL"/>

<script type="text/javascript">
function <portlet:namespace />updateOrgPosition(selector) {
		alert("This is update org position script");
		document.<portlet:namespace />fm.<portlet:namespace />position.value = selector.value;
		submitForm(document.<portlet:namespace/>fm, '<%= updateOrgPositionURL.toString() %>');
}
</script>

<%
	// Add Org
	PortletURL addOrgURL = renderResponse.createRenderURL();
	addOrgURL.setParameter("jspPage","/html/vdoc_manage/general_manage/edit_org.jsp");
	
	// Render search container
	PortletURL renderTabOrgURL = renderResponse.createRenderURL();
	renderTabOrgURL.setParameter("jspPage","/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=portlet.vdoc.general-manage.orgs-tab");
	
	PortletURL subOrgURL = renderResponse.createRenderURL();
	subOrgURL.setParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=organization-tab");
	
	PortletURL orgURL = renderResponse.createRenderURL();
	orgURL.setParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=organization-tab");
	
	String listParent="";
	String listURL = "";
	
	String parentIds[]=null;	
	if(!parentId2.equals(StringPool.BLANK) && !parentId2.equals("0")){
		listParent = ActionUtil.getListParent(parentId2);
		parentIds = listParent.split(",");
	}
	if(!listParent.equals("")){
		listURL = "<a href=\""+orgURL.toString()+"\">Th&#432; m&#7909;c g&#7889;c</a>";
		for(int i=parentIds.length-1;i>=0;i--){
			vdocOrg org = vdocOrgLocalServiceUtil.getOrg(parentIds[i]);
			orgURL.setParameter("parentId2", org.getOrgId());	
			listURL = listURL +" >> " + "<a href=\""+orgURL.toString()+"\">"+ org.getName()+"</a>";
		}
	}
%>

<input type="button" value='<%= LanguageUtil.get(pageContext, "portlet.vdoc.add-org") %>' onclick="window.location.href='<%= addOrgURL.toString() %>' " />
<br/>
<%=listURL %>

<br/><br/>
<%
	List<vdocOrg> listOrg = vdocOrgLocalServiceUtil.getOrgByG_L_P(groupId,language,parentId2);
	int count = vdocOrgLocalServiceUtil.countOrgByG_L_P(groupId,language,parentId2);
%>

<liferay-ui:search-container emptyResultsMessage='<%= LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.org.empty-result-message") %>' delta="15" iteratorURL="<%= renderTabOrgURL %>">
	<liferay-ui:search-container-results>
		<%
			results = ListUtil.subList(listOrg, searchContainer.getStart(), searchContainer.getEnd());
			total = listOrg.size();			
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="com.portlet.vdoc.model.vdocOrg" modelVar="org" keyProperty="orgId">
		<%			
			List<vdocOrg> children = vdocOrgLocalServiceUtil.getOrgByG_L_P(groupId, language, org.getOrgId());
			int childrenCount = 0;
			childrenCount = children.size();
			
			PortletURL rowURL = renderResponse.createRenderURL();
			rowURL.setParameter("jspPage", "/html/vdoc_manage/view.jsp?tabs1=generalmanage-tab&tabs2=organization-tab");
			rowURL.setParameter("parentId2", org.getOrgId());
			
			StringBuffer sb = new StringBuffer();
			sb.append("<table cellspacing='3' cellpadding='0' width='100%' border='0'>");
			sb.append("<tr>");
			sb.append("<td width='1%'><img src='" + themeDisplay.getPathThemeImages() + "/phutho2012/category.gif' valign='middle' /></td>");
			sb.append("<td width='99%'><b><a href=\""+	rowURL.toString()+"\">" + org.getName() + "</a></b></td>");
			sb.append("</tr>");		
			
			if (childrenCount > 0) {
				sb.append("<tr>");
				sb.append("<td width='1%'><img src='" + themeDisplay.getPathThemeImages() + "/phutho2012/children.gif' valign='middle' /></td>");
				sb.append("<td width='99%' align='left'><span style='font-size: xx-small;'><b><u>" + LanguageUtil.get(pageContext, "portlet.vdoc.field.list.sub-org","sub-org") + "</u>:");
				for (int j = 0; j < childrenCount; j ++) {
					vdocOrg child = (vdocOrg) children.get(j);
				
					subOrgURL.setParameter("orgId",child.getOrgId());
					subOrgURL.setParameter("parentId2",child.getOrgId());
					sb.append("<a href=\""+subOrgURL.toString()+"\">"+child.getName()+"</a>");
					
					if (j < childrenCount - 1) {
						sb.append(", ");
					}
				}
				sb.append("</b></span></td>");
				sb.append("</tr>");
			}
			
			sb.append("</table>");
		%>
		
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.name-orgs") %>' value='<%= sb.toString() %>' />
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.position") %>'>
			<aui:select name="Position" label="" onChange="<portlet:namespace />updateOrgPosition(this)">
			<% for(int i =0; i < count ; i++){ %>
				<aui:option value="<%= i+1 %>"  selected="<%= (org.getPosition() == (i+1)) %>"><%= i+1 %>  </aui:option>
				<%} %>
			</aui:select>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-jsp path="/html/vdoc_manage/general_manage/org_actions.jsp"/>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
</liferay-ui:search-container>



