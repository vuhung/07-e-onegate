<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/weather/init.jsp"%>
<%@ page import="com.portlet.weather.WeatherUtil"%>
<%@include file="/init.jsp"%>
<%
	if (displayStyle.equals("1")) {
		renderResponse.setTitle("DỰ BÁO THỜI TIẾT");	
%>
<%
	String weatherStringVT =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Viettri.xml");

	String weatherStringSL =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Sonla.xml");
	
	String weatherStringHP =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Haiphong.xml");
	
	String weatherStringHN =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Hanoi.xml");
	
	String weatherStringV =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Vinh.xml");
	
	String weatherStringDN =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Danang.xml");
	
	String weatherStringNT =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Nhatrang.xml");
	
	String weatherStringPleicu =WeatherUtil.ConvertText("http://vnexpress.net/ListFile/Weather/Pleicu.xml");
																	
%>
<table width="100%" style="height: 86px;border: 1px solid #ccc;"
    >
	
	<tr>
		<td >
	
		<select  id="dropdownweather" name="dropdownweather" onchange="selectdropdownweather()" width="100px"> 
			<option value='<%=weatherStringVT %>'>Việt Trì</option>
			<option value='<%=weatherStringHN %>'>TP Hà Nội</option>
			<option value='<%=weatherStringV %>'>Vinh</option>
			<option value='<%=weatherStringDN %>'>TP Đà Nẵng</option>	
			<option value='<%=weatherStringHP %>'>TP Hải Phòng</option>
			<option value='<%=weatherStringNT %>'>Nha Trang</option>
			<option value='<%=weatherStringSL %>'>Sơn La</option>
			<option value='<%=weatherStringPleicu %>'>Pleicu</option>
		</select>
		</td>
		
	</tr>
	<tr>
		<td>
			<div align="left">
				<span id="images"></span>
				<span id="images1"
					style="margin: 0px; padding: 0px"></span> 
				<span id="images2"
					style="margin: 0px; padding: 0px"></span> 
					<img
					src="http://vnexpress.net/Images/Weather/c.gif"
					style="margin: 0px; padding: 0px"> <br> 
					<span id="thongtintt"></span><br />
					
			</div>
		</td>
	</tr>
</table>

<script type="text/javascript" lang="javascript">
	var dropdownweatherValue;
	

	function load_xml_content_string(xmlData) {
		if (window.ActiveXObject) {
			//for IE
			xmlDoc=new ActiveXObject("Microsoft.XMLDOM");
			xmlDoc.async="false";
			xmlDoc.loadXML(xmlData);
			return xmlDoc;
		} else if (document.implementation && document.implementation.createDocument) {
			//for Mozila
			parser=new DOMParser();
			xmlDoc=parser.parseFromString(xmlData,"text/xml");
			return xmlDoc;
		}
		
	}
	
	dropdownweatherValue=document.getElementById("dropdownweather").value;
	var xmlObject = load_xml_content_string(dropdownweatherValue);
	showInfor();
	function showInfor()
	{
		document.getElementById("thongtintt").innerHTML =xmlDoc
		.getElementsByTagName("Weather")[0].childNodes[0].nodeValue;
document.getElementById("images1").innerHTML = "<img src='http://vnexpress.net/Images/Weather/"
		+ xmlDoc.getElementsByTagName("AdImg1")[0].childNodes[0].nodeValue
		+ "'>";
document.getElementById("images2").innerHTML = "<img src='http://vnexpress.net/Images/Weather/"
		+ xmlDoc.getElementsByTagName("AdImg2")[0].childNodes[0].nodeValue
		+ "'>";
document.getElementById("images").innerHTML = "<img src='http://vnexpress.net/Images/Weather/"
		+ xmlDoc.getElementsByTagName("AdImg")[0].childNodes[0].nodeValue
		+ "'>";
	}
	
	function selectdropdownweather(){
	    dropdownweatherValue=document.getElementById("dropdownweather").value;
	
	    load_xml_content_string(dropdownweatherValue);
	    showInfor();
	 
	}
	
	
		//document.write(dropdownweatherValue);
		
</script>

<%
	}else if(displayStyle.equals("2")) {
		renderResponse.setTitle("GIÁ VÀNG TRONG NƯỚC");	
%>

<% 
	String forexString = WeatherUtil.ConvertText("http://vnexpress.net/Service/Forex_Content.js");
	String goldString = WeatherUtil.ConvertText("http://www.vnexpress.net/Service/Gold_Content.js");
%>
<table width="100%" style="height: 86px;border: 1px solid #ccc;" >
	<tr>
		<td valign="top"
			style="padding-top: 5px;">
			<table id="Gold" width="100%" cellspacing="1" cellpadding="6"
				bordercolor="#ccc" border="1" align="center">
			
				<tr height='20'>
					<td>&nbsp; &nbsp; Loại Vàng</td>
					<td>&nbsp; &nbsp; Mua</td>
					<td>&nbsp; &nbsp; Bán</td>
				</tr>
				<tr height='20'>
					<td>&nbsp; &nbsp; SBJ</td>
					<td style="padding-left: 10px;"><script language="javascript">
					<%=goldString%>
						document.write(vGoldSbjBuy);
					</script></td>
					<td style="padding-left: 10px;"><script language="javascript">
						document.write(vGoldSbjSell);
					</script></td>
				</tr>
			</table>
		</td>
	</tr>
</table>

<%
	}else if(displayStyle.equals("3")){
		renderResponse.setTitle("TỈ GIÁ");	
%>
<% 
	String forexString = WeatherUtil.ConvertText("http://vnexpress.net/Service/Forex_Content.js");
	String goldString = WeatherUtil.ConvertText("http://www.vnexpress.net/Service/Gold_Content.js");
%>
<table  width="100%" style="height: 86px;">
	<tr>
		<td valign="top"
			style="padding-top: 5px;">
			<table id="Forex" width="100%" cellspacing="1" cellpadding="6"
				bordercolor="#ccc" border="1" align="center">
			</table>
		</td>
	</tr>
</table>
<script language="javascript">
	
<%=forexString%>
	for ( var i = 0; i < vForexs.length - 6; i++) {
		var tblForexRow = document.getElementById("Forex").insertRow(i);
		var x = tblForexRow.insertCell(0);
		var y = tblForexRow.insertCell(1);
		x.innerHTML = vForexs[i];
		y.innerHTML = vCosts[i];
		x.align = "center";
		y.align = "center";
		
	}
</script>
<%
	}
%>

