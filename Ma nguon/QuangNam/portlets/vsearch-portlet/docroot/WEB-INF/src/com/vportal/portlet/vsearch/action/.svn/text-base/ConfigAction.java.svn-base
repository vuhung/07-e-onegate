package com.vportal.portlet.vsearch.action;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.ActionRequestImpl;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vsearch.NoSuchVConfigSearchException;
import com.vportal.portlet.vsearch.portletIdException;
import com.vportal.portlet.vsearch.model.VConfigSearch;
import com.vportal.portlet.vsearch.service.VConfigSearchLocalServiceUtil;
import com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil;


/**
 * Portlet implementation class ConfigAction
 */
public class ConfigAction extends MVCPortlet {

	public void processAction(ActionRequest reg, ActionResponse res) {

		String cmd = ParamUtil.getString(reg, Constants.CMD);

		try {

			if (cmd.equals(Constants.ADD)) {

			} else if (cmd.equals(Constants.DELETE)) {

			} else if (cmd.equals(Constants.UPDATE)) {

			}

			sendRedirect(reg, res);

		} catch (Exception ex) {

			SessionErrors.add(reg, ex.getClass().getName());
		}
	}

	public void add(ActionRequest request) throws PortalException,
			SystemException {
		Layout layout = (Layout) request.getAttribute(WebKeys.LAYOUT);
		long layoutPlid = ParamUtil.getLong(request, "layoutPortletId");

		String portletSelectId = ParamUtil
				.getString(request, "portletSelectId");
		String portletId = ParamUtil.getString(request, "portletId");
		String portleturl = getURL(request);

		long userId = PortalUtil.getUserId(request);

		User user = UserServiceUtil.getUserById(userId);

		long groupId = PortalUtil.getScopeGroupId(layout.getPlid());
		Date now = new Date();

		String languageId = user.getLanguageId();
		long companyId = user.getCompanyId();
		String userName = user.getLogin();
		VConfigSearch vConfigSearch = null;

		try {
			vConfigSearch = VConfigSearchServiceUtil.findByPortletId(portletId,
					groupId);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (vConfigSearch != null) {
			throw new portletIdException();
		}
		VConfigSearchServiceUtil.addConfigSearch(groupId, companyId, userId,
				userName, now, now, languageId, layoutPlid, portletId,
				portleturl);
	}

	public void delete(ActionRequest request)
			throws NoSuchVConfigSearchException, SystemException {
		long confisearchId = ParamUtil.getLong(request, "confisearchId");
		VConfigSearchServiceUtil.deleteConfigSeach(confisearchId);

	}

	public void update(ActionRequest request) throws PortalException,
			SystemException {
		Layout layout = (Layout) request.getAttribute(WebKeys.LAYOUT);
		long layoutPlid = ParamUtil.getLong(request, "layoutPortletId");
		long confisearchId = ParamUtil.getLong(request, "confisearchId");
		String portletId = ParamUtil.getString(request, "portletId");
		String portletSelectId = ParamUtil
				.getString(request, "portletSelectId");
		String portleturl = getURL(request);

		long userId = PortalUtil.getUserId(request);

		User user = UserServiceUtil.getUserById(userId);

		long groupId = PortalUtil.getScopeGroupId(layout.getPlid());

		Date now = new Date();
		String languageId = user.getLanguageId();
		long companyId = user.getCompanyId();
		String userName = user.getLogin();
		VConfigSearchServiceUtil.updateConfigSearch(confisearchId, groupId,
				companyId, userId, userName, now, now, languageId, layoutPlid,
				portletId, portleturl);
	}

	private String getURL(ActionRequest req) {

		long layoutPlid = ParamUtil.getLong(req, "layoutPortletId");

		String portletSelectId = ParamUtil.getString(req, "portletSelectId");

		String strutsaction = ParamUtil.getString(req, "strutsaction");

		HttpServletRequest httpReq = ((ActionRequestImpl) req).getHttpServletRequest();
		PortletURL portletURL = PortletURLFactoryUtil.create(httpReq, portletSelectId, layoutPlid, PortletRequest.RENDER_PHASE);
		String url = portletURL.toString();
		return url.substring(PortalUtil.getPortalURL(req).length(),url.length());

	}
}

