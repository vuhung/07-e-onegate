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

package com.vportal.portal.service.impl;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vportal.portal.model.AccessCounter;
import com.vportal.portal.service.base.AccessCounterServiceBaseImpl;

/**
 * The implementation of the access counter remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portal.service.AccessCounterService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portal.service.AccessCounterServiceUtil} to access the access counter remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portal.service.base.AccessCounterServiceBaseImpl
 * @see com.vportal.portal.service.AccessCounterServiceUtil
 */
public class AccessCounterServiceImpl extends AccessCounterServiceBaseImpl {
	public AccessCounter getCounter(long companyId, Date date)
			throws PortalException, SystemException, RemoteException {
		
			return accessCounterPersistence.findByAccessDate(companyId, date);
		}
		
		public AccessCounter addCounter(long companyId, int hitIncrease)
			throws PortalException, SystemException, RemoteException {
			long id = CounterLocalServiceUtil.increment(AccessCounter.class.toString());
			AccessCounter counter = accessCounterPersistence.create(id);
			counter.setId(id);
			counter.setCompanyId(companyId);
			counter.setAccessDate(new Date());
			counter.setAccessCount(hitIncrease);
			return accessCounterPersistence.update(counter, false);
		}
		
		public AccessCounter updateCounter(long companyId, Date date,
			int hitIncrease) throws PortalException, SystemException,
			RemoteException {
			AccessCounter counter = accessCounterPersistence.findByAccessDate(companyId,
					date);
			int hit = counter.getAccessCount();
			hit += hitIncrease;
			counter.setAccessCount(hit);
			return accessCounterPersistence.update(counter, false);
		}
		
		public int getTotalHits(long companyId) throws PortalException,
			SystemException, RemoteException {
			return accessCounterFinder.getHits(companyId);
		}
		
		public int getHits(long companyId, Date date) throws PortalException,
			SystemException, RemoteException {
			return accessCounterFinder.getHits(companyId, date);
		}
		
		public List getAccessCounter(long companyId) throws PortalException,
			SystemException, RemoteException {
			return accessCounterPersistence.findByCompanyId(companyId);
		}
		
		public int getAccess(long companyId) throws PortalException,
			SystemException, RemoteException {
		
			return accessCounterPersistence.countByCompanyId(companyId);
		}
	
}