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

import com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;
import com.vportal.portlet.vlegal.model.VLegalDraftDocument;
import com.vportal.portlet.vlegal.model.impl.VLegalDraftDocumentImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalDraftDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal draft document service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalDraftDocumentUtil} to access the v legal draft document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDraftDocumentPersistence
 * @see VLegalDraftDocumentUtil
 * @generated
 */
public class VLegalDraftDocumentPersistenceImpl extends BasePersistenceImpl<VLegalDraftDocument>
	implements VLegalDraftDocumentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDraftDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByGroupId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_G_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_D",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_D",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_S_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_S_D",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_S_D",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_S_F = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_S_F",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_F = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_S_F",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_S_T = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_S_T",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_T = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_S_T",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_S_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_S_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_S_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_S_U_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_S_U_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_U_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_S_U_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCCODE = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocCode",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCCODE = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocCode",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the v legal draft document in the entity cache if it is enabled.
	 *
	 * @param vLegalDraftDocument the v legal draft document to cache
	 */
	public void cacheResult(VLegalDraftDocument vLegalDraftDocument) {
		EntityCacheUtil.putResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey(),
			vLegalDraftDocument);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				new Long(vLegalDraftDocument.getGroupId()),
				
			vLegalDraftDocument.getDraftId()
			}, vLegalDraftDocument);
	}

	/**
	 * Caches the v legal draft documents in the entity cache if it is enabled.
	 *
	 * @param vLegalDraftDocuments the v legal draft documents to cache
	 */
	public void cacheResult(List<VLegalDraftDocument> vLegalDraftDocuments) {
		for (VLegalDraftDocument vLegalDraftDocument : vLegalDraftDocuments) {
			if (EntityCacheUtil.getResult(
						VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDraftDocumentImpl.class,
						vLegalDraftDocument.getPrimaryKey(), this) == null) {
				cacheResult(vLegalDraftDocument);
			}
		}
	}

	/**
	 * Clears the cache for all v legal draft documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalDraftDocumentImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalDraftDocumentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal draft document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalDraftDocument vLegalDraftDocument) {
		EntityCacheUtil.removeResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				new Long(vLegalDraftDocument.getGroupId()),
				
			vLegalDraftDocument.getDraftId()
			});
	}

	/**
	 * Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	 *
	 * @param draftId the primary key for the new v legal draft document
	 * @return the new v legal draft document
	 */
	public VLegalDraftDocument create(String draftId) {
		VLegalDraftDocument vLegalDraftDocument = new VLegalDraftDocumentImpl();

		vLegalDraftDocument.setNew(true);
		vLegalDraftDocument.setPrimaryKey(draftId);

		return vLegalDraftDocument;
	}

	/**
	 * Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal draft document to remove
	 * @return the v legal draft document that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param draftId the primary key of the v legal draft document to remove
	 * @return the v legal draft document that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument remove(String draftId)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument vLegalDraftDocument = (VLegalDraftDocument)session.get(VLegalDraftDocumentImpl.class,
					draftId);

			if (vLegalDraftDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + draftId);
				}

				throw new NoSuchVLegalDraftDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					draftId);
			}

			return remove(vLegalDraftDocument);
		}
		catch (NoSuchVLegalDraftDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument removeImpl(
		VLegalDraftDocument vLegalDraftDocument) throws SystemException {
		vLegalDraftDocument = toUnwrappedModel(vLegalDraftDocument);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalDraftDocument);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalDraftDocumentModelImpl vLegalDraftDocumentModelImpl = (VLegalDraftDocumentModelImpl)vLegalDraftDocument;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				new Long(vLegalDraftDocumentModelImpl.getGroupId()),
				
			vLegalDraftDocumentModelImpl.getDraftId()
			});

		EntityCacheUtil.removeResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey());

		return vLegalDraftDocument;
	}

	public VLegalDraftDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument vLegalDraftDocument,
		boolean merge) throws SystemException {
		vLegalDraftDocument = toUnwrappedModel(vLegalDraftDocument);

		boolean isNew = vLegalDraftDocument.isNew();

		VLegalDraftDocumentModelImpl vLegalDraftDocumentModelImpl = (VLegalDraftDocumentModelImpl)vLegalDraftDocument;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalDraftDocument, merge);

			vLegalDraftDocument.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey(),
			vLegalDraftDocument);

		if (!isNew &&
				((vLegalDraftDocument.getGroupId() != vLegalDraftDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalDraftDocument.getDraftId(),
					vLegalDraftDocumentModelImpl.getOriginalDraftId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
				new Object[] {
					new Long(vLegalDraftDocumentModelImpl.getOriginalGroupId()),
					
				vLegalDraftDocumentModelImpl.getOriginalDraftId()
				});
		}

		if (isNew ||
				((vLegalDraftDocument.getGroupId() != vLegalDraftDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalDraftDocument.getDraftId(),
					vLegalDraftDocumentModelImpl.getOriginalDraftId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
				new Object[] {
					new Long(vLegalDraftDocument.getGroupId()),
					
				vLegalDraftDocument.getDraftId()
				}, vLegalDraftDocument);
		}

		return vLegalDraftDocument;
	}

	protected VLegalDraftDocument toUnwrappedModel(
		VLegalDraftDocument vLegalDraftDocument) {
		if (vLegalDraftDocument instanceof VLegalDraftDocumentImpl) {
			return vLegalDraftDocument;
		}

		VLegalDraftDocumentImpl vLegalDraftDocumentImpl = new VLegalDraftDocumentImpl();

		vLegalDraftDocumentImpl.setNew(vLegalDraftDocument.isNew());
		vLegalDraftDocumentImpl.setPrimaryKey(vLegalDraftDocument.getPrimaryKey());

		vLegalDraftDocumentImpl.setDraftId(vLegalDraftDocument.getDraftId());
		vLegalDraftDocumentImpl.setGroupId(vLegalDraftDocument.getGroupId());
		vLegalDraftDocumentImpl.setCompanyId(vLegalDraftDocument.getCompanyId());
		vLegalDraftDocumentImpl.setUserId(vLegalDraftDocument.getUserId());
		vLegalDraftDocumentImpl.setCreatedByUser(vLegalDraftDocument.getCreatedByUser());
		vLegalDraftDocumentImpl.setCreatedDate(vLegalDraftDocument.getCreatedDate());
		vLegalDraftDocumentImpl.setModifiedByUser(vLegalDraftDocument.getModifiedByUser());
		vLegalDraftDocumentImpl.setModifiedDate(vLegalDraftDocument.getModifiedDate());
		vLegalDraftDocumentImpl.setApprovedByUser(vLegalDraftDocument.getApprovedByUser());
		vLegalDraftDocumentImpl.setApprovedDate(vLegalDraftDocument.getApprovedDate());
		vLegalDraftDocumentImpl.setPublishedByUser(vLegalDraftDocument.getPublishedByUser());
		vLegalDraftDocumentImpl.setPublishedDate(vLegalDraftDocument.getPublishedDate());
		vLegalDraftDocumentImpl.setTitle(vLegalDraftDocument.getTitle());
		vLegalDraftDocumentImpl.setExpiredDate(vLegalDraftDocument.getExpiredDate());
		vLegalDraftDocumentImpl.setLanguage(vLegalDraftDocument.getLanguage());
		vLegalDraftDocumentImpl.setContent(vLegalDraftDocument.getContent());
		vLegalDraftDocumentImpl.setTypeId(vLegalDraftDocument.getTypeId());
		vLegalDraftDocumentImpl.setFieldId(vLegalDraftDocument.getFieldId());
		vLegalDraftDocumentImpl.setHasAttachment(vLegalDraftDocument.isHasAttachment());
		vLegalDraftDocumentImpl.setDraftLevel(vLegalDraftDocument.getDraftLevel());
		vLegalDraftDocumentImpl.setDocCode(vLegalDraftDocument.getDocCode());
		vLegalDraftDocumentImpl.setStatusDraft(vLegalDraftDocument.getStatusDraft());

		return vLegalDraftDocumentImpl;
	}

	/**
	 * Finds the v legal draft document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal draft document to find
	 * @return the v legal draft document
	 * @throws com.liferay.portal.NoSuchModelException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal draft document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException} if it could not be found.
	 *
	 * @param draftId the primary key of the v legal draft document to find
	 * @return the v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByPrimaryKey(String draftId)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = fetchByPrimaryKey(draftId);

		if (vLegalDraftDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + draftId);
			}

			throw new NoSuchVLegalDraftDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				draftId);
		}

		return vLegalDraftDocument;
	}

	/**
	 * Finds the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal draft document to find
	 * @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param draftId the primary key of the v legal draft document to find
	 * @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument fetchByPrimaryKey(String draftId)
		throws SystemException {
		VLegalDraftDocument vLegalDraftDocument = (VLegalDraftDocument)EntityCacheUtil.getResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDraftDocumentImpl.class, draftId, this);

		if (vLegalDraftDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDraftDocument = (VLegalDraftDocument)session.get(VLegalDraftDocumentImpl.class,
						draftId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalDraftDocument != null) {
					cacheResult(vLegalDraftDocument);
				}

				closeSession(session);
			}
		}

		return vLegalDraftDocument;
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
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
	 * Finds the first v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalDraftDocument> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByGroupId_PrevAndNext(String draftId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalDraftDocument,
					groupId, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByGroupId_PrevAndNext(session, vLegalDraftDocument,
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

	protected VLegalDraftDocument getByGroupId_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal draft document where groupId = &#63; and draftId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param draftId the draft id to search with
	 * @return the matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByG_D(long groupId, String draftId)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = fetchByG_D(groupId, draftId);

		if (vLegalDraftDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}

		return vLegalDraftDocument;
	}

	/**
	 * Finds the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param draftId the draft id to search with
	 * @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument fetchByG_D(long groupId, String draftId)
		throws SystemException {
		return fetchByG_D(groupId, draftId, true);
	}

	/**
	 * Finds the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param draftId the draft id to search with
	 * @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument fetchByG_D(long groupId, String draftId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, draftId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_D,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_D_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_D_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_D_DRAFTID_2);
				}
			}

			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (draftId != null) {
					qPos.add(draftId);
				}

				List<VLegalDraftDocument> list = q.list();

				result = list;

				VLegalDraftDocument vLegalDraftDocument = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
						finderArgs, list);
				}
				else {
					vLegalDraftDocument = list.get(0);

					cacheResult(vLegalDraftDocument);

					if ((vLegalDraftDocument.getGroupId() != groupId) ||
							(vLegalDraftDocument.getDraftId() == null) ||
							!vLegalDraftDocument.getDraftId().equals(draftId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
							finderArgs, vLegalDraftDocument);
					}
				}

				return vLegalDraftDocument;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
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
				return (VLegalDraftDocument)result;
			}
		}
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode) throws SystemException {
		return findByP_S_D(groupId, statusDraft, docCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode, int start, int end) throws SystemException {
		return findByP_S_D(groupId, statusDraft, docCode, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusDraft, docCode,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_S_D,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_D_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_D_STATUSDRAFT_2);

			if (docCode == null) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_1);
			}
			else {
				if (docCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_D_DOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_D_DOCCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (docCode != null) {
					qPos.add(docCode);
				}

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_S_D,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_S_D,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_D_First(long groupId, int statusDraft,
		String docCode, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByP_S_D(groupId, statusDraft,
				docCode, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", docCode=");
			msg.append(docCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_D_Last(long groupId, int statusDraft,
		String docCode, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByP_S_D(groupId, statusDraft, docCode);

		List<VLegalDraftDocument> list = findByP_S_D(groupId, statusDraft,
				docCode, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", docCode=");
			msg.append(docCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByP_S_D_PrevAndNext(String draftId,
		long groupId, int statusDraft, String docCode,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_D_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, docCode, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_D_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, docCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_D_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String docCode, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_D_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_D_STATUSDRAFT_2);

		if (docCode == null) {
			query.append(_FINDER_COLUMN_P_S_D_DOCCODE_1);
		}
		else {
			if (docCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (docCode != null) {
			qPos.add(docCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId) throws SystemException {
		return findByP_S_F(groupId, statusDraft, fieldId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId, int start, int end) throws SystemException {
		return findByP_S_F(groupId, statusDraft, fieldId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusDraft, fieldId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_S_F,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_F_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_F_STATUSDRAFT_2);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_F_FIELDID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_S_F,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_S_F,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_F_First(long groupId, int statusDraft,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByP_S_F(groupId, statusDraft,
				fieldId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_F_Last(long groupId, int statusDraft,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByP_S_F(groupId, statusDraft, fieldId);

		List<VLegalDraftDocument> list = findByP_S_F(groupId, statusDraft,
				fieldId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByP_S_F_PrevAndNext(String draftId,
		long groupId, int statusDraft, String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_F_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, fieldId, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_F_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_F_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String fieldId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_F_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_F_STATUSDRAFT_2);

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_P_S_F_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId) throws SystemException {
		return findByP_S_T(groupId, statusDraft, typeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId, int start, int end) throws SystemException {
		return findByP_S_T(groupId, statusDraft, typeId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusDraft, typeId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_S_T,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_T_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_T_STATUSDRAFT_2);

			if (typeId == null) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_1);
			}
			else {
				if (typeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_T_TYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_T_TYPEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (typeId != null) {
					qPos.add(typeId);
				}

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_S_T,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_S_T,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_T_First(long groupId, int statusDraft,
		String typeId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByP_S_T(groupId, statusDraft,
				typeId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_T_Last(long groupId, int statusDraft,
		String typeId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByP_S_T(groupId, statusDraft, typeId);

		List<VLegalDraftDocument> list = findByP_S_T(groupId, statusDraft,
				typeId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByP_S_T_PrevAndNext(String draftId,
		long groupId, int statusDraft, String typeId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_T_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, typeId, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_T_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, typeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_T_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String typeId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_T_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_T_STATUSDRAFT_2);

		if (typeId == null) {
			query.append(_FINDER_COLUMN_P_S_T_TYPEID_1);
		}
		else {
			if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (typeId != null) {
			qPos.add(typeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language) throws SystemException {
		return findByP_S_L(groupId, statusDraft, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language, int start, int end) throws SystemException {
		return findByP_S_L(groupId, statusDraft, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusDraft, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_S_L,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_L_STATUSDRAFT_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_S_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_S_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_L_First(long groupId, int statusDraft,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByP_S_L(groupId, statusDraft,
				language, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_L_Last(long groupId, int statusDraft,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByP_S_L(groupId, statusDraft, language);

		List<VLegalDraftDocument> list = findByP_S_L(groupId, statusDraft,
				language, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByP_S_L_PrevAndNext(String draftId,
		long groupId, int statusDraft, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, language, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_L_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String language, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_L_STATUSDRAFT_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_L(long groupId, String language)
		throws SystemException {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_L(long groupId, String language,
		int start, int end) throws SystemException {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_L(long groupId, String language,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

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
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
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
	 * Finds the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByP_L(groupId, language);

		List<VLegalDraftDocument> list = findByP_L(groupId, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByP_L_PrevAndNext(String draftId,
		long groupId, String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, language, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_L_PrevAndNext(session, vLegalDraftDocument,
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

	protected VLegalDraftDocument getByP_L_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language)
		throws SystemException {
		return findByP_S_U_L(groupId, statusDraft, createdByUser, language,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language, int start, int end)
		throws SystemException {
		return findByP_S_U_L(groupId, statusDraft, createdByUser, language,
			start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusDraft, createdByUser, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_S_U_L,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_U_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2);

			query.append(_FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				qPos.add(createdByUser);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_S_U_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_S_U_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByP_S_U_L(groupId, statusDraft,
				createdByUser, language, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByP_S_U_L(groupId, statusDraft, createdByUser, language);

		List<VLegalDraftDocument> list = findByP_S_U_L(groupId, statusDraft,
				createdByUser, language, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusDraft=");
			msg.append(statusDraft);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByP_S_U_L_PrevAndNext(String draftId,
		long groupId, int statusDraft, long createdByUser, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_U_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, createdByUser, language,
					orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_U_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, createdByUser, language,
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

	protected VLegalDraftDocument getByP_S_U_L_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		long createdByUser, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_U_L_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2);

		query.append(_FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		qPos.add(createdByUser);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents where docCode = &#63;.
	 *
	 * @param docCode the doc code to search with
	 * @return the matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByDocCode(String docCode)
		throws SystemException {
		return findByDocCode(docCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docCode the doc code to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByDocCode(String docCode, int start,
		int end) throws SystemException {
		return findByDocCode(docCode, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docCode the doc code to search with
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findByDocCode(String docCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				docCode,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCCODE,
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			if (docCode == null) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_1);
			}
			else {
				if (docCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (docCode != null) {
					qPos.add(docCode);
				}

				list = (List<VLegalDraftDocument>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCCODE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCCODE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docCode the doc code to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByDocCode_First(String docCode,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		List<VLegalDraftDocument> list = findByDocCode(docCode, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docCode=");
			msg.append(docCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docCode the doc code to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument findByDocCode_Last(String docCode,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		int count = countByDocCode(docCode);

		List<VLegalDraftDocument> list = findByDocCode(docCode, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docCode=");
			msg.append(docCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal draft documents before and after the current v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param docCode the doc code to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal draft document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDraftDocument[] findByDocCode_PrevAndNext(String draftId,
		String docCode, OrderByComparator orderByComparator)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByDocCode_PrevAndNext(session, vLegalDraftDocument,
					docCode, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByDocCode_PrevAndNext(session, vLegalDraftDocument,
					docCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByDocCode_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, String docCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		if (docCode == null) {
			query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_1);
		}
		else {
			if (docCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (docCode != null) {
			qPos.add(docCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal draft documents.
	 *
	 * @return the v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal draft documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @return the range of v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal draft documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal draft documents to return
	 * @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDraftDocument> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDraftDocument> list = (List<VLegalDraftDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDRAFTDOCUMENT.concat(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
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
	 * Removes all the v legal draft documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByGroupId(groupId)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes the v legal draft document where groupId = &#63; and draftId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param draftId the draft id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_D(long groupId, String draftId)
		throws NoSuchVLegalDraftDocumentException, SystemException {
		VLegalDraftDocument vLegalDraftDocument = findByG_D(groupId, draftId);

		remove(vLegalDraftDocument);
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_S_D(long groupId, int statusDraft, String docCode)
		throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_D(groupId,
				statusDraft, docCode)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_S_F(long groupId, int statusDraft, String fieldId)
		throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_F(groupId,
				statusDraft, fieldId)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_S_T(long groupId, int statusDraft, String typeId)
		throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_T(groupId,
				statusDraft, typeId)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_S_L(long groupId, int statusDraft, String language)
		throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_L(groupId,
				statusDraft, language)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L(long groupId, String language)
		throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_L(groupId,
				language)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, String language) throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_U_L(groupId,
				statusDraft, createdByUser, language)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents where docCode = &#63; from the database.
	 *
	 * @param docCode the doc code to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocCode(String docCode) throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findByDocCode(docCode)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Removes all the v legal draft documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalDraftDocument vLegalDraftDocument : findAll()) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Counts all the v legal draft documents where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

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
	 * Counts all the v legal draft documents where groupId = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param draftId the draft id to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_D(long groupId, String draftId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, draftId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_D_DRAFTID_1);
			}
			else {
				if (draftId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_D_DRAFTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_D_DRAFTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_D, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param docCode the doc code to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_S_D(long groupId, int statusDraft, String docCode)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusDraft, docCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_S_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_D_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_D_STATUSDRAFT_2);

			if (docCode == null) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_1);
			}
			else {
				if (docCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_D_DOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_D_DOCCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (docCode != null) {
					qPos.add(docCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_S_D,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param fieldId the field id to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_S_F(long groupId, int statusDraft, String fieldId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusDraft, fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_S_F,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_F_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_F_STATUSDRAFT_2);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_F_FIELDID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (fieldId != null) {
					qPos.add(fieldId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_S_F,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param typeId the type id to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_S_T(long groupId, int statusDraft, String typeId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusDraft, typeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_S_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_T_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_T_STATUSDRAFT_2);

			if (typeId == null) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_1);
			}
			else {
				if (typeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_T_TYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_T_TYPEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (typeId != null) {
					qPos.add(typeId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_S_T,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param language the language to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_S_L(long groupId, int statusDraft, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusDraft, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_S_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_L_STATUSDRAFT_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_S_L,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

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
	 * Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusDraft the status draft to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, String language) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusDraft, createdByUser, language
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_S_U_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_U_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2);

			query.append(_FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				qPos.add(createdByUser);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_S_U_L,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents where docCode = &#63;.
	 *
	 * @param docCode the doc code to search with
	 * @return the number of matching v legal draft documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocCode(String docCode) throws SystemException {
		Object[] finderArgs = new Object[] { docCode };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCCODE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			if (docCode == null) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_1);
			}
			else {
				if (docCode.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (docCode != null) {
					qPos.add(docCode);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCCODE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal draft documents.
	 *
	 * @return the number of v legal draft documents
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALDRAFTDOCUMENT);

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
	 * Initializes the v legal draft document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalDraftDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalDraftDocument>> listenersList = new ArrayList<ModelListener<VLegalDraftDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalDraftDocument>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalDraftDocumentImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDRAFTDOCUMENT = "SELECT vLegalDraftDocument FROM VLegalDraftDocument vLegalDraftDocument";
	private static final String _SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE = "SELECT vLegalDraftDocument FROM VLegalDraftDocument vLegalDraftDocument WHERE ";
	private static final String _SQL_COUNT_VLEGALDRAFTDOCUMENT = "SELECT COUNT(vLegalDraftDocument) FROM VLegalDraftDocument vLegalDraftDocument";
	private static final String _SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE = "SELECT COUNT(vLegalDraftDocument) FROM VLegalDraftDocument vLegalDraftDocument WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalDraftDocument.groupId = ?";
	private static final String _FINDER_COLUMN_G_D_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_D_DRAFTID_1 = "vLegalDraftDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_G_D_DRAFTID_2 = "vLegalDraftDocument.draftId = ?";
	private static final String _FINDER_COLUMN_G_D_DRAFTID_3 = "(vLegalDraftDocument.draftId IS NULL OR vLegalDraftDocument.draftId = ?)";
	private static final String _FINDER_COLUMN_P_S_D_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_D_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_D_DOCCODE_1 = "vLegalDraftDocument.docCode IS NULL";
	private static final String _FINDER_COLUMN_P_S_D_DOCCODE_2 = "vLegalDraftDocument.docCode = ?";
	private static final String _FINDER_COLUMN_P_S_D_DOCCODE_3 = "(vLegalDraftDocument.docCode IS NULL OR vLegalDraftDocument.docCode = ?)";
	private static final String _FINDER_COLUMN_P_S_F_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_F_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_F_FIELDID_1 = "vLegalDraftDocument.fieldId IS NULL";
	private static final String _FINDER_COLUMN_P_S_F_FIELDID_2 = "vLegalDraftDocument.fieldId = ?";
	private static final String _FINDER_COLUMN_P_S_F_FIELDID_3 = "(vLegalDraftDocument.fieldId IS NULL OR vLegalDraftDocument.fieldId = ?)";
	private static final String _FINDER_COLUMN_P_S_T_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_T_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_T_TYPEID_1 = "vLegalDraftDocument.typeId IS NULL";
	private static final String _FINDER_COLUMN_P_S_T_TYPEID_2 = "vLegalDraftDocument.typeId = ?";
	private static final String _FINDER_COLUMN_P_S_T_TYPEID_3 = "(vLegalDraftDocument.typeId IS NULL OR vLegalDraftDocument.typeId = ?)";
	private static final String _FINDER_COLUMN_P_S_L_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_L_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_L_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_S_L_LANGUAGE_2 = "vLegalDraftDocument.language = ?";
	private static final String _FINDER_COLUMN_P_S_L_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = ?)";
	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vLegalDraftDocument.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = ?)";
	private static final String _FINDER_COLUMN_P_S_U_L_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2 = "vLegalDraftDocument.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_P_S_U_L_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_S_U_L_LANGUAGE_2 = "vLegalDraftDocument.language = ?";
	private static final String _FINDER_COLUMN_P_S_U_L_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = ?)";
	private static final String _FINDER_COLUMN_DOCCODE_DOCCODE_1 = "vLegalDraftDocument.docCode IS NULL";
	private static final String _FINDER_COLUMN_DOCCODE_DOCCODE_2 = "vLegalDraftDocument.docCode = ?";
	private static final String _FINDER_COLUMN_DOCCODE_DOCCODE_3 = "(vLegalDraftDocument.docCode IS NULL OR vLegalDraftDocument.docCode = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDraftDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDraftDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDraftDocument exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalDraftDocumentPersistenceImpl.class);
}