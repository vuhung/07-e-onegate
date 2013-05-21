package com.vportal.portlet.vcommentadmin;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vcomment.model.VComment;
import com.vportal.portlet.vcomment.service.VCommentServiceUtil;

/**
 * Portlet implementation class vcommentadmin
 */
public class vcommentadmin extends MVCPortlet {
	public void delete_logger(ActionRequest request,
			ActionResponse response) throws PortletException {
		// TODO Auto-generated method stub
		String status = ParamUtil.getString(request, "statuss");
		String[] loggerIds = StringUtil.split(ParamUtil.get(request, "allRowIds",
				StringPool.BLANK));

		if ((loggerIds == null) || (loggerIds.length <= 0)) {
			return;
		}

		for (int i = 0; i < loggerIds.length; i++) {
	        try{
	        if(!loggerIds[i].equals("on"))
	        {
			  VCommentServiceUtil.deleteContact(Long.parseLong(loggerIds[i]));
	        }
	        }catch(Exception e){
	        	
	        	e.printStackTrace();
	        }  


		}
		
		
		if(status.equals("0"))
		{
			response.setRenderParameter("jspPage", "/html/portlet/vcommentadmin/view.jsp?tabs1=VContact.title.received-pending");
			
		}
		else
		{
			
			response.setRenderParameter("jspPage", "/html/portlet/vcommentadmin/view.jsp?tabs1=VContact.title.received");
		}
	
	   
		 
	   

		
	}

	
	public void _update(ActionRequest req,
			ActionResponse response) throws Exception {
		try{	
			
		String status = ParamUtil.getString(req, "statuss");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);

		Layout layout = themeDisplay.getLayout();

		long userId = PortalUtil.getUserId(req);
		long groupId = layout.getGroupId();

		String[] docIds = StringUtil.split(ParamUtil.get(req, "allRowIds",
				StringPool.BLANK));

		if ((docIds == null) || (docIds.length <= 0)) {
			return;
		}
	   
		for (int i = 0; i < docIds.length; i++) {
	       
			String docId = docIds[i];
	        if(!docIds[i].equals("on"))
	        {
			String message = ParamUtil.get(req, "message", StringPool.BLANK);

			VComment document = VCommentServiceUtil.getContact(Long.parseLong(docIds[i]));

			if (status.equals("0")) {
				document.setStatus(1);
			} else {
				document.setStatus(0);
			}

			VCommentServiceUtil.updateContact(document);

			// Add msg
//			if (Validator.isNotNull(message)) {
//
//				VLegalAttachedMessageServiceUtil.addMessage(groupId, docId,
//						message, false);
//			}
	        }
		}
	    
		}catch(Exception e){e.printStackTrace();}
		
		finally 
		{
			String status = ParamUtil.getString(req, "statuss");
			if(status.equals("0"))
			{
				response.setRenderParameter("jspPage", "/html/portlet/vcommentadmin/view.jsp?tabs1=VContact.title.received-pending");
				
			}
			else
			{
				
				response.setRenderParameter("jspPage", "/html/portlet/vcommentadmin/view.jsp?tabs1=VContact.title.received");
			}
			
		}
		
		
	}

}
