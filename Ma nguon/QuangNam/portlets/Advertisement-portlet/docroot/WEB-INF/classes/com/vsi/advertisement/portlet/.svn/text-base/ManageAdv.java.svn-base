package com.vsi.advertisement.portlet;

import java.io.File;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.taglib.FileUploadUtil;
import com.vsi.advertisement.portlet.model.AdvItem;
import com.vsi.advertisement.portlet.model.AdvType;
import com.vsi.advertisement.portlet.model.impl.AdvItemImpl;
import com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil;
import com.vsi.advertisement.portlet.service.AdvTypeLocalServiceUtil;
import com.vsi.advertisement.portlet.service.AdvTypeServiceUtil;
import com.vsi.advertisement.portlet.util.ActionUtil;


/**
 * Portlet implementation class ManageAdv
 */
public class ManageAdv extends MVCPortlet {
 
	public static final String VADVMAN = "VAdvman";

	/**
	 * 
	 * @param req
	 * @param res
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void addType(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		ThemeDisplay theme = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = theme.getUserId();
		long groupId = theme.getLayout().getGroupId();
		long companyId = theme.getCompanyId();
		String name = ParamUtil.getString(req, "name");
		String description = ParamUtil.getString(req, "description");
		
		AdvTypeLocalServiceUtil.addType(groupId, companyId, userId, name, description);
		res.setRenderParameter("jspPage", "/html/manage_adv/view.jsp?tab1=tab.adv.type");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws NoSuchAdvTypeException
	 * @throws SystemException
	 */
	public void updateType(ActionRequest req, ActionResponse res) throws NoSuchAdvTypeException, SystemException{
		long typeId = ParamUtil.getLong(req, "typeId");
		AdvType type = AdvTypeServiceUtil.getType(typeId);
		type.setName(ParamUtil.getString(req, "name"));
		type.setDescription(ParamUtil.getString(req, "description"));
		type.setModifiedDate(new Date());
		
		AdvTypeServiceUtil.updateType(type);
		res.setRenderParameter("jspPage", "/html/manage_adv/view.jsp?tab1=tab.adv.type");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void deleteType(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long typeId = ParamUtil.getLong(req, "typeId");
		AdvTypeServiceUtil.deleteType(typeId);
		res.setRenderParameter("jspPage", "/html/manage_adv/view.jsp?tab1=tab.adv.type");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void addItem(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		AdvItem item = ActionUtil.advItemFormRequest(req);
		res.setRenderParameter("jspPage", "/html/manage_adv/view.jsp?tab1=tab.adv.item");
	}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws Exception 
	 */
	public void updateItem(ActionRequest req, ActionResponse res) throws Exception{
		UploadPortletRequest uploadReq = PortalUtil.getUploadPortletRequest(req);
		ThemeDisplay theme = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		Layout layout = theme.getLayout();
		long itemId = ParamUtil.getLong(uploadReq, "itemId");
		
//		AdvItem item = AdvItemLocalServiceUtil.getAdvItem(itemId);
//		item.setGroupId(layout.getGroupId());
//		item.setCompanyId(theme.getCompanyId());
//		
//		item.setTypeId(Long.valueOf(uploadReq.getParameter("typeId")));
//		item.setDescription(uploadReq.getParameter("description"));
//		item.setUrl(uploadReq.getParameter("url"));
//		item.setTxtMouseOver(uploadReq.getParameter("txtMouseOver"));
		
		long groupId = layout.getGroupId();
		long companyId = theme.getCompanyId();
		long userId = theme.getUserId();
		long typeId = Long.valueOf(uploadReq.getParameter("typeId"));
		long folderId = 0l;
		
		String description = uploadReq.getParameter("description");
		String url = uploadReq.getParameter("url");
		String txtMouseOver = uploadReq.getParameter("txtMouseOver");
		
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
		
		String[] communityPermissions = req
				.getParameterValues("communityPermissions");

		String[] guestPermissions = req.getParameterValues("guestPermissions");
		
		AdvItem item = new AdvItemImpl();

		if (itemId <= 0) {
			if (Validator.isNull(expiredDay)) {
				item = AdvItemLocalServiceUtil.addItem(typeId,"", description, url, txtMouseOver, null, isTargetBlank, 
						status, groupId, companyId, folderId, userId, null, null, 
						communityPermissions, guestPermissions);

			} else {
				item = AdvItemLocalServiceUtil.addItem(typeId,"", description, url, txtMouseOver, expiredDay.getTime(), isTargetBlank, 
						status, groupId, companyId, folderId, userId, null, null, 
						communityPermissions, guestPermissions);
			}

			attachFile(item, req,uploadReq);

		} else {
			item = AdvItemLocalServiceUtil.getAdvItem(itemId);

			attachFile(item, req, uploadReq);

			if (Validator.isNull(expiredDay)) {
				AdvItemLocalServiceUtil.updateItem(itemId, groupId, companyId,"", description, url, 
						isTargetBlank, txtMouseOver, status, typeId, folderId, null);
//				AdvItemServiceUtil.updateItem(itemId, groupId, companyId, item
//						.getName(), description, url, isTargetBlank,
//						txtMouseOver, status, typeId, item.getFolderId(), null);
			} else {
				AdvItemLocalServiceUtil.updateItem(itemId, groupId, companyId, "", description, url, 
						isTargetBlank, txtMouseOver, status, typeId, folderId, expiredDay.getTime());
//				AdvItemServiceUtil.updateItem(itemId, groupId, companyId, item
//						.getName(), description, url, isTargetBlank,
//						txtMouseOver, status, typeId, item.getFolderId(),
//						expiredDay.getTime());
			}

		}
        
//        AdvItemLocalServiceUtil.updateAdvItem(item, false);
		// upload image
//		String name = "";
//		String realPath = req.getPortletSession().getPortletContext().getRealPath("/");
//        String sourceFileName = null;
//        byte[] bytes = null;
//        String image = uploadReq.getFileName("image");
//        System.out.println("RealPath"+realPath);
//        if(Validator.isNotNull(image)){
//        try{
//             sourceFileName =uploadReq.getFileName("image");
//             System.out.println("File name :"  + sourceFileName);
//             File file = uploadReq.getFile("image");
//             try {      
//                bytes = FileUtil.getBytes(file);
//             } catch (IOException e2) {            
//                e2.printStackTrace();
//             }
//             File newFile=null;
//            
//             if ((bytes != null) && (bytes.length > 0)) {            
//             try {
//            	 newFile = new File(realPath+sourceFileName);
//            	 FileInputStream fileInputStream = new FileInputStream(file);
//            	 FileOutputStream fileOutputStream = new FileOutputStream(newFile);            
//            	 fileInputStream.read(bytes);               
//            	 fileOutputStream.write(bytes, 0, bytes.length);                   
//            	 fileOutputStream.close();
//            	 fileInputStream.close();
//            	 SessionMessages.add(req, "success");
//             }
//             catch (FileNotFoundException e) {
//            	 System.out.println("File Not Found.");               
//            	 e.printStackTrace();
//            	 SessionMessages.add(req, "error");
//             }
//             catch (IOException e1){
//            	 System.out.println("Error Reading The File.");
//            	 e1.printStackTrace();
//            	 SessionMessages.add(req, "error");
//             }
//             }	
//            
//        } catch (Exception e) {
//        	System.out.println("Exception::::"+e.getMessage());
//        	SessionMessages.add(req, "error");
//        }
//        	name = sourceFileName;
//        	if(item.getName() != null){
//        		File file = new File(req.getPortletSession().getPortletContext().getRealPath("/")+item.getName());
//        		file.delete();
//        	}
//        	item.setName(name);
//        	
//        }else if(item.getName() != null){
//        	item.setName(item.getName());
//        }

	}
	
	// Attach File
		public void attachFile(AdvItem item, ActionRequest req, UploadPortletRequest uploadReq) throws Exception {
			
			try {
				if (item != null) {

					String portletId = VADVMAN;

					FileUploadUtil.uploadFile(req,uploadReq, portletId, AdvItem.class, item
							.getItemId());

					List listAttachment = AttachmentLocalServiceUtil
							.getDLFileEntries(AdvItem.class, item.getItemId());

					for (int i = 0; i < listAttachment.size(); i++) {
						DLFileEntry fileEntry = (DLFileEntry) listAttachment.get(i);

						item.setName(fileEntry.getTitle());
						item.setFolderId(fileEntry.getFolderId());
					}

					AdvItemLocalServiceUtil.updateAdvItem(item);
				}
			} catch (Exception e) {
			}
		}
	
	/**
	 * 
	 * @param req
	 * @param res
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void deleteItem(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		// Xóa một Item
		long itemId = ParamUtil.getLong(req, "itemId");
		if(itemId > 0){
			AdvItem item = AdvItemLocalServiceUtil.getAdvItem(itemId);
			if(item.getName() != null){
			File file = new File(req.getPortletSession().getPortletContext().getRealPath("/")+item.getName());
			file.delete();
			}
			AdvItemLocalServiceUtil.deleteItem(item);
		}
		
		// Xóa nhiều Item
		String[] itemIds = StringUtil.split(ParamUtil.get(req, "allRowIds", StringPool.BLANK));
		if((itemIds == null) || (itemIds.length <= 0)){
			return;
		}
		
		for(int i = 0; i < itemIds.length; i++){
			AdvItem item = AdvItemLocalServiceUtil.getAdvItem(Long.valueOf(itemIds[i]));
			if(item.getName() != null){
			File file = new File(req.getPortletSession().getPortletContext().getRealPath("/")+item.getName());
			file.delete();
			}
			AdvItemLocalServiceUtil.deleteItem(item);
		}
		res.setRenderParameter("jspPage", "/html/manage_adv/view.jsp?tab1=tab.adv.item");
	}
	
	/**
	 * 	Tìm kiếm Item
	 */
	public void searchItem(ActionRequest req, ActionResponse res) throws SystemException{
		String keyword = ParamUtil.getString(req, "keyword");
		long typeId = ParamUtil.getLong(req, "typeId");
		int iStatus = ParamUtil.getInteger(req, "status");
		List<AdvItem> items = new ArrayList<AdvItem>();
		
		if((keyword.trim().length() != 0) && (typeId == 0) && (iStatus == 0)){
			items = AdvItemLocalServiceUtil.getItemByKeyWord(keyword);
		}
		if((keyword.trim().length() == 0) && (typeId != 0) && (iStatus == 0)){
			items = AdvItemLocalServiceUtil.getItemByType(typeId);
		}
		if((keyword.trim().length() == 0) && (typeId == 0) && (iStatus != 0)){
			boolean status = false;
			if(iStatus == 1){
				status = true;
			}
			items = AdvItemLocalServiceUtil.getItemByStatus(status);
		}
		
		if((keyword.trim().length() != 0) && (typeId != 0) && (iStatus == 0)){
			items = AdvItemLocalServiceUtil.getItemByKeywordType(keyword, typeId);
		}
		if((keyword.trim().length() != 0) && (typeId == 0) && (iStatus != 0)){
			boolean status = false;
			if(iStatus == 1){
				status = true;
			}
			items = AdvItemLocalServiceUtil.getItemByKeywordStatus(keyword, status);
		}
		if((keyword.trim().length() == 0) && (typeId != 0) && (iStatus != 0)){
			boolean status = false;
			if(iStatus == 1){
				status = true;
			}
			items = AdvItemLocalServiceUtil.getItemByTypeStatus(typeId, status);
		}
		
		if((keyword.trim().length() != 0) && (typeId != 0) && (iStatus != 0)){
			boolean status = false;
			if(iStatus == 1){
				status = true;
			}
			items = AdvItemLocalServiceUtil.getItemByKeywordTypeStatus(keyword, typeId, status);
		}
		
		req.setAttribute("items", items);
		res.setRenderParameter("jspPage", "/html/manage_adv/view.jsp?tab1=tab.adv.item");
	}
		
}
