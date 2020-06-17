package com.rolon.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnector {
	private  Properties properties;
	private  FileInputStream file;
	private  Connection connection;
	private  String url;
	private  String user;
	private  String password;
	
	public DbConnector() throws IOException {
		getConfigurationFile();
		properties=new Properties();
		properties.load(file);
		url=properties.getProperty("url");
		user=properties.getProperty("user");
		password=properties.getProperty("password");
	}
	
	public Connection connection() throws SQLException {
	
		connection= DriverManager.getConnection(url, user, password);
		
		return connection;
	}
	
	public FileInputStream getConfigurationFile() throws FileNotFoundException {
		return file = new FileInputStream("./config.properties");
	}
	
	public Properties getProperties() {
		return properties;
	}
}
