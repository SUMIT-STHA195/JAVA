package com.basicjava.day9;

public class SwapTwoStringsDemo {

	public static void main(String[] args) {
		String string1="Ram";
		String string2="Shyam";
		String tempString;
		tempString=string1;
		string1=string2;
		string2=tempString;
		System.out.println("String1: "+string1);
		System.out.println("String2: "+string2);
	}
}
