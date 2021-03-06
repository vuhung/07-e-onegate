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

package com.vportal.portlet.pollsadmin.service.persistence;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException;
import com.vportal.portlet.pollsadmin.model.PollsChoice;
import com.vportal.portlet.pollsadmin.model.impl.PollsChoiceImpl;
import com.vportal.portlet.pollsadmin.model.impl.PollsChoiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the polls choice service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link PollsChoiceUtil} to access the polls choice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see PollsChoicePersistence
 * @see PollsChoiceUtil
 * @generated
 */
public class PollsChoicePersistenceImpl extends BasePersistenceImpl<PollsChoice>
	implements PollsChoicePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = PollsChoiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_UUID = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUuid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_QUESTIONID = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByQuestionId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_QUESTIONID = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByQuestionId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_Q_N = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByQ_N",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_Q_N = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByQ_N",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the polls choice in the entity cache if it is enabled.
	 *
	 * @param pollsChoice the polls choice to cache
	 */
	public void cacheResult(PollsChoice pollsChoice) {
		EntityCacheUtil.putResult(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceImpl.class, pollsChoice.getPrimaryKey(), pollsChoice);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Q_N,
			new Object[] {
				new Long(pollsChoice.getQuestionId()),
				
			pollsChoice.getName()
			}, pollsChoice);
	}

	/**
	 * Caches the polls choices in the entity cache if it is enabled.
	 *
	 * @param pollsChoices the polls choices to cache
	 */
	public void cacheResult(List<PollsChoice> pollsChoices) {
		for (PollsChoice pollsChoice : pollsChoices) {
			if (EntityCacheUtil.getResult(
						PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
						PollsChoiceImpl.class, pollsChoice.getPrimaryKey(), this) == null) {
				cacheResult(pollsChoice);
			}
		}
	}

	/**
	 * Clears the cache for all polls choices.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(PollsChoiceImpl.class.getName());
		EntityCacheUtil.clearCache(PollsChoiceImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the polls choice.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(PollsChoice pollsChoice) {
		EntityCacheUtil.removeResult(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceImpl.class, pollsChoice.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Q_N,
			new Object[] {
				new Long(pollsChoice.getQuestionId()),
				
			pollsChoice.getName()
			});
	}

	/**
	 * Creates a new polls choice with the primary key. Does not add the polls choice to the database.
	 *
	 * @param choiceId the primary key for the new polls choice
	 * @return the new polls choice
	 */
	public PollsChoice create(long choiceId) {
		PollsChoice pollsChoice = new PollsChoiceImpl();

		pollsChoice.setNew(true);
		pollsChoice.setPrimaryKey(choiceId);

		String uuid = PortalUUIDUtil.generate();

		pollsChoice.setUuid(uuid);

		return pollsChoice;
	}

	/**
	 * Removes the polls choice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the polls choice to remove
	 * @return the polls choice that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the polls choice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param choiceId the primary key of the polls choice to remove
	 * @return the polls choice that was removed
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice remove(long choiceId)
		throws NoSuchPollsChoiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PollsChoice pollsChoice = (PollsChoice)session.get(PollsChoiceImpl.class,
					new Long(choiceId));

			if (pollsChoice == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + choiceId);
				}

				throw new NoSuchPollsChoiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					choiceId);
			}

			return remove(pollsChoice);
		}
		catch (NoSuchPollsChoiceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PollsChoice removeImpl(PollsChoice pollsChoice)
		throws SystemException {
		pollsChoice = toUnwrappedModel(pollsChoice);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, pollsChoice);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		PollsChoiceModelImpl pollsChoiceModelImpl = (PollsChoiceModelImpl)pollsChoice;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Q_N,
			new Object[] {
				new Long(pollsChoiceModelImpl.getQuestionId()),
				
			pollsChoiceModelImpl.getName()
			});

		EntityCacheUtil.removeResult(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceImpl.class, pollsChoice.getPrimaryKey());

		return pollsChoice;
	}

	public PollsChoice updateImpl(
		com.vportal.portlet.pollsadmin.model.PollsChoice pollsChoice,
		boolean merge) throws SystemException {
		pollsChoice = toUnwrappedModel(pollsChoice);

		boolean isNew = pollsChoice.isNew();

		PollsChoiceModelImpl pollsChoiceModelImpl = (PollsChoiceModelImpl)pollsChoice;

		if (Validator.isNull(pollsChoice.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			pollsChoice.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, pollsChoice, merge);

			pollsChoice.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
			PollsChoiceImpl.class, pollsChoice.getPrimaryKey(), pollsChoice);

		if (!isNew &&
				((pollsChoice.getQuestionId() != pollsChoiceModelImpl.getOriginalQuestionId()) ||
				!Validator.equals(pollsChoice.getName(),
					pollsChoiceModelImpl.getOriginalName()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Q_N,
				new Object[] {
					new Long(pollsChoiceModelImpl.getOriginalQuestionId()),
					
				pollsChoiceModelImpl.getOriginalName()
				});
		}

		if (isNew ||
				((pollsChoice.getQuestionId() != pollsChoiceModelImpl.getOriginalQuestionId()) ||
				!Validator.equals(pollsChoice.getName(),
					pollsChoiceModelImpl.getOriginalName()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Q_N,
				new Object[] {
					new Long(pollsChoice.getQuestionId()),
					
				pollsChoice.getName()
				}, pollsChoice);
		}

		return pollsChoice;
	}

	protected PollsChoice toUnwrappedModel(PollsChoice pollsChoice) {
		if (pollsChoice instanceof PollsChoiceImpl) {
			return pollsChoice;
		}

		PollsChoiceImpl pollsChoiceImpl = new PollsChoiceImpl();

		pollsChoiceImpl.setNew(pollsChoice.isNew());
		pollsChoiceImpl.setPrimaryKey(pollsChoice.getPrimaryKey());

		pollsChoiceImpl.setUuid(pollsChoice.getUuid());
		pollsChoiceImpl.setChoiceId(pollsChoice.getChoiceId());
		pollsChoiceImpl.setQuestionId(pollsChoice.getQuestionId());
		pollsChoiceImpl.setName(pollsChoice.getName());
		pollsChoiceImpl.setDescription(pollsChoice.getDescription());

		return pollsChoiceImpl;
	}

	/**
	 * Finds the polls choice with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the polls choice to find
	 * @return the polls choice
	 * @throws com.liferay.portal.NoSuchModelException if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the polls choice with the primary key or throws a {@link com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException} if it could not be found.
	 *
	 * @param choiceId the primary key of the polls choice to find
	 * @return the polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByPrimaryKey(long choiceId)
		throws NoSuchPollsChoiceException, SystemException {
		PollsChoice pollsChoice = fetchByPrimaryKey(choiceId);

		if (pollsChoice == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + choiceId);
			}

			throw new NoSuchPollsChoiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				choiceId);
		}

		return pollsChoice;
	}

	/**
	 * Finds the polls choice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the polls choice to find
	 * @return the polls choice, or <code>null</code> if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the polls choice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param choiceId the primary key of the polls choice to find
	 * @return the polls choice, or <code>null</code> if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice fetchByPrimaryKey(long choiceId)
		throws SystemException {
		PollsChoice pollsChoice = (PollsChoice)EntityCacheUtil.getResult(PollsChoiceModelImpl.ENTITY_CACHE_ENABLED,
				PollsChoiceImpl.class, choiceId, this);

		if (pollsChoice == null) {
			Session session = null;

			try {
				session = openSession();

				pollsChoice = (PollsChoice)session.get(PollsChoiceImpl.class,
						new Long(choiceId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (pollsChoice != null) {
					cacheResult(pollsChoice);
				}

				closeSession(session);
			}
		}

		return pollsChoice;
	}

	/**
	 * Finds all the polls choices where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the polls choices where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of polls choices to return
	 * @param end the upper bound of the range of polls choices to return (not inclusive)
	 * @return the range of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Finds an ordered range of all the polls choices where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of polls choices to return
	 * @param end the upper bound of the range of polls choices to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				uuid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PollsChoice> list = (List<PollsChoice>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_UUID,
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

			query.append(_SQL_SELECT_POLLSCHOICE_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(PollsChoiceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				list = (List<PollsChoice>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first polls choice in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPollsChoiceException, SystemException {
		List<PollsChoice> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPollsChoiceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last polls choice in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPollsChoiceException, SystemException {
		int count = countByUuid(uuid);

		List<PollsChoice> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPollsChoiceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the polls choices before and after the current polls choice in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param choiceId the primary key of the current polls choice
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice[] findByUuid_PrevAndNext(long choiceId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPollsChoiceException, SystemException {
		PollsChoice pollsChoice = findByPrimaryKey(choiceId);

		Session session = null;

		try {
			session = openSession();

			PollsChoice[] array = new PollsChoiceImpl[3];

			array[0] = getByUuid_PrevAndNext(session, pollsChoice, uuid,
					orderByComparator, true);

			array[1] = pollsChoice;

			array[2] = getByUuid_PrevAndNext(session, pollsChoice, uuid,
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

	protected PollsChoice getByUuid_PrevAndNext(Session session,
		PollsChoice pollsChoice, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_POLLSCHOICE_WHERE);

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else {
			if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(PollsChoiceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (uuid != null) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(pollsChoice);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PollsChoice> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the polls choices where questionId = &#63;.
	 *
	 * @param questionId the question id to search with
	 * @return the matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findByQuestionId(long questionId)
		throws SystemException {
		return findByQuestionId(questionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the polls choices where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param questionId the question id to search with
	 * @param start the lower bound of the range of polls choices to return
	 * @param end the upper bound of the range of polls choices to return (not inclusive)
	 * @return the range of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findByQuestionId(long questionId, int start,
		int end) throws SystemException {
		return findByQuestionId(questionId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the polls choices where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param questionId the question id to search with
	 * @param start the lower bound of the range of polls choices to return
	 * @param end the upper bound of the range of polls choices to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findByQuestionId(long questionId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				questionId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PollsChoice> list = (List<PollsChoice>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_QUESTIONID,
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

			query.append(_SQL_SELECT_POLLSCHOICE_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(PollsChoiceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				list = (List<PollsChoice>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_QUESTIONID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_QUESTIONID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first polls choice in the ordered set where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param questionId the question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByQuestionId_First(long questionId,
		OrderByComparator orderByComparator)
		throws NoSuchPollsChoiceException, SystemException {
		List<PollsChoice> list = findByQuestionId(questionId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("questionId=");
			msg.append(questionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPollsChoiceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last polls choice in the ordered set where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param questionId the question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByQuestionId_Last(long questionId,
		OrderByComparator orderByComparator)
		throws NoSuchPollsChoiceException, SystemException {
		int count = countByQuestionId(questionId);

		List<PollsChoice> list = findByQuestionId(questionId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("questionId=");
			msg.append(questionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPollsChoiceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the polls choices before and after the current polls choice in the ordered set where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param choiceId the primary key of the current polls choice
	 * @param questionId the question id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a polls choice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice[] findByQuestionId_PrevAndNext(long choiceId,
		long questionId, OrderByComparator orderByComparator)
		throws NoSuchPollsChoiceException, SystemException {
		PollsChoice pollsChoice = findByPrimaryKey(choiceId);

		Session session = null;

		try {
			session = openSession();

			PollsChoice[] array = new PollsChoiceImpl[3];

			array[0] = getByQuestionId_PrevAndNext(session, pollsChoice,
					questionId, orderByComparator, true);

			array[1] = pollsChoice;

			array[2] = getByQuestionId_PrevAndNext(session, pollsChoice,
					questionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PollsChoice getByQuestionId_PrevAndNext(Session session,
		PollsChoice pollsChoice, long questionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_POLLSCHOICE_WHERE);

		query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

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
			query.append(PollsChoiceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(pollsChoice);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PollsChoice> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the polls choice where questionId = &#63; and name = &#63; or throws a {@link com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException} if it could not be found.
	 *
	 * @param questionId the question id to search with
	 * @param name the name to search with
	 * @return the matching polls choice
	 * @throws com.vportal.portlet.pollsadmin.NoSuchPollsChoiceException if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice findByQ_N(long questionId, String name)
		throws NoSuchPollsChoiceException, SystemException {
		PollsChoice pollsChoice = fetchByQ_N(questionId, name);

		if (pollsChoice == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("questionId=");
			msg.append(questionId);

			msg.append(", name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPollsChoiceException(msg.toString());
		}

		return pollsChoice;
	}

	/**
	 * Finds the polls choice where questionId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param questionId the question id to search with
	 * @param name the name to search with
	 * @return the matching polls choice, or <code>null</code> if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice fetchByQ_N(long questionId, String name)
		throws SystemException {
		return fetchByQ_N(questionId, name, true);
	}

	/**
	 * Finds the polls choice where questionId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param questionId the question id to search with
	 * @param name the name to search with
	 * @return the matching polls choice, or <code>null</code> if a matching polls choice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PollsChoice fetchByQ_N(long questionId, String name,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { questionId, name };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_Q_N,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_POLLSCHOICE_WHERE);

			query.append(_FINDER_COLUMN_Q_N_QUESTIONID_2);

			if (name == null) {
				query.append(_FINDER_COLUMN_Q_N_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_Q_N_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_Q_N_NAME_2);
				}
			}

			query.append(PollsChoiceModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				if (name != null) {
					qPos.add(name);
				}

				List<PollsChoice> list = q.list();

				result = list;

				PollsChoice pollsChoice = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Q_N,
						finderArgs, list);
				}
				else {
					pollsChoice = list.get(0);

					cacheResult(pollsChoice);

					if ((pollsChoice.getQuestionId() != questionId) ||
							(pollsChoice.getName() == null) ||
							!pollsChoice.getName().equals(name)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_Q_N,
							finderArgs, pollsChoice);
					}
				}

				return pollsChoice;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_Q_N,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (PollsChoice)result;
			}
		}
	}

	/**
	 * Finds all the polls choices.
	 *
	 * @return the polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the polls choices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls choices to return
	 * @param end the upper bound of the range of polls choices to return (not inclusive)
	 * @return the range of polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the polls choices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of polls choices to return
	 * @param end the upper bound of the range of polls choices to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public List<PollsChoice> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PollsChoice> list = (List<PollsChoice>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POLLSCHOICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POLLSCHOICE.concat(PollsChoiceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<PollsChoice>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<PollsChoice>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the polls choices where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUuid(String uuid) throws SystemException {
		for (PollsChoice pollsChoice : findByUuid(uuid)) {
			remove(pollsChoice);
		}
	}

	/**
	 * Removes all the polls choices where questionId = &#63; from the database.
	 *
	 * @param questionId the question id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByQuestionId(long questionId) throws SystemException {
		for (PollsChoice pollsChoice : findByQuestionId(questionId)) {
			remove(pollsChoice);
		}
	}

	/**
	 * Removes the polls choice where questionId = &#63; and name = &#63; from the database.
	 *
	 * @param questionId the question id to search with
	 * @param name the name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByQ_N(long questionId, String name)
		throws NoSuchPollsChoiceException, SystemException {
		PollsChoice pollsChoice = findByQ_N(questionId, name);

		remove(pollsChoice);
	}

	/**
	 * Removes all the polls choices from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (PollsChoice pollsChoice : findAll()) {
			remove(pollsChoice);
		}
	}

	/**
	 * Counts all the polls choices where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the number of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUuid(String uuid) throws SystemException {
		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_POLLSCHOICE_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the polls choices where questionId = &#63;.
	 *
	 * @param questionId the question id to search with
	 * @return the number of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public int countByQuestionId(long questionId) throws SystemException {
		Object[] finderArgs = new Object[] { questionId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_QUESTIONID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_POLLSCHOICE_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_QUESTIONID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the polls choices where questionId = &#63; and name = &#63;.
	 *
	 * @param questionId the question id to search with
	 * @param name the name to search with
	 * @return the number of matching polls choices
	 * @throws SystemException if a system exception occurred
	 */
	public int countByQ_N(long questionId, String name)
		throws SystemException {
		Object[] finderArgs = new Object[] { questionId, name };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_Q_N,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_POLLSCHOICE_WHERE);

			query.append(_FINDER_COLUMN_Q_N_QUESTIONID_2);

			if (name == null) {
				query.append(_FINDER_COLUMN_Q_N_NAME_1);
			}
			else {
				if (name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_Q_N_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_Q_N_NAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				if (name != null) {
					qPos.add(name);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_Q_N, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the polls choices.
	 *
	 * @return the number of polls choices
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

				Query q = session.createQuery(_SQL_COUNT_POLLSCHOICE);

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
	 * Initializes the polls choice persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.pollsadmin.model.PollsChoice")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PollsChoice>> listenersList = new ArrayList<ModelListener<PollsChoice>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PollsChoice>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PollsChoiceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = PollsChoicePersistence.class)
	protected PollsChoicePersistence pollsChoicePersistence;
	@BeanReference(type = PollsQuestionPersistence.class)
	protected PollsQuestionPersistence pollsQuestionPersistence;
	@BeanReference(type = PollsVotePersistence.class)
	protected PollsVotePersistence pollsVotePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_POLLSCHOICE = "SELECT pollsChoice FROM PollsChoice pollsChoice";
	private static final String _SQL_SELECT_POLLSCHOICE_WHERE = "SELECT pollsChoice FROM PollsChoice pollsChoice WHERE ";
	private static final String _SQL_COUNT_POLLSCHOICE = "SELECT COUNT(pollsChoice) FROM PollsChoice pollsChoice";
	private static final String _SQL_COUNT_POLLSCHOICE_WHERE = "SELECT COUNT(pollsChoice) FROM PollsChoice pollsChoice WHERE ";
	private static final String _FINDER_COLUMN_UUID_UUID_1 = "pollsChoice.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "pollsChoice.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(pollsChoice.uuid IS NULL OR pollsChoice.uuid = ?)";
	private static final String _FINDER_COLUMN_QUESTIONID_QUESTIONID_2 = "pollsChoice.questionId = ?";
	private static final String _FINDER_COLUMN_Q_N_QUESTIONID_2 = "pollsChoice.questionId = ? AND ";
	private static final String _FINDER_COLUMN_Q_N_NAME_1 = "pollsChoice.name IS NULL";
	private static final String _FINDER_COLUMN_Q_N_NAME_2 = "pollsChoice.name = ?";
	private static final String _FINDER_COLUMN_Q_N_NAME_3 = "(pollsChoice.name IS NULL OR pollsChoice.name = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pollsChoice.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PollsChoice exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PollsChoice exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(PollsChoicePersistenceImpl.class);
}