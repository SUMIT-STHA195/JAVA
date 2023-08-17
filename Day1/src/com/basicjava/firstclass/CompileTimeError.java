package com.basicjava.firstclass;

public class CompileTimeError {
	
	public static void main(String[] args) {
		
		//compile time error
		//1.Syntax error: write invalid code highligted as red
		//2.Semantic error for eg. int int = 10;
		
		//primitive data types
		int num1= 10;
		double num2 = 10.56;
		char gender = 'M';
		boolean flag = true;
		float salary = 1234.56f;
		byte rollNo = 12;
		long id = 23456778L;
		short height = 45;
		
		
		//Non-primitive data type
		String name = "Ram Pandey";
		Object data = "Texas International College";
		Object data1 = 12345;
		
		System.out.println("Int num1 : "+num1);
		System.out.println("Double num2 : "+num2);
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Flag : "+flag);
		System.out.println("Data : "+data);
		System.out.println("Data2 : "+data1);
		System.out.println("Salary : "+salary);
	}
}
