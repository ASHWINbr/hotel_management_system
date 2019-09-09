package com.cognizant.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionHandler {
	public static Connection getConnection() {
		System.out.println("inside connection");
		try {
			// load a properties file for reading
			
			  ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			  InputStream input = classLoader.getResourceAsStream("connection.properties");
			  Properties properties = new Properties(); properties.load(input);
			 
			Class.forName(properties.getProperty("driver"));
			String url = properties.getProperty("connection-url");
			String userName = properties.getProperty("user");
			String password = properties.getProperty("password");
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("inside Connection " + properties.getProperty("driver"));
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside catch");
		}
		return null;

	}
}
