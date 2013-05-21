package com.vportal.portal.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portlet.documentlibrary.model.DLFolder;

public class PortletFolderFinderImpl extends BasePersistenceImpl implements PortletFolderFinder{
	public List findDLFolder(long groupId, String portletId) {
		Session session = null;
		SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");
		List result = null;
		try {
			session = sessionFactory.openSession();
			StringBuffer query = new StringBuffer();
			query.append("SELECT {DLFolder.*} FROM PortletFolder ");
			query.append(" INNER JOIN DLFolder ");
			query.append(" ON (PortletFolder.folderId = DLFolder.folderId) ");
			query.append(" WHERE (DLFolder.groupId = ?) ");
			query.append(" AND ");
			// query.append(" (DLFolder.name =?) ");
			query.append(" (PortletFolder.portletId =?) ");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("DLFolder", PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portlet.documentlibrary.model.impl.DLFolderImpl"));
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, portletId);
			result = q.list();
		} catch (Exception e) {
			System.out.println("eeeeeeeeeeeeeerrrrrrrrrrrrrrrr");
			e.printStackTrace();
		}
		finally {
	    	closeSession(session);
		}
		return result;
	}
}
