/*
 * @(#)AttachmentUtil.java
 *
 * Copyright (c) 2007 VietSoftware, Inc.
 * 51 Le Dai Hanh street, Hai Ba Trung district, Hanoi, Vietnam.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * VietSoftware, Inc. ("Confidential Information").  You shall not 
 * disclose such Confidential Information and shall use it only in 
 * accordance with the terms of the license agreement you entered 
 * into with VietSoftware, Inc.
 *
 */
package com.vportal.util;

import java.io.File;
import java.io.InputStream;
import java.util.Date;

import com.liferay.documentlibrary.service.DLLocalServiceUtil;
import com.liferay.documentlibrary.service.DLServiceUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.service.ServiceContext;
import com.vportal.portal.util.WebKeysExt;

/**
 * @author donghh
 * @version 1.0.00, 21/05/2008
 */
public class DLUtilExt {

	public static boolean addFile(long companyId , long groupId, String fileName,
			byte[] byteArray, long fileEntryId, ServiceContext serverContext) {

		String portletId = CompanyConstants.SYSTEM_STRING;
		try {
			//hoan
			DLServiceUtil.addFile(companyId, portletId, groupId,
					WebKeysExt.REPOSITORIES_ID, fileName, fileEntryId, StringPool.BLANK,
					new Date(), serverContext, byteArray);
			//hoan
			/*DLServiceUtil.addFile(companyId, portletId, groupId,
					WebKeysExt.REPOSITORIES_ID, fileName, StringPool.BLANK,
					new String[0], byteArray);*/
			/*
			 * DLServiceUtil.addFile(companyId,String.valueOf(WebKeysExt.REPOSITORIES_ID),
			 * filename, byteArray);
			 */
		} catch (Exception ex) {
			return false;
		}

		return true;
	}

	public static boolean deleteFile(long companyId , String fileName) {

		String portletId = CompanyConstants.SYSTEM_STRING;

		try {
			DLServiceUtil.deleteFile(companyId, portletId,
					WebKeysExt.REPOSITORIES_ID, fileName);
			/*
			 * DLServiceUtil.deleteFile(companyId,
			 * String.valueOf(WebKeysExt.REPOSITORIES_ID), filename);
			 */
		} catch (Exception ex) {
			return false;
		}

		return true;
	}

	public static InputStream getFileAsStream(long companyId , String filename) {

		InputStream is = null;

		try {

			is = DLLocalServiceUtil.getFileAsStream(companyId,
					WebKeysExt.REPOSITORIES_ID, filename);

		} catch (Exception ex) {
			return is;
		}

		return is;
	}
	
	public static String getFileName(String realPathFile){
		String fileName;
		
		int lastIndex = realPathFile.lastIndexOf("\\");
		
		fileName = realPathFile.substring(lastIndex+1, realPathFile.length());
		
		return fileName;
	}
}
