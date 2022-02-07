package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st)
	{
		boolean flag=false;
		try {
			Connection conn = CP.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(q);
			// set the values in parameter;
			ps.setString(1, st.getStudentName());
			ps.setInt(2, st.getStudentPhone());
			ps.setString(3, st.getStudentCity());
			
			// Execute query
			ps.executeUpdate();
			flag=true;
			
		
		}
		catch(Exception e)
		{
			
			flag=false;
		}
		
		return flag;
		
	}

	public static boolean deleteStudent(int stuID) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		try {
			Connection conn = CP.createC();
			String q = "delete from students where sid=? ";
			PreparedStatement ps=conn.prepareStatement(q);
			// set the values in parameter;
		
			ps.setInt(1, stuID);
			
			// Execute query
			ps.executeUpdate();
			flag=true;
			
		
		}
		catch(Exception e)
		{
			
			flag=false;
		}
		
		return flag;
	}

	public static boolean showAllStudent() {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Connection conn = CP.createC();
			String q = "select * from students ";
			Statement stmt=conn.createStatement();
			// set the values in parameter;
		
			
			
			// Execute query
			ResultSet set=stmt.executeQuery(q);
			
			System.out.println("ID"+"\t"+"Name"+"\t"+"Phone"+"\t"+"City");
			while(set.next())
			{
				int id= set.getInt(1);
				String name=  set.getString(2);
				int phone = set.getInt(3);
				String city = set.getString(4);
				
				
				System.out.println(id+"\t"+name+"\t"+phone+"\t"+city);
			}

				flag=true;
			
		
		}
		catch(Exception e)
		{
			
			flag=false;
		}
		
		return flag;
	}
}
