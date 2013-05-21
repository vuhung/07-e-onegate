package com.vportal.portlet.vlegal.service.persistence;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vportal.portlet.vlegal.model.impl.VLegalTagsImpl;

public class VLegalTagsFinderImpl extends BasePersistenceImpl implements VLegalTagsFinder{
	public static String FIND_BY_L_T = VLegalTagsFinder.class.getName()+".findVLegalTagsByName";
	public List findVLegalTagsByName(long groupId, String name,
			String status, boolean dup, int begin, int end)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_L_T);
			StringBuffer query = new StringBuffer();
			query.append(sql);
			boolean crit = (!status.equalsIgnoreCase("N/A") || !name
					.equalsIgnoreCase("N/A"));
			if (crit) {
				query.append("WHERE ");
			}

			query.append("VLegalTags.groupId = ? ");

			if (!status.equalsIgnoreCase("N/A")) {
				query.append("AND ");
				query.append("VLegalTags.status = ? ");
			}
			if (dup && !name.equalsIgnoreCase("N/A")) {
				query.append("AND ");
				query.append("LOWER(VLegalTags.name) = LOWER(?) ");
			} else if (!name.equalsIgnoreCase("N/A")) {
				query.append("AND ");
				query.append("LOWER(VLegalTags.name) LIKE LOWER(?) ");
			}

			query.append("ORDER BY ");
			query.append("name ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalTags", VLegalTagsImpl.class);
			int queryPos = 0;

			q.setDouble(queryPos++, groupId);
			if (!status.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(status));
			if (!name.equalsIgnoreCase("N/A"))
				q.setString(queryPos++, name);

			if (end > 0) {
				return QueryUtil
						.list(q, getDialect(), begin, end);
			} else {
				return q.list();
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}	
		
	}

}
