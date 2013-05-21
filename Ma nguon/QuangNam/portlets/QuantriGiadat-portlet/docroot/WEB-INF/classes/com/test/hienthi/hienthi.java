package com.test.hienthi;

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
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class hienthi
 */
public class hienthi extends MVCPortlet {
 
public void Hienthi_Displays(ActionRequest req,ActionResponse response) throws PortalException, SystemException{
	String lookuppriceId="";
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
	
	req.setAttribute("lookuppriceId", lookuppriceId);
	response.setRenderParameter("jspPage", "/html/hienthi/edit.jsp");
	
}
	
}
/*String typeIds = "0";

typeIds = ParamUtil.getString(req, "typeId");
req.setAttribute("typeIds",typeIds);
response.setRenderParameter("jspPage","/html/hienthiquangcao/edits.jsp");*/