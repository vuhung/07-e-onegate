package com.vsi.advertisement.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vsi.advertisement.portlet.model.AdvItem;
import com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil;

/**
 * Portlet implementation class ViewAdv
 */
public class ViewAdv extends MVCPortlet {
 
	public void viewAdv(ActionRequest req, ActionResponse res) throws PortalException, SystemException, ReadOnlyException, ValidatorException, IOException{
		long itemId = ParamUtil.getLong(req, "itemId");
		boolean defaultSize = ParamUtil.getBoolean(req, "defaultSize");
		boolean autoStart = ParamUtil.getBoolean(req, "autoStart");
		boolean autoRepeat = ParamUtil.getBoolean(req, "autoRepeat");
		boolean checkboxAll = ParamUtil.getBoolean(req, "checkboxAll");

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

		String themeType = ParamUtil.getString(req, "themeType");
		String themeSelected = ParamUtil.getString(req, "themeSelected");

		String controlBar = ParamUtil.getString(req, "controlBar");
		String width = ParamUtil.getString(req, "width");
		String height = ParamUtil.getString(req, "height");
		boolean isBorder = ParamUtil.getBoolean(req, "isBorder");

		String bgcolor = ParamUtil.getString(req, "bgcolor");
		String advStyle = ParamUtil.getString(req,"advStyle");
		
		int paddingLeft = ParamUtil.getInteger(req, "paddingLeft");
		int paddingRight = ParamUtil.getInteger(req, "paddingRight");
		
		PortletPreferences prefs = req.getPreferences();
		
		prefs.setValue("itemId", String.valueOf(itemId));
		
		prefs.setValue("paddingLeft", String.valueOf(paddingLeft));
		prefs.setValue("paddingRight", String.valueOf(paddingRight));
		prefs.setValue("bgcolor", bgcolor);
		prefs.setValue("isBorder", String.valueOf(isBorder));
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
		
		prefs.setValue("advStyle",advStyle);

		prefs.setValue("themeType", themeType);
		prefs.setValue("themeSelected", themeSelected);
		
		prefs.store();
		res.setRenderParameter("jspPage", "/html/view_adv/view.jsp");
	}

}
