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

package com.vportal.portlet.vfaq.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vfaq.model.FAQCategoryQuestion;

import java.util.List;

/**
 * The persistence utility for the f a q category question service. This utility wraps {@link FAQCategoryQuestionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryQuestionPersistence
 * @see FAQCategoryQuestionPersistenceImpl
 * @generated
 */
public class FAQCategoryQuestionUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FAQCategoryQuestion faqCategoryQuestion) {
		getPersistence().clearCache(faqCategoryQuestion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FAQCategoryQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQCategoryQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQCategoryQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static FAQCategoryQuestion remove(
		FAQCategoryQuestion faqCategoryQuestion) throws SystemException {
		return getPersistence().remove(faqCategoryQuestion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FAQCategoryQuestion update(
		FAQCategoryQuestion faqCategoryQuestion, boolean merge)
		throws SystemException {
		return getPersistence().update(faqCategoryQuestion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FAQCategoryQuestion update(
		FAQCategoryQuestion faqCategoryQuestion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(faqCategoryQuestion, merge, serviceContext);
	}

	/**
	* Caches the f a q category question in the entity cache if it is enabled.
	*
	* @param faqCategoryQuestion the f a q category question to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion) {
		getPersistence().cacheResult(faqCategoryQuestion);
	}

	/**
	* Caches the f a q category questions in the entity cache if it is enabled.
	*
	* @param faqCategoryQuestions the f a q category questions to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> faqCategoryQuestions) {
		getPersistence().cacheResult(faqCategoryQuestions);
	}

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question to remove
	* @return the f a q category question that was removed
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence().remove(id);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateImpl(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(faqCategoryQuestion, merge);
	}

	/**
	* Finds the f a q category question with the primary key or throws a {@link com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException} if it could not be found.
	*
	* @param id the primary key of the f a q category question to find
	* @return the f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Finds the f a q category question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q category question to find
	* @return the f a q category question, or <code>null</code> if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Finds all the f a q category questions where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the f a q category questions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @return the range of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the f a q category questions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category question in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last f a q category question in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the f a q category questions before and after the current f a q category question in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category question
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion[] findByUuid_PrevAndNext(
		long id, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Finds all the f a q category questions where questionId = &#63;.
	*
	* @param questionId the question id to search with
	* @return the matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByQuestionId(
		long questionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByQuestionId(questionId);
	}

	/**
	* Finds a range of all the f a q category questions where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question id to search with
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @return the range of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByQuestionId(
		long questionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByQuestionId(questionId, start, end);
	}

	/**
	* Finds an ordered range of all the f a q category questions where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question id to search with
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByQuestionId(
		long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuestionId(questionId, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category question in the ordered set where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByQuestionId_First(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByQuestionId_First(questionId, orderByComparator);
	}

	/**
	* Finds the last f a q category question in the ordered set where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionId the question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByQuestionId_Last(
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByQuestionId_Last(questionId, orderByComparator);
	}

	/**
	* Finds the f a q category questions before and after the current f a q category question in the ordered set where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category question
	* @param questionId the question id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion[] findByQuestionId_PrevAndNext(
		long id, long questionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByQuestionId_PrevAndNext(id, questionId,
			orderByComparator);
	}

	/**
	* Finds all the f a q category questions where categoryId = &#63;.
	*
	* @param categoryId the category id to search with
	* @return the matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategoryId(categoryId);
	}

	/**
	* Finds a range of all the f a q category questions where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the category id to search with
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @return the range of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByCategoryId(
		long categoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategoryId(categoryId, start, end);
	}

	/**
	* Finds an ordered range of all the f a q category questions where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the category id to search with
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findByCategoryId(
		long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCategoryId(categoryId, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category question in the ordered set where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the category id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByCategoryId_First(
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByCategoryId_First(categoryId, orderByComparator);
	}

	/**
	* Finds the last f a q category question in the ordered set where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the category id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion findByCategoryId_Last(
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByCategoryId_Last(categoryId, orderByComparator);
	}

	/**
	* Finds the f a q category questions before and after the current f a q category question in the ordered set where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category question
	* @param categoryId the category id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category question
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion[] findByCategoryId_PrevAndNext(
		long id, long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByCategoryId_PrevAndNext(id, categoryId,
			orderByComparator);
	}

	/**
	* Finds all the f a q category questions.
	*
	* @return the f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @return the range of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the f a q category questions where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes all the f a q category questions where questionId = &#63; from the database.
	*
	* @param questionId the question id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByQuestionId(questionId);
	}

	/**
	* Removes all the f a q category questions where categoryId = &#63; from the database.
	*
	* @param categoryId the category id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCategoryId(categoryId);
	}

	/**
	* Removes all the f a q category questions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the f a q category questions where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the f a q category questions where questionId = &#63;.
	*
	* @param questionId the question id to search with
	* @return the number of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByQuestionId(questionId);
	}

	/**
	* Counts all the f a q category questions where categoryId = &#63;.
	*
	* @param categoryId the category id to search with
	* @return the number of matching f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategoryId(categoryId);
	}

	/**
	* Counts all the f a q category questions.
	*
	* @return the number of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FAQCategoryQuestionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FAQCategoryQuestionPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vfaq.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCategoryQuestionPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(FAQCategoryQuestionPersistence persistence) {
		_persistence = persistence;
	}

	private static FAQCategoryQuestionPersistence _persistence;
}