package com.white.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class PropertiesUtils implements EnvironmentAware {

    @Autowired
	private static Environment env;

	@Override
	public void setEnvironment(Environment environment) {
		PropertiesUtils.env = environment;
	}

	/**
	 * Get a value based on key , if key does not exist , null is returned
	 *
	 * @param key
	 * @return
	 */
	public static String getString(String key) {
		return env.getProperty(key);
	}

	/**
	 * Get a value based on key , if key does not exist , null is returned
	 *
	 * @param key
	 * @return
	 */
	public static String getString(String key, String defaultValue) {
		String value = env.getProperty(key);
		return StringUtils.isEmpty(value) ? defaultValue : value;
	}

	/**
	 * 根据key获取值
	 *
	 * @param key
	 * @return
	 */
	public static Object getValue(String key) {
		Object object = env.getProperty(key);
		return env.getProperty(key) == null ? null : object;
	}

	/**
	 * 根据key获取值
	 *
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static Integer getValue(String key, int defaultValue) {
		String value = env.getProperty(key);
		if (StringUtils.isEmpty(value)) {
			return defaultValue;
		}
		return Integer.parseInt(value);
	}

	public static Long getLong(String key) {
		String value = env.getProperty(key);
		if (StringUtils.isEmpty(value)) {
			return null;
		}
		return Long.parseLong(value);
	}

	public static Long getLong(String key, long defaultValue) {
		String value = env.getProperty(key);
		if (StringUtils.isEmpty(value)) {
			return defaultValue;
		}
		return Long.parseLong(value);
	}

	/**
	 * 根据key获取值
	 *
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static boolean getBoolean(String key, boolean defaultValue) {
		String value = env.getProperty(key);
		if (StringUtils.isEmpty(value)) {
			return defaultValue;
		}
		return new Boolean(value);
	}

}
