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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;
import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;
import com.vportal.portlet.vlegal.model.impl.VLegalSuggestDocumentImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalSuggestDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal suggest document service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalSuggestDocumentUtil} to access the v legal suggest document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalSuggestDocumentPersistence
 * @see VLegalSuggestDocumentUtil
 * @generated
 */
public class VLegalSuggestDocumentPersistenceImpl extends BasePersistenceImpl<VLegalSuggestDocument>
	implements VLegalSuggestDocumentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalSuggestDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByGroupId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_A",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_A",
			new String[] { Long.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_S",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_S",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_L = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_L_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_L_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L_A_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L_A_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByA_D",
			new String[] {
				Boolean.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByA_D",
			new String[] { Boolean.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_SUGGBYDRAFTID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findBySuggByDraftId",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SUGGBYDRAFTID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countBySuggByDraftId",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the v legal suggest document in the entity cache if it is enabled.
	 *
	 * @param vLegalSuggestDocument the v legal suggest document to cache
	 */
	public void cacheResult(VLegalSuggestDocument vLegalSuggestDocument) {
		EntityCacheUtil.putResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey(), vLegalSuggestDocument);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				new Long(vLegalSuggestDocument.getGroupId()),
				
			vLegalSuggestDocument.getSugId()
			}, vLegalSuggestDocument);
	}

	/**
	 * Caches the v legal suggest documents in the entity cache if it is enabled.
	 *
	 * @param vLegalSuggestDocuments the v legal suggest documents to cache
	 */
	public void cacheResult(List<VLegalSuggestDocument> vLegalSuggestDocuments) {
		for (VLegalSuggestDocument vLegalSuggestDocument : vLegalSuggestDocuments) {
			if (EntityCacheUtil.getResult(
						VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalSuggestDocumentImpl.class,
						vLegalSuggestDocument.getPrimaryKey(), this) == null) {
				cacheResult(vLegalSuggestDocument);
			}
		}
	}

	/**
	 * Clears the cache for all v legal suggest documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalSuggestDocumentImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalSuggestDocumentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal suggest document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalSuggestDocument vLegalSuggestDocument) {
		EntityCacheUtil.removeResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				new Long(vLegalSuggestDocument.getGroupId()),
				
			vLegalSuggestDocument.getSugId()
			});
	}

	/**
	 * Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	 *
	 * @param sugId the primary key for the new v legal suggest document
	 * @return the new v legal suggest document
	 */
	public VLegalSuggestDocument create(String sugId) {
		VLegalSuggestDocument vLegalSuggestDocument = new VLegalSuggestDocumentImpl();

		vLegalSuggestDocument.setNew(true);
		vLegalSuggestDocument.setPrimaryKey(sugId);

		return vLegalSuggestDocument;
	}

	/**
	 * Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal suggest document to remove
	 * @return the v legal suggest document that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sugId the primary key of the v legal suggest document to remove
	 * @return the v legal suggest document that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument remove(String sugId)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument vLegalSuggestDocument = (VLegalSuggestDocument)session.get(VLegalSuggestDocumentImpl.class,
					sugId);

			if (vLegalSuggestDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sugId);
				}

				throw new NoSuchVLegalSuggestDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					sugId);
			}

			return remove(vLegalSuggestDocument);
		}
		catch (NoSuchVLegalSuggestDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument removeImpl(
		VLegalSuggestDocument vLegalSuggestDocument) throws SystemException {
		vLegalSuggestDocument = toUnwrappedModel(vLegalSuggestDocument);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalSuggestDocument);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalSuggestDocumentModelImpl vLegalSuggestDocumentModelImpl = (VLegalSuggestDocumentModelImpl)vLegalSuggestDocument;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				new Long(vLegalSuggestDocumentModelImpl.getGroupId()),
				
			vLegalSuggestDocumentModelImpl.getSugId()
			});

		EntityCacheUtil.removeResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey());

		return vLegalSuggestDocument;
	}

	public VLegalSuggestDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument vLegalSuggestDocument,
		boolean merge) throws SystemException {
		vLegalSuggestDocument = toUnwrappedModel(vLegalSuggestDocument);

		boolean isNew = vLegalSuggestDocument.isNew();

		VLegalSuggestDocumentModelImpl vLegalSuggestDocumentModelImpl = (VLegalSuggestDocumentModelImpl)vLegalSuggestDocument;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalSuggestDocument, merge);

			vLegalSuggestDocument.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey(), vLegalSuggestDocument);

		if (!isNew &&
				((vLegalSuggestDocument.getGroupId() != vLegalSuggestDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalSuggestDocument.getSugId(),
					vLegalSuggestDocumentModelImpl.getOriginalSugId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
				new Object[] {
					new Long(vLegalSuggestDocumentModelImpl.getOriginalGroupId()),
					
				vLegalSuggestDocumentModelImpl.getOriginalSugId()
				});
		}

		if (isNew ||
				((vLegalSuggestDocument.getGroupId() != vLegalSuggestDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalSuggestDocument.getSugId(),
					vLegalSuggestDocumentModelImpl.getOriginalSugId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
				new Object[] {
					new Long(vLegalSuggestDocument.getGroupId()),
					
				vLegalSuggestDocument.getSugId()
				}, vLegalSuggestDocument);
		}

		return vLegalSuggestDocument;
	}

	protected VLegalSuggestDocument toUnwrappedModel(
		VLegalSuggestDocument vLegalSuggestDocument) {
		if (vLegalSuggestDocument instanceof VLegalSuggestDocumentImpl) {
			return vLegalSuggestDocument;
		}

		VLegalSuggestDocumentImpl vLegalSuggestDocumentImpl = new VLegalSuggestDocumentImpl();

		vLegalSuggestDocumentImpl.setNew(vLegalSuggestDocument.isNew());
		vLegalSuggestDocumentImpl.setPrimaryKey(vLegalSuggestDocument.getPrimaryKey());

		vLegalSuggestDocumentImpl.setSugId(vLegalSuggestDocument.getSugId());
		vLegalSuggestDocumentImpl.setGroupId(vLegalSuggestDocument.getGroupId());
		vLegalSuggestDocumentImpl.setCompanyId(vLegalSuggestDocument.getCompanyId());
		vLegalSuggestDocumentImpl.setUserId(vLegalSuggestDocument.getUserId());
		vLegalSuggestDocumentImpl.setCreatedDate(vLegalSuggestDocument.getCreatedDate());
		vLegalSuggestDocumentImpl.setModifiedDate(vLegalSuggestDocument.getModifiedDate());
		vLegalSuggestDocumentImpl.setModifiedByUser(vLegalSuggestDocument.getModifiedByUser());
		vLegalSuggestDocumentImpl.setApproved(vLegalSuggestDocument.isApproved());
		vLegalSuggestDocumentImpl.setApprovedByUser(vLegalSuggestDocument.getApprovedByUser());
		vLegalSuggestDocumentImpl.setApprovedDate(vLegalSuggestDocument.getApprovedDate());
		vLegalSuggestDocumentImpl.setTitle(vLegalSuggestDocument.getTitle());
		vLegalSuggestDocumentImpl.setContent(vLegalSuggestDocument.getContent());
		vLegalSuggestDocumentImpl.setLanguage(vLegalSuggestDocument.getLanguage());
		vLegalSuggestDocumentImpl.setVisitorName(vLegalSuggestDocument.getVisitorName());
		vLegalSuggestDocumentImpl.setVisitorEmail(vLegalSuggestDocument.getVisitorEmail());
		vLegalSuggestDocumentImpl.setVisitorTel(vLegalSuggestDocument.getVisitorTel());
		vLegalSuggestDocumentImpl.setVisitorAddress(vLegalSuggestDocument.getVisitorAddress());
		vLegalSuggestDocumentImpl.setDraftId(vLegalSuggestDocument.getDraftId());
		vLegalSuggestDocumentImpl.setHasAttachment(vLegalSuggestDocument.isHasAttachment());

		return vLegalSuggestDocumentImpl;
	}

	/**
	 * Finds the v legal suggest document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal suggest document to find
	 * @return the v legal suggest document
	 * @throws com.liferay.portal.NoSuchModelException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal suggest document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException} if it could not be found.
	 *
	 * @param sugId the primary key of the v legal suggest document to find
	 * @return the v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByPrimaryKey(String sugId)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByPrimaryKey(sugId);

		if (vLegalSuggestDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sugId);
			}

			throw new NoSuchVLegalSuggestDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				sugId);
		}

		return vLegalSuggestDocument;
	}

	/**
	 * Finds the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal suggest document to find
	 * @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sugId the primary key of the v legal suggest document to find
	 * @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument fetchByPrimaryKey(String sugId)
		throws SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = (VLegalSuggestDocument)EntityCacheUtil.getResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalSuggestDocumentImpl.class, sugId, this);

		if (vLegalSuggestDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalSuggestDocument = (VLegalSuggestDocument)session.get(VLegalSuggestDocumentImpl.class,
						sugId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalSuggestDocument != null) {
					cacheResult(vLegalSuggestDocument);
				}

				closeSession(session);
			}
		}

		return vLegalSuggestDocument;
	}

	/**
	 * Finds all the v legal suggest documents where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Finds the first v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalSuggestDocument> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findByGroupId_PrevAndNext(String sugId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalSuggestDocument,
					groupId, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByGroupId_PrevAndNext(session, vLegalSuggestDocument,
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

	protected VLegalSuggestDocument getByGroupId_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_A(long groupId, boolean approved)
		throws SystemException {
		return findByP_A(groupId, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end) throws SystemException {
		return findByP_A(groupId, approved, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, approved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_A,
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_A_GROUPID_2);

			query.append(_FINDER_COLUMN_P_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(approved);

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_A,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_A,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_A_First(long groupId,
		boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findByP_A(groupId, approved, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_A_Last(long groupId, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countByP_A(groupId, approved);

		List<VLegalSuggestDocument> list = findByP_A(groupId, approved,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findByP_A_PrevAndNext(String sugId,
		long groupId, boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, approved, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_A_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		boolean approved, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_A_GROUPID_2);

		query.append(_FINDER_COLUMN_P_A_APPROVED_2);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param sugId the sug id to search with
	 * @return the matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByG_S(long groupId, String sugId)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByG_S(groupId, sugId);

		if (vLegalSuggestDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", sugId=");
			msg.append(sugId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}

		return vLegalSuggestDocument;
	}

	/**
	 * Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param sugId the sug id to search with
	 * @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument fetchByG_S(long groupId, String sugId)
		throws SystemException {
		return fetchByG_S(groupId, sugId, true);
	}

	/**
	 * Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param sugId the sug id to search with
	 * @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument fetchByG_S(long groupId, String sugId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, sugId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_S,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			if (sugId == null) {
				query.append(_FINDER_COLUMN_G_S_SUGID_1);
			}
			else {
				if (sugId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_S_SUGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_S_SUGID_2);
				}
			}

			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (sugId != null) {
					qPos.add(sugId);
				}

				List<VLegalSuggestDocument> list = q.list();

				result = list;

				VLegalSuggestDocument vLegalSuggestDocument = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
						finderArgs, list);
				}
				else {
					vLegalSuggestDocument = list.get(0);

					cacheResult(vLegalSuggestDocument);

					if ((vLegalSuggestDocument.getGroupId() != groupId) ||
							(vLegalSuggestDocument.getSugId() == null) ||
							!vLegalSuggestDocument.getSugId().equals(sugId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
							finderArgs, vLegalSuggestDocument);
					}
				}

				return vLegalSuggestDocument;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
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
				return (VLegalSuggestDocument)result;
			}
		}
	}

	/**
	 * Finds all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language)
		throws SystemException {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language,
		int start, int end) throws SystemException {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L,
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countByP_L(groupId, language);

		List<VLegalSuggestDocument> list = findByP_L(groupId, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findByP_L_PrevAndNext(String sugId,
		long groupId, String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_L_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_L_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		String language, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved) throws SystemException {
		return findByP_L_A(groupId, language, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved, int start, int end)
		throws SystemException {
		return findByP_L_A(groupId, language, approved, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, approved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L_A,
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(approved);

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L_A,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L_A,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_L_A_First(long groupId,
		String language, boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findByP_L_A(groupId, language,
				approved, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_L_A_Last(long groupId,
		String language, boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countByP_L_A(groupId, language, approved);

		List<VLegalSuggestDocument> list = findByP_L_A(groupId, language,
				approved, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findByP_L_A_PrevAndNext(String sugId,
		long groupId, String language, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_L_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_L_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_L_A_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		String language, boolean approved, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId)
		throws SystemException {
		return findByP_L_A_D(groupId, language, approved, draftId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId, int start, int end)
		throws SystemException {
		return findByP_L_A_D(groupId, language, approved, draftId, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, approved, draftId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L_A_D,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_D_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_A_D_APPROVED_2);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(approved);

				if (draftId != null) {
					qPos.add(draftId);
				}

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L_A_D,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L_A_D,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_L_A_D_First(long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findByP_L_A_D(groupId, language,
				approved, draftId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(", draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByP_L_A_D_Last(long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countByP_L_A_D(groupId, language, approved, draftId);

		List<VLegalSuggestDocument> list = findByP_L_A_D(groupId, language,
				approved, draftId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(", draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findByP_L_A_D_PrevAndNext(String sugId,
		long groupId, String language, boolean approved, String draftId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_L_A_D_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, draftId, orderByComparator,
					true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_L_A_D_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, draftId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_L_A_D_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_A_D_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_P_L_A_D_APPROVED_2);

		if (draftId == null) {
			query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_1);
		}
		else {
			if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(approved);

		if (draftId != null) {
			qPos.add(draftId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId) throws SystemException {
		return findByA_D(approved, draftId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId, int start, int end) throws SystemException {
		return findByA_D(approved, draftId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				approved, draftId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_A_D,
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_A_D_APPROVED_2);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_D_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_D_DRAFTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				if (draftId != null) {
					qPos.add(draftId);
				}

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_A_D,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_A_D,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByA_D_First(boolean approved,
		String draftId, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findByA_D(approved, draftId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("approved=");
			msg.append(approved);

			msg.append(", draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findByA_D_Last(boolean approved,
		String draftId, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countByA_D(approved, draftId);

		List<VLegalSuggestDocument> list = findByA_D(approved, draftId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("approved=");
			msg.append(approved);

			msg.append(", draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findByA_D_PrevAndNext(String sugId,
		boolean approved, String draftId, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByA_D_PrevAndNext(session, vLegalSuggestDocument,
					approved, draftId, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByA_D_PrevAndNext(session, vLegalSuggestDocument,
					approved, draftId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByA_D_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, boolean approved,
		String draftId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_A_D_APPROVED_2);

		if (draftId == null) {
			query.append(_FINDER_COLUMN_A_D_DRAFTID_1);
		}
		else {
			if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(approved);

		if (draftId != null) {
			qPos.add(draftId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal suggest documents where draftId = &#63;.
	 *
	 * @param draftId the draft id to search with
	 * @return the matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId)
		throws SystemException {
		return findBySuggByDraftId(draftId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the draft id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId,
		int start, int end) throws SystemException {
		return findBySuggByDraftId(draftId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the draft id to search with
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				draftId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SUGGBYDRAFTID,
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (draftId != null) {
					qPos.add(draftId);
				}

				list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_SUGGBYDRAFTID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_SUGGBYDRAFTID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findBySuggByDraftId_First(String draftId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		List<VLegalSuggestDocument> list = findBySuggByDraftId(draftId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument findBySuggByDraftId_Last(String draftId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		int count = countBySuggByDraftId(draftId);

		List<VLegalSuggestDocument> list = findBySuggByDraftId(draftId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param draftId the draft id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal suggest document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSuggestDocument[] findBySuggByDraftId_PrevAndNext(
		String sugId, String draftId, OrderByComparator orderByComparator)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getBySuggByDraftId_PrevAndNext(session,
					vLegalSuggestDocument, draftId, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getBySuggByDraftId_PrevAndNext(session,
					vLegalSuggestDocument, draftId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getBySuggByDraftId_PrevAndNext(
		Session session, VLegalSuggestDocument vLegalSuggestDocument,
		String draftId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		if (draftId == null) {
			query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1);
		}
		else {
			if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (draftId != null) {
			qPos.add(draftId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal suggest documents.
	 *
	 * @return the v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal suggest documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @return the range of v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal suggest documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal suggest documents to return
	 * @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSuggestDocument> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSuggestDocument> list = (List<VLegalSuggestDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALSUGGESTDOCUMENT.concat(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Removes all the v legal suggest documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByGroupId(
				groupId)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_A(long groupId, boolean approved)
		throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_A(groupId,
				approved)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes the v legal suggest document where groupId = &#63; and sugId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param sugId the sug id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_S(long groupId, String sugId)
		throws NoSuchVLegalSuggestDocumentException, SystemException {
		VLegalSuggestDocument vLegalSuggestDocument = findByG_S(groupId, sugId);

		remove(vLegalSuggestDocument);
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L(long groupId, String language)
		throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_L(groupId,
				language)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L_A(long groupId, String language, boolean approved)
		throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_L_A(
				groupId, language, approved)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L_A_D(long groupId, String language,
		boolean approved, String draftId) throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_L_A_D(
				groupId, language, approved, draftId)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes all the v legal suggest documents where approved = &#63; and draftId = &#63; from the database.
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByA_D(boolean approved, String draftId)
		throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByA_D(approved,
				draftId)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes all the v legal suggest documents where draftId = &#63; from the database.
	 *
	 * @param draftId the draft id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySuggByDraftId(String draftId) throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findBySuggByDraftId(
				draftId)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Removes all the v legal suggest documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalSuggestDocument vLegalSuggestDocument : findAll()) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Counts all the v legal suggest documents where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

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
	 * Counts all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param approved the approved to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_A(long groupId, boolean approved)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, approved };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_A,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_A_GROUPID_2);

			query.append(_FINDER_COLUMN_P_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(approved);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_A, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents where groupId = &#63; and sugId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param sugId the sug id to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_S(long groupId, String sugId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, sugId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			if (sugId == null) {
				query.append(_FINDER_COLUMN_G_S_SUGID_1);
			}
			else {
				if (sugId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_S_SUGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_S_SUGID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (sugId != null) {
					qPos.add(sugId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L_A(long groupId, String language, boolean approved)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, approved };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L_A,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(approved);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L_A,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L_A_D(long groupId, String language, boolean approved,
		String draftId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, approved, draftId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L_A_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_D_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_A_D_APPROVED_2);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(approved);

				if (draftId != null) {
					qPos.add(draftId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L_A_D,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved to search with
	 * @param draftId the draft id to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByA_D(boolean approved, String draftId)
		throws SystemException {
		Object[] finderArgs = new Object[] { approved, draftId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_A_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_A_D_APPROVED_2);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_D_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_D_DRAFTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				if (draftId != null) {
					qPos.add(draftId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A_D, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents where draftId = &#63;.
	 *
	 * @param draftId the draft id to search with
	 * @return the number of matching v legal suggest documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySuggByDraftId(String draftId) throws SystemException {
		Object[] finderArgs = new Object[] { draftId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SUGGBYDRAFTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (draftId != null) {
					qPos.add(draftId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SUGGBYDRAFTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal suggest documents.
	 *
	 * @return the number of v legal suggest documents
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALSUGGESTDOCUMENT);

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
	 * Initializes the v legal suggest document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalSuggestDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalSuggestDocument>> listenersList = new ArrayList<ModelListener<VLegalSuggestDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalSuggestDocument>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalSuggestDocumentImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALSUGGESTDOCUMENT = "SELECT vLegalSuggestDocument FROM VLegalSuggestDocument vLegalSuggestDocument";
	private static final String _SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE = "SELECT vLegalSuggestDocument FROM VLegalSuggestDocument vLegalSuggestDocument WHERE ";
	private static final String _SQL_COUNT_VLEGALSUGGESTDOCUMENT = "SELECT COUNT(vLegalSuggestDocument) FROM VLegalSuggestDocument vLegalSuggestDocument";
	private static final String _SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE = "SELECT COUNT(vLegalSuggestDocument) FROM VLegalSuggestDocument vLegalSuggestDocument WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalSuggestDocument.groupId = ?";
	private static final String _FINDER_COLUMN_P_A_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_A_APPROVED_2 = "vLegalSuggestDocument.approved = ?";
	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_SUGID_1 = "vLegalSuggestDocument.sugId IS NULL";
	private static final String _FINDER_COLUMN_G_S_SUGID_2 = "vLegalSuggestDocument.sugId = ?";
	private static final String _FINDER_COLUMN_G_S_SUGID_3 = "(vLegalSuggestDocument.sugId IS NULL OR vLegalSuggestDocument.sugId = ?)";
	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vLegalSuggestDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vLegalSuggestDocument.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vLegalSuggestDocument.language IS NULL OR vLegalSuggestDocument.language = ?)";
	private static final String _FINDER_COLUMN_P_L_A_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_1 = "vLegalSuggestDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_2 = "vLegalSuggestDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_3 = "(vLegalSuggestDocument.language IS NULL OR vLegalSuggestDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_P_L_A_APPROVED_2 = "vLegalSuggestDocument.approved = ?";
	private static final String _FINDER_COLUMN_P_L_A_D_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_LANGUAGE_1 = "vLegalSuggestDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_LANGUAGE_2 = "vLegalSuggestDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_LANGUAGE_3 = "(vLegalSuggestDocument.language IS NULL OR vLegalSuggestDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_APPROVED_2 = "vLegalSuggestDocument.approved = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_DRAFTID_1 = "vLegalSuggestDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_P_L_A_D_DRAFTID_2 = "vLegalSuggestDocument.draftId = ?";
	private static final String _FINDER_COLUMN_P_L_A_D_DRAFTID_3 = "(vLegalSuggestDocument.draftId IS NULL OR vLegalSuggestDocument.draftId = ?)";
	private static final String _FINDER_COLUMN_A_D_APPROVED_2 = "vLegalSuggestDocument.approved = ? AND ";
	private static final String _FINDER_COLUMN_A_D_DRAFTID_1 = "vLegalSuggestDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_A_D_DRAFTID_2 = "vLegalSuggestDocument.draftId = ?";
	private static final String _FINDER_COLUMN_A_D_DRAFTID_3 = "(vLegalSuggestDocument.draftId IS NULL OR vLegalSuggestDocument.draftId = ?)";
	private static final String _FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1 = "vLegalSuggestDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2 = "vLegalSuggestDocument.draftId = ?";
	private static final String _FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3 = "(vLegalSuggestDocument.draftId IS NULL OR vLegalSuggestDocument.draftId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalSuggestDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalSuggestDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalSuggestDocument exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalSuggestDocumentPersistenceImpl.class);
}