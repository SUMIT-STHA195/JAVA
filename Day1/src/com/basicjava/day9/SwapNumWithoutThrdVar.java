package com.basicjava.day9;

public class SwapNumWithoutThrdVar {

	public static void main(String[] args) {
		int num1=2;
		int num2=3;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
}
