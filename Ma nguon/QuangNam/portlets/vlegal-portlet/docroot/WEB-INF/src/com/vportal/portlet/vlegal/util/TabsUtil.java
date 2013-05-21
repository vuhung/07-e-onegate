package com.vportal.portlet.vlegal.util;

import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class TabsUtil {

	public static HttpServletRequest request;
	public static String tabs1 = ParamUtil.getString(request, "tabs1");
	public static String tabs2 = ParamUtil.getString(request, "tabs2");
	public static String tabsNames = "tab.thong.tin.chung,tab.van.ban.phap.luat,tab.quan.ly.chung,tab.nhat.ky,tab.cau.hinh";
}
