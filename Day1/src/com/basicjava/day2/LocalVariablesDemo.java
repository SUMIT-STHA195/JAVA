package com.basicjava.day2;

public class LocalVariablesDemo {
	
//	method with parameter
	public void displayCollegeInfo(String collegeName , int phoneNo) {
		String hodName = "Ram Pandey";
		System.out.println("HOD Name : "+hodName);
		System.out.println("College Name : "+collegeName);
		System.out.println("Phone No : "+phoneNo);
		
	}
	
	public static void main(String[] args) {
		
		String collegeName = "Texas International College";
		int phoneNo = 123456;
		
//		public int phoneNo = 123456; we are not allowed
		
		System.out.println("College Name : "+collegeName);
		
//		System.out.println("Name of HOD : "+hodName); cannot access
		
//	object or instance in JAVA
		LocalVariablesDemo localVariableDemo = new LocalVariablesDemo(); 
		
//		calling methods having arguments
		localVariableDemo.displayCollegeInfo(collegeName, phoneNo);
	}
	
}
