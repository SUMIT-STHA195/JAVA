package com.basicjava.day3;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int num1 = 34;
		double intToDouble=num1;//Widening typecasting
		System.out.println("Original number : "+num1);
		System.out.println("After performing WTC : "+intToDouble);		
		
		// narrowng type casting
		double num2=567.78900;
		int doubleToInt= (int) num2;
		System.out.println("Original number : "+num2);
		System.out.println("After performing NTC : "+doubleToInt);
		
		//String conversion
		String data = "300";
		int stringToInt = Integer.valueOf(data);
		System.out.println("Original Data: "+data);
		System.out.println("After performing StringToInt: "+stringToInt);
		
		double salary = 4567.5678;
		String doubleToString = String.valueOf(salary);
		System.out.println("Original Data: "+salary);
		System.out.println("After performing DoubleToString: "+doubleToString);
		
		Double income = 4567.567;
		double DoubleTodouble = income.doubleValue();
		System.out.println("Original Data: "+income);
		System.out.println("After performing DoubleTodouble: "+DoubleTodouble);
		
		String incomeData = "345698.898";
		double dataResult= Double.parseDouble(incomeData);
		System.out.println("Original Data: "+incomeData);
		System.out.println("After performing StringTodouble: "+dataResult);
	}
	
}
