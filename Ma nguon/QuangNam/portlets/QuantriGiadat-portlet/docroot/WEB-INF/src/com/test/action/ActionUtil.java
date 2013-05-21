package com.test.action;

import java.rmi.RemoteException;
import java.util.List;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.test.NoSuchVlookuppriceCategoryException;
import com.test.model.VlookuppriceCategory;
import com.test.service.VlookuppriceCategoryServiceUtil;


public class ActionUtil {

	 public static String getCategory(long groupId,String parentId,String language,String categoryId) throws NoSuchVlookuppriceCategoryException, RemoteException, com.liferay.portal.kernel.exception.SystemException{
		  List listparent = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,parentId,language);
		  StringBuffer sb = new StringBuffer();
		  for (int i = 0; i < listparent.size(); i++) {
			  VlookuppriceCategory cat = (VlookuppriceCategory)listparent.get(i);
			  sb.append("<option value=\"" + cat.getCategoryId() + "\" ");
				sb.append(cat.getCategoryId().equals(categoryId) ? "selected=\"selected\"" : "");
				sb.append(">");
				sb.append(cat.getName());
				sb.append("</option>");
				List categories = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,cat.getCategoryId(),language);
				int indent = 2;
				traverseCategory(sb,categories,indent,cat.getCategoryId(),categoryId);
		  }
		  return sb.toString();
	  }
	 public static void traverseCategory(StringBuffer sb, List categories,
				int indent, String parentId, String categoryId) throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException
	 {
		  for (int i = 0; i < categories.size(); i++) {
			  VlookuppriceCategory cat = (VlookuppriceCategory)categories.get(i);
			   sb.append("<option value=\"" + cat.getCategoryId() + "\" ");
				sb.append(cat.getCategoryId().equals(categoryId) ? "selected" : "");
				sb.append(">");
				// Indent
				for (int j = 0; j < indent; j++) {
					sb.append(StringPool.NBSP);
				}
				sb.append(cat.getName());
				sb.append("</option>");
				List list = VlookuppriceCategoryServiceUtil.findByP_P_L(cat.getGroupId(),cat.getCategoryId(),cat.getLanguage());
				traverseCategory(sb,list,indent + 2,cat.getCategoryId(),categoryId);
		  }	  
		 
	 }
	 public static String getListCategory(long groupId,String parentId,String language,String categoryId) throws NoSuchVlookuppriceCategoryException, RemoteException, com.liferay.portal.kernel.exception.SystemException{
		  List listparent = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,parentId,language);
		  String listParentId = "0/";
		  StringBuffer sb = new StringBuffer();
		  for (int i = 0; i < listparent.size(); i++) {
			  VlookuppriceCategory cat = (VlookuppriceCategory)listparent.get(i);
			  sb.append("<option value=\""+listParentId+cat.getCategoryId()+"\" ");
				sb.append((listParentId+cat.getCategoryId()).equals(categoryId) ? "selected=\"selected\"" : "");
				sb.append(">");
				sb.append(cat.getName());
				sb.append("</option>");
				List categories = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,cat.getCategoryId(),language);
				int indent = 2;
				traverseListCategory(sb,categories,indent,cat.getCategoryId(),categoryId,listParentId+cat.getCategoryId());
		  }
		  return sb.toString();
	  }
	 private static void traverseListCategory(StringBuffer sb, List categories,
				int indent, String parentId, String categoryId,String listPrantId) throws NoSuchVlookuppriceCategoryException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
		  for (int i = 0; i < categories.size(); i++) {
			  VlookuppriceCategory cat = (VlookuppriceCategory)categories.get(i);
			   String listParent = listPrantId+"/"+cat.getCategoryId();
			   sb.append("<option value=\"" + listParent + "\" ");
				sb.append(listParent.equals(categoryId) ? "selected" : "");
				sb.append(">");
				// Indent
				for (int j = 0; j < indent; j++) {
					sb.append(StringPool.NBSP);
				}
				sb.append(cat.getName());
				sb.append("</option>");
				List list = VlookuppriceCategoryServiceUtil.findByP_P_L(cat.getGroupId(),cat.getCategoryId(),cat.getLanguage());
				traverseListCategory(sb,list,indent + 2,cat.getCategoryId(),categoryId,listParent);
		  }	  
	  }
	 
}
