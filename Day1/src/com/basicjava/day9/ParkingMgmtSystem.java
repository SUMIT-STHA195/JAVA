package com.basicjava.day9;

import java.util.Scanner;

public class ParkingMgmtSystem {
  private static int totalCapacityCar=100;
  private static int totalCapacityBike=200;
  private static int availableSpaceCar=50;
  private static int availableSpaceBike=100;
  private static int token1=100,token2=101;
  private static int userCar,userBike;
    private static void parkIn(Scanner scanner) {
    	System.out.println("Press 1 to park car.");
    	System.out.println("Press 2 to park bike.");
    	System.out.println("Enter your choice: ");
    	int choice= scanner.nextInt();
    	switch(choice) {
    	case 1:
    		if(availableSpaceCar!=0) {
    			availableSpaceCar=availableSpaceCar-1;
    			System.out.println("Parked successfully and your token number is "+token1);
    			userCar=token1;
//    			token++;
    		}
    		else {
    			System.out.println("No space available.");
    		}
    		break;
    	case 2:
    		if(availableSpaceBike!=0) {
    			availableSpaceBike=availableSpaceBike-1;
    			System.out.println("Parked successfully and your token number is "+token2);
    			userBike=token2;
//    			token++;
    		}
    		else {
    			System.out.println("No space available.");
    			
    		}
    		break;
    	}
    	
    }
    private static void parkOut(Scanner scanner) {
    	System.out.println("Enter the token number: ");
    	int tokNum=scanner.nextInt();
    	if(tokNum==userCar) {
    		System.out.println("You may take your Car");
    		availableSpaceCar=availableSpaceCar+1;
			System.out.println("Parked Out Successfully");
    	}
    	else if(tokNum==userBike) {
    		System.out.println("You may take your bike");
    		availableSpaceBike=availableSpaceBike+1;
			System.out.println("Parked Out Successfully");
    	}
    	else if(tokNum!=userCar && tokNum!=userBike){
    		System.out.println("No vehicle parked");
    	}
    }
    public static void display() { 
    	System.out.println("Available space for car is "+availableSpaceCar);
    	System.out.println("Available space for bike is "+availableSpaceBike);
    }
    
	public static void dispMenu(Scanner scanner) {
		System.out.println("1. In Parking");
		System.out.println("2. Park Out");
		System.out.println("3. Display");
		System.out.println("4. Exit");
		int flag=1;
		while(flag==1) {
		System.out.println("Enter your choice: ");
		int choice= scanner.nextInt();
		switch(choice)
		{
		case 1:
			parkIn(scanner);
			break;
		case 2:
			parkOut(scanner);
			break;
		case 3:
			display();
			break;
		case 4:
			flag=0;
			break;
			default:
				System.out.println("Invalid option");
		}
		}
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	dispMenu(scanner);
	scanner.close();
}
	
}
