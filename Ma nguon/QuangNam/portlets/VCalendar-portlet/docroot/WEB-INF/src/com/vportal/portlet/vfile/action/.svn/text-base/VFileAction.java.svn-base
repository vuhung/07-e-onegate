package com.vportal.portlet.vfile.action;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vcalendar.model.VCal;
import com.vportal.portlet.vcalendar.service.VCalServiceUtil;
import com.vportal.portlet.vcalendar.service.VFileServiceUtil;

/**
 * Portlet implementation class VFileAction
 */
public class VFileAction extends MVCPortlet {

	public void addVFile(ActionRequest req , ActionResponse rep) throws Exception {
		Layout layout = (Layout)req.getAttribute(WebKeys.LAYOUT);
		String fullname = ParamUtil.getString(req, "fullname");
		String phone = ParamUtil.getString(req, "phone");
		String address = ParamUtil.getString(req, "address");
		String position = ParamUtil.getString(req, "position");
		int dateMonth = ParamUtil.getInteger(req, "dateMonth");
		int dateDay = ParamUtil.getInteger(req, "dateDay");
		int dateYear = ParamUtil.getInteger(req, "dateYear");
		Date birthday = new Date(Integer.toString(dateMonth+1)+"/"+dateDay+"/"+dateYear);
		
		
		Long groupId = PortalUtil.getScopeGroupId(layout.getPlid());
		int status = groupId.intValue();
	
		VFileServiceUtil.addVFile(fullname, phone, address, position, birthday, status);
		
	}
	public void updateVFile(ActionRequest req ,ActionResponse rep) throws Exception {
		Layout layout = (Layout)req.getAttribute(WebKeys.LAYOUT);
		long fileId = ParamUtil.getLong(req, "fileId");
		String fullname = ParamUtil.getString(req, "fullname");
		String phone = ParamUtil.getString(req, "phone");
		String address = ParamUtil.getString(req, "address");
		String position = ParamUtil.getString(req, "position");
		int dateMonth = ParamUtil.getInteger(req, "dateMonth");
		int dateDay = ParamUtil.getInteger(req, "dateDay");
		int dateYear = ParamUtil.getInteger(req, "dateYear");
		Date birthday = new Date(Integer.toString(dateMonth+1)+"/"+dateDay+"/"+dateYear);
		Long groupId = PortalUtil.getScopeGroupId(layout.getPlid());
		int status = groupId.intValue();
		VFileServiceUtil.updateVFile(fileId,fullname, phone, address, position, birthday, status);
	}
	public void deleteVFile(ActionRequest req ,ActionResponse rep) throws Exception {
		long fileId = ParamUtil.getLong(req, "fileId");
		List<VCal>  listCalFile = VCalServiceUtil.findByF(fileId);
		for (VCal vCal : listCalFile) {
			VCalServiceUtil.deletevCal(vCal.getCalId());
		}
		VFileServiceUtil.deleteVFile(fileId);
	}
	
	
}
