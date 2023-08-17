package com.basicjava.day5;

import java.util.Scanner;

public class UnaryOperator {
public static void main(String[] args) {
	int num1;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter a number: ");
	num1=scanner.nextInt();//10
//	System.out.println("num1: "+(++num1));
	++num1;
	System.out.println("num1: "+num1);//11
	--num1;
	System.out.println("num1: "+num1);//10
	num1--;
	System.out.println("num1: "+num1);//9
	num1++;
	System.out.println("num1: "+num1);//10
	num1=-1;
	System.out.println("num1: "+(-num1));
	System.out.println("num1: "+(+num1));
	scanner.close();
}
}
