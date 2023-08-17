package com.basicjava.day7;

import java.util.Scanner;

//Write a java program to simulate the ATM machine and perform below cases:
//	1. USer should allows to deposit, withdraw
//	2. If balance ==0, display the message as not sufficient balance
//	3. If balance > 500,  allows to withdraw
//	4. Display the remaining balance after performing above transaction
public class ClassAssignmetATM {
   
	static double balance=2000;
	private static void depoAmt(Scanner scanner) {
		System.out.println("Please enter the amt you want to withdraw:");
		double depoAmt=scanner.nextDouble();
		balance= balance + depoAmt;
		System.out.println("Deposite Successful.");
	}
	private static void withDrwAmt(Scanner scanner) {
		System.out.println("Please enter the amt you want to withdraw:");
		double withDrwAmt=scanner.nextDouble();
		if(balance>500 && withDrwAmt>500) {
			balance=balance-withDrwAmt;
			System.out.println("Withdraw Successsfull. Amount withdrew: Rs. "+withDrwAmt);
		}
		else
		{
			System.out.println("Insufficient Balance (less than Rs. 500)");
		}
	}
	private static void dispBalance() {
		System.out.println("Your Balance is: Rs. "+balance);
	}
	
	public static void dispMenu(Scanner scanner) {
		System.out.println("Press 1 to deposite.");
		System.out.println("Press 2 to withdraw.");
		System.out.println("Press 3 to check balance.");
		System.out.println("Press 4 to exit.");
		
		System.out.println("Enter your choice:");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			depoAmt(scanner);
			dispBalance();
		}
		else if(choice==2)
		{
			withDrwAmt(scanner);
			dispBalance();
		}
		else if(choice==3) {
			dispBalance();
		}
		else if(choice==4) {
			return;
		}
		else {
			System.out.println("Invalid choice.");
		}
	}
	public static void main(String[] args) {
	
	Scanner scanner= new Scanner(System.in);
	dispMenu(scanner);	
}
}
