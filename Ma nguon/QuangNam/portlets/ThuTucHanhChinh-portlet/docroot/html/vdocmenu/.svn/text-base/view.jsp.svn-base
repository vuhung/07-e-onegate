<%@include file="/html/vdocmenu/init.jsp" %>
<%@include file="/html/vdocmenu/css.jsp" %>

<html>
	<head>
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
		<script type="text/javascript">
			//Initialize Arrow Side Menu:
			ddaccordion.init({
				headerclass: "menuheaders", //Shared CSS class name of headers group
				contentclass: "menucontents", //Shared CSS class name of contents group
				revealtype: "clickgo", //Reveal content when user clicks or onmouseover the header? Valid value: "click", or "mouseover"
				mouseoverdelay: 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
				collapseprev: true, //Collapse previous content (so only one open at any time)? true/false 
				defaultexpanded: [0], //index of content(s) open by default [index1, index2, etc]. [] denotes no content.
				onemustopen: false, //Specify whether at least one header should be open always (so never all headers closed)
				animatedefault: false, //Should contents open by default be animated into view?
				persiststate: true, //persist state of opened contents within browser session?
				toggleclass: ["unselected", "selected"], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
				togglehtml: ["none", "", ""], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
				animatespeed: 500, //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
				oninit:function(expandedindices){ //custom code to run when headers have initalized
					//do nothing
				},
				onopenclose:function(header, index, state, isuseractivated){ //custom code to run whenever a header is opened or closed
					//do nothing
				}
				});
		</script>

		<style type="text/css">
			.div_title
			{
				display:block;
 				height: 30px; 
				background:url(/ThuTucHanhChinh-portlet/html/vdocview/Images/background_title.jpg) repeat-x;
				font: 13px Verdana, Arial, Helvetica, sans-serif;
				text-transform:uppercase;
				color:#FFF;
				padding: 0px 0px 0px 15px;
				line-height: 30px;
				
			}
			a {
				text-decoration: none;
				color: color: #333333;
			}
			.arrowsidemenu{
				display: block;
				width: 295px; /*width of menu*/
				border-style: solid solid none solid;
				border-color: #ffffff;
				border-size: 1px;
				border-width: 1px;
			}
	
			.arrowsidemenu div a{ /*header bar links*/
				font: bold 13px Verdana, Arial, Helvetica, sans-serif;
				display: block;
/* 				background: transparent url(arrowgreen.gif) 100% 0; */
  				height: 24px; /*Set to height of bg image-padding within link (ie: 32px - 4px - 4px)*/
				padding: 4px 0px 4px 10px;
				line-height: 24px; /*Set line-height of bg image-padding within link (ie: 32px - 4px - 4px)*/
				text-decoration: none;
				
			}
	
			.arrowsidemenu div a:link, .arrowsidemenu div a:visited{
				color: #26370A;
			}

			.arrowsidemenu div a:hover{
				background-position: 100%;
			}

			.arrowsidemenu div.unselected a{ /*header that's currently not selected*/
				width: 100%;
/* 				height: 30px; */
				background-color: #4A8BC3;
				color: #FFFFFF;
			}
	
			.arrowsidemenu div.selected a{ /*header that's currently selected*/
				width: 100%;
/* 				height: 30px; */
				background-color: #4A8BC3;
				color: #FDBC54;
				background-position: 100% !important;
			}

			.arrowsidemenu ul{
				list-style-type: none;
				margin: 0;
				padding: 0;
			}

			.arrowsidemenu ul li{
 				border-bottom: 1px solid #ffffff;
				background-color: #73DBFF;
				color: #FDBC54;
/* 				border-left: white; */
			}
			
			.arrowsidemenu ul li a{ /*sub menu links*/
				width: 100%;
				height: 20px;
 				line-height: 20px;
				display: block;
				font: normal 12px Verdana, Arial, Helvetica, sans-serif;
				text-decoration: none;
				color: white;
				background-color: #73DBFF;
 				padding: 4px 0px 4px 10px; 
/* 				padding-left: 10px; */
/*  				border-left: white; */
			}

			.arrowsidemenu ul li a:hover{
				background: #73DBFF;
			}
			.title_menu_first{
				background-image: url(../images/DB_image/dot4.gif);
				background-repeat: no-repeat;
				background-position: left top;
				padding-left: 12px;
				padding-top: 6px;
				padding-bottom: 6px;
				list-style-type:none;
				color: #333333;
			}
			</style>
		
	</head>
	
	<body>
<%-- <%-- 	<% --%>
<!-- <!-- //     		List<vdocOrg> orgList1 = vdocOrgLocalServiceUtil.getOrgByParentId("0");  --> -->
<!-- <!-- //     		for(vdocOrg org : orgList1)  --> -->
<!-- <!-- //     		{   --> -->
<!--   	%>						 -->
<!-- <!--   				<div class="menuheaders">			  --> -->
<%-- 							<a href="<liferay-portlet:actionURL name="ipcVdoc" >  --%>
<%-- 								<liferay-portlet:param name= "orgId" value= "<%= String.valueOf(org.getOrgId()) %>"  />   --%>
<%-- 						  	</liferay-portlet:actionURL>"><%= org.getName() %></a> --%>
<!-- <!-- 				</div> --> -->
<%-- 					<% --%>
// <!-- //      						List<vdocOrg> orgList2 = vdocOrgLocalServiceUtil.getOrgByParentId(org.getOrgId());  -->
// <!-- //      						if(Validator.isNotNull(orgList2)) {					 -->
<%--   					%>		   --%>
<!-- <!--  					<ul class="menucontents">		 --> -->
<%-- 						<% for(vdocOrg org2 : orgList2){ %>		 --%>
<!-- <!-- 						<li>					 --> -->
<%-- 							<a  href="<liferay-portlet:actionURL name="ipcVdoc">  --%>
<%-- 									<liferay-portlet:param name= "orgId" value= "<%= String.valueOf(org2.getOrgId()) %>"  />   --%>
<%-- 						  		</liferay-portlet:actionURL>">  <%= org2.getName() %></a>  --%>
						
<!-- <!-- 						</li> --> -->
<%-- 							<%}%> --%>
<!-- <!-- 						</ul> --> -->
<%-- 						<%} %>					 --%>
<%-- 	<% --%>
// <!-- //    		} -->
<%--   	%> --%> --%>
  	
	</body>
</html>
<%
// 	long groupId = themeDisplay.getLayout().getGroupId();
// 	String languageId = themeDisplay.getLanguageId();
%>

	  

<c:choose>
	<c:when test="<%= styleDisplay==1 %>">
            <%@ include file="/html/vdocmenu/style1.jsp" %>
    </c:when>	
    <c:when test="<%= styleDisplay==2 %>">
            <%@ include file="/html/vdocmenu/style2.jsp" %>
    </c:when>
    <c:when test="<%= styleDisplay==3 %>">
            <%@ include file="/html/vdocmenu/style3.jsp" %>
    </c:when>
</c:choose>