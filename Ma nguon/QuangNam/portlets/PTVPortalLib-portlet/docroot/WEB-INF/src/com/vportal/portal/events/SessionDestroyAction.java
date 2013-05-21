/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
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

package com.vportal.portal.events;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SessionAction;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.vportal.portal.servlet.MainServlet;
import com.vportal.portal.util.PropsUtilExt;

/**
 * <a href="SessionDestroyAction.java.html"><b><i>View Source</i></b></a>
 * 
 * @author Brian Wing Shun Chan
 * @author Nguyen Tuan Anh
 */
public class SessionDestroyAction extends SessionAction {

	public void run(HttpSession ses) throws ActionException {
		if (_log.isDebugEnabled()) {
			_log.debug(ses.getId());
		}
		
		MethodKey methodkeyLiveSessions = new MethodKey("com.liferay.portal.util.WebAppPool", "get", String.class,String.class);
		Object[] argsLiveSessions = new Object[]{String.valueOf(MainServlet.DEFAULT_COMPANY_ID),PropsUtilExt.LIVE_SESSIONS};
		
		int liveSessions = 0;
		try {
			liveSessions = Integer.parseInt(GetterUtil.get((String) PortalClassInvoker.invoke(false, methodkeyLiveSessions, argsLiveSessions), "0"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (liveSessions > 0) {

			liveSessions--;

			/*WebAppPool.put(String.valueOf(MainServlet.DEFAULT_COMPANY_ID),
					PropsUtilExt.LIVE_SESSIONS, String.valueOf(liveSessions));*/
			MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "put",String.class, String.class,String.class);
			Object[] args = new Object[]{MainServlet.DEFAULT_COMPANY_ID,PropsUtilExt.LIVE_SESSIONS, String.valueOf(liveSessions)};
			try {
				PortalClassInvoker.invoke(false, method, args);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	private static Log _log = LogFactory.getLog(SessionDestroyAction.class);

}