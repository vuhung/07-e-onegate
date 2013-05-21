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
public class FileDownloadTag extends IncludeTag {

	// @Override
	public int doStartTag() throws JspException {
		// attachment
		this._attachmentList = null;
		setAttachmentList();
		if (_attachmentList == null) {
			this._attachmentList = new ArrayList();
		}
		//
		ServletRequest req = pageContext.getRequest();
		req.setAttribute("vportal:filedownload:attachmentList", _attachmentList);
		req.setAttribute("vportal:filedownload:displayStyle", _displayStyle);

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

				// System.out.println("size:"+listAttachment.size());

				_attachmentList = listAttachment;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String getDisplayStyle() {
		return _displayStyle;
	}

	public void setDisplayStyle(String _displayStyle) {
		this._displayStyle = _displayStyle;
	}

	/**
	 * @return the _entryClass
	 */
	public Class getEntryClass() {
		return _entryClass;
	}

	/**
	 * @param class1
	 *            the _entryClass to set
	 */
	public void setEntryClass(Class class1) {
		_entryClass = class1;
	}

	/**
	 * @return the _entryId
	 */
	public long getEntryId() {
		return _entryId;
	}

	/**
	 * @param id
	 *            the _entryId to set
	 */
	public void setEntryId(long id) {
		_entryId = id;
	}

	private static final String _PAGE = "/html/taglib/vportal/file_download/page.jsp";
	private List _attachmentList = new ArrayList();
	private String _displayStyle = "";
	private Class _entryClass = null;
	private long _entryId = 0;

}
