/*
 * @(#)LayoutPortletUtil.java
 *
 * Copyright (c) 2007 VietSoftware, Inc.
 * 51 Le Dai Hanh street, Hai Ba Trung district, Hanoi, Vietnam.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * VietSoftware, Inc. ("Confidential Information").  You shall not 
 * disclose such Confidential Information and shall use it only in 
 * accordance with the terms of the license agreement you entered 
 * into with VietSoftware, Inc.
 *
 */
package com.vportal.portlet.vlegaldisplaycontent.util;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * @author donghh
 * @version 1.0.00, Jun 24, 2008
 */
public class LayoutPortletUtil {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List getPortletIdsByLayout(long plid) throws Exception {
		
		Layout layoutSelected = (Layout)LayoutLocalServiceUtil.getLayout(plid);
		
		LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layoutSelected.getLayoutType();
		
		
		List portletIds = layoutTypePortlet.getPortletIds();
		
		List tempPorletIds = new ArrayList();
		
		for(int i=0;i<portletIds.size();i++){
			String portletId = (String)portletIds.get(i);
			
			if(portletId.indexOf("viewcontentaction_WAR_vlegalportlet_INSTANCE_")==0){
				tempPorletIds.add(portletId);
			}
		}
		
		return tempPorletIds;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public static void getLayoutPortletIds(List selectLayouts ,PortletRequest req, String currentPortletId)throws Exception{
		
		boolean privateLayout = false;
		
		boolean hasLayout = false;
		
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
		
		long groupId = themeDisplay.getScopeGroupId();
		
		long currentPlId = themeDisplay.getPlid();

		// get current portlet layout
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
