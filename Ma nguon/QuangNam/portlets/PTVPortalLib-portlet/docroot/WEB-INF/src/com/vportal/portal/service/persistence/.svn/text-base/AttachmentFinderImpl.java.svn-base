package com.vportal.portal.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.imagegallery.model.IGImage;
import com.vportal.portal.model.impl.AttachmentImpl;

public class AttachmentFinderImpl extends BasePersistenceImpl implements AttachmentFinder{
	public List findDLFileEntries(Class entryClass, long entryId) {
		List result = null;
		Session session = null;
		SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");
		try {
			session = sessionFactory.openSession();
			StringBuffer query = new StringBuffer();
			query.append("SELECT {DLFileEntry.*} FROM Attachment ");
			query.append(" LEFT JOIN DLFileEntry ");
			query
					.append(" ON (DLFileEntry.fileEntryId = Attachment.fileEntryId) ");
			query.append(" WHERE (Attachment.entryClass = ?) ");
			query.append(" AND (Attachment.entryId =?) ");
			query.append(" AND (DLFileEntry.fileEntryId IS NOT NULL) ");

			SQLQuery q = session.createSQLQuery(query.toString());
			/*q.addEntity("DLFileEntry", DLFileEntryImpl.class);*/
			q.addEntity("DLFileEntry",PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portlet.documentlibrary.model.impl.DLFileEntryImpl"));

			int queryPos = 0;

			q.setString(queryPos++, entryClass.getName());
			q.setLong(queryPos++, entryId);

			result = q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
	    	closeSession(session);
		}
		return result;
	}
	public List searchFileEntries(long folderId , String keyword) {

		List result = null;
		Session session = null;
		SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");
		
		try {
			session = sessionFactory.openSession();
		
			StringBuffer query = new StringBuffer();
			query.append("SELECT * FROM Attachment");
			query.append(" RIGHT JOIN DLFileEntry ");
			query.append(" ON (DLFileEntry.folderId = Attachment.folderId) ");
		
			query.append(" WHERE Attachment.folderId = ?");
			
			query.append(" AND LOWER(DLFileEntry.title) LIKE LOWER(?) ");
		
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("Attachment", AttachmentImpl.class);
		
			int queryPos = 0;
		
			q.setLong(queryPos++, folderId);
			q.setString(queryPos++, "%"+keyword+"%");
		
			result = q.list();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return result;
	}
		
	public List findIGImages(Class entryClass, long entryId) {
		
			List result = null;
			Session session = null;
			SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");
		
		try {
			session = sessionFactory.openSession();
		
			StringBuffer query = new StringBuffer();
			query.append("SELECT IGImage.* FROM Attachment ");
			query.append(" LEFT JOIN IGImage ");
			query.append(" ON (IGImage.imageId = Attachment.imageId) ");
			query.append(" WHERE (Attachment.entryClass = ?) ");
			query.append(" AND (Attachment.entryId =?) ");
			query.append(" AND (Attachment.fileentryid =0)");
			query.append(" AND (IGImage.imageId IS NOT NULL) ");
		
			SQLQuery q = session.createSQLQuery(query.toString());
			//q.addEntity("IGImage", IGImageImpl.class);
			q.addEntity("IGImage", PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portlet.imagegallery.model.impl.IGImageImpl"));
			int queryPos = 0;
		
			q.setString(queryPos++, entryClass.getName());
			q.setLong(queryPos++, entryId);
		
			result =  q.list();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		
		}
		return result;
	}
}
