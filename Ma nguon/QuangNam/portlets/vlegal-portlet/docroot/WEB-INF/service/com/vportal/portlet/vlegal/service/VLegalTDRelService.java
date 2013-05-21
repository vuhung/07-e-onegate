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

package com.vportal.portlet.vlegal.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the v legal t d rel remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalTDRelServiceUtil} to access the v legal t d rel remote service. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalTDRelServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalTDRelServiceUtil
 * @see com.vportal.portlet.vlegal.service.base.VLegalTDRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalTDRelServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalTDRelService {
	public com.vportal.portlet.vlegal.model.VLegalTDRel addRelation(
		java.lang.String docId, java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void deleteRelation(java.lang.String docId, java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void deleteRelByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;
}