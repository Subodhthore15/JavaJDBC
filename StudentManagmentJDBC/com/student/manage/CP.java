package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection conn; // connection ref (instance)
	public static  Connection createC()
	{
		try
		{
			// Register(load) the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create connection
			String url="jdbc:mysql://localhost:3306/student_manage";
			String user="root";
			String password="root";
			conn = DriverManager.getConnection(url,user,password);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
