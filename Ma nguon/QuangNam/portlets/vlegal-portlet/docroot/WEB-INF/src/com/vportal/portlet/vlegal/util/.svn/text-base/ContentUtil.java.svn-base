package com.vportal.portlet.vlegal.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.liferay.portal.kernel.util.StringUtil;
import com.vportal.portlet.vlegal.util.ContentUtil;

public class ContentUtil {
	public static String get(String location) {
		return _instance._get(location, false);
	}

	public static String get(String location, boolean all) {
		return _instance._get(location, all);
	}

	private ContentUtil() {
		_contentPool = new HashMap<String, String>();
	}

	private String _get(String location, boolean all) {
		String content = _contentPool.get(location);

		if (content == null) {
			try {
				content = StringUtil.read(
					getClass().getClassLoader(), location, all);

				_put(location, content);
			}
			catch (IOException ioe) {
				_log.error(ioe, ioe);
			}
		}

		return content;
	}

	private void _put(String location, String content) {
		_contentPool.put(location, content);
	}

	private static Log _log = LogFactory.getLog(ContentUtil.class);

	private static ContentUtil _instance = new ContentUtil();

	private Map<String, String> _contentPool;

}
