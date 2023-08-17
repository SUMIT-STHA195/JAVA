package com.basicjava.day4;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		//this is logical and operator
		boolean result1 = num1>20 && num1>10; //false && false // false
		boolean result2 = num1>20 && num2>10; //false && true // false
		boolean result3 = num1<20 && num2>10; //true && true // true
		boolean result4 = num1!=20 && num1>=10;//true && true // true
		boolean result5 = num2>=20 && num1>=10;//true && true //true
		boolean result6 = num1==10 && num2==10;//true && false // false
		boolean result7 = num1<num2 && num1==10 && num2>15;//true && true && true//true
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		
		//this is logical or operator
		System.out.println("<----OR operator---->");
		boolean result8 = num1>20 || num1>10; //false || false // false
		boolean result9 = num1>20 || num2>10; //false || true // true
		boolean result10 = num1<20 || num2>10; //true || true // true
		boolean result11 = num1!=20 || num1>=10;//true || true // true
		boolean result12 = num2>=20 || num1>=10;//true || true //true
		boolean result13 = num1==10 || num2==10;//true || false // true
		boolean result14 = num1<num2 || num1==10 || num2>15;//true || true || true//true
		
		
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
		System.out.println(result11);
		System.out.println(result12);
		System.out.println(result13);
		System.out.println(result14);
		
	}
	
}
