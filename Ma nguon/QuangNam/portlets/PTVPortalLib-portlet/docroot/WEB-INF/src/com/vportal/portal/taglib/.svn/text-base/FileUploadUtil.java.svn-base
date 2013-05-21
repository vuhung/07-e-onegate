/**
 * 
 */
package com.vportal.portal.taglib;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.util.AttachmentUtil;

/**
 * @author donghh
 * 
 */
public class FileUploadUtil {

	public static void uploadFile(ActionRequest request,UploadPortletRequest upRequest, String portletId,
			Class entryClass, long entryId) throws PortalException, SystemException {

		AttachmentUtil attUtil = new AttachmentUtil();
		// 1. upload file into server for entry

		attUtil.addFile(request,upRequest, portletId, entryClass, entryId);

		// 2. browser file from server for entry

		try {
			browserFileServer(request, entryClass, entryId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private static void browserFileServer(ActionRequest req, Class entryClass,
			long entryId) throws Exception {
		String listFileIds = ParamUtil.getString(req, "listFileIds");
		
		if (Validator.isNotNull(listFileIds) && listFileIds.length() > 0) {

			String arrFileIds[] = StringUtil.split(listFileIds, ",");

			for (int i = 0; i < arrFileIds.length; i++) {
				String fileId = arrFileIds[i];

				AttachmentLocalServiceUtil.addAttachment(entryClass, entryId,
						Long.parseLong(fileId));
			}
		}
	}
	
	public static void uploadImage(ActionRequest request,UploadPortletRequest uploadRequest, String portletId,
			Class entryClass, long entryId,int maxImage) throws PortalException, SystemException {

		AttachmentUtil attUtil = new AttachmentUtil();
		// 1. upload file into server for entry

		attUtil.addImage(request,uploadRequest, portletId, entryClass, entryId, maxImage);
		
		// 2. browser file from server for entry

		try {
			browserFileServer(request, entryClass, entryId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
