package com.test.action;

import java.rmi.RemoteException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.util.PortalUtil;
import com.test.DeleteTypeException;
import com.test.NoSuchAdvTypeException;
import com.test.model.AdvType;
import com.test.service.AdvTypeServiceUtil;

public class AdvTypeAction {
      
	public void AdvType_Edit(ActionRequest req,ActionResponse response) throws PortletException{
		long typeId=ParamUtil.getLong(req, "typeId");
		try {
			AdvType type=AdvTypeServiceUtil.getType(typeId);
			//request.setAttribute("vcmsportion", vcp);
			//response.setRenderParameter("jspPage", "/html/quantrinoidung/manage/edit_portion.jsp");
			req.setAttribute("AdvTypes",type);
			response.setRenderParameter("jspPage","/html/quangcao/manage/edit_type.jsp" );
		} catch (NoSuchAdvTypeException e) {
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
	public void AdvType_Delete(ActionRequest req,ActionResponse response) throws PortletException{
		long typeId=ParamUtil.getLong(req, "typeId");
		try {
			AdvTypeServiceUtil.deleteType(typeId);
		} catch (com.liferay.portal.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DeleteTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		response.setRenderParameter("jspPage", "/html/quantrinoidung/view.jsp?tabs=portlet.vcms.tabs.manage&tabs_ql=portlet.vcms.tabs.type");
	response.setRenderParameter("jspPage", "/html/quangcao/view.jsp?tabs=advquangcao.quangcao.tabs.type");
	}
	 public void AdvType_new(ActionRequest req,ActionResponse response) throws PortletException{
		 try {
		 //long itemId=ParamUtil.getLong(req, "itemId");
		 long typeId=ParamUtil.getLong(req, "portionid");
		
		 long groupId=ParamUtil.getLong(req, "groupId");
		 long companyid=PortalUtil.getCompanyId(req);
		
		 String names=ParamUtil.getString(req,"name");
		 String description=ParamUtil.getString(req,"description");
		 //AdvTypeServiceUtil.addAdvTypeResources(typeId, names, description);
		
		 AdvTypeServiceUtil.addType(groupId, groupId, companyid, names,description, null, null);
		 //response.setRenderParameter("jspPage", "/html/quantrinoidung/view.jsp?tabs=portlet.vcms.tabs.manage&tabs_ql=portlet.vcms.tabs.type");
			//response.setRenderParameter("jspPage","")
		 response.setRenderParameter("jspPage","/html/quangcao/view.jsp?tabs=advquangcao.quangcao.tabs.type");
		} catch (PrincipalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	 }
}
