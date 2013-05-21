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

import com.vportal.portal.NoSuchAttachmentException;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.model.impl.AttachmentImpl;
import com.vportal.portal.model.impl.AttachmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the attachment service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link AttachmentUtil} to access the attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AttachmentPersistence
 * @see AttachmentUtil
 * @generated
 */
public class AttachmentPersistenceImpl extends BasePersistenceImpl<Attachment>
	implements AttachmentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = AttachmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_ENTRY = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByEntry",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTRY = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByEntry",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_C_F_N = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByC_F_N",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_C_F_N = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByC_F_N",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the attachment in the entity cache if it is enabled.
	 *
	 * @param attachment the attachment to cache
	 */
	public void cacheResult(Attachment attachment) {
		EntityCacheUtil.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey(), attachment);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_F_N,
			new Object[] {
				attachment.getEntryClass(), new Long(attachment.getFolderId()),
				
			attachment.getFileName()
			}, attachment);
	}

	/**
	 * Caches the attachments in the entity cache if it is enabled.
	 *
	 * @param attachments the attachments to cache
	 */
	public void cacheResult(List<Attachment> attachments) {
		for (Attachment attachment : attachments) {
			if (EntityCacheUtil.getResult(
						AttachmentModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentImpl.class, attachment.getPrimaryKey(), this) == null) {
				cacheResult(attachment);
			}
		}
	}

	/**
	 * Clears the cache for all attachments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(AttachmentImpl.class.getName());
		EntityCacheUtil.clearCache(AttachmentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the attachment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Attachment attachment) {
		EntityCacheUtil.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_F_N,
			new Object[] {
				attachment.getEntryClass(), new Long(attachment.getFolderId()),
				
			attachment.getFileName()
			});
	}

	/**
	 * Creates a new attachment with the primary key. Does not add the attachment to the database.
	 *
	 * @param attachmentId the primary key for the new attachment
	 * @return the new attachment
	 */
	public Attachment create(long attachmentId) {
		Attachment attachment = new AttachmentImpl();

		attachment.setNew(true);
		attachment.setPrimaryKey(attachmentId);

		return attachment;
	}

	/**
	 * Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attachment to remove
	 * @return the attachment that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentId the primary key of the attachment to remove
	 * @return the attachment that was removed
	 * @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment remove(long attachmentId)
		throws NoSuchAttachmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Attachment attachment = (Attachment)session.get(AttachmentImpl.class,
					new Long(attachmentId));

			if (attachment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + attachmentId);
				}

				throw new NoSuchAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					attachmentId);
			}

			return remove(attachment);
		}
		catch (NoSuchAttachmentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Attachment removeImpl(Attachment attachment)
		throws SystemException {
		attachment = toUnwrappedModel(attachment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, attachment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		AttachmentModelImpl attachmentModelImpl = (AttachmentModelImpl)attachment;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_F_N,
			new Object[] {
				attachmentModelImpl.getEntryClass(),
				new Long(attachmentModelImpl.getFolderId()),
				
			attachmentModelImpl.getFileName()
			});

		EntityCacheUtil.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey());

		return attachment;
	}

	public Attachment updateImpl(
		com.vportal.portal.model.Attachment attachment, boolean merge)
		throws SystemException {
		attachment = toUnwrappedModel(attachment);

		boolean isNew = attachment.isNew();

		AttachmentModelImpl attachmentModelImpl = (AttachmentModelImpl)attachment;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, attachment, merge);

			attachment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey(), attachment);

		if (!isNew &&
				(!Validator.equals(attachment.getEntryClass(),
					attachmentModelImpl.getOriginalEntryClass()) ||
				(attachment.getFolderId() != attachmentModelImpl.getOriginalFolderId()) ||
				!Validator.equals(attachment.getFileName(),
					attachmentModelImpl.getOriginalFileName()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_F_N,
				new Object[] {
					attachmentModelImpl.getOriginalEntryClass(),
					new Long(attachmentModelImpl.getOriginalFolderId()),
					
				attachmentModelImpl.getOriginalFileName()
				});
		}

		if (isNew ||
				(!Validator.equals(attachment.getEntryClass(),
					attachmentModelImpl.getOriginalEntryClass()) ||
				(attachment.getFolderId() != attachmentModelImpl.getOriginalFolderId()) ||
				!Validator.equals(attachment.getFileName(),
					attachmentModelImpl.getOriginalFileName()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_F_N,
				new Object[] {
					attachment.getEntryClass(),
					new Long(attachment.getFolderId()),
					
				attachment.getFileName()
				}, attachment);
		}

		return attachment;
	}

	protected Attachment toUnwrappedModel(Attachment attachment) {
		if (attachment instanceof AttachmentImpl) {
			return attachment;
		}

		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setNew(attachment.isNew());
		attachmentImpl.setPrimaryKey(attachment.getPrimaryKey());

		attachmentImpl.setAttachmentId(attachment.getAttachmentId());
		attachmentImpl.setGroupId(attachment.getGroupId());
		attachmentImpl.setCompanyId(attachment.getCompanyId());
		attachmentImpl.setEntryId(attachment.getEntryId());
		attachmentImpl.setEntryClass(attachment.getEntryClass());
		attachmentImpl.setFileEntryId(attachment.getFileEntryId());
		attachmentImpl.setFolderId(attachment.getFolderId());
		attachmentImpl.setFileName(attachment.getFileName());
		attachmentImpl.setImageId(attachment.getImageId());
		attachmentImpl.setExtension(attachment.getExtension());

		return attachmentImpl;
	}

	/**
	 * Finds the attachment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment to find
	 * @return the attachment
	 * @throws com.liferay.portal.NoSuchModelException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the attachment with the primary key or throws a {@link com.vportal.portal.NoSuchAttachmentException} if it could not be found.
	 *
	 * @param attachmentId the primary key of the attachment to find
	 * @return the attachment
	 * @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment findByPrimaryKey(long attachmentId)
		throws NoSuchAttachmentException, SystemException {
		Attachment attachment = fetchByPrimaryKey(attachmentId);

		if (attachment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + attachmentId);
			}

			throw new NoSuchAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				attachmentId);
		}

		return attachment;
	}

	/**
	 * Finds the attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment to find
	 * @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attachmentId the primary key of the attachment to find
	 * @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment fetchByPrimaryKey(long attachmentId)
		throws SystemException {
		Attachment attachment = (Attachment)EntityCacheUtil.getResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentImpl.class, attachmentId, this);

		if (attachment == null) {
			Session session = null;

			try {
				session = openSession();

				attachment = (Attachment)session.get(AttachmentImpl.class,
						new Long(attachmentId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (attachment != null) {
					cacheResult(attachment);
				}

				closeSession(session);
			}
		}

		return attachment;
	}

	/**
	 * Finds all the attachments where entryId = &#63; and entryClass = &#63;.
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @return the matching attachments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Attachment> findByEntry(long entryId, String entryClass)
		throws SystemException {
		return findByEntry(entryId, entryClass, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the attachments where entryId = &#63; and entryClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @param start the lower bound of the range of attachments to return
	 * @param end the upper bound of the range of attachments to return (not inclusive)
	 * @return the range of matching attachments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Attachment> findByEntry(long entryId, String entryClass,
		int start, int end) throws SystemException {
		return findByEntry(entryId, entryClass, start, end, null);
	}

	/**
	 * Finds an ordered range of all the attachments where entryId = &#63; and entryClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @param start the lower bound of the range of attachments to return
	 * @param end the upper bound of the range of attachments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching attachments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Attachment> findByEntry(long entryId, String entryClass,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				entryId, entryClass,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Attachment> list = (List<Attachment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ENTRY,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_ENTRYID_2);

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_1);
			}
			else {
				if (entryClass.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_3);
				}
				else {
					query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_2);
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

				qPos.add(entryId);

				if (entryClass != null) {
					qPos.add(entryClass);
				}

				list = (List<Attachment>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ENTRY,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ENTRY,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching attachment
	 * @throws com.vportal.portal.NoSuchAttachmentException if a matching attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment findByEntry_First(long entryId, String entryClass,
		OrderByComparator orderByComparator)
		throws NoSuchAttachmentException, SystemException {
		List<Attachment> list = findByEntry(entryId, entryClass, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryId=");
			msg.append(entryId);

			msg.append(", entryClass=");
			msg.append(entryClass);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAttachmentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching attachment
	 * @throws com.vportal.portal.NoSuchAttachmentException if a matching attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment findByEntry_Last(long entryId, String entryClass,
		OrderByComparator orderByComparator)
		throws NoSuchAttachmentException, SystemException {
		int count = countByEntry(entryId, entryClass);

		List<Attachment> list = findByEntry(entryId, entryClass, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryId=");
			msg.append(entryId);

			msg.append(", entryClass=");
			msg.append(entryClass);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAttachmentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the attachments before and after the current attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param attachmentId the primary key of the current attachment
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next attachment
	 * @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment[] findByEntry_PrevAndNext(long attachmentId,
		long entryId, String entryClass, OrderByComparator orderByComparator)
		throws NoSuchAttachmentException, SystemException {
		Attachment attachment = findByPrimaryKey(attachmentId);

		Session session = null;

		try {
			session = openSession();

			Attachment[] array = new AttachmentImpl[3];

			array[0] = getByEntry_PrevAndNext(session, attachment, entryId,
					entryClass, orderByComparator, true);

			array[1] = attachment;

			array[2] = getByEntry_PrevAndNext(session, attachment, entryId,
					entryClass, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Attachment getByEntry_PrevAndNext(Session session,
		Attachment attachment, long entryId, String entryClass,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ATTACHMENT_WHERE);

		query.append(_FINDER_COLUMN_ENTRY_ENTRYID_2);

		if (entryClass == null) {
			query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_1);
		}
		else {
			if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_3);
			}
			else {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_2);
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

		qPos.add(entryId);

		if (entryClass != null) {
			qPos.add(entryClass);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(attachment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Attachment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or throws a {@link com.vportal.portal.NoSuchAttachmentException} if it could not be found.
	 *
	 * @param entryClass the entry class to search with
	 * @param folderId the folder id to search with
	 * @param fileName the file name to search with
	 * @return the matching attachment
	 * @throws com.vportal.portal.NoSuchAttachmentException if a matching attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment findByC_F_N(String entryClass, long folderId,
		String fileName) throws NoSuchAttachmentException, SystemException {
		Attachment attachment = fetchByC_F_N(entryClass, folderId, fileName);

		if (attachment == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryClass=");
			msg.append(entryClass);

			msg.append(", folderId=");
			msg.append(folderId);

			msg.append(", fileName=");
			msg.append(fileName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAttachmentException(msg.toString());
		}

		return attachment;
	}

	/**
	 * Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entryClass the entry class to search with
	 * @param folderId the folder id to search with
	 * @param fileName the file name to search with
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment fetchByC_F_N(String entryClass, long folderId,
		String fileName) throws SystemException {
		return fetchByC_F_N(entryClass, folderId, fileName, true);
	}

	/**
	 * Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entryClass the entry class to search with
	 * @param folderId the folder id to search with
	 * @param fileName the file name to search with
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Attachment fetchByC_F_N(String entryClass, long folderId,
		String fileName, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { entryClass, folderId, fileName };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_F_N,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_1);
			}
			else {
				if (entryClass.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_3);
				}
				else {
					query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_2);
				}
			}

			query.append(_FINDER_COLUMN_C_F_N_FOLDERID_2);

			if (fileName == null) {
				query.append(_FINDER_COLUMN_C_F_N_FILENAME_1);
			}
			else {
				if (fileName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_C_F_N_FILENAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_C_F_N_FILENAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (entryClass != null) {
					qPos.add(entryClass);
				}

				qPos.add(folderId);

				if (fileName != null) {
					qPos.add(fileName);
				}

				List<Attachment> list = q.list();

				result = list;

				Attachment attachment = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_F_N,
						finderArgs, list);
				}
				else {
					attachment = list.get(0);

					cacheResult(attachment);

					if ((attachment.getEntryClass() == null) ||
							!attachment.getEntryClass().equals(entryClass) ||
							(attachment.getFolderId() != folderId) ||
							(attachment.getFileName() == null) ||
							!attachment.getFileName().equals(fileName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_F_N,
							finderArgs, attachment);
					}
				}

				return attachment;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_F_N,
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
				return (Attachment)result;
			}
		}
	}

	/**
	 * Finds all the attachments.
	 *
	 * @return the attachments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Attachment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachments to return
	 * @param end the upper bound of the range of attachments to return (not inclusive)
	 * @return the range of attachments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Attachment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachments to return
	 * @param end the upper bound of the range of attachments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of attachments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Attachment> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Attachment> list = (List<Attachment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ATTACHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ATTACHMENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the attachments where entryId = &#63; and entryClass = &#63; from the database.
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByEntry(long entryId, String entryClass)
		throws SystemException {
		for (Attachment attachment : findByEntry(entryId, entryClass)) {
			remove(attachment);
		}
	}

	/**
	 * Removes the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; from the database.
	 *
	 * @param entryClass the entry class to search with
	 * @param folderId the folder id to search with
	 * @param fileName the file name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByC_F_N(String entryClass, long folderId, String fileName)
		throws NoSuchAttachmentException, SystemException {
		Attachment attachment = findByC_F_N(entryClass, folderId, fileName);

		remove(attachment);
	}

	/**
	 * Removes all the attachments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Attachment attachment : findAll()) {
			remove(attachment);
		}
	}

	/**
	 * Counts all the attachments where entryId = &#63; and entryClass = &#63;.
	 *
	 * @param entryId the entry id to search with
	 * @param entryClass the entry class to search with
	 * @return the number of matching attachments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByEntry(long entryId, String entryClass)
		throws SystemException {
		Object[] finderArgs = new Object[] { entryId, entryClass };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ENTRY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_ENTRYID_2);

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_1);
			}
			else {
				if (entryClass.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_3);
				}
				else {
					query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(entryId);

				if (entryClass != null) {
					qPos.add(entryClass);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ENTRY,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the attachments where entryClass = &#63; and folderId = &#63; and fileName = &#63;.
	 *
	 * @param entryClass the entry class to search with
	 * @param folderId the folder id to search with
	 * @param fileName the file name to search with
	 * @return the number of matching attachments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByC_F_N(String entryClass, long folderId, String fileName)
		throws SystemException {
		Object[] finderArgs = new Object[] { entryClass, folderId, fileName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C_F_N,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_1);
			}
			else {
				if (entryClass.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_3);
				}
				else {
					query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_2);
				}
			}

			query.append(_FINDER_COLUMN_C_F_N_FOLDERID_2);

			if (fileName == null) {
				query.append(_FINDER_COLUMN_C_F_N_FILENAME_1);
			}
			else {
				if (fileName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_C_F_N_FILENAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_C_F_N_FILENAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (entryClass != null) {
					qPos.add(entryClass);
				}

				qPos.add(folderId);

				if (fileName != null) {
					qPos.add(fileName);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_F_N,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the attachments.
	 *
	 * @return the number of attachments
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

				Query q = session.createQuery(_SQL_COUNT_ATTACHMENT);

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
	 * Initializes the attachment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portal.model.Attachment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Attachment>> listenersList = new ArrayList<ModelListener<Attachment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Attachment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AttachmentImpl.class.getName());
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
	private static final String _SQL_SELECT_ATTACHMENT = "SELECT attachment FROM Attachment attachment";
	private static final String _SQL_SELECT_ATTACHMENT_WHERE = "SELECT attachment FROM Attachment attachment WHERE ";
	private static final String _SQL_COUNT_ATTACHMENT = "SELECT COUNT(attachment) FROM Attachment attachment";
	private static final String _SQL_COUNT_ATTACHMENT_WHERE = "SELECT COUNT(attachment) FROM Attachment attachment WHERE ";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYID_2 = "attachment.entryId = ? AND ";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYCLASS_1 = "attachment.entryClass IS NULL";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYCLASS_2 = "attachment.entryClass = ?";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = ?)";
	private static final String _FINDER_COLUMN_C_F_N_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_C_F_N_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_C_F_N_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = ?) AND ";
	private static final String _FINDER_COLUMN_C_F_N_FOLDERID_2 = "attachment.folderId = ? AND ";
	private static final String _FINDER_COLUMN_C_F_N_FILENAME_1 = "attachment.fileName IS NULL";
	private static final String _FINDER_COLUMN_C_F_N_FILENAME_2 = "attachment.fileName = ?";
	private static final String _FINDER_COLUMN_C_F_N_FILENAME_3 = "(attachment.fileName IS NULL OR attachment.fileName = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "attachment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Attachment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Attachment exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(AttachmentPersistenceImpl.class);
}