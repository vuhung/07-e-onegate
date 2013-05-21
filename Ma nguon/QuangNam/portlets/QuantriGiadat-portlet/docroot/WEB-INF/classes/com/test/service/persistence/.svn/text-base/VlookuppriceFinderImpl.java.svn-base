package com.test.service.persistence;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.test.model.impl.VlookuppriceImpl;



public class VlookuppriceFinderImpl extends BasePersistenceImpl implements VlookuppriceFinder{
	
	  public List findByParents(String listParent,int start,int end)throws SystemException{
		    Session session =null;
			try{
				session = openSession();
				StringBuffer query = new StringBuffer();
				query.append("SELECT * FROM Vlookupprice WHERE listParent LIKE ?");
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addEntity("Vlookupprice", VlookuppriceImpl.class);
				int queryPos = 0;
				q.setString(queryPos++,"%"+listParent+"%");
				return QueryUtil.list(q, getDialect(), start, end);
		    }catch (Exception e) {
				throw new SystemException(e);
			}
			finally {
		    	closeSession(session);
			}
		  }
		  public int countByParents(String listParent)throws SystemException{
			    Session session =null;
				try{
					session = openSession();
					StringBuffer query = new StringBuffer();
					query.append("SELECT COUNT(*) as total FROM Vlookupprice WHERE listParent LIKE ?");
					SQLQuery q = session.createSQLQuery(query.toString());
					q.addScalar("total", Type.LONG);
					int queryPos = 0;
					q.setString(queryPos++,"%"+listParent+"%");
					Long count = null;
					Iterator ite = q.list().iterator();
					while(ite.hasNext()){
						count = (Long)ite.next();
					}
					if(count==null){
						count = new Long(0);
					}
					return count.intValue();
			    }catch (Exception e) {
					throw new SystemException(e);
				}
				finally {
			    	closeSession(session);
				}
			  }
		  /**
		 * @param parentId
		 * @param formPrice
		 * @param toPrice
		 * @param start
		 * @param end
		 * @return
		 * @throws SystemException
		 */
		public List findByPrice(String title,String listParent,int formPrice,int toPrice,int start,int end)throws SystemException{
			    Session session =null;
				try{
					session = openSession();
					StringBuffer query = new StringBuffer();
					query.append("SELECT * FROM Vlookupprice WHERE (listParent LIKE ?) AND (title LIKE ?) ");		
					if(formPrice!=0){
						query.append("AND ((position1 >= ?) OR (position2 >=?) OR (position3 >=?) OR (position4>=?) OR (position5>=?)) ");
					}
					if(toPrice!=0){
						query.append("AND ((position1 <= ?) OR (position2 <=?) OR (position3 <=?) OR (position4 <=?) OR (position5 <=?)) ");
					}
					SQLQuery q = session.createSQLQuery(query.toString());
					q.addEntity("Vlookupprice", VlookuppriceImpl.class);
					int queryPos = 0;
					q.setString(queryPos++,"%"+listParent+"%");
					q.setString(queryPos++,"%"+ title+"%");
					if(formPrice!=0){
					   q.setInteger(queryPos++, formPrice);
					   q.setInteger(queryPos++, formPrice);
					   q.setInteger(queryPos++, formPrice);
					   q.setInteger(queryPos++, formPrice);
					   q.setInteger(queryPos++, formPrice);
					}
					if(toPrice!=0){
				    	q.setInteger(queryPos++, toPrice);
				    	q.setInteger(queryPos++, toPrice);
				    	q.setInteger(queryPos++, toPrice);
				    	q.setInteger(queryPos++, toPrice);
				    	q.setInteger(queryPos++, toPrice);
					}
					return QueryUtil.list(q, getDialect(), start, end);
			    }catch (Exception e) {
					throw new SystemException(e);
				}
				finally {
			    	closeSession(session);
				}
			  }
			public int countByPrice(String title,String listParent,int formPrice,int toPrice)throws SystemException{
			    Session session =null;
				try{
					session = openSession();
					StringBuffer query = new StringBuffer();
					query.append("SELECT COUNT(*) as total FROM Vlookupprice WHERE (listParent LIKE ?) AND (title LIKE ?) ");
					if(formPrice!=0){
						query.append("AND (price >= ?) ");
					}
					if(toPrice!=0){
						query.append("AND (price <= ?) ");
					}
					SQLQuery q = session.createSQLQuery(query.toString());
					q.addScalar("total", Type.LONG);
					int queryPos = 0;
					q.setString(queryPos++,"%"+listParent+"%");
					q.setString(queryPos++,"%"+ title+"%");
					if(formPrice!=0){
					   q.setInteger(queryPos++, formPrice);
					}
					if(toPrice!=0){
				    	q.setInteger(queryPos++, toPrice);
					}
					Long count = null;
					Iterator ite = q.list().iterator();
					while(ite.hasNext()){
						count = (Long)ite.next();
					}
					if(count==null){
						count = new Long(0);
					}
					return count.intValue();
			    }catch (Exception e) {
					throw new SystemException(e);
				}
				finally {
			    	closeSession(session);
				}
			  }
	

}
