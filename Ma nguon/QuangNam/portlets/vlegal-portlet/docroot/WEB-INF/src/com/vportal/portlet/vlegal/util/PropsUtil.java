package com.vportal.portlet.vlegal.util;

import java.util.Properties;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.Filter;
import com.vportal.portlet.vlegal.util.PropsFiles;
import com.vportal.portlet.vlegal.util.PropsKeys;
import com.vportal.portlet.vlegal.util.PropsUtil;
import com.liferay.util.SystemProperties;

public class PropsUtil {
	public static void addProperties(Properties properties) {
		_instance._addProperties(properties);
	}

	public static boolean contains(String key) {
		return _instance._contains(key);
	}

	public static String get(String key) {
		return _instance._get(key);
	}

	public static String get(String key, Filter filter) {
		return _instance._get(key, filter);
	}

	public static String[] getArray(String key) {
		return _instance._getArray(key);
	}

	public static String[] getArray(String key, Filter filter) {
		return _instance._getArray(key, filter);
	}

	public static Properties getProperties() {
		return _instance._getProperties();
	}

	public static void removeProperties(Properties properties) {
		_instance._removeProperties(properties);
	}

	public static void set(String key, String value) {
		_instance._set(key, value);
	}
	private void _addProperties(Properties properties) {
		_configuration.addProperties(properties);
	}

	private boolean _contains(String key) {
		return _configuration.contains(key);
	}

	private String _get(String key) {
		return _configuration.get(key);
	}

	private String _get(String key, Filter filter) {
		return _configuration.get(key, filter);
	}

	private String[] _getArray(String key) {
		return _configuration.getArray(key);
	}

	private String[] _getArray(String key, Filter filter) {
		return _configuration.getArray(key, filter);
	}

	private Properties _getProperties() {
		return _configuration.getProperties();
	}

	private void _removeProperties(Properties properties) {
		_configuration.removeProperties(properties);
	}

	private void _set(String key, String value) {
		_configuration.set(key, value);
	}

	private static PropsUtil _instance = new PropsUtil();

	private Configuration _configuration;

}
