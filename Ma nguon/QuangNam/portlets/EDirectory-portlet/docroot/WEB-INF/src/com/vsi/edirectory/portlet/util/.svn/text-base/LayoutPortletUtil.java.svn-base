package com.vsi.edirectory.portlet.util;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

public class LayoutPortletUtil {

	/**
	 * @param args
	 */
	// lay portlet Id bang layout Id (lay list portlet Id trong lay out voi dk...)
public static List getPortletIdsByLayout(long plid) throws Exception {
		
		Layout layoutSelected = (Layout)LayoutLocalServiceUtil.getLayout(plid);
		LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layoutSelected.getLayoutType();
		
		List portletIds = layoutTypePortlet.getPortletIds();
		List tempPorletIds = new ArrayList();
		
		for(int i=0;i<portletIds.size();i++){
			String portletId = (String)portletIds.get(i);
			
			if(portletId.indexOf("contentedirectory_WAR_EDirectoryportlet_INSTANCE_")==0){
				tempPorletIds.add(portletId);
			}
		}
		
		return tempPorletIds;
	}
	
	// lay list cac layout co portlet Id=currentPortletId
	public static void getLayoutPortletIds(List selectLayouts ,PortletRequest req, String currentPortletId)throws Exception{
		
		boolean privateLayout = false;
		
		boolean hasLayout = false;
		
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
		
		long groupId = themeDisplay.getPortletGroupId();
		
		long currentPlId = themeDisplay.getPlid();

		// get current portlet layout (lay layout hien tai)
		Layout currentLayout = LayoutLocalServiceUtil.getLayout(currentPlId);
		
		privateLayout = currentLayout.getPrivateLayout();

		// find portlet in layout
		List layouts = LayoutLocalServiceUtil
				.getLayouts(groupId, privateLayout);

		for (int i = 0; i < layouts.size(); i++) {
			Layout layout = (Layout) layouts.get(i);
			
			hasLayout = false;
			// layout.get
			if (!layout.getType().equals(LayoutConstants.TYPE_PORTLET)) {
				continue;
			}

			LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layout
					.getLayoutType();
			

			List portletIds = layoutTypePortlet.getPortletIds();
			if(portletIds != null && portletIds.size()>0){
				for(int count=0;count<portletIds.size();count++){
					String portletIdLayout = String.valueOf(portletIds.get(count)); 
					
					if(portletIdLayout.indexOf(currentPortletId)>=0){
						//selectPortletLayoutIds.add(portletIdLayout+"|"+layout.getPlid());
						hasLayout = true;
					}
					
				}
			}
			
			if(hasLayout){
				selectLayouts.add(layout);
			}
		}
		
	}

}
