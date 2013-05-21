package com.vportal.portal.attachment;

import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.liferay.documentlibrary.service.DLLocalServiceUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.servlet.ServletResponseUtil;
import com.vportal.portal.servlet.MainServlet;
import com.vportal.portal.util.PropsUtilExt;

/**
 * <a href="GetFileAction.java.html"><b><i>View Source</i></b></a>
 *
 */
public class GetFileAction extends MVCPortlet {

	public ActionForward strutsExecute(
			ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
		throws Exception {

		try {
			long folderId = ParamUtil.getLong(request, "folderId");
			String name = ParamUtil.getString(request, "name");
			//double version = ParamUtil.getDouble(actionRequest, "version");
			String version = ParamUtil.getString(request, "version");

			long fileShortcutId = ParamUtil.getLong(request, "fileShortcutId");

			String uuid = ParamUtil.getString(request, "uuid");
			long groupId = ParamUtil.getLong(request, "groupId");

			String targetExtension = ParamUtil.getString(
				request, "targetExtension");

			ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
				WebKeys.THEME_DISPLAY);

			getFile(
				folderId, name, version, fileShortcutId, uuid, groupId,
				targetExtension, themeDisplay, request, response);

			return null;
		}
		catch (Exception e) {
			PortalUtil.sendError(e, request, response);

			return null;
		}
	}

	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		try {
			long folderId = ParamUtil.getLong(actionRequest, "folderId");
			String name = ParamUtil.getString(actionRequest, "name");
			//double version = ParamUtil.getDouble(actionRequest, "version");
			String version = ParamUtil.getString(actionRequest, "version");
			long fileShortcutId = ParamUtil.getLong(
				actionRequest, "fileShortcutId");

			String uuid = ParamUtil.getString(actionRequest, "uuid");
			long groupId = ParamUtil.getLong(actionRequest, "groupId");

			String targetExtension = ParamUtil.getString(
				actionRequest, "targetExtension");

			ThemeDisplay themeDisplay =
				(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			HttpServletRequest request = PortalUtil.getHttpServletRequest(
				actionRequest);
			HttpServletResponse response = PortalUtil.getHttpServletResponse(
				actionResponse);

			getFile(
				folderId, name, version, fileShortcutId, uuid, groupId,
				targetExtension, themeDisplay, request, response);
			
			//String COMMON_NULL = "/common/null.jsp";
			//setForward(actionRequest,COMMON_NULL);
		}
		catch (Exception e) {
			PortalUtil.sendError(e, actionRequest, actionResponse);
		}
	}

	protected void getFile(
			long folderId, String name, String version, long fileShortcutId,
			String uuid, long groupId, String targetExtension,
			ThemeDisplay themeDisplay, HttpServletRequest request,
			HttpServletResponse response)
		throws Exception {

		InputStream is = null;


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

			if (fileShortcutId <= 0) {
				//hoan
				/*DLFileEntryPermission.check(
					themeDisplay.getPermissionChecker(),groupId, folderId, name,
					ActionKeys.VIEW);*/
				MethodKey method = new MethodKey("com.liferay.portlet.documentlibrary.service.permission.DLFileEntryPermission", "check",PermissionChecker.class, long.class,long.class,String.class,String.class);
				Object[] args = new Object[]{themeDisplay.getPermissionChecker(),groupId, folderId, name,ActionKeys.VIEW};
				PortalClassInvoker.invoke(false, method, args);		
				//hoan
			}
			else {
				DLFileShortcut fileShortcut =
					DLFileShortcutServiceUtil.getFileShortcut(fileShortcutId);

				folderId = fileShortcut.getToFolderId();
				name = fileShortcut.getToName();
			}

			if (fileEntry == null) {
				/*fileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
					folderId, name);*/
				//hoan
				fileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
						groupId, folderId, name);
				
			}

			if (version == "") {
				version = fileEntry.getVersion();
			}

			is = DLLocalServiceUtil.getFileAsStream(companyId, folderId, name);

			//String fileName = fileEntry.getTitleWithExtension();
			//hoan
			String fileName = fileEntry.getTitle() + "." + fileEntry.getExtension();
			//hoan
			if (Validator.isNotNull(targetExtension)) {
				
				MethodKey method = new MethodKey("com.liferay.portlet.documentlibrary.util.DocumentConversionUtil", "getTempFileId",long.class,String.class);
				Object[] args = new Object[]{fileEntry.getFileEntryId(),version};
				String id =(String)PortalClassInvoker.invoke(false, method, args);
				
				/*String id = DocumentConversionUtil.getTempFileId(
					fileEntry.getFileEntryId(), version);*/

				String sourceExtension = FileUtil.getExtension(name);
				MethodKey method1 = new MethodKey("com.liferay.portlet.documentlibrary.util.DocumentConversionUtil", "convert",String.class, InputStream.class, String.class,String.class);
				Object[] args1 = new Object[]{id, is, sourceExtension, targetExtension};
				InputStream convertedIS = (InputStream)PortalClassInvoker.invoke(false, method1, args1);
				
				/*InputStream convertedIS = DocumentConversionUtil.convert(
					id, is, sourceExtension, targetExtension);*/

				if ((convertedIS != null) && (convertedIS != is)) {
					StringBuilder sb = new StringBuilder();

					sb.append(fileEntry.getTitle());
					sb.append(StringPool.PERIOD);
					sb.append(targetExtension);

					fileName = sb.toString();

					is = convertedIS;
				}
			}

			String contentType = MimeTypesUtil.getContentType(fileName);

			//ServletResponseUtil.sendFile(response, fileName, is, contentType);
			ServletResponseUtil.sendFile(request,response, fileName, is, contentType);
		
	}

	protected boolean isCheckMethodOnProcessAction() {
		return _CHECK_METHOD_ON_PROCESS_ACTION;
	}

	private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;

}