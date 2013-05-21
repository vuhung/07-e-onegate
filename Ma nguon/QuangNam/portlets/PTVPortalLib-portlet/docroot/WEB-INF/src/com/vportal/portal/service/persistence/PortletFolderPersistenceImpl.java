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

package com.vportal.portal.service.persistence;

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
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portal.NoSuchPortletFolderException;
import com.vportal.portal.model.PortletFolder;
import com.vportal.portal.model.impl.PortletFolderImpl;
import com.vportal.portal.model.impl.PortletFolderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the portlet folder service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link PortletFolderUtil} to access the portlet folder persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see PortletFolderPersistence
 * @see PortletFolderUtil
 * @generated
 */
public class PortletFolderPersistenceImpl extends BasePersistenceImpl<PortletFolder>
	implements PortletFolderPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = PortletFolderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_PORTLETID = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByPortletId",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTLETID = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByPortletId",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_FOLDERID = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByFolderId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_FOLDERID = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByFolderId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_P_F = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByP_F",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_P_F = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_F",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the portlet folder in the entity cache if it is enabled.
	 *
	 * @param portletFolder the portlet folder to cache
	 */
	public void cacheResult(PortletFolder portletFolder) {
		EntityCacheUtil.putResult(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderImpl.class, portletFolder.getPrimaryKey(),
			portletFolder);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_F,
			new Object[] {
				portletFolder.getPortletId(),
				new Long(portletFolder.getFolderId())
			}, portletFolder);
	}

	/**
	 * Caches the portlet folders in the entity cache if it is enabled.
	 *
	 * @param portletFolders the portlet folders to cache
	 */
	public void cacheResult(List<PortletFolder> portletFolders) {
		for (PortletFolder portletFolder : portletFolders) {
			if (EntityCacheUtil.getResult(
						PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
						PortletFolderImpl.class, portletFolder.getPrimaryKey(),
						this) == null) {
				cacheResult(portletFolder);
			}
		}
	}

	/**
	 * Clears the cache for all portlet folders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(PortletFolderImpl.class.getName());
		EntityCacheUtil.clearCache(PortletFolderImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the portlet folder.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(PortletFolder portletFolder) {
		EntityCacheUtil.removeResult(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderImpl.class, portletFolder.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_F,
			new Object[] {
				portletFolder.getPortletId(),
				new Long(portletFolder.getFolderId())
			});
	}

	/**
	 * Creates a new portlet folder with the primary key. Does not add the portlet folder to the database.
	 *
	 * @param id the primary key for the new portlet folder
	 * @return the new portlet folder
	 */
	public PortletFolder create(long id) {
		PortletFolder portletFolder = new PortletFolderImpl();

		portletFolder.setNew(true);
		portletFolder.setPrimaryKey(id);

		return portletFolder;
	}

	/**
	 * Removes the portlet folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the portlet folder to remove
	 * @return the portlet folder that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the portlet folder with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the portlet folder to remove
	 * @return the portlet folder that was removed
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder remove(long id)
		throws NoSuchPortletFolderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PortletFolder portletFolder = (PortletFolder)session.get(PortletFolderImpl.class,
					new Long(id));

			if (portletFolder == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchPortletFolderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(portletFolder);
		}
		catch (NoSuchPortletFolderException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PortletFolder removeImpl(PortletFolder portletFolder)
		throws SystemException {
		portletFolder = toUnwrappedModel(portletFolder);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, portletFolder);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		PortletFolderModelImpl portletFolderModelImpl = (PortletFolderModelImpl)portletFolder;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_F,
			new Object[] {
				portletFolderModelImpl.getPortletId(),
				new Long(portletFolderModelImpl.getFolderId())
			});

		EntityCacheUtil.removeResult(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderImpl.class, portletFolder.getPrimaryKey());

		return portletFolder;
	}

	public PortletFolder updateImpl(
		com.vportal.portal.model.PortletFolder portletFolder, boolean merge)
		throws SystemException {
		portletFolder = toUnwrappedModel(portletFolder);

		boolean isNew = portletFolder.isNew();

		PortletFolderModelImpl portletFolderModelImpl = (PortletFolderModelImpl)portletFolder;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, portletFolder, merge);

			portletFolder.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
			PortletFolderImpl.class, portletFolder.getPrimaryKey(),
			portletFolder);

		if (!isNew &&
				(!Validator.equals(portletFolder.getPortletId(),
					portletFolderModelImpl.getOriginalPortletId()) ||
				(portletFolder.getFolderId() != portletFolderModelImpl.getOriginalFolderId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_F,
				new Object[] {
					portletFolderModelImpl.getOriginalPortletId(),
					new Long(portletFolderModelImpl.getOriginalFolderId())
				});
		}

		if (isNew ||
				(!Validator.equals(portletFolder.getPortletId(),
					portletFolderModelImpl.getOriginalPortletId()) ||
				(portletFolder.getFolderId() != portletFolderModelImpl.getOriginalFolderId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_F,
				new Object[] {
					portletFolder.getPortletId(),
					new Long(portletFolder.getFolderId())
				}, portletFolder);
		}

		return portletFolder;
	}

	protected PortletFolder toUnwrappedModel(PortletFolder portletFolder) {
		if (portletFolder instanceof PortletFolderImpl) {
			return portletFolder;
		}

		PortletFolderImpl portletFolderImpl = new PortletFolderImpl();

		portletFolderImpl.setNew(portletFolder.isNew());
		portletFolderImpl.setPrimaryKey(portletFolder.getPrimaryKey());

		portletFolderImpl.setId(portletFolder.getId());
		portletFolderImpl.setPortletId(portletFolder.getPortletId());
		portletFolderImpl.setFolderId(portletFolder.getFolderId());
		portletFolderImpl.setDescription(portletFolder.getDescription());

		return portletFolderImpl;
	}

	/**
	 * Finds the portlet folder with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the portlet folder to find
	 * @return the portlet folder
	 * @throws com.liferay.portal.NoSuchModelException if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the portlet folder with the primary key or throws a {@link com.vportal.portal.NoSuchPortletFolderException} if it could not be found.
	 *
	 * @param id the primary key of the portlet folder to find
	 * @return the portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByPrimaryKey(long id)
		throws NoSuchPortletFolderException, SystemException {
		PortletFolder portletFolder = fetchByPrimaryKey(id);

		if (portletFolder == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchPortletFolderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return portletFolder;
	}

	/**
	 * Finds the portlet folder with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the portlet folder to find
	 * @return the portlet folder, or <code>null</code> if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the portlet folder with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the portlet folder to find
	 * @return the portlet folder, or <code>null</code> if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder fetchByPrimaryKey(long id) throws SystemException {
		PortletFolder portletFolder = (PortletFolder)EntityCacheUtil.getResult(PortletFolderModelImpl.ENTITY_CACHE_ENABLED,
				PortletFolderImpl.class, id, this);

		if (portletFolder == null) {
			Session session = null;

			try {
				session = openSession();

				portletFolder = (PortletFolder)session.get(PortletFolderImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (portletFolder != null) {
					cacheResult(portletFolder);
				}

				closeSession(session);
			}
		}

		return portletFolder;
	}

	/**
	 * Finds all the portlet folders where portletId = &#63;.
	 *
	 * @param portletId the portlet id to search with
	 * @return the matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findByPortletId(String portletId)
		throws SystemException {
		return findByPortletId(portletId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the portlet folders where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param start the lower bound of the range of portlet folders to return
	 * @param end the upper bound of the range of portlet folders to return (not inclusive)
	 * @return the range of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findByPortletId(String portletId, int start,
		int end) throws SystemException {
		return findByPortletId(portletId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the portlet folders where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param start the lower bound of the range of portlet folders to return
	 * @param end the upper bound of the range of portlet folders to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findByPortletId(String portletId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				portletId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PortletFolder> list = (List<PortletFolder>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PORTLETID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_PORTLETFOLDER_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

				list = (List<PortletFolder>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PORTLETID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PORTLETID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first portlet folder in the ordered set where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByPortletId_First(String portletId,
		OrderByComparator orderByComparator)
		throws NoSuchPortletFolderException, SystemException {
		List<PortletFolder> list = findByPortletId(portletId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portletId=");
			msg.append(portletId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPortletFolderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last portlet folder in the ordered set where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByPortletId_Last(String portletId,
		OrderByComparator orderByComparator)
		throws NoSuchPortletFolderException, SystemException {
		int count = countByPortletId(portletId);

		List<PortletFolder> list = findByPortletId(portletId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portletId=");
			msg.append(portletId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPortletFolderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the portlet folders before and after the current portlet folder in the ordered set where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current portlet folder
	 * @param portletId the portlet id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder[] findByPortletId_PrevAndNext(long id,
		String portletId, OrderByComparator orderByComparator)
		throws NoSuchPortletFolderException, SystemException {
		PortletFolder portletFolder = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PortletFolder[] array = new PortletFolderImpl[3];

			array[0] = getByPortletId_PrevAndNext(session, portletFolder,
					portletId, orderByComparator, true);

			array[1] = portletFolder;

			array[2] = getByPortletId_PrevAndNext(session, portletFolder,
					portletId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PortletFolder getByPortletId_PrevAndNext(Session session,
		PortletFolder portletFolder, String portletId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTLETFOLDER_WHERE);

		if (portletId == null) {
			query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_1);
		}
		else {
			if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_2);
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

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portletId != null) {
			qPos.add(portletId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(portletFolder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PortletFolder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the portlet folders where folderId = &#63;.
	 *
	 * @param folderId the folder id to search with
	 * @return the matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findByFolderId(long folderId)
		throws SystemException {
		return findByFolderId(folderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the portlet folders where folderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param folderId the folder id to search with
	 * @param start the lower bound of the range of portlet folders to return
	 * @param end the upper bound of the range of portlet folders to return (not inclusive)
	 * @return the range of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findByFolderId(long folderId, int start, int end)
		throws SystemException {
		return findByFolderId(folderId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the portlet folders where folderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param folderId the folder id to search with
	 * @param start the lower bound of the range of portlet folders to return
	 * @param end the upper bound of the range of portlet folders to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findByFolderId(long folderId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				folderId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PortletFolder> list = (List<PortletFolder>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_FOLDERID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_PORTLETFOLDER_WHERE);

			query.append(_FINDER_COLUMN_FOLDERID_FOLDERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(folderId);

				list = (List<PortletFolder>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_FOLDERID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_FOLDERID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first portlet folder in the ordered set where folderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param folderId the folder id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByFolderId_First(long folderId,
		OrderByComparator orderByComparator)
		throws NoSuchPortletFolderException, SystemException {
		List<PortletFolder> list = findByFolderId(folderId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("folderId=");
			msg.append(folderId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPortletFolderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last portlet folder in the ordered set where folderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param folderId the folder id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByFolderId_Last(long folderId,
		OrderByComparator orderByComparator)
		throws NoSuchPortletFolderException, SystemException {
		int count = countByFolderId(folderId);

		List<PortletFolder> list = findByFolderId(folderId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("folderId=");
			msg.append(folderId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchPortletFolderException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the portlet folders before and after the current portlet folder in the ordered set where folderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current portlet folder
	 * @param folderId the folder id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder[] findByFolderId_PrevAndNext(long id, long folderId,
		OrderByComparator orderByComparator)
		throws NoSuchPortletFolderException, SystemException {
		PortletFolder portletFolder = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PortletFolder[] array = new PortletFolderImpl[3];

			array[0] = getByFolderId_PrevAndNext(session, portletFolder,
					folderId, orderByComparator, true);

			array[1] = portletFolder;

			array[2] = getByFolderId_PrevAndNext(session, portletFolder,
					folderId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PortletFolder getByFolderId_PrevAndNext(Session session,
		PortletFolder portletFolder, long folderId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTLETFOLDER_WHERE);

		query.append(_FINDER_COLUMN_FOLDERID_FOLDERID_2);

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

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(folderId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(portletFolder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PortletFolder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the portlet folder where portletId = &#63; and folderId = &#63; or throws a {@link com.vportal.portal.NoSuchPortletFolderException} if it could not be found.
	 *
	 * @param portletId the portlet id to search with
	 * @param folderId the folder id to search with
	 * @return the matching portlet folder
	 * @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder findByP_F(String portletId, long folderId)
		throws NoSuchPortletFolderException, SystemException {
		PortletFolder portletFolder = fetchByP_F(portletId, folderId);

		if (portletFolder == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portletId=");
			msg.append(portletId);

			msg.append(", folderId=");
			msg.append(folderId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPortletFolderException(msg.toString());
		}

		return portletFolder;
	}

	/**
	 * Finds the portlet folder where portletId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portletId the portlet id to search with
	 * @param folderId the folder id to search with
	 * @return the matching portlet folder, or <code>null</code> if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder fetchByP_F(String portletId, long folderId)
		throws SystemException {
		return fetchByP_F(portletId, folderId, true);
	}

	/**
	 * Finds the portlet folder where portletId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portletId the portlet id to search with
	 * @param folderId the folder id to search with
	 * @return the matching portlet folder, or <code>null</code> if a matching portlet folder could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PortletFolder fetchByP_F(String portletId, long folderId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { portletId, folderId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_P_F,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PORTLETFOLDER_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_P_F_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_F_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_F_PORTLETID_2);
				}
			}

			query.append(_FINDER_COLUMN_P_F_FOLDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

				qPos.add(folderId);

				List<PortletFolder> list = q.list();

				result = list;

				PortletFolder portletFolder = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_F,
						finderArgs, list);
				}
				else {
					portletFolder = list.get(0);

					cacheResult(portletFolder);

					if ((portletFolder.getPortletId() == null) ||
							!portletFolder.getPortletId().equals(portletId) ||
							(portletFolder.getFolderId() != folderId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_F,
							finderArgs, portletFolder);
					}
				}

				return portletFolder;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_F,
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
				return (PortletFolder)result;
			}
		}
	}

	/**
	 * Finds all the portlet folders.
	 *
	 * @return the portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the portlet folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlet folders to return
	 * @param end the upper bound of the range of portlet folders to return (not inclusive)
	 * @return the range of portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the portlet folders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlet folders to return
	 * @param end the upper bound of the range of portlet folders to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public List<PortletFolder> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PortletFolder> list = (List<PortletFolder>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PORTLETFOLDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PORTLETFOLDER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<PortletFolder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<PortletFolder>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the portlet folders where portletId = &#63; from the database.
	 *
	 * @param portletId the portlet id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortletId(String portletId) throws SystemException {
		for (PortletFolder portletFolder : findByPortletId(portletId)) {
			remove(portletFolder);
		}
	}

	/**
	 * Removes all the portlet folders where folderId = &#63; from the database.
	 *
	 * @param folderId the folder id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFolderId(long folderId) throws SystemException {
		for (PortletFolder portletFolder : findByFolderId(folderId)) {
			remove(portletFolder);
		}
	}

	/**
	 * Removes the portlet folder where portletId = &#63; and folderId = &#63; from the database.
	 *
	 * @param portletId the portlet id to search with
	 * @param folderId the folder id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_F(String portletId, long folderId)
		throws NoSuchPortletFolderException, SystemException {
		PortletFolder portletFolder = findByP_F(portletId, folderId);

		remove(portletFolder);
	}

	/**
	 * Removes all the portlet folders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (PortletFolder portletFolder : findAll()) {
			remove(portletFolder);
		}
	}

	/**
	 * Counts all the portlet folders where portletId = &#63;.
	 *
	 * @param portletId the portlet id to search with
	 * @return the number of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortletId(String portletId) throws SystemException {
		Object[] finderArgs = new Object[] { portletId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTLETID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORTLETFOLDER_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTLETID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the portlet folders where folderId = &#63;.
	 *
	 * @param folderId the folder id to search with
	 * @return the number of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFolderId(long folderId) throws SystemException {
		Object[] finderArgs = new Object[] { folderId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FOLDERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORTLETFOLDER_WHERE);

			query.append(_FINDER_COLUMN_FOLDERID_FOLDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(folderId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FOLDERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the portlet folders where portletId = &#63; and folderId = &#63;.
	 *
	 * @param portletId the portlet id to search with
	 * @param folderId the folder id to search with
	 * @return the number of matching portlet folders
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_F(String portletId, long folderId)
		throws SystemException {
		Object[] finderArgs = new Object[] { portletId, folderId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_F,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PORTLETFOLDER_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_P_F_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_F_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_F_PORTLETID_2);
				}
			}

			query.append(_FINDER_COLUMN_P_F_FOLDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

				qPos.add(folderId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_F, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the portlet folders.
	 *
	 * @return the number of portlet folders
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

				Query q = session.createQuery(_SQL_COUNT_PORTLETFOLDER);

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
	 * Initializes the portlet folder persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portal.model.PortletFolder")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PortletFolder>> listenersList = new ArrayList<ModelListener<PortletFolder>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PortletFolder>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PortletFolderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = AttachmentPersistence.class)
	protected AttachmentPersistence attachmentPersistence;
	@BeanReference(type = AccessCounterPersistence.class)
	protected AccessCounterPersistence accessCounterPersistence;
	@BeanReference(type = PortletFolderPersistence.class)
	protected PortletFolderPersistence portletFolderPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_PORTLETFOLDER = "SELECT portletFolder FROM PortletFolder portletFolder";
	private static final String _SQL_SELECT_PORTLETFOLDER_WHERE = "SELECT portletFolder FROM PortletFolder portletFolder WHERE ";
	private static final String _SQL_COUNT_PORTLETFOLDER = "SELECT COUNT(portletFolder) FROM PortletFolder portletFolder";
	private static final String _SQL_COUNT_PORTLETFOLDER_WHERE = "SELECT COUNT(portletFolder) FROM PortletFolder portletFolder WHERE ";
	private static final String _FINDER_COLUMN_PORTLETID_PORTLETID_1 = "portletFolder.portletId IS NULL";
	private static final String _FINDER_COLUMN_PORTLETID_PORTLETID_2 = "portletFolder.portletId = ?";
	private static final String _FINDER_COLUMN_PORTLETID_PORTLETID_3 = "(portletFolder.portletId IS NULL OR portletFolder.portletId = ?)";
	private static final String _FINDER_COLUMN_FOLDERID_FOLDERID_2 = "portletFolder.folderId = ?";
	private static final String _FINDER_COLUMN_P_F_PORTLETID_1 = "portletFolder.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_P_F_PORTLETID_2 = "portletFolder.portletId = ? AND ";
	private static final String _FINDER_COLUMN_P_F_PORTLETID_3 = "(portletFolder.portletId IS NULL OR portletFolder.portletId = ?) AND ";
	private static final String _FINDER_COLUMN_P_F_FOLDERID_2 = "portletFolder.folderId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "portletFolder.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PortletFolder exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PortletFolder exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(PortletFolderPersistenceImpl.class);
}