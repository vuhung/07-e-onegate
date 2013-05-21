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

/**
 * <p>
 * This class is a wrapper for {@link FAQAnswerLocalService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQAnswerLocalService
 * @generated
 */
public class FAQAnswerLocalServiceWrapper implements FAQAnswerLocalService {
	public FAQAnswerLocalServiceWrapper(
		FAQAnswerLocalService faqAnswerLocalService) {
		_faqAnswerLocalService = faqAnswerLocalService;
	}

	/**
	* Adds the f a q answer to the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer to add
	* @return the f a q answer that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addFAQAnswer(
		com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.addFAQAnswer(faqAnswer);
	}

	/**
	* Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	*
	* @param id the primary key for the new f a q answer
	* @return the new f a q answer
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer createFAQAnswer(long id) {
		return _faqAnswerLocalService.createFAQAnswer(id);
	}

	/**
	* Deletes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q answer to delete
	* @throws PortalException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteFAQAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.deleteFAQAnswer(id);
	}

	/**
	* Deletes the f a q answer from the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteFAQAnswer(
		com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.deleteFAQAnswer(faqAnswer);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the f a q answer with the primary key.
	*
	* @param id the primary key of the f a q answer to get
	* @return the f a q answer
	* @throws PortalException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer getFAQAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getFAQAnswer(id);
	}

	/**
	* Gets a range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @return the range of f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> getFAQAnswers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getFAQAnswers(start, end);
	}

	/**
	* Gets the number of f a q answers.
	*
	* @return the number of f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public int getFAQAnswersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getFAQAnswersCount();
	}

	/**
	* Updates the f a q answer in the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer to update
	* @return the f a q answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer updateFAQAnswer(
		com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.updateFAQAnswer(faqAnswer);
	}

	/**
	* Updates the f a q answer in the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer to update
	* @param merge whether to merge the f a q answer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the f a q answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer updateFAQAnswer(
		com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.updateFAQAnswer(faqAnswer, merge);
	}

	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long questionId,
		java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.addAnswer(questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long questionId,
		java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.addAnswer(questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId,
			addCommunityPermissions, addGuestPermissions);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long questionId,
		java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.addAnswer(questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId,
			communityPermissions, guestPermissions);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long questionId,
		java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.addAnswer(questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions);
	}

	/**
	* Sua 1 answer da co
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer updateAnswer(
		long answerId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.updateAnswer(answerId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId);
	}

	/**
	* Xoa 1 answer
	*/
	public void deleteAnswer(long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.deleteAnswer(answerid);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer approveAnswer(
		long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.approveAnswer(answerId, approvedByUser);
	}

	/**
	* Huy viec hien thi 1 answer
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer unapproveAnswer(
		long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.unapproveAnswer(answerId, approvedByUser);
	}

	/**
	* Tim answer voi questionid
	*/
	public java.util.List getByQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByQuestion(questionId);
	}

	public int countQuestion(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countQuestion(questionid);
	}

	/**
	* Tim nhung answer thong qua trang thai duyet (approve) cua answer
	*/
	public java.util.List getByApprove(boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByApprove(approved);
	}

	public java.util.List getByLanguage(java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByLanguage(language);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer getAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getAnswer(answerId);
	}

	public java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getAll();
	}

	public java.util.List getByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByGroupId(groupId);
	}

	public java.util.List getByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByGroupId(groupId, start, end);
	}

	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByGroupId(groupId);
	}

	public java.util.List getByGroupId(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByGroupId(groupId, language);
	}

	public java.util.List getByG_L_S(long groupId, java.lang.String language,
		boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByG_L_S(groupId, language, approved,
			start, end);
	}

	public int countByG_L_S(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByG_L_S(groupId, language, approved);
	}

	public int countByG_L_S_Q(long groupId, java.lang.String language,
		boolean approved, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByG_L_S_Q(groupId, language,
			approved, questionId);
	}

	public java.util.List getByParam(long groupId, java.lang.String language,
		boolean approved, java.lang.String title, long categoryId, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByParam(groupId, language, approved,
			title, categoryId, start, end);
	}

	public int countByParam(long groupId, java.lang.String language,
		boolean approved, java.lang.String title, long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByParam(groupId, language, approved,
			title, categoryId);
	}

	public void addAnswerResources(long answerId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.addAnswerResources(answerId,
			addCommunityPermissions, addGuestPermissions);
	}

	public void addAnswerResources(
		com.vportal.portlet.vfaq.model.FAQAnswer answer,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.addAnswerResources(answer,
			addCommunityPermissions, addGuestPermissions);
	}

	public void addAnswerResources(long answerId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.addAnswerResources(answerId,
			communityPermissions, guestPermissions);
	}

	public void addAnswerResources(
		com.vportal.portlet.vfaq.model.FAQAnswer answer,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.addAnswerResources(answer, communityPermissions,
			guestPermissions);
	}

	public FAQAnswerLocalService getWrappedFAQAnswerLocalService() {
		return _faqAnswerLocalService;
	}

	private FAQAnswerLocalService _faqAnswerLocalService;
}