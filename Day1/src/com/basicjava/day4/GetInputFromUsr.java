package com.basicjava.day4;

import java.util.Scanner;

public class GetInputFromUsr {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter a number: ");
	int num1 =scanner.nextInt();
	
	System.out.println("Entered number is :"+num1);
	scanner.close();
}
}
