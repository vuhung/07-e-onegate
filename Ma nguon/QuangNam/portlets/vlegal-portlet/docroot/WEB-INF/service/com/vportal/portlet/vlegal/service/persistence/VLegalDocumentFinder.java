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

/**
 * @author ACB
 */
public interface VLegalDocumentFinder {
	public java.util.List findDocByExpiredDate(long groupId,
		java.lang.String language, java.lang.String documentId,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocByExpiredDate(long groupId, java.lang.String language,
		java.lang.String documentId, java.lang.String summary,
		java.lang.String num, java.lang.String symbol, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocOrther(long groupId,
		java.lang.String language, java.lang.String documentId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocOrther(long groupId, java.lang.String language,
		java.lang.String documentId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocOrtherByField(long groupId,
		java.lang.String language, java.lang.String documentId,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocOrtherByField(long groupId,
		java.lang.String language, java.lang.String documentId,
		java.lang.String fieldId, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List count(int promuls, int status);

	public java.util.List findDocument(long groupId, java.lang.String language,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocument(java.lang.String language,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocument(java.lang.String language,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String summary, int promuldate,
		int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocsByPromulDate(long groupId,
		java.lang.String language, java.util.Date proDateFrom,
		java.util.Date proDateTo, int status, int quantity)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocByExpiredDate(long groupId,
		java.lang.String language, java.util.Date expiredDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List search(java.lang.String summary,
		java.lang.String language, int status);

	public java.util.List findByDocByF_C_O_T_L_S(java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, java.lang.String summary,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String docId, int status, int begin, int end)
		throws java.lang.Exception;

	public java.util.List findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language,
		java.lang.String summary, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String docId, int status,
		int begin, int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByDocsByF_O_T_L_S(java.lang.String language,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String summary,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String docId, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocumentByParam(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, java.lang.String content, int status,
		java.lang.String style, int orderBy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByParam(long groupId, java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary,
		java.lang.String content, int status, java.lang.String style)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findBasicDocument(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findBasicDocument(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findBasicDocument(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findBasicDocument(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status,
		int start, int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countBasicDocument(long groupId, java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countBasicDocument(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findAdvanceDocument(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, java.util.Date expDateFrom,
		java.util.Date expDateTo, java.lang.String[] typeIds,
		java.lang.String[] orgIds, java.lang.String[] sigIds,
		java.lang.String content, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findBySummary(long groupId,
		java.lang.String language, int status, java.lang.String summary,
		long departId) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocByDepartId(java.lang.String num,
		java.lang.String symbol, int status, java.lang.String summary,
		long departmentId) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List searchDocument(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List searchDocument(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select,
		int start, int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countSearchDocument(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String fieldId,
		java.lang.String sigId, boolean isNum, boolean isSymbol,
		boolean isSummary, boolean isContent, boolean isPromulDate,
		java.util.Date promulDateFrom, java.util.Date promulDateTo,
		boolean isEffectiveDate, java.util.Date effectiveDateFrom,
		java.util.Date effectiveDateTo, boolean isExpiredDate,
		java.util.Date expireDateFrom, java.util.Date expireDateTo,
		int statusDoc, java.lang.String select)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List count(int arg0, int arg1, int arg2, int arg3);

	public java.util.List search(java.lang.String arg0, java.lang.String arg1,
		int arg2, int arg3, int arg4);
}