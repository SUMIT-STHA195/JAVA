package com.basicjava.day10;

import java.util.Scanner;

public class TraineeQuestions {
	static int count;
    public static int factorOfTwoCount(int num) {
    	while(num%2==0) {
    		num=num/2;
    		count++;
    	}
    	return count;
    }
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=scanner.nextInt();
		int count=factorOfTwoCount(num);
		System.out.println(count);
		scanner.close();
	}
}
