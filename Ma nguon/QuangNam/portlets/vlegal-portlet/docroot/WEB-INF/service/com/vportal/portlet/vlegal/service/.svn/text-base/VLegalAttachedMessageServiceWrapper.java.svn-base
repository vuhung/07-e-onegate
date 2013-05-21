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

/**
 * <p>
 * This class is a wrapper for {@link VLegalAttachedMessageService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalAttachedMessageService
 * @generated
 */
public class VLegalAttachedMessageServiceWrapper
	implements VLegalAttachedMessageService {
	public VLegalAttachedMessageServiceWrapper(
		VLegalAttachedMessageService vLegalAttachedMessageService) {
		_vLegalAttachedMessageService = vLegalAttachedMessageService;
	}

	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage addMessage(
		long groupId, java.lang.String articleId, java.lang.String content,
		boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.addMessage(groupId, articleId,
			content, read);
	}

	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage updateMessage(
		java.lang.String messageId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.updateMessage(messageId, read);
	}

	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage updateMessage(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.updateMessage(message);
	}

	public void deleteMessage(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalAttachedMessageService.deleteMessage(messageId);
	}

	public void deleteMessages(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalAttachedMessageService.deleteMessages(articleId);
	}

	public java.util.List getAllMessageByStatus(long groupId, boolean read)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalAttachedMessageService.getAllMessageByStatus(groupId, read);
	}

	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage getMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.getMessage(messageId);
	}

	public java.util.List getMessages(java.lang.String[] messageIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.getMessages(messageIds);
	}

	public java.util.List getMessages(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.getMessages(articleId);
	}

	public java.util.List getMessages(java.lang.String articleId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.getMessages(articleId, read);
	}

	public java.util.List getMessagesByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.getMessagesByGroup(groupId);
	}

	public int count(java.lang.String articleId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalAttachedMessageService.count(articleId, read);
	}

	public VLegalAttachedMessageService getWrappedVLegalAttachedMessageService() {
		return _vLegalAttachedMessageService;
	}

	private VLegalAttachedMessageService _vLegalAttachedMessageService;
}