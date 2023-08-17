package com.basicjava.day3;

public class Operator {
	public static float add(int num1, int num2) {
		float result=num1+num2;
		return result;
	}
	public static int mult(int num1,int num2) {
		int result= num1*num2;
		return result;
	}
	public static int sub(int num1,int num2) {
		int result= num1-num2;
		return result;
	}
	public float div(int num1,int num2) {
		float result= (float)num1/num2;
		return result;
	}
	public static void mod(int num1,int num2)
	{
		System.out.println("Mod of two numer is: "+(num1%num2));
	}
	
	public static void main(String[] args) {
		int num1=10,num2=6;
		Operator obj =new Operator();
		System.out.println("Sum : "+Operator.add(num1,num2));
		System.out.println("Multiply : "+Operator.mult(num1,num2));
		System.out.println("Subtraction : "+Operator.sub(num1,num2));
		Operator.mod(num1, num2);
		System.out.println("Division : "+obj.div(num1,num2));
		
	}
}
