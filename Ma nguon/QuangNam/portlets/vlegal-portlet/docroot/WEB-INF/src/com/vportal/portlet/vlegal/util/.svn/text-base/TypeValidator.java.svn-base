package com.vportal.portlet.vlegal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.model.VLegalType;

public class TypeValidator {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean validateType(VLegalType vLegalType, List errors) throws Exception
	{
		boolean valid = true;
		
		if(Validator.isNull(vLegalType.getName()))
		{
			errors.add("Type-Name-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalType.getDescription()))
		{
			errors.add("Type-Description-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalType.getLanguage()))
		{
			errors.add("Type-Language-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalType.getCreatedDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalType.getCreatedDate());
			if(!Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)))
			{
				errors.add("Enter-Type-CreateDate");
				valid = false;
			}
		}
		else
		{
			errors.add("Type-CreateDate-Requied");
			valid = false;
		}
		if(Validator.isNull(vLegalType.getUserId()))
		{
			errors.add("missing-user-id");
			valid = false;
		}
		if(Validator.isNull(vLegalType.getGroupId()))
		{
			errors.add("missing-group-id");
			valid = false;
		}
		if(Validator.isNull(vLegalType.getCompanyId()))
		{
			errors.add("missing-company-id");
			valid = false;
		}
		return valid;
	}

}
