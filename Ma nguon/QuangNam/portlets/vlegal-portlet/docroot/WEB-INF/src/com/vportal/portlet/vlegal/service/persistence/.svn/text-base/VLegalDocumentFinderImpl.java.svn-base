package com.vportal.portlet.vlegal.service.persistence;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl;

public class VLegalDocumentFinderImpl extends BasePersistenceImpl implements
		VLegalDocumentFinder {
	public static String FIND_BY_D = VLegalDocumentFinder.class.getName()
			+ ".findDocument";
	public static String COUNT_BY_D = VLegalDocumentFinder.class.getName()
			+ ".countDocument";

	// Function getDoc expiredDate
	public List findDocByExpiredDate(long groupId, String language,
			String documentId, String summary, String num, String symbol,
			int status) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE ");

			if (Validator.isNotNull(String.valueOf(groupId))) {

				query.append("VLegalDocument.groupId = ? ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(documentId)) {
				query.append("AND ");
				query.append("VLegalDocument.docId <> ?	");
			}

			if (Validator.isNotNull(summary)) {
				query.append("LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(num)) {
				query.append("AND ");
				query.append("LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append("AND ");
				query.append("LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (status == 0 || status == 1 || status == 2) {
				query.append("AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.createdDate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(documentId)) {
				q.setString(queryPos++, documentId);
			}

			if (Validator.isNotNull(summary)) {
				q.setString(queryPos++, "%" + summary + "%");
			}
			if (Validator.isNotNull(num)) {
				q.setString(queryPos++, "%" + num + "%");
			}
			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (status == 2 || status == 1 || status == 0) {
				q.setInteger(queryPos++, status);
			}

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDocByExpiredDate(long groupId, String language,
			String documentId, String summary, String num, String symbol,
			int status) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(COUNT_BY_D);
			String sql = "SELECT COUNT(*) as total FROM VLegalDocument "; //change by vanvtk
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE ");

			if (Validator.isNotNull(String.valueOf(groupId))) {

				query.append("VLegalDocument.groupId = ? ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(documentId)) {
				query.append("AND ");
				query.append("VLegalDocument.docId <> ?	");
			}

			if (Validator.isNotNull(summary)) {
				query.append("LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(num)) {
				query.append("AND ");
				query.append("LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append("AND ");
				query.append("LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (status == 0 || status == 1 || status == 2) {
				query.append("AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(documentId)) {
				q.setString(queryPos++, documentId);
			}

			if (Validator.isNotNull(summary)) {
				q.setString(queryPos++, "%" + summary + "%");
			}
			if (Validator.isNotNull(num)) {
				q.setString(queryPos++, "%" + num + "%");
			}
			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (status == 2 || status == 1 || status == 0) {
				q.setInteger(queryPos++, status);
			}

			Long count = null;
			Iterator ite = q.list().iterator();
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findDocOrther(long groupId, String language, String documentId,
			int status) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE ");

			if (Validator.isNotNull(String.valueOf(groupId))) {

				query.append("VLegalDocument.groupId = ? ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(documentId)) {
				query.append("AND ");
				query.append("VLegalDocument.docId <> ?	");
			}

			query.append("AND ");
			query.append("VLegalDocument.statusDoc = ? ");

			query.append("ORDER BY ");
			query.append("VLegalDocument.createdDate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(documentId)) {
				q.setString(queryPos++, documentId);
			}
			q.setInteger(queryPos++, status);

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	
	public int countDocOrther(long groupId, String language, String documentId,
			int status) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(COUNT_BY_D);
			String sql = "SELECT COUNT(*) as total FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE ");

			if (Validator.isNotNull(String.valueOf(groupId))) {

				query.append("VLegalDocument.groupId = ? ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(documentId)) {
				query.append("AND ");
				query.append("VLegalDocument.docId <> ?	");
			}

			query.append("AND ");
			query.append("VLegalDocument.statusDoc = ? ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(documentId)) {
				q.setString(queryPos++, documentId);
			}
			q.setInteger(queryPos++, status);

			Long count = null;
			Iterator ite = q.list().iterator();
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	// find orther document by field
	public List findDocOrtherByField(long groupId, String language,
			String documentId, String fieldId, int status)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE (VLegalDocument.groupId = ? ) ");
			query.append("AND (VLegalDocument.language = ? ) ");
			query.append("AND (VLegalDocument.docId <> ? )");
			query.append("AND (VLegalDocument.statusDoc = ?) ");
			query.append("AND (VLegalDocument.fieldId = ?) ");
			query.append("ORDER BY VLegalDocument.publishedDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setString(queryPos++, documentId);
			q.setInteger(queryPos++, status);
			q.setString(queryPos++, fieldId);

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findDocOrtherByField(long groupId, String language,
			String documentId, String fieldId, int status, int begin, int end)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE (VLegalDocument.groupId = ? ) ");
			query.append("AND (VLegalDocument.language = ? ) ");
			query.append("AND (VLegalDocument.docId <> ? )");
			query.append("AND (VLegalDocument.statusDoc = ?) ");
			query.append("AND (VLegalDocument.fieldId = ?) ");
			query.append("ORDER BY VLegalDocument.publishedDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setString(queryPos++, documentId);
			q.setInteger(queryPos++, status);
			q.setString(queryPos++, fieldId);

			return QueryUtil.list(q, getDialect(), begin, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public List count(int promuls, int status)
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("WHERE ");
			query.append(" YEAR(VLegalDocument.promuldate) = ?");
			query.append(" AND ");
			query.append("VLegalDocument.statusDoc = ?");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;
			q.setInteger(queryPos++, promuls);
			q.setInteger(queryPos++, status);
			return q.list();
			
		}catch(Exception ex)
		{
			System.out.println("Khong co du lieu");
			ex.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List findDocument(long groupId, String language, String summary,
			String num, String symbol, int status, int begin, int end)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_D);
			StringBuffer query = new StringBuffer();
			query.append(sql);
			boolean crit = (!summary.equalsIgnoreCase("N/A"));
			if (crit) {
				query.append(" WHERE ");
			}
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("VLegalDocument.groupId = ? ");
			}

			if (!summary.equalsIgnoreCase("N/A")) {
				if (Validator.isNull(String.valueOf(groupId))) {
					query.append("AND ");
				}
				query.append("LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(num)) {
				query.append("AND ");
				query.append("VLegalDocument.num = ? ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append("AND ");
				query.append("VLegalDocument.symbol LIKE ? ");
			}

			if (status == 3) {
				query.append("AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.publisheddate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (!language.equalsIgnoreCase("N/A"))
				q.setString(queryPos++, language);
			if (!summary.equalsIgnoreCase("N/A"))
				q.setString(queryPos++, summary);
			if (Validator.isNotNull(num))
				q.setString(queryPos++, num);
			if (Validator.isNotNull(symbol))
				q.setString(queryPos++, "%" + symbol + "%");
			if (status == 3)
				q.setInteger(queryPos++, status);

			if (end > 0) {
				return QueryUtil.list(q, getDialect(), begin, end);
			} else {
				return q.list();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List findDocument(String language, String orgId, String typeDocId, String fieldId, int status, int begin, int end) throws SystemException
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("WHERE ");

			query.append("(VLegalDocument.language = ?) ");
			
			if(Validator.isNotNull(orgId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.orgId = ?) ");
			}
			if(Validator.isNotNull(typeDocId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.typeDocId = ?) ");
			}
			if(Validator.isNotNull(fieldId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.fieldId = ?) ");
			}
			if(status == 1)
			{
				query.append("AND ");
				query.append("(VLegalDocument.statusDoc = ?) ");
				query.append("ORDER BY ");
				query.append("VLegalDocument.publishedDate DESC ");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;
			q.setString(queryPos++, language);
			if(Validator.isNotNull(orgId))
			{
				q.setString(queryPos++, orgId);
			}
			if(Validator.isNotNull(typeDocId))
			{
				q.setString(queryPos++, typeDocId);
			}
			if(Validator.isNotNull(fieldId))
			{
				q.setString(queryPos++, fieldId);
			}
			if(status == 1)
			{
				q.setInteger(queryPos++, status);
			}
			return QueryUtil.list(q, getDialect(), begin, end);
			
		}catch(Exception ex)
		{
			throw new SystemException(ex);
		}
		finally{
			closeSession(session);
		}
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List findDocument(String language, String orgId, String typeDocId, String fieldId, String summary, int promuldate, int status, int begin, int end) throws SystemException
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("WHERE ");

			query.append("(VLegalDocument.language = ?) ");
			
			if(Validator.isNotNull(orgId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.orgId = ?) ");
			}
			if(Validator.isNotNull(typeDocId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.typeDocId = ?) ");
			}
			if(Validator.isNotNull(fieldId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.fieldId = ?) ");
			}
			if(Validator.isNotNull(summary))
			{
				query.append("AND ");
				query.append("(LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}
			if(promuldate != 0)
			{
				query.append(" AND ");
				query.append("YEAR(VLegalDocument.promuldate) = ? ");
			}
			if(status == 1)
			{
				query.append("AND ");
				query.append("(VLegalDocument.statusDoc = ?) ");
				query.append("ORDER BY ");
				query.append("VLegalDocument.publishedDate DESC ");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;
			q.setString(queryPos++, language);
			if(Validator.isNotNull(orgId))
			{
				q.setString(queryPos++, orgId);
			}
			if(Validator.isNotNull(typeDocId))
			{
				q.setString(queryPos++, typeDocId);
			}
			if(Validator.isNotNull(fieldId))
			{
				q.setString(queryPos++, fieldId);
			}
			if(Validator.isNotNull(summary))
			{
				q.setString(queryPos++, "%" + summary + "%");
			}
			if(promuldate != 0)
			{
				q.setInteger(queryPos++, promuldate);
			}
			if(status == 1)
			{
				q.setInteger(queryPos++, status);
			}
			return QueryUtil.list(q, getDialect(), begin, end);
			
		}catch(Exception ex)
		{
			throw new SystemException(ex);
		}
		finally{
			closeSession(session);
		}
	}
	
	/*@SuppressWarnings({ "rawtypes", "deprecation" })
	public List findDocument(long groupId, String language, String summary,
			String num, String symbol, int status, int begin, int end)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			boolean crit = (!summary.equalsIgnoreCase("N/A"));
			if (crit) {
				query.append(" WHERE ");
			}
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("VLegalDocument.groupId = ? ");
			}

			if (!summary.equalsIgnoreCase("N/A")) {
				if (Validator.isNull(String.valueOf(groupId))) {
					query.append("AND ");
				}
				query.append("LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(num)) {
				query.append("AND ");
				query.append("VLegalDocument.num = ? ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append("AND ");
				query.append("VLegalDocument.symbol LIKE ? ");
			}

			if (status == 3) {
				query.append("AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.publisheddate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (!language.equalsIgnoreCase("N/A"))
				q.setString(queryPos++, language);
			if (!summary.equalsIgnoreCase("N/A"))
				q.setString(queryPos++, summary);
			if (Validator.isNotNull(num))
				q.setString(queryPos++, num);
			if (Validator.isNotNull(symbol))
				q.setString(queryPos++, "%" + symbol + "%");
			if (status == 3)
				q.setInteger(queryPos++, status);

			if (end > 0) {
				return QueryUtil.list(q, getDialect(), begin, end);
			} else {
				return q.list();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}*/

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List findDocsByPromulDate(long groupId, String language,
			Date proDateFrom, Date proDateTo, int status, int quantity)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" VLegalDocument.groupId = ? ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" AND ");
				query.append(" VLegalDocument.language = ? ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append(" VLegalDocument.promulDate >= ? ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append("VLegalDocument.promulDate <= ? ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append(" AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.promuldate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));
			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), 0, quantity);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findDocByExpiredDate(long groupId, String language,
			Date expiredDate) throws SystemException {
		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" VLegalDocument.groupId = ? ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" AND ");
				query.append(" VLegalDocument.language = ? ");
			}

			if (expiredDate != null) {
				query.append(" AND ");
				query.append(" VLegalDocument.expiredDate = ? ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.createdDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (expiredDate != null)
				q.setTimestamp(queryPos++, new Timestamp(expiredDate.getTime()));

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List search(String summary, String language, int status)
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			query.append(" VLegalDocument.language = ? ");
			query.append(" AND ");
			query.append(" LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			query.append(" AND ");
			query.append(" VLegalDocument.statusDoc = ? ");
			query.append(" ORDER BY ");
			query.append(" VLegalDocument.promuldate DESC ");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			
			int queryPos = 0;
			q.setString(queryPos++, language);
			q.setString(queryPos++, "%" + summary + "%");
			q.setInteger(queryPos++, status);
			
			return q.list();
			
		}catch(Exception ex)
		{
			
		}
		finally
		{
			closeSession(session);
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List findByDocByF_C_O_T_L_S(String typeDocId, String orgId, String fieldId, String language, String summary, Date proDateFrom, Date proDateTo, String docId, int status, int begin, int end) throws Exception
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			if(language == null)
			{
				return null;
			}
			else
			{
				query.append("VLegalDocument.language = ? ");
			}
			if(Validator.isNotNull(summary))
			{
				query.append("AND ");
				query.append(" LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}
			if(Validator.isNotNull(typeDocId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.typeDocId = ?) ");
			}
			if(Validator.isNotNull(orgId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.orgId = ?) ");
			}
			if(Validator.isNotNull(fieldId))
			{
				query.append("AND ");
				query.append("(VLegalDocument.fieldId = ?) ");
			}
/*			if(proDateFrom != null)
			{
				query.append("AND ");
				query.append("VLegalDocument.promulDate <= ? " );
			}
			if(proDateTo != null)
			{
				query.append("AND ");
				query.append("VLegalDocument.proDateTo >= ? ");
			}*/
			if(status == 2 || status == 1 || status == 0)
			{
				query.append("AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}
			if(Validator.isNotNull(docId))
			{
				query.append("AND ");
				query.append("VLegalDocument.docId <> ? ");
			}
			query.append("ORDER BY ");
			query.append("VLegalDocument.promulDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			
			int queryPos = 0;
			
			q.setString(queryPos++, language);
			if(Validator.isNotNull(summary))
			{
				q.setString(queryPos++, "%" + summary + "%");
			}
			if(Validator.isNotNull(typeDocId))
			{
				q.setString(queryPos++, typeDocId);
			}
			if(Validator.isNotNull(fieldId))
			{
				q.setString(queryPos++, fieldId);
			}
			if(Validator.isNotNull(orgId))
			{
				q.setString(queryPos++, orgId);
			}
			/*if(proDateFrom != null)
			{
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));
			}
			if(proDateTo != null)
			{
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));
			}*/
			if(status == 2 || status == 1 || status == 0)
			{
				q.setInteger(queryPos++, status);
			}
			if(Validator.isNotNull(docId))
			{
				q.setString(queryPos++, docId);
			}
			return QueryUtil.list(q, getDialect(), begin, end);
			
		}catch(Exception ex)
		{
			throw new SystemException(ex);
		}finally
		{
			closeSession(session);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List findByDocsByF_O_T_L_S(long groupId, String typeDocId,
			String orgId, String fieldId, String language, String summary,
			Date proDateFrom, Date proDateTo, String docId, int status,
			int begin, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("VLegalDocument.groupId = ? ");
			}

			if (Validator.isNotNull(summary)) {
				query.append("AND ");
				query.append(" LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(typeDocId)) {
				query.append("AND ");
				query.append("VLegalDocument.typeDocId = ? ");
			}

			if (Validator.isNotNull(orgId)) {
				query.append("AND ");
				query.append("VLegalDocument.orgId = ? ");
			}

			if (Validator.isNotNull(fieldId)) {
				query.append("AND ");
				query.append("VLegalDocument.fieldId = ? ");
			}

			if (proDateTo != null) {
				query.append("AND ");
				query.append("VLegalDocument.promulDate >= ? ");
			}

			if (proDateFrom != null) {
				query.append("AND ");
				query.append("VLegalDocument.promulDate <= ? ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append("AND ");
				query.append("VLegalDocument.statusDoc = ? ");
			}
			if (Validator.isNotNull(docId)) {
				query.append("AND ");
				query.append("VLegalDocument.docId <> ? ");
			}
			query.append("ORDER BY ");
			query.append("VLegalDocument.promuldate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");
			if (Validator.isNotNull(typeDocId))
				q.setString(queryPos++, typeDocId);
			if (Validator.isNotNull(orgId))
				q.setString(queryPos++, orgId);
			if (Validator.isNotNull(fieldId))
				q.setString(queryPos++, fieldId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));
			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);
			if (Validator.isNotNull(docId))
				q.setString(queryPos++, docId);

			return QueryUtil.list(q, getDialect(), begin, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List findByDocsByF_O_T_L_S(String language, String typeDocId,
			String orgId, String fieldId, String summary,
			Date proDateFrom, Date proDateTo, String docId, int status,
			int begin, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append("VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(summary)) {
				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(typeDocId)) {
				query.append(" AND ");
				query.append("VLegalDocument.typeDocId = ? ");
			}

			if (Validator.isNotNull(orgId)) {
				query.append(" AND ");
				query.append(" VLegalDocument.orgId = ? ");
			}

			if (Validator.isNotNull(fieldId)) {
				query.append(" AND ");
				query.append(" VLegalDocument.fieldId = ? ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append(" VLegalDocument.promulDate >= ? ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append("VLegalDocument.promulDate <= ? ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append(" AND ");
				query.append(" VLegalDocument.statusDoc = ? ");
			}
			if (Validator.isNotNull(docId)) {
				query.append(" AND ");
				query.append(" VLegalDocument.docId <> ? ");
			}
			query.append(" ORDER BY ");
			query.append(" VLegalDocument.promuldate ASC ");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setString(queryPos++, language);

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");
			if (Validator.isNotNull(typeDocId))
				q.setString(queryPos++, typeDocId);
			if (Validator.isNotNull(orgId))
				q.setString(queryPos++, orgId);
			if (Validator.isNotNull(fieldId))
				q.setString(queryPos++, fieldId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));
			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);
			if (Validator.isNotNull(docId))
				q.setString(queryPos++, docId);

			return QueryUtil.list(q, getDialect(), begin, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	// Add 10/08/2009
	public List findDocumentByParam(long groupId, String language,
			String number, String symbol, String fieldId, String orgId,
			String typeId, Date proDateFrom, Date proDateTo, String summary,
			String content, int status, String style, int orderBy, int start,
			int end) throws SystemException {

		Session session = null;

		try {

			Calendar currentDate = new GregorianCalendar();
			int curYear = currentDate.get(Calendar.YEAR);
			int curMonth = currentDate.get(Calendar.MONTH);
			int curDay = currentDate.get(Calendar.DATE);

			// Requested values

			Date toDate = new GregorianCalendar(curYear, curMonth, curDay)
					.getTime();

			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("WHERE (VLegalDocument.groupId = ?) ");
			query.append("AND (VLegalDocument.language = ?) ");

			if (Validator.isNotNull(number)) {
				query.append("AND LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append("AND LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append("AND (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append("AND (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {
				query.append("AND (VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {
				query.append("AND (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(content)) {
				query.append("AND (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
			}

			query.append("AND (VLegalDocument.statusDoc = ?) ");

			if (Validator.isNotNull(style) && style.equals("un_expired")) {
				query.append("AND (VLegalDocument.expiredDate isnull) ");
			} else if (Validator.isNotNull(style) && style.equals("expired")) {
				query.append("AND (VLegalDocument.expiredDate <= ?) ");
			}

			query.append("ORDER BY ");
			if (orderBy == 1) {
				query.append("VLegalDocument.promuldate DESC");
			} else if (orderBy == 2) {
				query.append("VLegalDocument.expiredDate DESC");
			} else if (orderBy == 3) {
				query.append("VLegalDocument.summary ASC");
			} else if (orderBy == 0) {
				query.append("VLegalDocument.publishedDate DESC");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (Validator.isNotNull(proDateFrom))
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (Validator.isNotNull(proDateTo))
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			q.setInteger(queryPos++, status);

			if (Validator.isNotNull(style) && style.equals("expired")) {
				q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			}

			return QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDocumentByParam(long groupId, String language,
			String number, String symbol, String fieldId, String orgId,
			String typeId, Date proDateFrom, Date proDateTo, String summary,
			String content, int status, String style) throws SystemException {

		Session session = null;

		try {

			Calendar currentDate = new GregorianCalendar();
			int curYear = currentDate.get(Calendar.YEAR);
			int curMonth = currentDate.get(Calendar.MONTH);
			int curDay = currentDate.get(Calendar.DATE);

			// Requested values

			Date toDate = new GregorianCalendar(curYear, curMonth, curDay)
					.getTime();

			session = openSession();
			//String sql = CustomSQLUtil.get(COUNT_BY_D);
			String sql = "SELECT COUNT(*) as total FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("WHERE (VLegalDocument.groupId = ?) ");
			query.append("AND (VLegalDocument.language = ?) ");

			if (Validator.isNotNull(number)) {
				query.append("AND LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append("AND LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append("AND (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append("AND (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {
				query.append("AND (VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {
				query.append("AND (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(content)) {
				query.append("AND (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
			}

			query.append("AND (VLegalDocument.statusDoc = ?) ");

			if (Validator.isNotNull(style) && style.equals("un_expired")) {
				query.append("AND (VLegalDocument.expiredDate isnull ) ");
			} else if (Validator.isNotNull(style) && style.equals("expired")) {
				query.append("AND (VLegalDocument.expiredDate <= ?) ");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (Validator.isNotNull(proDateFrom))
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (Validator.isNotNull(proDateTo))
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			q.setInteger(queryPos++, status);

			if (Validator.isNotNull(style) && style.equals("expired")) {

				q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));

			}

			Long count = null;
			Iterator ite = q.list().iterator();
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findBasicDocument(long groupId, String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("WHERE ");
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("(VLegalDocument.groupId = ?) ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append("AND");
				query.append("(VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(number)) {

				query.append("AND");
				query.append(" LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {

				query.append("AND");
				query.append(" LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {

				query.append("AND");
				query.append("(VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {

				query.append("AND");
				query.append("(VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {

				query.append("AND");
				query.append("(VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {

				query.append("AND ");
				query.append("(LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append("AND ");
				query.append("(VLegalDocument.statusDoc = ?) ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.promuldate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findBasicDocument(String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" (VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(number)) {

				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {

				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {

				query.append(" AND ");
				query.append("(VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {

				query.append(" AND ");
				query.append("(VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append("(VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append("(VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append(" AND ");
				query.append(" (VLegalDocument.statusDoc = ?) ");
			}

			query.append(" ORDER BY ");
			query.append(" VLegalDocument.promuldate DESC ");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	public List findBasicDocument(long groupId, String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status,
			int start, int end) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" (VLegalDocument.groupId = ?) ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append("AND ");
				query.append("(VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(number)) {

				query.append("AND ");
				query.append(" LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {

				query.append("AND ");
				query.append(" LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {

				query.append("AND ");
				query.append("(VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {

				query.append("AND ");
				query.append("(VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {

				query.append("AND ");
				query.append("(VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append("AND ");
				query.append("(VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {

				query.append("AND ");
				query.append("(LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append("AND ");
				query.append("(VLegalDocument.statusDoc = ?) ");
			}

			query.append("ORDER BY ");
			query.append("VLegalDocument.promuldate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findBasicDocument(String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status,
			int start, int end) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" (VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(number)) {

				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {

				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append(" (VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append(" (VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append(" AND ");
				query.append(" (VLegalDocument.statusDoc = ?) ");
			}

			query.append(" ORDER BY ");
			query.append(" VLegalDocument.promuldate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity(" VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	public int countBasicDocument(long groupId, String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(COUNT_BY_D);
			String sql = "SELECT COUNT(*) as total FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");
			if (Validator.isNotNull(String.valueOf(groupId))) {
				query.append("(VLegalDocument.groupId = ?) ");
			}

			if (Validator.isNotNull(language)) {
				query.append("AND ");
				query.append(" (VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(number)) {

				query.append("AND ");
				query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(symbol)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append(" (VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append(" (VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append(" AND ");
				query.append(" (VLegalDocument.statusDoc = ?) ");
			}
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);
			Long count = null;
			Iterator ite = q.list().iterator();
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countBasicDocument(String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status)
			throws SystemException {

		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(COUNT_BY_D);
			String sql = "SELECT COUNT(*) as total FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");

			if (Validator.isNotNull(language)) {
				query.append(" (VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(number)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(symbol)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {

				query.append(" AND ");
				query.append("(VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {

				query.append(" AND ");
				query.append("(VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0")) {

				query.append(" AND ");
				query.append(" (VLegalDocument.typeDocId = ?) ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append(" (VLegalDocument.promulDate >= ?) ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append(" (VLegalDocument.promulDate <= ?) ");
			}

			if (Validator.isNotNull(summary)) {

				query.append(" AND ");
				query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append(" AND ");
				query.append("(VLegalDocument.statusDoc = ?) ");
			}
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;
			
			q.setString(queryPos++, language);
			
			if (Validator.isNotNull(number)) {
				q.setString(queryPos++, "%" + number + "%");
			}

			if (Validator.isNotNull(symbol)) {
				q.setString(queryPos++, "%" + symbol + "%");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0"))
				q.setString(queryPos++, orgId);

			if (Validator.isNotNull(typeId) && !Validator.equals(typeId, "0"))
				q.setString(queryPos++, typeId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);
			Long count = null;
			Iterator ite = q.list().iterator();
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findAdvanceDocument(long groupId, String language,
			String fieldId, Date proDateFrom, Date proDateTo, String summary,
			String num, String symbol, Date expDateFrom, Date expDateTo,
			String[] typeIds, String[] orgIds, String[] sigIds, String content,
			int status) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" INNER JOIN VLegalDSRel ");
			query.append(" ON (VLegalDocument.docId = VLegalDSRel.docId) WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" VLegalDocument.groupId = ? ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" AND ");
				query.append(" VLegalDocument.language = ? ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append(" AND ");
				query.append(" VLegalDocument.fieldId = ? ");
			}

			if (proDateFrom != null) {
				query.append(" AND ");
				query.append(" VLegalDocument.promulDate >= ? ");
			}

			if (proDateTo != null) {
				query.append(" AND ");
				query.append(" VLegalDocument.promulDate <= ? ");
			}

			if (Validator.isNotNull(summary)) {
				query.append(" AND ");
				query.append("LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(num)) {
				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.num) LIKE LOWER(?) ");
			}

			if (Validator.isNotNull(symbol)) {
				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.symbol) LIKE LOWER(?) ");
			}

			if (expDateFrom != null) {
				query.append(" AND ");
				query.append(" VLegalDocument.expiredDate >= ? ");
			}

			if (expDateTo != null) {
				query.append(" AND ");
				query.append("VLegalDocument.expiredDate <= ? ");
			}

			if (Validator.isNotNull(typeIds)) {
				if (typeIds.length > 1) {
					query.append(" AND (");
					query.append(_getTypeIds(typeIds));
					query.append(") ");
				} else {
					query.append(" AND ");
					query.append("VLegalDocument.typeDocId = ? ");
				}
			}

			if (Validator.isNotNull(orgIds)) {
				if (orgIds.length > 1) {
					query.append(" AND (");
					query.append(_getOrgIds(orgIds));
					query.append(") ");
				} else {
					query.append(" AND ");
					query.append("VLegalDocument.orgId = ? ");
				}
			}

			if (Validator.isNotNull(sigIds)) {
				if (sigIds.length > 1) {
					query.append(" AND (");
					query.append(_getSigIds(sigIds));
					query.append(") ");
				} else {
					query.append(" AND ");
					query.append("VLegalDSRel.sigId = ? ");
				}
			}

			if (Validator.isNotNull(content)) {
				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.content) LIKE LOWER(?) ");
			}

			if (status == 0 || status == 1 || status == 2 || status == 3) {
				query.append(" AND ");
				query.append(" VLegalDocument.statusDoc = ? ");
			}

			query.append(" ORDER BY ");
			query.append(" VLegalDocument.promulDate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (proDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateFrom.getTime()));

			if (proDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(proDateTo.getTime()));

			if (Validator.isNotNull(summary))
				q.setString(queryPos++, "%" + summary + "%");

			if (Validator.isNotNull(num))
				q.setString(queryPos++, "%" + num + "%");

			if (Validator.isNotNull(symbol))
				q.setString(queryPos++, "%" + symbol + "%");

			if (expDateFrom != null)
				q.setTimestamp(queryPos++, new Timestamp(expDateFrom.getTime()));

			if (expDateTo != null)
				q.setTimestamp(queryPos++, new Timestamp(expDateTo.getTime()));

			if (Validator.isNotNull(typeIds)) {
				if (typeIds.length > 1) {
					for (int i = 0; i < typeIds.length; i++) {
						String typeId = (String) typeIds[i];
						q.setString(queryPos++, typeId);
					}
				} else {
					String typeId = (String) typeIds[0];
					q.setString(queryPos++, typeId);
				}
			}

			if (Validator.isNotNull(orgIds)) {
				if (orgIds.length > 1) {
					for (int i = 0; i < orgIds.length; i++) {
						String orgId = (String) orgIds[i];
						q.setString(queryPos++, orgId);
					}
				} else {
					String orgId = (String) orgIds[0];
					q.setString(queryPos++, orgId);
				}
			}

			if (Validator.isNotNull(sigIds)) {
				if (sigIds.length > 1) {
					for (int i = 0; i < sigIds.length; i++) {
						String sigId = (String) sigIds[i];
						q.setString(queryPos++, sigId);
					}
				} else {
					String sigId = (String) sigIds[0];
					q.setString(queryPos++, sigId);
				}
			}

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			if (status == 0 || status == 1 || status == 2)
				q.setInteger(queryPos++, status);

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findBySummary(long groupId, String language, int status,
			String summary, long departId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			if (Validator.isNotNull(String.valueOf(departId))
					&& (departId != 0)) {
				query.append(" INNER JOIN VLegalDDRel ");
				query.append(" ON (VLegalDocument.docId = VLegalDDRel.docId) ");
			}

			query.append(" WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" VLegalDocument.groupId = ? ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" AND ");
				query.append(" VLegalDocument.language = ? ");
			}

			if (status == 0 || status == 1 || status == 2 || status == 3) {
				query.append(" AND ");
				query.append(" VLegalDocument.statusDoc = ? ");
			}

			if (Validator.isNotNull(summary)) {
				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if ((Validator.isNotNull(String.valueOf(departId)) && (departId != 0))) {
				query.append(" AND ");
				query.append(" VLegalDDRel.departmentId = ?");
			}

			query.append(" ORDER BY ");
			query.append(" VLegalDocument.forwardedDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (status == 0 || status == 1 || status == 2 || status == 3)
				q.setInteger(queryPos++, status);

			if (Validator.isNotNull(summary)) {
				q.setString(queryPos++, "%" + summary + "%");
			}

			if (Validator.isNotNull(String.valueOf(departId))
					&& (departId != 0)) {
				q.setLong(queryPos++, departId);
			}

			return q.list();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findDocByDepartId(String num, String symbol, int status,
			String summary, long departmentId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" INNER JOIN VLegalDDRel ");
			query.append(" ON (VLegalDocument.docId = VLegalDDRel.docId) WHERE ");

			query.append(" VLegalDocument.statusDoc = ? ");

			if (Validator.isNotNull(summary)) {
				query.append(" AND ");
				query.append(" LOWER(VLegalDocument.summary) LIKE LOWER(?) ");
			}

			if (Validator.isNull(String.valueOf(departmentId))) {
				return null;
			} else {
				query.append(" AND ");
				query.append(" VLegalDDRel.departmentId = ?");
			}

			query.append(" ORDER BY ");
			query.append(" VLegalDocument.forwardedDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			if (status == 0 || status == 1 || status == 2 || status == 3)
				q.setInteger(queryPos++, status);

			if (Validator.isNotNull(summary)) {
				q.setString(queryPos++, "%" + summary + "%");
			}

			if (Validator.isNotNull(String.valueOf(departmentId))) {
				q.setLong(queryPos++, departmentId);
			}

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List searchDocument(long groupId, String language, String keyword,
			String orgId, String typeDocId, String fieldId, String sigId,
			boolean isNum, boolean isSymbol, boolean isSummary,
			boolean isContent, boolean isPromulDate, Date promulDateFrom,
			Date promulDateTo, boolean isEffectiveDate, Date effectiveDateFrom,
			Date effectiveDateTo, boolean isExpiredDate, Date expireDateFrom,
			Date expireDateTo, int statusDoc, String select)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			if (!sigId.equals("0")) {
				query.append("INNER JOIN VLegalDSRel ");
				query.append("ON (VLegalDocument.docId = VLegalDSRel.docId)");
			}
			query.append("WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" (VLegalDocument.groupId = ?) ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" AND ");
				query.append("(VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(keyword)) {

				if (Validator.isNotNull(select)
						&& Validator.equals(select, "0")) {
					if (!isNum && !isSymbol && !isContent) {
						query.append(" AND ");
						query.append("(LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");

					} else {
						query.append(" AND ");
						query.append("( ");

						if (isSummary) {
							query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
						}

						if (isNum) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");

						}
						if (isSymbol) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");

						}
						if (isContent) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
						}

						query.append(") ");
					}
				} else {
					if (!isNum && !isSymbol && !isContent) {
						query.append(" AND ");
						query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
					} else {
						query.append(" AND ");
						query.append("( ");
						if (isSummary) {

							query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
						}
						if (isNum) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");

						}
						if (isSymbol) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");
						}

						if (isContent) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
						}

						query.append(") ");
					}
				}
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeDocId)
					&& !Validator.equals(typeDocId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.typeDocId = ?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append(" AND ");
				query.append("(VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(sigId) && !Validator.equals(sigId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDSRel.sigId = ?) ");
			}

			if (isPromulDate) {
				if (promulDateFrom != null && promulDateTo != null) {
					if (statusDoc == 0) {
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate > ?) ");

					} else if (statusDoc == 1) {
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate > ?) ");

					} else if (statusDoc == 2) {
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate > ?) ");

					}
				}
			}

			if (isEffectiveDate) {
				if (effectiveDateFrom != null && effectiveDateTo != null) {
					if (statusDoc == 0) {
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate > ?) ");

					} else if (statusDoc == 1) {
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate > ?) ");

					} else if (statusDoc == 2) {
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate > ?) ");
					}
				}
			}

			if (isExpiredDate) {
				if (expireDateFrom != null && expireDateTo != null) {
					if (statusDoc == 0) {
						if (statusDoc == 0) {
							query.append(" AND ");
							query.append(" (VLegalDocument.createdDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.createdDate > ?) ");

						} else if (statusDoc == 1) {
							query.append(" AND ");
							query.append(" (VLegalDocument.approvedDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.approvedDate > ?) ");

						} else if (statusDoc == 2) {
							query.append(" AND ");
							query.append(" (VLegalDocument.publishedDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.publishedDate > ?) ");
						}
					}
				}
			}

			query.append(" AND ");
			query.append(" (VLegalDocument.statusDoc = ?) ");

			if (statusDoc == 0) {
				query.append(" ORDER BY VLegalDocument.createdDate DESC ");
			} else if (statusDoc == 1) {
				query.append(" ORDER BY VLegalDocument.approvedDate DESC ");
			} else if (statusDoc == 2) {
				query.append(" ORDER BY VLegalDocument.publishedDate DESC ");
			}
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(keyword)) {
				if (!isNum && !isSymbol && !isSummary && !isContent) {
					q.setString(queryPos++, "%" + keyword + "%");
				} else {
					if (isNum) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
					if (isSymbol) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
					if (isSummary) {
						q.setString(queryPos++, "%" + keyword + "%");
					}

					if (isContent) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
				}
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				q.setString(queryPos++, orgId);
			}

			if (Validator.isNotNull(typeDocId)
					&& !Validator.equals(typeDocId, "0")) {
				q.setString(queryPos++, typeDocId);
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				q.setString(queryPos++, fieldId);
			}

			if (Validator.isNotNull(sigId) && !Validator.equals(sigId, "0")) {
				q.setString(queryPos++, sigId);
			}

			if (isPromulDate) {
				if (promulDateFrom != null && promulDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(promulDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(promulDateFrom.getTime()));
				}
			}

			if (isEffectiveDate) {
				if (effectiveDateFrom != null && effectiveDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(effectiveDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(effectiveDateFrom.getTime()));
				}
			}

			if (isExpiredDate) {
				if (expireDateFrom != null && expireDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(expireDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(expireDateFrom.getTime()));
				}
			}

			q.setInteger(queryPos++, statusDoc);

			return q.list();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public List searchDocument(long groupId, String language, String keyword,
			String orgId, String typeDocId, String fieldId, String sigId,
			boolean isNum, boolean isSymbol, boolean isSummary,
			boolean isContent, boolean isPromulDate, Date promulDateFrom,
			Date promulDateTo, boolean isEffectiveDate, Date effectiveDateFrom,
			Date effectiveDateTo, boolean isExpiredDate, Date expireDateFrom,
			Date expireDateTo, int statusDoc, String select, int start, int end)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D);
			String sql = "SELECT * FROM VLegalDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);
			if (!sigId.equals("0")) {
				query.append(" INNER JOIN VLegalDSRel ");
				query.append(" ON (VLegalDocument.docId = VLegalDSRel.docId) ");
			}
			query.append(" WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append(" (VLegalDocument.groupId = ?) ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append(" AND ");
				query.append(" (VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(keyword)) {

				if (Validator.isNotNull(select)
						&& Validator.equals(select, "0")) {
					if (!isNum && !isSymbol && !isContent) {
						query.append(" AND ");
						query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");

					} else {
						query.append(" AND ");
						query.append("( ");

						if (isSummary) {
							query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
						}

						if (isNum) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");

						}
						if (isSymbol) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");

						}
						if (isContent) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
						}

						query.append(") ");
					}
				} else {
					if (!isNum && !isSymbol && !isContent) {
						query.append(" AND ");
						query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
					} else {
						query.append(" AND ");
						query.append("( ");
						if (isSummary) {

							query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
						}
						if (isNum) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");

						}
						if (isSymbol) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");
						}

						if (isContent) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
						}

						query.append(") ");
					}
				}
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeDocId)
					&& !Validator.equals(typeDocId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.typeDocId = ?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(sigId) && !Validator.equals(sigId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDSRel.sigId = ?) ");
			}

			if (isPromulDate) {
				if (promulDateFrom != null && promulDateTo != null) {
					if (statusDoc == 0) {
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate > ?) ");

					} else if (statusDoc == 1) {
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate > ?) ");

					} else if (statusDoc == 2) {
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate > ?) ");

					}
				}
			}

			if (isEffectiveDate) {
				if (effectiveDateFrom != null && effectiveDateTo != null) {
					if (statusDoc == 0) {
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate > ?) ");

					} else if (statusDoc == 1) {
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate > ?) ");

					} else if (statusDoc == 2) {
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate > ?) ");
					}
				}
			}

			if (isExpiredDate) {
				if (expireDateFrom != null && expireDateTo != null) {
					if (statusDoc == 0) {
						if (statusDoc == 0) {
							query.append(" AND ");
							query.append(" (VLegalDocument.createdDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.createdDate > ?) ");

						} else if (statusDoc == 1) {
							query.append(" AND ");
							query.append(" (VLegalDocument.approvedDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.approvedDate > ?) ");

						} else if (statusDoc == 2) {
							query.append(" AND ");
							query.append(" (VLegalDocument.publishedDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.publishedDate > ?) ");
						}
					}
				}
			}

			query.append(" AND ");
			query.append(" (VLegalDocument.statusDoc = ?) ");

			if (statusDoc == 0) {
				query.append(" ORDER BY VLegalDocument.createdDate DESC ");
			} else if (statusDoc == 1) {
				query.append(" ORDER BY VLegalDocument.approvedDate DESC ");
			} else if (statusDoc == 2) {
				query.append(" ORDER BY VLegalDocument.publishedDate DESC ");
			}
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDocument", VLegalDocumentImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(keyword)) {
				if (!isNum && !isSymbol && !isSummary && !isContent) {
					q.setString(queryPos++, "%" + keyword + "%");
				} else {
					if (isNum) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
					if (isSymbol) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
					if (isSummary) {
						q.setString(queryPos++, "%" + keyword + "%");
					}

					if (isContent) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
				}
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				q.setString(queryPos++, orgId);
			}

			if (Validator.isNotNull(typeDocId)
					&& !Validator.equals(typeDocId, "0")) {
				q.setString(queryPos++, typeDocId);
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				q.setString(queryPos++, fieldId);
			}

			if (Validator.isNotNull(sigId) && !Validator.equals(sigId, "0")) {
				q.setString(queryPos++, sigId);
			}

			if (isPromulDate) {
				if (promulDateFrom != null && promulDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(promulDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(promulDateFrom.getTime()));
				}
			}

			if (isEffectiveDate) {
				if (effectiveDateFrom != null && effectiveDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(effectiveDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(effectiveDateFrom.getTime()));
				}
			}

			if (isExpiredDate) {
				if (expireDateFrom != null && expireDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(expireDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(expireDateFrom.getTime()));
				}
			}

			q.setInteger(queryPos++, statusDoc);

			return QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public int countSearchDocument(long groupId, String language,
			String keyword, String orgId, String typeDocId, String fieldId,
			String sigId, boolean isNum, boolean isSymbol, boolean isSummary,
			boolean isContent, boolean isPromulDate, Date promulDateFrom,
			Date promulDateTo, boolean isEffectiveDate, Date effectiveDateFrom,
			Date effectiveDateTo, boolean isExpiredDate, Date expireDateFrom,
			Date expireDateTo, int statusDoc, String select)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
//			String sql = CustomSQLUtil.get(COUNT_BY_D);
			String sql = "SELECT COUNT(*) as total FROM VLegalDocument "; //change by vanvtk
			StringBuffer query = new StringBuffer();
			query.append(sql);
			if (!sigId.equals("0")) {
				query.append(" INNER JOIN VLegalDSRel ");
				query.append(" ON (VLegalDocument.docId = VLegalDSRel.docId) ");
			}
			query.append(" WHERE ");

			if (Validator.isNotNull(String.valueOf(groupId))) {
				query.append(" (VLegalDocument.groupId = ?) ");
			}

			if (Validator.isNotNull(language)) {
				query.append(" AND ");
				query.append(" (VLegalDocument.language = ?) ");
			}

			if (Validator.isNotNull(keyword)) {

				if (Validator.isNotNull(select)
						&& Validator.equals(select, "0")) {
					if (!isNum && !isSymbol && !isContent) {
						query.append(" AND ");
						query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");

					} else {
						query.append(" AND ");
						query.append("( ");

						if (isSummary) {
							query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
						}

						if (isNum) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");

						}
						if (isSymbol) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");

						}
						if (isContent) {
							query.append(" OR ");
							query.append(" (LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
						}

						query.append(") ");
					}
				} else {
					if (!isNum && !isSymbol && !isContent) {
						query.append(" AND ");
						query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
					} else {
						query.append(" AND ");
						query.append("( ");
						if (isSummary) {

							query.append(" (LOWER(VLegalDocument.summary) LIKE LOWER(?)) ");
						}
						if (isNum) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.num) LIKE LOWER(?)) ");

						}
						if (isSymbol) {
							query.append(" AND ");
							query.append(" (LOWER(VLegalDocument.symbol) LIKE LOWER(?)) ");
						}

						if (isContent) {
							query.append(" AND ");
							query.append("(LOWER(VLegalDocument.content) LIKE LOWER(?)) ");
						}

						query.append(") ");
					}
				}
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.orgId = ?) ");
			}

			if (Validator.isNotNull(typeDocId)
					&& !Validator.equals(typeDocId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.typeDocId = ?) ");
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(sigId) && !Validator.equals(sigId, "0")) {
				query.append(" AND ");
				query.append(" (VLegalDSRel.sigId = ?) ");
			}

			if (isPromulDate) {
				if (promulDateFrom != null && promulDateTo != null) {
					if (statusDoc == 0) {
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate > ?) ");

					} else if (statusDoc == 1) {
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate > ?) ");

					} else if (statusDoc == 2) {
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate > ?) ");

					}
				}
			}

			if (isEffectiveDate) {
				if (effectiveDateFrom != null && effectiveDateTo != null) {
					if (statusDoc == 0) {
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.createdDate > ?) ");

					} else if (statusDoc == 1) {
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.approvedDate > ?) ");

					} else if (statusDoc == 2) {
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate < ?) ");
						query.append(" AND ");
						query.append(" (VLegalDocument.publishedDate > ?) ");
					}
				}
			}

			if (isExpiredDate) {
				if (expireDateFrom != null && expireDateTo != null) {
					if (statusDoc == 0) {
						if (statusDoc == 0) {
							query.append(" AND ");
							query.append(" (VLegalDocument.createdDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.createdDate > ?) ");

						} else if (statusDoc == 1) {
							query.append(" AND ");
							query.append(" (VLegalDocument.approvedDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.approvedDate > ?) ");

						} else if (statusDoc == 2) {
							query.append(" AND ");
							query.append(" (VLegalDocument.publishedDate < ?) ");
							query.append(" AND ");
							query.append(" (VLegalDocument.publishedDate > ?) ");
						}
					}
				}
			}

			query.append(" AND ");
			query.append(" (VLegalDocument.statusDoc = ?) ");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(keyword)) {
				if (!isNum && !isSymbol && !isSummary && !isContent) {
					q.setString(queryPos++, "%" + keyword + "%");
				} else {
					if (isNum) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
					if (isSymbol) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
					if (isSummary) {
						q.setString(queryPos++, "%" + keyword + "%");
					}

					if (isContent) {
						q.setString(queryPos++, "%" + keyword + "%");
					}
				}
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				q.setString(queryPos++, orgId);
			}

			if (Validator.isNotNull(typeDocId)
					&& !Validator.equals(typeDocId, "0")) {
				q.setString(queryPos++, typeDocId);
			}

			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				q.setString(queryPos++, fieldId);
			}

			if (Validator.isNotNull(sigId) && !Validator.equals(sigId, "0")) {
				q.setString(queryPos++, sigId);
			}

			if (isPromulDate) {
				if (promulDateFrom != null && promulDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(promulDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(promulDateFrom.getTime()));
				}
			}

			if (isEffectiveDate) {
				if (effectiveDateFrom != null && effectiveDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(effectiveDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(effectiveDateFrom.getTime()));
				}
			}

			if (isExpiredDate) {
				if (expireDateFrom != null && expireDateTo != null) {
					q.setTimestamp(queryPos++,
							new Timestamp(expireDateTo.getTime()));
					q.setTimestamp(queryPos++,
							new Timestamp(expireDateFrom.getTime()));
				}
			}

			q.setInteger(queryPos++, statusDoc);
			Long count = null;
			Iterator ite = q.list().iterator();
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	private String _getTypeIds(String[] TypeIds) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < TypeIds.length; i++) {
			sb.append("VLegalDocument.typeDocId = ? ");

			if ((i + 1) != TypeIds.length) {
				sb.append("OR ");
			}
		}

		return sb.toString();
	}

	private String _getSigIds(String[] SigIds) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < SigIds.length; i++) {
			sb.append("VLegalDSRel.sigId = ? ");

			if ((i + 1) != SigIds.length) {
				sb.append("OR ");
			}
		}

		return sb.toString();
	}

	private String _getOrgIds(String[] OrgIds) {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < OrgIds.length; i++) {
			sb.append("VLegalDocument.orgId = ? ");

			if ((i + 1) != OrgIds.length) {
				sb.append("OR ");
			}
		}

		return sb.toString();
	}

	@Override
	public List count(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List search(String arg0, String arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}
}
