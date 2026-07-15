package com.ducat.jdbc.dao;
import com.ducat.jdbc.entity.student;

import java.sql.SQLException;
import java.util.List;
public interface studentDao {

	
	public void savaStudent(student s);
	
	public void updatestuData(student s);
	
	public void deletstubyid (int id) throws SQLException;
	
	public student getstuById(int id);
	
	public void printAllstudent();
	  
	public List<student>getAllstudent();
	
	public 	void printstuByName(String name);
}


