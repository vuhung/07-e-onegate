package com.vsi.edirectory.portlet.service.persistence;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vsi.edirectory.portlet.model.EDEmployee;
import com.vsi.edirectory.portlet.model.impl.EDEmployeeImpl;

public class EDEmployeeFinderImpl extends EDEmployeePersistenceImpl implements EDEmployeeFinder {

	public List findEmployeeByParam(long groupId, String language,long departmentId,String name)throws SystemException {
		
		Session session = null;
//		List<EDEmployee> employeeList = new ArrayList<EDEmployee>();
		try {

			session = openSession();
			String sql = "SELECT * FROM EDEmployee";
			StringBuffer query = new StringBuffer();
			query.append(sql);

			query.append(" WHERE ");
			
			if(Validator.isNull(groupId)){
				return null;
			}else{
				query.append("(EDEmployee.groupId = ?) ");
			}
			
			if (Validator.isNull(language)) {
				return null;
			} else {
				query.append("AND ");
				query.append("(EDEmployee.languageId = ?) ");
			}

			if (Validator.isNotNull(departmentId) && !Validator.equals(departmentId, 0)){
				query.append("AND ");
				query.append("(EDEmployee.departmentId = ?) ");
			}

			if (Validator.isNotNull(name)) {
				query.append("AND ");
				query.append("LOWER(EDEmployee.name) LIKE LOWER(?) ");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("EDEmployee", EDEmployeeImpl.class);
			int queryPos = 0;

			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);

			if (Validator.isNotNull(departmentId) && ! Validator.equals(departmentId, 0)) {
				q.setLong(queryPos++, departmentId);
			}

			if (Validator.isNotNull(name)) {
				q.setString(queryPos++, "%" + name + "%");
			}

//			employeeList =  q.list();
			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}
	
@SuppressWarnings("unchecked")
public List<EDEmployee> findEmployeeByParam(long groupId, String language,long departmentId,String name, int begin, int end)throws SystemException {
		
	Session session = null;

	try {

		session = openSession();
		String sql = "SELECT * FROM EDEmployee";
		StringBuffer query = new StringBuffer();
		query.append(sql);

		query.append(" WHERE ");
		if(Validator.isNull(String.valueOf(groupId))){
			return null;
		}else{
			query.append("(EDEmployee.groupId = ?) ");
		}
		if (Validator.isNull(language)) {
			return null;
		} else {
			query.append(" AND ");
			query.append("(EDEmployee.languageId = ?) ");
		}

		if (Validator.isNotNull(String.valueOf(departmentId)) && !Validator.equals(departmentId, "0")){
			query.append(" AND");
			query.append(" (EDEmployee.departmentId = ?) ");
		}

		if (Validator.isNotNull(name)) {
			query.append(" AND");
			query.append(" LOWER(EDEmployee.name) LIKE LOWER(?) ");
		}

		SQLQuery q = session.createSQLQuery(query.toString());
		q.addEntity("EDEmployee", EDEmployeeImpl.class);
		int queryPos = 0;

		q.setLong(queryPos++, groupId);
		q.setString(queryPos++, language);

		if (Validator.isNotNull(String.valueOf(departmentId)) && !Validator.equals(departmentId, "0")) {
			q.setLong(queryPos++, departmentId);
		}

		if (Validator.isNotNull(name)) {
			q.setString(queryPos++, "%" + name + "%");
		}

		return (List<EDEmployee>) QueryUtil.list(q, getDialect(), begin, end);

	} catch (Exception e) {
		throw new SystemException(e);
	} finally {
		closeSession(session);
	}
	
}
}






























