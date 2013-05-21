<%@include file="/html/portlet/vcmsviewcontent/init.jsp"%>
<%
	String categoryId = ParamUtil.getString(request,"categoryId");
%>
<form name="<portlet:namespace/>fmRSS" method="POST">
<input type="hidden" name="categoryId" value="<%=categoryId%>"/>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
	      <tr>
			<td>
	        <table width="100%" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		            <th class="hot-news"><p class="title01">RSS</p></th>
		          </tr>
        	</table>
	 	<table class="box-news" width="100%" border="0" cellspacing="0" cellpadding="0">
          
          <tr>
            <td>
              <p class="rss-title no-top">RSS l� g�?</p>
			  <p class="al-j">RSS l� t&#7915; vi&#7871;t t&#7855;t c&#7911;a Really Simple Syndication- D&#7883;ch v&#7909; cung c&#7845;p th�ng tin c&#7921;c k� &#273;&#417;n gi&#7843;n. D&#7883;ch v&#7909; n�y gi�p b&#7841;n gi&#7843;i quy&#7871;t v&#7845;n &#273;&#7873; v&#7873; t�nh c&#7853;p nh&#7853;t c&#7911;a th�ng tin b&#7857;ng vi&#7879;c cung c&#7845;p cho b&#7841;n nh&#7919;ng th�ng tin m&#7899;i nh&#7845;t m� b&#7841;n &#273;ang quan t�m.</p>

<p>Hi&#7879;n t&#7841;i kh�ng ph&#7843;i b&#7845;t c&#7913; trang web n�o c&#361;ng cung c&#7845;p RSS, nh&#432;ng d&#7883;ch v&#7909; n�y s&#7869; d&#7847;n tr&#7903; n�n ph&#7893; bi&#7871;n. Nhi&#7873;u trang web tin t&#7913;c nh&#432; BBC, CNN, v� New York Times &#273;ang cung c&#7845;p RSS.
</p>
			  <div class="rss-link">
			    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td>
                      		<a href="javascript:void(0);" onclick="javascript:<portlet:namespace/>submitFormRSS();">
			  					<img src="/html/portlet/vcmsviewcontent/images/rss.png" title="Xu&#7845;t b&#7843;n RSS"> <b>Xu&#7845;t b&#7843;n RSS cho chuy�n m&#7909;c n�y</b>
			  				</a>
                    </td>
                  </tr>
                </table>
			  </div>
			  <p class="rss-title">C�c gi&#7899;i h&#7841;n s&#7917; d&#7909;ng</p>
			  <p class="al-j">Nh�n chung, &#273;&#7847;u ti�n b&#7841;n c&#7847;n c� m&#7897;t th&#7913; g&#7885;i l� tr�nh &#273;&#7885;c tin (news reader). C� r&#7845;t nhi&#7873;u ki&#7875;u tr�nh &#273;&#7885;c tin, m&#7897;t s&#7889; &#273;&#432;&#7907;c nh�ng tr&#7921;c ti&#7871;p trong tr�nh duy&#7879;t, m&#7897;t s&#7889; l� c�c &#7913;ng d&#7909;ng c� th&#7875; t&#7843;i v&#7873; t&#7915; Internet. T&#7845;t c&#7843; nh&#7919;ng c�ng c&#7909; n�y s&#7869; gi�p b&#7841;n c� th&#7875; xem &#273;&#432;&#7907;c th�ng tin v� &#273;&#259;ng k� s&#7917; d&#7909;ng danh m&#7909;c tin c&#7911;a RSS.</p>

<p class="al-j">Sau khi b&#7841;n &#273;� ch&#7885;n &#273;&#432;&#7907;c m&#7897;t tr�nh &#273;&#7885;c tin, t&#7845;t c&#7843; nh&#7919;ng g� b&#7841;n ph&#7843;i l�m l� l&#7921;a ch&#7885;n n&#7897;i dung th�ng tin m� b&#7841;n c&#7847;n. V� d&#7909; nh&#432; b&#7841;n c&#7847;n th�ng tin m&#7899;i nh&#7845;t v&#7873; c�ng ngh&#7879; th�ng tin, b&#7841;n c� th&#7875; s&#7917; d&#7909;ng n�t RSS m�u cam c&#7911;a m&#7909;c Nh&#7883;p s&#7889;ng s&#7889;. C� th&#7875; k�o/th&#7843; n�t n�y v�o trong tr�nh &#273;&#7885;c tin c&#7911;a b&#7841;n, ho&#7863;c c&#7855;t/d�n Url v�o ch&#7913;c n&#259;ng th�m danh m&#7909;c tin c&#7911;a tr�nh &#273;&#7885;c tin.</p>

<p class="al-j">M&#7897;t s&#7889; tr�nh duy&#7879;t, trong &#273;� c� Firefox, Opera v� Safari, c� ch&#7913;c n&#259;ng t&#7921; &#273;&#7897;ng ch&#7885;n danh m&#7909;c tin RSS cho b&#7841;n. N&#7871;u c&#7847;n bi&#7871;t th�ng tin c&#7909; th&#7875; h&#417;n, b&#7841;n c� th&#7875; xem th�ng tin tr�n c�c trang ch&#7911; c&#7911;a c�c tr�nh duy&#7879;t &#273;�.</p>

<p class="al-j">C� r&#7845;t nhi&#7873;u lo&#7841;i tr�nh &#273;&#7885;c tin kh�c nhau v� c�c phi�n b&#7843;n &#273;&#432;&#7907;c th&#432;&#7901;ng xuy�n c&#7853;p nh&#7853;t. M&#7895;i lo&#7841;i tr�nh &#273;&#7885;c tin l&#7841;i &#273;�i h&#7887;i m&#7897;t h&#7879; &#273;i&#7873;u h�nh kh�c nhau, do &#273;� b&#7841;n ph&#7843;i c�n nh&#7855;c v&#7873; &#273;i&#7873;u &#273;� khi l&#7921;a ch&#7885;n tr�nh &#273;&#7885;c tin.</p></td>
          </tr>
        </table>

		</td>
      </tr>
    </table>
</form>