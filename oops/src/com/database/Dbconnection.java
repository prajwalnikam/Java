package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	public Dbconnection() throws SQLException {
//		String user= "root";
//		String pass = "Prajwal@2181";
//		String url= "jdbc:mysql://localhost:3306/testcon";
//		
//		Connection connection = DriverManager.getConnection(url, user, pass);
//		System.out.println("Connection Done Babs");
		
	}
	public static Connection dbcon() throws SQLException {
		String user= "root";
		String pass = "Prajwal@2181";
		String url= "jdbc:mysql://localhost:3306/testcon";
		
		Connection connection = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection Done Babs");
		return connection;
	}
}
