package com.basicjava.day5;

import java.util.Scanner;

public class SimpleIfStatement {
public static void main(String[] args) {
	//simple
	//if(condition){
//	}
	int num;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter a number: ");
	num=scanner.nextInt();
	if(num%2==0)
	{
		System.out.println(num+" is even.");
	}
	String name;
	String expectedName="Ram";
	System.out.println("Please enter a string: ");
	scanner.nextLine();
	name=scanner.nextLine();
	
	if(name.equals(expectedName))
	{
		System.out.println("String matched.");
	}
	scanner.close();
}
}
