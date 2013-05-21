/*package com.vportal.portlet.vfaq.util;


import javax.portlet.PortletURL;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.search.HitsOpenSearchImpl;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil;

public class QuestionOpenSearchImpl extends HitsOpenSearchImpl {
	public static final String SEARCH_PATH = "/c/faq/open_search";

	public static final String TITLE = "Liferay FAQ Search: ";

	public Hits getHits(
			long companyId, String keywords, int start, int end)
		throws Exception {

		return FAQQuestionServiceUtil.search(companyId, 0, 0, keywords, start, end);
	}

	public String getSearchPath() {
		return SEARCH_PATH;
	}

	public String getTitle(String keywords) {
		return TITLE + keywords;
	}
}
*/