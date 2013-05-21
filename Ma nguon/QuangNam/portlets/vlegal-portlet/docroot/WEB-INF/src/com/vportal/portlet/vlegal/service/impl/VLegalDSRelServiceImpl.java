/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vportal.portlet.vlegal.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;
import com.vportal.portlet.vlegal.model.VLegalDSRel;
import com.vportal.portlet.vlegal.service.base.VLegalDSRelServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalDFRelUtil;
import com.vportal.portlet.vlegal.service.persistence.VLegalDSRelPK;
import com.vportal.portlet.vlegal.service.persistence.VLegalDSRelUtil;

/**
 * The implementation of the v legal d s rel remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalDSRelService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil} to access the v legal d s rel remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalDSRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil
 */
public class VLegalDSRelServiceImpl extends VLegalDSRelServiceBaseImpl {
	
	public VLegalDSRel addRelation(String docId, String sigId) throws com.liferay.portal.kernel.exception.SystemException
	{
		VLegalDSRel relation = null;
		
		VLegalDSRelPK pKey = new VLegalDSRelPK(sigId, docId);
		
		relation = VLegalDSRelUtil.create(pKey);
		
		return VLegalDSRelUtil.update(relation, false);
	}
	
	public void deleteRelation(String docId, String sigId) throws NoSuchVLegalDSRelException, com.liferay.portal.kernel.exception.SystemException
	{
		if(Validator.isNull(sigId) || Validator.isNull(docId))
		{
			return;
		}
		
		VLegalDSRelPK pKey = new VLegalDSRelPK(sigId, docId);
		
		VLegalDSRelUtil.remove(pKey);
	}
	
	public void deleteRelBySigner(String sigId) throws com.liferay.portal.kernel.exception.SystemException
	{
		if(Validator.isNull(sigId))
		{
			return;
		}
		VLegalDSRelUtil.removeBySigner(sigId);
	}
	
	public void deleteRelByDoc(String docId) throws com.liferay.portal.kernel.exception.SystemException
	{
		if(Validator.isNull(docId))
		{
			return;
		}
		
		VLegalDSRelUtil.removeByDoc(docId);
		
	}
	
	@SuppressWarnings("rawtypes")
	public List getRelByDoc(String docId)
	{
		List<VLegalDSRel> dsRel = null;
		try 
		{
			dsRel = VLegalDSRelUtil.findByDoc(docId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsRel;
	}
	
	@SuppressWarnings("rawtypes")
	public List getRelByField(String fieldId) throws com.liferay.portal.kernel.exception.SystemException
	{
		List rels = new ArrayList();
		
		if(Validator.isNull(fieldId))
		{
			return rels;
		}
		
		rels = VLegalDFRelUtil.findByField(fieldId);
		
		return rels;
	}
	
}