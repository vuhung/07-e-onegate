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

package com.vsi.edirectory.portlet.service.persistence;

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

import com.vsi.edirectory.portlet.NoSuchEDEmployeeException;
import com.vsi.edirectory.portlet.model.EDEmployee;
import com.vsi.edirectory.portlet.model.impl.EDEmployeeImpl;
import com.vsi.edirectory.portlet.model.impl.EDEmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the e d employee service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link EDEmployeeUtil} to access the e d employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see EDEmployeePersistence
 * @see EDEmployeeUtil
 * @generated
 */
public class EDEmployeePersistenceImpl extends BasePersistenceImpl<EDEmployee>
	implements EDEmployeePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = EDEmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_UUID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUuid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_DEPARTMENT_ID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByDepartment_Id",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENT_ID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDepartment_Id",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DEPARTMENTID_STATUS = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDepartmentId_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENTID_STATUS = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDepartmentId_Status",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DEPARTMENTID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDepartmentId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENTID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDepartmentId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ISSHOWED = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByIsShowed",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSHOWED = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByIsShowed", new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_I = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_I",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_I = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_I",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_E_G = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByE_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_E_G = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByE_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DEPARTMENTID_GROUPID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDepartmentId_GroupId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENTID_GROUPID = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDepartmentId_GroupId",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the e d employee in the entity cache if it is enabled.
	 *
	 * @param edEmployee the e d employee to cache
	 */
	public void cacheResult(EDEmployee edEmployee) {
		EntityCacheUtil.putResult(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeImpl.class, edEmployee.getPrimaryKey(), edEmployee);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { edEmployee.getUuid(), new Long(
					edEmployee.getGroupId()) }, edEmployee);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
			new Object[] {
				new Long(edEmployee.getDepartmentId()),
				new Long(edEmployee.getId())
			}, edEmployee);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_G,
			new Object[] {
				new Long(edEmployee.getId()), new Long(edEmployee.getGroupId())
			}, edEmployee);
	}

	/**
	 * Caches the e d employees in the entity cache if it is enabled.
	 *
	 * @param edEmployees the e d employees to cache
	 */
	public void cacheResult(List<EDEmployee> edEmployees) {
		for (EDEmployee edEmployee : edEmployees) {
			if (EntityCacheUtil.getResult(
						EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EDEmployeeImpl.class, edEmployee.getPrimaryKey(), this) == null) {
				cacheResult(edEmployee);
			}
		}
	}

	/**
	 * Clears the cache for all e d employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(EDEmployeeImpl.class.getName());
		EntityCacheUtil.clearCache(EDEmployeeImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the e d employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(EDEmployee edEmployee) {
		EntityCacheUtil.removeResult(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeImpl.class, edEmployee.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { edEmployee.getUuid(), new Long(
					edEmployee.getGroupId()) });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
			new Object[] {
				new Long(edEmployee.getDepartmentId()),
				new Long(edEmployee.getId())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_G,
			new Object[] {
				new Long(edEmployee.getId()), new Long(edEmployee.getGroupId())
			});
	}

	/**
	 * Creates a new e d employee with the primary key. Does not add the e d employee to the database.
	 *
	 * @param id the primary key for the new e d employee
	 * @return the new e d employee
	 */
	public EDEmployee create(long id) {
		EDEmployee edEmployee = new EDEmployeeImpl();

		edEmployee.setNew(true);
		edEmployee.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		edEmployee.setUuid(uuid);

		return edEmployee;
	}

	/**
	 * Removes the e d employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the e d employee to remove
	 * @return the e d employee that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the e d employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the e d employee to remove
	 * @return the e d employee that was removed
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee remove(long id)
		throws NoSuchEDEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EDEmployee edEmployee = (EDEmployee)session.get(EDEmployeeImpl.class,
					new Long(id));

			if (edEmployee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchEDEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(edEmployee);
		}
		catch (NoSuchEDEmployeeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDEmployee removeImpl(EDEmployee edEmployee)
		throws SystemException {
		edEmployee = toUnwrappedModel(edEmployee);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, edEmployee);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EDEmployeeModelImpl edEmployeeModelImpl = (EDEmployeeModelImpl)edEmployee;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				edEmployeeModelImpl.getUuid(),
				new Long(edEmployeeModelImpl.getGroupId())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
			new Object[] {
				new Long(edEmployeeModelImpl.getDepartmentId()),
				new Long(edEmployeeModelImpl.getId())
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_G,
			new Object[] {
				new Long(edEmployeeModelImpl.getId()),
				new Long(edEmployeeModelImpl.getGroupId())
			});

		EntityCacheUtil.removeResult(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeImpl.class, edEmployee.getPrimaryKey());

		return edEmployee;
	}

	public EDEmployee updateImpl(
		com.vsi.edirectory.portlet.model.EDEmployee edEmployee, boolean merge)
		throws SystemException {
		edEmployee = toUnwrappedModel(edEmployee);

		boolean isNew = edEmployee.isNew();

		EDEmployeeModelImpl edEmployeeModelImpl = (EDEmployeeModelImpl)edEmployee;

		if (Validator.isNull(edEmployee.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			edEmployee.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, edEmployee, merge);

			edEmployee.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EDEmployeeImpl.class, edEmployee.getPrimaryKey(), edEmployee);

		if (!isNew &&
				(!Validator.equals(edEmployee.getUuid(),
					edEmployeeModelImpl.getOriginalUuid()) ||
				(edEmployee.getGroupId() != edEmployeeModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
				new Object[] {
					edEmployeeModelImpl.getOriginalUuid(),
					new Long(edEmployeeModelImpl.getOriginalGroupId())
				});
		}

		if (isNew ||
				(!Validator.equals(edEmployee.getUuid(),
					edEmployeeModelImpl.getOriginalUuid()) ||
				(edEmployee.getGroupId() != edEmployeeModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
				new Object[] {
					edEmployee.getUuid(), new Long(edEmployee.getGroupId())
				}, edEmployee);
		}

		if (!isNew &&
				((edEmployee.getDepartmentId() != edEmployeeModelImpl.getOriginalDepartmentId()) ||
				(edEmployee.getId() != edEmployeeModelImpl.getOriginalId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
				new Object[] {
					new Long(edEmployeeModelImpl.getOriginalDepartmentId()),
					new Long(edEmployeeModelImpl.getOriginalId())
				});
		}

		if (isNew ||
				((edEmployee.getDepartmentId() != edEmployeeModelImpl.getOriginalDepartmentId()) ||
				(edEmployee.getId() != edEmployeeModelImpl.getOriginalId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
				new Object[] {
					new Long(edEmployee.getDepartmentId()),
					new Long(edEmployee.getId())
				}, edEmployee);
		}

		if (!isNew &&
				((edEmployee.getId() != edEmployeeModelImpl.getOriginalId()) ||
				(edEmployee.getGroupId() != edEmployeeModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_G,
				new Object[] {
					new Long(edEmployeeModelImpl.getOriginalId()),
					new Long(edEmployeeModelImpl.getOriginalGroupId())
				});
		}

		if (isNew ||
				((edEmployee.getId() != edEmployeeModelImpl.getOriginalId()) ||
				(edEmployee.getGroupId() != edEmployeeModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_G,
				new Object[] {
					new Long(edEmployee.getId()),
					new Long(edEmployee.getGroupId())
				}, edEmployee);
		}

		return edEmployee;
	}

	protected EDEmployee toUnwrappedModel(EDEmployee edEmployee) {
		if (edEmployee instanceof EDEmployeeImpl) {
			return edEmployee;
		}

		EDEmployeeImpl edEmployeeImpl = new EDEmployeeImpl();

		edEmployeeImpl.setNew(edEmployee.isNew());
		edEmployeeImpl.setPrimaryKey(edEmployee.getPrimaryKey());

		edEmployeeImpl.setUuid(edEmployee.getUuid());
		edEmployeeImpl.setId(edEmployee.getId());
		edEmployeeImpl.setCreatedDate(edEmployee.getCreatedDate());
		edEmployeeImpl.setModifiedDate(edEmployee.getModifiedDate());
		edEmployeeImpl.setTitle(edEmployee.getTitle());
		edEmployeeImpl.setName(edEmployee.getName());
		edEmployeeImpl.setBirthday(edEmployee.getBirthday());
		edEmployeeImpl.setHomeSide(edEmployee.getHomeSide());
		edEmployeeImpl.setFamily(edEmployee.getFamily());
		edEmployeeImpl.setRace(edEmployee.getRace());
		edEmployeeImpl.setHome(edEmployee.getHome());
		edEmployeeImpl.setHomePhone(edEmployee.getHomePhone());
		edEmployeeImpl.setWorkPhone(edEmployee.getWorkPhone());
		edEmployeeImpl.setMobilePhone(edEmployee.getMobilePhone());
		edEmployeeImpl.setEmail(edEmployee.getEmail());
		edEmployeeImpl.setDepartmentId(edEmployee.getDepartmentId());
		edEmployeeImpl.setMajorLevel(edEmployee.getMajorLevel());
		edEmployeeImpl.setPhilosophism(edEmployee.getPhilosophism());
		edEmployeeImpl.setForeignLanguage(edEmployee.getForeignLanguage());
		edEmployeeImpl.setJoinDate(edEmployee.getJoinDate());
		edEmployeeImpl.setImage(edEmployee.getImage());
		edEmployeeImpl.setIsShowTree(edEmployee.isIsShowTree());
		edEmployeeImpl.setOtherInfo(edEmployee.getOtherInfo());
		edEmployeeImpl.setCompanyId(edEmployee.getCompanyId());
		edEmployeeImpl.setGroupId(edEmployee.getGroupId());
		edEmployeeImpl.setUserId(edEmployee.getUserId());
		edEmployeeImpl.setLanguageId(edEmployee.getLanguageId());
		edEmployeeImpl.setDisplayOrder(edEmployee.getDisplayOrder());
		edEmployeeImpl.setSex(edEmployee.getSex());
		edEmployeeImpl.setStatus(edEmployee.getStatus());
		edEmployeeImpl.setShow(edEmployee.getShow());

		return edEmployeeImpl;
	}

	/**
	 * Finds the e d employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the e d employee to find
	 * @return the e d employee
	 * @throws com.liferay.portal.NoSuchModelException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the e d employee with the primary key or throws a {@link com.vsi.edirectory.portlet.NoSuchEDEmployeeException} if it could not be found.
	 *
	 * @param id the primary key of the e d employee to find
	 * @return the e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByPrimaryKey(long id)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = fetchByPrimaryKey(id);

		if (edEmployee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchEDEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return edEmployee;
	}

	/**
	 * Finds the e d employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the e d employee to find
	 * @return the e d employee, or <code>null</code> if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the e d employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the e d employee to find
	 * @return the e d employee, or <code>null</code> if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByPrimaryKey(long id) throws SystemException {
		EDEmployee edEmployee = (EDEmployee)EntityCacheUtil.getResult(EDEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EDEmployeeImpl.class, id, this);

		if (edEmployee == null) {
			Session session = null;

			try {
				session = openSession();

				edEmployee = (EDEmployee)session.get(EDEmployeeImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (edEmployee != null) {
					cacheResult(edEmployee);
				}

				closeSession(session);
			}
		}

		return edEmployee;
	}

	/**
	 * Finds all the e d employees where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				uuid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_UUID,
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

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

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
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
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

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first e d employee in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByUuid(uuid);

		List<EDEmployee> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByUuid_PrevAndNext(long id, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByUuid_PrevAndNext(session, edEmployee, uuid,
					orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByUuid_PrevAndNext(session, edEmployee, uuid,
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

	protected EDEmployee getByUuid_PrevAndNext(Session session,
		EDEmployee edEmployee, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the e d employee where uuid = &#63; and groupId = &#63; or throws a {@link com.vsi.edirectory.portlet.NoSuchEDEmployeeException} if it could not be found.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByUUID_G(String uuid, long groupId)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = fetchByUUID_G(uuid, groupId);

		if (edEmployee == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEDEmployeeException(msg.toString());
		}

		return edEmployee;
	}

	/**
	 * Finds the e d employee where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employee, or <code>null</code> if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Finds the e d employee where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employee, or <code>null</code> if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_G_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_G_UUID_2);
				}
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<EDEmployee> list = q.list();

				result = list;

				EDEmployee edEmployee = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					edEmployee = list.get(0);

					cacheResult(edEmployee);

					if ((edEmployee.getUuid() == null) ||
							!edEmployee.getUuid().equals(uuid) ||
							(edEmployee.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, edEmployee);
					}
				}

				return edEmployee;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
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
				return (EDEmployee)result;
			}
		}
	}

	/**
	 * Finds the e d employee where departmentId = &#63; and id = &#63; or throws a {@link com.vsi.edirectory.portlet.NoSuchEDEmployeeException} if it could not be found.
	 *
	 * @param departmentId the department id to search with
	 * @param id the id to search with
	 * @return the matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartment_Id(long departmentId, long id)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = fetchByDepartment_Id(departmentId, id);

		if (edEmployee == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(", id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEDEmployeeException(msg.toString());
		}

		return edEmployee;
	}

	/**
	 * Finds the e d employee where departmentId = &#63; and id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param departmentId the department id to search with
	 * @param id the id to search with
	 * @return the matching e d employee, or <code>null</code> if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByDepartment_Id(long departmentId, long id)
		throws SystemException {
		return fetchByDepartment_Id(departmentId, id, true);
	}

	/**
	 * Finds the e d employee where departmentId = &#63; and id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param departmentId the department id to search with
	 * @param id the id to search with
	 * @return the matching e d employee, or <code>null</code> if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByDepartment_Id(long departmentId, long id,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { departmentId, id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENT_ID_DEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPARTMENT_ID_ID_2);

			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				qPos.add(id);

				List<EDEmployee> list = q.list();

				result = list;

				EDEmployee edEmployee = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
						finderArgs, list);
				}
				else {
					edEmployee = list.get(0);

					cacheResult(edEmployee);

					if ((edEmployee.getDepartmentId() != departmentId) ||
							(edEmployee.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
							finderArgs, edEmployee);
					}
				}

				return edEmployee;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEPARTMENT_ID,
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
				return (EDEmployee)result;
			}
		}
	}

	/**
	 * Finds all the e d employees where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first e d employee in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByGroupId(groupId);

		List<EDEmployee> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByGroupId_PrevAndNext(long id, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, edEmployee, groupId,
					orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByGroupId_PrevAndNext(session, edEmployee, groupId,
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

	protected EDEmployee getByGroupId_PrevAndNext(Session session,
		EDEmployee edEmployee, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d employees where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId_Status(long departmentId,
		long groupId, long status) throws SystemException {
		return findByDepartmentId_Status(departmentId, groupId, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId_Status(long departmentId,
		long groupId, long status, int start, int end)
		throws SystemException {
		return findByDepartmentId_Status(departmentId, groupId, status, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId_Status(long departmentId,
		long groupId, long status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				departmentId, groupId, status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DEPARTMENTID_STATUS,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_DEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				qPos.add(groupId);

				qPos.add(status);

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DEPARTMENTID_STATUS,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DEPARTMENTID_STATUS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d employee in the ordered set where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartmentId_Status_First(long departmentId,
		long groupId, long status, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByDepartmentId_Status(departmentId,
				groupId, status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartmentId_Status_Last(long departmentId,
		long groupId, long status, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByDepartmentId_Status(departmentId, groupId, status);

		List<EDEmployee> list = findByDepartmentId_Status(departmentId,
				groupId, status, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByDepartmentId_Status_PrevAndNext(long id,
		long departmentId, long groupId, long status,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByDepartmentId_Status_PrevAndNext(session,
					edEmployee, departmentId, groupId, status,
					orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByDepartmentId_Status_PrevAndNext(session,
					edEmployee, departmentId, groupId, status,
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

	protected EDEmployee getByDepartmentId_Status_PrevAndNext(Session session,
		EDEmployee edEmployee, long departmentId, long groupId, long status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_DEPARTMENTID_2);

		query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_GROUPID_2);

		query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_STATUS_2);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d employees where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId(long departmentId)
		throws SystemException {
		return findByDepartmentId(departmentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId(long departmentId, int start,
		int end) throws SystemException {
		return findByDepartmentId(departmentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId(long departmentId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				departmentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DEPARTMENTID,
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

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DEPARTMENTID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DEPARTMENTID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d employee in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartmentId_First(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByDepartmentId(departmentId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartmentId_Last(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByDepartmentId(departmentId);

		List<EDEmployee> list = findByDepartmentId(departmentId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByDepartmentId_PrevAndNext(long id,
		long departmentId, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByDepartmentId_PrevAndNext(session, edEmployee,
					departmentId, orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByDepartmentId_PrevAndNext(session, edEmployee,
					departmentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDEmployee getByDepartmentId_PrevAndNext(Session session,
		EDEmployee edEmployee, long departmentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d employees where isShowTree = &#63;.
	 *
	 * @param isShowTree the is show tree to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByIsShowed(boolean isShowTree)
		throws SystemException {
		return findByIsShowed(isShowTree, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the e d employees where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByIsShowed(boolean isShowTree, int start,
		int end) throws SystemException {
		return findByIsShowed(isShowTree, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByIsShowed(boolean isShowTree, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				isShowTree,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ISSHOWED,
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

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isShowTree);

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ISSHOWED,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ISSHOWED,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d employee in the ordered set where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByIsShowed_First(boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByIsShowed(isShowTree, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isShowTree=");
			msg.append(isShowTree);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByIsShowed_Last(boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByIsShowed(isShowTree);

		List<EDEmployee> list = findByIsShowed(isShowTree, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isShowTree=");
			msg.append(isShowTree);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByIsShowed_PrevAndNext(long id, boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByIsShowed_PrevAndNext(session, edEmployee,
					isShowTree, orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByIsShowed_PrevAndNext(session, edEmployee,
					isShowTree, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDEmployee getByIsShowed_PrevAndNext(Session session,
		EDEmployee edEmployee, boolean isShowTree,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isShowTree);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d employees where groupId = &#63; and languageId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByG_L(long groupId, String languageId)
		throws SystemException {
		return findByG_L(groupId, languageId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByG_L(long groupId, String languageId,
		int start, int end) throws SystemException {
		return findByG_L(groupId, languageId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByG_L(long groupId, String languageId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, languageId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
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

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (languageId == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_1);
			}
			else {
				if (languageId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (languageId != null) {
					qPos.add(languageId);
				}

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d employee in the ordered set where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByG_L_First(long groupId, String languageId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByG_L(groupId, languageId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByG_L_Last(long groupId, String languageId,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByG_L(groupId, languageId);

		List<EDEmployee> list = findByG_L(groupId, languageId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByG_L_PrevAndNext(long id, long groupId,
		String languageId, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByG_L_PrevAndNext(session, edEmployee, groupId,
					languageId, orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByG_L_PrevAndNext(session, edEmployee, groupId,
					languageId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDEmployee getByG_L_PrevAndNext(Session session,
		EDEmployee edEmployee, long groupId, String languageId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		if (languageId == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGEID_1);
		}
		else {
			if (languageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_2);
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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (languageId != null) {
			qPos.add(languageId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d employees where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByG_L_I(long groupId, String languageId,
		boolean isShowTree) throws SystemException {
		return findByG_L_I(groupId, languageId, isShowTree, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByG_L_I(long groupId, String languageId,
		boolean isShowTree, int start, int end) throws SystemException {
		return findByG_L_I(groupId, languageId, isShowTree, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByG_L_I(long groupId, String languageId,
		boolean isShowTree, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, languageId, isShowTree,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_I,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_G_L_I_GROUPID_2);

			if (languageId == null) {
				query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_1);
			}
			else {
				if (languageId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_I_ISSHOWTREE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (languageId != null) {
					qPos.add(languageId);
				}

				qPos.add(isShowTree);

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_I,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_I,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d employee in the ordered set where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByG_L_I_First(long groupId, String languageId,
		boolean isShowTree, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByG_L_I(groupId, languageId, isShowTree, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append(", isShowTree=");
			msg.append(isShowTree);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByG_L_I_Last(long groupId, String languageId,
		boolean isShowTree, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByG_L_I(groupId, languageId, isShowTree);

		List<EDEmployee> list = findByG_L_I(groupId, languageId, isShowTree,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append(", isShowTree=");
			msg.append(isShowTree);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByG_L_I_PrevAndNext(long id, long groupId,
		String languageId, boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByG_L_I_PrevAndNext(session, edEmployee, groupId,
					languageId, isShowTree, orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByG_L_I_PrevAndNext(session, edEmployee, groupId,
					languageId, isShowTree, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDEmployee getByG_L_I_PrevAndNext(Session session,
		EDEmployee edEmployee, long groupId, String languageId,
		boolean isShowTree, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_G_L_I_GROUPID_2);

		if (languageId == null) {
			query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_1);
		}
		else {
			if (languageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_I_ISSHOWTREE_2);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (languageId != null) {
			qPos.add(languageId);
		}

		qPos.add(isShowTree);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the e d employee where id = &#63; and groupId = &#63; or throws a {@link com.vsi.edirectory.portlet.NoSuchEDEmployeeException} if it could not be found.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByE_G(long id, long groupId)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = fetchByE_G(id, groupId);

		if (edEmployee == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEDEmployeeException(msg.toString());
		}

		return edEmployee;
	}

	/**
	 * Finds the e d employee where id = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employee, or <code>null</code> if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByE_G(long id, long groupId)
		throws SystemException {
		return fetchByE_G(id, groupId, true);
	}

	/**
	 * Finds the e d employee where id = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employee, or <code>null</code> if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee fetchByE_G(long id, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { id, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_E_G,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_E_G_ID_2);

			query.append(_FINDER_COLUMN_E_G_GROUPID_2);

			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				qPos.add(groupId);

				List<EDEmployee> list = q.list();

				result = list;

				EDEmployee edEmployee = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_G,
						finderArgs, list);
				}
				else {
					edEmployee = list.get(0);

					cacheResult(edEmployee);

					if ((edEmployee.getId() != id) ||
							(edEmployee.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_E_G,
							finderArgs, edEmployee);
					}
				}

				return edEmployee;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_E_G,
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
				return (EDEmployee)result;
			}
		}
	}

	/**
	 * Finds all the e d employees where departmentId = &#63; and groupId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId_GroupId(long departmentId,
		long groupId) throws SystemException {
		return findByDepartmentId_GroupId(departmentId, groupId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees where departmentId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId_GroupId(long departmentId,
		long groupId, int start, int end) throws SystemException {
		return findByDepartmentId_GroupId(departmentId, groupId, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the e d employees where departmentId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findByDepartmentId_GroupId(long departmentId,
		long groupId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				departmentId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DEPARTMENTID_GROUPID,
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

			query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_GROUPID_DEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPARTMENTID_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				qPos.add(groupId);

				list = (List<EDEmployee>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DEPARTMENTID_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DEPARTMENTID_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d employee in the ordered set where departmentId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartmentId_GroupId_First(long departmentId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		List<EDEmployee> list = findByDepartmentId_GroupId(departmentId,
				groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d employee in the ordered set where departmentId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a matching e d employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee findByDepartmentId_GroupId_Last(long departmentId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		int count = countByDepartmentId_GroupId(departmentId, groupId);

		List<EDEmployee> list = findByDepartmentId_GroupId(departmentId,
				groupId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDEmployeeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d employees before and after the current e d employee in the ordered set where departmentId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d employee
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d employee
	 * @throws com.vsi.edirectory.portlet.NoSuchEDEmployeeException if a e d employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDEmployee[] findByDepartmentId_GroupId_PrevAndNext(long id,
		long departmentId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDEmployee[] array = new EDEmployeeImpl[3];

			array[0] = getByDepartmentId_GroupId_PrevAndNext(session,
					edEmployee, departmentId, groupId, orderByComparator, true);

			array[1] = edEmployee;

			array[2] = getByDepartmentId_GroupId_PrevAndNext(session,
					edEmployee, departmentId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDEmployee getByDepartmentId_GroupId_PrevAndNext(
		Session session, EDEmployee edEmployee, long departmentId,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_DEPARTMENTID_GROUPID_DEPARTMENTID_2);

		query.append(_FINDER_COLUMN_DEPARTMENTID_GROUPID_GROUPID_2);

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
			query.append(EDEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d employees.
	 *
	 * @return the e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @return the range of e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of e d employees to return
	 * @param end the upper bound of the range of e d employees to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDEmployee> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDEmployee> list = (List<EDEmployee>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EDEMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EDEMPLOYEE.concat(EDEmployeeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<EDEmployee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<EDEmployee>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the e d employees where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUuid(String uuid) throws SystemException {
		for (EDEmployee edEmployee : findByUuid(uuid)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes the e d employee where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUUID_G(String uuid, long groupId)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByUUID_G(uuid, groupId);

		remove(edEmployee);
	}

	/**
	 * Removes the e d employee where departmentId = &#63; and id = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @param id the id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartment_Id(long departmentId, long id)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByDepartment_Id(departmentId, id);

		remove(edEmployee);
	}

	/**
	 * Removes all the e d employees where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (EDEmployee edEmployee : findByGroupId(groupId)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes all the e d employees where departmentId = &#63; and groupId = &#63; and status = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartmentId_Status(long departmentId, long groupId,
		long status) throws SystemException {
		for (EDEmployee edEmployee : findByDepartmentId_Status(departmentId,
				groupId, status)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes all the e d employees where departmentId = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartmentId(long departmentId)
		throws SystemException {
		for (EDEmployee edEmployee : findByDepartmentId(departmentId)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes all the e d employees where isShowTree = &#63; from the database.
	 *
	 * @param isShowTree the is show tree to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByIsShowed(boolean isShowTree) throws SystemException {
		for (EDEmployee edEmployee : findByIsShowed(isShowTree)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes all the e d employees where groupId = &#63; and languageId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String languageId)
		throws SystemException {
		for (EDEmployee edEmployee : findByG_L(groupId, languageId)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes all the e d employees where groupId = &#63; and languageId = &#63; and isShowTree = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_I(long groupId, String languageId,
		boolean isShowTree) throws SystemException {
		for (EDEmployee edEmployee : findByG_L_I(groupId, languageId, isShowTree)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes the e d employee where id = &#63; and groupId = &#63; from the database.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByE_G(long id, long groupId)
		throws NoSuchEDEmployeeException, SystemException {
		EDEmployee edEmployee = findByE_G(id, groupId);

		remove(edEmployee);
	}

	/**
	 * Removes all the e d employees where departmentId = &#63; and groupId = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartmentId_GroupId(long departmentId, long groupId)
		throws SystemException {
		for (EDEmployee edEmployee : findByDepartmentId_GroupId(departmentId,
				groupId)) {
			remove(edEmployee);
		}
	}

	/**
	 * Removes all the e d employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (EDEmployee edEmployee : findAll()) {
			remove(edEmployee);
		}
	}

	/**
	 * Counts all the e d employees where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUuid(String uuid) throws SystemException {
		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

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
	 * Counts all the e d employees where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_G_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_G_UUID_2);
				}
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where departmentId = &#63; and id = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @param id the id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartment_Id(long departmentId, long id)
		throws SystemException {
		Object[] finderArgs = new Object[] { departmentId, id };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTMENT_ID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENT_ID_DEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPARTMENT_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				qPos.add(id);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTMENT_ID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

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
	 * Counts all the e d employees where departmentId = &#63; and groupId = &#63; and status = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartmentId_Status(long departmentId, long groupId,
		long status) throws SystemException {
		Object[] finderArgs = new Object[] { departmentId, groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTMENTID_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_DEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_DEPARTMENTID_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTMENTID_STATUS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartmentId(long departmentId) throws SystemException {
		Object[] finderArgs = new Object[] { departmentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTMENTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTMENTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where isShowTree = &#63;.
	 *
	 * @param isShowTree the is show tree to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByIsShowed(boolean isShowTree) throws SystemException {
		Object[] finderArgs = new Object[] { isShowTree };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ISSHOWED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isShowTree);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ISSHOWED,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where groupId = &#63; and languageId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String languageId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, languageId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (languageId == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_1);
			}
			else {
				if (languageId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (languageId != null) {
					qPos.add(languageId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where groupId = &#63; and languageId = &#63; and isShowTree = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param isShowTree the is show tree to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_I(long groupId, String languageId, boolean isShowTree)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, languageId, isShowTree };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_I,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_G_L_I_GROUPID_2);

			if (languageId == null) {
				query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_1);
			}
			else {
				if (languageId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_I_LANGUAGEID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_I_ISSHOWTREE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (languageId != null) {
					qPos.add(languageId);
				}

				qPos.add(isShowTree);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_I,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where id = &#63; and groupId = &#63;.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByE_G(long id, long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { id, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_E_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_E_G_ID_2);

			query.append(_FINDER_COLUMN_E_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_E_G, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees where departmentId = &#63; and groupId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching e d employees
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartmentId_GroupId(long departmentId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { departmentId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTMENTID_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_GROUPID_DEPARTMENTID_2);

			query.append(_FINDER_COLUMN_DEPARTMENTID_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTMENTID_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d employees.
	 *
	 * @return the number of e d employees
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

				Query q = session.createQuery(_SQL_COUNT_EDEMPLOYEE);

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
	 * Initializes the e d employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vsi.edirectory.portlet.model.EDEmployee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EDEmployee>> listenersList = new ArrayList<ModelListener<EDEmployee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EDEmployee>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EDEmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = EDEmployeePersistence.class)
	protected EDEmployeePersistence edEmployeePersistence;
	@BeanReference(type = EDDepartmentPersistence.class)
	protected EDDepartmentPersistence edDepartmentPersistence;
	@BeanReference(type = EDFunctionPersistence.class)
	protected EDFunctionPersistence edFunctionPersistence;
	@BeanReference(type = EDFunctionDepartmentPersistence.class)
	protected EDFunctionDepartmentPersistence edFunctionDepartmentPersistence;
	@BeanReference(type = EDFunctionEmployeePersistence.class)
	protected EDFunctionEmployeePersistence edFunctionEmployeePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EDEMPLOYEE = "SELECT edEmployee FROM EDEmployee edEmployee";
	private static final String _SQL_SELECT_EDEMPLOYEE_WHERE = "SELECT edEmployee FROM EDEmployee edEmployee WHERE ";
	private static final String _SQL_COUNT_EDEMPLOYEE = "SELECT COUNT(edEmployee) FROM EDEmployee edEmployee";
	private static final String _SQL_COUNT_EDEMPLOYEE_WHERE = "SELECT COUNT(edEmployee) FROM EDEmployee edEmployee WHERE ";
	private static final String _FINDER_COLUMN_UUID_UUID_1 = "edEmployee.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "edEmployee.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(edEmployee.uuid IS NULL OR edEmployee.uuid = ?)";
	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "edEmployee.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "edEmployee.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(edEmployee.uuid IS NULL OR edEmployee.uuid = ?) AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "edEmployee.groupId = ?";
	private static final String _FINDER_COLUMN_DEPARTMENT_ID_DEPARTMENTID_2 = "edEmployee.departmentId = ? AND ";
	private static final String _FINDER_COLUMN_DEPARTMENT_ID_ID_2 = "edEmployee.id = ?";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "edEmployee.groupId = ?";
	private static final String _FINDER_COLUMN_DEPARTMENTID_STATUS_DEPARTMENTID_2 =
		"edEmployee.departmentId = ? AND ";
	private static final String _FINDER_COLUMN_DEPARTMENTID_STATUS_GROUPID_2 = "edEmployee.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DEPARTMENTID_STATUS_STATUS_2 = "edEmployee.status = ?";
	private static final String _FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2 = "edEmployee.departmentId = ?";
	private static final String _FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2 = "edEmployee.isShowTree = ?";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "edEmployee.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGEID_1 = "edEmployee.languageId IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGEID_2 = "edEmployee.languageId = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGEID_3 = "(edEmployee.languageId IS NULL OR edEmployee.languageId = ?)";
	private static final String _FINDER_COLUMN_G_L_I_GROUPID_2 = "edEmployee.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_I_LANGUAGEID_1 = "edEmployee.languageId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_I_LANGUAGEID_2 = "edEmployee.languageId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_I_LANGUAGEID_3 = "(edEmployee.languageId IS NULL OR edEmployee.languageId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_I_ISSHOWTREE_2 = "edEmployee.isShowTree = ?";
	private static final String _FINDER_COLUMN_E_G_ID_2 = "edEmployee.id = ? AND ";
	private static final String _FINDER_COLUMN_E_G_GROUPID_2 = "edEmployee.groupId = ?";
	private static final String _FINDER_COLUMN_DEPARTMENTID_GROUPID_DEPARTMENTID_2 =
		"edEmployee.departmentId = ? AND ";
	private static final String _FINDER_COLUMN_DEPARTMENTID_GROUPID_GROUPID_2 = "edEmployee.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "edEmployee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EDEmployee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EDEmployee exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(EDEmployeePersistenceImpl.class);
}