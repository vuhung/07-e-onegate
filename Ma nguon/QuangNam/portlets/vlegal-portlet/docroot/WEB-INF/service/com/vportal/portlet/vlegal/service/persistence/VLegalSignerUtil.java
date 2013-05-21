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

package com.vportal.portlet.vlegal.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vlegal.model.VLegalSigner;

import java.util.List;

/**
 * The persistence utility for the v legal signer service. This utility wraps {@link VLegalSignerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalSignerPersistence
 * @see VLegalSignerPersistenceImpl
 * @generated
 */
public class VLegalSignerUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalSigner vLegalSigner) {
		getPersistence().clearCache(vLegalSigner);
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
	public static List<VLegalSigner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalSigner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalSigner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalSigner remove(VLegalSigner vLegalSigner)
		throws SystemException {
		return getPersistence().remove(vLegalSigner);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalSigner update(VLegalSigner vLegalSigner, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalSigner, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalSigner update(VLegalSigner vLegalSigner, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalSigner, merge, serviceContext);
	}

	/**
	* Caches the v legal signer in the entity cache if it is enabled.
	*
	* @param vLegalSigner the v legal signer to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalSigner vLegalSigner) {
		getPersistence().cacheResult(vLegalSigner);
	}

	/**
	* Caches the v legal signers in the entity cache if it is enabled.
	*
	* @param vLegalSigners the v legal signers to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> vLegalSigners) {
		getPersistence().cacheResult(vLegalSigners);
	}

	/**
	* Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	*
	* @param sigId the primary key for the new v legal signer
	* @return the new v legal signer
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner create(
		java.lang.String sigId) {
		return getPersistence().create(sigId);
	}

	/**
	* Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sigId the primary key of the v legal signer to remove
	* @return the v legal signer that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner remove(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence().remove(sigId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner updateImpl(
		com.vportal.portlet.vlegal.model.VLegalSigner vLegalSigner,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalSigner, merge);
	}

	/**
	* Finds the v legal signer with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSignerException} if it could not be found.
	*
	* @param sigId the primary key of the v legal signer to find
	* @return the v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByPrimaryKey(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence().findByPrimaryKey(sigId);
	}

	/**
	* Finds the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sigId the primary key of the v legal signer to find
	* @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner fetchByPrimaryKey(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sigId);
	}

	/**
	* Finds all the v legal signers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @return the range of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal signer in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last v legal signer in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner[] findByGroupId_PrevAndNext(
		java.lang.String sigId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(sigId, groupId, orderByComparator);
	}

	/**
	* Finds the v legal signer where groupId = &#63; and sigId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSignerException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByG_S(
		long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence().findByG_S(groupId, sigId);
	}

	/**
	* Finds the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner fetchByG_S(
		long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_S(groupId, sigId);
	}

	/**
	* Finds the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner fetchByG_S(
		long groupId, java.lang.String sigId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_S(groupId, sigId, retrieveFromCache);
	}

	/**
	* Finds all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroup_Lang(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_Lang(groupId, language);
	}

	/**
	* Finds a range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @return the range of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroup_Lang(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroup_Lang(groupId, language, start, end);
	}

	/**
	* Finds an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroup_Lang(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroup_Lang(groupId, language, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByGroup_Lang_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroup_Lang_First(groupId, language, orderByComparator);
	}

	/**
	* Finds the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByGroup_Lang_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroup_Lang_Last(groupId, language, orderByComparator);
	}

	/**
	* Finds the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner[] findByGroup_Lang_PrevAndNext(
		java.lang.String sigId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroup_Lang_PrevAndNext(sigId, groupId, language,
			orderByComparator);
	}

	/**
	* Finds all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @return the matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_S(groupId, language, statusSigner);
	}

	/**
	* Finds a range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @return the range of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusSigner, start, end);
	}

	/**
	* Finds an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusSigner, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByG_L_S_First(
		long groupId, java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByG_L_S_First(groupId, language, statusSigner,
			orderByComparator);
	}

	/**
	* Finds the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner findByG_L_S_Last(
		long groupId, java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByG_L_S_Last(groupId, language, statusSigner,
			orderByComparator);
	}

	/**
	* Finds the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSigner[] findByG_L_S_PrevAndNext(
		java.lang.String sigId, long groupId, java.lang.String language,
		boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByG_L_S_PrevAndNext(sigId, groupId, language,
			statusSigner, orderByComparator);
	}

	/**
	* Finds all the v legal signers.
	*
	* @return the v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @return the range of v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers to return
	* @param end the upper bound of the range of v legal signers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal signers where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes the v legal signer where groupId = &#63; and sigId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException {
		getPersistence().removeByG_S(groupId, sigId);
	}

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroup_Lang(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroup_Lang(groupId, language);
	}

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_S(groupId, language, statusSigner);
	}

	/**
	* Removes all the v legal signers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal signers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal signers where groupId = &#63; and sigId = &#63;.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, sigId);
	}

	/**
	* Counts all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroup_Lang(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroup_Lang(groupId, language);
	}

	/**
	* Counts all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L_S(groupId, language, statusSigner);
	}

	/**
	* Counts all the v legal signers.
	*
	* @return the number of v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalSignerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalSignerPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalSignerPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalSignerPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalSignerPersistence _persistence;
}