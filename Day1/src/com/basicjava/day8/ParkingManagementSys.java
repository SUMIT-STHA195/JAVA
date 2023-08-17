package com.basicjava.day8;

import java.util.Scanner;

public class ParkingManagementSys {
static int bikeTotalSpace=100;
static int carTotalSpace=80;
static int bikeSpaceAvailable=20;
static int carSpaceAvailable=30;

private static void parkIn(Scanner scanner) {
	System.out.println("Press 1 to park bike");
	System.out.println("Press 2 to park car");
	int choice =scanner.nextInt();
	if(choice==1) {
		if(bikeSpaceAvailable!=0) {
			bikeSpaceAvailable=bikeSpaceAvailable-1;
			System.out.println("Parked Successfully.");
		}
		else {
			System.out.println("No space available.");
		}
	}
	else if(choice==2) {
		if(carSpaceAvailable!=0) {
			carSpaceAvailable=carSpaceAvailable-1;
			System.out.println("Parked Successfully.");
		}
		else {
			System.out.println("No space available.");
		}
	}
}
private static void parkOut(Scanner scanner) {
	System.out.println("Press 1 ");
}

public static void displayMenu(Scanner scanner) {
	System.out.println("1. In Parking");
	System.out.println("2. Out Parking");
	System.out.println("3. Display available parking lot.");
	System.out.println("4. Exit");
	int choice= scanner.nextInt();
	switch(choice) {
	case 1:
		parkIn(scanner);
		break;
	case 2:
		parkOut(scanner);
		break;
	case 3:
//		dispAvailableSpace();
		break;
	case 4: 
		return;
//		break;
		default:
			System.out.println("Invalid Choice");
	
	}
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	displayMenu(scanner);
	scanner.close();
}
}
