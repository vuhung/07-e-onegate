package com.vportal.portlet.vimagegallery;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portlet.vimagegallery.model.TFCategory;
import com.vportal.portlet.vimagegallery.service.TFCategoryServiceUtil;

/**
 * 
 * @author thuynv
 * 
 */

public class ActionUtil {

	public static void getCategory(ActionRequest req) throws Exception {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);

		getCategory(httpReq);
	}

	public static void getCategory(RenderRequest req) throws Exception {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);

		getCategory(httpReq);
	}

	public static void getCategory(HttpServletRequest req) throws Exception {

		String id = ParamUtil.getString(req, "id");
		// long id = ParamUtil.getLong(req, "id");

		TFCategory category = null;

		if (Validator.isNotNull(String.valueOf(id))) {

			category = TFCategoryServiceUtil.getCategory(Long.parseLong(id));
		}

		req.setAttribute("category", category);
	}

}