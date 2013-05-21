/**
 * 
 */
package com.vportal.portal.taglib;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;

import com.liferay.taglib.util.IncludeTag;
import com.vportal.portal.service.AttachmentLocalServiceUtil;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since May 23, 2008
 */
public class ImageUploadTag extends IncludeTag {

	// @Override
	public int doStartTag() throws JspException {
		//
		this._imageList = null;
		setImageList();
		if (this._imageList == null) {
			this._imageList = new ArrayList();
		}
		
		//
		ServletRequest req = pageContext.getRequest();
		req.setAttribute("vportal:imageupload:imageList", _imageList);
		req.setAttribute("vportal:imageupload:title", _title);
		req.setAttribute("vportal:imageupload:description", _description);
		req
				.setAttribute("vportal:imageupload:maxImage", new Integer(
						_maxImage));

		return EVAL_BODY_BUFFERED;
	}

	// @Override
	protected String getPage() {
		return _PAGE;
	}

	public void setImageList() {
		if (_entryClass != null && _entryId > 0) {
			try {
				List listImage = AttachmentLocalServiceUtil.getIGImages(_entryClass, _entryId);
				if (listImage == null) {
					listImage = new ArrayList();
				}
				_imageList = listImage;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List getImageList() {
		return _imageList;
	}

	public void setImageList(List imageList) {
		this._imageList = imageList;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		this._title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public int getMaxImage() {
		return _maxImage;
	}

	public void setMaxImage(int maxImage) {
		this._maxImage = maxImage;
	}

	/**
	 * @param class1
	 *            the _entryClass to set
	 */
	public void setEntryClass(Class class1) {
		_entryClass = class1;
	}

	/**
	 * 
	 */
	/**
	 * @param id
	 *            the _entryId to set
	 */
	public void setEntryId(long id) {
		_entryId = id;
	}

	/**
	 * @return the _entryClass
	 */
	public Class getEntryClass() {
		return _entryClass;
	}

	/**
	 * @return the _entryId
	 */
	public long getEntryId() {
		return _entryId;
	}

	private static final String _PAGE = "/html/taglib/vportal/image_upload/page.jsp";

	private List _imageList = new ArrayList();
	private String _title = "";
	private Class _entryClass = null;
	private long _entryId = 0;
	private String _description = "";
	private int _maxImage = 1;

}
