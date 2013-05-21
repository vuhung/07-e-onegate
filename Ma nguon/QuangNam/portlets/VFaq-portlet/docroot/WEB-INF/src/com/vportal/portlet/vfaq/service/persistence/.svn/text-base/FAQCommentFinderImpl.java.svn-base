package com.vportal.portlet.vfaq.service.persistence;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vportal.portlet.vfaq.model.impl.FAQCommentImpl;

public class FAQCommentFinderImpl extends BasePersistenceImpl implements FAQCommentFinder{
	public static String FIND_BY_G =
		FAQCommentFinder.class.getName() + ".findByGroupId";
	public static String COUNT_BY_G =
		FAQCommentFinder.class.getName() + ".countByGroupId";
	public List findByGroupId(long groupId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_G);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("FAQQuestion", FAQCommentImpl.class);
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			return q.list();

		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}
	}
	public List findByGroupId(long groupId,int start,int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_BY_G);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("FAQQuestion", FAQCommentImpl.class);
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			return QueryUtil.list(q, getDialect(), start, end);

		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}
	}
	public int countByGroupId(long groupId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_G);
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			Iterator ite = q.list().iterator();
			Long count =null;
			while(ite.hasNext()){
				count =(Long)ite.next();
			}
			if(count==null){
				count = new Long(0);
			}
			return count.intValue();
		} catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
	    	closeSession(session);
		}
	}
}
