package com.basicjava.day2;

public class InstanceVariableDemo {
	
	private String name;
	private double salary;
	private int age;
	protected char gender;
	public String email;
	String phoneNo;
	public void display() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(email);
		System.out.println(phoneNo);
	}
	public static void main(String[] args) {
//		System.out.println(name); java does not allow non-static in static 
		InstanceVariableDemo instanceVariable = new InstanceVariableDemo();
		System.out.println("Default value for instance variable set by JAVA");
		instanceVariable.display();

		//		OR
		System.out.println();
		System.out.println(instanceVariable.name);
		System.out.println(instanceVariable.salary);
		System.out.println(instanceVariable.age);
		System.out.println(instanceVariable.gender);
		System.out.println(instanceVariable.email);
		System.out.println(instanceVariable.phoneNo);
		
	}
}
