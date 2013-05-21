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

package com.vportal.portlet.vfaq.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the f a q answer remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link FAQAnswerServiceUtil} to access the f a q answer remote service. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQAnswerServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see FAQAnswerServiceUtil
 * @see com.vportal.portlet.vfaq.service.base.FAQAnswerServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQAnswerServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FAQAnswerService {
	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sua 1 answer da co
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer updateAnswer(long groupId,
		long answerId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Xoa 1 answer
	*/
	public void deleteAnswer(long groupId, long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vfaq.model.FAQAnswer approveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Huy viec hien thi 1 answer
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer unapproveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vfaq.model.FAQAnswer getAnswer(long groupId,
		long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countQuestion(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException;
}