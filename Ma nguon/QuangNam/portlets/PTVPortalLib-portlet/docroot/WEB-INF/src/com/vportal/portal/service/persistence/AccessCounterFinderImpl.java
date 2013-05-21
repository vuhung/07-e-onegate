package com.vportal.portal.service.persistence;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class AccessCounterFinderImpl extends BasePersistenceImpl implements AccessCounterFinder{
	public int getHits(long companyId) throws SystemException {
		int hits = 0;
		Session session = null;
		try {
			session = openSession();
			String query = "SELECT sum(ac.accessCount) FROM com.vportal.portal.model.AccessCounter ac WHERE ac.companyId = ?";
			Query q = session.createQuery(query);
			q.setFloat(0, companyId);
			List result = q.list();
			if (result.size() > 0) {
				hits = ((Long) result.get(0)).intValue();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}
		return hits;
	}
	public int getHits(long companyId,Date date) throws SystemException {
		int hits = 0;
		Session session = null;
		try {
			session = openSession();
			String query = "SELECT sum(ac.accessCount) FROM com.vportal.portal.model.AccessCounter ac WHERE ac.companyId = ? AND ac.accessDate = ?";
			Query q = session.createQuery(query);
			q.setFloat(0, companyId);
			q.setTimestamp(1, new Timestamp(date.getTime()));
			List result = q.list();
			if (result.size() > 0) {
				hits = ((Long) result.get(0)).intValue();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}
		return hits;
	}
}
