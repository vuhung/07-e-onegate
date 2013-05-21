package com.vsi.edirectory.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletURL;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.vsi.edirectory.portlet.model.EDDepartment;
import com.vsi.edirectory.portlet.model.EDEmployee;
import com.vsi.edirectory.portlet.model.impl.EDDepartmentImpl;
import com.vsi.edirectory.portlet.service.EDDepartmentLocalServiceUtil;
import com.vsi.edirectory.portlet.service.EDEmployeeLocalServiceUtil;
/**
 * Portlet implementation class ContentEDirectory
 */
public class ContentEDirectory extends MVCPortlet {

//	@Override
//	public void processEvent(EventRequest request, EventResponse response){
//		Event event = request.getEvent();
//		String depId = (String)event.getValue();
////		long departmentId = Long.valueOf(sDepartmentId);
////		List<EDEmployee> employeeList = new ArrayList<EDEmployee>();
////		try{
////			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentId(departmentId);
////		}catch (SystemException e) {
////			e.printStackTrace();
////		}
//		
////		request.setAttribute("employeeList", employeeList);
//		response.setRenderParameter("depId", depId);
//	}
	@Override
	public void render(RenderRequest req, RenderResponse res)
			throws PortletException, IOException {
		long departmentId = ParamUtil.getLong(req, "depId");
		PortletURL searchDoc = res.createRenderURL();
		searchDoc.setParameter("jspPage", "/html/content_edirectory/view.jsp");

		// TODO Auto-generated method stub
		super.render(req, res);
	}
 
	public void searchEmployee(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
		long departmentId = ParamUtil.getLong(req, "depId");
		long functionId = ParamUtil.getLong(req, "functionId");
		String name = ParamUtil.getString(req, "name");
		List<EDEmployee> employeeList = new ArrayList<EDEmployee>();
		EDDepartment departmentForm = new EDDepartmentImpl();
		
		// Lấy tất cả các cán bộ
		if((departmentId == 0)  && (name.trim().length() == 0)){
			employeeList = EDEmployeeLocalServiceUtil.getAllEmployee();
		}
		
		// Lấy danh sách cán bộ theo Đơn vị
		if((departmentId != 0)  && (name.trim().length() == 0)){
			departmentForm = EDDepartmentLocalServiceUtil.getEDDepartment(departmentId);
			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentId(departmentId);
		}
		// Lấy danh sách cán bộ theo Chức vụ
//		if((departmentId == 0) && (functionId !=0) && (name.trim().length() == 0)){
//			employeeList = EDEmployeeLocalServiceUtil.getByFunctionId(functionId);
//		}
		// Lấy danh sách cán bộ theo Họ tên
		if((departmentId == 0) && (name.trim().length() != 0)){
			employeeList = EDEmployeeLocalServiceUtil.getByName(name);
		}
		
		// Lấy danh sách cán bộ theo Đơn vị và Chức vụ
//		if((departmentId != 0) && (functionId != 0) && (name.trim().length() == 0)){
//			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentAndFunction(departmentId, functionId);
//		}
		// Lấy danh sách cán bộ theo Đơn vị và Họ tên
		if((departmentId != 0) && (name.trim().length() != 0)){
			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentAndName(departmentId, name);
		}
		// Lấy danh sách cán bộ theo Chức vụ và Họ tên
		if((departmentId == 0) && (functionId != 0) && (name.trim().length() != 0)){
			employeeList = EDEmployeeLocalServiceUtil.getByFunctionAndName(functionId, name);
		}
		
//		if((departmentId != 0) && (functionId != 0) && (name.trim().length() != 0)){
//			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentFunctionName(departmentId, functionId, name);
//		}
		
		
		req.setAttribute("employeeList", employeeList);
		req.setAttribute("departmentForm", departmentForm);
		req.setAttribute("depId", String.valueOf(departmentId));
		req.setAttribute("name", name);
	}
	
	public void viewEDirectory(ActionRequest req, ActionResponse res) throws ReadOnlyException, ValidatorException, IOException{
		String titlePortlet = ParamUtil.getString(req, "titlePortlet");
		String themeType = ParamUtil.getString(req, "themeType");
		String themeSelected = ParamUtil.getString(req, "themeSelected");
		int numberItem = ParamUtil.getInteger(req, "numberItem");
		String style = ParamUtil.getString(req, "style","default");

		int insType = ParamUtil.getInteger(req, "insType");

		PortletPreferences prefs = req.getPreferences();
		prefs.setValue("insType", String.valueOf(insType));
		prefs.setValue("titlePortlet", titlePortlet);
		prefs.setValue("themeType", themeType);
		prefs.setValue("themeSelected", themeSelected);
		prefs.setValue("numberItem", String.valueOf(numberItem));
		prefs.setValue("style", style);

		prefs.store();
	
		res.setRenderParameter("jspPage", "/html/content_edirectory/view.jsp");
	}
	
}
