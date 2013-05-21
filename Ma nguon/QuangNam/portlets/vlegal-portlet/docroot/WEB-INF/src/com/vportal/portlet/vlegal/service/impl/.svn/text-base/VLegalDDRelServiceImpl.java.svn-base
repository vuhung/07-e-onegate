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

package com.vportal.portlet.vlegal.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.model.VLegalDDRel;
import com.vportal.portlet.vlegal.service.base.VLegalDDRelServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalDDRelPK;
import com.vportal.portlet.vlegal.service.persistence.VLegalDDRelUtil;

/**
 * The implementation of the v legal d d rel remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalDDRelService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil} to access the v legal d d rel remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalDDRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil
 */
public class VLegalDDRelServiceImpl extends VLegalDDRelServiceBaseImpl {
	
	public VLegalDDRel addRelation(long departmentId, String docId)
			throws PortalException, SystemException, RemoteException {
		VLegalDDRel relation = null;

		VLegalDDRelPK pKey = new VLegalDDRelPK(departmentId, docId);

		relation = VLegalDDRelUtil.create(pKey);

		return VLegalDDRelUtil.update(relation, false);
	}

	public void deleteRelation(long departmentId, String docId)
			throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(String.valueOf(departmentId))
				|| Validator.isNull(docId)) {
			return;
		}

		VLegalDDRelPK pKey = new VLegalDDRelPK(departmentId, docId);

		VLegalDDRelUtil.remove(pKey);
	}

	public void deleteRelByDepartment(long departmentId)
			throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(String.valueOf(departmentId))) {
			return;
		}
		VLegalDDRelUtil.removeByDepartament(departmentId);
	}

	public void deleteRelByDoc(String docId) throws RemoteException,
			SystemException, PortalException {

		if (Validator.isNull(docId)) {
			return;
		}

		VLegalDDRelUtil.removeByDoc(docId);
	}

	@SuppressWarnings("rawtypes")
	public List getRelByDoc(String docId) throws RemoteException,
			SystemException, PortalException {

		List rels = new ArrayList();
		if (Validator.isNull(docId)) {
			return rels;
		}

		rels = VLegalDDRelUtil.findByDoc(docId);

		return rels;
	}

	@SuppressWarnings("rawtypes")
	public List getRelByDepartment(long departmentId) throws RemoteException,
			SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(String.valueOf(departmentId))) {
			return rels;
		}

		rels = VLegalDDRelUtil.findByDepartament(departmentId);

		return rels;
	}
	
}