package com.rolon;

import java.io.IOException;
import java.sql.SQLException;

import com.rolon.db.DbConnector;

public class Demo {
	private DbConnector DB;
	
	public static void main(String[] args) {
		try {
			DbConnector DB = new DbConnector();
			DB.connection();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
