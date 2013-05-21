package com.vportal.portlet.vcms.service.persistence;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vportal.portlet.vcms.model.VcmsLogger;
import com.vportal.portlet.vcms.model.VcmsThread;

public class VcmsThreadFinderImpl extends BasePersistenceImpl implements VcmsThreadFinder{
	public static String FIND_BY_C_S=
		VcmsThreadFinder.class.getName() + ".findByC_S";
	public List findInPeriod(Date from, Date to) throws SystemException{
		Session session = null;
		try {
			session = openSession();
			StringBuffer query = new StringBuffer();
			query.append("FROM com.vportal.portlet.vcms.model.VcmsThread ");

			if ((from != null) && (to != null)) {
				query.append(" WHERE createdDate >= ?");
				query.append(" AND createdDate <= ?");
			} else if ((from != null) && (to == null)) {
				query.append(" WHERE createdDate >= ?");
			} else if ((from == null) && (to != null)) {
				query.append(" WHERE createdDate <= ?");
			}

			query.append(" ");
			query.append("ORDER BY ");
			query.append("createdDate DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VcmsThread", VcmsThread.class);
			int queryPos = 0;

			if ((from != null) && (to != null)) {
				q.setTimestamp(queryPos++, new Timestamp(from.getTime()));
				q.setTimestamp(queryPos++, new Timestamp(to.getTime()));
			} else if ((from != null) && (to == null)) {
				q.setTimestamp(queryPos++, new Timestamp(from.getTime()));
			} else if ((from == null) && (to != null)) {
				q.setTimestamp(queryPos++, new Timestamp(to.getTime()));
			}

			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}
	}
	protected void initDao() {
	}
}
