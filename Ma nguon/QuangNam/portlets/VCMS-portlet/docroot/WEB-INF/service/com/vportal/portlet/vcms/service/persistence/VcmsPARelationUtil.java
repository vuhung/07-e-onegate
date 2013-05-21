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

package com.vportal.portlet.vcms.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vcms.model.VcmsPARelation;

import java.util.List;

/**
 * The persistence utility for the vcms p a relation service. This utility wraps {@link VcmsPARelationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VcmsPARelationPersistence
 * @see VcmsPARelationPersistenceImpl
 * @generated
 */
public class VcmsPARelationUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VcmsPARelation vcmsPARelation) {
		getPersistence().clearCache(vcmsPARelation);
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
	public static List<VcmsPARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsPARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsPARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VcmsPARelation remove(VcmsPARelation vcmsPARelation)
		throws SystemException {
		return getPersistence().remove(vcmsPARelation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VcmsPARelation update(VcmsPARelation vcmsPARelation,
		boolean merge) throws SystemException {
		return getPersistence().update(vcmsPARelation, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VcmsPARelation update(VcmsPARelation vcmsPARelation,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vcmsPARelation, merge, serviceContext);
	}

	/**
	* Caches the vcms p a relation in the entity cache if it is enabled.
	*
	* @param vcmsPARelation the vcms p a relation to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcms.model.VcmsPARelation vcmsPARelation) {
		getPersistence().cacheResult(vcmsPARelation);
	}

	/**
	* Caches the vcms p a relations in the entity cache if it is enabled.
	*
	* @param vcmsPARelations the vcms p a relations to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> vcmsPARelations) {
		getPersistence().cacheResult(vcmsPARelations);
	}

	/**
	* Creates a new vcms p a relation with the primary key. Does not add the vcms p a relation to the database.
	*
	* @param vcmsPARelationPK the primary key for the new vcms p a relation
	* @return the new vcms p a relation
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation create(
		VcmsPARelationPK vcmsPARelationPK) {
		return getPersistence().create(vcmsPARelationPK);
	}

	/**
	* Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation to remove
	* @return the vcms p a relation that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation remove(
		VcmsPARelationPK vcmsPARelationPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence().remove(vcmsPARelationPK);
	}

	public static com.vportal.portlet.vcms.model.VcmsPARelation updateImpl(
		com.vportal.portlet.vcms.model.VcmsPARelation vcmsPARelation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vcmsPARelation, merge);
	}

	/**
	* Finds the vcms p a relation with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsPARelationException} if it could not be found.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation to find
	* @return the vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation findByPrimaryKey(
		VcmsPARelationPK vcmsPARelationPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence().findByPrimaryKey(vcmsPARelationPK);
	}

	/**
	* Finds the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation to find
	* @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation fetchByPrimaryKey(
		VcmsPARelationPK vcmsPARelationPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vcmsPARelationPK);
	}

	/**
	* Finds all the vcms p a relations where portionId = &#63;.
	*
	* @param portionId the portion id to search with
	* @return the matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findByPortion(
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortion(portionId);
	}

	/**
	* Finds a range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portionId the portion id to search with
	* @param start the lower bound of the range of vcms p a relations to return
	* @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	* @return the range of matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortion(portionId, start, end);
	}

	/**
	* Finds an ordered range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portionId the portion id to search with
	* @param start the lower bound of the range of vcms p a relations to return
	* @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortion(portionId, start, end, orderByComparator);
	}

	/**
	* Finds the first vcms p a relation in the ordered set where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portionId the portion id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation findByPortion_First(
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence().findByPortion_First(portionId, orderByComparator);
	}

	/**
	* Finds the last vcms p a relation in the ordered set where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portionId the portion id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation findByPortion_Last(
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence().findByPortion_Last(portionId, orderByComparator);
	}

	/**
	* Finds the vcms p a relations before and after the current vcms p a relation in the ordered set where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vcmsPARelationPK the primary key of the current vcms p a relation
	* @param portionId the portion id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation[] findByPortion_PrevAndNext(
		VcmsPARelationPK vcmsPARelationPK, java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence()
				   .findByPortion_PrevAndNext(vcmsPARelationPK, portionId,
			orderByComparator);
	}

	/**
	* Finds all the vcms p a relations where articleId = &#63;.
	*
	* @param articleId the article id to search with
	* @return the matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Finds a range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param start the lower bound of the range of vcms p a relations to return
	* @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	* @return the range of matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Finds an ordered range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param start the lower bound of the range of vcms p a relations to return
	* @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Finds the first vcms p a relation in the ordered set where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation findByArticle_First(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Finds the last vcms p a relation in the ordered set where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation findByArticle_Last(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Finds the vcms p a relations before and after the current vcms p a relation in the ordered set where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vcmsPARelationPK the primary key of the current vcms p a relation
	* @param articleId the article id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms p a relation
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPARelation[] findByArticle_PrevAndNext(
		VcmsPARelationPK vcmsPARelationPK, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPARelationException {
		return getPersistence()
				   .findByArticle_PrevAndNext(vcmsPARelationPK, articleId,
			orderByComparator);
	}

	/**
	* Finds all the vcms p a relations.
	*
	* @return the vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations to return
	* @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	* @return the range of vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations to return
	* @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPARelation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vcms p a relations where portionId = &#63; from the database.
	*
	* @param portionId the portion id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortion(portionId);
	}

	/**
	* Removes all the vcms p a relations where articleId = &#63; from the database.
	*
	* @param articleId the article id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Removes all the vcms p a relations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the vcms p a relations where portionId = &#63;.
	*
	* @param portionId the portion id to search with
	* @return the number of matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortion(portionId);
	}

	/**
	* Counts all the vcms p a relations where articleId = &#63;.
	*
	* @param articleId the article id to search with
	* @return the number of matching vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Counts all the vcms p a relations.
	*
	* @return the number of vcms p a relations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VcmsPARelationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VcmsPARelationPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcms.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsPARelationPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VcmsPARelationPersistence persistence) {
		_persistence = persistence;
	}

	private static VcmsPARelationPersistence _persistence;
}