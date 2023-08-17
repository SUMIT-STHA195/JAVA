package com.basicjava.day9;

import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		
	
	int num;
	int luckyNum=5;
	System.out.println("You can only input 3 times");
	int count=0;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("Please enter a number: ");
		num=scanner.nextInt();
		count++;
		if(num==luckyNum) {
			System.out.println();
			System.out.println("******BINGO!!!********");
			System.out.println("******Lucky Number is "+luckyNum+".******");
			scanner.close();
			return;
		}
		else 
		{
			System.out.println();
			System.out.println("<----Please try again---->");
			System.out.println();
		}
	}while(count<3);
	scanner.close();
	}
}

