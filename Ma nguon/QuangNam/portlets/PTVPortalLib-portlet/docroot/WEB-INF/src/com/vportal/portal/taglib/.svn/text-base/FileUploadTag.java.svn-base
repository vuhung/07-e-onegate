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
public class FileUploadTag extends IncludeTag {

	// @Override
	public int doStartTag() throws JspException {
		// attachment
		this._attachmentList = null;
		setAttachmentList();

		// save attributes
		ServletRequest req = pageContext.getRequest();
		req.setAttribute("vportal:fileupload:title", _title);
		req.setAttribute("vportal:fileupload:description", _description);
		req.setAttribute("vportal:fileupload:maxAttachment", new Integer(
				_maxAttachment));
		req.setAttribute("vportal:fileupload:attachmentList", _attachmentList);
		req.setAttribute("vportal:fileupload:style", new Integer(_style));

		return EVAL_BODY_BUFFERED;
	}

	// @Override
	protected String getPage() {
		return _PAGE;
	}

	public List getAttachmentList() {

		return _attachmentList;
	}

	public void setAttachmentList(List attachmentList) {
		this._attachmentList = attachmentList;
	}

	public void setAttachmentList() {
		if (_entryClass != null && _entryId > 0) {
			try {
				List listAttachment = AttachmentLocalServiceUtil
						.getAttachments(_entryId, _entryClass);
				if (listAttachment == null) {
					listAttachment = new ArrayList();
				}
				_attachmentList = listAttachment;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String getTitle() {
		return _title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public int getMaxAttachment() {
		return _maxAttachment;
	}

	public void setMaxAttachment(int maxAttachment) {
		this._maxAttachment = maxAttachment;
	}

	public int getStyle() {
		return _style;
	}

	public void setStyle(int style) {
		this._style = style;
	}

	public void setTitle(String title) {
		this._title = title;
	}

	public void setEntryId(long id) {
		this._entryId = id;
	}

	public long getEntryId() {
		return this._entryId;
	}

	public Class getEntryClass() {
		return this._entryClass;
	}

	public void setEntryClass(Class class1) {
		this._entryClass = class1;
	}

	private static final String _PAGE = "/html/taglib/vportal/file_upload/page.jsp";
	private List _attachmentList = new ArrayList();
	private long _entryId = 0;
	private Class _entryClass = null;
	private String _title = "";
	private String _description = "";
	private int _maxAttachment = 1;
	private int _style = 1;
}
