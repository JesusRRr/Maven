package com.rolon.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.rolon.db.DbConnector;
import com.rolon.model.User;

public class UserService {
	private DbConnector DB;
	private Connection connection;
	private Properties prop;
	private String createUser;
	private String createUserTable;
	
	public UserService() {
		try {
			DB = new DbConnector();
			connection=DB.connection();
			prop=DB.getProperties();
			setQueries();
			createUSerTable();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void setQueries() {
		createUserTable=prop.getProperty("createUserTable");
		createUser=prop.getProperty("createUser");
	}
	
	public void createUSerTable() throws SQLException {
		PreparedStatement statement = connection.prepareStatement(createUserTable);
		System.out.println(createUserTable);
		statement.executeUpdate();
	}
	
	public void createUser(User user) throws SQLException {
		PreparedStatement statement = connection.prepareStatement(createUser);
		statement.setString(1, user.getEmail());
		statement.setString(2, user.getPassword());
		statement.executeUpdate();
		statement.close();
	}
	
}
