package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public Properties ps;

	public ConfigReader() throws IOException {

		try {
			File fs = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\adactin\\properties\\config.properties");
			FileInputStream fileInput = new FileInputStream(fs); // getting values from above path
			ps = new Properties();
			ps.load(fileInput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public String getBrowser() {

		String browser = ps.getProperty("BrowserName");
		if (browser == null) {
			System.out.println("BrowserName not Found");
		}
		return browser;
	}

	public String getUrl() {
		
		String urlName = ps.getProperty("Url");
		if (urlName==null) {
			System.out.println("Url is not Found");
		}
		return urlName;
	}
}
