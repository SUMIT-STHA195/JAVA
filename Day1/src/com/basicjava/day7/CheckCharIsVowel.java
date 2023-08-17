package com.basicjava.day7;

import java.util.Scanner;

public class CheckCharIsVowel {

	public static void main(String[] args) {
		char alpha;
		System.out.println("Enter a character: ");
		Scanner scanner =new Scanner(System.in);
//		String srcString= scanner.nextLine();
//		alpha =srcString.charAt(0);  SAME AS BELOW
		
		alpha=scanner.nextLine().charAt(0);
		
//		alpha=scanner.nextLine().toLowerCase().charAt(0);
//		System.out.println(alpha);    IT CONVERTS CHARACTER TO LOWERCASE
		
		if(alpha=='A' || alpha=='a'|| alpha=='E' || alpha=='e'|| alpha=='I' || alpha=='i'|| alpha=='O' || alpha=='o'|| alpha=='U' || alpha=='u')
		{
			System.out.println("Vowel");
		}
//		else if(alpha=='E' || alpha=='e')
//		{
//			System.out.println("Vowel");
//		}
//		else if(alpha=='I' || alpha=='i')
//		{
//			System.out.println("Vowel");
//		}
//		else if(alpha=='O' || alpha=='o')
//		{
//			System.out.println("Vowel");
//		}
//		else if(alpha=='U' || alpha=='u')
//		{
//			System.out.println("Vowel");
//		}
		else
		{
			System.out.println("Consonent");
		}
		
		//for upper and lower case
		
//		int value = (int)alpha;
//		System.out.println(value);
//		if(value>=65 && value<91)
//		{
//			System.out.println("Upper case");
//		}
//		else if(value>=97 && value<123)
//		{
//			System.out.println("Lowercase");
//		}
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println("Upper case");
		}
		else
		{
			System.out.println("Lowercase");
		}
		scanner.close();
	}
}
