package com.vportal.portlet.pollsdisplay;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portlet.pollsadmin.action.WebKeys;
import com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil;
public class EditPreferencesAction{

	public void processAction(ActionRequest req, ActionResponse res)
			{
		try {
			String cmd = ParamUtil.getString(req, "cmd");
			if (!cmd.equals(Constants.UPDATE)) {
				return;
			}
		
			ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
			String nameportlet = "pollsdisplay";
			long questionId = ParamUtil.getLong(req, "questionId");

			String titlePortlet = ParamUtil.getString(req, "titlePortlet");

			String styleBorder = ParamUtil.getString(req, "styleBorder",
					StringPool.BLANK);
			String styleBullet = ParamUtil.getString(req, "styleBullet",
					StringPool.BLANK);
			String styleTitle = ParamUtil.getString(req, "styleTitle",
					StringPool.BLANK);
			String styleContent = ParamUtil.getString(req, "styleContent",
					StringPool.BLANK);
			
			
			PollsQuestionServiceUtil.getQuestion(questionId);

			boolean guestVote = ParamUtil.getBoolean(req, "guestVote");
			boolean isBorder = ParamUtil.getBoolean(req, "isBorder");
			String bgcolor = ParamUtil.getString(req, "bgcolor");
			String themeType = ParamUtil.getString(req, "themeType");
			String themeSelected = ParamUtil.getString(req, "themeSelected");

			int paddingLeft = ParamUtil.getInteger(req, "paddingLeft");
			int paddingRight = ParamUtil.getInteger(req, "paddingRight");

			PortletPreferences prefs = req.getPreferences();

			prefs.setValue("paddingLeft", String.valueOf(paddingLeft));
			prefs.setValue("paddingRight", String.valueOf(paddingRight));

			prefs.setValue("bgcolor", bgcolor);
			prefs.setValue("isBorder", String.valueOf(isBorder));
			prefs.setValue("guestVote", String.valueOf(guestVote));

			prefs.setValue("themeType", themeType);
			prefs.setValue("themeSelected", themeSelected);

			prefs.setValue("question-id", String.valueOf(questionId));
			prefs.setValue("titlePortlet", titlePortlet);
			prefs.setValue("styleBorder", styleBorder);
			prefs.setValue("styleBullet", styleBullet);
			prefs.setValue("styleTitle", styleTitle);
			prefs.setValue("styleContent", styleContent);
			prefs.store();

			SessionMessages.add(req, nameportlet + ".doEdit");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
