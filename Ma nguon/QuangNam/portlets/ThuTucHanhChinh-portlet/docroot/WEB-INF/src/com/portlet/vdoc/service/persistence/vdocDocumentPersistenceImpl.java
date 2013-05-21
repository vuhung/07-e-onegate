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

package com.portlet.vdoc.service.persistence;

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
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.PortletPreferencesPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.portlet.vdoc.NoSuchvdocDocumentException;
import com.portlet.vdoc.model.impl.vdocDocumentImpl;
import com.portlet.vdoc.model.impl.vdocDocumentModelImpl;
import com.portlet.vdoc.model.vdocDocument;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vdoc document service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link vdocDocumentUtil} to access the vdoc document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see vdocDocumentPersistence
 * @see vdocDocumentUtil
 * @generated
 */
public class vdocDocumentPersistenceImpl extends BasePersistenceImpl<vdocDocument>
	implements vdocDocumentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = vdocDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_FIELD_DOC = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByField_Doc",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD_DOC = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByField_Doc",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_F = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_F_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_S_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_S_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_S_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_S_F_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_S_F_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_F_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_S_F_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_STATUS = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByStatus",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByStatus", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_POSITION = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByPosition",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_POSITION = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByPosition", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vdoc document in the entity cache if it is enabled.
	 *
	 * @param vdocDocument the vdoc document to cache
	 */
	public void cacheResult(vdocDocument vdocDocument) {
		EntityCacheUtil.putResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey(), vdocDocument);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
			new Object[] { vdocDocument.getFieldId(), vdocDocument.getDocId() },
			vdocDocument);
	}

	/**
	 * Caches the vdoc documents in the entity cache if it is enabled.
	 *
	 * @param vdocDocuments the vdoc documents to cache
	 */
	public void cacheResult(List<vdocDocument> vdocDocuments) {
		for (vdocDocument vdocDocument : vdocDocuments) {
			if (EntityCacheUtil.getResult(
						vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
						vdocDocumentImpl.class, vdocDocument.getPrimaryKey(),
						this) == null) {
				cacheResult(vdocDocument);
			}
		}
	}

	/**
	 * Clears the cache for all vdoc documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(vdocDocumentImpl.class.getName());
		EntityCacheUtil.clearCache(vdocDocumentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vdoc document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(vdocDocument vdocDocument) {
		EntityCacheUtil.removeResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
			new Object[] { vdocDocument.getFieldId(), vdocDocument.getDocId() });
	}

	/**
	 * Creates a new vdoc document with the primary key. Does not add the vdoc document to the database.
	 *
	 * @param docId the primary key for the new vdoc document
	 * @return the new vdoc document
	 */
	public vdocDocument create(String docId) {
		vdocDocument vdocDocument = new vdocDocumentImpl();

		vdocDocument.setNew(true);
		vdocDocument.setPrimaryKey(docId);

		return vdocDocument;
	}

	/**
	 * Removes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc document to remove
	 * @return the vdoc document that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the vdoc document to remove
	 * @return the vdoc document that was removed
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument remove(String docId)
		throws NoSuchvdocDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			vdocDocument vdocDocument = (vdocDocument)session.get(vdocDocumentImpl.class,
					docId);

			if (vdocDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + docId);
				}

				throw new NoSuchvdocDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					docId);
			}

			return remove(vdocDocument);
		}
		catch (NoSuchvdocDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument removeImpl(vdocDocument vdocDocument)
		throws SystemException {
		vdocDocument = toUnwrappedModel(vdocDocument);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vdocDocument);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		vdocDocumentModelImpl vdocDocumentModelImpl = (vdocDocumentModelImpl)vdocDocument;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
			new Object[] {
				vdocDocumentModelImpl.getFieldId(),
				
			vdocDocumentModelImpl.getDocId()
			});

		EntityCacheUtil.removeResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey());

		return vdocDocument;
	}

	public vdocDocument updateImpl(
		com.portlet.vdoc.model.vdocDocument vdocDocument, boolean merge)
		throws SystemException {
		vdocDocument = toUnwrappedModel(vdocDocument);

		boolean isNew = vdocDocument.isNew();

		vdocDocumentModelImpl vdocDocumentModelImpl = (vdocDocumentModelImpl)vdocDocument;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vdocDocument, merge);

			vdocDocument.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey(), vdocDocument);

		if (!isNew &&
				(!Validator.equals(vdocDocument.getFieldId(),
					vdocDocumentModelImpl.getOriginalFieldId()) ||
				!Validator.equals(vdocDocument.getDocId(),
					vdocDocumentModelImpl.getOriginalDocId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
				new Object[] {
					vdocDocumentModelImpl.getOriginalFieldId(),
					
				vdocDocumentModelImpl.getOriginalDocId()
				});
		}

		if (isNew ||
				(!Validator.equals(vdocDocument.getFieldId(),
					vdocDocumentModelImpl.getOriginalFieldId()) ||
				!Validator.equals(vdocDocument.getDocId(),
					vdocDocumentModelImpl.getOriginalDocId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
				new Object[] { vdocDocument.getFieldId(), vdocDocument.getDocId() },
				vdocDocument);
		}

		return vdocDocument;
	}

	protected vdocDocument toUnwrappedModel(vdocDocument vdocDocument) {
		if (vdocDocument instanceof vdocDocumentImpl) {
			return vdocDocument;
		}

		vdocDocumentImpl vdocDocumentImpl = new vdocDocumentImpl();

		vdocDocumentImpl.setNew(vdocDocument.isNew());
		vdocDocumentImpl.setPrimaryKey(vdocDocument.getPrimaryKey());

		vdocDocumentImpl.setDocId(vdocDocument.getDocId());
		vdocDocumentImpl.setGroupId(vdocDocument.getGroupId());
		vdocDocumentImpl.setLanguage(vdocDocument.getLanguage());
		vdocDocumentImpl.setCompanyId(vdocDocument.getCompanyId());
		vdocDocumentImpl.setUserId(vdocDocument.getUserId());
		vdocDocumentImpl.setCreatedByUser(vdocDocument.getCreatedByUser());
		vdocDocumentImpl.setCreatedDate(vdocDocument.getCreatedDate());
		vdocDocumentImpl.setModifiedByUser(vdocDocument.getModifiedByUser());
		vdocDocumentImpl.setModifiedDate(vdocDocument.getModifiedDate());
		vdocDocumentImpl.setApprovedByUser(vdocDocument.getApprovedByUser());
		vdocDocumentImpl.setApprovedDate(vdocDocument.getApprovedDate());
		vdocDocumentImpl.setPublishedByUser(vdocDocument.getPublishedByUser());
		vdocDocumentImpl.setPublishedDate(vdocDocument.getPublishedDate());
		vdocDocumentImpl.setPromulDate(vdocDocument.getPromulDate());
		vdocDocumentImpl.setEffectivedDate(vdocDocument.getEffectivedDate());
		vdocDocumentImpl.setExpiredDate(vdocDocument.getExpiredDate());
		vdocDocumentImpl.setReplaceDoc(vdocDocument.getReplaceDoc());
		vdocDocumentImpl.setTitle(vdocDocument.getTitle());
		vdocDocumentImpl.setContent(vdocDocument.getContent());
		vdocDocumentImpl.setProcess(vdocDocument.getProcess());
		vdocDocumentImpl.setBase(vdocDocument.getBase());
		vdocDocumentImpl.setTime(vdocDocument.getTime());
		vdocDocumentImpl.setCost(vdocDocument.getCost());
		vdocDocumentImpl.setRequire(vdocDocument.getRequire());
		vdocDocumentImpl.setResult(vdocDocument.getResult());
		vdocDocumentImpl.setObjects(vdocDocument.getObjects());
		vdocDocumentImpl.setStyle(vdocDocument.getStyle());
		vdocDocumentImpl.setPosition(vdocDocument.getPosition());
		vdocDocumentImpl.setNote(vdocDocument.getNote());
		vdocDocumentImpl.setUserHit(vdocDocument.getUserHit());
		vdocDocumentImpl.setStatusDoc(vdocDocument.getStatusDoc());
		vdocDocumentImpl.setTypeDoc(vdocDocument.getTypeDoc());
		vdocDocumentImpl.setHasAttachment(vdocDocument.isHasAttachment());
		vdocDocumentImpl.setFieldId(vdocDocument.getFieldId());
		vdocDocumentImpl.setOrgRels(vdocDocument.getOrgRels());
		vdocDocumentImpl.setFieldRels(vdocDocument.getFieldRels());

		return vdocDocumentImpl;
	}

	/**
	 * Finds the vdoc document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc document to find
	 * @return the vdoc document
	 * @throws com.liferay.portal.NoSuchModelException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vdoc document with the primary key or throws a {@link com.portlet.vdoc.NoSuchvdocDocumentException} if it could not be found.
	 *
	 * @param docId the primary key of the vdoc document to find
	 * @return the vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByPrimaryKey(String docId)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = fetchByPrimaryKey(docId);

		if (vdocDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + docId);
			}

			throw new NoSuchvdocDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				docId);
		}

		return vdocDocument;
	}

	/**
	 * Finds the vdoc document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc document to find
	 * @return the vdoc document, or <code>null</code> if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vdoc document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docId the primary key of the vdoc document to find
	 * @return the vdoc document, or <code>null</code> if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument fetchByPrimaryKey(String docId)
		throws SystemException {
		vdocDocument vdocDocument = (vdocDocument)EntityCacheUtil.getResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
				vdocDocumentImpl.class, docId, this);

		if (vdocDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vdocDocument = (vdocDocument)session.get(vdocDocumentImpl.class,
						docId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vdocDocument != null) {
					cacheResult(vdocDocument);
				}

				closeSession(session);
			}
		}

		return vdocDocument;
	}

	/**
	 * Finds the vdoc document where fieldId = &#63; and docId = &#63; or throws a {@link com.portlet.vdoc.NoSuchvdocDocumentException} if it could not be found.
	 *
	 * @param fieldId the field id to search with
	 * @param docId the doc id to search with
	 * @return the matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByField_Doc(String fieldId, String docId)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = fetchByField_Doc(fieldId, docId);

		if (vdocDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(", docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchvdocDocumentException(msg.toString());
		}

		return vdocDocument;
	}

	/**
	 * Finds the vdoc document where fieldId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fieldId the field id to search with
	 * @param docId the doc id to search with
	 * @return the matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument fetchByField_Doc(String fieldId, String docId)
		throws SystemException {
		return fetchByField_Doc(fieldId, docId, true);
	}

	/**
	 * Finds the vdoc document where fieldId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fieldId the field id to search with
	 * @param docId the doc id to search with
	 * @return the matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument fetchByField_Doc(String fieldId, String docId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { fieldId, docId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_DOC_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FIELD_DOC_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_FIELD_DOC_FIELDID_2);
				}
			}

			if (docId == null) {
				query.append(_FINDER_COLUMN_FIELD_DOC_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FIELD_DOC_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_FIELD_DOC_DOCID_2);
				}
			}

			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (docId != null) {
					qPos.add(docId);
				}

				List<vdocDocument> list = q.list();

				result = list;

				vdocDocument vdocDocument = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
						finderArgs, list);
				}
				else {
					vdocDocument = list.get(0);

					cacheResult(vdocDocument);

					if ((vdocDocument.getFieldId() == null) ||
							!vdocDocument.getFieldId().equals(fieldId) ||
							(vdocDocument.getDocId() == null) ||
							!vdocDocument.getDocId().equals(docId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
							finderArgs, vdocDocument);
					}
				}

				return vdocDocument;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FIELD_DOC,
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
				return (vdocDocument)result;
			}
		}
	}

	/**
	 * Finds all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L(long groupId, String language)
		throws SystemException {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L(long groupId, String language,
		int start, int end) throws SystemException {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByG_L(groupId, language);

		List<vdocDocument> list = findByG_L(groupId, language, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByG_L_PrevAndNext(String docId, long groupId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vdocDocument, groupId,
					language, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_PrevAndNext(session, vdocDocument, groupId,
					language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc) throws SystemException {
		return findByG_L_S(groupId, language, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc, int start, int end) throws SystemException {
		return findByG_L_S(groupId, language, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_S,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_S_First(long groupId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByG_L_S(groupId, language, statusDoc, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_S_Last(long groupId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByG_L_S(groupId, language, statusDoc);

		List<vdocDocument> list = findByG_L_S(groupId, language, statusDoc,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByG_L_S_PrevAndNext(String docId, long groupId,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_S_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_STATUSDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId) throws SystemException {
		return findByG_L_F(groupId, language, fieldId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end) throws SystemException {
		return findByG_L_F(groupId, language, fieldId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, fieldId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_F,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_F,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_F,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_F_First(long groupId, String language,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByG_L_F(groupId, language, fieldId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_F_Last(long groupId, String language,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByG_L_F(groupId, language, fieldId);

		List<vdocDocument> list = findByG_L_F(groupId, language, fieldId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByG_L_F_PrevAndNext(String docId, long groupId,
		String language, String fieldId, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_F_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_F_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_F_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		String fieldId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc) throws SystemException {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end)
		throws SystemException {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, fieldId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_F_S,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_F_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_F_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_F_S_First(long groupId, String language,
		String fieldId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_F_S_Last(long groupId, String language,
		String fieldId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByG_L_F_S(groupId, language, fieldId, statusDoc);

		List<vdocDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByG_L_F_S_PrevAndNext(String docId, long groupId,
		String language, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_F_S_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, statusDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_F_S_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_F_S_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		String fieldId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc) throws SystemException {
		return findByG_L_S_T(groupId, language, statusDoc, typeDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc, int start, int end)
		throws SystemException {
		return findByG_L_S_T(groupId, language, statusDoc, typeDoc, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc, typeDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_S_T,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_T_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_T_STATUSDOC_2);

			query.append(_FINDER_COLUMN_G_L_S_T_TYPEDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				qPos.add(typeDoc);

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_S_T,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_S_T,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_S_T_First(long groupId, String language,
		int statusDoc, int typeDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByG_L_S_T(groupId, language, statusDoc,
				typeDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(", typeDoc=");
			msg.append(typeDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_S_T_Last(long groupId, String language,
		int statusDoc, int typeDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByG_L_S_T(groupId, language, statusDoc, typeDoc);

		List<vdocDocument> list = findByG_L_S_T(groupId, language, statusDoc,
				typeDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(", typeDoc=");
			msg.append(typeDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByG_L_S_T_PrevAndNext(String docId, long groupId,
		String language, int statusDoc, int typeDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_T_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, typeDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_T_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, typeDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_S_T_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, int typeDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_T_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_T_STATUSDOC_2);

		query.append(_FINDER_COLUMN_G_L_S_T_TYPEDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		qPos.add(typeDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc) throws SystemException {
		return findByG_L_S_F_T(groupId, language, statusDoc, fieldId, typeDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc, int start, int end)
		throws SystemException {
		return findByG_L_S_F_T(groupId, language, statusDoc, fieldId, typeDoc,
			start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc, fieldId, typeDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_S_F_T,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_F_T_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(typeDoc);

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_S_F_T,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_S_F_T,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_S_F_T_First(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByG_L_S_F_T(groupId, language, statusDoc,
				fieldId, typeDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", typeDoc=");
			msg.append(typeDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByG_L_S_F_T_Last(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByG_L_S_F_T(groupId, language, statusDoc, fieldId,
				typeDoc);

		List<vdocDocument> list = findByG_L_S_F_T(groupId, language, statusDoc,
				fieldId, typeDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", typeDoc=");
			msg.append(typeDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByG_L_S_F_T_PrevAndNext(String docId,
		long groupId, String language, int statusDoc, String fieldId,
		int typeDoc, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_F_T_PrevAndNext(session, vdocDocument,
					groupId, language, statusDoc, fieldId, typeDoc,
					orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_F_T_PrevAndNext(session, vdocDocument,
					groupId, language, statusDoc, fieldId, typeDoc,
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

	protected vdocDocument getByG_L_S_F_T_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_F_T_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2);

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		qPos.add(typeDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByStatus(int statusDoc)
		throws SystemException {
		return findByStatus(statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vdoc documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByStatus(int statusDoc, int start, int end)
		throws SystemException {
		return findByStatus(statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByStatus(int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUS,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByStatus_First(int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByStatus(statusDoc, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByStatus_Last(int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByStatus(statusDoc);

		List<vdocDocument> list = findByStatus(statusDoc, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByStatus_PrevAndNext(String docId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vdocDocument,
					statusDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByStatus_PrevAndNext(session, vdocDocument,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByStatus_PrevAndNext(Session session,
		vdocDocument vdocDocument, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents where position = &#63;.
	 *
	 * @param position the position to search with
	 * @return the matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByPosition(int position)
		throws SystemException {
		return findByPosition(position, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vdoc documents where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param position the position to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByPosition(int position, int start, int end)
		throws SystemException {
		return findByPosition(position, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param position the position to search with
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findByPosition(int position, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				position,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_POSITION,
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_POSITION_POSITION_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(position);

				list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_POSITION,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_POSITION,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc document in the ordered set where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param position the position to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByPosition_First(int position,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		List<vdocDocument> list = findByPosition(position, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("position=");
			msg.append(position);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc document in the ordered set where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param position the position to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a matching vdoc document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument findByPosition_Last(int position,
		OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		int count = countByPosition(position);

		List<vdocDocument> list = findByPosition(position, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("position=");
			msg.append(position);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc documents before and after the current vdoc document in the ordered set where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param position the position to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc document
	 * @throws com.portlet.vdoc.NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocDocument[] findByPosition_PrevAndNext(String docId,
		int position, OrderByComparator orderByComparator)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByPosition_PrevAndNext(session, vdocDocument,
					position, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByPosition_PrevAndNext(session, vdocDocument,
					position, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByPosition_PrevAndNext(Session session,
		vdocDocument vdocDocument, int position,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_POSITION_POSITION_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(position);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc documents.
	 *
	 * @return the vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @return the range of vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc documents to return
	 * @param end the upper bound of the range of vdoc documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocDocument> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocDocument> list = (List<vdocDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VDOCDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCDOCUMENT.concat(vdocDocumentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Removes the vdoc document where fieldId = &#63; and docId = &#63; from the database.
	 *
	 * @param fieldId the field id to search with
	 * @param docId the doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByField_Doc(String fieldId, String docId)
		throws NoSuchvdocDocumentException, SystemException {
		vdocDocument vdocDocument = findByField_Doc(fieldId, docId);

		remove(vdocDocument);
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String language)
		throws SystemException {
		for (vdocDocument vdocDocument : findByG_L(groupId, language)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_S(long groupId, String language, int statusDoc)
		throws SystemException {
		for (vdocDocument vdocDocument : findByG_L_S(groupId, language,
				statusDoc)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_F(long groupId, String language, String fieldId)
		throws SystemException {
		for (vdocDocument vdocDocument : findByG_L_F(groupId, language, fieldId)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) throws SystemException {
		for (vdocDocument vdocDocument : findByG_L_F_S(groupId, language,
				fieldId, statusDoc)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_S_T(long groupId, String language, int statusDoc,
		int typeDoc) throws SystemException {
		for (vdocDocument vdocDocument : findByG_L_S_T(groupId, language,
				statusDoc, typeDoc)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_S_F_T(long groupId, String language, int statusDoc,
		String fieldId, int typeDoc) throws SystemException {
		for (vdocDocument vdocDocument : findByG_L_S_F_T(groupId, language,
				statusDoc, fieldId, typeDoc)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where statusDoc = &#63; from the database.
	 *
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStatus(int statusDoc) throws SystemException {
		for (vdocDocument vdocDocument : findByStatus(statusDoc)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents where position = &#63; from the database.
	 *
	 * @param position the position to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPosition(int position) throws SystemException {
		for (vdocDocument vdocDocument : findByPosition(position)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Removes all the vdoc documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (vdocDocument vdocDocument : findAll()) {
			remove(vdocDocument);
		}
	}

	/**
	 * Counts all the vdoc documents where fieldId = &#63; and docId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @param docId the doc id to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByField_Doc(String fieldId, String docId)
		throws SystemException {
		Object[] finderArgs = new Object[] { fieldId, docId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FIELD_DOC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_DOC_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FIELD_DOC_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_FIELD_DOC_FIELDID_2);
				}
			}

			if (docId == null) {
				query.append(_FINDER_COLUMN_FIELD_DOC_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FIELD_DOC_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_FIELD_DOC_DOCID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (docId != null) {
					qPos.add(docId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FIELD_DOC,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_S(long groupId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSDOC_2);

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

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_F(long groupId, String language, String fieldId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_F,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_F,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, fieldId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_F_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

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

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_F_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param typeDoc the type doc to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_S_T(long groupId, String language, int statusDoc,
		int typeDoc) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, statusDoc, typeDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_S_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_T_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_T_STATUSDOC_2);

			query.append(_FINDER_COLUMN_G_L_S_T_TYPEDOC_2);

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

				qPos.add(statusDoc);

				qPos.add(typeDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_S_T,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param fieldId the field id to search with
	 * @param typeDoc the type doc to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_S_F_T(long groupId, String language, int statusDoc,
		String fieldId, int typeDoc) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc, fieldId, typeDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_S_F_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_F_T_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2);

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

				qPos.add(statusDoc);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(typeDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_S_F_T,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStatus(int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

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
	 * Counts all the vdoc documents where position = &#63;.
	 *
	 * @param position the position to search with
	 * @return the number of matching vdoc documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPosition(int position) throws SystemException {
		Object[] finderArgs = new Object[] { position };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_POSITION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_POSITION_POSITION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(position);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POSITION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc documents.
	 *
	 * @return the number of vdoc documents
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

				Query q = session.createQuery(_SQL_COUNT_VDOCDOCUMENT);

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
	 * Initializes the vdoc document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.portlet.vdoc.model.vdocDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<vdocDocument>> listenersList = new ArrayList<ModelListener<vdocDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<vdocDocument>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(vdocDocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = vdocDocumentPersistence.class)
	protected vdocDocumentPersistence vdocDocumentPersistence;
	@BeanReference(type = vdocFieldPersistence.class)
	protected vdocFieldPersistence vdocFieldPersistence;
	@BeanReference(type = vdocOrgPersistence.class)
	protected vdocOrgPersistence vdocOrgPersistence;
	@BeanReference(type = vdocDORelPersistence.class)
	protected vdocDORelPersistence vdocDORelPersistence;
	@BeanReference(type = vdocLoggerPersistence.class)
	protected vdocLoggerPersistence vdocLoggerPersistence;
	@BeanReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@BeanReference(type = PortletPreferencesPersistence.class)
	protected PortletPreferencesPersistence portletPreferencesPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VDOCDOCUMENT = "SELECT vdocDocument FROM vdocDocument vdocDocument";
	private static final String _SQL_SELECT_VDOCDOCUMENT_WHERE = "SELECT vdocDocument FROM vdocDocument vdocDocument WHERE ";
	private static final String _SQL_COUNT_VDOCDOCUMENT = "SELECT COUNT(vdocDocument) FROM vdocDocument vdocDocument";
	private static final String _SQL_COUNT_VDOCDOCUMENT_WHERE = "SELECT COUNT(vdocDocument) FROM vdocDocument vdocDocument WHERE ";
	private static final String _FINDER_COLUMN_FIELD_DOC_FIELDID_1 = "vdocDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_FIELD_DOC_FIELDID_2 = "vdocDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_FIELD_DOC_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_FIELD_DOC_DOCID_1 = "vdocDocument.docId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_DOC_DOCID_2 = "vdocDocument.docId = ?";
	private static final String _FINDER_COLUMN_FIELD_DOC_DOCID_3 = "(vdocDocument.docId IS NULL OR vdocDocument.docId = ?)";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vdocDocument.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vdocDocument.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = ?)";
	private static final String _FINDER_COLUMN_G_L_S_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_STATUSDOC_2 = "vdocDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_F_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_1 = "vdocDocument.fieldId IS NULL";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_2 = "vdocDocument.fieldId = ?";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = ?)";
	private static final String _FINDER_COLUMN_G_L_F_S_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_1 = "vdocDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_2 = "vdocDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_STATUSDOC_2 = "vdocDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_S_T_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_STATUSDOC_2 = "vdocDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_TYPEDOC_2 = "vdocDocument.typeDoc = ?";
	private static final String _FINDER_COLUMN_G_L_S_F_T_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2 = "vdocDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_FIELDID_1 = "vdocDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_FIELDID_2 = "vdocDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2 = "vdocDocument.typeDoc = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUSDOC_2 = "vdocDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_POSITION_POSITION_2 = "vdocDocument.position = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocDocument exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(vdocDocumentPersistenceImpl.class);
}