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

package com.vportal.portlet.vfaq.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vfaq.service.FAQCommentServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vfaq.service.FAQCommentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vfaq.model.FAQCommentSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vfaq.model.FAQComment}, that is translated to a
 * {@link com.vportal.portlet.vfaq.model.FAQCommentSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/tunnel-web/secure/axis. Set the property
 * <b>tunnel.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCommentServiceHttp
 * @see       com.vportal.portlet.vfaq.model.FAQCommentSoap
 * @see       com.vportal.portlet.vfaq.service.FAQCommentServiceUtil
 * @generated
 */
public class FAQCommentServiceSoap {
	public static com.vportal.portlet.vfaq.model.FAQCommentSoap addComment(
		long groupId, long answerId, java.lang.String content,
		java.lang.String commName, java.lang.String commEmail,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, java.util.Date commDate, long userId)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQComment returnValue = FAQCommentServiceUtil.addComment(groupId,
					answerId, content, commName, commEmail, approved,
					approveByUser, approvedDate, commDate, userId);

			return com.vportal.portlet.vfaq.model.FAQCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCommentSoap addComment(
		long groupId, long answerId, java.lang.String content,
		java.lang.String commName, java.lang.String commEmail,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, java.util.Date commDate, long userId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQComment returnValue = FAQCommentServiceUtil.addComment(groupId,
					answerId, content, commName, commEmail, approved,
					approveByUser, approvedDate, commDate, userId,
					addCommunityPermissions, addGuestPermissions);

			return com.vportal.portlet.vfaq.model.FAQCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCommentSoap addComment(
		long groupId, long answerId, java.lang.String content,
		java.lang.String commName, java.lang.String commEmail,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, java.util.Date commDate, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQComment returnValue = FAQCommentServiceUtil.addComment(groupId,
					answerId, content, commName, commEmail, approved,
					approveByUser, approvedDate, commDate, userId,
					communityPermissions, guestPermissions);

			return com.vportal.portlet.vfaq.model.FAQCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCommentSoap updateComment(
		long groupId, long commentId, java.lang.String content,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, long userId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQComment returnValue = FAQCommentServiceUtil.updateComment(groupId,
					commentId, content, approved, approveByUser, approvedDate,
					userId);

			return com.vportal.portlet.vfaq.model.FAQCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCommentSoap getComment(
		long groupId, long commentid) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQComment returnValue = FAQCommentServiceUtil.getComment(groupId,
					commentid);

			return com.vportal.portlet.vfaq.model.FAQCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeComment(long groupId, long commentid)
		throws RemoteException {
		try {
			FAQCommentServiceUtil.removeComment(groupId, commentid);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCommentSoap unapproved(
		long groupId, long commentid) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQComment returnValue = FAQCommentServiceUtil.unapproved(groupId,
					commentid);

			return com.vportal.portlet.vfaq.model.FAQCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FAQCommentServiceSoap.class);
}