package com.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.action.AdvItemAction;
import com.test.action.AdvTypeAction;

/**
 * Portlet implementation class NewPortlet
 */
public class NewPortlet extends MVCPortlet {
 
	AdvItemAction advitems=new AdvItemAction();
	public void Item_new(ActionRequest req,ActionResponse response) throws PortletException
	{
		advitems.AdvItem_new(req, response);
	}
   public void Item_Edit(ActionRequest req,ActionResponse response) throws PortletException{
	   advitems.AdvItem_Edit(req, response);
   }
   public void Item_Delete(ActionRequest req,ActionResponse response) throws PortletException{
	   advitems.AdvItem_Delete(req, response);
   }
	
	AdvTypeAction advtypes=new AdvTypeAction();
	public void Type_new(ActionRequest req,ActionResponse response) throws PortletException{
		advtypes.AdvType_new(req, response);
	}
	

	public void type_Edit(ActionRequest req,ActionResponse rep) throws PortletException{
		
	advtypes.AdvType_Edit(req, rep);	
	}
//	public void portion_Delete(ActionRequest request,
//			ActionResponse response) throws PortletException {
//		vPortion.portion_Delete(request, response);
//		}
	public void type_Delete(ActionRequest req,ActionResponse rep) throws PortletException{
		
		advtypes.AdvType_Delete(req, rep);
	}
}
