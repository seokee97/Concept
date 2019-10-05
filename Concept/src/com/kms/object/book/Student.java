package com.kms.object.book;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	public String getStudentName() {
		
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	public static void main(String[] args) {
		
		Student kim =new Student(5415768, "KimMinSeok",3,"TK");
		
		System.out.println(kim.getStudentName()); 
	}
}
