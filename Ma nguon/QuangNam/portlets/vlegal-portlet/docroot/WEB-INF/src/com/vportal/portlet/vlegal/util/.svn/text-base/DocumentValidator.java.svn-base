package com.vportal.portlet.vlegal.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.model.VLegalDocument;

public class DocumentValidator {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean validateDocument(VLegalDocument vLegalDocument, List errors)throws Exception
	{
		boolean valid = true;

		if(Validator.isNull(vLegalDocument.getGroupId()))
		{
			errors.add("missing-group-id");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getCompanyId()))
		{
			errors.add("missing-company-id");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getUserId()))
		{
			errors.add("missing-user-id");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getCreatedByUser()))
		{
			errors.add("missing-create-by-user");
			valid = false;
		}
/*		if(Validator.isNull(vLegalDocument.getCreatedDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalDocument.getCreatedDate());
			if(!Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)))
			{
				errors.add("Enter-Valid-CreateDate");
				valid = false;
			}
		}
		else
		{
			errors.add("CreateDate-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getPromulDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalDocument.getPromulDate());
			if(Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)))
			{
				errors.add("Enter-Valid-PromulDate");
				valid = false;
			}
		}
		else
		{
			errors.add("PromulDate-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getEffectivedDate()))
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(vLegalDocument.getEffectivedDate());
			if(Validator.isDate(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.YEAR)))
			{
				errors.add("Enter-Valid-EffectiveDate");
				valid = false;
			}
		}
		else
		{
			errors.add("EffectiveDate-Required");
			valid = false;
		}*/
		if(Validator.isNull(vLegalDocument.getSummary()))
		{
			errors.add("Summary-Required");
			valid = false;
		}
		
		
		if(Validator.isNull(vLegalDocument.getNum()))
		{
			errors.add("Num-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getSymbol()))
		{
			errors.add("Symbol-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getContent()))
		{
			errors.add("Content-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getLanguage()))
		{
			errors.add("Language-Required");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getTypeDocId()))
		{
			errors.add("missing-type-doc-id");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getFieldId()))
		{
			errors.add("missing-field-id");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getOrgId()))
		{
			errors.add("missing-org-id");
			valid = false;
		}
		if(Validator.isNull(vLegalDocument.getSignerRels()))
		{
			errors.add("Signer-Required");
			valid = false;
		}
		
		return valid;
	}
	
}
