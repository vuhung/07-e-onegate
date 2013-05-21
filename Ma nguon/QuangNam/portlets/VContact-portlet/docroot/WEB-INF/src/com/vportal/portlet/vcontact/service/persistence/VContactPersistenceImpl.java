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

package com.vportal.portlet.vcontact.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vcontact.NoSuchVContactException;
import com.vportal.portlet.vcontact.model.VContact;
import com.vportal.portlet.vcontact.model.impl.VContactImpl;
import com.vportal.portlet.vcontact.model.impl.VContactModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v contact service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VContactUtil} to access the v contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Admin
 * @see VContactPersistence
 * @see VContactUtil
 * @generated
 */
public class VContactPersistenceImpl extends BasePersistenceImpl<VContact>
	implements VContactPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VContactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_STATUS = new FinderPath(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByStatus",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByStatus", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_S = new FinderPath(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v contact in the entity cache if it is enabled.
	 *
	 * @param vContact the v contact to cache
	 */
	public void cacheResult(VContact vContact) {
		EntityCacheUtil.putResult(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactImpl.class, vContact.getPrimaryKey(), vContact);
	}

	/**
	 * Caches the v contacts in the entity cache if it is enabled.
	 *
	 * @param vContacts the v contacts to cache
	 */
	public void cacheResult(List<VContact> vContacts) {
		for (VContact vContact : vContacts) {
			if (EntityCacheUtil.getResult(
						VContactModelImpl.ENTITY_CACHE_ENABLED,
						VContactImpl.class, vContact.getPrimaryKey(), this) == null) {
				cacheResult(vContact);
			}
		}
	}

	/**
	 * Clears the cache for all v contacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VContactImpl.class.getName());
		EntityCacheUtil.clearCache(VContactImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v contact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VContact vContact) {
		EntityCacheUtil.removeResult(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactImpl.class, vContact.getPrimaryKey());
	}

	/**
	 * Creates a new v contact with the primary key. Does not add the v contact to the database.
	 *
	 * @param id the primary key for the new v contact
	 * @return the new v contact
	 */
	public VContact create(long id) {
		VContact vContact = new VContactImpl();

		vContact.setNew(true);
		vContact.setPrimaryKey(id);

		return vContact;
	}

	/**
	 * Removes the v contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v contact to remove
	 * @return the v contact that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the v contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the v contact to remove
	 * @return the v contact that was removed
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact remove(long id)
		throws NoSuchVContactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VContact vContact = (VContact)session.get(VContactImpl.class,
					new Long(id));

			if (vContact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchVContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(vContact);
		}
		catch (NoSuchVContactException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VContact removeImpl(VContact vContact) throws SystemException {
		vContact = toUnwrappedModel(vContact);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vContact);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactImpl.class, vContact.getPrimaryKey());

		return vContact;
	}

	public VContact updateImpl(
		com.vportal.portlet.vcontact.model.VContact vContact, boolean merge)
		throws SystemException {
		vContact = toUnwrappedModel(vContact);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vContact, merge);

			vContact.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VContactModelImpl.ENTITY_CACHE_ENABLED,
			VContactImpl.class, vContact.getPrimaryKey(), vContact);

		return vContact;
	}

	protected VContact toUnwrappedModel(VContact vContact) {
		if (vContact instanceof VContactImpl) {
			return vContact;
		}

		VContactImpl vContactImpl = new VContactImpl();

		vContactImpl.setNew(vContact.isNew());
		vContactImpl.setPrimaryKey(vContact.getPrimaryKey());

		vContactImpl.setId(vContact.getId());
		vContactImpl.setGroupId(vContact.getGroupId());
		vContactImpl.setCompanyId(vContact.getCompanyId());
		vContactImpl.setCreatedDate(vContact.getCreatedDate());
		vContactImpl.setModifiedDate(vContact.getModifiedDate());
		vContactImpl.setGuestName(vContact.getGuestName());
		vContactImpl.setEmail(vContact.getEmail());
		vContactImpl.setTitle(vContact.getTitle());
		vContactImpl.setAddress(vContact.getAddress());
		vContactImpl.setPhone(vContact.getPhone());
		vContactImpl.setFax(vContact.getFax());
		vContactImpl.setContent(vContact.getContent());
		vContactImpl.setHasAttach(vContact.isHasAttach());
		vContactImpl.setStatus(vContact.getStatus());

		return vContactImpl;
	}

	/**
	 * Finds the v contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v contact to find
	 * @return the v contact
	 * @throws com.liferay.portal.NoSuchModelException if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the v contact with the primary key or throws a {@link com.vportal.portlet.vcontact.NoSuchVContactException} if it could not be found.
	 *
	 * @param id the primary key of the v contact to find
	 * @return the v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact findByPrimaryKey(long id)
		throws NoSuchVContactException, SystemException {
		VContact vContact = fetchByPrimaryKey(id);

		if (vContact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchVContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return vContact;
	}

	/**
	 * Finds the v contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v contact to find
	 * @return the v contact, or <code>null</code> if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the v contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the v contact to find
	 * @return the v contact, or <code>null</code> if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact fetchByPrimaryKey(long id) throws SystemException {
		VContact vContact = (VContact)EntityCacheUtil.getResult(VContactModelImpl.ENTITY_CACHE_ENABLED,
				VContactImpl.class, id, this);

		if (vContact == null) {
			Session session = null;

			try {
				session = openSession();

				vContact = (VContact)session.get(VContactImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vContact != null) {
					cacheResult(vContact);
				}

				closeSession(session);
			}
		}

		return vContact;
	}

	/**
	 * Finds all the v contacts where status = &#63;.
	 *
	 * @param status the status to search with
	 * @return the matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findByStatus(int status) throws SystemException {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param start the lower bound of the range of v contacts to return
	 * @param end the upper bound of the range of v contacts to return (not inclusive)
	 * @return the range of matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findByStatus(int status, int start, int end)
		throws SystemException {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param start the lower bound of the range of v contacts to return
	 * @param end the upper bound of the range of v contacts to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findByStatus(int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VContact> list = (List<VContact>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUS,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VCONTACT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				list = (List<VContact>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_STATUS,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_STATUS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v contact in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact findByStatus_First(int status,
		OrderByComparator orderByComparator)
		throws NoSuchVContactException, SystemException {
		List<VContact> list = findByStatus(status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVContactException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v contact in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact findByStatus_Last(int status,
		OrderByComparator orderByComparator)
		throws NoSuchVContactException, SystemException {
		int count = countByStatus(status);

		List<VContact> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVContactException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v contacts before and after the current v contact in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current v contact
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact[] findByStatus_PrevAndNext(long id, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVContactException, SystemException {
		VContact vContact = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VContact[] array = new VContactImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vContact, status,
					orderByComparator, true);

			array[1] = vContact;

			array[2] = getByStatus_PrevAndNext(session, vContact, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VContact getByStatus_PrevAndNext(Session session,
		VContact vContact, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCONTACT_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v contacts where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findByG_S(long groupId, int status)
		throws SystemException {
		return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the v contacts where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of v contacts to return
	 * @param end the upper bound of the range of v contacts to return (not inclusive)
	 * @return the range of matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findByG_S(long groupId, int status, int start, int end)
		throws SystemException {
		return findByG_S(groupId, status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v contacts where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of v contacts to return
	 * @param end the upper bound of the range of v contacts to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VContact> list = (List<VContact>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VCONTACT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				list = (List<VContact>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v contact in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact findByG_S_First(long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVContactException, SystemException {
		List<VContact> list = findByG_S(groupId, status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVContactException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v contact in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact findByG_S_Last(long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVContactException, SystemException {
		int count = countByG_S(groupId, status);

		List<VContact> list = findByG_S(groupId, status, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVContactException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v contacts before and after the current v contact in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current v contact
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v contact
	 * @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VContact[] findByG_S_PrevAndNext(long id, long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVContactException, SystemException {
		VContact vContact = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VContact[] array = new VContactImpl[3];

			array[0] = getByG_S_PrevAndNext(session, vContact, groupId, status,
					orderByComparator, true);

			array[1] = vContact;

			array[2] = getByG_S_PrevAndNext(session, vContact, groupId, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VContact getByG_S_PrevAndNext(Session session, VContact vContact,
		long groupId, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCONTACT_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vContact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VContact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v contacts.
	 *
	 * @return the v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v contacts to return
	 * @param end the upper bound of the range of v contacts to return (not inclusive)
	 * @return the range of v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v contacts to return
	 * @param end the upper bound of the range of v contacts to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<VContact> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VContact> list = (List<VContact>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCONTACT.concat(VContactModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VContact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VContact>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the v contacts where status = &#63; from the database.
	 *
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStatus(int status) throws SystemException {
		for (VContact vContact : findByStatus(status)) {
			remove(vContact);
		}
	}

	/**
	 * Removes all the v contacts where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_S(long groupId, int status) throws SystemException {
		for (VContact vContact : findByG_S(groupId, status)) {
			remove(vContact);
		}
	}

	/**
	 * Removes all the v contacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VContact vContact : findAll()) {
			remove(vContact);
		}
	}

	/**
	 * Counts all the v contacts where status = &#63;.
	 *
	 * @param status the status to search with
	 * @return the number of matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStatus(int status) throws SystemException {
		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCONTACT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v contacts where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the number of matching v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_S(long groupId, int status) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCONTACT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v contacts.
	 *
	 * @return the number of v contacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCONTACT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the v contact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcontact.model.VContact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VContact>> listenersList = new ArrayList<ModelListener<VContact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VContact>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(VContactImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VContactPersistence.class)
	protected VContactPersistence vContactPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VCONTACT = "SELECT vContact FROM VContact vContact";
	private static final String _SQL_SELECT_VCONTACT_WHERE = "SELECT vContact FROM VContact vContact WHERE ";
	private static final String _SQL_COUNT_VCONTACT = "SELECT COUNT(vContact) FROM VContact vContact";
	private static final String _SQL_COUNT_VCONTACT_WHERE = "SELECT COUNT(vContact) FROM VContact vContact WHERE ";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "vContact.status = ?";
	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "vContact.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_STATUS_2 = "vContact.status = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vContact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VContact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VContact exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VContactPersistenceImpl.class);
}