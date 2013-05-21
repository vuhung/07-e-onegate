package com.vportal.portlet.vadvmanview;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Portlet;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ViewAction
 */
public class ViewAction extends MVCPortlet {
 
	@Override
	public void doEdit(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doEdit(renderRequest, renderResponse);
	}
	
	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		if(actionRequest.getPortletMode().equals(PortletMode.EDIT)){
			actionResponse.setWindowState(WindowState.MAXIMIZED);
		}
		long itemId = ParamUtil.getLong(actionRequest, "itemId");

		String[] itemIds = actionRequest.getParameterValues("Id");

		boolean defaultSize = ParamUtil.getBoolean(actionRequest, "defaultSize");
		boolean autoStart = ParamUtil.getBoolean(actionRequest, "autoStart");
		boolean autoRepeat = ParamUtil.getBoolean(actionRequest, "autoRepeat");
		boolean checkboxAll = ParamUtil.getBoolean(actionRequest, "checkboxAll");

		String styleDisplay = ParamUtil.getString(actionRequest, "styleDisplay");
		String titlePortlet = ParamUtil.getString(actionRequest, "titlePortlet");
		String selectstyleBorder = ParamUtil.getString(actionRequest,
				"selectstyleBorder", StringPool.BLANK);

		String styleBorder = ParamUtil.getString(actionRequest, "styleBorder",
				StringPool.BLANK);
		String styleBullet = ParamUtil.getString(actionRequest, "styleBullet",
				StringPool.BLANK);
		String styleTitle = ParamUtil.getString(actionRequest, "styleTitle",
				StringPool.BLANK);
		String styleContent = ParamUtil.getString(actionRequest, "styleContent",
				StringPool.BLANK);

		String themeType = ParamUtil.getString(actionRequest, "themeType");
		String themeSelected = ParamUtil.getString(actionRequest, "themeSelected");

		String controlBar = ParamUtil.getString(actionRequest, "controlBar");
		String width = ParamUtil.getString(actionRequest, "width");
		String height = ParamUtil.getString(actionRequest, "height");
		boolean isBorder = ParamUtil.getBoolean(actionRequest, "isBorder");

		String bgcolor = ParamUtil.getString(actionRequest, "bgcolor");

		int paddingLeft = ParamUtil.getInteger(actionRequest, "paddingLeft");
		int paddingRight = ParamUtil.getInteger(actionRequest, "paddingRight");

		PortletPreferences prefs = actionRequest.getPreferences();

		prefs.setValue("paddingLeft", String.valueOf(paddingLeft));
		prefs.setValue("paddingRight", String.valueOf(paddingRight));

		String advStyle = ParamUtil.getString(actionRequest,"advStyle");
		
		prefs.setValue("bgcolor", bgcolor);
		
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
		
		prefs.setValue("advStyle",advStyle);

		prefs.setValue("themeType", themeType);
		prefs.setValue("themeSelected", themeSelected);

		prefs.store();
		
		super.processAction(actionRequest, actionResponse);
	}
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.render(request, response);
	}
	
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}
	
}

