package com.vportal.portlet.vlegal.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.Validator;

public class VLegalUtil {
	/**
	 * Generate the random prefix.<br /> Copied from:
	 * com.vportal.portlet.newsadmin.utils.NewsUtils
	 * 
	 * @return The random prefix
	 */

	public static String getRandPrefix() {
		Calendar c = Calendar.getInstance();
		String curTime = String.valueOf(c.getTimeInMillis());
		if (Validator.isNotNull(curTime) && curTime.length() > 23) {
			curTime = curTime.substring(10, 23);
		}
		return curTime;
	}

	/**
	 * Ham phan tich ngay thang<br /> Copied from
	 * com.vportal.portlet.edirectory.util.EDirectoryUtil
	 * 
	 * @param date
	 *            Ngay thang can phan tich
	 * @return Dang dd/MM/yyyy cua ngay thang nhap vao
	 */
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
	 * Ham chuyen 1 xau sang ngay thang<br /> Copied from
	 * com.vportal.portlet.edirectory.util.EDirectoryUtil
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

	public static String trimString(String str, int length) {
		try {
			StringBuffer buff = new StringBuffer();
			int index = str.indexOf(" ", length);
			buff.append(str.substring(0, index));
			buff.append("...");
			return buff.toString();
		} catch (StringIndexOutOfBoundsException e) {
			return str;
		}
	}
	
	public static String getPrefsPropsUtil(long  companyId) throws Exception{
		MethodKey method = new MethodKey("com.liferay.portal.util.PrefsPropsUtil", "getString",long.class,String.class);
		Object[] args = new Object[]{companyId};
		Object returnObj = PortalClassInvoker.invoke(false, method, args) ;
		if (returnObj != null) {
			return (String) returnObj;
		}
		else {
			return null;
		}
	}
	
	public static String getPrefsPropsUtil(long  companyId, String key) throws Exception{
		MethodKey method = new MethodKey("com.liferay.portal.util.PrefsPropsUtil", "getString",long.class,String.class);
		Object[] args = new Object[]{companyId,key};
		Object returnObj = PortalClassInvoker.invoke(false, method, args) ;
		if (returnObj != null) {
			return (String) returnObj;
		}
		else {
			return null;
		}
	}
	
	public static String getPrefsPropsUtil(long  companyId, String key, String defaults) throws Exception{
		MethodKey method = new MethodKey("com.liferay.portal.util.PrefsPropsUtil", "getString",long.class,String.class);
		Object[] args = new Object[]{companyId,key};
		Object returnObj = PortalClassInvoker.invoke(false, method, args) ;
		if (returnObj != null) {
			return (String) returnObj;
		}
		else {
			return defaults;
		}
	}
	
	public static boolean getBooleanPrefsPropsUtil(long  companyId, String key) throws Exception{
		MethodKey method = new MethodKey("com.liferay.portal.util.PrefsPropsUtil", "getString",long.class,String.class);
		Object[] args = new Object[]{companyId,key};
		Object returnObj = PortalClassInvoker.invoke(false, method, args) ;
		if (returnObj != null) {
			return Boolean.valueOf((String) returnObj) ;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean getBooleanPrefsPropsUtil(long  companyId, String key, boolean defaults) throws Exception{
		MethodKey method = new MethodKey("com.liferay.portal.util.PrefsPropsUtil", "getString",long.class,String.class);
		Object[] args = new Object[]{companyId,key};
		Object returnObj = PortalClassInvoker.invoke(false, method, args) ;
		if (returnObj != null) {
			return Boolean.valueOf((String) returnObj) ;
		}
		else {
			return defaults;
		}
		
	}
	
	public static int getIntegerPrefsPropsUtil(long  companyId, String key) throws Exception{
		MethodKey method = new MethodKey("com.liferay.portal.util.PrefsPropsUtil", "getString",long.class,String.class);
		Object[] args = new Object[]{companyId,key};

			Object returnObj = PortalClassInvoker.invoke(false, method, args) ;
			if (returnObj != null) {
				return Integer.valueOf((String) returnObj) ;
			}
			else {
				return 0;
			}
	}
	
	
}
