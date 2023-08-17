package com.basicjava.firstclass;

public class JavaConstant {
	// outside the methods --way ov declaring constant
//	static final double PI = 3.14;
	public static void main(String[] args) {
		
		// inside the methods --way ov declaring constant

		final double PI =3.14;
		if(PI >= 3.14) {
			PI =PI+1;
		}
		System.out.println("PI "+PI);
	}
	
}
