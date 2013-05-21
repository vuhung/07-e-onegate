package com.portlet.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WeatherUtil {
	
	//this
	public static String ConvertText(String fileURL) throws IOException {
		String contentString = "";
		InputStream in = null;
		try {
			URL url = new URL(fileURL);
			URLConnection urlConn = url.openConnection();

			// get the input stream
			in = urlConn.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String tmp = br.readLine();
			do {

				contentString += tmp;
				tmp = br.readLine();

			} while (tmp != null);

		} catch (Exception ex) {

		} finally {
			in.close();
		}
		return contentString;
	}

	public static String ConvertWeatherText(String fileURL) throws IOException {
		String contentString = "";
		InputStream in = null;
		try {
			URL url = new URL(fileURL);

			URLConnection urlConn = url.openConnection();

			String contentType = urlConn.getContentType();
			// get the input stream
			in = urlConn.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			char[] buffer = new char[1024];

			String tmp = br.readLine();
			do {

				contentString += tmp + "\n";

				tmp = br.readLine();

			} while (tmp != null);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			in.close();
		}
		return contentString;
	}
}
