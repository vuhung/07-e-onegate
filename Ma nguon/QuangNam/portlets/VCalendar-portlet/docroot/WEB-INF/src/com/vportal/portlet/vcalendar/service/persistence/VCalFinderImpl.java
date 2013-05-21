package com.vportal.portlet.vcalendar.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class VCalFinderImpl extends BasePersistenceImpl implements VCalFinder {
	private static final String FIND_BY_G = VCalFinder.class.getName()+".findByGroupOrg";
	private static final String FIND_BY_F_D_G_T = VCalFinder.class.getName()+".findByF_D_G_T";
	public List findByGroupOrg() 
	{
		try {
			Session session = openSession();
			String query =  CustomSQLUtil.get(FIND_BY_G);
			SQLQuery sqlQuery =  session.createSQLQuery(query);
			return  sqlQuery.list();
		} catch (Exception e) {
			System.out.println("error");
		}
		return null;
	}
	/*public List findByF_D_G_T()
	{
		Session session = openSession();
		String query = CustomSQLUtil.get(FIND_BY_F_D_G_T);
		
		return null;
	}*/
	
	
}
