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

import com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;
import com.vportal.portlet.vlegal.model.VLegalAttachedMessage;
import com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal attached message service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalAttachedMessageUtil} to access the v legal attached message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalAttachedMessagePersistence
 * @see VLegalAttachedMessageUtil
 * @generated
 */
public class VLegalAttachedMessagePersistenceImpl extends BasePersistenceImpl<VLegalAttachedMessage>
	implements VLegalAttachedMessagePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalAttachedMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByGroupId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ARTICLE = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByArticle",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByArticle",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_A_R = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByA_R",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_A_R = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByA_R",
			new String[] { String.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_STATUS = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByStatus",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByStatus",
			new String[] { Long.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the v legal attached message in the entity cache if it is enabled.
	 *
	 * @param vLegalAttachedMessage the v legal attached message to cache
	 */
	public void cacheResult(VLegalAttachedMessage vLegalAttachedMessage) {
		EntityCacheUtil.putResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey(), vLegalAttachedMessage);
	}

	/**
	 * Caches the v legal attached messages in the entity cache if it is enabled.
	 *
	 * @param vLegalAttachedMessages the v legal attached messages to cache
	 */
	public void cacheResult(List<VLegalAttachedMessage> vLegalAttachedMessages) {
		for (VLegalAttachedMessage vLegalAttachedMessage : vLegalAttachedMessages) {
			if (EntityCacheUtil.getResult(
						VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
						VLegalAttachedMessageImpl.class,
						vLegalAttachedMessage.getPrimaryKey(), this) == null) {
				cacheResult(vLegalAttachedMessage);
			}
		}
	}

	/**
	 * Clears the cache for all v legal attached messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalAttachedMessageImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalAttachedMessageImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal attached message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalAttachedMessage vLegalAttachedMessage) {
		EntityCacheUtil.removeResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey());
	}

	/**
	 * Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	 *
	 * @param messageId the primary key for the new v legal attached message
	 * @return the new v legal attached message
	 */
	public VLegalAttachedMessage create(String messageId) {
		VLegalAttachedMessage vLegalAttachedMessage = new VLegalAttachedMessageImpl();

		vLegalAttachedMessage.setNew(true);
		vLegalAttachedMessage.setPrimaryKey(messageId);

		return vLegalAttachedMessage;
	}

	/**
	 * Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal attached message to remove
	 * @return the v legal attached message that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param messageId the primary key of the v legal attached message to remove
	 * @return the v legal attached message that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage remove(String messageId)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage vLegalAttachedMessage = (VLegalAttachedMessage)session.get(VLegalAttachedMessageImpl.class,
					messageId);

			if (vLegalAttachedMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + messageId);
				}

				throw new NoSuchVLegalAttachedMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					messageId);
			}

			return remove(vLegalAttachedMessage);
		}
		catch (NoSuchVLegalAttachedMessageException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage removeImpl(
		VLegalAttachedMessage vLegalAttachedMessage) throws SystemException {
		vLegalAttachedMessage = toUnwrappedModel(vLegalAttachedMessage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalAttachedMessage);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey());

		return vLegalAttachedMessage;
	}

	public VLegalAttachedMessage updateImpl(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage vLegalAttachedMessage,
		boolean merge) throws SystemException {
		vLegalAttachedMessage = toUnwrappedModel(vLegalAttachedMessage);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalAttachedMessage, merge);

			vLegalAttachedMessage.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey(), vLegalAttachedMessage);

		return vLegalAttachedMessage;
	}

	protected VLegalAttachedMessage toUnwrappedModel(
		VLegalAttachedMessage vLegalAttachedMessage) {
		if (vLegalAttachedMessage instanceof VLegalAttachedMessageImpl) {
			return vLegalAttachedMessage;
		}

		VLegalAttachedMessageImpl vLegalAttachedMessageImpl = new VLegalAttachedMessageImpl();

		vLegalAttachedMessageImpl.setNew(vLegalAttachedMessage.isNew());
		vLegalAttachedMessageImpl.setPrimaryKey(vLegalAttachedMessage.getPrimaryKey());

		vLegalAttachedMessageImpl.setMessageId(vLegalAttachedMessage.getMessageId());
		vLegalAttachedMessageImpl.setGroupId(vLegalAttachedMessage.getGroupId());
		vLegalAttachedMessageImpl.setCompanyId(vLegalAttachedMessage.getCompanyId());
		vLegalAttachedMessageImpl.setUserId(vLegalAttachedMessage.getUserId());
		vLegalAttachedMessageImpl.setCreatedDate(vLegalAttachedMessage.getCreatedDate());
		vLegalAttachedMessageImpl.setCreatedByUser(vLegalAttachedMessage.getCreatedByUser());
		vLegalAttachedMessageImpl.setArticleId(vLegalAttachedMessage.getArticleId());
		vLegalAttachedMessageImpl.setContent(vLegalAttachedMessage.getContent());
		vLegalAttachedMessageImpl.setReadMessage(vLegalAttachedMessage.isReadMessage());

		return vLegalAttachedMessageImpl;
	}

	/**
	 * Finds the v legal attached message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal attached message to find
	 * @return the v legal attached message
	 * @throws com.liferay.portal.NoSuchModelException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal attached message with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException} if it could not be found.
	 *
	 * @param messageId the primary key of the v legal attached message to find
	 * @return the v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByPrimaryKey(String messageId)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByPrimaryKey(messageId);

		if (vLegalAttachedMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + messageId);
			}

			throw new NoSuchVLegalAttachedMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				messageId);
		}

		return vLegalAttachedMessage;
	}

	/**
	 * Finds the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal attached message to find
	 * @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param messageId the primary key of the v legal attached message to find
	 * @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage fetchByPrimaryKey(String messageId)
		throws SystemException {
		VLegalAttachedMessage vLegalAttachedMessage = (VLegalAttachedMessage)EntityCacheUtil.getResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
				VLegalAttachedMessageImpl.class, messageId, this);

		if (vLegalAttachedMessage == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalAttachedMessage = (VLegalAttachedMessage)session.get(VLegalAttachedMessageImpl.class,
						messageId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalAttachedMessage != null) {
					cacheResult(vLegalAttachedMessage);
				}

				closeSession(session);
			}
		}

		return vLegalAttachedMessage;
	}

	/**
	 * Finds all the v legal attached messages where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal attached messages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @return the range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal attached messages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalAttachedMessage> list = (List<VLegalAttachedMessage>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		List<VLegalAttachedMessage> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalAttachedMessage> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage[] findByGroupId_PrevAndNext(String messageId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalAttachedMessage,
					groupId, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByGroupId_PrevAndNext(session, vLegalAttachedMessage,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage getByGroupId_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal attached messages where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByArticle(String articleId)
		throws SystemException {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the v legal attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @return the range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByArticle(String articleId,
		int start, int end) throws SystemException {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByArticle(String articleId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalAttachedMessage> list = (List<VLegalAttachedMessage>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ARTICLE,
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ARTICLE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ARTICLE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByArticle_First(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		List<VLegalAttachedMessage> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByArticle_Last(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		int count = countByArticle(articleId);

		List<VLegalAttachedMessage> list = findByArticle(articleId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage[] findByArticle_PrevAndNext(String messageId,
		String articleId, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vLegalAttachedMessage,
					articleId, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByArticle_PrevAndNext(session, vLegalAttachedMessage,
					articleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage getByArticle_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, String articleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

		if (articleId == null) {
			query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
		}
		else {
			if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
			}
		}

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (articleId != null) {
			qPos.add(articleId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @return the matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage) throws SystemException {
		return findByA_R(articleId, readMessage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @return the range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end) throws SystemException {
		return findByA_R(articleId, readMessage, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId, readMessage,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalAttachedMessage> list = (List<VLegalAttachedMessage>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_A_R,
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_R_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);
				}
			}

			query.append(_FINDER_COLUMN_A_R_READMESSAGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				qPos.add(readMessage);

				list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_A_R,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_A_R,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByA_R_First(String articleId,
		boolean readMessage, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		List<VLegalAttachedMessage> list = findByA_R(articleId, readMessage, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(", readMessage=");
			msg.append(readMessage);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByA_R_Last(String articleId,
		boolean readMessage, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		int count = countByA_R(articleId, readMessage);

		List<VLegalAttachedMessage> list = findByA_R(articleId, readMessage,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(", readMessage=");
			msg.append(readMessage);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage[] findByA_R_PrevAndNext(String messageId,
		String articleId, boolean readMessage,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByA_R_PrevAndNext(session, vLegalAttachedMessage,
					articleId, readMessage, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByA_R_PrevAndNext(session, vLegalAttachedMessage,
					articleId, readMessage, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage getByA_R_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, String articleId,
		boolean readMessage, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

		if (articleId == null) {
			query.append(_FINDER_COLUMN_A_R_ARTICLEID_1);
		}
		else {
			if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);
			}
		}

		query.append(_FINDER_COLUMN_A_R_READMESSAGE_2);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (articleId != null) {
			qPos.add(articleId);
		}

		qPos.add(readMessage);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @return the matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage) throws SystemException {
		return findByStatus(groupId, readMessage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @return the range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end) throws SystemException {
		return findByStatus(groupId, readMessage, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, readMessage,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalAttachedMessage> list = (List<VLegalAttachedMessage>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUS,
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_READMESSAGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(readMessage);

				list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Finds the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByStatus_First(long groupId,
		boolean readMessage, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		List<VLegalAttachedMessage> list = findByStatus(groupId, readMessage,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", readMessage=");
			msg.append(readMessage);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage findByStatus_Last(long groupId,
		boolean readMessage, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		int count = countByStatus(groupId, readMessage);

		List<VLegalAttachedMessage> list = findByStatus(groupId, readMessage,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", readMessage=");
			msg.append(readMessage);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalAttachedMessageException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal attached message
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalAttachedMessage[] findByStatus_PrevAndNext(String messageId,
		long groupId, boolean readMessage, OrderByComparator orderByComparator)
		throws NoSuchVLegalAttachedMessageException, SystemException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vLegalAttachedMessage,
					groupId, readMessage, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByStatus_PrevAndNext(session, vLegalAttachedMessage,
					groupId, readMessage, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage getByStatus_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, long groupId,
		boolean readMessage, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

		query.append(_FINDER_COLUMN_STATUS_GROUPID_2);

		query.append(_FINDER_COLUMN_STATUS_READMESSAGE_2);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(readMessage);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal attached messages.
	 *
	 * @return the v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @return the range of v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal attached messages to return
	 * @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalAttachedMessage> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalAttachedMessage> list = (List<VLegalAttachedMessage>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALATTACHEDMESSAGE.concat(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the v legal attached messages where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByGroupId(
				groupId)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Removes all the v legal attached messages where articleId = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByArticle(String articleId) throws SystemException {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByArticle(
				articleId)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Removes all the v legal attached messages where articleId = &#63; and readMessage = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByA_R(String articleId, boolean readMessage)
		throws SystemException {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByA_R(
				articleId, readMessage)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Removes all the v legal attached messages where groupId = &#63; and readMessage = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStatus(long groupId, boolean readMessage)
		throws SystemException {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByStatus(
				groupId, readMessage)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Removes all the v legal attached messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalAttachedMessage vLegalAttachedMessage : findAll()) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Counts all the v legal attached messages where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal attached messages where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the number of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByArticle(String articleId) throws SystemException {
		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ARTICLE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ARTICLE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @param readMessage the read message to search with
	 * @return the number of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByA_R(String articleId, boolean readMessage)
		throws SystemException {
		Object[] finderArgs = new Object[] { articleId, readMessage };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_A_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_R_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);
				}
			}

			query.append(_FINDER_COLUMN_A_R_READMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				qPos.add(readMessage);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A_R, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param readMessage the read message to search with
	 * @return the number of matching v legal attached messages
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStatus(long groupId, boolean readMessage)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, readMessage };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_READMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(readMessage);

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
	 * Counts all the v legal attached messages.
	 *
	 * @return the number of v legal attached messages
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALATTACHEDMESSAGE);

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
	 * Initializes the v legal attached message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalAttachedMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalAttachedMessage>> listenersList = new ArrayList<ModelListener<VLegalAttachedMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalAttachedMessage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalAttachedMessageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VLegalDocumentPersistence.class)
	protected VLegalDocumentPersistence vLegalDocumentPersistence;
	@BeanReference(type = VLegalFieldPersistence.class)
	protected VLegalFieldPersistence vLegalFieldPersistence;
	@BeanReference(type = VLegalTypePersistence.class)
	protected VLegalTypePersistence vLegalTypePersistence;
	@BeanReference(type = VLegalDraftDocumentPersistence.class)
	protected VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence;
	@BeanReference(type = VLegalSuggestDocumentPersistence.class)
	protected VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence;
	@BeanReference(type = VLegalAttachedMessagePersistence.class)
	protected VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence;
	@BeanReference(type = VLegalOrgPersistence.class)
	protected VLegalOrgPersistence vLegalOrgPersistence;
	@BeanReference(type = VLegalSignerPersistence.class)
	protected VLegalSignerPersistence vLegalSignerPersistence;
	@BeanReference(type = VLegalTagsPersistence.class)
	protected VLegalTagsPersistence vLegalTagsPersistence;
	@BeanReference(type = VLegalFORelPersistence.class)
	protected VLegalFORelPersistence vLegalFORelPersistence;
	@BeanReference(type = VLegalFTRelPersistence.class)
	protected VLegalFTRelPersistence vLegalFTRelPersistence;
	@BeanReference(type = VLegalDFRelPersistence.class)
	protected VLegalDFRelPersistence vLegalDFRelPersistence;
	@BeanReference(type = VLegalDDRelPersistence.class)
	protected VLegalDDRelPersistence vLegalDDRelPersistence;
	@BeanReference(type = VLegalDURelPersistence.class)
	protected VLegalDURelPersistence vLegalDURelPersistence;
	@BeanReference(type = VLegalDSRelPersistence.class)
	protected VLegalDSRelPersistence vLegalDSRelPersistence;
	@BeanReference(type = VLegalTDRelPersistence.class)
	protected VLegalTDRelPersistence vLegalTDRelPersistence;
	@BeanReference(type = VLegalLoggerPersistence.class)
	protected VLegalLoggerPersistence vLegalLoggerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VLEGALATTACHEDMESSAGE = "SELECT vLegalAttachedMessage FROM VLegalAttachedMessage vLegalAttachedMessage";
	private static final String _SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE = "SELECT vLegalAttachedMessage FROM VLegalAttachedMessage vLegalAttachedMessage WHERE ";
	private static final String _SQL_COUNT_VLEGALATTACHEDMESSAGE = "SELECT COUNT(vLegalAttachedMessage) FROM VLegalAttachedMessage vLegalAttachedMessage";
	private static final String _SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE = "SELECT COUNT(vLegalAttachedMessage) FROM VLegalAttachedMessage vLegalAttachedMessage WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalAttachedMessage.groupId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vLegalAttachedMessage.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vLegalAttachedMessage.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vLegalAttachedMessage.articleId IS NULL OR vLegalAttachedMessage.articleId = ?)";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_1 = "vLegalAttachedMessage.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_2 = "vLegalAttachedMessage.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_3 = "(vLegalAttachedMessage.articleId IS NULL OR vLegalAttachedMessage.articleId = ?) AND ";
	private static final String _FINDER_COLUMN_A_R_READMESSAGE_2 = "vLegalAttachedMessage.readMessage = ?";
	private static final String _FINDER_COLUMN_STATUS_GROUPID_2 = "vLegalAttachedMessage.groupId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_READMESSAGE_2 = "vLegalAttachedMessage.readMessage = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalAttachedMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalAttachedMessage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalAttachedMessage exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalAttachedMessagePersistenceImpl.class);
}