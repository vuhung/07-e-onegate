package com.vsi.lienketwebsite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vsi.lienketwebsite.model.LinkGroup;
import com.vsi.lienketwebsite.model.Links;
import com.vsi.lienketwebsite.model.impl.LinkGroupImpl;
import com.vsi.lienketwebsite.service.LinkGroupServiceUtil;
import com.vsi.lienketwebsite.service.LinksServiceUtil;
import com.vsi.lienketwebsite.service.impl.LinksServiceImpl;
import com.vsi.lienketwebsite.service.persistence.LinksUtil;

/**
 * Portlet implementation class LinkGroupAdmin
 */
public class LinkGroupAdmin extends MVCPortlet {
 
	protected String viewAddLinkGroup = "/html/linkgroupadmin/view_add_linkgroup.jsp";
	protected String editLinkGroupJSP= "/html/linkgroupadmin/edit_linkGroup.jsp";
	protected String editLinkJSP= "/html/linkgroupadmin/edit_link.jsp";
	protected String viewAddLinkJSP= "/html/linkgroupadmin/view_add_link.jsp";

	
	//Them moi mot nhom lien ket
	public void addLinkGroup(ActionRequest request, ActionResponse response) throws SystemException, PortalException
	{
		LinkGroup linkGroup = ActionUtil.prLinkGroupFromRequest(request);
		ThemeDisplay themeDisplay =(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		//mang de luu tru loi nhap lieu
		ArrayList<String> errors = new ArrayList<String>();
		boolean linkGroupValid = ValidatorUtil.validateLinkGroup(linkGroup, errors);
		if(linkGroupValid)
		{
			//them vao csdl
			LinkGroupServiceUtil.addLinkGroup(linkGroup);			
			SessionMessages.add(request, "LinkGroupSaved");
            response.setRenderParameter("jspPage", viewAddLinkGroup);
		}
		 else {
             for (String error : errors) {
                 SessionErrors.add(request, error);
             }
             SessionErrors.add(request, "LinkGroupErrorSaving");
		 }		
		
	}
	//sua nhom lien ket
	 public void editLinkGroup(ActionRequest request, ActionResponse response)
		        throws Exception {

		        long linkGroupKey = ParamUtil.getLong(request, "resourcePrimKey");

		        if (Validator.isNotNull(linkGroupKey)) {
		        	LinkGroup linkGroup = LinkGroupServiceUtil.getLinkGroup(linkGroupKey);		  
		            request.setAttribute("linkGroup", linkGroup);
		            response.setRenderParameter("jspPage", editLinkGroupJSP);
		        }
		    }
	
	   public void updateLinkGroup(ActionRequest request, ActionResponse response)
		        throws Exception {

		        long linkGroupKey = ParamUtil.getLong(request, "resourcePrimKey");
		        ArrayList<String> errors = new ArrayList();
		        if (Validator.isNotNull(linkGroupKey)) {
		            LinkGroup linkGroup = LinkGroupServiceUtil.getLinkGroup(linkGroupKey);
		                
		            LinkGroup requestLinkGroup = ActionUtil.prLinkGroupFromRequest(request);		          
		          

		            if (ValidatorUtil.validateLinkGroup(requestLinkGroup, errors)) {
		            	linkGroup.setName(requestLinkGroup.getName());
		            	linkGroup.setDescription(requestLinkGroup.getDescription());
		                linkGroup.setModifiedDate(new Date());
		                LinkGroupServiceUtil.updateLinkGroup(linkGroup);		              
		                SessionMessages.add(request, "LinkGroupUpdated");
		            //    response.setRenderParameter("jspPage", viewAddLinkGroup);
		            }
		            else {
		                for (String error : errors) {
		                    SessionErrors.add(request, error);
		                }	            
		                SessionErrors.add(request, "LinkGroupErrorUpdating");
		                response.setRenderParameter("jspPage", editLinkGroupJSP);
		                request.setAttribute("linkGroup", requestLinkGroup);

		            }
		        }
		        else {
		            SessionErrors.add(request, "LinkGroupErrorUpdating");
		        }

		    }
	   //delete
	   public void deleteLinkGroup(ActionRequest request, ActionResponse response)
		        throws Exception {

		        long linkGroupKey = ParamUtil.getLong(request, "resourcePrimKey");

		        if (Validator.isNotNull(linkGroupKey)) {
		        	LinkGroupServiceUtil.deleteLinkGroup(linkGroupKey);		          
		            SessionMessages.add(request, "LinkGroupDeleted");
		        }
		        else {
		            SessionErrors.add(request, "LinkGroupErrorDeleting");
		        }
		    }
	   
	   //handle request and respone in Links module
	   public void addLink(ActionRequest request, ActionResponse response) throws SystemException, PortalException
		{
			Links links = ActionUtil.prLinksFromRequest(request);			
			ThemeDisplay themeDisplay =(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			//mang de luu tru loi nhap lieu
			ArrayList<String> errors = new ArrayList<String>();
			boolean linksValid = ValidatorUtil.validateLinks(links, errors);
			if(linksValid)
			{
				//them vao csdl
				String url = links.getUrl();
				if(url.startsWith("www.")||url.startsWith("http://"))
				{
					LinksServiceUtil.addLink(links);					
					SessionMessages.add(request, "LinksSaved");				
		            response.setRenderParameter("jspPage", viewAddLinkJSP);
				}
				else
				{
					SessionErrors.add(request, "URLInvalid");
					response.setRenderParameter("jspPage", viewAddLinkJSP);
				}
			}
			else
			{
				 for (String error : errors) {
	                    SessionErrors.add(request, error);
	                }
				 SessionErrors.add(request, "LinksErrorSaving");
				 response.setRenderParameter("jspPage", viewAddLinkJSP);
			}
			
		}   
	 //sua lien ket
		 public void editLink(ActionRequest request, ActionResponse response)
			        throws Exception {

			        long linkKey = ParamUtil.getLong(request, "resourcePrimKey");

			        if (Validator.isNotNull(linkKey)) {
			        	
			        	Links links = LinksServiceUtil.getLink(linkKey);	  
			            request.setAttribute("links", links);
			            response.setRenderParameter("jspPage", editLinkJSP);			          
			        }
			    }
	//
		 public void updateLink(ActionRequest request, ActionResponse response)
			        throws Exception {

			        long linksKey = ParamUtil.getLong(request, "resourcePrimKey");
			        ArrayList<String> errors = new ArrayList();
			        if (Validator.isNotNull(linksKey)) {
			            Links links = LinksServiceUtil.getLink(linksKey);
			                
			            Links requestLinks = ActionUtil.prLinksFromRequest(request);

			            if (ValidatorUtil.validateLinks(requestLinks, errors)) {
			            	String url = requestLinks.getUrl();			            	
			            	if(url.startsWith("www.")||url.startsWith("http://"))
			            	{			            		
			            		links.setName(requestLinks.getName());
				            	links.setDescription(requestLinks.getDescription());
				            	links.setUrl(requestLinks.getUrl());
				                links.setModifiedDate(new Date());
				                LinksServiceUtil.updateLinks(links);      				               
				                SessionMessages.add(request, "LinkUpdated");
				                response.setRenderParameter("jspPage", viewAddLinkJSP);				                
			            	}
			            	else
			            	{
			            		//System.out.println("invalid url");
			            		SessionErrors.add(request, "URLInvalid");
							//	response.setRenderParameter("jspPage", viewAddLinkJSP);
			            		response.setRenderParameter("jspPage", editLinkJSP);
			            		request.setAttribute("links",links );
			            	}			            	
			            }
			            else {
			                for (String error : errors) {
			                    SessionErrors.add(request, error);
			                }		
			                SessionErrors.add(request, "LinksErrorUpdating");
			                response.setRenderParameter("jspPage", editLinkJSP);
			                request.setAttribute("links", requestLinks);			                
			            }
			        }
			        else {
			            SessionErrors.add(request, "LinksErrorUpdating");
			        }
			    }
		 
		 //delete
		   public void deleteLink(ActionRequest request, ActionResponse response)
			        throws Exception {

			        long linksKey = ParamUtil.getLong(request, "resourcePrimKey");

			        if (Validator.isNotNull(linksKey)) {
			        	LinksServiceUtil.deleteLinks(linksKey);	          
			            SessionMessages.add(request, "LinksDeleted");
			        }
			        else {
			            SessionErrors.add(request, "LinksErrorDeleting");
			        }
			    }	   
		 
		   public void findByLinkGroup(ActionRequest request, ActionResponse response) throws SystemException
		   {						   
			   List<Links> tempResults = ActionUtil.getLinksByGroup(request);		   
			
			   request.setAttribute("ListByGroup", tempResults);
				response.setRenderParameter("jspPage", viewAddLinkJSP);				  
		   }

}
