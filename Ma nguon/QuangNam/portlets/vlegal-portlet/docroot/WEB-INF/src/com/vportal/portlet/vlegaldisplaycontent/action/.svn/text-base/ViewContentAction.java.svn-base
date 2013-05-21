package com.vportal.portlet.vlegaldisplaycontent.action;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vlegaldisplaycontent.util.ConstantKeysUtil;
import com.vportal.portlet.vlegaldisplaycontent.util.LayoutPortletUtil;

public class ViewContentAction extends MVCPortlet {

	@Override
	public void processAction(ActionRequest req, ActionResponse res) {	

		try
		{
			PortletPreferences prefs = req.getPreferences();
	
			String titlePortlet = ParamUtil.getString(req, "titlePortlet");
	
			String layoutPortletId = ParamUtil.getString(req, "layoutPortletId",
					StringPool.BLANK);
	
			String portletSelectId = ParamUtil.getString(req, "portletSelectId",
					StringPool.BLANK);
	
	
			prefs.setValue("titlePortlet", titlePortlet);
	
			prefs.setValue(ConstantKeysUtil.LAYOUT_PORTLET_ID, String
					.valueOf(layoutPortletId));
	
			prefs.setValue(ConstantKeysUtil.PORTLET_SELECTED_ID, String
					.valueOf(portletSelectId));
	
			prefs.store();
	
			selectLayoutPortlet(req);
	
		}catch(Exception ex)
		{
			
		}
		
	}
	
	@Override
	public void render(RenderRequest req, RenderResponse res)
	{
		try {
			selectLayoutPortlet(req);
			
			super.render(req, res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private void selectLayoutPortlet(PortletRequest req) throws Exception {

		String cmd = ParamUtil.getString(req, "cmd");

		long layoutPlid = ParamUtil.getLong(req, "layoutIdSelected");

		List selectPortletLayoutIds = null;


		if (Validator.isNotNull(cmd) && cmd.equals("SELECT_LAYOUT")) {
			selectPortletLayoutIds = LayoutPortletUtil.getPortletIdsByLayout(layoutPlid);
		}

		req.setAttribute("SELECT_PORTLET_LAYOUT_IDS", selectPortletLayoutIds);

		req.setAttribute("PLID_LAYOUT", String.valueOf(layoutPlid));

		List selectLayouts = new ArrayList();
		
		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, req,"viewcontentaction_WAR_vlegalportlet_INSTANCE_");

		req.setAttribute("SELECT_LAYOUTS", selectLayouts);
	}
	
	//Download File
		public void downloadFile(ActionRequest request, ActionResponse response)
		{
			
			try {
				long folderId = ParamUtil.getLong(request, "folderId");
				String name = ParamUtil.getString(request, "name");
				double version = ParamUtil.getDouble(request, "version");

				long fileShortcutId = ParamUtil.getLong(
						request, "fileShortcutId");

				String uuid = ParamUtil.getString(request, "uuid");
				long groupId = ParamUtil.getLong(request, "groupId");

				String targetExtension = ParamUtil.getString(
						request, "targetExtension");

				ThemeDisplay themeDisplay =
					(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

				HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(
						request);
				HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(
					response);

				getFile(
					folderId, name, version, fileShortcutId, uuid, groupId,
					targetExtension, themeDisplay, httpRequest, httpResponse);

			}
			catch (Exception e) {
			}
		}

		@SuppressWarnings("deprecation")
		protected void getFile(
				long folderId, String name, double version, long fileShortcutId,
				String uuid, long groupId, String targetExtension,
				ThemeDisplay themeDisplay, HttpServletRequest request,
				HttpServletResponse response)
			throws Exception {

			InputStream is = null;

			try {
				long companyId = themeDisplay.getCompanyId();
				long userId = themeDisplay.getUserId();

				DLFileEntry fileEntry = null;

				if (Validator.isNotNull(uuid) && (groupId > 0)) {
					try {
						fileEntry = DLFileEntryLocalServiceUtil.
							getFileEntryByUuidAndGroupId(
								uuid, groupId);

						folderId = fileEntry.getFolderId();
						name = fileEntry.getName();
					}
					catch (Exception e) {
					}
				}

				if (fileEntry == null) {
					fileEntry = DLFileEntryLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
						folderId, name);
				}

				if (version == 0) {
					String abc = fileEntry.getVersion();
					version = Double.parseDouble(abc);
				}

			}
			finally {
			}
		}
		
	
}
