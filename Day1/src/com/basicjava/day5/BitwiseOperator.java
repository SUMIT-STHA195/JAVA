package com.basicjava.day5;

public class BitwiseOperator {

	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		int result=num1&num2;
		System.out.println("Bitwise AND: "+result);//4
	    result=num1|num2;
	    System.out.println("Bitwise OR: "+result);//5
	    result=num1^num2;
	    System.out.println("Bitwise XOR: "+result);//1
	    result=~1;
	    System.out.println("Bitwise unary NOT: "+result);//10
	}
	
}
