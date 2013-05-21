<%@include file="/html/portlet/vlinksmanview/init.jsp"%>
<script language="javascript">
	function <portlet:namespace/>visitSite(){  			
		var url = document.<portlet:namespace />fm.<portlet:namespace/>link.value;
		if(url == "0")
		{  				
			return;
		}
		var the_window = window.open(url);  			
    	document.<portlet:namespace />fm.<portlet:namespace/>link.blur();
		the_window.focus();
   	}
</script>
<div align="center">
<form name="<portlet:namespace/>fm" method="post">		
<c:choose>
	<c:when test='<%= typeDisplay==2 %>'>
        <%@ include file="/html/portlet/vlinksmanview/style/style2.jsp" %>
    </c:when>	
    <c:when test='<%= typeDisplay==3 %>'>
        <%@ include file="/html/portlet/vlinksmanview/style/style3.jsp" %>
    </c:when>
    <c:when test='<%= typeDisplay==4 %>'>
        <%@ include file="/html/portlet/vlinksmanview/style/style4.jsp" %>
    </c:when>
    <c:otherwise>		
        <%@ include file="/html/portlet/vlinksmanview/style/style3.jsp" %>
   </c:otherwise>
</c:choose>
</form>	
</div>