package com.vportal.portlet.vlegal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.model.VLegalField;

public class FieldValidator {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean validateField(VLegalField vLegalField, List errors)throws Exception
	{
		boolean valid = true;
		
		if(Validator.isNull(vLegalField.getFieldId()))
		{
			errors.add("missing-field-id");
			valid = false;
		}
		if(Validator.isNull(vLegalField.getGroupId()))
		{
			errors.add("missing-group-id");
			valid = false;
		}
		if(Validator.isNull(vLegalField.getCompanyId()))
		{
			errors.add("missing-company-id");
			valid = false;
		}
		if(Validator.isNull(vLegalField.getUserId()))
		{
			errors.add("missing-user-id");
			valid = false;
		}
		if(Validator.isNull(vLegalField.getCreatedDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalField.getCreatedDate());
			if(!Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)))
			{
				errors.add("CreateDate-Required");
				valid = false;
			}
		}
		if(Validator.isNull(vLegalField.getName()))
		{
			errors.add("Name-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalField.getDescription()))
		{
			errors.add("Description-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalField.getLanguage()))
		{
			errors.add("Language-Required");
			valid = false;
		}
		
		return valid;
	}
	
}
