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
import com.vportal.portlet.vlegal.NoSuchVLegalDFRelException;
import com.vportal.portlet.vlegal.model.VLegalDFRel;
import com.vportal.portlet.vlegal.service.base.VLegalDFRelServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalDFRelPK;
import com.vportal.portlet.vlegal.service.persistence.VLegalDFRelUtil;

/**
 * The implementation of the v legal d f rel remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalDFRelService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil} to access the v legal d f rel remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalDFRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil
 */
public class VLegalDFRelServiceImpl extends VLegalDFRelServiceBaseImpl {
	
	public VLegalDFRel addRelation(String docId, String fieldId)
			throws RemoteException, SystemException, PortalException {

		VLegalDFRel relation = null;

		VLegalDFRelPK pKey = new VLegalDFRelPK(fieldId, docId);

		relation = VLegalDFRelUtil.create(pKey);

		return VLegalDFRelUtil.update(relation, false);
	}

	public void deleteRelation(String docId, String fieldId)
			throws SystemException, NoSuchVLegalDFRelException {

		if (Validator.isNull(fieldId) || Validator.isNull(docId)) {
			return;
		}

		VLegalDFRelPK pKey = new VLegalDFRelPK(fieldId, docId);

		VLegalDFRelUtil.remove(pKey);
	}

	public void deleteRelByField(String fieldId) throws SystemException {

		if (Validator.isNull(fieldId)) {
			return;
		}
		VLegalDFRelUtil.removeByField(fieldId);
	}

	public void deleteRelByDoc(String docId) throws SystemException {

		if (Validator.isNull(docId)) {
			return;
		}

		VLegalDFRelUtil.removeByDoc(docId);

	}

	@SuppressWarnings("rawtypes")
	public List getRelByDoc(String docId) {
		List rels = new ArrayList();
		try
		{
			if (Validator.isNull(docId)) {
				return rels;
		}
	
			rels = VLegalDFRelUtil.findByDoc(docId);
			return rels;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public List getRelByField(String fieldId) throws SystemException {

		List rels = new ArrayList();

		if (Validator.isNull(fieldId)) {
			return rels;
		}

		rels = VLegalDFRelUtil.findByField(fieldId);

		return rels;

	}

	@Override
	public VLegalDFRel addRealation(String arg0, String arg1)
			throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}
}