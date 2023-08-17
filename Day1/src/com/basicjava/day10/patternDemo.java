package com.basicjava.day10;

public class patternDemo {

	public static void main(String[] args) {
		
		int i=0,k=0;
		do {
			int j = 0;
			while(j<=i)
			{
				System.out.print("* ");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}while(i<4);
		do {
			int j = 0;
			while(j<=k)
			{
				System.out.print("* ");
				j=j+1;
			}
			System.out.println();
			k=k+1;
		}while(k<4);
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
	}
}
