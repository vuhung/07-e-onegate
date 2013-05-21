<%@ include file="/html/vdocview/init.jsp" %>
<%@ include file="/html/vdocview/css.jsp" %>

<%
		String docId =  ParamUtil.getString(request, "docId", StringPool.BLANK);
		vdocDocument doc = vdocDocumentLocalServiceUtil.getDocument(docId);
		
		String orgRels = "";
		vdocOrg org = new vdocOrgImpl();
		List list = vdocDORelLocalServiceUtil.getRelByDoc(docId);		
		for(int i=0;i<list.size();i++){
			vdocDORel vdocrel = (vdocDORel)list.get(i);
			org = vdocOrgLocalServiceUtil.getOrg(vdocrel.getOrgId());
			if(i==0){
		    	orgRels = org.getName();
			}else{
				orgRels = orgRels+","+org.getName();
			}
		}
%>

<table style="width: 100%">
		<tr height="3"><td colspan="3"></td></tr>
		<tr class="center_top_background">
			<td id="left_top_tab"></td>		    			
			<td>
				<div align="left" class="title1"><%=titlePortlet%></div>
			</td>
			<td id="right_top_tabs"></td>
		</tr>
	</table>
	<table width="100%" cellspacing="0" cellpadding="0" border="0">
		<tr>		
			<td class="boder_top" bgcolor="#FFFFFF" style="padding-top:0px;">
										
			<div style="padding-left:5px;padding-right:5px;">
			<br/>
	
				<table class="sample1">
				<tr height="30">
					<td width="30%"><b>Th&#7911; t&#7909;c</b></td>
					<td width="70%"><%=doc.getTitle()%></td>
				</tr>
				
				<tr>
					<td><b>Tr&igrave;nh t&#7921; th&#7921;c hi&#7879;n</b></td>
					<td><%=doc.getProcess()%></td>
				</tr>
				
				<tr>
					<td><b>C&#225;ch th&#7913;c th&#7921;c hi&#7879;n</b></td>
					<td><%=doc.getStyle()%></td>
				</tr>
				
				<tr>
					<td><b>Th&#224;nh ph&#7847;n s&#7889; l&#432;&#7907;ng h&#7891; s&#417;</b></td>
					<td><%=doc.getContent()%></td>
				</tr>
				
				<tr>
					<td><b>Th&#7901;i h&#7841;n gi&#7843;i quy&#7871;t</b></td>
					<td><%=doc.getTime()%></td>
				</tr>
					
				<tr height="30">
					<td><b>&#272;&#7889;i t&#432;&#7907;ng th&#7921;c hi&#7879;n</b></td>
					<td><%=doc.getObjects()%></td>
				</tr>
				
				<tr height="30">
					<td><b>C&#417; quan th&#7921;c hi&#7879;n</b></td>
					<td><%=orgRels%></td>
				</tr>
				
				<tr height="30">
					<td><b>K&#7871;t qu&#7843; th&#7921;c hi&#7879;n th&#7911; t&#7909;c h&#224;nh ch&#237;nh</b></td>
					<td><%=doc.getResult()%></td>
				</tr>											
				
				<tr height="30">
					<td><b>L&#7879; ph&#237;</td>
					<td><%=doc.getCost()%></b></td>
				</tr>
				
				<tr height="30">
					<td><b>T&#234;n m&#7851;u &#273;&#417;n, m&#7851;u t&#7901; khai</td>
					<td><%=doc.getNote()%></td>
				</tr>
				
				
				<tr height="30">
					<td><b>Y&#234;u c&#7847;u, &#273;i&#7873;u ki&#7879;n th&#7921;c hi&#7879;n</b></td>
					<td><%=doc.getRequire()%></td>
				</tr>
				
				
				<tr>
					<td><b>C&#417; s&#7903; ph&#225;p l&#253;</td>
					<td><%=doc.getBase()%></td>
				</tr>
				</table>
				
				<br/>
					
				<c:if test="<%=doc.getHasAttachment() %>">
					<div><b>T&#224;i li&#7879;u &#273;&#237;nh k&#232;m</b>&nbsp;&nbsp;
						<vportal:file-download entryId="<%=GetterUtil.getLong(doc.getDocId(), 0) %>" entryClass="<%=vdocDocument.class%>"  />
					</div>
				</c:if>
			
<!-- 				<div align="center" class="attach-print clearfix" style="width:100%"> -->
<!-- 					<table cellspacing="0" cellpadding="0" border="0" class="group3" align="center"> -->
<!-- 					<tr>	 -->
<%-- 						<td valign="middle"><img height="24" width="28" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/print.gif"/></td> --%>
<%-- 						<td><a href="#" onclick="javascript:expandingWindow('/html/portlet/vdocview/document_print.jsp?printDocId=<%=doc.getDocId()%>')">&nbsp;In th&#7911; t&#7909;c&nbsp;</a></td>														 --%>
<%-- 						<td valign="middle"><img hspace="20" height="13" width="4" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/ss.gif"/></td> --%>
<%-- 						<td valign="middle"><img height="22" width="28" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_33.gif"/></td> --%>
<!-- 						<td><a href="javascript:history.go(-1);">&nbsp;Quay l&#7841;i&nbsp;</a></td> -->
<!-- 					</tr>	 -->
<!-- 					</table>		 -->
<!-- 				</div>	 -->
	
				<br/>
					
				</div>
			</td>
		</tr>
	</table>