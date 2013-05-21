package com.vsi.advertisement.portlet.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.vsi.advertisement.portlet.model.AdvItem;
import com.vsi.advertisement.portlet.model.impl.AdvItemImpl;
import com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil;

public class ActionUtil {

	public static AdvItem advItemFormRequest(ActionRequest req) throws PortalException, SystemException{
		UploadPortletRequest uploadReq = PortalUtil.getUploadPortletRequest(req);
		ThemeDisplay theme = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		Layout layout = theme.getLayout();
//		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		AdvItem item = new AdvItemImpl();
		long groupId = layout.getGroupId();
		long companyId = theme.getCompanyId();
		long userId = theme.getUserId();
		
		long typeId = Long.valueOf(uploadReq.getParameter("typeId"));
		String description = uploadReq.getParameter("description");
		String url = uploadReq.getParameter("url");
		String tooltip = uploadReq.getParameter("txtMouseOver");
		
		boolean status = false;
		boolean isTargetBlank = ParamUtil.getBoolean(uploadReq, "isTargetBlank");
		boolean neverExpired = ParamUtil.getBoolean(uploadReq, "neverExpired");
		
		int expiredMonth = ParamUtil.getInteger(req, "expiredMonth");
		int expiredDate = ParamUtil.getInteger(req, "expiredDay");
		int expiredYear = ParamUtil.getInteger(req, "expiredYear");

		Locale locale = null;
		TimeZone timeZone = null;

		locale = LocaleUtil.getDefault();
		timeZone = TimeZoneUtil.getDefault();

		Calendar expiredDay = CalendarFactoryUtil.getCalendar(timeZone, locale);

		if (neverExpired) {
			expiredDay = null;
			status = true;

		} else {
			expiredDay.set(Calendar.MONTH, expiredMonth);
			expiredDay.set(Calendar.DATE, expiredDate);
			expiredDay.set(Calendar.YEAR, expiredYear);
		}

		if (Validator.isNotNull(expiredDay)) {
			if (expiredDay.getTime().after(new Date())) {
				status = true;
			}
		}
		
		// upload image
		String name = "";
		String realPath = req.getPortletSession().getPortletContext().getRealPath("/");
        String sourceFileName = null;
        byte[] bytes = null;
        String image = uploadReq.getFileName("image");
//        System.out.println("RealPath"+realPath);
        if(Validator.isNotNull(image)){
        try{
             sourceFileName =uploadReq.getFileName("image");
//             System.out.println("File name :"  + sourceFileName);
             File file = uploadReq.getFile("image");
             try {      
                bytes = FileUtil.getBytes(file);
             } catch (IOException e2) {            
                e2.printStackTrace();
             }
             File newFile=null;
            
             if ((bytes != null) && (bytes.length > 0)) {            
             try {
            	 newFile = new File(realPath+sourceFileName);
            	 FileInputStream fileInputStream = new FileInputStream(file);
            	 FileOutputStream fileOutputStream = new FileOutputStream(newFile);            
            	 fileInputStream.read(bytes);               
            	 fileOutputStream.write(bytes, 0, bytes.length);                   
            	 fileOutputStream.close();
            	 fileInputStream.close();
            	 SessionMessages.add(req, "success");
             }
             catch (FileNotFoundException e) {
            	 System.out.println("File Not Found.");               
            	 e.printStackTrace();
            	 SessionMessages.add(req, "error");
             }
             catch (IOException e1){
            	 System.out.println("Error Reading The File.");
            	 e1.printStackTrace();
            	 SessionMessages.add(req, "error");
             }
             }	
            
        } catch (Exception e) {
        	System.out.println("Exception::::"+e.getMessage());
        	SessionMessages.add(req, "error");
        }
        	name = sourceFileName;
        }
        
        if(Validator.isNull(expiredDay)){
//        	item = AdvItemLocalServiceUtil.addItem(typeId, name, description, url , tooltip, null , isTargetBlank, status, groupId, companyId, userId);
        }else{
//        	item = AdvItemLocalServiceUtil.addItem(typeId, name, description, url , tooltip, expiredDay.getTime() , isTargetBlank, status, groupId, companyId, userId);
        }
        
        return item;
	}
	
	public static String parseDateToString(Date myDate){
		if(myDate == null){
			return "";
		}
		Calendar cal = Calendar.getInstance();
		String date = "";
		cal.setTime(myDate);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		date = day + "/" + month + "/" + year;
		return date;				
	}
	
	public static String getExtension(String fileName){
		String ext = null;
		int i = fileName.lastIndexOf('.');
		if(i > 0 && i < fileName.length() - 1)
			ext = fileName.substring(i+1).toLowerCase();
		if(ext == null)
			return "";
		return ext;
	}
}








