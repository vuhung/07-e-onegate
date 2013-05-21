/**
 * 
 */
package com.vportal.portal.attachment;

import java.util.List;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portlet.imagegallery.model.IGImage;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since Aug 6, 2008
 */
public interface ImageAttachment {

	public IGImage addImage(ActionRequest request,UploadPortletRequest uploadReq) throws PortalException, SystemException;

	public IGImage getImage();

	public List getImages();

	public void deleteImages();
	
	public void removeAttachment();

	public String getLargeImageURL(ActionRequest request);

	public String getSmallImageURL(ActionRequest request);
}
