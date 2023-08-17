package com.basicjava.day6;

import java.util.Scanner;

public class Assignment1 {

	// to find greatest among three numbers.
	public static void checkGreatest(int num1, int num2, int num3) {

		if (num1>num2 && num1>num3)
		{
			System.out.println("Greatest number is "+num1);
		}
		
	}
	
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
//		if(num1>num2 && num1>num3)
//		{
//			System.out.println("Greatest number is "+num1);
//		}
//		if(num2>num1 && num2>num3)
//		{
//			System.out.println("Greatest number is "+num2);
//		}
//		if(num3>num1 && num3>num2)
//		{
//			System.out.println("Greatest number is "+num3);
//		}
		Assignment1.checkGreatest(num1,num2,num3);//
		Assignment1.checkGreatest(num2,num1,num3); // only use one condition in method
		Assignment1.checkGreatest(num3,num2,num1);//
		scanner.close();
	}
	
}
