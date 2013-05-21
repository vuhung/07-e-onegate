package com.test.action;

import java.io.File;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;





import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.util.PortalUtil;
import com.test.NoSuchAdvItemException;
import com.test.model.AdvItem;
import com.test.model.AdvType;
import com.test.service.AdvItemServiceUtil;
import com.test.service.AdvTypeServiceUtil;

public class AdvItemAction {
	public void AdvItem_new(ActionRequest req,ActionResponse rep) throws PortletException
	{
		try{
			
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(req);
		    File file = (File) uploadRequest.getFile("file");

			long itemId=ParamUtil.getLong(req, "itemId");
			 //Date expriedDates=ParamUtil.getDate(req,"expriedDate");
			long groupId=ParamUtil.getLong(req, "groupId");
			long companyid=PortalUtil.getCompanyId(req);
			String code=ParamUtil.getString(req, "Item_code");
			String name=ParamUtil.getString(req,"name");
			String description=ParamUtil.getString(req, "description");
			
			String url=ParamUtil.getString(req, "url");
			boolean isTargetBanks=true;
			boolean neverExpired = ParamUtil.getBoolean(req, "neverExpired");
			String txtMouseover=ParamUtil.getString(req, "txtMouseOver");
			long foderId=0;//ParamUtil.getLong(req, "foderId");
			boolean statuss = true;
			long typeId=ParamUtil.getLong(req, "typeId");
			Locale locale = null;
			TimeZone timeZone = null;

			locale = LocaleUtil.getDefault();
			timeZone = TimeZoneUtil.getDefault();


			Calendar expiredDay = CalendarFactoryUtil.getCalendar(timeZone, locale);
			AdvItemServiceUtil.addItem(groupId, groupId,companyid ,name, description, url, isTargetBanks, txtMouseover, statuss, typeId, foderId, expiredDay.getTime(),null, null);
		
		}catch (PrincipalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException ev) {
			// TODO Auto-generated catch block
			ev.printStackTrace();
		} catch (SystemException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (RemoteException es) {
			// TODO Auto-generated catch block
			es.printStackTrace();
		}  		

}
	public void AdvItem_Edit(ActionRequest req,ActionResponse response) throws PortletException{
		long itemId=ParamUtil.getLong(req, "itemId");
		try {
			AdvItem item=AdvItemServiceUtil.getItem(itemId);
			req.setAttribute("AdvItems",item);
			response.setRenderParameter("jspPage","/html/quangcao/manage/edit_item.jsp" );
		} catch (NoSuchAdvItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}
	public void AdvItem_Delete(ActionRequest req,ActionResponse response) throws PortletException{
		long itemId=ParamUtil.getLong(req, "itemId");
		try {
			AdvItemServiceUtil.deleteItem(itemId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setRenderParameter("jspPage", "/html/quangcao/view.jsp?tabs=advquangcao.quangcao.tabs.item");
	}
	
}
