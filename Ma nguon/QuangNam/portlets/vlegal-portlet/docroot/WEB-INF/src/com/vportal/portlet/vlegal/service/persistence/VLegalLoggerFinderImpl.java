package com.vportal.portlet.vlegal.service.persistence;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vportal.portlet.vlegal.model.VLegalLogger;
import com.vportal.portlet.vlegal.model.impl.VLegalLoggerImpl;

public class VLegalLoggerFinderImpl extends BasePersistenceImpl implements VLegalLoggerFinder{
	private static Log _log = LogFactory.getLog(VLegalLoggerFinder.class);
	public static String FIND_BY_U = VLegalLoggerFinder.class.getName()+".findByUser";
	public List findByUser(String createdByUser) throws SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_U);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VcmsLogger", VLegalLoggerImpl.class);
			int queryPos = 0;

			if (createdByUser != null) {
				q.setString(queryPos++, createdByUser);
			}

			return q.list();
		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}	
	}
	public List findByPeriod(Date from, Date to) throws SystemException {
		Session session = null;

		try {
			session = openSession();
			StringBuffer query = new StringBuffer();
			query.append("SELECT {VcmsLogger.*} FROM VcmsLogger");

			if ((from != null) && (to != null)) {
				query.append(" WHERE VcmsLogger.createdDate >= ?");
				query.append(" AND VcmsLogger.createdDate <= ?");
			} else if ((from != null) && (to == null)) {
				query.append(" WHERE VcmsLogger.createdDate >= ?");
			} else if ((from == null) && (to != null)) {
				query.append(" WHERE VcmsLogger.createdDate <= ?");
			}

			query.append(" ");
			query.append("ORDER BY ");
			query.append("VcmsLogger.createdDate DESC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VcmsLogger", VLegalLoggerImpl.class);
			int queryPos = 0;
			if ((from != null) && (to != null)) {
				q.setTimestamp(queryPos++,new Timestamp(from.getTime()));
				q.setTimestamp(queryPos++, new Timestamp(to.getTime()));
			} else if ((from != null) && (to == null)) {
				q.setTimestamp(queryPos++, new Timestamp(from.getTime()));
			} else if ((from == null) && (to != null)) {
				q.setTimestamp(queryPos++,new Timestamp(to.getTime()));
			}

			return q.list();
		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}	
	}
	public void removeByPeriod(Date from, Date to)
	throws SystemException {
		try{
		Iterator itr = findByPeriod(from, to).iterator();
		
		while (itr.hasNext()) {
			VLegalLogger VLegalLogger = (VLegalLogger) itr.next();
			VLegalLoggerUtil.remove(VLegalLogger);
		}
		}catch(Exception e){e.printStackTrace();}
	}
		
	protected void initDao() {
	
	}
}
