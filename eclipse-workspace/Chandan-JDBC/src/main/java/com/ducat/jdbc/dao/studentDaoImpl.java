package com.ducat.jdbc.dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import com.ducat.jdbc.entity.student;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class studentDaoImpl implements studentDao {
	private static String INSERT_QUERY  = "INSERT INTO student VALUES(%d,'%s','%s',%d)";
	private static String UPDATE_QUERY = "UPDATE student SET NAME = '%s' , GENDER = '%s' , SALARY = %d' WHERE studentID = %d";
	private static String DELETE_QUERY = "DELETE FROM student WHERE  studentID = %d";
	private static String SELECT_QUERY = "SELECT * FROM student";
	private static String SELECT_BY_ID_QUERY = "SELECT * FROM student WHERE studentID = %d" ;
	static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "ARUSH@25");
		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

	@Override
	public void savaStudent(student s) {
		 try (Statement statement = connection.createStatement()){
			 String INSERT_QUERY = "INSERT INTO student(studentID ,Name, Gender,salary) VALUES(%d , '%s' ,'%s', %d)";
			 statement.executeUpdate(String.format(INSERT_QUERY, s.getStudentID(),s.getName(),s.getGender(),s.getSalary()));
			 System.err.println(String.format(INSERT_QUERY, s.getStudentID(),s.getName(),s.getGender(),s.getSalary()));
		 } catch (SQLException e) {
			e.printStackTrace();
		 }	
	}

	@Override
	public void updatestuData(student s) {
		try (Statement statement = connection.createStatement()) {
			String UPDATE_QUERY = "UPDATE student SET Name = '%s',Gender ='%s',Salary = %d WHERE studentID = %d";
			statement.executeUpdate(String.format(UPDATE_QUERY, s.getName(),s.getGender(),s.getSalary(),s.getStudentID()));
			System.err.println(String.format(UPDATE_QUERY, s.getName(),s.getGender(),s.getSalary(),s.getStudentID()));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	@Override
	public void deletstubyid(int id) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate(String.format(DELETE_QUERY,id));
		
		System.err.println(String.format(DELETE_QUERY,id));
		
		
	}

	@Override
	public student getstuById(int id) {
		student emp = new  student();
		 System.out.println(String.format(SELECT_BY_ID_QUERY, id));
		try (Statement statement = connection.createStatement()) {
		ResultSet resultSet =  statement.executeQuery(String.format(SELECT_BY_ID_QUERY, id));
		
       resultSet.next();
       
     	 emp.setStudentID(resultSet.getInt(1));
     	 emp.setName(resultSet.getString(2));
     	 emp.setGender(resultSet.getString(3));
     	 emp.setSalary(resultSet.getInt(4));
		}  catch (SQLException e1) {
			e1.printStackTrace();
		}
		return emp;
	}
	@Override
	public void printAllstudent() {
		try (Statement statement = connection.createStatement()) {
			  System.err.println(SELECT_QUERY);
			  
          ResultSet resultSet =  statement.executeQuery(SELECT_QUERY);
        while(resultSet.next()) {
      	  System.out.println("ID = " +resultSet.getInt(1)+"\t Name = " + resultSet.getString(2)+"\t Gender = "+ resultSet.getString(3)+"\t Salary = "+ resultSet.getInt(4));
        }
			
			
		}  catch (SQLException e1) {
					e1.printStackTrace();
				}
		
	}

	@Override
	public List<student> getAllstudent() {
		 System.out.println(SELECT_QUERY);
			
		List<student> listOfEmp = new ArrayList<>();
		try (Statement statement = connection.createStatement()) {
			ResultSet resultSet =  statement.executeQuery(SELECT_QUERY);
			
	    while(resultSet.next()) {
	    	student emp = new student();
	   	 emp.setStudentID(resultSet.getInt(1));
     	 emp.setName(resultSet.getString(2));
     	 emp.setGender(resultSet.getString(3));
     	 emp.setSalary(resultSet.getInt(4));
     	 
     	 listOfEmp.add(emp);
	    }
		}  catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		return listOfEmp;
	}


@Override
public void printstuByName(String name) {
	
	try (Statement statement = connection.createStatement()) {
		  System.err.println("SELECT * FROM EMPLOYEE WHERE NAME ='" + name);
		  
      ResultSet resultSet =  statement.executeQuery("SELECT * FROM student WHERE NAME ='" + name);
    while(resultSet.next()) {
  	  System.out.println("ID = " +resultSet.getInt(1)+"\t Name = " + resultSet.getString(2)+"\t Gender = "+ resultSet.getString(3)+"\t Salary = "+ resultSet.getInt(4));
    }
		
		
	}  catch (SQLException e1) {
				e1.printStackTrace();
			}
    }
	
}

