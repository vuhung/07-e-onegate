/**
 * 
 */
package com.vportal.portal.util;

import java.io.File;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;


import com.liferay.documentlibrary.DuplicateFileException;
import com.liferay.documentlibrary.FileNameException;
import com.liferay.documentlibrary.FileSizeException;
import com.liferay.documentlibrary.SourceFileNameException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.DuplicateFolderNameException;
import com.liferay.portlet.documentlibrary.NoSuchFileEntryException;
import com.liferay.portlet.documentlibrary.NoSuchFolderException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.portlet.imagegallery.NoSuchImageException;
import com.liferay.portlet.imagegallery.model.IGFolder;
import com.liferay.portlet.imagegallery.model.IGImage;
import com.liferay.portlet.imagegallery.service.IGFolderLocalServiceUtil;
import com.liferay.portlet.imagegallery.service.IGFolderServiceUtil;
import com.liferay.portlet.imagegallery.service.IGImageLocalServiceUtil;
import com.liferay.portlet.imagegallery.service.IGImageServiceUtil;
/*import com.liferay.portlet.taggedcontent.util.AssetPublisherUtil;*/
import com.vportal.portal.NoSuchAttachmentException;
import com.vportal.portal.NoSuchPortletFolderException;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.model.PortletFolder;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.service.PortletFolderLocalServiceUtil;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since May 21, 2008
 */

/**
 * use AttachmentManager instead
 */
public class AttachmentUtil {

	DLFolder fileFolder = null;
	DLFileEntry file = null;
	List fileList = new ArrayList();

	IGFolder imageFolder = null;
	IGImage image = null;
	List imageList = new ArrayList();

	/**
	 * Add attached document to DocMan
	 * 
	 * @param portletId
	 *            The id of portlet that request to upload
	 * @param request
	 *            Upload request
	 * @param entryId
	 *            Id of entry that uploaded
	 * @param entryClass
	 *            Class of the entry
	 * @throws SystemException 
	 * @throws PortalException 
	 */

	public void addFile(ActionRequest request,UploadPortletRequest uprequest, String portletId,
			Class entryClass, long entryId) throws PortalException, SystemException {
		int maxAttachment = ParamUtil.getInteger(uprequest, "attached");
		addFile(request,uprequest, portletId, entryClass, entryId, maxAttachment);

	}

	public void addFile(ActionRequest request,UploadPortletRequest uprequest, String portletId,
			Class entryClass, long entryId, int maxAttachment) throws PortalException, SystemException {

		long groupId = PortalUtilExt.getPortletGroupId(request);
		portletId = "javax.portlet.title." + portletId;
		String portletTitle = LanguageUtil.get(request.getLocale(), portletId);

		try {
			// get/create vsi-portlet-folder
			String vsiFolderId = "vsi-portlet-folder";
			String vsiFolderTitle = LanguageUtil.get(request.getLocale(),
					vsiFolderId);
			DLFolder vsiFolder = null;
			List vsiFolders = PortletFolderLocalServiceUtil.getDLFolder(
					groupId, vsiFolderId);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					entryClass.getName(), request);
			if (vsiFolders.size() < 1) {
				/*vsiFolder = createFileFolder(vsiFolderId, request,
						vsiFolderTitle);*/
				//hoan
				
				vsiFolder = createFileFolder(vsiFolderId, request,
						vsiFolderTitle,serviceContext);
				//hoan
			} else {
				vsiFolder = (DLFolder) vsiFolders.get(0);
			}

			// get/create portlet folder in the vsi-portlet-folder
			DLFolder uploadedFolder = null;
			List uploadedFolders = PortletFolderLocalServiceUtil.getDLFolder(
					groupId, portletId);
			if (uploadedFolders.size() < 1) {// folder does not exist
				/*uploadedFolder = createFileFolder(portletId, request,
						portletTitle, vsiFolder.getFolderId());*/
				//hoan
				uploadedFolder = createFileFolder(portletId, request,
						portletTitle, vsiFolder.getFolderId(),serviceContext);
				//hoan
			} else {// folder exists
				uploadedFolder = (DLFolder) uploadedFolders.get(0);
			}
			if (maxAttachment < 2) {
				uploadFile(request,uprequest, uploadedFolder, entryId, entryClass);
			} else {
				uploadMultipleFile(request,uprequest, uploadedFolder, entryId,
						entryClass, maxAttachment);
			}
			this.fileFolder = uploadedFolder;

		} catch (Exception ex) {

			if (ex instanceof DuplicateFileException
					|| ex instanceof DuplicateFolderNameException
					|| ex instanceof FileNameException
					|| ex instanceof FileSizeException
					|| ex instanceof SourceFileNameException) {

				SessionErrors.add(request, ex.getClass().getName());
			} else {

				ex.printStackTrace();
			}
		}
	}

	public void deleteFile(long attachmentId) throws NoSuchAttachmentException,
			PortalException, SystemException, RemoteException {

		Attachment attachment = AttachmentLocalServiceUtil
				.getAttachment(attachmentId);

		// delete file from docman
		long folderId = attachment.getFolderId();
		String name = attachment.getFileName();
		/*DLFileEntryLocalServiceUtil.deleteFileEntry(folderId, name);*/
		//hoan
		DLFileEntryLocalServiceUtil.deleteFileEntry(attachment.getGroupId(),folderId, name);
		//hoan
		// delete attachment
		AttachmentLocalServiceUtil.deleteAttachment(attachmentId);
	}

	public void deleteFile(Class entryClass, long folderId, String fileName)
			throws NoSuchFileEntryException, PortalException, SystemException {

		Attachment attachment = AttachmentLocalServiceUtil.getAttachment(
				entryClass, folderId, fileName);

		// delete file from docman
		/*DLFileEntryLocalServiceUtil.deleteFileEntry(folderId, fileName);*/
		//hoan
		DLFileEntryLocalServiceUtil.deleteFileEntry(attachment.getGroupId(),folderId, fileName);
		//hoan

		// delete attachment
		AttachmentLocalServiceUtil.deleteAttachment(attachment
				.getAttachmentId());

	}

	public void deleteFiles(Class entryClass, long entryId)
			throws NoSuchAttachmentException, PortalException, SystemException,
			RemoteException {

		List attachments = AttachmentLocalServiceUtil.getAttachments(entryId,
				entryClass);

		for (int i = 0; i < attachments.size(); i++) {
			// delete file from docman
			Attachment attachment = (Attachment) attachments.get(i);
			long folderId = attachment.getFolderId();
			String name = attachment.getFileName();
			/*DLFileEntryLocalServiceUtil.deleteFileEntry(folderId, name);*/
			//hoan
			DLFileEntryLocalServiceUtil.deleteFileEntry(attachment.getGroupId(),folderId, name);
			//hoan

			// delete attachment
			AttachmentLocalServiceUtil.deleteAttachment(attachment
					.getAttachmentId());
		}
	}

	/**
	 * Add attached image to ImageGallery
	 * 
	 * @param portletId
	 *            The id of portlet that request to upload
	 * @param request
	 *            Upload request
	 * @param entryId
	 *            Id of entry that uploaded
	 * @param entryClass
	 *            Class of the entry
	 * @throws SystemException 
	 * @throws PortalException 
	 */
	public void addImage(ActionRequest request,UploadPortletRequest uploadReq, String portletId,
			Class entryClass, long entryId, int maxImage) throws PortalException, SystemException {

		/*long groupId = PortalUtil.getPortletGroupId(request);*/
		//hoan
		long groupId = PortalUtil.getScopeGroupId(request);
		//hoan
		String portletTitle = LanguageUtil.get(request.getLocale(),
				"javax.portlet.title." + portletId);
		String portletIdImg = "img_" + portletId;

		try {
			// get/create vsi-image-folder
			String vsiFolderId = "vsi-image-folder";
			String vsiFolderTitle = "vsi-image-folder";
			String vsiImgFolderId = "image_" + vsiFolderId;
			IGFolder vsiFolder = null;
			List vsiFolders = PortletFolderLocalServiceUtil
					.getByPortletId(vsiImgFolderId);
			// hoan
			ServiceContext serviceContext = ServiceContextFactory
					.getInstance(entryClass.getName(), request);
			// hoan
			if (vsiFolders.size() < 1) {
				/*
				 * vsiFolder = createImageFolder(vsiImgFolderId, vsiFolderTitle,
				 * request);
				 */
				// hoan
					vsiFolder = createImageFolder(vsiImgFolderId, vsiFolderTitle,
						request, setViewForGuestAndCommunity(serviceContext));
				// hoan
			} else {
				for (int i = 0; i < vsiFolders.size(); i++) {
					PortletFolder pf = (PortletFolder) vsiFolders.get(i);
					long folderId = pf.getFolderId();

					// if folder is deleted or in another community
					try {
						IGFolder folder = IGFolderLocalServiceUtil
								.getFolder(folderId);
						if (folder.getGroupId() == groupId) {
							vsiFolder = folder;
							break;
						}
						if ((i == vsiFolders.size() - 1)
								&& (folder.getGroupId() != groupId)) {
							throw new Exception();
						}
					} catch (Exception e) {
						/*vsiFolder = createImageFolder(vsiImgFolderId,
								vsiFolderTitle, request);*/
						vsiFolder = createImageFolder(vsiImgFolderId, vsiFolderTitle,
								request, serviceContext);
						// remove old info
						if (e instanceof NoSuchFolderException) {
							PortletFolderLocalServiceUtil
									.removePortletFolder(pf.getId());
						}
					}
				}
			}

			// get/create portlet folder in the vsi-image-folder
			IGFolder uploadedFolder = null;
			List folders = PortletFolderLocalServiceUtil
					.getByPortletId(portletIdImg);
			if (folders.size() < 1) {// folder does not exist
				IGFolder folder = createImageFolder(portletIdImg, portletTitle,
						vsiFolder.getFolderId(), request,serviceContext);
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
						IGFolder createdFolder = createImageFolder(
								portletIdImg, portletTitle,
								vsiFolder.getFolderId(), request,serviceContext);
						uploadedFolder = createdFolder;

						// remove old info
						if (e instanceof NoSuchFolderException) {
							PortletFolderLocalServiceUtil
									.removePortletFolder(pf.getId());
						}
					}
				}
			}
			if (maxImage < 2) {
				uploadImage(request,uploadReq, uploadedFolder, entryId, entryClass);
			} else {
				uploadMultipleImage(request,uploadReq, uploadedFolder, entryId,
						entryClass, maxImage);
			}
			this.imageFolder = uploadedFolder;
		} catch (Exception ex) {
			if (ex instanceof DuplicateFileException
					|| ex instanceof DuplicateFolderNameException
					|| ex instanceof FileNameException
					|| ex instanceof FileSizeException
					|| ex instanceof SourceFileNameException) {

				SessionErrors.add(request, ex.getClass().getName());

			} else {
				ex.printStackTrace();
			}

		}

	}

	public void deleteImage(long attachmentId) throws Exception {

		Attachment att = AttachmentLocalServiceUtil.getAttachment(attachmentId);
		long imageId = att.getFolderId();
		IGImageLocalServiceUtil.deleteImage(imageId);
	}

	public void deleteImages(Class entryClass, long entryId) throws Exception {
		List attachments = AttachmentLocalServiceUtil.getAttachments(entryId,
				entryClass);

		for (int i = 0; i < attachments.size(); i++) {
			Attachment attachment = (Attachment) attachments.get(i);

			// delete image from IG
			long imageId = attachment.getFolderId();
			IGImageLocalServiceUtil.deleteImage(imageId);

			// delete attachment
			AttachmentLocalServiceUtil.deleteAttachment(attachment
					.getAttachmentId());
		}

	}

	/**
	 * Get attached file
	 * 
	 * @param entryId
	 * @param entryClass
	 * @return
	 * @throws Exception
	 */
	public List getAttachment(Class entryClass, long entryId) throws Exception {
		return AttachmentLocalServiceUtil.getAttachments(entryId, entryClass);
	}

	public IGFolder getImageFolder() {
		return imageFolder;
	}

	public DLFolder getFileFolder() {
		return fileFolder;
	}

	public static DLFolder getFolderByPortletId(HttpServletRequest req,
			String portletId, long groupId) throws Exception {

		DLFolder folder = null;

		String portletTitle = LanguageUtil.get(req.getLocale(),
				"javax.portlet.title." + portletId);

		List uploadedFolders = PortletFolderLocalServiceUtil.getDLFolder(
				groupId, portletId);

		if (uploadedFolders != null && uploadedFolders.size() > 0) {
			folder = (DLFolder) uploadedFolders.get(0);
		}

		return folder;
	}

	public IGImage getImage() {
		return image;
	}

	public DLFileEntry getFile() {
		return file;
	}

	public List getImageList() {
		return imageList;
	}

	public List getFileList() {
		return fileList;
	}

	private DLFolder createFileFolder(String portletId, ActionRequest request,
			String folderTitle,ServiceContext serviceContext) throws Exception {

		return createFileFolder(portletId, request, folderTitle, 0, serviceContext);
	}

	private DLFolder createFileFolder(String portletId, ActionRequest request,
			String folderTitle, long parentId,ServiceContext serviceContext) throws Exception {

		long userId = PortalUtilExt.getUserId(request);
		long plId = PortalUtilExt.getPlid(request);
		long groupId = PortalUtilExt.getPortletGroupId(request);

		// create the folder
		DLFolder folder;
		try {
			/*folder = DLFolderLocalServiceUtil.addFolder(userId, plId, parentId,
					folderTitle, folderTitle, communityPermissions,
					guestPermissions);*/
			
			//hoan
			folder = DLFolderLocalServiceUtil.addFolder(userId, groupId, parentId, folderTitle, folderTitle, setViewForGuestAndCommunity(serviceContext));
			//hoan
		} catch (DuplicateFolderNameException duplicateE) {
			folder = DLFolderLocalServiceUtil.getFolder(groupId, parentId,
					folderTitle);
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
					folder.getFolderId(), folderTitle);
		}
		return folder;
	}

	private void uploadFile(ActionRequest request,UploadPortletRequest uploadReq, DLFolder folder,
			long entryId, Class entryClass) throws Exception {

		String fileParameter = "file_0";
		String titleParameter = "title_0";
		String descParameter = "description_0";

/*		UploadPortletRequest uploadReq = PortalUtil
				.getUploadPortletRequest(request);*/

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

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();

		if (Validator.isNull(title)) {
			title = sourceFileName;
		}

		/*DLFileEntry entry = DLFileEntryLocalServiceUtil.addFileEntry(userId,
				folderId, sourceFileName, title, description, tagsEntries,
				extraSettings, file, communityPermissions, guestPermissions);*/
		//hoan
		DLFileEntry  listFileEntry = null;
		try {
			listFileEntry = DLFileEntryServiceUtil.getFileEntryByTitle(groupId, folderId, sourceFileName);
		} catch (NoSuchFileEntryException ex) {
			listFileEntry = null;
			// TODO: handle exception
		}
		if(Validator.isNotNull(listFileEntry)){
			title = System.currentTimeMillis()+ "_"+title;
		}
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
					entryClass.getName(), request);
		DLFileEntry	entry = DLFileEntryLocalServiceUtil.addFileEntry(userId, groupId, folderId, sourceFileName, title, description, StringPool.BLANK, extraSettings, file, setViewForGuestAndCommunity(serviceContext));
		//hoan

		/*AssetPublisherUtil.addAndStoreSelection(request,
				DLFileEntry.class.getName(), entry.getFileEntryId(), -1);
		AssetPublisherUtil.addRecentFolderId(request,
				DLFileEntry.class.getName(), folderId);*/
		MethodKey methodkeyAddAndStoreSelection = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addAndStoreSelection", ActionRequest.class,String.class,long.class,int.class);
		Object[] argsAddAndStoreSelection = new Object[]{request,DLFileEntry.class.getName(),entry.getFileEntryId(),-1};
		PortalClassInvoker.invoke(false, methodkeyAddAndStoreSelection, argsAddAndStoreSelection);
		
		MethodKey methodkeyAddRecentFolderId = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addRecentFolderId", PortletRequest.class,String.class,long.class);
		Object[] argsAddRecentFolderId = new Object[]{(PortletRequest)request,DLFileEntry.class.getName(),folderId};
		PortalClassInvoker.invoke(false, methodkeyAddRecentFolderId, argsAddRecentFolderId);

		AttachmentLocalServiceUtil.addAttachment(entry, entry.getCompanyId(),
				groupId, entryId, entryClass, entry.getFolderId(),
				entry.getTitle());

		this.file = entry;
	}

	private void uploadMultipleFile(ActionRequest request,UploadPortletRequest uploadReq, DLFolder folder,
			long entryId, Class entryClass, int maxAttachment) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		/*UploadPortletRequest uploadReq = PortalUtil
				.getUploadPortletRequest(request);*/

		long userId = themeDisplay.getUserId();
		long folderId = folder.getFolderId();
		String[] tagsEntries = new String[0];
		String extraSettings = "";
		String fileEntry = DLFileEntry.class.getName();
		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();

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

			/*
			 * DLFileEntry entry =
			 * DLFileEntryLocalServiceUtil.addFileEntry(userId, folderId,
			 * sourceFileName, title, desc, tagsEntries, extraSettings, file,
			 * communityPermissions, guestPermissions);
			 */
			// hoan
			DLFileEntry  listFileEntry = null;
			try {
				listFileEntry = DLFileEntryServiceUtil.getFileEntryByTitle(groupId, folderId, sourceFileName);
			} catch (NoSuchFileEntryException ex) {
				listFileEntry = null;
				// TODO: handle exception
			}
			if(Validator.isNotNull(listFileEntry)){
				title = System.currentTimeMillis()+ "_"+title;
			}
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					entryClass.getName(), request);
			DLFileEntry entry = DLFileEntryLocalServiceUtil.addFileEntry(
					userId, groupId, folderId, sourceFileName, title,
					desc, StringPool.BLANK, extraSettings, file,
					setViewForGuestAndCommunity(serviceContext));
			// hoan

			/*AssetPublisherUtil.addAndStoreSelection(request, fileEntry,
					entry.getFileEntryId(), -1);
			
			AssetPublisherUtil.addRecentFolderId(request, fileEntry, folderId);*/
			MethodKey methodkeyAddAndStoreSelection = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addAndStoreSelection", ActionRequest.class,String.class,long.class,int.class);
			Object[] argsAddAndStoreSelection = new Object[]{request,fileEntry,entry.getFileEntryId(),-1};
			PortalClassInvoker.invoke(false, methodkeyAddAndStoreSelection, argsAddAndStoreSelection);
			
			MethodKey methodkeyAddRecentFolderId = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addRecentFolderId", PortletRequest.class,String.class,long.class);
			Object[] argsAddRecentFolderId = new Object[]{(PortletRequest)request,fileEntry,folderId};
			PortalClassInvoker.invoke(false, methodkeyAddRecentFolderId, argsAddRecentFolderId);

			AttachmentLocalServiceUtil.addAttachment(entry,
					entry.getCompanyId(), groupId, entryId, entryClass,
					entry.getFolderId(), entry.getTitle());

			fileList.add(entry);
		}
	}

	private IGFolder createImageFolder(String portletId, String folderTitle,
			ActionRequest request, ServiceContext serviceContext)
			throws Exception {

		return createImageFolder(portletId, folderTitle, 0, request,
				serviceContext);

	}

	private IGFolder createImageFolder(String portletId, String folderTitle,
			long parentId, ActionRequest request, ServiceContext serviceContext)
			throws Exception {
		
		long plId = PortalUtilExt.getPlid(request);

		// create the folder
		/*
		 * IGFolder folder = IGFolderServiceUtil.addFolder(plId, parentId,
		 * folderTitle, folderTitle, communityPermissions, guestPermissions);
		 */
		// hoan
		IGFolder folder = IGFolderServiceUtil.addFolder(parentId, folderTitle,
				folderTitle, setViewForGuestAndCommunity(serviceContext));
		// hoan

		// add the relation between portlet and folder
		PortletFolderLocalServiceUtil.addPortletFolder(portletId,
				folder.getFolderId(), folderTitle);

		return folder;
	}

	private void uploadImage(ActionRequest req,UploadPortletRequest uploadReq, IGFolder folder, long entryId,
			Class entryClass) throws Exception {

		String imgParameter = "image_0";
		String descParameter = "description_0";

		String[] tagsEntries = new String[0];
		long folderId = folder.getFolderId();

		File file = uploadReq.getFile(imgParameter);
		String sourceFileName = uploadReq.getFileName(imgParameter);
		if (Validator.isNull(sourceFileName)) {
			return;
		}

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();

		String description = ParamUtil.getString(uploadReq, descParameter);
		String contentType = getContentType(
				uploadReq.getContentType(imgParameter), file.getName());

		/*
		 * IGImage image = IGImageServiceUtil.addImage(folderId, file.getName(),
		 * description, file, contentType, tagsEntries, communityPermissions,
		 * guestPermissions);
		 */
		// hoan
		IGImage  igImage = null;
		try {
			igImage = IGImageServiceUtil.getImageByFolderIdAndNameWithExtension(groupId, folderId,sourceFileName);
		} catch (NoSuchImageException ex) {
			igImage = null;
			// TODO: handle exception
		}
		if(Validator.isNotNull(igImage)){
			sourceFileName = System.currentTimeMillis()+ "_"+sourceFileName;
		}
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				entryClass.getName(), req);
		IGImage image = IGImageServiceUtil.addImage(groupId, folderId,
				sourceFileName, description, file, contentType, setViewForGuestAndCommunity(serviceContext));
		// hoan

		/*AssetPublisherUtil.addAndStoreSelection(req, IGImage.class.getName(),
				image.getImageId(), -1);

		AssetPublisherUtil.addRecentFolderId(req, IGImage.class.getName(),
				folderId);*/
		MethodKey methodkeyAddAndStoreSelection = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addAndStoreSelection", ActionRequest.class,String.class,long.class,int.class);
		Object[] argsAddAndStoreSelection = new Object[]{req,IGImage.class.getName(),image.getImageId(),-1};
		PortalClassInvoker.invoke(false, methodkeyAddAndStoreSelection, argsAddAndStoreSelection);
		
		MethodKey methodkeyAddRecentFolderId = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addRecentFolderId", PortletRequest.class,String.class,long.class);
		Object[] argsAddRecentFolderId = new Object[]{(PortletRequest)req,IGImage.class.getName(),folderId};
		PortalClassInvoker.invoke(false, methodkeyAddRecentFolderId, argsAddRecentFolderId);

		// folderId <=> imageId
		// fileName <=> smallImageId
		AttachmentLocalServiceUtil.addAttachment(image, image.getCompanyId(),
				groupId, entryId, entryClass, image.getFolderId(),
				image.getImageType());
		
		this.image = image;

	}

	private void uploadMultipleImage(ActionRequest req,UploadPortletRequest uploadReq, IGFolder folder,
			long entryId, Class entryClass, int maxImage) throws Exception {

		String[] tagsEntries = new String[0];
		long folderId = folder.getFolderId();
		String[] communityPermissions = new String[] { "VIEW" };
		String[] guestPermissions = new String[] { "VIEW" };
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long groupId = layout.getGroupId();

		for (int i = 0; i < maxImage; i++) {

			String imgParameter = "image_" + i;
			String descParameter = "description_" + i;

			File file = uploadReq.getFile(imgParameter);
			String sourceFileName = uploadReq.getFileName(imgParameter);
			if (Validator.isNull(sourceFileName)) {
				break;
			}
			String description = ParamUtil.getString(uploadReq, descParameter);
			String contentType = getContentType(uploadReq.getContentType(),
					file.getName());

			/*
			 * IGImage image = IGImageServiceUtil.addImage(folderId, file
			 * .getName(), description, file, contentType, tagsEntries,
			 * communityPermissions, guestPermissions);
			 */
			// hoan
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					entryClass.getName(), req);
			IGImage image = IGImageServiceUtil.addImage(groupId, folderId,
					sourceFileName, description, file, contentType,
					setViewForGuestAndCommunity(serviceContext));
			// hoan

			/*AssetPublisherUtil.addAndStoreSelection(req,
					IGImage.class.getName(), image.getImageId(), -1);

			AssetPublisherUtil.addRecentFolderId(req, IGImage.class.getName(),
					folderId);*/
			MethodKey methodkeyAddAndStoreSelection = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addAndStoreSelection", ActionRequest.class,String.class,long.class,int.class);
			Object[] argsAddAndStoreSelection = new Object[]{req,IGImage.class.getName(),image.getImageId(),-1};
			PortalClassInvoker.invoke(false, methodkeyAddAndStoreSelection, argsAddAndStoreSelection);
			
			MethodKey methodkeyAddRecentFolderId = new MethodKey("com.liferay.portlet.assetpublisher.util.AssetPublisherUtil", "addRecentFolderId", PortletRequest.class,String.class,long.class);
			Object[] argsAddRecentFolderId = new Object[]{(PortletRequest)req,IGImage.class.getName(),folderId};
			PortalClassInvoker.invoke(false, methodkeyAddRecentFolderId, argsAddRecentFolderId);
			AttachmentLocalServiceUtil.addAttachment(image,
					image.getCompanyId(), groupId, entryId, entryClass,
					image.getFolderId(), image.getImageType());

			imageList.add(image);
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
}