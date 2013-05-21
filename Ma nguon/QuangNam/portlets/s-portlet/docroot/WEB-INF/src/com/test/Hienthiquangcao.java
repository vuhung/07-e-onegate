package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Hienthiquangcao
 */
public class Hienthiquangcao extends MVCPortlet {
	
	public void HienThi_New( ActionRequest req,ActionResponse response) throws PortletException {
		try {
		long itemId = ParamUtil.getLong(req, "itemId");
		String[] itemIds = req.getParameterValues("Id");

		boolean defaultSize = ParamUtil.getBoolean(req, "defaultSize");
		boolean autoStart = ParamUtil.getBoolean(req, "autoStart");
		boolean autoRepeat = ParamUtil.getBoolean(req, "autoRepeat");
		boolean checkboxAll = ParamUtil.getBoolean(req, "checkboxAll");
		boolean styleInfo = ParamUtil.getBoolean(req, "styleInfo");

		String styleDisplay = ParamUtil.getString(req, "styleDisplay");
		String titlePortlet = ParamUtil.getString(req, "titlePortlet");
		String selectstyleBorder = ParamUtil.getString(req,
				"selectstyleBorder", StringPool.BLANK);

		String styleBorder = ParamUtil.getString(req, "styleBorder",
				StringPool.BLANK);
		String styleBullet = ParamUtil.getString(req, "styleBullet",
				StringPool.BLANK);
		String styleTitle = ParamUtil.getString(req, "styleTitle",
				StringPool.BLANK);
		String styleContent = ParamUtil.getString(req, "styleContent",
				StringPool.BLANK);

		boolean isEnglish = ParamUtil.getBoolean(req, "isEnglish");
		String themeSelected = ParamUtil.getString(req, "themeSelected");

		String controlBar = ParamUtil.getString(req, "controlBar");
		String width = ParamUtil.getString(req, "width");
		String height = ParamUtil.getString(req, "height");
		boolean isBorder = ParamUtil.getBoolean(req, "isBorder");

		String bgcolor = ParamUtil.getString(req, "bgcolor");

		int paddingLeft = ParamUtil.getInteger(req, "paddingLeft");
		int paddingRight = ParamUtil.getInteger(req, "paddingRight");

		int paddingTop = ParamUtil.getInteger(req, "paddingTop");
		int paddingBottom = ParamUtil.getInteger(req, "paddingBottom");

		PortletPreferences prefs = req.getPreferences();

		prefs.setValue("paddingLeft", String.valueOf(paddingLeft));
		prefs.setValue("paddingRight", String.valueOf(paddingRight));
		prefs.setValue("paddingTop", String.valueOf(paddingTop));
		prefs.setValue("paddingBottom", String.valueOf(paddingBottom));

		prefs.setValue("bgcolor", bgcolor);
		prefs.setValue("styleInfo", String.valueOf(styleInfo));
		prefs.setValue("isBorder", String.valueOf(isBorder));
		prefs.setValue("itemId", String.valueOf(itemId));
		prefs.setValues("itemIds", itemIds);
		prefs.setValue("titlePortlet", titlePortlet);

		prefs.setValue("width", width);
		prefs.setValue("height", height);

		prefs.setValue("defaultSize", String.valueOf(defaultSize));
		prefs.setValue("autoStart", String.valueOf(autoStart));
		prefs.setValue("autoRepeat", String.valueOf(autoRepeat));
		prefs.setValue("controlBar", controlBar);
		prefs.setValue("styleDisplay", styleDisplay);
		prefs.setValue("checkboxAll", String.valueOf(checkboxAll));
		prefs.setValue("selectstyleBorder", selectstyleBorder);

		prefs.setValue("styleBorder", styleBorder);
		prefs.setValue("styleBullet", styleBullet);
		prefs.setValue("styleTitle", styleTitle);
		prefs.setValue("styleContent", styleContent);

		prefs.setValue("isEnglish", String.valueOf(isEnglish));
		prefs.setValue("themeSelected", themeSelected);
		prefs.store();
		//SessionMessages.add(req, config.getPortletName() + ".doEdit");
		
		response.setRenderParameter("jspPage","/html/hienthiquangcao/edit.jsp");
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	public void HienThi_News( ActionRequest req,ActionResponse response) throws PortletException {
		
		String typeIds = "0";
		
		typeIds = ParamUtil.getString(req, "typeId");
		req.setAttribute("typeIds",typeIds);
		response.setRenderParameter("jspPage","/html/hienthiquangcao/edits.jsp");
		
		
	}
}
