package com.ducat.jdbc.entity;

public class student {
			private int studentID ;
			private String name , Gender ;
			private int salary;
			public student() {
			}
				public student(int studentID, String name, String gender, int salary) {
					this.studentID = studentID;
					this.name = name;
					this.Gender = gender;
					this.salary = salary;
			}
			public int getStudentID() {
				return studentID;
			}
			public void setStudentID(int studentID) {
				this.studentID = studentID;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getGender() {
				return Gender;
			}
			public void setGender(String gender) {
				Gender = gender;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			@Override
			public String toString() {
				return "student [studentID=" + studentID + ", name=" + name + ", Gender=" + Gender + ", salary="
						+ salary + "]";
			}
			
			
}



