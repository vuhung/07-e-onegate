/**
 * 
 */
package com.vportal.portlet.vcms.util.comparator;

import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.vportal.portlet.vcms.model.VcmsArticle;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since Jun 9, 2008
 */
public class VCMSArticleModifiedDateComparator extends OrderByComparator {
	public static String ORDER_BY_ASC = "VcmsArticle.modifiedDate ASC";

	public static String ORDER_BY_DESC = "VcmsArticle.modifiedDate DESC";

	/**
	 * ORDER BY modifiedDate DESC
	 */
	public VCMSArticleModifiedDateComparator() {
		this(false);
	}

	public VCMSArticleModifiedDateComparator(boolean asc) {
		_asc = asc;
	}

	// @Override
	public int compare(Object obj1, Object obj2) {
		VcmsArticle article1 = (VcmsArticle) obj1;
		VcmsArticle article2 = (VcmsArticle) obj2;

		int value = DateUtil.compareTo(article1.getModifiedDate(), article2
				.getModifiedDate());

		if (_asc) {
			return value;
		} else {
			return -value;
		}
	}

	// @Override
	public String getOrderBy() {
		if (_asc) {
			return ORDER_BY_ASC;
		} else {
			return ORDER_BY_DESC;
		}
	}

	private boolean _asc;

}
