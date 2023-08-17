package com.basicjava.day7;

import java.util.Scanner;

public class SwitchAssign {
public static void displayDay(Scanner scanner) {
	System.out.println("Enter a number from 1 to 7:");
	int choice=scanner.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5:
		System.out.println("Thursday");
		break;
	case 6:
		System.out.println("Friday");
		break;
	case 7:
		System.out.println("Saturday");
		break;
		default:
			System.out.println("Invalid Choice");
	}
	
	
}
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	displayDay(scanner);
	scanner.close();
}
}
