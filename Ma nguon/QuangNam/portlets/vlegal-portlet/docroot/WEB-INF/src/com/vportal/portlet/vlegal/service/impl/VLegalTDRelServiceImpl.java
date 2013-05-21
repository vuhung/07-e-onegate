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
import com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;
import com.vportal.portlet.vlegal.model.VLegalTDRel;
import com.vportal.portlet.vlegal.service.base.VLegalTDRelServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalTDRelPK;
import com.vportal.portlet.vlegal.service.persistence.VLegalTDRelUtil;

/**
 * The implementation of the v legal t d rel remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalTDRelService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalTDRelServiceUtil} to access the v legal t d rel remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalTDRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalTDRelServiceUtil
 */
public class VLegalTDRelServiceImpl extends VLegalTDRelServiceBaseImpl {
	public VLegalTDRel addRelation(String docId, String tagId)
			throws RemoteException, SystemException, PortalException {

		VLegalTDRel relation = null;

		VLegalTDRelPK pKey = new VLegalTDRelPK(docId, tagId);

		relation = VLegalTDRelUtil.create(pKey);

		try {
			return VLegalTDRelUtil.update(relation,false);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return relation;
	}

	public void deleteRelation(String docId, String tagId)
			throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(docId) || Validator.isNull(tagId)) {
			return;
		}

		VLegalTDRelPK pKey = new VLegalTDRelPK(docId, tagId);

		try {
			VLegalTDRelUtil.remove(pKey);
		} catch (NoSuchVLegalTDRelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteRelByDoc(String docId) throws RemoteException,
			PortalException, SystemException {

		if (Validator.isNull(docId)) {
			return;
		}
		try {
			VLegalTDRelUtil.removeByDocument(docId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteRelByTag(String tagId) throws RemoteException,
			SystemException, PortalException {

		if (Validator.isNull(tagId)) {
			return;
		}

		try {
			VLegalTDRelUtil.removeByTag(tagId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List getRelByDoc(String docId) throws RemoteException,
			SystemException, PortalException {
		List rels = new ArrayList();

		if (Validator.isNull(docId)) {
			return rels;
		}

		try {
			rels = VLegalTDRelUtil.findByDocument(docId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rels;

	}

	public List getRelByTag(String tagId) throws RemoteException,
			SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(tagId)) {
			return rels;
		}

		try {
			rels = VLegalTDRelUtil.findByTag(tagId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rels;

	}
}