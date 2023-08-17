package com.basicjava.day3;

public class StaticVariableDemo {
private static String collegeName;
private static int rollNo;
private static double amount;
private static boolean gender;
public static String phoneNo;
static int age;
//static lai method ma call garda parameter liyo ni vayo naliyo ni vayo
public static void staticInfo(String collegeName,int rollNo,double amount,boolean gender,String phoneNo,int age)
{
	System.out.println("College Name: "+StaticVariableDemo.collegeName);
	System.out.println("Roll Number : "+StaticVariableDemo.rollNo);
	System.out.println("Amount : "+StaticVariableDemo.amount);
	System.out.println("Gender(true=male and false for female): "+StaticVariableDemo.gender);
	System.out.println("phoneNo: "+StaticVariableDemo.phoneNo);
	System.out.println("age: "+StaticVariableDemo.age);
}

public static void main(String[] args) {
//	System.out.println("Default value for String: "+StaticVariableDemo.collegeName);
//	System.out.println("Default value for integer: "+StaticVariableDemo.rollNo);
//	System.out.println("Default value for double: "+StaticVariableDemo.amount);
//	System.out.println("Default value for boolean: "+StaticVariableDemo.gender);
//	System.out.println("Default value for String: "+StaticVariableDemo.phoneNo);
//	System.out.println("Default value for integer: "+StaticVariableDemo.age);
	collegeName ="Texas International College";
	rollNo = 20;
	amount = 40000.0;
	gender = true;
	phoneNo = "980000000";
	age = 23;
	StaticVariableDemo.staticInfo(collegeName,rollNo,amount,gender,phoneNo,age);
}
}
