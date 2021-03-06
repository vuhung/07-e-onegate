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

package com.vportal.portal.myplaces.action;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.LayoutServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portal.myplaces.util.KeyUtil;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletMode;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * <a href="EditPagesAction.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class EditPagesAction extends MVCPortlet {

	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		String redirect = ParamUtil.getString(actionRequest, "redirect");

		long groupId = ParamUtil.getLong(actionRequest, "groupId");
		boolean privateLayout = ParamUtil.getBoolean(
			actionRequest, "privateLayout");

		Layout layout = null;

		List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(
			groupId, privateLayout, LayoutConstants.DEFAULT_PARENT_LAYOUT_ID, 0,
			1);

		if (layouts.size() > 0) {
			layout = layouts.get(0);
		}
		else {
			long parentLayoutId = LayoutConstants.DEFAULT_PARENT_LAYOUT_ID;
			String name = "New Page";
			String title = StringPool.BLANK;
			String description = StringPool.BLANK;
			String type = LayoutConstants.TYPE_PORTLET;
			boolean hidden = false;
			String friendlyURL = StringPool.BLANK;

			/*layout = LayoutServiceUtil.addLayout(
				groupId, privateLayout, parentLayoutId, name, title,
				description, type, hidden, friendlyURL);*/
			//hoan
			layout = LayoutServiceUtil.addLayout(
					groupId, privateLayout, parentLayoutId, name, title,
					description, type, hidden, friendlyURL, null);
			//hoan
		}

		if (layout != null) {
			String tabs1 = "public-pages";

			if (privateLayout) {
				tabs1 = "private-pages";
			}

			HttpServletRequest request = PortalUtil.getHttpServletRequest(
				actionRequest);

/*			PortletURL portletURL = new PortletURLImpl(
				request, PortletKeys.LAYOUT_MANAGEMENT, layout.getPlid(),
				PortletRequest.RENDER_PHASE);*/
			PortletURL portletURL = PortletURLFactoryUtil.create(request, PortletKeys.LAYOUT_MANAGEMENT, layout.getPlid(), PortletRequest.RENDER_PHASE);
			portletURL.setWindowState(WindowState.MAXIMIZED);
			portletURL.setPortletMode(PortletMode.VIEW);

			portletURL.setParameter(
				"struts_action", "/layout_management/edit_pages");
			portletURL.setParameter("tabs1", tabs1);
			portletURL.setParameter("redirect", redirect);
			portletURL.setParameter("groupId", String.valueOf(groupId));
			String portalURL ="" ;
			if(actionRequest.getServerPort()==80){
				portalURL= portletURL.toString().replace(KeyUtil.portalURL, PortalUtil.getPortalURL(actionRequest));
			}else{
				portalURL= portletURL.toString().replace(KeyUtil.portalURL+":"+actionRequest.getServerPort(), PortalUtil.getPortalURL(actionRequest));
			}
			actionResponse.sendRedirect(portalURL);
		}
	}

}