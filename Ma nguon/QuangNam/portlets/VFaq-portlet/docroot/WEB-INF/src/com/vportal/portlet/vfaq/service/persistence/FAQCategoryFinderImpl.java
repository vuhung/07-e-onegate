package com.vportal.portlet.vfaq.service.persistence;

import java.util.Iterator;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class FAQCategoryFinderImpl extends BasePersistenceImpl implements
		FAQCategoryFinder {
	public static String COUNT_BY_G_L_C = FAQCategoryFinder.class.getName()
			+ ".countByG_L_C";

	public int countByG_L_C(long groupId, String language, long categoryId)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(COUNT_BY_G_L_C);
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			int queryPos = 0;
			q.setLong(queryPos++, groupId);
			q.setString(queryPos++, language);
			q.setLong(queryPos++, categoryId);

			Iterator ite = q.list().iterator();
			Long count = null;
			while (ite.hasNext()) {
				count = (Long) ite.next();
			}
			if (count == null) {
				count = new Long(0);
			}
			return count.intValue();

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
