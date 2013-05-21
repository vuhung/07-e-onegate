package com.vportal.portlet.vcomment;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vcomment.model.VComment;
import com.vportal.portlet.vcomment.model.impl.VCommentImpl;
import com.vportal.portlet.vcomment.service.VCommentServiceUtil;
import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;
/**
 * Portlet implementation class vcomment
 */
public class vcomment extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
		CaptchaUtil.serveImage(resourceRequest, resourceResponse);
	}
	
	public void Type_Manager_New(ActionRequest req,
			ActionResponse response) throws Exception {
			addContact(req, null);
//			response.setRenderParameter("jspPage", "/html/portlet/vcommentview/view.jsp?tabs1=portlet.vlegal.document-tab&abs2=portlet.vlegal.document.approval-pending");
	}
	private void addContact(ActionRequest req,HttpServletRequest request) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long userId = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();
		long Id = ParamUtil.getLong(req, "Id");
//		long groupId = ParamUtil.getLong(req, "groupId");
		long companyId = PortalUtil.getCompanyId(req);
		String guestName = ParamUtil.getString(req, "guestName");
		String email = ParamUtil.getString(req, "email");
		String phone = ParamUtil.getString(req, "phone");
		String fax = ParamUtil.getString(req, "fax");
		String address = ParamUtil.getString(req, "address");
		String title = ParamUtil.getString(req, "title");
		String content = ParamUtil.getString(req, "content");
		boolean hasAttach = false;
		CaptchaUtil.check(req);
		int status = 0;
//			System.out.print(request.getRemoteAddr());
//			String remoteAddr = request.getRemoteAddr();
//	        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
//	        reCaptcha.setPrivateKey("6LccetASAAAAAEO8RATnzw12iGy6XavmEpmt8pga");
//	
//	        String challenge = req.getParameter("recaptcha_challenge_field");
//	        String uresponse = req.getParameter("recaptcha_response_field");
//	        ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr, challenge, uresponse);
//	
//	        if (reCaptchaResponse.isValid()) {
	          
	      
	        
//		String[] communityPermissions = req
//				.getParameterValues("communityPermissions");
//		String[] guestPermissions = req.getParameterValues("guestPermissions");

//		ThemeDisplay themeDisplay = (ThemeDisplay) req
//				.getAttribute(WebKeys.THEME_DISPLAY);
//		Layout layout = themeDisplay.getLayout();
//		long userId = themeDisplay.getUserId();

		VComment comment = new VCommentImpl();

//		if (PropsValuesExt.CAPTCHA_CHECK_SEND_CONTACT) {
//			CaptchaUtil.check(req);
//		}

		if (Id <= 0) {

			comment = VCommentServiceUtil.addComment(groupId, companyId,
					layout.getPlid(), guestName, email, title, address, phone,
					fax, content, hasAttach, status, userId);

//			_attachFile(comment, req);
		}
        	}
}