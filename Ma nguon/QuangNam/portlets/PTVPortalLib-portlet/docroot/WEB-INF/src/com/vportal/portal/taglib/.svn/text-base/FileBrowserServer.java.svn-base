/**
 * 
 */
package com.vportal.portal.taglib;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.service.AttachmentServiceUtil;
import com.vportal.portal.util.AttachmentUtil;
import com.vportal.portal.util.PortletKeysExt;

/**
 * @author donghh
 * @version 1.0.0
 * @since 13/10/2008
 * 
 */
public class FileBrowserServer extends Action {

	/*public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse response)
			throws Exception {

		long folderId = ParamUtil.getLong(req, "folderId");

		String cmd = ParamUtil.getString(req, "cmd");
		String keywords = ParamUtil.getString(req, "keyword");
		int begin = ParamUtil.getInteger(req, "begin", 0);
		int end = ParamUtil.getInteger(req, "end", 0);

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();

		DLFolder folder = (DLFolder) AttachmentUtil.getFolderByPortletId(req,
				PortletKeysExt.VCMS, groupId);

		if (folder != null) {
			// System.out.println("Folder Name:" + folder.getName());
		}

		List dlFiles = null;

		if (Validator.isNull(cmd)) {
			//dlFiles = (List) DLFileEntryLocalServiceUtil.getFileEntries(10091);
			//hoan
			dlFiles = (List) DLFileEntryLocalServiceUtil.getFileEntries(groupId,10091);
			//hoan
		} else if (Validator.isNotNull(cmd)) {
			if (cmd.equalsIgnoreCase("get_files")) {
				if (Validator.isNotNull(String.valueOf(folderId))) {
					//dlFiles = (List) DLFileEntryLocalServiceUtil
					//		.getFileEntries(folderId);
					//hoan
					dlFiles = (List) DLFileEntryLocalServiceUtil
							.getFileEntries(groupId,folderId);
					//hoan
				}
			} else if (cmd.equalsIgnoreCase("search_files")) {
				try {
					dlFiles = searchFile(themeDisplay.getCompanyId(), 14,
							folderId, keywords, begin, end);

					req.setAttribute("KEY_WORD", keywords);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (dlFiles != null) {
			// System.out.println("LIST_FILE = " + dlFiles.size());
		}

		req.setAttribute("LIST_FILE_BY_FOLDER_ID", dlFiles);
		req.setAttribute("FOLDER_ID", String.valueOf(folderId));

		return mapping.findForward("taglib.browser_file.display");

	}*/
	
	// SEARCH FILE ENTRY...
	//ham nay k ton tai phai dung lucene de co the search
	/*private List searchFile(long companyId, long groupId, long searchFolderId,
			String keywords, int begin, int end) throws Exception {

		long[] folderIdsArray = null;

		Hits hits = null;
		List fileEntries = new ArrayList();

		if (searchFolderId > 0) {
			folderIdsArray = new long[] { searchFolderId };
		} else {
			List folderIds = new ArrayList();

			folderIds.add(new Long(searchFolderId));

			DLFolderLocalServiceUtil.getSubfolderIds(folderIds, groupId,
					searchFolderId);

			folderIdsArray = StringUtil.split(StringUtil.merge(folderIds), 0L);
		}

		hits = DLFolderLocalServiceUtil.search(companyId, groupId,
		//		folderIdsArray, keywords, begin, end);
		//hoan
		 DLFolderLocalServiceUtil.search(companyId, groupId,
					folderIdsArray, keywords, begin, end);
		//hoan

		for (int i = 0; i < hits.getLength(); i++) {
			Document doc = hits.doc(i);

			long folderId = GetterUtil.getLong(doc.get("repositoryId"));
			String fileName = doc.get("path");

			//DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getFileEntry(
			//		folderId, fileName);
			//hoan
			DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getFileEntry(groupId, folderId, fileName);
			//hoan

			fileEntries.add(fileEntry);
		}
		// System.out.println("folderid = " + searchFolderId);

		// SEARCH FILE BY FILE NAME
		List attachments = AttachmentServiceUtil.searchAttachments(
				searchFolderId, keywords);

		if (attachments != null && attachments.size() > 0) {

			// System.out.println("ATTACHMENT LIST : " + attachments.size());

			for (int i = 0; i < attachments.size(); i++) {
				Attachment att = (Attachment) attachments.get(i);

				// DLFileEntry entry = (DLFileEntry) DLFileEntryLocalServiceUtil
				// .getFileEntry(att.getFolderId(), att.getFileName());

				DLFileEntry entry = (DLFileEntry) DLFileEntryLocalServiceUtil
						.getDLFileEntry(att.getFileEntryId());

				fileEntries.add(entry);
			}
		}

		return fileEntries;
	}*/
	
}
