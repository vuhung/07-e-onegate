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
import com.vportal.portlet.vlegal.model.VLegalDURel;
import com.vportal.portlet.vlegal.service.base.VLegalDURelServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalDDRelUtil;
import com.vportal.portlet.vlegal.service.persistence.VLegalDURelPK;
import com.vportal.portlet.vlegal.service.persistence.VLegalDURelUtil;

/**
 * The implementation of the v legal d u rel remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalDURelService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDURelServiceUtil} to access the v legal d u rel remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalDURelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDURelServiceUtil
 */
public class VLegalDURelServiceImpl extends VLegalDURelServiceBaseImpl {
	
	public VLegalDURel addRelation(long departmentId, long userid)
			throws PortalException, SystemException, RemoteException {

		VLegalDURel relation = null;

		VLegalDURelPK pKey = new VLegalDURelPK(departmentId, userid);

		relation = VLegalDURelUtil.create(pKey);

		return VLegalDURelUtil.update(relation, false);
	}

	public void deleteRelation(long departmentId, long userid)
			throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(String.valueOf(departmentId))
				|| Validator.isNull(String.valueOf(userid))) {
			return;
		}

		VLegalDURelPK pKey = new VLegalDURelPK(departmentId, userid);

		VLegalDURelUtil.remove(pKey);
	}

	public void deleteRelByDepartment(long departmentId)
			throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(String.valueOf(departmentId))) {
			return;
		}

		VLegalDURelUtil.removeByDepartament(departmentId);
	}

	public void deleteRelByUser(long userid) throws PortalException,
			SystemException, RemoteException {

		if (Validator.isNull(String.valueOf(userid))) {
			return;
		}

		VLegalDURelUtil.removeByUser(userid);
	}

	public List getRelByDepartment(long departmentId) throws RemoteException,
			SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(String.valueOf(departmentId))) {
			return rels;
		}

		rels = VLegalDDRelUtil.findByDepartament(departmentId);

		return rels;
	}

	public List getRelByUser(long userid) throws PortalException,
			SystemException, RemoteException {

		List rels = new ArrayList();

		if (Validator.isNull(String.valueOf(userid))) {
			return rels;
		}

		rels = VLegalDURelUtil.findByUser(userid);

		return rels;

	}

	public VLegalDURel getByUserId(long userid) throws PortalException, SystemException, RemoteException {
		return VLegalDURelUtil.findByUserId(userid);
	}
}