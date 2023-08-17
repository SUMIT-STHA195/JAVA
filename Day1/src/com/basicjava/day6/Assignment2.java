package com.basicjava.day6;

import java.util.Scanner;

public class Assignment2 {
//find the result in five subject
	public static void main(String[] args) {
		int sub1,sub2,sub3,sub4,sub5;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter marks in five subject: ");
		sub1=scanner.nextInt();
		sub2=scanner.nextInt();
		sub3=scanner.nextInt();
		sub4=scanner.nextInt();
		sub5=scanner.nextInt();
		int sum=sub1+sub2+sub3+sub4+sub5;
		float percentage=((float)sum/500)*100;
		String message;
		if(percentage>=40)
		{
		 message=(percentage<50)?"Third division":(percentage>=50 && percentage<60)?"second division":(percentage>=60 && percentage<80)?"First Div":(percentage>=80)?"Distinction":"";
		 System.out.println(message);
		}
//		System.out.println(percentage);
//		if(percentage>=40 && percentage<50)
//		{
//			System.out.println("Passed with Third Division");
//			return;
//		}
//		if(percentage>=50 && percentage<60)
//		{
//			System.out.println("Passed with second Division");
//			return;
//		}
//		if(percentage>=60 && percentage<80)
//		{
//			System.out.println("Passed with first Division");
//			return;
//		}
//		if(percentage>=80)
//		{
//			System.out.println("Passed with Distinction");
//			return;
//		}
		else {
			System.out.println("Student has failed");
		}
		scanner.close();
	}
}
