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

package com.vportal.portlet.vcomment.service.impl;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.model.Contact;
import com.vportal.portlet.vcomment.NoSuchVCommentException;
import com.vportal.portlet.vcomment.model.VComment;
import com.vportal.portlet.vcomment.service.base.VCommentServiceBaseImpl;
import com.vportal.portlet.vcomment.service.persistence.VCommentUtil;

/**
 * The implementation of the v comment remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vcomment.service.VCommentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vcomment.service.VCommentServiceUtil} to access the v comment remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vcomment.service.base.VCommentServiceBaseImpl
 * @see com.vportal.portlet.vcomment.service.VCommentServiceUtil
 */
public class VCommentServiceImpl extends VCommentServiceBaseImpl {

	public static final int RECEIVED_PENDING = 0;

	public static final int RECEIVED = 1;

	public static final int DECLINE = 2;


	public VComment addComment(long groupId, long companyId, long plid,
			String guestName, String email, String title, String address,
			String phone, String fax, String content, boolean hasAttach,
			int status, long userId) throws PortalException, SystemException,
			RemoteException {

		long Id = 0;
		try {
			Id = CounterLocalServiceUtil.increment(Contact.class.getName());
		} catch (com.liferay.portal.kernel.exception.SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		VComment contact = VCommentUtil.create(Id);

		contact.setGroupId(groupId);
		contact.setCompanyId(companyId);

		contact.setCreatedDate(new Date());
		contact.setGuestName(guestName);
		contact.setEmail(email);
		contact.setTitle(title);
		contact.setAddress(address);
		contact.setPhone(phone);
		contact.setFax(fax);
		contact.setContent(content);
		contact.setHasAttach(hasAttach);
		contact.setStatus(VCommentServiceImpl.RECEIVED_PENDING);

		try {
			VCommentUtil.update(contact,false);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contact;
	}

	public VComment updateContact(long Id, long groupId, long companyId,
			String guestName, String email, String title, String address,
			String phone, String fax, String content, boolean hasAttach,
			int status) throws PortalException, SystemException,
			RemoteException {

		VComment contact = null;
		try {
			contact = VCommentUtil.findByPrimaryKey(Id);
		} catch (NoSuchVCommentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		contact.setGroupId(groupId);
		contact.setCompanyId(companyId);

		contact.setModifiedDate(new Date());
		contact.setGuestName(guestName);
		contact.setEmail(email);
		contact.setTitle(title);
		contact.setAddress(address);
		contact.setPhone(phone);
		contact.setFax(fax);
		contact.setContent(content);
		contact.setHasAttach(hasAttach);
		contact.setStatus(status);

		try {
			VCommentUtil.update(contact,false);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contact;
	}

	public VComment updateContact(VComment contact) throws PortalException,
			SystemException, RemoteException {
		return updateContact(contact.getId(), contact.getGroupId(), contact
				.getCompanyId(), contact.getGuestName(), contact.getEmail(),
				contact.getTitle(), contact.getAddress(), contact.getPhone(),
				contact.getFax(), contact.getContent(), contact.getHasAttach(),
				contact.getStatus());

	}

	public void deleteContact(long Id) throws PortalException, SystemException,
			RemoteException {

		VComment contact = null;
		try {
			contact = VCommentUtil.findByPrimaryKey(Id);
		} catch (NoSuchVCommentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			VCommentUtil.remove(contact);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List getAll() throws PortalException, SystemException,
			RemoteException {
		try {
			return VCommentUtil.findAll();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List getByStatus(int status) throws PortalException,
			SystemException, RemoteException {

		try {
			return vCommentPersistence.findByStatus(status);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List getByG_S(long groupId, int status) throws PortalException,
			SystemException, RemoteException {

		try {
			return vCommentPersistence.findByG_S(groupId, status);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List getByG_S(long groupId, int status, int start, int end)
			throws PortalException, SystemException, RemoteException {

		try {
			return vCommentPersistence.findByG_S(groupId, status, start, end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public VComment getContact(long Id) throws PortalException,
			SystemException, RemoteException {

		try {
			return vCommentPersistence.findByPrimaryKey(Id);
		} catch (NoSuchVCommentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public VComment addContact(long arg0, long arg1, long arg2, String arg3,
			String arg4, String arg5, String arg6, String arg7, String arg8,
			String arg9, boolean arg10, int arg11, long arg12, String[] arg13,
			String[] arg14) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VComment addContact(long arg0, long arg1, long arg2, String arg3,
			String arg4, String arg5, String arg6, String arg7, String arg8,
			String arg9, boolean arg10, int arg11, long arg12, Boolean arg13,
			Boolean arg14, String[] arg15, String[] arg16)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}