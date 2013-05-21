/**
 * 
 */
package com.vportal.portal.attachment;

import java.util.List;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since Aug 5, 2008
 */
public interface FileAttachment {

	public DLFileEntry addFile(ActionRequest request,UploadPortletRequest uploadReq) throws PortalException, SystemException;

	public DLFileEntry getFileEntry();

	public List getFileEntries();

	public void deleteFileEntries();

	public void removeAttachment();

	public String getFileEntryDownloadURL(ActionRequest request);

}
