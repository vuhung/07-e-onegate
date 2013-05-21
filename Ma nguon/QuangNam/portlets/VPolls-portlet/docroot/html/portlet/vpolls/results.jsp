<%@page import="com.liferay.portal.kernel.util.MathUtil"%>
<%@page import="com.vportal.portlet.vpolls.util.WebKeysExt"%>
<%@page import="java.text.NumberFormat"%>
<%@ include file="/html/portlet/vpolls/init.jsp" %>
<%
	NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
	NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
	
	PollsQuestion question = (PollsQuestion)request.getAttribute(WebKeysExt.POLLS_QUESTION);
	List choices = (List)request.getAttribute("choices");
	question = question.toEscapedModel();	
	int totalVotes = PollsVoteLocalServiceUtil.getQuestionVotesCount(question.getQuestionId());	
%>
<table bgcolor="WHITE" align="center" border="0" cellspacing="0" cellpadding="0">
	<tbody>
		<tr>
			<td>
				<table width="100%" cellspacing="0" cellpadding="0">
					<tbody>
						<tr>
							<td align="right"><b>
								<script type="text/javascript">									
									var currentTime = new Date();
									var thu = currentTime.getDay();	
									dayname = new Array("Ch&#7911; Nh&#7853;t", "Th&#7913; Hai", "Th&#7913; Ba", "Th&#7913; T&#432;", "Th&#7913; N&#259;m", "Th&#7913; Sáu", "Th&#7913; B&#7843;y");
									t = dayname[thu];						
									var month = currentTime.getMonth() + 1;
									var day = currentTime.getDate();
									var year = currentTime.getFullYear();
									var hours = currentTime.getHours();
									var minutes = currentTime.getMinutes();
									if (minutes < 10)
										minutes = "0" + minutes;
										
									document.write(t + " , ");
									document.write(day + "/" + month + "/" + year + " , " + hours + ":" + minutes + " ");
										
									if(hours > 11){
										document.write("PM")
									} else {
										document.write("AM")
									}
								</script></b>
							</td>				
						</tr>
						<tr>
							<td>
								<h3><%= question.getDescription()%></h3>
							</td>	
						</tr>
					</tbody>
				</table>			
									
				<table width="100%" cellspacing="0" cellpadding="0" >
						<%
							for(int i=0;i < choices.size(); i++ ){
								PollsChoice choice = (PollsChoice)choices.get(i);
								choice = choice.toEscapedModel();	
															
								int choiceVotes = PollsVoteLocalServiceUtil.getChoiceVotesCount(choice.getChoiceId());
								
								String className = "portlet-section-body";
								String classHoverName = "portlet-section-body-hover";		
								
								if (MathUtil.isEven(i)) {
									className = "portlet-section-alternate";
									classHoverName = "portlet-section-alternate-hover";
								}						
								
								double votesPercent = 0.0;
								int votesPixelWidth = 200;
								int countPer = 0;
								
								if (totalVotes > 0) {
									votesPercent = (double)choiceVotes / totalVotes;	
								}
								
								int votesPercentWidth = (int)Math.floor(votesPercent * votesPixelWidth);
								
						%>
						<tr class="<%= className %>"  style="font-size: x-larger;" >							
							<td align="left"><font style="font-size:12px;font-weight:bold"><%= choice.getDescription()%></font></td>
							<%
								if(votesPercentWidth > 0){
							%>
								<td align="left"><img src="/html/portlet/vpolls/vote_result.JPG" width="<%= votesPercentWidth%>" height="15"></td>								
							<%
								}else{	
							%>	
								<td></td>
							<%
								}
							%>
							<td align="right"><%= percentFormat.format(votesPercent) %></td>
							<td colspan="<%= votesPercentWidth > 0 ? "5" : "5" %>" align="center">
										<%= numberFormat.format(choiceVotes) %> phi&#7871;u
							</td>
						</tr>			
						<%
							}
						%>
				</table>
				<br/>
				<table align="right">
					<tr>
						<td><b>T&#7893;ng c&#7897;ng : <%= totalVotes %> phi&#7871;u</b></td>
					</tr>					
					<tr>
						<td align="right">
							<a href="javascript:window.close()">[Tr&#7903; v&#7873;]</a>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</tbody>
</table>