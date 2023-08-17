package com.basicjava.day10;
//A pascal number is a number that is sum of 1 to j
//For eg: 6 is a pascal number because 1+2+3 Here j=3
//15 is a pascal number because 1+2+3+4+5 Here j=5
//Write a fuction named isPascal thah returns 1 if its integer argument is pascal number.

import java.util.Scanner;

public class TraineeQuestion2 {
public static int isPascal(int num,int j) {
	int sum=0;
	for(int i=1;i<=j;i++) {
		sum=sum+i;
	}
	if(sum==num) {
		return 1;
	}
	else
	{
		return 0;
	}
}
public static void main(String[] args) {
	int j,num;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=scanner.nextInt();
	System.out.println("Enter the value of j:");
	j=scanner.nextInt();
	int value=isPascal(num,j);
	if(value==1) {
		System.out.println("Pascal number.");
	}else {
		System.out.println("Not a pacal number.");
	}
	scanner.close();
}
}
