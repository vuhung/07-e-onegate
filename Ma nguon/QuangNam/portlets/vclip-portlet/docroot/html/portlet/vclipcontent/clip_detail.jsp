
<%
	Clip clipBean = (Clip)request.getAttribute("clipBean");
%>
<div style="padding: 5px;">
<table width="100%" class="text_none">
	<tr>
		<td colspan="2"><p class="public_title"><%= clipBean.getTitle()%></p></td>
	</tr>
	<tr>
		<td width="50%">
			<b>L&#432;&#7907;t xem : &nbsp; <%=clipBean.getHitcountview()%></b>
		</td>
		<td style="display:<%=allowDownload.equals("true")?"block":"none"%>;">
			<table>
				<tr>
					<td><b>L&#432;&#7907;t download :&nbsp;&nbsp; <%=clipBean.getHitcount()%></b> &nbsp;&nbsp;</td>
					<td><a href="<%= themeDisplay.getPathMain()%>/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %><%= clipBean.getUrl() %>">
							<img onclick= "inceaseCounter(<%=clipBean.getId()%>)" src="/vclip-portlet/html/portlet/vclipcontent/images/download.png"/>
						</a>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td colspan="2" style="display:<%=allowDescription.equals("true")?"":"none"%>">
			<p><%= clipBean.getDescription()%></p>
		</td>
	</tr>
</table>
</div>
