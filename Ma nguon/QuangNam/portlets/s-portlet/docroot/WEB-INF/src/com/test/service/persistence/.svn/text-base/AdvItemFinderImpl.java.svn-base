package com.test.service.persistence;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.test.model.impl.AdvItemImpl;


public class AdvItemFinderImpl extends BasePersistenceImpl  implements AdvItemFinder{
	public static String FIND_BY_D = AdvItemFinder.class.getName()
			+ ".findItem";
	public static String COUNT_BY_D = AdvItemFinder.class.getName()
			+ ".countItem";

	public List getItemByParam(long groupId, String description, long typeId,
			int status, int begin, int end) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_D);
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE ");
			query.append("(AdvItem.groupId = ?) ");

			if (Validator.isNotNull(description)) {
				query.append("AND ");
				query.append("(LOWER(AdvItem.description) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(String.valueOf(typeId)) && typeId != 0) {
				query.append("AND ");
				query.append("(AdvItem.typeId = ?) ");
			}

			if (Validator.isNotNull(String.valueOf(status)) && status != 0) {
				if (status == 1) {

					query.append("AND ");
					query.append("(AdvItem.status = 'true') ");
				} else if (status == 2) {

					query.append("AND ");
					query.append("(AdvItem.status = 'false') ");
				}

			}

			query.append("ORDER BY ");
			query.append("AdvItem.createDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("AdvItem", AdvItemImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (Validator.isNotNull(description)) {
				q.setString(queryPos++, "%" + description + "%");
			}

			if (Validator.isNotNull(String.valueOf(typeId)) && typeId != 0) {
				q.setLong(queryPos++, typeId);
			}

			return QueryUtil.list(q, getDialect(), begin, end);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countItemByParam(long groupId, String description, long typeId,
			int status) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_D);
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append("WHERE ");
			query.append("(AdvItem.groupId = ?) ");

			if (Validator.isNotNull(description)) {
				query.append("AND ");
				query.append("(LOWER(AdvItem.description) LIKE LOWER(?)) ");
			}

			if (Validator.isNotNull(String.valueOf(typeId)) && typeId != 0) {
				query.append("AND ");
				query.append("(AdvItem.typeId = ?) ");
			}

			if (Validator.isNotNull(String.valueOf(status)) && status != 0) {
				if (status == 1) {

					query.append("AND ");
					query.append("(AdvItem.status = 'true') ");
				} else if (status == 2) {

					query.append("AND ");
					query.append("(AdvItem.status = 'false') ");
				}

			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("AdvItem", AdvItemImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (Validator.isNotNull(description)) {
				q.setString(queryPos++, "%" + description + "%");
			}

			if (Validator.isNotNull(String.valueOf(typeId)) && typeId != 0) {
				q.setLong(queryPos++, typeId);
			}

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
	

}
