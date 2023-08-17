package com.basicjava.day3;

import com.basicjava.day2.InstanceVariableDemo;

public class accsessFromDay2 {
	
	public static void main(String[] args) {
		
		//public variable can be accessed from outside the class,package
		InstanceVariableDemo obj = new InstanceVariableDemo();
		System.out.println(obj.email);
//		System.out.println(obj.gender);			only public variable can
//		System.out.println(obj.phoneNo);				be accessed
	}
	
}
