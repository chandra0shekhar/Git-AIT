package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/birla";
	public static final String USER_NAME="root";
	public static final String PASSWORD="chandu8915";
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return con;

	}
}
