package com.basicjava.day9;

import java.util.Scanner;

public class ReverseInputNum {

	public static void main(String[] args) {
		int num1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an number you want to reverse:");
		num1=scanner.nextInt();
		int temp=0;
	    do {
	    	int temp2=num1%10;
	    	temp=temp*10+temp2;
	    	num1=num1/10;
	    }while(num1!=0);
	    System.out.println("Reversed number: "+temp);
//	    System.out.println(2.0%4.0);
	    scanner.close();
	}

}
