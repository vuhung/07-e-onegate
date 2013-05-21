/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vportal.portal.servlet;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys ;
import com.vportal.portal.util.PropsUtilExt;
/*import com.liferay.portal.util.PortalInstances;*/
/**
 * <a href="PortalSessionListener.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PortalSessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent event) {
		
		/*if (PropsValues.SESSION_DISABLED) {
			return;
		}*/
		//hoan
		if (GetterUtil.getBoolean(PropsUtil.get(PropsKeys.SESSION_DISABLED))){
			return;
		}
		//hoan
		HttpSession ses = event.getSession();
		
		MethodKey method = new MethodKey("com.liferay.portal.kernel.util.Validator.PortalSessionContext", "put",String.class, HttpSession.class);
		Object[] args = new Object[]{ses.getId(), ses};
		//PortalSessionContext.put(ses.getId(), ses);
		try {
			PortalClassInvoker.invoke(false, method, args);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Process session created events

		try {
			/*EventsProcessor.process(
			PropsKeys.SERVLET_SESSION_CREATE_EVENTS,
			PropsValues.SERVLET_SESSION_CREATE_EVENTS, ses);*/
			//hoan
			MethodKey methodProcess = new MethodKey("com.liferay.portal.events.EventsProcessorUtil", "process",String.class,String.class, HttpSession.class);
			Object[] argsProcess = new Object[]{PropsKeys.SERVLET_SESSION_CREATE_EVENTS,PropsUtil.getArray("SERVLET_SESSION_CREATE_EVENTS") ,ses};
			PortalClassInvoker.invoke(false, methodProcess, argsProcess);
			/*EventsProcessorUtil.process(
					PropsKeys.SERVLET_SESSION_CREATE_EVENTS,
					PropsValues.SERVLET_SESSION_CREATE_EVENTS, ses);*/
			//hoan		
		}
		catch (ActionException ae) {
			_log.error(ae, ae);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		/*if (PropsValues.SESSION_DISABLED) {
		return;
		}*/
		//hoan
		if (GetterUtil.getBoolean(PropsUtil.get("SESSION_DISABLED"))){
			return;
		}
		//hoan

		HttpSession ses = event.getSession();
		
		MethodKey method = new MethodKey("com.liferay.portal.kernel.util.Validator.PortalSessionContext", "remove",String.class);
		Object[] args = new Object[]{ses.getId()};
		try {
			PortalClassInvoker.invoke(false, method, args);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//PortalSessionContext.remove(ses.getId());

		try {
			Long userIdObj = (Long)ses.getAttribute(WebKeys.USER_ID);

			if (userIdObj == null) {
				_log.warn("User id is not in the session");
			} else {
				long userId = userIdObj.longValue();
	
				if (CompanyThreadLocal.getCompanyId() == 0) {
					setCompanyId(userId);
				}
	
				//MailSessionLock.cleanUp(ses);
				MethodKey methodSignOut = new MethodKey("com.liferay.portal.liveusers.LiveUsers", "signOut",long.class, String.class,String.class);
				Object[] argsSignOut = new Object[]{CompanyThreadLocal.getCompanyId(), userId, ses.getId()};
				PortalClassInvoker.invoke(false, methodSignOut, argsSignOut);
				//LiveUsers.signOut(CompanyThreadLocal.getCompanyId(), userId, ses.getId());
			}	
		
		}
		catch (IllegalStateException ise) {
			_log.warn("Please upgrade to a servlet 2.4 compliant container");
		}
		catch (Exception e) {
			_log.error(e, e);
		}
		//ses.removeAttribute(WebKeys.PORTLET_SESSION_TRACKER);
		//ses.removeAttribute(WebKeys.REVERSE_AJAX);

		//MessagingUtil.closeXMPPConnection(ses);

		// Process session destroyed events

		try {		
			/*EventsProcessor.process(
			PropsKeys.SERVLET_SESSION_DESTROY_EVENTS,
			PropsValues.SERVLET_SESSION_DESTROY_EVENTS, ses);*/
			//hoan
			MethodKey methodProcess = new MethodKey("com.liferay.portal.events.EventsProcessorUtil", "process",String.class,String.class, HttpSession.class);
			Object[] argsProcess = new Object[]{PropsKeys.SERVLET_SESSION_DESTROY_EVENTS,PropsUtil.getArray(PropsKeys.SERVLET_SESSION_DESTROY_EVENTS) ,ses};
			PortalClassInvoker.invoke(false, methodProcess, argsProcess);
			
			/*EventsProcessorUtil.process(
					PropsKeys.SERVLET_SESSION_DESTROY_EVENTS,
					PropsValues.SERVLET_SESSION_DESTROY_EVENTS, ses);*/
			//hoan

		}
		catch (ActionException ae) {
			_log.error(ae, ae);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void setCompanyId(long userId) throws Exception {
		MethodKey method = new MethodKey("com.liferay.portal.util.PortalInstances", "getCompanyIds");
		long[] companyIds = (long[])PortalClassInvoker.invoke(false, method);
		
		/*long[] companyIds = PortalInstances.getCompanyIds();*/
		//long[] companyIds = PortalUtil.getCompanyIds();
		long companyId = 0;

		if (companyIds.length == 1) {
			companyId = companyIds[0];
		}
		else if (companyIds.length > 1) {
			try {
				User user = UserLocalServiceUtil.getUserById(userId);

				companyId = user.getCompanyId();
			}
			catch (Exception e) {
				if (_log.isWarnEnabled()) {
					_log.warn(
						"Unable to set the company id for user " + userId, e);
				}
			}
		}

		if (companyId > 0) {
			CompanyThreadLocal.setCompanyId(companyId);
		}
	}
	protected long getCompanyId(long userId) throws Exception {
		PortalUtil.getCompanyIds();
		/*long[] companyIds = PortalInstances.getCompanyIds();*/
		long[] companyIds = PortalUtil.getCompanyIds();
		long companyId = 0;

		if (companyIds.length == 1) {
			companyId = companyIds[0];
		}
		else if (companyIds.length > 1) {
			try {
				User user = UserLocalServiceUtil.getUserById(userId);

				companyId = user.getCompanyId();
			}
			catch (Exception e) {
				if (_log.isWarnEnabled()) {
					_log.warn(
						"Unable to set the company id for user " + userId, e);
				}
			}
		}

		return companyId;
	}

	private static Log _log = LogFactory.getLog(PortalSessionListener.class);

}