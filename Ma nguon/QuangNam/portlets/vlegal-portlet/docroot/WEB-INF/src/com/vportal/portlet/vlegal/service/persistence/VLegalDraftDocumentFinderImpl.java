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
import com.vportal.portlet.vlegal.model.impl.VLegalDraftDocumentImpl;

public class VLegalDraftDocumentFinderImpl extends BasePersistenceImpl
		implements VLegalDraftDocumentFinder {
	public static String FIND_BY_D_E_P_L_S = VLegalDraftDocumentFinder.class
			.getName() + ".findByDraftsExpiredDateByP_L_S";
	public static String COUNT_BY_D_E_P_L_S = VLegalDraftDocumentFinder.class
			.getName() + ".countByDraftsExpiredDateByP_L_S";
	public static String FIND_BY_P_L_E = VLegalDraftDocumentFinder.class
			.getName() + ".findDraftsByP_L_S_E";

	public static String COUNT_BY_P_L_E = VLegalDraftDocumentFinder.class
			.getName() + ".countDraftsByP_L_S_E";

	public static String FIND_BY_P_L_S = VLegalDraftDocumentFinder.class
			.getName() + ".findByP_L_S";
	public static String FIND_BY_F_P_L_S = VLegalDraftDocumentFinder.class
			.getName() + ".findByF_P_L_S";
	public static String FIND_BY_D_G_L_S = VLegalDraftDocumentFinder.class
			.getName() + ".findByAfterD_G_L_S";

	public static String FIND_BY_PARAM = VLegalDraftDocumentFinder.class
			.getName() + ".findByParam";
	public static String COUNT_BY_PARAM = VLegalDraftDocumentFinder.class
			.getName() + ".countByParam";

	public List findOtherDraftExpiredByField(long groupId, String language,
			String draftId, String fieldId, int status, int start, int end)
			throws SystemException {
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
			//String sql = CustomSQLUtil.get(FIND_BY_PARAM);
			String sql = "SELECT * FROM VLegalDraftDocument	";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE (VLegalDraftDocument.groupId = ?) ");
			query.append("AND (VLegalDraftDocument.language = ?) ");
			query.append("AND (VLegalDraftDocument.draftId != ?) ");
			query.append("AND (VLegalDraftDocument.fieldId = ?) ");
			query.append("AND (VLegalDraftDocument.statusDraft = ?) ");
			query.append("AND (VLegalDraftDocument.expiredDate <= ?) ");
			query.append("ORDER BY VLegalDraftDocument.publishedDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setString(queryPos++, draftId);
			q.setString(queryPos++, fieldId);
			q.setInteger(queryPos++, status);

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));

			return QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countOtherDraftExpiredByField(long groupId, String language,
			String draftId, String fieldId, int status) throws SystemException {
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
			//String sql = CustomSQLUtil.get(COUNT_BY_PARAM);
			String sql = "SELECT COUNT(*) as total FROM VLegalDraftDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE (VLegalDraftDocument.groupId = ?) ");
			query.append("AND (VLegalDraftDocument.language = ?) ");
			query.append("AND (VLegalDraftDocument.draftId != ?) ");
			query.append("AND (VLegalDraftDocument.fieldId = ?) ");
			query.append("AND (VLegalDraftDocument.statusDraft = ?) ");
			query.append("AND (VLegalDraftDocument.expiredDate <= ?) ");
			query.append("ORDER BY VLegalDraftDocument.publishedDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setString(queryPos++, draftId);
			q.setString(queryPos++, fieldId);
			q.setInteger(queryPos++, status);

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));

			Iterator ite = q.list().iterator();
			Long count = null;
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

	public List findDraftExpiredByParam(long groupId, String language,
			String fieldId, String typeId, int status, String title,
			String content, int start, int end) throws SystemException {
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
			//String sql = CustomSQLUtil.get(FIND_BY_PARAM);
			String sql = "SELECT * FROM VLegalDraftDocument	";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE ");
			query.append("VLegalDraftDocument.groupId = ? ");
			query.append("AND VLegalDraftDocument.language = ? ");

			if (Validator.isNotNull(fieldId)) {
				query.append("AND (VLegalDraftDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(typeId)) {
				query.append("AND (VLegalDraftDocument.typeId = ?) ");
			}

			query.append("AND (VLegalDraftDocument.statusDraft = ?) ");

			if (Validator.isNotNull(title)) {
				query.append("AND doidau(VLegalDraftDocument.title) LIKE doidau(?) ");
			}

			if (Validator.isNotNull(content)) {
				query.append("AND doidau(VLegalDraftDocument.content) LIKE doidau(?) ");
			}

			query.append("AND (VLegalDraftDocument.expiredDate <= ?) ");

			query.append("ORDER BY ");
			query.append("VLegalDraftDocument.publishedDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(fieldId))
				q.setString(queryPos++, fieldId);
			if (Validator.isNotNull(typeId))
				q.setString(queryPos++, typeId);

			q.setInteger(queryPos++, status);

			if (Validator.isNotNull(title))
				q.setString(queryPos++, "%" + title + "%");

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));

			return QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDraftExpiredByParam(long groupId, String language,
			String fieldId, String typeId, int status, String title,
			String content) throws SystemException {
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
			//String sql = CustomSQLUtil.get(COUNT_BY_PARAM);
			String sql = "SELECT COUNT(*) as total FROM VLegalDraftDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE ");
			query.append("VLegalDraftDocument.groupId = ? ");
			query.append("AND VLegalDraftDocument.language = ? ");

			if (Validator.isNotNull(fieldId)) {
				query.append("AND (VLegalDraftDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(typeId)) {
				query.append("AND (VLegalDraftDocument.typeId = ?) ");
			}

			query.append("AND (VLegalDraftDocument.statusDraft = ?) ");

			if (Validator.isNotNull(title)) {
				query.append("AND doidau(VLegalDraftDocument.title) LIKE doidau(?) ");
			}

			if (Validator.isNotNull(content)) {
				query.append("AND doidau(VLegalDraftDocument.content) LIKE doidau(?) ");
			}

			query.append("AND (VLegalDraftDocument.expiredDate <= ?) ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(fieldId))
				q.setString(queryPos++, fieldId);
			if (Validator.isNotNull(typeId))
				q.setString(queryPos++, typeId);

			q.setInteger(queryPos++, status);

			if (Validator.isNotNull(title))
				q.setString(queryPos++, "%" + title + "%");

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));

			Iterator ite = q.list().iterator();
			Long count = null;
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

	public List findDraftByParam(long groupId, String language, String fieldId,
			String typeId, int status, String title, String content, int start,
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
			//String sql = CustomSQLUtil.get(FIND_BY_PARAM);
			String sql = "SELECT * FROM VLegalDraftDocument	";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE ");
			query.append("VLegalDraftDocument.groupId = ? ");
			query.append("AND VLegalDraftDocument.language = ? ");

			if (Validator.isNotNull(fieldId)) {
				query.append("AND (VLegalDraftDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(typeId)) {
				query.append("AND (VLegalDraftDocument.typeId = ?) ");
			}

			query.append("AND (VLegalDraftDocument.statusDraft = ?) ");

			if (Validator.isNotNull(title)) {
				query.append("AND doidau(VLegalDraftDocument.title) LIKE doidau(?) ");
			}

			if (Validator.isNotNull(content)) {
				query.append("AND doidau(VLegalDraftDocument.content) LIKE doidau(?) ");
			}

			query.append("AND (VLegalDraftDocument.expiredDate > ?) ");

			query.append("ORDER BY ");
			query.append("VLegalDraftDocument.publishedDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(fieldId))
				q.setString(queryPos++, fieldId);
			if (Validator.isNotNull(typeId))
				q.setString(queryPos++, typeId);

			q.setInteger(queryPos++, status);

			if (Validator.isNotNull(title))
				q.setString(queryPos++, "%" + title + "%");

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));

			return QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDraftByParam(long groupId, String language, String fieldId,
			String typeId, int status, String title, String content)
			throws SystemException {
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
			//String sql = CustomSQLUtil.get(COUNT_BY_PARAM);
			String sql = "SELECT COUNT(*) as total FROM VLegalDraftDocument ";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE VLegalDraftDocument.groupId = ? ");
			query.append("AND VLegalDraftDocument.language = ? ");

			if (Validator.isNotNull(fieldId)) {
				query.append("AND (VLegalDraftDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(typeId)) {
				query.append("AND (VLegalDraftDocument.typeId = ?) ");
			}

			query.append("AND (VLegalDraftDocument.statusDraft = ?) ");

			if (Validator.isNotNull(title)) {
				query.append("AND doidau(VLegalDraftDocument.title) LIKE doidau(?) ");
			}

			if (Validator.isNotNull(content)) {
				query.append("AND doidau(VLegalDraftDocument.content) LIKE doidau(?) ");
			}

			query.append("AND (VLegalDraftDocument.expiredDate > ?)");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(fieldId))
				q.setString(queryPos++, fieldId);
			if (Validator.isNotNull(typeId))
				q.setString(queryPos++, typeId);

			q.setInteger(queryPos++, status);

			if (Validator.isNotNull(title))
				q.setString(queryPos++, "%" + title + "%");

			if (Validator.isNotNull(content))
				q.setString(queryPos++, "%" + content + "%");

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			

			Iterator ite = q.list().iterator();
			Long count = null;
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

	public List findByDraftsExpiredDateByP_L_S(long groupId, String language,
			int status) throws SystemException {
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
			//String sql = CustomSQLUtil.get(FIND_BY_D_E_P_L_S);
			String sql = "SELECT * FROM VLegalDraftDocument WHERE	(VLegalDraftDocument.expiredDate <= ?) AND (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?) ORDER BY VLegalDraftDocument.expiredDate DESC ";
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);
			int queryPos = 0;

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			q.setDouble(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			return q.list();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findByDraftsExpiredDateByP_L_S(long groupId, String language,
			int status, int start, int end) throws SystemException {
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
			//String sql = CustomSQLUtil.get(FIND_BY_D_E_P_L_S);
			String sql = "SELECT * FROM VLegalDraftDocument WHERE	(VLegalDraftDocument.expiredDate <= ?) AND (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?) ORDER BY VLegalDraftDocument.expiredDate DESC ";
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);
			int queryPos = 0;

			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			q.setDouble(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countByDraftsExpiredDateByP_L_S(long groupId, String language,
			int status) throws SystemException {
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
			//String sql = CustomSQLUtil.get(COUNT_BY_D_E_P_L_S);
			String sql = "SELECT COUNT(*) as total FROM VLegalDraftDocument WHERE	(VLegalDraftDocument.expiredDate <= ?) AND (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND	(VLegalDraftDocument.statusDraft = ?) ";
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);

			int queryPos = 0;
			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			q.setDouble(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);
			Iterator ite = q.list().iterator();
			Long count = null;
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

	public List findDraftsByP_L_S_E(long groupId, String language, int status)
			throws SystemException {
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
			//String sql = CustomSQLUtil.get(FIND_BY_P_L_E);
			String sql = "SELECT * FROM VLegalDraftDocument WHERE (VLegalDraftDocument.expiredDate > ?) AND (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?) ORDER BY VLegalDraftDocument.expiredDate DESC ";
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);
			int queryPos = 0;
			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			q.setDouble(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			return q.list();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findDraftsByP_L_S_E(long groupId, String language, int status,
			int start, int end) throws SystemException {
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
			//String sql = CustomSQLUtil.get(FIND_BY_P_L_E);
			String sql = "SELECT * FROM VLegalDraftDocument WHERE (VLegalDraftDocument.expiredDate > ?) AND (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?) ORDER BY VLegalDraftDocument.expiredDate DESC ";
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);
			int queryPos = 0;
			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			q.setDouble(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDraftsByP_L_S_E(long groupId, String language, int status)
			throws SystemException {
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
			//String sql = CustomSQLUtil.get(COUNT_BY_P_L_E);
			String sql = "SELECT COUNT(*) as total FROM VLegalDraftDocument WHERE (VLegalDraftDocument.expiredDate > ?) AND (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND	(VLegalDraftDocument.statusDraft = ?)";
			//(VLegalDraftDocument.expiredDate > ?) AND
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);

			int queryPos = 0;
			String date = new Timestamp(toDate.getTime()).toString();
			q.setTimestamp(queryPos++, new Timestamp(toDate.getTime()));
			q.setDouble(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			Iterator ite = q.list().iterator();
			Long count = null;
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
	
	public List findByP_L_S(long groupId, String language, int status,
			int quantity) throws SystemException {
		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_P_L_S);
			String sql = "SELECT * FROM VLegalDraftDocument WHERE (VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?)	ORDER BY VLegalDraftDocument.publishedDate DESC";
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), 0, quantity);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findByF_P_L_S(String fieldId, long groupId, String language,
			int status, int quantity) throws SystemException {
		Session session = null;

		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_F_P_L_S);
			String sql = "SELECT * FROM VLegalDraftDocument WHERE	(VLegalDraftDocument.fieldId = ?) AND (VLegalDraftDocument.groupId = ?) AND	(VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?) ORDER BY VLegalDraftDocument.publishedDate DESC";
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);
			int queryPos = 0;

			q.setString(queryPos++, fieldId);
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);

			return QueryUtil.list(q, getDialect(), 0, quantity);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findByAfterD_G_L_S(String fieldId, long groupId,
			String language, int status, int quantity, Date date)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			//String sql = CustomSQLUtil.get(FIND_BY_D_G_L_S);
			String sql = "SELECT * FROM VLegalDraftDocument	WHERE (VLegalDraftDocument.fieldId = ?) AND	(VLegalDraftDocument.groupId = ?) AND (VLegalDraftDocument.language = ?) AND (VLegalDraftDocument.statusDraft = ?) AND (VLegalDraftDocument.publishedDate < ?) ORDER BY	VLegalDraftDocument.publishedDate DESC";
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VLegalDraftDocument", VLegalDraftDocumentImpl.class);
			int queryPos = 0;
			q.setString(queryPos++, fieldId);
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setInteger(queryPos++, status);
			q.setTimestamp(queryPos++, new Timestamp(date.getTime()));

			return QueryUtil.list(q, getDialect(), 0, quantity);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
