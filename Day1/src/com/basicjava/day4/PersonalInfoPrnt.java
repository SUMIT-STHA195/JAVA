package com.basicjava.day4;

import java.util.Scanner;

public class PersonalInfoPrnt {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First name: ");
	String firstName = scanner.nextLine();
	System.out.println("Enter Middle name: ");
	String middleName = scanner.nextLine();
	System.out.println("Enter Last name: ");
	String lastName = scanner.nextLine();
	System.out.println("Enter Roll Number: ");
	int rollNo = scanner.nextInt();
	System.out.println("Enter Age: ");
	int age = scanner.nextInt();
	System.out.println("Enter Address: ");
	scanner.nextLine();
	String address = scanner.nextLine();
	System.out.println("Enter Gender: ");
	char gender = scanner.nextLine().charAt(0);
	
	System.out.println("Student Info: ");
	System.out.println("Name: "+firstName+" "+middleName+" "+lastName);
	System.out.println("Roll Number: "+rollNo);
	System.out.println("Age :"+age);
	System.out.println("Address: "+address);
	System.out.println("Gender: "+gender);
	scanner.close();
}
}
