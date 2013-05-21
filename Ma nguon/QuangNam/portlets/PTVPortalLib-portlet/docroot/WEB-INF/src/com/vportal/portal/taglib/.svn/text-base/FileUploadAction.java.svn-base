/**
 * 
 */
package com.vportal.portal.taglib;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.vportal.portal.service.AttachmentLocalServiceUtil;

/**
 * @author donghh
 * @version {@link FileUploadAction}
 * @since 08/10/2008
 * 
 */
public class FileUploadAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse response)
			throws Exception {

		String folderId = ParamUtil
				.getString(req, "folderId", StringPool.BLANK);
		String name = ParamUtil.getString(req, "name", StringPool.BLANK);

		String cmd = ParamUtil.getString(req, Constants.CMD, StringPool.BLANK);

		long attachmentId = ParamUtil.getLong(req, "attachmentId");
		long companyId = ParamUtil.getLong(req, "companyId");

		if (Validator.isNotNull(cmd) && cmd.equalsIgnoreCase(Constants.DELETE)) {
			// 1. Delete file in document library

			/*
			 * DLFileEntryLocalServiceUtil.deleteFileEntry(Long
			 * .parseLong(folderId), name);
			 */

			// 2. Delete file in attachment database
			AttachmentLocalServiceUtil.deleteAttachment(attachmentId);

		}
		return null;
	}

}
