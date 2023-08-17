package com.basicjava.day8;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		int value;
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the value for displaying multiplication table:");
		value=scanner.nextInt();
		do {
			//block
			int multValue=value*(count+1);
			System.out.println(value+"*"+(count+1)+"="+multValue);
			count+=1;
		}while(count<10);
		scanner.close();
	}
}
