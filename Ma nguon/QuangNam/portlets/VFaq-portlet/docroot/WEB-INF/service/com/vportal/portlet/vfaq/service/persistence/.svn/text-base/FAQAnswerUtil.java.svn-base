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

import com.vportal.portlet.vfaq.model.FAQAnswer;

import java.util.List;

/**
 * The persistence utility for the f a q answer service. This utility wraps {@link FAQAnswerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see FAQAnswerPersistence
 * @see FAQAnswerPersistenceImpl
 * @generated
 */
public class FAQAnswerUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FAQAnswer faqAnswer) {
		getPersistence().clearCache(faqAnswer);
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
	public static List<FAQAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static FAQAnswer remove(FAQAnswer faqAnswer)
		throws SystemException {
		return getPersistence().remove(faqAnswer);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FAQAnswer update(FAQAnswer faqAnswer, boolean merge)
		throws SystemException {
		return getPersistence().update(faqAnswer, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FAQAnswer update(FAQAnswer faqAnswer, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(faqAnswer, merge, serviceContext);
	}

	/**
	* Caches the f a q answer in the entity cache if it is enabled.
	*
	* @param faqAnswer the f a q answer to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer) {
		getPersistence().cacheResult(faqAnswer);
	}

	/**
	* Caches the f a q answers in the entity cache if it is enabled.
	*
	* @param faqAnswers the f a q answers to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> faqAnswers) {
		getPersistence().cacheResult(faqAnswers);
	}

	/**
	* Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	*
	* @param id the primary key for the new f a q answer
	* @return the new f a q answer
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q answer to remove
	* @return the f a q answer that was removed
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().remove(id);
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswer updateImpl(
		com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(faqAnswer, merge);
	}

	/**
	* Finds the f a q answer with the primary key or throws a {@link com.vportal.portlet.vfaq.NoSuchFAQAnswerException} if it could not be found.
	*
	* @param id the primary key of the f a q answer to find
	* @return the f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Finds the f a q answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q answer to find
	* @return the f a q answer, or <code>null</code> if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Finds all the f a q answers where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the f a q answers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @return the range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the f a q answers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q answer in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last f a q answer in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the f a q answers before and after the current f a q answer in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q answer
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer[] findByUuid_PrevAndNext(
		long id, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Finds all the f a q answers where language = &#63;.
	*
	* @param language the language to search with
	* @return the matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByLanguage(
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLanguage(language);
	}

	/**
	* Finds a range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @return the range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByLanguage(
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLanguage(language, start, end);
	}

	/**
	* Finds an ordered range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByLanguage(
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLanguage(language, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q answer in the ordered set where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByLanguage_First(
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByLanguage_First(language, orderByComparator);
	}

	/**
	* Finds the last f a q answer in the ordered set where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByLanguage_Last(
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByLanguage_Last(language, orderByComparator);
	}

	/**
	* Finds the f a q answers before and after the current f a q answer in the ordered set where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q answer
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer[] findByLanguage_PrevAndNext(
		long id, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByLanguage_PrevAndNext(id, language, orderByComparator);
	}

	/**
	* Finds all the f a q answers where approved = &#63;.
	*
	* @param approved the approved to search with
	* @return the matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByApproved(
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApproved(approved);
	}

	/**
	* Finds a range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @return the range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByApproved(
		boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApproved(approved, start, end);
	}

	/**
	* Finds an ordered range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByApproved(
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApproved(approved, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q answer in the ordered set where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByApproved_First(
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByApproved_First(approved, orderByComparator);
	}

	/**
	* Finds the last f a q answer in the ordered set where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByApproved_Last(
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence().findByApproved_Last(approved, orderByComparator);
	}

	/**
	* Finds the f a q answers before and after the current f a q answer in the ordered set where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q answer
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer[] findByApproved_PrevAndNext(
		long id, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByApproved_PrevAndNext(id, approved, orderByComparator);
	}

	/**
	* Finds all the f a q answers where questionid = &#63;.
	*
	* @param questionid the questionid to search with
	* @return the matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByQuestionId(
		long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByQuestionId(questionid);
	}

	/**
	* Finds a range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionid the questionid to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @return the range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByQuestionId(
		long questionid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByQuestionId(questionid, start, end);
	}

	/**
	* Finds an ordered range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionid the questionid to search with
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findByQuestionId(
		long questionid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuestionId(questionid, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q answer in the ordered set where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionid the questionid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByQuestionId_First(
		long questionid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQuestionId_First(questionid, orderByComparator);
	}

	/**
	* Finds the last f a q answer in the ordered set where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param questionid the questionid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a matching f a q answer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer findByQuestionId_Last(
		long questionid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQuestionId_Last(questionid, orderByComparator);
	}

	/**
	* Finds the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q answer
	* @param questionid the questionid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q answer
	* @throws com.vportal.portlet.vfaq.NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer[] findByQuestionId_PrevAndNext(
		long id, long questionid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQuestionId_PrevAndNext(id, questionid,
			orderByComparator);
	}

	/**
	* Finds all the f a q answers.
	*
	* @return the f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the f a q answers.
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
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers to return
	* @param end the upper bound of the range of f a q answers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQAnswer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the f a q answers where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes all the f a q answers where language = &#63; from the database.
	*
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLanguage(java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLanguage(language);
	}

	/**
	* Removes all the f a q answers where approved = &#63; from the database.
	*
	* @param approved the approved to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByApproved(boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByApproved(approved);
	}

	/**
	* Removes all the f a q answers where questionid = &#63; from the database.
	*
	* @param questionid the questionid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByQuestionId(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByQuestionId(questionid);
	}

	/**
	* Removes all the f a q answers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the f a q answers where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the f a q answers where language = &#63;.
	*
	* @param language the language to search with
	* @return the number of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLanguage(java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLanguage(language);
	}

	/**
	* Counts all the f a q answers where approved = &#63;.
	*
	* @param approved the approved to search with
	* @return the number of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByApproved(boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByApproved(approved);
	}

	/**
	* Counts all the f a q answers where questionid = &#63;.
	*
	* @param questionid the questionid to search with
	* @return the number of matching f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByQuestionId(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByQuestionId(questionid);
	}

	/**
	* Counts all the f a q answers.
	*
	* @return the number of f a q answers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FAQAnswerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FAQAnswerPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vfaq.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQAnswerPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(FAQAnswerPersistence persistence) {
		_persistence = persistence;
	}

	private static FAQAnswerPersistence _persistence;
}