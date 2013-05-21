package com.vportal.portlet.vcalendar.util;

import java.util.Calendar;

public class VCalUtil {

	public static Calendar getFirstDayOfWeek(Calendar cal) {

		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			break;
		case 2:
			cal.add(Calendar.DATE, -1);
			break;
		case 3:
			cal.add(Calendar.DATE, -2);
			break;
		case 4:
			cal.add(Calendar.DATE, -3);
			break;
		case 5:
			cal.add(Calendar.DATE, -4);
			break;
		case 6:
			cal.add(Calendar.DATE, -5);
			break;
		case 7:
			cal.add(Calendar.DATE, -6);
			break;
		}

		return cal;
	}
}
