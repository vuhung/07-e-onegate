package com.portlat.util;

import java.util.HashSet;
import java.util.Set;

import com.liferay.portal.kernel.util.StringPool;




public class DLUtil {
	
	private static final String _DEFAULT_FILE_EXTENSION = "page";

	private static DLUtil _instance = new DLUtil();

	private Set<String> _fileExtensions;
	
	private DLUtil() {
		_fileExtensions = new HashSet<String>();

		String[] fileExtensions = PropsValues.DL_FILE_EXTENSIONS;

		for (int i = 0; i < fileExtensions.length; i++) {

			// Only process non wildcard extensions

			if (!StringPool.STAR.equals(fileExtensions[i])) {

				// Strip starting period

				String extension = fileExtensions[i];
				extension = extension.substring(1, extension.length());

				_fileExtensions.add(extension);
			}
		}
	}
	
	public static String getFileExtension(String name) {
		return _instance._getFileExtension(name);
	}
	private String _getFileExtension(String name) {
		String extension = StringPool.BLANK;

		int pos = name.lastIndexOf(StringPool.PERIOD);

		if (pos != -1) {
			extension = name.substring(pos + 1, name.length()).toLowerCase();
		}

		if (!_fileExtensions.contains(extension)) {
			extension = _DEFAULT_FILE_EXTENSION;
		}

		return extension;
	}

}
