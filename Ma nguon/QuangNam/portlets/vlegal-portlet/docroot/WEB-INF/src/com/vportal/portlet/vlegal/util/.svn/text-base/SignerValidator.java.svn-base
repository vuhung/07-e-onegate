package com.vportal.portlet.vlegal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.model.VLegalSigner;

public class SignerValidator {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean validateSigner(VLegalSigner vLegalSigner, List errors) throws Exception
	{
		boolean valid = true;
		if(Validator.isNull(vLegalSigner.getGroupId()))
		{
			errors.add("missing-group-id");
			valid = false;
		}
		if(Validator.isNull(vLegalSigner.getCompanyId()))
		{
			errors.add("missing-company-id");
			valid = false;
		}
		if(Validator.isNull(vLegalSigner.getFirstName()))
		{
			errors.add("FirstName-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalSigner.getUserId()))
		{
			errors.add("missing-user-id");
			valid = false;
		}
		if(Validator.isNull(vLegalSigner.getLastName()))
		{
			errors.add("LastName-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalSigner.getCreatedDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalSigner.getCreatedDate());
			if(!Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)));
			{
				errors.add("CreateDate-Required");
				valid = false;
			}
		}
		if(Validator.isNull(vLegalSigner.getLanguage()))
		{
			errors.add("Language-Required");
			valid = false;
		}
		
		return valid;
		
	}
	
}
