package com.basicjava.day6;

public class IfElseIFLadderDemo {

	public static void main(String[] args) {
		int data =230;
		if(data > 230) {
			System.out.println("Inside the if block....");
			System.out.println(data+" is greater.");
		}
		else if(data>231) {
			System.out.println("Inside the first elseif block....");
			System.out.println(data+" is greater.");
		}
		else if(data>229) {
			System.out.println("Inside the second elseif block....");
			System.out.println(data+" is greater.");
		}
		else{
			System.out.println("Inside the  else block....");
			System.out.println("All above condition failed..");
		}
	}
}
