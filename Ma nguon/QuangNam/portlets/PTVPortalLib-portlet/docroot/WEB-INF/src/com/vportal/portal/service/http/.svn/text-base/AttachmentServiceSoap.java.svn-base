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

package com.vportal.portal.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portal.service.AttachmentServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portal.service.AttachmentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portal.model.AttachmentSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portal.model.Attachment}, that is translated to a
 * {@link com.vportal.portal.model.AttachmentSoap}. Methods that SOAP cannot
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
 * @see       AttachmentServiceHttp
 * @see       com.vportal.portal.model.AttachmentSoap
 * @see       com.vportal.portal.service.AttachmentServiceUtil
 * @generated
 */
public class AttachmentServiceSoap {
	public static com.vportal.portal.model.AttachmentSoap addAttachment(
		long companyId, long groupId, long entryId, java.lang.Class entryClass,
		long folderId, java.lang.String fileName, byte[] byteArray)
		throws RemoteException {
		try {
			com.vportal.portal.model.Attachment returnValue = AttachmentServiceUtil.addAttachment(companyId,
					groupId, entryId, entryClass, folderId, fileName, byteArray);

			return com.vportal.portal.model.AttachmentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portal.model.AttachmentSoap[] getAttachments(
		long entryId, java.lang.Class entryClass) throws RemoteException {
		try {
			java.util.List returnValue = AttachmentServiceUtil.getAttachments(entryId,
					entryClass);

			return com.vportal.portal.model.AttachmentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portal.model.AttachmentSoap[] searchAttachments(
		long folderId, java.lang.String keywords) throws RemoteException {
		try {
			java.util.List returnValue = AttachmentServiceUtil.searchAttachments(folderId,
					keywords);

			return com.vportal.portal.model.AttachmentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAttachment(long attachmentId, long companyId)
		throws RemoteException {
		try {
			AttachmentServiceUtil.deleteAttachment(attachmentId, companyId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAttachments(java.lang.Class entryClass,
		long entryId) throws RemoteException {
		try {
			AttachmentServiceUtil.deleteAttachments(entryClass, entryId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AttachmentServiceSoap.class);
}