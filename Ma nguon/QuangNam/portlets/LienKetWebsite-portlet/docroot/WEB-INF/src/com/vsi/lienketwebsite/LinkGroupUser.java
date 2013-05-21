package com.vsi.lienketwebsite;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vsi.lienketwebsite.model.Links;

/**
 * Portlet implementation class LinkGroupUser
 */
public class LinkGroupUser extends MVCPortlet {
	
	public void findAndRedirect(ActionRequest request, ActionResponse response) throws SystemException, IOException
	{
		Links myLink = ActionUtil.getLinksFromUserRequest(request);
		if(myLink!=null)
		{
			System.out.println("link request id: "+myLink.getLinkId());
			response.sendRedirect(myLink.getUrl());			
		}		
	}
 

}
