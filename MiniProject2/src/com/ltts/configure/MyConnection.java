package com.ltts.configure;


import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","admin");
		return c;
	}


}