package com.rolon;

import java.io.IOException;

import com.rolon.db.DbConnector;

public class Demo {
	
	public static void main(String[] args) {
		try {
			DbConnector.connection();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
