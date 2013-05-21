/**
 * 
 */
package com.vportal.portal.attachment;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.DuplicateFolderNameException;
import com.liferay.portlet.documentlibrary.NoSuchFileEntryException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.portlet.imagegallery.model.IGFolder;
import com.liferay.portlet.imagegallery.model.IGImage;
import com.liferay.portlet.imagegallery.service.IGFolderLocalServiceUtil;
import com.liferay.portlet.imagegallery.service.IGFolderServiceUtil;
import com.liferay.portlet.imagegallery.service.IGImageLocalServiceUtil;
import com.liferay.portlet.imagegallery.service.IGImageServiceUtil;
import com.vportal.portal.NoSuchPortletFolderException;
import com.vportal.portal.model.PortletFolder;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.service.PortletFolderLocalServiceUtil;
import com.vportal.portal.util.PortalUtilExt;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since Aug 6, 2008
 */
public class AttachmentManager implements FileAttachment, ImageAttachment {

	public AttachmentManager(String portletId, Class entryClass, long entryId) {
		this.portletId = portletId;
		this.entryClass = entryClass;
		this.entryId = entryId;

		try {
			this.fileEntries = AttachmentLocalServiceUtil.getDLFileEntries(
					entryClass, entryId);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public DLFileEntry addFile(ActionRequest request,UploadPortletRequest uploadReq) throws PortalException, SystemException {

		long groupId = PortalUtil.getScopeGroupId(uploadReq);
		String portletTitle = LanguageUtil.get(request.getLocale(),
				"javax.portlet.title." + portletId);
		//int maxAttachment = ParamUtil.getInteger(request, "attached");
		//hoan
		int maxAttachment = ParamUtil.getInteger(uploadReq, "attached");
		try {
			// get/create vsi-portlet-folder
			String vsiFolderId = "vsi-portlet-folder";
			String vsiFolderTitle = LanguageUtil.get(request.getLocale(),
					vsiFolderId);
			DLFolder vsiFolder = null;
			List vsiFolders = PortletFolderLocalServiceUtil.getDLFolder(
					groupId, vsiFolderId);
			if (vsiFolders.size() < 1) {
				vsiFolder = createFileFolder(request, vsiFolderId,
						vsiFolderTitle);
			} else {
				vsiFolder = (DLFolder) vsiFolders.get(0);
			}

			// get/create portlet folder in the vsi-portlet-folder
			DLFolder uploadedFolder = null;
			List uploadedFolders = PortletFolderLocalServiceUtil.getDLFolder(
					groupId, portletId);
			if (uploadedFolders.size() < 1) {// folder does not exist
				uploadedFolder = createFileFolder(request, this.portletId,
						portletTitle, vsiFolder.getFolderId());
			} else {// folder exists
				uploadedFolder = (DLFolder) uploadedFolders.get(0);
			}
			if (maxAttachment < 2) {
				uploadFile(request,uploadReq, uploadedFolder);
			} else {
				uploadMultipleFile(request, uploadedFolder, maxAttachment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return this.fileEntry;
	}

	private void uploadFile(ActionRequest request,UploadPortletRequest uploadReq, DLFolder folder)
			throws Exception {

		String fileParameter = "file_0";
		String titleParameter = "title_0";
		String descParameter = "description_0";

		File file = uploadReq.getFile(fileParameter);

		String sourceFileName = uploadReq.getFileName(fileParameter);

		if (Validator.isNull(sourceFileName)) {// no file to upload
			return;
		}

		String title = ParamUtil.getString(uploadReq, titleParameter);
		String description = ParamUtil.getString(uploadReq, descParameter);
		String[] tagsEntries = new String[0];
		String extraSettings = "";
		long folderId = folder.getFolderId();
		long userId = PortalUtilExt.getUserId(request);

		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };

		if (Validator.isNull(title)) {
			title = sourceFileName;
		}

		String[] arrTemp = StringUtil.split(sourceFileName, StringPool.PERIOD);
		String titleFile = arrTemp[0];
		long groupId = PortalUtil.getScopeGroupId(request);
		//ham nay k ton tai nen k biet lam the nao
		DLFileEntry ListEntry = null;
		try {
			ListEntry = DLFileEntryLocalServiceUtil.getFileEntryByTitle(groupId,folderId, title);
		} catch (NoSuchFileEntryException e) {
			// TODO: handle exception
		}
		
		if (Validator.isNotNull(ListEntry) && ListEntry.getSize() > 0) {
			title = arrTemp[0] + ""
					+ String.valueOf(System.currentTimeMillis());
		}

		/*DLFileEntry entry = DLFileEntryLocalServiceUtil.addFileEntry(userId,
				folderId, sourceFileName, title, description, tagsEntries,
				extraSettings, file, communityPermissions, guestPermissions);*/
		//hoan
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileEntry.class.getName(), request);

		DLFileEntry entry = DLFileEntryLocalServiceUtil.addFileEntry(userId, groupId, folderId, sourceFileName, title, description, StringPool.BLANK, extraSettings, file, setViewForGuestAndCommunity(serviceContext));
		//hoan
		// AttachmentLocalServiceUtil.addAttachment(this.entryClass,
		// this.entryId,
		// entry.getFolderId(), entry.getName());
		AttachmentLocalServiceUtil.addAttachment(this.entryClass, this.entryId,
				entry.getFileEntryId());

		this.fileEntry = entry;
	}

	private void uploadMultipleFile(ActionRequest request, DLFolder folder,
			int maxAttachment) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		UploadPortletRequest uploadReq = PortalUtil
				.getUploadPortletRequest(request);

		long userId = themeDisplay.getUserId();
		long folderId = folder.getFolderId();
		String[] tagsEntries = new String[0];
		String extraSettings = "";
		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };

		for (int i = 0; i < maxAttachment; i++) {
			String fileParameter = "file_" + i;
			String titleParameter = "title_" + i;
			String descParameter = "description_" + i;

			File file = uploadReq.getFile("file_" + i);
			String sourceFileName = uploadReq.getFileName(fileParameter);
			String title = ParamUtil.getString(uploadReq, titleParameter);
			String desc = ParamUtil.getString(uploadReq, descParameter);

			if (Validator.isNull(sourceFileName)) {
				break;
			}
			if (Validator.isNull(title)) {
				title = sourceFileName;
			}

			/*DLFileEntry entry = DLFileEntryLocalServiceUtil
					.addFileEntry(userId, folderId, sourceFileName, title,
							desc, tagsEntries, extraSettings, file,
							communityPermissions, guestPermissions);*/
			long groupId = PortalUtil.getScopeGroupId(request);
			DLFileEntry entry = DLFileEntryLocalServiceUtil.addFileEntry(userId, groupId, folderId, sourceFileName, title, desc, StringPool.BLANK, extraSettings, file, null);
					

			// AttachmentLocalServiceUtil.addAttachment(this.entryClass,
			// this.entryId, entry.getFolderId(), entry.getName());

			AttachmentLocalServiceUtil.addAttachment(this.entryClass,
					this.entryId, entry.getFileEntryId());

			this.fileEntries.add(entry);
		}
	}

	public List getFileEntries() {
		return this.fileEntries;
	}

	public DLFileEntry getFileEntry() {
		return this.fileEntry;
	}

	public void deleteFileEntries() {
		try {
			// delete attachment info
			AttachmentLocalServiceUtil.deleteAttachments(this.entryClass,
					this.entryId);

			// delete attachment data
			List fileEntries = AttachmentLocalServiceUtil.getDLFileEntries(
					entryClass, entryId);
			for (int i = 0; i < fileEntries.size(); i++) {
				DLFileEntry fileEntry = (DLFileEntry) fileEntries.get(i);
				DLFileEntryLocalServiceUtil.deleteFileEntry(fileEntry);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void removeAttachment() {
		try {
			AttachmentLocalServiceUtil.deleteAttachments(this.entryClass,
					this.entryId);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String getFileEntryDownloadURL(ActionRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		String downloadURL = "";
		try {
			downloadURL = "/c/document_library/get_file?p_l_id="
					+ themeDisplay.getPlid() + "&folderId="
					+ this.fileEntry.getFolderId() + "&name="
					+ this.fileEntry.getName();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return downloadURL;
	}

	public void setFileEntryId(long entryId) {
		this.entryId = entryId;
	}

	public IGImage addImage(ActionRequest request,UploadPortletRequest uploadReq) throws PortalException, SystemException {

		/*long groupId = PortalUtil.getPortletGroupId(request);*/
		long groupId = PortalUtil.getScopeGroupId(request);
		String portletTitle = LanguageUtil.get(request.getLocale(),
				"javax.portlet.title." + this.portletId);
		String portletIdImg = "img_" + this.portletId;
		int maxImage = ParamUtil.getInteger(uploadReq, "maxImage");

		try {
			// get/create vsi-image-folder
			// String vsiFolderId = "vsi-image-folder";
			// String vsiFolderTitle = "vsi-image-folder";
			// String vsiImgFolderId = "image_" + vsiFolderId;
			// IGFolder vsiFolder = null;
			// List vsiFolders = PortletFolderLocalServiceUtil
			// .getByPortletId(vsiImgFolderId);
			// if (vsiFolders.size() < 1) {
			// vsiFolder = createImageFolder(request, vsiImgFolderId,
			// vsiFolderTitle, false);
			// } else {
			// for (int i = 0; i < vsiFolders.size(); i++) {
			// PortletFolder pf = (PortletFolder) vsiFolders.get(i);
			// long folderId = pf.getFolderId();
			//
			// // if folder is deleted or in another community
			// try {
			// IGFolder folder = IGFolderLocalServiceUtil
			// .getFolder(folderId);
			// if (folder.getGroupId() == groupId) {
			// vsiFolder = folder;
			// break;
			// }
			// if ((i == vsiFolders.size() - 1)
			// && (folder.getGroupId() != groupId)) {
			// throw new Exception();
			// }
			// } catch (Exception e) {
			// vsiFolder = createImageFolder(request, vsiImgFolderId,
			// vsiFolderTitle, true);
			//
			// // remove old info
			// if (e instanceof NoSuchFolderException) {
			// PortletFolderLocalServiceUtil
			// .removePortletFolder(pf.getId());
			// }
			// }
			// }
			// }

			// get/create portlet folder in the vsi-image-folder
			IGFolder uploadedFolder = null;
			List folders = PortletFolderLocalServiceUtil
					.getByPortletId(portletIdImg);
			if (folders.size() < 1) {// folder does not exist
				IGFolder folder = createImageFolder(request, portletIdImg,
						portletTitle, false);
				uploadedFolder = folder;
			} else {// folder exists
				for (int i = 0; i < folders.size(); i++) {
					PortletFolder pf = (PortletFolder) folders.get(i);
					long folderId = pf.getFolderId();

					// if folder is deleted or in another community
					try {
						IGFolder folder = IGFolderLocalServiceUtil
								.getFolder(folderId);
						if (folder.getGroupId() == groupId) {
							uploadedFolder = folder;
							break;
						}
						if ((i == folders.size() - 1)
								&& (folder.getGroupId() != groupId)) {
							throw new Exception();
						}
					} catch (Exception e) {
						IGFolder createdFolder = createImageFolder(request,
								portletIdImg, portletTitle, true);
						uploadedFolder = createdFolder;
					}
				}
			}
			if (maxImage < 2) {
				uploadImage(request,uploadReq, uploadedFolder);
			} else {
				uploadMultipleImage(request,uploadReq, uploadedFolder, maxImage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return this.image;
	}

	private void uploadImage(ActionRequest req,UploadPortletRequest uploadReq, IGFolder folder)
			throws Exception {

		String imgParameter = "image_0";
		String descParameter = "description_0";

		String[] tagsEntries = new String[0];
		long folderId = folder.getFolderId();
		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };

		File file = uploadReq.getFile(imgParameter);
		String sourceFileName = uploadReq.getFileName(imgParameter);
		if (Validator.isNull(sourceFileName)) {
			return;
		}
		String description = ParamUtil.getString(uploadReq, descParameter);
		String contentType = getContentType(
				uploadReq.getContentType(imgParameter), file.getName());

		/*IGImage image = IGImageServiceUtil.addImage(folderId, file.getName(),
				description, file, contentType, tagsEntries,
				communityPermissions, guestPermissions);*/
		//hoan
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				IGImage.class.getName(), req);
		long groupId = PortalUtil.getScopeGroupId(req);
		IGImage image = IGImageServiceUtil.addImage(groupId, folderId, sourceFileName, description, file, contentType, setViewForGuestAndCommunity(serviceContext));
		//hoan

		// folderId <=> imageId
		// fileName <=> smallImageId
		AttachmentLocalServiceUtil.addAttachment(this.entryClass, this.entryId,
				image.getImageId(), true);
		// AttachmentLocalServiceUtil.addAttachment(entryClass, entryId, image
		// .getImageId(), Long.toString(image.getSmallImageId()));

		this.image = image;

	}

	private void uploadMultipleImage(ActionRequest req,UploadPortletRequest uploadReq, IGFolder folder,
			int maxImage) throws Exception {
		
		String[] tagsEntries = new String[0];
		long folderId = folder.getFolderId();
		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };

		for (int i = 0; i < maxImage; i++) {

			String imgParameter = "image_" + i;
			String descParameter = "description_" + i;

			File file = uploadReq.getFile(imgParameter);
			String sourceFileName = uploadReq.getFileName(imgParameter);
			if (Validator.isNull(sourceFileName)) {
				return;
			}
			String description = ParamUtil.getString(uploadReq, descParameter);
			String contentType = getContentType(
					uploadReq.getContentType(imgParameter), file.getName());

			/*IGImage image = IGImageServiceUtil.addImage(folderId,
					file.getName(), description, file, contentType,
					tagsEntries, communityPermissions, guestPermissions);*/
			//hoan
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					IGImage.class.getName(), req);
			long groupId = PortalUtil.getScopeGroupId(req);
			IGImage image = IGImageServiceUtil.addImage(groupId, folderId, sourceFileName, description, file, contentType, setViewForGuestAndCommunity(serviceContext));
			//hoan
			// folderId <=> imageId
			// fileName <=> smallImageId
			AttachmentLocalServiceUtil.addAttachment(this.entryClass,
					this.entryId, image.getImageId(), true);

			this.images.add(image);
		}
	}

	protected String getContentType(String contentType, String fileName) {

		if (contentType.equals("application/octet-stream")) {
			String ext = GetterUtil.getString(FileUtil.getExtension(fileName
					.toLowerCase()));

			if (Validator.isNotNull(ext)) {
				if (ext.equals("jpg")) {
					ext = "jpeg";
				} else if (ext.equals("tif")) {
					ext = "tiff";
				}

				contentType = "image/" + ext;
			}
		}

		return contentType;
	}

	public void deleteImages() {
		try {
			// delete attachment data
			List images = AttachmentLocalServiceUtil.getIGImages(
					this.entryClass, this.entryId);
			for (int i = 0; i < images.size(); i++) {
				IGImage image = (IGImage) images.get(i);
				IGImageLocalServiceUtil.deleteImage(image.getImageId());

				// delete attachment info
				AttachmentLocalServiceUtil.deleteAttachments(this.entryClass,
						this.entryId);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vportal.portal.attachment.ImageAttachment#removeImagesInfo()
	 */

	public IGImage getImage() {
		return this.image;
	}

	public List getImages() {
		return this.images;
	}

	public String getLargeImageURL(ActionRequest request) {
		String url = "/image_gallery?img_id=" + image.getLargeImageId();
		return url;
	}

	public String getSmallImageURL(ActionRequest request) {
		String url = "/image_gallery?img_id=" + image.getSmallImageId();
		return url;
	}

	private DLFolder createFileFolder(ActionRequest request, String portletId,
			String folderName) throws Exception {

		return createFileFolder(request, portletId, folderName, 0);
	}

	private DLFolder createFileFolder(ActionRequest request, String portletId,
			String folderName, long parentId) throws Exception {

		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };
		long userId = PortalUtilExt.getUserId(request);
		long plId = PortalUtilExt.getPlid(request);
		long groupId = PortalUtilExt.getPortletGroupId(request);
		String folderDescription = folderName;

		// create the folder
		DLFolder folder;
		try {
//			/*folder = DLFolderLocalServiceUtil.addFolder(userId, plId, parentId,
//					folderName, folderDescription, communityPermissions,
//					guestPermissions);*/
			//hoan
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFolder.class.getName(), request);
			folder = DLFolderLocalServiceUtil.addFolder(userId, groupId, parentId, folderName, folderDescription, setViewForGuestAndCommunity(serviceContext));
			//hoan
		} catch (DuplicateFolderNameException duplicateE) {
			folder = DLFolderLocalServiceUtil.getFolder(groupId, parentId,
					folderName);
		}

		// add the relation between portlet and folder
		boolean isAdd = false;
		try {
			PortletFolderLocalServiceUtil.getPortletFolder(portletId,
					folder.getFolderId());
		} catch (NoSuchPortletFolderException e) {
			isAdd = true;
		}
		if (isAdd) {
			PortletFolderLocalServiceUtil.addPortletFolder(portletId,
					folder.getFolderId(), folderDescription);
		}
		return folder;
	}

	private IGFolder createImageFolder(ActionRequest request, String portletId,
			String folderTitle, boolean onlyIG) throws Exception {

		return createImageFolder(request, portletId, folderTitle, 0, onlyIG);

	}

	private IGFolder createImageFolder(ActionRequest request, String portletId,
			String folderTitle, long parentId, boolean onlyIG) throws Exception {

		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };
		long plId = PortalUtilExt.getPlid(request);

		String folderDescription = folderTitle;
		// create the folder
		/*IGFolder folder = IGFolderServiceUtil.addFolder(plId, parentId,
				folderTitle, folderDescription, communityPermissions,
				guestPermissions);*/
		//hoan
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				IGFolder.class.getName(), request);
		IGFolder folder = IGFolderServiceUtil.addFolder(parentId, folderTitle, folderDescription, setViewForGuestAndCommunity(serviceContext));
		//hoan
		if (!onlyIG) {
			// add the relation between portlet and folder
			PortletFolderLocalServiceUtil.addPortletFolder(portletId,
					folder.getFolderId(), folderTitle);
		}

		return folder;
	}
	
	private ServiceContext setViewForGuestAndCommunity(ServiceContext serviceContext){
		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };
		return setPermissionForGuestAndCommunity(serviceContext,guestPermissions,communityPermissions);
	}
	
	private ServiceContext setPermissionForGuestAndCommunity(ServiceContext serviceContext,String[] guestPermissions,String[] communityPermissions){
		serviceContext.setGuestPermissions(guestPermissions);
		serviceContext.setCommunityPermissions(communityPermissions);
		return serviceContext;
	}
	
	
	private Class entryClass;
	private long entryId;
	private String portletId;

	private DLFileEntry fileEntry;
	private List fileEntries;

	private IGImage image;
	private List images;

}
