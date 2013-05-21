package com.test.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import com.test.model.VlookuppriceCategory;
import com.test.service.VlookuppriceCategoryServiceUtil;


public class CategoryAction {
	
	
	public static void Add_Category(ActionRequest req,ActionResponse response)throws PortalException{
		try {
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
		        Layout layout = themeDisplay.getLayout();
				User user;
				
					user = PortalUtil.getUser(req);
					long groupId = layout.getGroupId();
					String createdByUser = user.getLogin();
					long companyId = PortalUtil.getCompanyId(req);
					//String language = user.getLanguageId();
					String language="vi_VN";
					String parentId = ParamUtil.getString(req,"parentId");
					String name = ParamUtil.getString(req, "name", StringPool.BLANK);
					String description = ParamUtil.getString(req, "description", StringPool.BLANK);
					VlookuppriceCategoryServiceUtil.addVlookuppriceCategory(createdByUser, groupId, companyId, parentId, name, description, language);
		     	
					response.setRenderParameter("jspPage", "/html/quantri/view.jsp?tabs=lookup.area ");
		} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}
	public void Edit_Category(ActionRequest req,ActionResponse response) throws PortalException{
		
		String categoryId=ParamUtil.getString(req, "categoryId");
//		VFile vF=VFileServiceUtil.getFileById(fileId);
		try {
			VlookuppriceCategory catego=VlookuppriceCategoryServiceUtil.findById(categoryId);
			req.setAttribute("CategoryUpdata", catego);
			response.setRenderParameter("jspPage", "/html/quantri/edit_category.jsp");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	public void Delete_Category(ActionRequest req,ActionResponse response) throws PortalException{
		String categoryId=ParamUtil.getString(req, "categoryId");
		try {
			VlookuppriceCategoryServiceUtil.deleteVlookuppriceCategory(categoryId);
			response.setRenderParameter("jspPage", "/html/quantri/view.jsp?tabs=lookup.area ");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
