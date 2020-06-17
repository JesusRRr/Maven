package com.rolon;

import java.io.IOException;
import java.sql.SQLException;

import com.rolon.db.DbConnector;
import com.rolon.model.User;
import com.rolon.service.UserService;

public class Demo {
	private DbConnector DB;
	
	public static void main(String[] args) {
	
		UserService userService = new UserService();
		User user = new User();
		user.setEmail("email@gmail.com");
		user.setPassword("pass");
		
		try {
			userService.createUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
