package com.vportal.portlet.vlinksman.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VLinksmanUtil {
	public static String dateParser(Date date) {
		if (date == null) {
			return "";
		}
		Calendar cal = Calendar.getInstance();
		String dateStr = "";
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		dateStr = day + "/" + month + "/" + year;
		return dateStr;
	}

	/**
	 * Ham chuyen 1 xau sang ngay thang<br />
	 * Copied from com.vportal.portlet.edirectory.util.EDirectoryUtil
	 * 
	 * @param date
	 *            Xau chua ngay thang, co dang: dd/MM/yyyy
	 * @return Doi tuong ngay thang
	 */
	public static Date dateParser(String date) {
		try {
			SimpleDateFormat result = new SimpleDateFormat("dd/MM/yyyy");
			Date newDate = result.parse(date);
			return newDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
