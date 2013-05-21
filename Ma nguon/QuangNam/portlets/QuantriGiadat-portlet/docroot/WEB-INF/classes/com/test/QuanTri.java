package com.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.action.CategoryAction;
import com.test.action.PriceAction;

/**
 * Portlet implementation class QuanTri
 */
public class QuanTri extends MVCPortlet {
	CategoryAction category=new CategoryAction();
	
	public void Category_New(ActionRequest req,ActionResponse response)throws PortalException{
		category.Add_Category(req, response);
		
	}
	public void Category_Edit(ActionRequest req,ActionResponse response)throws PortalException{
		category.Edit_Category(req, response);
	}
 public void Delete_Category(ActionRequest req,ActionResponse response) throws PortalException{
	 category.Delete_Category(req, response);
	 
 }
    PriceAction priceaction=new PriceAction();
    public void PriceAdd(ActionRequest req,ActionResponse response) throws PortalException{
    	priceaction.PriceAdd(req, response);
    }
    public void Price_Edit(ActionRequest req,ActionResponse response) throws PortalException{
    	priceaction.Edit_Price(req, response);
    }
    
    public void Prices_Delete(ActionRequest req,ActionResponse responses)throws PortalException{
    	priceaction.Price_Delete(req, responses);
    }
}
