package com.vportal.portlet.vfaq.service.persistence;

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
import com.vportal.portlet.vfaq.model.impl.FAQQuestionImpl;

public class FAQQuestionFinderImpl extends BasePersistenceImpl implements
		FAQQuestionFinder {
	public static String FIND_BY_G_L_C = FAQQuestionFinder.class.getName()
			+ ".findByCategoryId";
	public static String FIND_BY_G_Q_A = FAQQuestionFinder.class.getName()
			+ ".findByG_Q_A";
	public static String FIND_BY_C_S = FAQQuestionFinder.class.getName()
			+ ".findByC_S";
	public static String COUNT_BY_C_S = FAQQuestionFinder.class.getName()
			+ ".countByC_S";

	public static String FIND_BY_PARAM = FAQQuestionFinder.class.getName()
			+ ".findByParam";
	public static String COUNT_BY_PARAM = FAQQuestionFinder.class.getName()
			+ ".countByParam";

	public List findByCategoryId(long groupId, String language, long categoryId)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_G_L_C);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("FAQQuestion", FAQQuestionImpl.class);
			int queryPos = 0;
			q.setLong(queryPos++, categoryId);
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	// find other question CuongNV
	public List findByG_Q_A(long groupId, String language, int quantity,
			boolean approved) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_G_Q_A);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("FAQQuestion", FAQQuestionImpl.class);
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setBoolean(queryPos++, approved);
			return QueryUtil.list(q, getDialect(), 0, quantity);
		} catch (Exception ex) {
			throw new SystemException(ex);
		} finally {
			closeSession(session);
		}
	}

	// find question by category id CuongNV
	public List findByC_S(long groupId, String language, long categoryId,
			String title, int begin, int end, boolean approved)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_C_S);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("FAQQuestion", FAQQuestionImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(String.valueOf(categoryId))) {
				q.setLong(queryPos++, categoryId);
			}
			if (Validator.isNotNull(title)) {
				q.setString(queryPos++, "%" + title + "%");
			}
			q.setBoolean(queryPos++, approved);
			return QueryUtil.list(q, getDialect(), begin, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List findByC_S(long groupId, String language, long categoryId,
			String title, boolean approved) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_C_S);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("FAQQuestion", FAQQuestionImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(String.valueOf(categoryId))) {
				q.setLong(queryPos++, categoryId);
			}
			if (Validator.isNotNull(title)) {
				q.setString(queryPos++, "%" + title + "%");
			}
			q.setBoolean(queryPos++, approved);

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countByC_S(long groupId, String language, long categoryId,
			String title, boolean approved) throws SystemException {
		Session session = null;
		try {

			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_C_S);
			StringBuffer query = new StringBuffer();
			query.append(sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			if (Validator.isNotNull(String.valueOf(categoryId))) {
				q.setLong(queryPos++, categoryId);
			}
			if (Validator.isNotNull(title)) {
				q.setString(queryPos++, "%" + title + "%");
			}
			q.setBoolean(queryPos++, approved);
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

	public List findQuestionByParam(long groupId, String language,
			long categoryId, String title, boolean approved, int begin, int end)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_PARAM);
			StringBuffer query = new StringBuffer();
			query.append(sql);

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& categoryId != 0) {
				query.append(" INNER JOIN FAQCategoryQuestion ");
				query
						.append(" ON (FAQQuestion.Id_ = FAQCategoryQuestion.questionId)");
			}

			query.append(" WHERE ");

			query.append(" FAQQuestion.groupId = ? ");
			query.append(" AND ");
			query.append(" FAQQuestion.language = ? ");

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& categoryId != 0) {
				query.append(" AND ");
				query.append(" FAQCategoryQuestion.categoryId = ? ");
			}

			if (Validator.isNotNull(title)) {
				query.append(" AND ");
				query.append(" FAQQuestion.title LIKE ? ");
			}

			query.append(" AND ");
			query.append(" FAQQuestion.approved = ? ");

			query.append(" ORDER BY ");
			query.append(" FAQQuestion.sentDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("FAQQuestion", FAQQuestionImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& (categoryId != 0)) {
				q.setLong(queryPos++, categoryId);
			}
			if (Validator.isNotNull(title)) {
				q.setString(queryPos++, "%" + title + "%");
			}
			q.setBoolean(queryPos++, approved);

			return QueryUtil.list(q, getDialect(), begin, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countQuestionByParam(long groupId, String language,
			long categoryId, String title, boolean approved)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_PARAM);
			StringBuffer query = new StringBuffer();
			query.append(sql);

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& categoryId != 0) {
				query.append(" INNER JOIN FAQCategoryQuestion ");
				query
						.append(" ON (FAQQuestion.Id_ = FAQCategoryQuestion.questionId)");
			}

			query.append(" WHERE ");

			query.append(" FAQQuestion.groupId = ? ");
			query.append(" AND ");
			query.append(" FAQQuestion.language = ? ");

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& (categoryId != 0)) {
				query.append(" AND ");
				query.append(" FAQCategoryQuestion.categoryId = ? ");
			}

			if (Validator.isNotNull(title)) {
				query.append(" AND ");
				query.append(" FAQQuestion.title LIKE ? ");
			}

			query.append(" AND ");
			query.append(" FAQQuestion.approved = ? ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& (categoryId != 0)) {
				q.setLong(queryPos++, categoryId);
			}
			if (Validator.isNotNull(title)) {
				q.setString(queryPos++, "%" + title + "%");
			}
			q.setBoolean(queryPos++, approved);

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

	public List findOtherQuestionByParam(long groupId, String language,
			long Id, long categoryId, boolean approved, int begin, int end)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_PARAM);
			StringBuffer query = new StringBuffer();
			query.append(sql);

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& categoryId != 0) {
				query.append(" INNER JOIN FAQCategoryQuestion ");
				query
						.append(" ON (FAQQuestion.Id_ = FAQCategoryQuestion.questionId)");
			}

			query.append(" WHERE ");

			query.append(" FAQQuestion.groupId = ? ");
			query.append(" AND ");
			query.append(" FAQQuestion.language = ? ");

			if (Validator.isNotNull(String.valueOf(Id))) {
				query.append("AND ");
				query.append("FAQQuestion.Id_ <> ? ");
			}

			if (Validator.isNotNull(String.valueOf(categoryId))
					&& (categoryId != 0)) {
				query.append(" AND ");
				query.append(" FAQCategoryQuestion.categoryId = ? ");
			}

			query.append(" AND ");
			query.append(" FAQQuestion.approved = ? ");

			query.append(" ORDER BY ");
			query.append(" FAQQuestion.sentDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("FAQQuestion", FAQQuestionImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);			
			q.setLong(queryPos++, Id);
			
			if (Validator.isNotNull(String.valueOf(categoryId))
					&& (categoryId != 0)) {
				q.setLong(queryPos++, categoryId);
			}

			q.setBoolean(queryPos++, approved);

			return QueryUtil.list(q, getDialect(), begin, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
