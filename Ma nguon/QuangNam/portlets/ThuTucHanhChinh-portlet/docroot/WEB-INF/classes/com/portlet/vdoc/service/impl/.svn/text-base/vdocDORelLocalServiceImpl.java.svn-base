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

package com.portlet.vdoc.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.portlet.vdoc.service.vdocDORelLocalServiceUtil;
import com.portlet.vdoc.service.vdocDORelServiceUtil;
import com.portlet.vdoc.service.base.vdocDORelLocalServiceBaseImpl;
import com.portlet.vdoc.service.persistence.vdocDORelPK;
import com.portlet.vdoc.service.persistence.vdocDORelUtil;
import com.portlet.vdoc.model.vdocDORel;
import com.portlet.vdoc.model.vdocDocument;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the vdoc d o rel local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.portlet.vdoc.service.vdocDORelLocalService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.portlet.vdoc.service.vdocDORelLocalServiceUtil} to access the vdoc
 * d o rel local service.
 * </p>
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author vinhnt
 * @see com.portlet.vdoc.service.base.vdocDORelLocalServiceBaseImpl
 * @see com.portlet.vdoc.service.vdocDORelLocalServiceUtil
 */
public class vdocDORelLocalServiceImpl extends vdocDORelLocalServiceBaseImpl {

	
	public vdocDORel addRelation(String docId, String orgId)
			throws RemoteException, SystemException, PortalException {

		vdocDORel relation = null;

		vdocDORelPK pKey = new vdocDORelPK(docId, orgId);

		relation = vdocDORelUtil.create(pKey);

		return vdocDORelUtil.update(relation, false);

	}

	public void deleteRelation(String docId, String orgId)
			throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(orgId) || Validator.isNull(docId)) {
			return;
		}

		vdocDORelPK pKey = new vdocDORelPK(docId, orgId);

		vdocDORelUtil.remove(pKey);
	}

	public void deleteRelByDoc(String docId) throws RemoteException,
			PortalException, SystemException {

		if (Validator.isNull(docId)) {
			return;
		}
		vdocDORelUtil.removeByDocument(docId);
	}

	public List<vdocDORel> getDORelByDoc(String docId) throws SystemException {
		return vdocDORelPersistence.findByDocument(docId);
	}

	public List<vdocDORel> getDORelByOrg(String orgId) throws SystemException {
		return vdocDORelPersistence.findByOrg(orgId);
	}

	public List<vdocDORel> getRelByDoc(String docId) throws RemoteException,
			SystemException, PortalException {

		List<vdocDORel> rels = new ArrayList();

		if (Validator.isNull(docId)) {
			return rels;
		}

		rels = vdocDORelUtil.findByDocument(docId);

		return rels;

	}

	public List<vdocDORel> getRelByField(String orgId) throws RemoteException,
			SystemException, PortalException {

		List<vdocDORel> rels = new ArrayList();

		if (Validator.isNull(orgId)) {
			return rels;
		}

		rels = vdocDORelUtil.findByOrg(orgId);
		return rels;
	}
}