<%@page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@ include file="/html/portlet/vadvmanview/init.jsp" %>
<%
	String itemId = prefs.getValue("itemId", "");
	String height = prefs.getValue("height","0");
	String width = prefs.getValue("width","0");	
	String defaultSize = prefs.getValue("defaultSize","true");
	String autoStart = prefs.getValue("autoStart","true");	
	String controlBar = prefs.getValue("controlBar","none");	
	String titlePortlet = prefs.getValue("titlePortlet","");
	String selectstyleBorder = prefs.getValue("selectstyleBorder","1");
	
	boolean _defaultSize = Boolean.valueOf(defaultSize);
	boolean _autoStart = Boolean.valueOf(autoStart);
			
	int h = Integer.valueOf(height);
	int w = Integer.valueOf(width);
		
	try	{
	 if(Validator.isNotNull(itemId)){
	   AdvItem item = AdvItemServiceUtil.getItem(Long.valueOf(itemId));
	   boolean validImageExtension = false;
	   String[] imageExtensions = PropsUtil.getArray(PropsKeys.IG_IMAGE_EXTENSIONS);
	  /*  String extensionFile = "."+DLUtil.getFileExtension(item.getName()); */
	   String extensionFile = StringPool.BLANK;
	     int pos = item.getName().lastIndexOf(StringPool.PERIOD);

        if (pos != -1) {
        	extensionFile =StringPool.PERIOD + item.getName().substring(pos + 1, item.getName().length()).toLowerCase();
        }
	   for (int i = 0; i < imageExtensions.length; i++) {  
		if (extensionFile.equals(imageExtensions[i])) {
		 validImageExtension = true;
		}
	   }
/* 	    boolean test = item.getExpriedDate()!=null && item.getExpriedDate().before(new Date()); 
		System.out.println(" result " +test +" aaaaaaaaaaaaaaaa " +" bbb " + item.getExpriedDate());
		System.out.println("validImageExtension  " + validImageExtension + "extensionFile" +extensionFile +  item.getName()); */
%>
<div align="center">
 <c:choose>
	<c:when test='<%= selectstyleBorder.equals("1") %>'>
		<%@ include file="/html/portlet/vadvmanview/style1.jspf" %>
	</c:when>
	<c:when test='<%= selectstyleBorder.equals("3") %>'>
		<%@ include file="/html/portlet/vadvmanview/style3.jspf" %>
	</c:when>
</c:choose> 
</div>
<%
		}
	} catch(Exception ex){
		System.out.print(ex.toString());
		out.println("<b>B&#7841;n vui lòng ch&#7885;n file qu&#7843;ng cáo &#273;&#7875; hi&#7875;n th&#7883; !</b>");
	}	
%>	