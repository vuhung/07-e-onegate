<div class="box s3 module_general">
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
											<div class="title_col2"><h4><%= titlePortlet %></h4></div>
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
										
											<div style="padding-top: 2px;" class="ct_images">
	                                        	<center>
													<c:if test="<%= validImageExtension%>">													
														<%	if (item.isExpired()){	%>
														<div align="center">
															<b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n hi&#7875;n th&#7883;</b>
														</div>	
														<% } else {%>
														<c:if test="<%= _defaultSize%>">	
															<div align="center">		
																<a href="<%= item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" />		
																	<img src="<%= themeDisplay10.getPathMain() %>/vadvmanview/get_file?p_l_id=<%= layout.getPlid()%>&folderId=<%=item.getFolderId()%>&name=<%=item.getName()%>" 
																		title="<%= item.getTxtMouseOver()%>" />
																</a>
															</div>
														</c:if>
														
														<c:if test="<%= !_defaultSize%>">
															<div align="center">		
																<a href="<%= item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" />		
																	<img src="<%= themeDisplay10.getPathMain() %>/vadvmanview/get_file?p_l_id=<%= layout.getPlid()%>&folderId=<%=item.getFolderId()%>&name=<%=item.getName()%>" 
																		title="<%= item.getTxtMouseOver()%>" width="<%=w%>" height="<%=h%>"/>
																</a>
															</div>
														</c:if>	
														<%}%>	
													</c:if>

													<c:if test="<%= !validImageExtension%>">
														<script type="text/javascript" src="/html/portlet/vadvman/swfobject.js"></script>
														<%	if (item.isExpired()){	%>
														<div align="center">
															<b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n hi&#7875;n th&#7883;</b>
														</div>	
														<% } else {%>
														<div id="<portlet:namespace />preview">This div will be replaced</div>
														  	  
														<script type="text/javascript">
															  var s1 = new SWFObject("/html/portlet/vadvman/player.swf","ply","<%= w%>","<%= h%>","9","#ffffff");
															  var fileURL = encodeURIComponent("<%= themeDisplay10.getPathMain() %>/vadvmanview/get_file?p_l_id=<%= layout.getPlid()%>&folderId=<%= item.getFolderId()%>&name=<%= item.getName()%>");				  
															  
															  s1.addParam("allowfullscreen","false");				  				  
															  s1.addParam("allowscriptaccess","always");
															  s1.addParam("wmode","opaque");
															  s1.addParam("flashvars",'&file=' + fileURL + '&autostart=<%= _autoStart%>&controlbar=<%= controlBar%>');
															  s1.write("<portlet:namespace />preview");
														</script>
														<%}%>	
													</c:if>
	    
	    										</center>
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