package com.vportal.portlet.vclip;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.imagegallery.model.IGImage;
import com.liferay.portlet.imagegallery.service.IGImageLocalServiceUtil;
import com.vportal.portal.attachment.AttachmentManager;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.service.AttachmentLocalServiceUtil;
import com.vportal.portal.taglib.FileUploadUtil;
import com.vportal.portlet.vclip.model.Clip;
import com.vportal.portlet.vclip.ActionUtil;
import com.vportal.portlet.vclip.model.impl.ClipImpl;
import com.vportal.portlet.vclip.service.ClipServiceUtil;
import com.vportal.portlet.vclip.util.WebKeysVClip;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class VclipAction
 */
public class VclipAction extends MVCPortlet {
	@Override
	public void processAction(ActionRequest req, ActionResponse res)
			throws IOException, PortletException {
		UploadPortletRequest uploadRequest = PortalUtil
				.getUploadPortletRequest(req);
		// TODO Auto-generated method stub
		String[] communityPermissions = req
				.getParameterValues("communityPermissions");
		String[] guestPermissions = req.getParameterValues("guestPermissions");
		String cmd = ParamUtil.getString(uploadRequest, Constants.CMD);
		String type = ParamUtil.getString(uploadRequest, "type");
		if (Validator.isNull(cmd)) {
			return;
		} else if (type.equals("clip") && cmd.equals(Constants.DELETE)) {
			try {
				deleteClip(req, uploadRequest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			 * try { String id = ParamUtil.getString(req, WebKeysVClip.CLIP_ID);
			 * if (Validator.isNotNull(id)) { Clip clip =
			 * ClipServiceUtil.findById(id); String portletId =
			 * WebKeysVClip.VCLIP; AttachmentManager am = new
			 * AttachmentManager(portletId, Clip.class,
			 * Long.parseLong(clip.getId())); am.deleteFileEntries();
			 * ClipServiceUtil.deleteClip(clip.getId()); //
			 * ImagesUtils.deleteImage(clip.getImage()); }else{
			 * 
			 * } sendRedirect(req, res); } catch (Exception e) {
			 * e.printStackTrace(); }
			 */
		}
		// button Save clicked
		else if (type.equals("clip") && cmd.equals(Constants.SAVE)) {

			Clip clip = null;
			try {
				clip = getProperties(req, uploadRequest);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			java.util.Date date = new java.util.Date();

			String clipId = clip.getId();

			ThemeDisplay themeDisplay = (ThemeDisplay) req
					.getAttribute(WebKeys.THEME_DISPLAY);

			Layout layout = themeDisplay.getLayout();
			long groupId = themeDisplay.getScopeGroupId();
			long companyId = layout.getCompanyId();
			if (Validator.isNull(clip.getId())
					|| clip.getId().trim().equals("0")) {// is Add new neu
				clip.setCreatedDate(date);
				clip.setModifiedDate(date);
				clip.setCompanyId(companyId);
				clip.setGroupId(groupId);
				clip.setUserId(themeDisplay.getUserId());
				try {
					clip = ClipServiceUtil.addClip(groupId, companyId,
							layout.getPlid(), clip, null, null,
							communityPermissions, guestPermissions);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				clip.setModifiedDate(date);
				try {
					clip = ClipServiceUtil.updateClip(groupId, companyId,
							clipId, clip);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// attach image

			clip.getImage();
			String portletId = WebKeysVClip.Clip_type_id;
			/*
			 * AttachmentManager am = new AttachmentManager(portletId,
			 * Clip.class, Long.parseLong(clip.getId())); DLFileEntry fileEntry
			 * = null; try { try { fileEntry = am.addFile(req,uploadRequest); }
			 * catch (SystemException e) { // TODO Auto-generated catch block
			 * System.out.print("khong co file"); } } catch (PortalException e1)
			 * { // TODO Auto-generated catch block
			 * System.out.print("khong co file"); }
			 */
			try {
				FileUploadUtil.uploadFile(req, uploadRequest, portletId,
						Clip.class, Long.parseLong(clip.getId()));
				List addedAttachments = AttachmentLocalServiceUtil
						.getAttachments(Long.parseLong(clip.getId()), Clip.class);

				IGImage image = null;
				if ((addedAttachments != null) && (addedAttachments.size() > 0)) {
					Attachment attach = (Attachment) addedAttachments.get(0);
					clip.setUrl("/" + attach.getFolderId() + "/"
							+ attach.getFileName());
					try {
						ClipServiceUtil.updateClip(groupId, companyId, clip.getId(),
								clip);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				FileUploadUtil.uploadImage(req, uploadRequest, portletId,
						Clip.class, Long.parseLong(clip.getId()), 1);
				List addedAttachmentsImage = AttachmentLocalServiceUtil
						.getAttachments(Long.parseLong(clip.getId()), Clip.class);

				if ((addedAttachmentsImage != null) && (addedAttachmentsImage.size() > 0)) {
					Attachment attachImage = (Attachment) addedAttachmentsImage
							.get(1);
					clip.setImage(String.valueOf(attachImage.getFileEntryId()));
					try {
						ClipServiceUtil.updateClip(groupId, companyId, clip.getId(),
								clip);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			req.setAttribute(Constants.CMD, "");
			sendRedirect(req, res);
		}
		// porcess action clip type
		else if (type.equals("cliptype") && Validator.isNotNull(cmd)) {
			try {
				ClipTypeAction.processAction(req, res, cmd, uploadRequest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		super.processAction(req, res);
	}

	@Override
	public void render(RenderRequest req, RenderResponse res)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		String portalSiteId = ParamUtil.getString(req, "portalSiteId");
		String language = ParamUtil.getString(req, "language");
		req.setAttribute(portalSiteId, "portalSiteId");
		req.setAttribute(language, "language");

		String cmd = ParamUtil.getString(req, Constants.CMD);
		try {
			ActionUtil.getAttachmentList(req);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(cmd)) {
			if (cmd.equals(Constants.EDIT)) {
				ActionUtil.getClip(req);
				// return mapping.findForward("vportal.vclip.edit_clip");
			} else if (cmd.equals(Constants.VIEW)) {
				ActionUtil.getClip(req);
				// return mapping.findForward("vportal.vclip.view_clip_detail");
			}

			else if (cmd.equals(Constants.SEARCH)) {

				// return mapping.findForward("vportal.vclip.start");
			}
		}
		// return mapping.findForward("vportal.vclip.start");
		super.render(req, res);
	}

	private void deleteClip(ActionRequest req, UploadPortletRequest uploadReq)
			throws Exception {
		String clipId = ParamUtil.getString(uploadReq, WebKeysVClip.CLIP_ID);
		String portletId = WebKeysVClip.Clip_type_id;

		Clip clip = ClipServiceUtil.findById(clipId);
		ClipServiceUtil.deleteClip(clipId);
		AttachmentManager am = new AttachmentManager(portletId, Clip.class,
				Long.parseLong(clipId));

		am.deleteFileEntries();

		try {
			// delete attachment data
			List images = AttachmentLocalServiceUtil.getIGImages(Clip.class,
					Long.valueOf(clipId));
			for (int j = 0; j < images.size(); j++) {
				IGImage image = (IGImage) images.get(j);
				IGImageLocalServiceUtil.deleteImage(image.getImageId());
				// delete attachment info
				AttachmentLocalServiceUtil.deleteAttachments(Clip.class,
						Long.valueOf(clipId));
			}
		} catch (Exception e) {
			System.out.println("null");
		}

	}

	private Clip getProperties(ActionRequest req,
			UploadPortletRequest uploadRequest) throws Exception {
		String id = ParamUtil.getString(uploadRequest, WebKeysVClip.CLIP_ID);
		String language = ParamUtil.getString(uploadRequest, "language");
		String clipTypeId = ParamUtil.getString(uploadRequest,
				WebKeysVClip.CLIP_TYPE_ID);
		String url = ParamUtil.getString(uploadRequest, "url");
		String name = ParamUtil.getString(uploadRequest, "name");
		String title = ParamUtil.getString(uploadRequest, "title");
		String image = uploadRequest.getFileName("image");
		String description = ParamUtil.getString(uploadRequest, "description");

		Clip clip = new ClipImpl();
		clip.setId(id);
		clip.setLanguage(language);
		clip.setClipTypeId(clipTypeId);
		clip.setUrl(url);
		clip.setName(name);
		clip.setTitle(title);
		clip.setImage(image);
		clip.setActive(true);
		clip.setDescription(description);
		return clip;
	}

}
