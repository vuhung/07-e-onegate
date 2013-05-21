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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vlegal.model.VLegalSigner;

/**
 * The persistence interface for the v legal signer service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalSignerUtil} to access the v legal signer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalSignerPersistenceImpl
 * @see VLegalSignerUtil
 * @generated
 */
public interface VLegalSignerPersistence extends BasePersistence<VLegalSigner> {
	/**
	* Caches the v legal signer in the entity cache if it is enabled.
	*
	* @param vLegalSigner the v legal signer to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalSigner vLegalSigner);

	/**
	* Caches the v legal signers in the entity cache if it is enabled.
	*
	* @param vLegalSigners the v legal signers to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> vLegalSigners);

	/**
	* Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	*
	* @param sigId the primary key for the new v legal signer
	* @return the new v legal signer
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner create(
		java.lang.String sigId);

	/**
	* Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sigId the primary key of the v legal signer to remove
	* @return the v legal signer that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner remove(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	public com.vportal.portlet.vlegal.model.VLegalSigner updateImpl(
		com.vportal.portlet.vlegal.model.VLegalSigner vLegalSigner,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal signer with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSignerException} if it could not be found.
	*
	* @param sigId the primary key of the v legal signer to find
	* @return the v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner findByPrimaryKey(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	/**
	* Finds the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sigId the primary key of the v legal signer to find
	* @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner fetchByPrimaryKey(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal signers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner[] findByGroupId_PrevAndNext(
		java.lang.String sigId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	/**
	* Finds the v legal signer where groupId = &#63; and sigId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSignerException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the matching v legal signer
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner findByG_S(
		long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	/**
	* Finds the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner fetchByG_S(
		long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSigner fetchByG_S(
		long groupId, java.lang.String sigId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroup_Lang(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroup_Lang(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByGroup_Lang(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner findByGroup_Lang_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner findByGroup_Lang_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner[] findByGroup_Lang_PrevAndNext(
		java.lang.String sigId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	/**
	* Finds all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @return the matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner findByG_L_S_First(
		long groupId, java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner findByG_L_S_Last(
		long groupId, java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

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
	public com.vportal.portlet.vlegal.model.VLegalSigner[] findByG_L_S_PrevAndNext(
		java.lang.String sigId, long groupId, java.lang.String language,
		boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	/**
	* Finds all the v legal signers.
	*
	* @return the v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSigner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal signers where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal signer where groupId = &#63; and sigId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSignerException;

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroup_Lang(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal signers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal signers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal signers where groupId = &#63; and sigId = &#63;.
	*
	* @param groupId the group id to search with
	* @param sigId the sig id to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroup_Lang(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusSigner the status signer to search with
	* @return the number of matching v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal signers.
	*
	* @return the number of v legal signers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}