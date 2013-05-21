/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vsi.edirectory.portlet.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.model.ResourceConstants;
import com.vsi.edirectory.portlet.DeleteFunctionException;
import com.vsi.edirectory.portlet.NoSuchEDEmployeeException;
import com.vsi.edirectory.portlet.service.EDEmployeeLocalServiceUtil;
import com.vsi.edirectory.portlet.service.EDFunctionEmployeeLocalServiceUtil;
import com.vsi.edirectory.portlet.service.base.EDEmployeeLocalServiceBaseImpl;
import com.vsi.edirectory.portlet.service.persistence.EDEmployeeFinderUtil;
import com.vsi.edirectory.portlet.model.EDEmployee;
import com.vsi.edirectory.portlet.model.EDFunctionEmployee;
import com.vsi.edirectory.portlet.model.impl.EDEmployeeImpl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vinhnt
 */

public class EDEmployeeLocalServiceImpl extends EDEmployeeLocalServiceBaseImpl {
	
	public EDEmployee getById(long id) throws NoSuchEDEmployeeException, SystemException{
		return edEmployeePersistence.findByPrimaryKey(id);
	}
	
	public EDEmployee getEmployeeByE_G(long employeeId, long groupId) throws NoSuchEDEmployeeException, SystemException{
		return edEmployeePersistence.findByE_G(employeeId, groupId);
	}
	
	public List<EDEmployee> getAllEmployee() throws SystemException{
		return edEmployeePersistence.findAll();
	}
	
	public List<EDEmployee> getAllEmployee(int begin, int end) throws SystemException{
		return edEmployeePersistence.findAll(begin, end);
	}
	
	/**
	 *  Danh sách cán bộ theo đơn vị
	 */
	public List<EDEmployee> getByDepartmentId(long departmentId) throws SystemException{
		return edEmployeePersistence.findByDepartmentId(departmentId);
	}
	
	public List<EDEmployee> getByDepartmentId(long departmentId, int begin, int end) throws SystemException{
		return edEmployeePersistence.findByDepartmentId(departmentId, begin, end);
	}

	/**
	 * Tìm cán bộ theo id và đơn vị
	 */
	public EDEmployee getByDepartmentAndId(long departmentId, long id)  {
		EDEmployee employee = new EDEmployeeImpl();
		try {
			employee =  edEmployeePersistence.findByDepartment_Id(departmentId, id);
		} catch (NoSuchEDEmployeeException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	/**
	 * Danh sách cán bộ theo chức vụ
	 */
	public List<EDEmployee> getByFunctionId(long functionId) throws SystemException, NoSuchEDEmployeeException{
		List<EDEmployee> employeeList = new ArrayList<EDEmployee>();
		List<EDFunctionEmployee> edFuncEmplList = EDFunctionEmployeeLocalServiceUtil.getByFunctionId(functionId);
		for(EDFunctionEmployee edFuncEmpl : edFuncEmplList){
			long employeeId = edFuncEmpl.getEmployeeId();
			EDEmployee employee = EDEmployeeLocalServiceUtil.getById(employeeId);
			employeeList.add(employee);
		}
		return employeeList;
	}
	
	/**
	 * Danh sách cán bộ theo đơn vị và chức vụ
	 * 
	 */
	public List<EDEmployee> getByDepartmentAndFunction(long departmentId, long functionId) throws SystemException{
		List<EDEmployee> employeeList = new ArrayList<EDEmployee>();
		List<EDFunctionEmployee> edFuncEmplList = EDFunctionEmployeeLocalServiceUtil.getByFunctionId(functionId);
		
		for(EDFunctionEmployee edFuncEmpl : edFuncEmplList){
			long employeeId = edFuncEmpl.getEmployeeId();
			EDEmployee employee = EDEmployeeLocalServiceUtil.getByDepartmentAndId(departmentId, employeeId);
			
			if(employee.getId() > 0){
			employeeList.add(employee);
			}
		}
		return employeeList;
	}
	
	/**
	 * Danh sách cán bộ theo họ tên
	 */
	@SuppressWarnings("unchecked")
	public List<EDEmployee> getByName(String name) throws SystemException{
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(EDEmployee.class, PortletClassLoaderUtil.getClassLoader());
		query.add(RestrictionsFactoryUtil.ilike("name", "%"+name+"%"));
		List<EDEmployee> emplList = EDEmployeeLocalServiceUtil.dynamicQuery(query);
		return emplList;
	}
	
	/**
	 * Danh sách cán bộ theo họ tên và đơn vị
	 */
	@SuppressWarnings("unchecked")
	public List<EDEmployee> getByDepartmentAndName(long departmentId, String name) throws SystemException{
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(EDEmployee.class, PortletClassLoaderUtil.getClassLoader());
		query.add(PropertyFactoryUtil.forName("departmentId").eq(new Long(departmentId)));
		query.add(RestrictionsFactoryUtil.ilike("name", "%"+name+"%"));
		List<EDEmployee> emplList = EDEmployeeLocalServiceUtil.dynamicQuery(query);
		return emplList;
	}
	
	/**
	 * Danh sách cán bộ theo Họ tên và Chức vụ
	 */
	@SuppressWarnings("unchecked")
	public List<EDEmployee> getByFunctionAndName(long functionId, String name) throws SystemException{
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(EDEmployee.class, PortletClassLoaderUtil.getClassLoader());
		List<EDEmployee> employeeList1 = new ArrayList<EDEmployee>();
		List<EDFunctionEmployee> edFunctionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByFunctionId(functionId);
		
		for(EDFunctionEmployee edFuncEmployee : edFunctionEmployeeList){
			query.add(PropertyFactoryUtil.forName("id").eq(new Long(edFuncEmployee.getEmployeeId())));
			query.add(RestrictionsFactoryUtil.ilike("name", "%"+name+"%"));
			List<EDEmployee> employeeList2 = EDEmployeeLocalServiceUtil.dynamicQuery(query);
			if(!employeeList2.isEmpty()){
				employeeList1.add(employeeList2.get(0));
			}
		}
		return employeeList1;
	}
	
	/**
	 * Danh sách cán bộ theo Họ tên, Đơn vị và Chức vụ
	 */
	@SuppressWarnings("unchecked")
	public List<EDEmployee> getByDepartmentFunctionName(long departmentId, long functionId, String name) throws SystemException{
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(EDEmployee.class, PortletClassLoaderUtil.getClassLoader());
		List<EDEmployee> employeeList1 = new ArrayList<EDEmployee>();
		List<EDFunctionEmployee> edFunctionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByFunctionId(functionId);
		
		for(EDFunctionEmployee edFuncEmployee : edFunctionEmployeeList){
			query.add(PropertyFactoryUtil.forName("id").eq(new Long(edFuncEmployee.getEmployeeId())));
			query.add(PropertyFactoryUtil.forName("departmentId").eq(new Long(departmentId)));
			query.add(RestrictionsFactoryUtil.ilike("name", "%"+name+"%"));
			List<EDEmployee> employeeList2 = EDEmployeeLocalServiceUtil.dynamicQuery(query);
			if(!employeeList2.isEmpty()){
				employeeList1.add(employeeList2.get(0));
			}
		}
		return employeeList1;
	}
	
	@SuppressWarnings("unchecked")
	public int countEmployeeByParam(long groupId, String language, boolean isShow, long departmentId, String name) throws SystemException{
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(EDEmployee.class, PortletClassLoaderUtil.getClassLoader());
		query.add(PropertyFactoryUtil.forName("groupId").eq(new Long(groupId)));
		query.add(RestrictionsFactoryUtil.ilike("languageId", "%"+language+"%"));
		query.add(PropertyFactoryUtil.forName("isShowTree").eq(new Boolean(isShow)));
		query.add(PropertyFactoryUtil.forName("departmentId").eq(new Long(departmentId)));
		query.add(RestrictionsFactoryUtil.ilike("name", "%"+name+"%"));
		List<EDEmployee> emplList = EDEmployeeLocalServiceUtil.dynamicQuery(query);
		int count = emplList.size();
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public List<EDEmployee> getEmployeeByParam(long groupId, String language, boolean isShow, long departmentId, int start, int end) throws SystemException{
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(EDEmployee.class, PortletClassLoaderUtil.getClassLoader());
		query.add(PropertyFactoryUtil.forName("groupId").eq(new Long(groupId)));
		query.add(RestrictionsFactoryUtil.ilike("languageId", "%"+language+"%"));
		query.add(PropertyFactoryUtil.forName("isShowTree").eq(new Boolean(isShow)));
		query.add(PropertyFactoryUtil.forName("departmentId").eq(new Long(departmentId)));
		List<EDEmployee> employeeList = EDEmployeeLocalServiceUtil.dynamicQuery(query, start, end);
		return employeeList;
	}
	
	/**
	 * Thêm cán bộ
	 */
	public EDEmployee addEmployee(String title, String name, Date birthday,
			String sex, String homeSide, String race, String home, String homePhone,
			String workPhone, String mobilePhone, String email, long[] functionIds,
			long departmentId, String imageUrl,  String majorLevel, String philosophism,
			String family, String foreignLanguage, Date joinDate, String otherInfo, boolean isShowTree,
			long displayOrder, String show, long groupId, long companyId, long userId, String languageId) throws SystemException, RemoteException{
		
		long employeeId = counterLocalService.increment(EDEmployee.class.getName());
		EDEmployee employee = edEmployeePersistence.create(employeeId);
		employee.setName(name);
		employee.setTitle(title);
		employee.setBirthday(birthday);
		employee.setSex(sex);
		
		employee.setHome(home);
		employee.setRace(race);
		employee.setHomeSide(homeSide);
		employee.setHomePhone(homePhone);
		employee.setWorkPhone(workPhone);
		employee.setMobilePhone(mobilePhone);
		employee.setEmail(email);
		
		employee.setDepartmentId(departmentId);
		employee.setImage(imageUrl);
		employee.setMajorLevel(majorLevel);
		employee.setPhilosophism(philosophism);
		employee.setFamily(family);
		employee.setForeignLanguage(foreignLanguage);
		
		employee.setJoinDate(joinDate);
		employee.setOtherInfo(otherInfo);
		employee.setIsShowTree(isShowTree);
		employee.setDisplayOrder(displayOrder);
		employee.setShow(show);
		employee.setCreatedDate(new Date());
		
		employee.setGroupId(groupId);
		employee.setCompanyId(companyId);
		employee.setUserId(userId);
		employee.setLanguageId(languageId);
		
		// Add resource
		try {
			resourceLocalService.addResources(employee.getCompanyId(), employee.getGroupId(), userId, 
					EDEmployee.class.getName(), employee.getPrimaryKey(), false, true, true);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
		edEmployeePersistence.update(employee, false);
		addFunctionToEmployee(employee.getId(), functionIds);
		return employee;
	}
	
	public EDEmployee updateEmployee(long employeeId, String title, String name, Date birthday,
			String sex, String homeSide, String race, String home, String homePhone,
			String workPhone, String mobilePhone, String email, long[] functionIds,
			long departmentId, String image,  String majorLevel, String philosophism,
			String family, String foreignLanguage, Date joinDate, String otherInfo, boolean isShowTree,
			long displayOrder, String show, long groupId, long companyId, long userId, String language) throws NoSuchEDEmployeeException, SystemException, RemoteException{
		
		EDEmployee employee = EDEmployeeLocalServiceUtil.getById(employeeId);
		employee.setTitle(title);
		employee.setName(name);
		employee.setBirthday(birthday);
		employee.setSex(sex);
		employee.setHomeSide(homeSide);
		employee.setRace(race);
		employee.setHome(home);
		employee.setHomePhone(homePhone);
		employee.setWorkPhone(workPhone);
		employee.setMobilePhone(mobilePhone);
		employee.setEmail(email);
		employee.setDepartmentId(departmentId);
		employee.setImage(image);
		employee.setMajorLevel(majorLevel);
		employee.setPhilosophism(philosophism);
		employee.setFamily(family);
		employee.setForeignLanguage(foreignLanguage);
		employee.setJoinDate(joinDate);
		employee.setOtherInfo(otherInfo);
		employee.setIsShowTree(isShowTree);
		employee.setDisplayOrder(displayOrder);
		employee.setShow(show);
		employee.setGroupId(groupId);
		employee.setCompanyId(companyId);
		employee.setUserId(userId);
		employee.setLanguageId(language);
		
		edEmployeePersistence.update(employee, false);
		addFunctionToEmployee(employee.getId(), functionIds);
		return employee;
	}
	
	/**
	 * Xóa cán bộ theo Id
	 */
	public void delelteEmployee(long employeeId) throws SystemException, PortalException{
		EDEmployee employee = edEmployeePersistence.findByPrimaryKey(employeeId);
		deleteEmployee(employee);
	}
	
	/**
	 * Xóa một cán bộ
	 */
	public void deleteEmployee(EDEmployee employee) throws PortalException, SystemException{
		resourceLocalService.deleteResource(employee.getCompanyId(), EDEmployee.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, employee.getPrimaryKey());
		
		List<EDFunctionEmployee> edFunctionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
		for(EDFunctionEmployee edFuncEmployee : edFunctionEmployeeList){			
			EDFunctionEmployeeLocalServiceUtil.deleteEDFunctionEmployee(edFuncEmployee);
		}
		EDEmployeeLocalServiceUtil.deleteEDEmployee(employee);
	}
	
	/**
	 * Thêm các chức vụ của một cán bộ
	 */
	public void addFunctionToEmployee(long employeeId, long[] functionIds)
			throws SystemException, RemoteException {

		EDFunctionEmployeeLocalServiceUtil
				.removeFunctionsOfEmployee(employeeId);
		for (int i = 0; i < functionIds.length; i++) {
			long functionId = functionIds[i];
			edFunctionEmployeeLocalService.addFunctionEmployee(functionId,
					employeeId);
		}
	}
	
	public void addImage(long employeeId, String imageKey) throws NoSuchEDEmployeeException, SystemException{
		EDEmployee employee = edEmployeePersistence.findByPrimaryKey(employeeId);
		employee.setImage(imageKey);
		edEmployeePersistence.update(employee, false);
	}

	@SuppressWarnings("unchecked")
	public List<EDEmployee> searchEmployeeByParams(long groupId, String language,long departmentId, String name ) throws SystemException{
		return edEmployeeFinder.findEmployeeByParam(groupId, language, departmentId, name);
	}
	
	public List<EDEmployee> searchEmployeeByParams(long groupId, String language,long departmentId, String name, int begin, int end ) throws SystemException{
		return edEmployeeFinder.findEmployeeByParam(groupId, language, departmentId, name, begin, end);
	}
	
}