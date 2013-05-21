package com.vportal.portlet.viewvclip;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vclip.model.Clip;
import com.vportal.portlet.vclip.model.ClipType;
import com.vportal.portlet.vclip.model.impl.ClipTypeImpl;
import com.vportal.portlet.vclip.service.ClipServiceUtil;
import com.vportal.portlet.vclip.service.ClipTypeServiceUtil;
import com.vportal.portlet.vclip.util.WebKeysVClip;
import com.vportal.portlet.viewvclip.util.ConstantsExt;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ViewVclip
 */
public class ViewVclipAction extends MVCPortlet {
 @Override
public void processAction(ActionRequest req,
		ActionResponse res) throws IOException, PortletException {
	// TODO Auto-generated method stub
	 String cmd = ParamUtil.getString(req, Constants.CMD);		
		String id = ParamUtil.getString(req, "clipId");
		try
		{
			if(cmd.equals(ConstantsExt.HITCOUNT))
			{
				ClipServiceUtil.increaseHitCount(id);
			}
			if(cmd.equals(ConstantsExt.HITCOUNTVIEW))
			{
				ClipServiceUtil.increaseHitCountView(id);				
			}
		}
		catch(Exception ex)
		{
			
		}		
	super.processAction(req, res);
}
 @Override
	public void render(RenderRequest req, RenderResponse res)
			throws PortletException, IOException {
		// TODO Auto-generated method stub

		PortletPreferences prefs = req.getPreferences();
		try {
			List listCategory = ClipTypeServiceUtil.findAll();
			List listTopClip = ClipServiceUtil.getAll(0, 5);
			req.setAttribute(WebKeysVClip.CLIP_TYPE_RESULT_SEARCH, listCategory);

			String obj = ParamUtil.getString(req, WebKeysVClip.OBJECT);

			if (obj.equals(ClipType.class.getName())) {
				String clipTypeId = ParamUtil.getString(req,
						WebKeysVClip.CLIP_TYPE_ID);
				ClipType tfCategory = new ClipTypeImpl();
				if(Validator.isNotNull(Long.valueOf(clipTypeId)))
				{
					tfCategory  = ClipTypeServiceUtil.findById(clipTypeId);				
				}
				req.setAttribute("tfCategory",tfCategory);			
				
				Clip clipFirst = ClipServiceUtil.getByClipTypeId(clipTypeId);
				req.setAttribute(WebKeysVClip.CLIP, clipFirst);
				
			} else {
				Clip clipSecond = ClipServiceUtil.getFirst();			
				req.setAttribute(WebKeysVClip.CLIP, clipSecond);
				req.setAttribute(WebKeysVClip.LIST_TOP_CLIP,listTopClip);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		super.render(req, res);
	}
 public void EditPreferenceAction(ActionRequest req, ActionResponse res) {
	 String cmd = ParamUtil.getString(req, Constants.CMD);

		if (!cmd.equals(Constants.UPDATE)) {
			return;
		}

		PortletPreferences prefs = req.getPreferences();
		int displayStyle = ParamUtil.getInteger(req, "displayStyle");		
		//String styleSelected = ParamUtil.getString(req, "displayStyle","1");
		String[] selectCategories = req.getParameterValues("selectCategories");
		String defaultSize = ParamUtil.getString(req,"defaultSize");
		String widthSize = ParamUtil.getString(req,"widthSize");
		String heightSize = ParamUtil.getString(req,"heightSize");
		try {
			prefs.setValues("selectCategories", selectCategories);
			prefs.setValue("displayStyleExt", String.valueOf(displayStyle));
			prefs.setValue("defaultSize",defaultSize);
			prefs.setValue("widthSize", widthSize);
			prefs.setValue("heightSize",heightSize);
			
			prefs.store();
			res.setRenderParameter("jspPage", "/html/portlet/view_vclip/view.jsp");
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
}

}
