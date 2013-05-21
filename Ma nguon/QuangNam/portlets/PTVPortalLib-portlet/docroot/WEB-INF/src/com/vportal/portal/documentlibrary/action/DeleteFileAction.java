package com.vportal.portal.documentlibrary.action;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portal.service.AttachmentLocalServiceUtil;

public class DeleteFileAction extends Action {
	public ActionForward strutsExecute(
			ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
		throws Exception {
		try{
			long groupId = ParamUtil.getLong(request, "groupId");
			long folderId = ParamUtil.getLong(request, "folderId");
			String name = ParamUtil.getString(request, "name");
			Long attachmentId = ParamUtil.getLong(request, "attachmentId");
			DLFileEntryServiceUtil.deleteFileEntry(groupId,folderId, name);
			AttachmentLocalServiceUtil.deleteAttachment(attachmentId);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
}
