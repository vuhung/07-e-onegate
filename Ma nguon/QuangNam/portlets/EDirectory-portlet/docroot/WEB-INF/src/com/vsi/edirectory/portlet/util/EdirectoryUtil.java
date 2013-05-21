package com.vsi.edirectory.portlet.util;

import java.util.Calendar;

import com.liferay.portal.kernel.util.Validator;
public class EdirectoryUtil{
public static String getRandPrefix() {
	Calendar c = Calendar.getInstance();
	String curTime = String.valueOf(c.getTimeInMillis());
	if (Validator.isNotNull(curTime) && curTime.length() > 23) {
		curTime = curTime.substring(10, 23);
	}
	return curTime;
}
}