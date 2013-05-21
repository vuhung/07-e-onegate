package com.vsi.lienketwebsite;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.vsi.lienketwebsite.model.LinkGroup;
import com.vsi.lienketwebsite.model.Links;
import com.vsi.lienketwebsite.model.impl.LinkGroupImpl;
import com.vsi.lienketwebsite.model.impl.LinksImpl;
import com.vsi.lienketwebsite.service.LinkGroupServiceUtil;
import com.vsi.lienketwebsite.service.LinksServiceUtil;
import com.vsi.lienketwebsite.service.persistence.LinksUtil;

public class ActionUtil {

	
	public static LinkGroup prLinkGroupFromRequest(ActionRequest request)
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		LinkGroup linkGroup = new LinkGroupImpl();
		linkGroup.setCompanyId(themeDisplay.getCompanyId());
		linkGroup.setGroupId(themeDisplay.getScopeGroupId());
		linkGroup.setName(ParamUtil.getString(request, "linkGroupName"));
		linkGroup.setDescription(ParamUtil.getString(request, "description"));
		linkGroup.setCreatedDate(new Date());
		linkGroup.setModifiedDate(null);		
				
		return linkGroup;
	}	
	
	  public static List<LinkGroup> getLinkGroups(RenderRequest request) {
	        ThemeDisplay themeDisplay =
	            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

	        long groupId = themeDisplay.getScopeGroupId();

	        List<LinkGroup> tempResults;

	        try {
	            //tempResults = PRProductLocalServiceUtil.getAllProducts(groupId);
	        	tempResults = LinkGroupServiceUtil.getLinkGroups(groupId);
	        }

	        catch (SystemException ex) {
	            tempResults  = Collections.EMPTY_LIST;

	        }

	        return tempResults;

	    }	  
	  
	  public static Links prLinksFromRequest(ActionRequest request)
		{
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			Links links = new LinksImpl();
			links.setCompanyId(themeDisplay.getCompanyId());
			links.setGroupId(themeDisplay.getScopeGroupId());
			links.setLinkgroupId(Long.parseLong(ParamUtil.getString(request, "linkGroup")));
			links.setName(ParamUtil.getString(request, "linkName"));
			links.setDescription(ParamUtil.getString(request, "description"));
			links.setUrl(ParamUtil.getString(request, "url"));
			links.setPosition(1);
			links.setCreatedDate(new Date());
			links.setModifiedDate(null);		
					
			return links;
		}	
	  public static List<Links> getLinksByGroup(ActionRequest request) throws SystemException
	  {
		 // ThemeDisplay themeDisplay =
		 //           (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);		
		 
		  long linkGroupIdFromRequest = Long.parseLong(ParamUtil.getString(request, "findLinkGroup"));		
		  List<Links> tempResults;	     	    
		  tempResults = LinksServiceUtil.getLinkBylinkgroupId(linkGroupIdFromRequest);		  	    
	      return tempResults;
	  }
	  
	  
	  public static List<Links> getLinks(RenderRequest request) {
	        ThemeDisplay themeDisplay =
	            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

	        long groupId = themeDisplay.getScopeGroupId();

	        List<Links> tempResults;

	        try {
	            //tempResults = PRProductLocalServiceUtil.getAllProducts(groupId);
	        	tempResults = LinksServiceUtil.getLinks(groupId);
	        }

	        catch (SystemException ex) {
	            tempResults  = Collections.EMPTY_LIST;

	        }

	        return tempResults;

	    }
	  public static List<Links> getLinksByLinkGroupId(long linkgroupId) throws SystemException
	  {
		  List<Links> tempResults;	     	    
		  tempResults = LinksServiceUtil.getLinkBylinkgroupId(linkgroupId);
		  return tempResults;
	  }
	  
	  public static Links getLinksFromUserRequest(ActionRequest request) throws SystemException
	  {
		  String userChoose = ParamUtil.getString(request, "linksFromRequest");		 
		  Links myLink = null;		 
		  ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		  long groupId = themeDisplay.getScopeGroupId();		
		  List<Links> temp = LinksServiceUtil.getLinks(groupId);			
		  for(int i = 0; i < temp.size(); i++)
			  {
				  if(temp.get(i).getName().equals(userChoose))
				  {
					  myLink = temp.get(i);					 
					  break;
				  }
			  }		  	
		  return myLink;
	  }
}
