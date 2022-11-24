package com.pro.wings.file;

public class JdbcCrudDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10,"Ram","Ayodhya");
		
		create(s1);
		
		update(1, s1);
		
		delete(1);
		
		read(1);
		
	}

	private static Student read(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean delete(int i) {
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean update(int i, Student s1) {
		// TODO Auto-generated method stub
		return true;
		
	}

	private static boolean create(Student s1) {
		// TODO Auto-generated method stub
		return true;
	}

}
