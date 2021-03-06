package com.vsi.edirectory.portlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vsi.edirectory.portlet.util.LayoutPortletUtil;

/**
 * Portlet implementation class MenuEDirectory
 */
public class MenuEDirectory extends MVCPortlet {
 
	@Override
	public void processAction(ActionRequest req,
			ActionResponse res) throws IOException, PortletException {
		// TODO Auto-generated method stub

		try {
			
			String selectPortletLayout = ParamUtil.getString(req,
					"selectPortletLayout", StringPool.BLANK);

			String portletSelectId = ParamUtil.getString(req,
					"portletSelectId", StringPool.BLANK);

			String strPortletIds = ParamUtil.getString(req, "strPortletIds",
					StringPool.BLANK);

			String layoutPortletId = ParamUtil.getString(req,
					"layoutPortletId", StringPool.BLANK);

			String style = ParamUtil.getString(req, "style", StringPool.BLANK);

			String titlePortlet = ParamUtil.getString(req, "titlePortlet", StringPool.BLANK);

			String url = ParamUtil.getString(req, "url", StringPool.BLANK);

			String _category = ParamUtil.getString(req, "_category");

			String[] selectCategories = req
					.getParameterValues("selectCategories");

			String themeType = ParamUtil.getString(req,"themeType");
			String themeSelected = ParamUtil.getString(req, "themeSelected");

			

			PortletPreferences prefs = req.getPreferences();

			prefs.setValue("style", style);

			prefs.setValue("selectPortletLayout", String
					.valueOf(selectPortletLayout));
			prefs.setValue("portletSelectId", String.valueOf(portletSelectId));
			prefs.setValue("strPortletIds", String.valueOf(strPortletIds));
			prefs.setValue("layoutPortletId", String.valueOf(layoutPortletId));

			prefs.setValue("titlePortlet", titlePortlet);
			prefs.setValue("url", url);
			prefs.setValue("_category", _category);

			prefs.setValues("selectCategories", selectCategories);
			

			prefs.setValue("themeType", themeType);
			prefs.setValue("themeSelected", themeSelected);

			prefs.store();

		

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
		
		

		try {
			selectLayoutPortlet(req,res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.setRenderParameter("jspPage", "/html/menu_edirectory/view.jsp");
		super.processAction(req, res);
	}
	@Override
	public void render(RenderRequest req, RenderResponse res)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		List selectLayouts = new ArrayList();

		try {
			LayoutPortletUtil.getLayoutPortletIds(selectLayouts, req,"contentedirectory_WAR_EDirectoryportlet_INSTANCE_");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("SELECT_LAYOUTS", selectLayouts);
		super.render(req, res);
	}
	public void selectLayoutPortlet(PortletRequest req, ActionResponse res) throws Exception {

		String cmd = ParamUtil.getString(req, "cmd");
		long layoutPlid = ParamUtil.getLong(req, "layoutIdSelected");

		List selectPortletLayoutIds = null;

		if (Validator.isNotNull(cmd) && cmd.equals("SELECT_LAYOUT")) {
			selectPortletLayoutIds = LayoutPortletUtil.getPortletIdsByLayout(layoutPlid);
			res.setRenderParameter("jspPage", "/html/menu_edirectory/edit.jsp");
			
		}

		req.setAttribute("SELECT_PORTLET_LAYOUT_IDS", selectPortletLayoutIds);

		req.setAttribute("PLID_LAYOUT", String.valueOf(layoutPlid));

		List selectLayouts = new ArrayList();

		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, req,
				"contentedirectory_WAR_EDirectoryportlet_INSTANCE_");

		req.setAttribute("SELECT_LAYOUTS", selectLayouts);
	}

	public PortletURL getCategoryURL(HttpServletRequest  request,String portletSelectId,long  plId,String RENDER_PHASE) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		
		
	    Class cl1 = PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portlet.PortletURLImpl");
	    Class[] intArgsClass = new Class[] {HttpServletRequest.class,String.class, long.class, String.class };
	    java.lang.reflect.Constructor constructor = cl1.getConstructor(intArgsClass);
	    PortletURL categoryURL  = (PortletURL)constructor.newInstance(new Object[] {request,portletSelectId, plId, RENDER_PHASE});
		return categoryURL;
	}
}
