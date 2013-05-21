<%@page import="com.test.util.InformationUtil"%>
<% 
	

String forexString = InformationUtil.ConvertText("http://vnexpress.net/Service/Forex_Content.js");
String goldString = InformationUtil.ConvertText("http://www.vnexpress.net/Service/Gold_Content.js");		
%>	
<div class="box b2 s2 module_hot-new">
	<div class="title">
		<div class="box-t">
			<div class="box-r">
				<div class="box-b">
					<div class="box-l">
						<div class="box-tl">
							<div class="box-tr">
								<div class="box-br">
									<div class="box-bl">
										<div class="padding">
											<div class="title_col2"><h4>T&#7923; gi&#225; v&#224;ng - ngo&#7841;i t&#7879;</h4></div>
										</div>
										<div><img src="<%= themeDisplay10.getPathThemeImage() %>/<%=themesId%>_image/0.gif"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>		
	
	<div class="content">
		<div class="box-t">
			<div class="box-r">
				<div class="box-b">
					<div class="box-l">
						<div class="box-tl">
							<div class="box-tr">
								<div class="box-br">
									<div class="box-bl">
										<div class="padding clearfix">
											<!-- ++++ Content -->
											<div class="padding clearfix">											
													
												<table id="Gold" width="100%" cellspacing="1px" cellpadding="2px" class="tbl-goldprice" border="0px;" align="center">
								             		<script language="javascript">	             				
								               			<%=goldString%>
								               			var goldTbl = document.getElementById('Gold');
								               			goldTbl.rows[1].cells[1].innerHTML = vGoldSbjBuy;
								               			goldTbl.rows[1].cells[2].innerHTML = vGoldSbjSell;
								               			goldTbl.rows[2].cells[1].innerHTML = vGoldSjcBuy;
								               			goldTbl.rows[2].cells[2].innerHTML = vGoldSjcSell;
								             		</script>
								             		<tr height='20'>
								             			<td style="font-size: 10px; width: 30%;" class="td-weather-title">&nbsp; &nbsp; Lo&#7841;i v&#224;ng </td>
								             			<td style="font-size: 10px; width: 35%;" class="td-weather-title">&nbsp; &nbsp; Mua </td>
								             			<td style="font-size: 10px; width: 35%;" class="td-weather-title">&nbsp; &nbsp; B&#225;n</td> </tr>					
													<tr height='20'>
														<td style="font-size: 10px; width: 30%;" class="td-weather-title">&nbsp; &nbsp; SBJ </td>
														<td style="font-size: 10px; width: 35%;" class="td-weather-title"></td> 
														<td style="font-size: 10px; width: 35%;" class="td-weather-title"></td>
													</tr>
													<tr height='20'>
														<td style="font-size: 10px; width: 30%;" class="td-weather-title">&nbsp; &nbsp; SJC </td>
														<td style="font-size: 10px; width: 35%;" class="td-weather-title"></td> 
														<td style="font-size: 10px; width: 35%;" class="td-weather-title"></td>
													</tr>
								             	</table>											
											</div>
										
										<div><img src="<%= themeDisplay10.getPathThemeImage() %>/<%=themesId%>_image/0.gif"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
											
<script language="javascript">
	<%=forexString%>
	for(var i = 0; i < vForexs.length-1;i++){			 
		var tblForexRow = document.getElementById("Forex").insertRow(i);			
		var x = tblForexRow.insertCell(0);
		var y = tblForexRow.insertCell(1);			
		x.innerHTML=vForexs[i];
		y.innerHTML=vCosts[i];
		x.align="center";
		y.align="center";
	}
</script>	