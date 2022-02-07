package com.student.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.*;
public class StartProject {


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome to Student Managment Project");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Exit App");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				// add student
				System.out.println("Enter user name");
				String name= br.readLine();
				
				System.out.println("Enter user phone");
				int phone= Integer.parseInt(br.readLine());
				
				System.out.println("Enter user city");
				String city= br.readLine();
				
				//Create object 
				Student st = new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				if(ans)
				{
					System.out.println("Succesfully added student detailss.....");
					
				}
				else {
					System.out.println("Something went wrong....");
				}
			}
			else if(c==2)
			{
				// delete student
				
				System.out.println("Enter student id to delete: ");
				int stuID = Integer.parseInt(br.readLine());
				
				boolean ans=StudentDao.deleteStudent(stuID);
				if(ans)
				{
					System.out.println("Succesfully Deleted student detailss.....");
					
				}
				else {
					System.out.println("Something went wrong....");
				}
				
			}
			else if(c==3)
			{
				//Display info
				
				
				boolean ans=StudentDao.showAllStudent();
				if(ans)
				{
					
					
				}
				else {
					System.out.println("Something went wrong....");
				}
			}
			else if(c==4)
			{
				break;
			}
		}
		System.out.println("Thank you  for using my Application");
		
	}

}

