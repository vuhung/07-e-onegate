package com.vportal.portal.events;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SessionAction;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.vportal.portal.NoSuchAccessCounterException;
import com.vportal.portal.model.AccessCounter;
import com.vportal.portal.service.AccessCounterServiceUtil;
import com.vportal.portal.servlet.MainServlet;
import com.vportal.portal.util.PropsUtilExt;

/**
 * 
 * @author Brian Wing Shun Chan
 * @author nhatnd
 */
public class SessionCreateAction extends SessionAction {
	
	private static int hitIncrease = 0;
	public void run(HttpSession ses) throws ActionException {
		if (_log.isDebugEnabled()) {
			_log.debug(ses.getId());
		}
		MethodKey methodkeyLiveSessions = new MethodKey("com.liferay.portal.util.WebAppPool", "get", String.class,String.class);
		Object[] argsLiveSessions = new Object[]{String.valueOf(MainServlet.DEFAULT_COMPANY_ID),PropsUtilExt.LIVE_SESSIONS};
		int liveSessions = 0;
		try {
			liveSessions = Integer.parseInt(GetterUtil.get(
					(String) PortalClassInvoker.invoke(false, methodkeyLiveSessions, argsLiveSessions), "0"));
		} catch (NumberFormatException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		MethodKey methodkeyTotalVisit = new MethodKey("com.liferay.portal.util.WebAppPool", "get", String.class,String.class);
		Object[] argsTotalVisit = new Object[]{String.valueOf(MainServlet.DEFAULT_COMPANY_ID),PropsUtilExt.LIVE_SESSIONS};
		int totalVisit = 0;
		try {
			totalVisit = Integer.parseInt(GetterUtil.get(
					(String) PortalClassInvoker.invoke(false, methodkeyTotalVisit, argsTotalVisit), "0"));
		} catch (NumberFormatException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		if(totalVisit == 0)
			try {
				totalVisit = AccessCounterServiceUtil.getTotalHits(MainServlet.DEFAULT_COMPANY_ID);
			} catch (Exception e1) {
			}

		liveSessions++;
		
		if(ses.isNew()){
			totalVisit++;
			hitIncrease++;
		}
		
		
		
		/*WebAppPool.put(String.valueOf(MainServlet.DEFAULT_COMPANY_ID),
				PropsUtilExt.LIVE_SESSIONS, String.valueOf(liveSessions));
		
		WebAppPool.put(String.valueOf(MainServlet.DEFAULT_COMPANY_ID),
				PropsUtilExt.TOTAL_VISIT, String.valueOf(totalVisit));*/
		MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "put",String.class, String.class,String.class);
		Object[] args = new Object[]{MainServlet.DEFAULT_COMPANY_ID,PropsUtilExt.LIVE_SESSIONS, String.valueOf(liveSessions)};
		try {
			PortalClassInvoker.invoke(false, method, args);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		MethodKey method1 = new MethodKey("com.liferay.portal.util.WebAppPool", "put",String.class, String.class,String.class);
		Object[] args1 = new Object[]{MainServlet.DEFAULT_COMPANY_ID,PropsUtilExt.TOTAL_VISIT, String.valueOf(totalVisit)};
		try {
			PortalClassInvoker.invoke(false, method1, args1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		// update hits to database
		if(hitIncrease > 100) {
			try {
				updateHits(hitIncrease);
				hitIncrease = 0;
			} catch (Exception e) {
				_log.error(e);
			}
		}
	}

	/**
	 * @author nhatnd
	 * @param session
	 * @throws Exception
	 */
	private void updateHits(int hitIncrease) throws Exception {
		try {
			
			Date date = new Date();
			AccessCounterServiceUtil.updateCounter(MainServlet.DEFAULT_COMPANY_ID, date, hitIncrease);
		} catch (NoSuchAccessCounterException nac) {
			AccessCounterServiceUtil.addCounter(MainServlet.DEFAULT_COMPANY_ID, hitIncrease);
		}
		if (_log.isDebugEnabled()) {
			_log.debug("Update Access Counter");
		}
	}
	
	private void updateHits(HttpSession session) throws Exception {
		AccessCounter counter;
		try {
			counter = AccessCounterServiceUtil.getCounter(
					MainServlet.DEFAULT_COMPANY_ID, new Date());
		} catch (NoSuchAccessCounterException nac) {

			counter = AccessCounterServiceUtil.addCounter(
					MainServlet.DEFAULT_COMPANY_ID, 100);
		}
		if (_log.isDebugEnabled()) {
			_log.debug("Update Access Counter");
		}

		AccessCounterServiceUtil.updateCounter(MainServlet.DEFAULT_COMPANY_ID,
				new Date(), 100);
	}

	private static Log _log = LogFactory.getLog(SessionCreateAction.class);

}