package com.vsi.lienketwebsite;

import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vsi.lienketwebsite.model.LinkGroup;
import com.vsi.lienketwebsite.model.Links;

public class ValidatorUtil {
	
	public static boolean validateLinkGroup(LinkGroup linkGroup, List errors) 
	{
        boolean valid = true;

        if (Validator.isNull(linkGroup.getName())) {
            errors.add("name-required");
            valid = false;
        }   
        return valid;
    }
	
	//validate for Links
	public static boolean validateLinks(Links links, List errors) 
	{
        boolean valid = true;

        if (Validator.isNull(links.getName())) {
            errors.add("linkName-required");
            valid = false;
        }          
        if (links.getLinkgroupId()==-1) {        	
            errors.add("linkGroupId-required");
            valid = false;
        }       
        if (Validator.isNull(links.getUrl())) {
            errors.add("url-required");
            valid = false;
        }       
       /* if(Validator.isUrl(links.getUrl()))
        {
        	errors.add("url-invalid");
        	valid = false;
        }*/
        return valid;
    }	

}
