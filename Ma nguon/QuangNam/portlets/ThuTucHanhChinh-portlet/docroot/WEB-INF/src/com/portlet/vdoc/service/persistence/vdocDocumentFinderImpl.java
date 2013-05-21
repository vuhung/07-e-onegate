package com.portlet.vdoc.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.portlet.vdoc.model.vdocDocument;
import com.portlet.vdoc.model.impl.vdocDocumentImpl;

public class vdocDocumentFinderImpl extends vdocDocumentPersistenceImpl implements vdocDocumentFinder{
	
	public static String FIND_BY_D = vdocDocumentFinder.class.getName() + ".findDocument";
	public static String FIND_BY_D1 = "findDocument1";
	public static String COUNT_BY_D = vdocDocumentFinder.class.getName()
			+ ".countDocument";
	
	
	public List findDocumentByParams(long groupId, String language,String fieldId,String title,String orgId,int status) throws SystemException {

		Session session = null;

		try {
			session = openSession();
			String sql = "SELECT * FROM vdocDocument";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			if (!orgId.equals("0")) {
				query.append(" INNER JOIN vdocDORel ");
				query.append(" ON (vdocDocument.docId = vdocDORel.docId)");
			}
			query.append(" WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("(vdocDocument.groupId = ?) ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append("AND ");
				query.append("(vdocDocument.language = ?) ");
			}
			
			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append(" AND ");
				query.append("(vdocDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append(" AND ");
				query.append("(vdocDORel.orgId = ?) ");
			}

			if (Validator.isNotNull(title)) {
				query.append(" AND ");
				query.append("(LOWER(vdocDocument.title) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append("AND ");
				query.append("(vdocDocument.statusDoc = ?) ");
			}
			
			if (status == 2) {
				query.append("ORDER BY ");
				query.append("vdocDocument.publishedDate DESC");
			} else if (status == 1) {
				query.append("ORDER BY ");
				query.append("vdocDocument.approvedDate DESC");
			} else if (status == 0) {
				query.append("ORDER BY ");
				query.append("vdocDocument.createdDate DESC");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("vdocDocument", vdocDocumentImpl.class);
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			
			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				q.setString(queryPos++, orgId);
			}

			if (Validator.isNotNull(title))
				q.setString(queryPos++, "%" + title + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);
			
			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<vdocDocument> findDocumentByParams(long groupId, String language,String fieldId,String title,String orgId,int status, int begin, int end) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			String sql = "SELECT * FROM vdocDocument";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			if (!orgId.equals("0")) {
				query.append(" INNER JOIN vdocDORel ");
				query.append(" ON (vdocDocument.docId = vdocDORel.docId)");
			}
			query.append(" WHERE ");

			if (Validator.isNull(String.valueOf(groupId))) {
				return null;
			} else {
				query.append("(vdocDocument.groupId = ?) ");
			}

			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append("AND ");
				query.append("(vdocDocument.language = ?) ");
			}
			
			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0")) {
				query.append(" AND ");
				query.append("(vdocDocument.fieldId = ?) ");
			}

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				query.append(" AND ");
				query.append("(vdocDORel.orgId = ?) ");
			}

			if (Validator.isNotNull(title)) {
				query.append(" AND ");
				query.append("(LOWER(vdocDocument.title) LIKE LOWER(?)) ");
			}

			if (status == 2 || status == 1 || status == 0) {
				query.append("AND ");
				query.append("(vdocDocument.statusDoc = ?) ");
			}
			
			if (status == 2) {
				query.append("ORDER BY ");
				query.append("vdocDocument.publishedDate DESC");
			} else if (status == 1) {
				query.append("ORDER BY ");
				query.append("vdocDocument.approvedDate DESC");
			} else if (status == 0) {
				query.append("ORDER BY ");
				query.append("vdocDocument.createdDate DESC");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("vdocDocument", vdocDocumentImpl.class);
			int queryPos = 0;
			
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			
			if (Validator.isNotNull(fieldId) && !Validator.equals(fieldId, "0"))
				q.setString(queryPos++, fieldId);

			if (Validator.isNotNull(orgId) && !Validator.equals(orgId, "0")) {
				q.setString(queryPos++, orgId);
			}

			if (Validator.isNotNull(title))
				q.setString(queryPos++, "%" + title + "%");

			if (status == 2 || status == 1 || status == 0)
				q.setInteger(queryPos++, status);
			
			return (List<vdocDocument>)QueryUtil.list(q, getDialect(), begin, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
