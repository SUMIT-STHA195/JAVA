package com.basicjava.day4;

public class AssignmentOperatorDemo {
public static void main(String[] args) {
	
	//simple assignment operator
	int num1 = 10;
	int num2 = 20;
	int result = num1+num2;
	System.out.println("Result: "+result);
	
//	+= (Add and assignment operator)
	num2 +=num1;//num2=num2+num1 //num2=20+10=30
	System.out.println("num2: "+num2);
	
//	-= (Subtract and assignment operator)
	num1 -=num2;//num1=num1-num2 //num1=10-30=-20
	System.out.println("num2: "+num1);
	
//	*= (Multiply and assignment operator)
	num2 *=num1;//num2=num2*num1 //num2=30*-20
	System.out.println("num2: "+num2);
	
//	/= (Divide and assignment operator)
	num2 /=num1;//num2=num2/num1 //num2=-600/-20
	System.out.println("num2: "+num2);
	
//	%= (Modulus and assignment operator)
	num2 %=num1;//num2=num2%num1 //num2=30%-20
	System.out.println("num2: "+num2);
	
}
}
