package com.ducat.jdbc;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.Statement;
import com.ducat.jdbc.entity.student;

import java.sql.SQLException;

import com.ducat.jdbc.dao.studentDao;
import com.ducat.jdbc.dao.studentDaoImpl;

public class Main {

		public static void main(String[] args) throws SQLException /*throws SQLException*/ {
			student emp1 = new student(13, "anushka", "feMale", 25000);
			
			studentDao sdao = new studentDaoImpl();
			//	employee e = new employee(1, "Arush","male",55000 );
//				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","ARUSH@25");
//				
//				Statement statement = connection.createStatement();
//				
//	statement.executeUpdate("update student set salary = 25000 where studentID = 2");
			
		 // DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","ARUSH@25").createStatement().executeUpdate("update student set salary = 35000 where studentID = 4");
			
			//statement.executeUpdate("update student set salary = 1000 where studentID = 2");

			
	    	//sdao.savaStudent(emp1);
			
			
			//sdao.updatestuData(emp1);
			
			
			//sdao.deletstubyid(42);
			
			
			//student em = sdao.getstuById(1);
			//System.err.println(em);
			
			
			//sdao.printAllstudent();
			
			
			
			//sdao.getAllstudent();
			//System.err.println(sdao.getAllstudent());
			
			
			// sql injection----------------------------------->>
			 sdao.printstuByName("abs ' or 1=1");
			// edao.printstuByName("kancha' and  1=1");
			
			
			System.err.println("transaction Completed----------------");
				

	}

}
