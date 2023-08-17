package com.basicjava.day5;


public class RelationOperator {
	public static void isEqualTo(int num1,int num2) {
		boolean result=num1==num2;
		System.out.println("Result: "+result);
	}
	public static void isNotEqualTo(int num1,int num2) {
		boolean result=num1!=num2;
		System.out.println("Result: "+result);
	}
	public static void isGreater(int num1,int num2) {
		boolean result=num1>num2;
		System.out.println("Result: "+result);
	}
	public static boolean isLess(int num1,int num2) {
		boolean result= num1<num2;
		return result;
	}
	public void isGreaterEqualTo(int num1,int num2) {
		boolean result=num1>=num2;
		System.out.println("Result: "+result);
	}
	public void isLessEqualTo(int num1,int num2) {
		boolean result=num1<=num2;
		System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		int num1=10,num2=20;
		RelationOperator obj = new RelationOperator();
		RelationOperator.isEqualTo(num1, num2);
		RelationOperator.isNotEqualTo(num1, num2);
		RelationOperator.isGreater(num1, num2);
		System.out.println("Result: "+RelationOperator.isLess(num1, num2));
		obj.isGreaterEqualTo(num1, num2);
		obj.isLessEqualTo(num1, num2);
	}
}
