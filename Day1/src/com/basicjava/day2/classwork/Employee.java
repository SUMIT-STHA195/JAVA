package com.basicjava.day2.classwork;

public class Employee {

	public void  employeeInfo(String firstName,String middleName,String lastName,int age,double salary)
	{
		System.out.println(" First Name : "+firstName);
		System.out.println(" Middle Name : "+middleName);
		System.out.println(" Last Name : "+lastName);
		System.out.println(" Age : "+age);
		System.out.println(" Salary : "+salary);
	}
	public static void main(String[] args) {
		String firstName = "Sumit";
		String middleName = "Kumar";
		String lastName = "Shrestha";
		int age = 20;
		double salary = 40000;
		Employee employee1 = new Employee();
		employee1.employeeInfo(firstName, middleName, lastName, age, salary);
	} 
}
