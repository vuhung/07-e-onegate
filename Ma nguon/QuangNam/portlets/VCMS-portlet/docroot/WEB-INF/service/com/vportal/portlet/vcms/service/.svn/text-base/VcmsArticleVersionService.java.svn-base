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

package com.vportal.portlet.vcms.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the vcms article version remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VcmsArticleVersionServiceUtil} to access the vcms article version remote service. Add custom service methods to {@link com.vportal.portlet.vcms.service.impl.VcmsArticleVersionServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see VcmsArticleVersionServiceUtil
 * @see com.vportal.portlet.vcms.service.base.VcmsArticleVersionServiceBaseImpl
 * @see com.vportal.portlet.vcms.service.impl.VcmsArticleVersionServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VcmsArticleVersionService {
	public com.vportal.portlet.vcms.model.VcmsArticleVersion addVersion(
		long groupId, java.lang.String language, long companyId,
		java.lang.String articleId, java.lang.String typeIds, long status,
		java.lang.String versionName, java.lang.String title,
		java.lang.String lead, java.lang.String content, int userHit,
		boolean hasImage, java.lang.String imageTitle, java.lang.String image,
		java.lang.String author, java.lang.String source, boolean discussible,
		boolean hasPoll, java.lang.String pollId, java.util.Date effectiveDate,
		java.util.Date expireDate, boolean sticky, boolean stickyNeverExpired,
		java.util.Date stickyExpireDate, boolean hasAttach)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public int countVersionByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public java.util.List listVersionByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;
}