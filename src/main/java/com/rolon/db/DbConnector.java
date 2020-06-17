package com.rolon.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DbConnector {
	private static Properties properties;
	private static FileInputStream file;
	
	public static void connection() throws IOException {
		getConfigurationFile();
		properties=new Properties();
		properties.load(file);
		System.out.println(properties.getProperty("url"));
	}
	
	public static void getConfigurationFile() {
		try {
			file = new FileInputStream("./config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
