<%@page import="java.util.ArrayList"%>
<%@page import="com.vportal.portlet.vcms.service.VcmsArticleServiceUtil"%>
<% 
List newestArticles = null;

if(Validator.isNotNull(displayDefaultCatId)){
	displayDefaultCatId=displayDefaultCatId.substring(0, displayDefaultCatId.length()-1);
	if(Validator.isNotNull(typeId)){
		newestArticles = (List)VcmsArticleServiceUtil.getArticleByG_L_C_S_T(groupId, language, displayDefaultCatId,statusId, Long.parseLong(typeId), 0, numberArticles);	
	}else{
		newestArticles = (List)VcmsArticleServiceUtil.getArticleByC_P_L_S(displayDefaultCatId, groupId, language, statusId, 0, numberArticles);
	}
}else {
	if(Validator.isNotNull(typeId)){
		newestArticles = (List)VcmsArticleServiceUtil.getArticleByG_L_S_T(groupId, language, statusId, Long.parseLong(typeId), 0, numberArticles);
	}else{
		newestArticles = new ArrayList();
	}
}
%>
<c:if test="<%=defaultStyle.equals(\"style_01\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/includes/phutho/style01.jsp" %>
</c:if>

<c:if test="<%=defaultStyle.equals(\"style_02\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/includes/phutho/style02.jsp" %>
</c:if>

<c:if test="<%=defaultStyle.equals(\"style_03\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/includes/phutho/style03.jsp" %>
</c:if>

<c:if test="<%=defaultStyle.equals(\"style_04\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/includes/phutho/style04.jsp" %>
</c:if>

<c:if test="<%=defaultStyle.equals(\"style_05\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/includes/phutho/style05.jsp" %>
</c:if>

<c:if test="<%=defaultStyle.equals(\"style_06\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/includes/phutho/style06.jsp" %>
</c:if>
			
<%-- <c:if test="<%=displayContent.equals(\"default\") && defaultStyle.equals(\"style_01\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/default/default_style_1.jsp" %>
</c:if>	
	
<c:if test="<%=displayContent.equals(\"default\") && defaultStyle.equals(\"style_02\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/default/default_style_2.jsp" %>
</c:if>	
	
<c:if test="<%=displayContent.equals(\"default\") && defaultStyle.equals(\"style_03\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/default/default_style_3.jsp" %>
</c:if>
<c:if test="<%=displayContent.equals(\"default\") && defaultStyle.equals(\"style_04\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/default/default_style_4.jsp" %>
</c:if>

<c:if test="<%=displayContent.equals(\"default\") && defaultStyle.equals(\"style_05\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/default/default_style_5.jsp" %>
</c:if>

<c:if test="<%=displayContent.equals(\"default\") && defaultStyle.equals(\"style_06\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/default/default_style_6.jsp" %>
</c:if>

<c:if test="<%=displayContent.equals(\"sticky\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/sticky/sticky.jsp" %>	
</c:if>		
	
<c:if test="<%=displayContent.equals(\"tabs\") && defaultStyle.equals(\"style_01\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/tabs/tab_style01.jsp" %>
</c:if>
<c:if test="<%=displayContent.equals(\"tabs\") && defaultStyle.equals(\"style_02\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/tabs/tab_style02.jsp" %>
</c:if>
<c:if test="<%=displayContent.equals(\"tabs\") && defaultStyle.equals(\"style_03\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/tabs/tab_style03.jsp" %>
</c:if>
<c:if test="<%=displayContent.equals(\"tabs\") && defaultStyle.equals(\"style_04\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/tabs/tab_style04.jsp" %>
</c:if>

<c:if test="<%=displayContent.equals(\"tabs\") && defaultStyle.equals(\"style_05\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/tabs/tab_style05.jsp" %>
</c:if>
	
<c:if test="<%=displayContent.equals(\"type-of-article\")%>">
	<%@ include file="/html/portlet/vcmsviewcontent/type-articles/type_style.jsp" %>	
</c:if>		 --%>
	
	
	
	