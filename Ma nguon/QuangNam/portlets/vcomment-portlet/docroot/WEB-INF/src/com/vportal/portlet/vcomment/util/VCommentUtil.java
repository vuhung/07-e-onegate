package com.vportal.portlet.vcomment.util;

import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;

import com.liferay.portal.kernel.util.Validator;

public class VCommentUtil {
	/**
	 * Ham phan tich ngay thang
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
	 * Ham chuyen 1 xau sang ngay thang
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

	

	private static int compareName(Vector source, Vector target) {
		Collator collator = Collator.getInstance(new Locale("vi", "VN"));
		int totalS = source.size() - 1;
		int totalT = target.size() - 1;
		String nameS = "";
		String nameT = "";
		int compare = 0;
		for (int s = totalS, t = totalT; (s > -1) && (t > -1); s--, t--) {
			nameS = (String) source.get(s);
			nameT = (String) target.get(t);
			compare = collator.compare(nameS, nameT);
			// compare = nameS.compareTo(nameT);
			if (compare > 0) {
				return 1;
			} else if (compare < 0) {
				return -1;
			} else {
				continue;
			}
		}
		if (totalS > totalT) {
			return 1;
		} else if (totalS < totalT) {
			return -1;
		} else {
			return 0;
		}
	}

	private static Vector splitName(String name) {
		if (Validator.isNull(name) || name.equals("")) {
			return null;
		}

		StringTokenizer st = new StringTokenizer(name, " ");
		Vector vctTemp = new Vector();
		while (st.hasMoreTokens()) {
			vctTemp.add(st.nextToken());
		}
		return vctTemp;
	}

	/**
	 * Ham nhan vao mot list cac group, sau do sap xep chung theo thu tu
	 * cha-con.
	 * 
	 * @param listGroup
	 *            List cac group can truyen vao
	 * @return Tra ve mot List cac group da duoc sap xep, bo sung them group co
	 *         ten la ROOT
	 */
	

	/**
	 * Ham tim nut con cua mot nut
	 * 
	 * @param tree
	 *            Cay k-phan
	 * @param parentId
	 *            ID cua nut cha
	 * @return danh sach cac nut con cua nut cha
	 */
	

	/**
	 * Ham tim kiem theo chieu sau
	 * 
	 * @param result
	 *            ket qua tra ve cua ham
	 * @param mark
	 *            dung de danh dau, truyen vao 1 mang String binh thuong
	 * @param tree
	 *            cay K-phan
	 * @param u
	 *            chi so cua nut cha
	 */
	

	/**
	 * ham tim kiem group trong 1 tree dua theo group_id
	 * 
	 * @param tree
	 *            cay K-phan
	 * @param groupId
	 *            group_id cua group can tim
	 * @return tra ve group neu tim thay va tra ve null neu khong tim thay
	 */
	

	/**
	 * Dinh dang hien thi giua parent-child. Cac group la child se thut vao so
	 * voi group la cha 1 don vi bang " - "
	 * 
	 * @param tree
	 *            danh sach group cha va con, da sap xep thu tu
	 * @return tra ve 1 danh sach da duoc dinh dang
	 */
	

	/**
	 * @reference com.vportal.portlet.newsadmin.utils.NewsUtils
	 * @return
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
	 * @reference com.vportal.portlet.newsadmin.utils.ImagesUtils
	 * @param contentType
	 * @return
	 */
	public static boolean checkIsImage(String contentType) {

		if (Validator.isNull(contentType)) {
			return false;
		}

		if (contentType.indexOf("gif") == -1
				&& contentType.indexOf("jpg") == -1
				&& contentType.indexOf("jpeg") == -1
				&& contentType.indexOf("png") == -1) {
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @reference com.vportal.portlet.newsadmin.utils.ImagesUtils
	 * @param largePhotoKey
	 * @param photoBytes
	 */
	public static void saveOriginalImages(String largePhotoKey,
			byte[] photoBytes) {

		if (photoBytes != null && Validator.isNotNull(largePhotoKey)) {
			// Save Fullsize Image
			// ImageLocalUtil.put(largePhotoKey, photoBytes);
		}
	}
	//
	// public static List getListByPage(List list, int pageNumber,
	// HttpServletRequest req) throws PortalException, SystemException {
	//
	// if (list == null || list.size() <= 0 || pageNumber < 0) {
	// return null;
	// }
	//
	// String companyId = PortalUtil.getCompanyId(req);
	// PortletPreferences prefs = PrefsPropsUtil.getPreferences(companyId);
	//
	// String entryPerPage = PrefsPropsUtil.getString(prefs, companyId, "20");
	// int itemPerPage = Validator.isNotNull(entryPerPage) ? Integer
	// .parseInt(entryPerPage) : 10;
	//
	// req.setAttribute("perpage", String.valueOf(itemPerPage));
	//
	// int totalItems = list.size();
	// req.setAttribute("totalItems", String.valueOf(totalItems));
	// int begin = pageNumber * itemPerPage - itemPerPage;
	// int end = begin + itemPerPage;
	// if (end > totalItems)
	// end = totalItems;
	// int totalPage = 0;
	//
	// if (totalItems % itemPerPage > 0) {
	// totalPage = totalItems / itemPerPage + 1;
	// } else {
	// totalPage = totalItems / itemPerPage;
	// }
	// req.setAttribute("totalPage", String.valueOf(totalPage));
	// return list.subList(begin, end);
	// }
	//
	// public static boolean isValidRole(ActionRequest req) {
	// String userId = PortalUtil.getUserId(req);
	// if (RoleChecker.isEditor(userId) || RoleChecker.isAdministrator(userId)
	// || RoleChecker.isGeneralEditor(userId)
	// || RoleChecker.isWriter(userId)) {
	// return true;
	// }
	// return false;
	// }
}
