package com.vportal.portlet.vlegal.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vportal.portlet.vlegal.model.impl.VLegalFieldImpl;

public class VLegalFieldFinderImpl extends BasePersistenceImpl implements VLegalFieldFinder{
	public static String FIND_BY_F = VLegalFieldFinder.class.getName()+".findField";
	public List findFieldByOrgRel(long groupId, String orgId,
			String language, String status, String rssable, int begin, int end)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_F);
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("LEFT JOIN VLegalFORel ON VLegalField.fieldid= VLegalFORel.fieldid ");
			query.append("WHERE ");
		
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("VLegalDocument.groupId = ? ");
			}
		
			if (Validator.isNotNull(orgId))
				query.append(" AND VLegalFORel.orgid= ? ");
		
			if (!status.equalsIgnoreCase("N/A"))
				query.append(" AND VLegalField.status= ? ");
		
			if (!rssable.equalsIgnoreCase("N/A"))
				query.append(" AND VLegalField.rssable= ? ");
		
			if (Validator.isNotNull(language))
				query.append(" AND VLegalField.language= ? ");
		
			query.append("ORDER BY ");
			query.append("VLegalField.createdDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalField", VLegalFieldImpl.class);

			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (Validator.isNotNull(orgId))
				q.setString(queryPos++, orgId);

			if (!status.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(status));

			if (!rssable.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(rssable));

			if (Validator.isNotNull(language))
				q.setString(queryPos++, language);

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
	public List findFieldByTypeRel(long groupId, String typeId,
			String language, String status, String rssable, int begin, int end)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_F);
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("LEFT JOIN VLegalFTRel ON VLegalField.fieldid= VLegalFTRel.fieldid ");

			query.append("WHERE ");
		
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("VLegalDocument.groupId = ? ");
			}
		
			if (Validator.isNotNull(typeId))
				query.append(" AND VLegalFTRel.typeid= ? ");
		
			if (!status.equalsIgnoreCase("N/A"))
				query.append(" AND VLegalField.status= ? ");
		
			if (!rssable.equalsIgnoreCase("N/A"))
				query.append(" AND VLegalField.rssable= ? ");
		
			if (Validator.isNotNull(language))
				query.append(" AND VLegalField.language= ? ");
		
			query.append("ORDER BY ");
			query.append("VLegalField.createdDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalField", VLegalFieldImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (Validator.isNotNull(typeId))
				q.setString(queryPos++, typeId);

			if (!status.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(status));

			if (!rssable.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(rssable));

			if (Validator.isNotNull(language))
				q.setString(queryPos++, language);

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
	public List findFieldByPS(long groupId, String language,
			String status, String rssable, int begin, int end)
			throws SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_F);
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append(" WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("VLegalDocument.groupId = ? ");
			}

			if (!status.equalsIgnoreCase("N/A"))
				query.append(" AND VLegalField.status= ? ");

			if (!rssable.equalsIgnoreCase("N/A"))
				query.append(" AND VLegalField.rssable= ? ");

			if (Validator.isNotNull(language))
				query.append(" AND VLegalField.language= ? ");

			query.append("ORDER BY ");
			query.append("VLegalField.createdDate ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalField", VLegalFieldImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (!status.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(status));

			if (!rssable.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(rssable));

			if (Validator.isNotNull(language))
				q.setString(queryPos++, language);

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
	public List findFieldExistByDoc(long groupId, String language,
			String typeId, String orgId, int status, String rssable, int begin,
			int end) throws SystemException {
		Session session = null;

		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_F);
			StringBuffer query = new StringBuffer();
			query.append(sql);
			query.append("SELECT DISTINCT d.groupId, d.fieldid, f.name, f.rssable, COUNT(d.docid) AS description, f.createddate, f.modifieddate, f.createdbyuser, f.modifiedbyuser, f.status, f.language FROM vlegaldocument d ");

			query.append("LEFT JOIN VLegalField f ON d.fieldid = f.fieldid ");
			query.append(" WHERE ");
		
			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("d.groupId = ? ");
			}
		
			if (Validator.isNotNull(typeId))
				query.append(" AND d.typeDocId = ? ");
		
			if (Validator.isNotNull(orgId))
				query.append(" AND d.orgId = ? ");
		
			if (status == 2 || status == 1 || status == 0)
				query.append(" AND d.status= ? ");
		
			if (!rssable.equalsIgnoreCase("N/A"))
				query.append(" AND f.rssable= ? ");
		
			if (Validator.isNotNull(language))
				query.append(" AND d.language= ? ");
		
			query
					.append("GROUP BY d.groupid, d.fieldid, f.name, f.rssable, f.createddate, f.modifieddate, f.createdbyuser, f.modifiedbyuser, f.status, f.language ");
			query.append("ORDER BY ");
			query.append("f.name ASC");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("VLegalField", VLegalFieldImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);

			if (Validator.isNotNull(typeId))
				q.setString(queryPos++, typeId);

			if (Validator.isNotNull(orgId))
				q.setString(queryPos++, orgId);

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);

			if (!rssable.equalsIgnoreCase("N/A"))
				q.setBoolean(queryPos++, Boolean.parseBoolean(rssable));

			if (Validator.isNotNull(language))
				q.setString(queryPos++, language);

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
