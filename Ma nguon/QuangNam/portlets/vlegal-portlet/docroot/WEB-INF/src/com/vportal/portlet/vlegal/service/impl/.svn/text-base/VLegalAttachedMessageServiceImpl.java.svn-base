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
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;
import com.vportal.portlet.vlegal.model.VLegalAttachedMessage;
import com.vportal.portlet.vlegal.service.base.VLegalAttachedMessageServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalAttachedMessageUtil;

/**
 * The implementation of the v legal attached message remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalAttachedMessageService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil} to access the v legal attached message remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalAttachedMessageServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil
 */
public class VLegalAttachedMessageServiceImpl
	extends VLegalAttachedMessageServiceBaseImpl {
	@SuppressWarnings("deprecation")
	public VLegalAttachedMessage addMessage(long groupId, String articleId,
			String content, boolean read) throws PortalException,
			SystemException, RemoteException {
		try
		{
			// Only save the message when its content is not null
			if (Validator.isNull(content)) {
				return null;
			}
	
			String messageId = String.valueOf(counterLocalService.increment());
	
			Date now = new Date();
			long userId = getUserId();
	
			User user = userPersistence.findByPrimaryKey(userId);
	
			VLegalAttachedMessage message = vLegalAttachedMessagePersistence
					.create(messageId);
	
			message.setCompanyId(user.getCompanyId());
			message.setGroupId(groupId);
			message.setArticleId(articleId);
			message.setContent(content);
			message.setReadMessage(read);
	
			message.setCreatedByUser(userId);
			message.setCreatedDate(now);
			message.setUserId(userId);
	
			vLegalAttachedMessagePersistence.update(message, false);
	
			return message;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	public VLegalAttachedMessage updateMessage(String messageId, boolean read)
			throws PortalException, SystemException, RemoteException {
		try
		{
			if (Validator.isNull(messageId)) {
				return null;
			}
	
			VLegalAttachedMessage message = VLegalAttachedMessageUtil
					.findByPrimaryKey(messageId);
	
			message.setReadMessage(true);
	
			return VLegalAttachedMessageUtil.update(message, false);
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalAttachedMessage updateMessage(VLegalAttachedMessage message)
			throws PortalException, SystemException, RemoteException {

		return updateMessage(message.getMessageId(), message.getReadMessage());
	}

	@SuppressWarnings("deprecation")
	public void deleteMessage(String messageId) throws PortalException,
			SystemException, RemoteException {

		try
		{
			if (Validator.isNull(messageId)) {
				throw new NoSuchVLegalAttachedMessageException();
			}
	
			VLegalAttachedMessageUtil.remove(messageId);
		}catch(Exception ex)
		{
			
		}

	}

	@SuppressWarnings("deprecation")
	public void deleteMessages(String articleId) throws PortalException,
			SystemException, RemoteException {
		try
		{
			if (Validator.isNull(articleId)) {
				return;
			}
	
			VLegalAttachedMessageUtil.removeByArticle(articleId);
		}catch(Exception ex)
		{
			
		}
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllMessageByStatus(long groupId, boolean read)
			throws SystemException {
		try
		{
			return VLegalAttachedMessageUtil.findByStatus(groupId, read);
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalAttachedMessage getMessage(String messageId)
			throws PortalException, SystemException, RemoteException {
		try
		{
			if (Validator.isNull(messageId)) {
				throw new NoSuchVLegalAttachedMessageException();
			}
	
			return VLegalAttachedMessageUtil.findByPrimaryKey(messageId);
		}catch(Exception ex)
		{}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
	public List getMessages(String[] messageIds) throws PortalException,
			SystemException, RemoteException {

		List messages = new ArrayList();

		if ((messageIds == null) || (messageIds.length <= 0)) {
			return messages;
		}

		for (int i = 0; i < messageIds.length; i++) {
			messages.add(getMessage(messageIds[i]));
		}

		return messages;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getMessages(String articleId) throws PortalException,
			SystemException, RemoteException {

		try
		{
			List messages = new ArrayList();
	
			if (Validator.isNull(articleId)) {
				return messages;
			}
	
			messages = VLegalAttachedMessageUtil.findByArticle(articleId);
	
			return messages;
		}catch(Exception x)
		{
			
		}
		return null;
	}

	public List getMessages(String articleId, boolean read)
			throws PortalException, SystemException, RemoteException {

		try
		{
			List messages = new ArrayList();
	
			if (Validator.isNull(articleId)) {
				return messages;
			}
	
			messages = VLegalAttachedMessageUtil.findByA_R(articleId, read);
	
			return messages;
		}catch(Exception ex)
		{}
		return null;
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List getMessagesByGroup(long groupId) throws PortalException,
			SystemException, RemoteException {
		try
		{
			return VLegalAttachedMessageUtil.findByGroupId(groupId);
	
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public int count(String articleId, boolean read) throws PortalException,
			SystemException, RemoteException {
		try
		{
			if (Validator.isNull(articleId)) {
				return 0;
			}
	
			return VLegalAttachedMessageUtil.countByA_R(articleId, read);
		}catch(Exception ex)
		{
			
		}
		return 0;
	}
}