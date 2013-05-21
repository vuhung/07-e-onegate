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
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.vportal.portlet.vlegal.model.VLegalLogger;
import com.vportal.portlet.vlegal.service.base.VLegalLoggerServiceBaseImpl;

/**
 * The implementation of the v legal logger remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalLoggerService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil} to access the v legal logger remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalLoggerServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil
 */
public class VLegalLoggerServiceImpl extends VLegalLoggerServiceBaseImpl {
	public VLegalLogger log(long groupId, String content)
			throws PortalException, SystemException, RemoteException {
try{
		if (Validator.isNull(content)) {
			return null;
		}

		String loggerId = String.valueOf(counterLocalService.increment());

		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);

		VLegalLogger logger = vLegalLoggerPersistence.create(loggerId);

		logger.setGroupId(groupId);
		logger.setUserId(userId);
		logger.setCompanyId(user.getCompanyId());
		logger.setCreatedDate(new Date());
		logger.setCreatedByUser(getUserId());
		logger.setContent(content);

		vLegalLoggerPersistence.update(logger,false);

		return logger;
}catch(Exception e){e.printStackTrace();}
return null;
	}

	public List findLogsByUser(String userId) throws PortalException,
			SystemException, RemoteException {
		return vLegalLoggerFinder.findByUser(userId);
	}

	public List findLogs(Date from, Date to) throws PortalException,
			SystemException, RemoteException {
		return vLegalLoggerFinder.findByPeriod(from, to);
	}

	public void removeLogs(String loggerId) throws PortalException,
			SystemException, RemoteException {
		try{
        vLegalLoggerPersistence.remove(loggerId);
		}catch(Exception e){e.printStackTrace();}
	}

	public List findLogs() throws PortalException, SystemException,
			RemoteException {
try{
		return vLegalLoggerPersistence.findAll();
}catch(Exception e){e.printStackTrace();}
return null;
	}
	public List findLogs(int begin,int end) throws PortalException, SystemException,
		RemoteException {
	try{
	return vLegalLoggerPersistence.findAll(begin,end);
	}catch(Exception e){e.printStackTrace();}
	return null;
	}
	public int countLogs() throws PortalException, SystemException,
		RemoteException {
	try{
	return vLegalLoggerPersistence.countAll();
	}catch(Exception e){e.printStackTrace();}
	return 0;
	}
	public void removeLogs(Date from, Date to) throws PortalException,
			SystemException, RemoteException {

         vLegalLoggerFinder.removeByPeriod(from, to);
	}

	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {
try{
		VLegalLogger entry = vLegalLoggerPersistence.findByPrimaryKey(String
				.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
}catch(Exception e){e.printStackTrace();}
	}

	public void addEntryResources(VLegalLogger entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {
try{
		resourceLocalService.addResources(entry.getCompanyId(), entry
				.getGroupId(), entry.getUserId(), VLegalLogger.class.getName(),
				entry.getLoggerId(), false, addCommunityPermissions,
				addGuestPermissions);
	}catch(Exception e){e.printStackTrace();}
	}

	public void addEntryResources(long entryId, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException {
try{
		VLegalLogger entry = vLegalLoggerPersistence.findByPrimaryKey(String
				.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
}catch(Exception e){e.printStackTrace();}
	}

	public void addEntryResources(VLegalLogger entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {
try{
		resourceLocalService.addModelResources(entry.getCompanyId(), entry
				.getGroupId(), entry.getUserId(), VLegalLogger.class.getName(),
				entry.getLoggerId(), communityPermissions, guestPermissions);
}catch(Exception e){e.printStackTrace();}
	}

}