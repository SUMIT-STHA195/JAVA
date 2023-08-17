package com.basicjava.day10;

public class ForLoopDemo {

	public static void main(String[] args) {
		System.out.println("even:");
		for(int i=2;i<=100;i=i+2) {
			
			System.out.print((i)+",");
		}
		System.out.println("odd:");
		for(int i=1;i<=100;i=i+2) {
			
			System.out.print((i)+",");
		}
	}
}
