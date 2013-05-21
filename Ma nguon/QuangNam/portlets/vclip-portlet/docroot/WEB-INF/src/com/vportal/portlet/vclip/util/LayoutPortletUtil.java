package com.vportal.portlet.vclip.util;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.service.LayoutLocalServiceUtil;

public class LayoutPortletUtil {
public static List getPortletIdsByLayout(long plid) throws Exception {
		
		Layout layoutSelected = (Layout)LayoutLocalServiceUtil.getLayout(plid);
		LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layoutSelected.getLayoutType();
		
		List portletIds = layoutTypePortlet.getPortletIds();
		List tempPorletIds = new ArrayList();
		
		for(int i=0;i<portletIds.size();i++){
			String portletId = (String)portletIds.get(i);
			
			if(portletId.indexOf("vclipcontent_WAR_vclipportlet")==0){
				tempPorletIds.add(portletId);
			}
			if(portletId.indexOf("viewv_WAR_vclipportlet")==0){
				tempPorletIds.add(portletId);
			}
		}
		return tempPorletIds;
		}
		
		

}
