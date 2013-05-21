package com.test.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.test.model.Vlookupprice;
import com.test.service.VlookuppriceServiceUtil;



public class PriceAction {
	
	
     
	

	public void PriceAdd(ActionRequest req,ActionResponse response) throws PortalException{
		try {
		ThemeDisplay themeDisplay = (ThemeDisplay) req
	
				.getAttribute(WebKeys.THEME_DISPLAY);
		        Layout layout = themeDisplay.getLayout();
				User user = PortalUtil.getUser(req);
				long groupId = layout.getGroupId();
				String createdByUser = user.getLogin();
				long companyId = PortalUtil.getCompanyId(req);
				String language = "vi_VN";
				String listparentId = ParamUtil.getString(req,"parentId",StringPool.BLANK);
				String name = ParamUtil.getString(req, "name", StringPool.BLANK);
				String content = ParamUtil.getString(req, "content", StringPool.BLANK);
				int status = ParamUtil.getInteger(req, "status",0);
				int price = ParamUtil.getInteger(req, "price",0);
				String position1 = ParamUtil.getString(req, "position1","0");
				String position2 = ParamUtil.getString(req, "position2","0");
				String position3 = ParamUtil.getString(req, "position3","0");
				String position4 = ParamUtil.getString(req, "position4","0");
				String position5 = ParamUtil.getString(req, "position5","0");
				String[] listparent = listparentId.split("/");
				String parentId = listparent[listparent.length-1];
				
					VlookuppriceServiceUtil.addvlookupprice(companyId, content, createdByUser, groupId, language, parentId, status, price, name,listparentId,position1,position2,position3,position4,position5);
					response.setRenderParameter("jspPage", "/html/quantri/price.jsp?tabs=lookup.price ");		
		
		} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	public void Edit_Price(ActionRequest req,ActionResponse response) throws PortalException{
		String loouppriceId=ParamUtil.getString(req, "lookuppriceId");
		try {
			Vlookupprice vlp=VlookuppriceServiceUtil.getLookuppriceId(loouppriceId);
			req.setAttribute("VlookuppriceUpdata",vlp);
			response.setRenderParameter("jspPage", "/html/quantri/edit_price.jsp");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void Price_Delete(ActionRequest req,ActionResponse response)throws PortalException{
		
		String lookuppriceId=ParamUtil.getString(req, "lookuppriceId");
		try {
			VlookuppriceServiceUtil.deletevlookupprice(lookuppriceId);
//			response.setRenderParameter("jspPage", "/html/quantrinoidung/view.jsp?tabs=portlet.vcms.tabs.manage&tabs_ql=portlet.vcms.tabs.portion");
			response.setRenderParameter("jspPage", "/html/quantri/price.jsp?tabs=lookup.price ");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
