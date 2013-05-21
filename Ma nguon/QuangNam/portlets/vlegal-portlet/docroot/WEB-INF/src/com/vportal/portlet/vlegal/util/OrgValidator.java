package com.vportal.portlet.vlegal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.model.VLegalOrg;

public class OrgValidator {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean validateOrg(VLegalOrg vLegalOrg, List errors) throws Exception
	{
		boolean valid = true;
		
		if(Validator.isNull(vLegalOrg.getGroupId()))
		{
			errors.add("missing-group-id");
			valid = false;
		}
		if(Validator.isNull(vLegalOrg.getCompanyId()))
		{
			errors.add("missing-company-id");
			valid = false;
		}
		if(Validator.isNull(vLegalOrg.getUserId()))
		{
			errors.add("missing-user-id");
			valid = false;
		}
		if(Validator.isNull(vLegalOrg.getCreatedDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalOrg.getCreatedDate());
			if(!Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)))
			{
				errors.add("CreateDate-Required");
				valid = false;
			}
		}
		if(Validator.isNull(vLegalOrg.getName()))
		{
			errors.add("Name-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalOrg.getDescription()))
		{
			errors.add("Description-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalOrg.getLanguage()))
		{
			errors.add("Language-Required");
			valid = false;
		}
		
		return valid;
		
	}

}
