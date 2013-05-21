<%@ include file="/html/portlet/vcmsviewcontent/includes/javascript_style.jsp" %>
<style type="text/css">
	/* JCarousel */	
	#hideJcarousel{
		padding:5px 10px;
		background:#FEF9F1
	}
	#mycarousel li.jcarousel-item img{
		border-left: 5px solid #fff;
		border-right: 5px solid #fff;
	}
	.jcarousel-container {
	    position: relative;
	}	
	.jcarousel-clip {
	    z-index: 2;
	    padding: 0;
	    margin: 0;
	    overflow: hidden;
	    position: relative;
	}
	
	.jcarousel-list {
	    z-index: 1;
	    overflow: hidden;
	    position: relative;
	    top: 0;
	    left: 0;
	    margin: 0;
	    padding: 0;
	}
	
	.jcarousel-list li,
	.jcarousel-item {
	    float: left;
	    list-style: none;
	}
	.jcarousel-next {
	    z-index: 3;
	    display: none;
	}
	
	.jcarousel-prev {
	    z-index: 3;
	    display: none;
	}
	.jcarousel-skin-tango .jcarousel-container-horizontal {
		height:102px;
		background:#fef9f1
	}
	
	.jcarousel-skin-tango .jcarousel-clip-horizontal {
	    width:  640px;
	    height: 105px;	
	}
	.jcarousel-skin-tango .jcarousel-item {
	    width: 103px;
	    height: 105px;
	    padding-top: 9px;
	}
	
	.jcarousel-skin-tango .jcarousel-item-horizontal {
	    margin: 0px 12px;
	}
	
	/**
	 *  Horizontal Buttons
	 */
	.jcarousel-skin-tango .jcarousel-next-horizontal {
	    position: absolute;    
	    right: 0px;
	    width: 27px;
	    height: 102px;
	    cursor: pointer;
	    background: transparent url(<%= themeDisplay.getPathThemeImage() %>/HN_image/i_11.jpg) no-repeat 0 0;
	}
	
	.jcarousel-skin-tango .jcarousel-next-disabled-horizontal,
	.jcarousel-skin-tango .jcarousel-next-disabled-horizontal:hover,
	.jcarousel-skin-tango .jcarousel-next-disabled-horizontal:active {
	    cursor: default;
	}
	
	.jcarousel-skin-tango .jcarousel-prev-horizontal {
	    position: absolute;
	    left: 0px;
	    width: 27px;
	    height: 102px;
	    cursor: pointer;
	    background: transparent url(<%= themeDisplay.getPathThemeImage() %>/HN_image/i_10.jpg) no-repeat 0 0;
	}
	
	.jcarousel-skin-tango .jcarousel-prev-disabled-horizontal,
	.jcarousel-skin-tango .jcarousel-prev-disabled-horizontal:hover,
	.jcarousel-skin-tango .jcarousel-prev-disabled-horizontal:active {
	  cursor: default;
	}
	.cssimg a:link, .cssimg a:visited{
		color:#000;
		font-weight:normal;
		font-size:11px;		
	}
	.cssimg a:hover{
		text-decoration:underline;		
	}
	.clearfix {
		display: block;
	}	
</style>
<%
	VcmsArticle lastArticle = null;	
	List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,listCategory[0], statusId , numberArticlesInCat);
	VcmsCategory category = null;
	try{
		category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[0]);
	}catch(Exception e){
	}
	PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("struts_action", "/vcmsviewcontent/view");
	catURL.setParameter("categoryId", category.getCategoryId());

%>
	
<script language ="javascript">
		var mycarousel_itemList = [];
		<%
			for(int i=0; i < articlesByCat.size();i++){
				VcmsArticle article = (VcmsArticle)articlesByCat.get(i);
				PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
				articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
				articleURL.setParameter("articleId", article.getArticleId());
				articleURL.setParameter("categoryId", category.getCategoryId());
		%>
		
			 	var item= {url: '<%=themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()%>', title: '<%=StringUtil.shorten(article.getTitle(),35)%>',link: '<%=articleURL%>'}
			    mycarousel_itemList.push(item)
				
		<%		
			}
		%>
		/* circular loop functions */
		function mycarousel_itemVisibleInCallback(carousel, item, i, state, evt)
		{
			// The index() method calculates the index from a
			// given index who is out of the actual item range.
			
			var idx = carousel.index(i, mycarousel_itemList.length);
				
			carousel.add(i, mycarousel_getItemHTML(mycarousel_itemList[idx - 1]));
						
			
		};
		function mycarousel_itemVisibleOutCallback(carousel, item, i, state, evt)
		{
			carousel.remove(i);
		};
	
		/* auto advance functions */
		function mycarousel_initCallback(carousel)
		{
			// Disable autoscrolling if the user clicks the prev or next button.
			carousel.buttonNext.bind('click', function() {
				carousel.startAuto(0);
			});
	
			carousel.buttonPrev.bind('click', function() {
				carousel.startAuto(0);
			});
	
			// Pause autoscrolling if the user moves with the cursor over the clip.
			carousel.clip.hover(function() {
				carousel.stopAuto();
			}, function() {
				carousel.startAuto();
			});
		};
	
		/**
		 * Item html creation helper.
		 */
		function mycarousel_getItemHTML(item)
		{
			return '<div class="cssimg" align="left"><img src="' + item.url + '" height="60" width="90" alt="' + item.title + '"/><br><a href="'+ item.link +'">'+ item.title +'</a></div>';
	
		};
	
		jQuery(document).ready(function() {
			
					jQuery('#mycarousel').jcarousel({
						wrap: 'circular',
						itemVisibleInCallback: {onBeforeAnimation: mycarousel_itemVisibleInCallback},						
						itemVisibleOutCallback: {onAfterAnimation: mycarousel_itemVisibleOutCallback},						
						auto: 7,
						initCallback: mycarousel_initCallback
					});
				}
			
		);		
	
</script>
	 
<table height="150" width="100%" class="border_top_picture">
	<tr>				
		<td>
		  <div class="line2 clearfix">
              <div class="galery_title"><label style="color:#B40900;"><b>Tin &#7843;nh</b></label></div>
              <div style="clear:both"></div>
              <div id="hideJcarousel">
                <div class="jcarousel-skin-tango">
                  <div style="display: block;" class="jcarousel-container jcarousel-container-horizontal">
                    <div style="display: block;" class="jcarousel-prev jcarousel-prev-horizontal"></div>
                    <div style="display: block;" class="jcarousel-next jcarousel-next-horizontal"></div>
                    <div class="jcarousel-clip jcarousel-clip-horizontal" style="left:25px">
                      <ul id="mycarousel" class="jcarousel-list jcarousel-list-horizontal" style="left: 0px;">
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
          </div>						
		</td>
	</tr>
</table>	  	