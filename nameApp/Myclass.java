package nameApp;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter age ");
		int age = input.nextInt();
		
		System.out.print("Enter the average hours of sleep per day ");
		double sleep = input.nextDouble();
		
		double roundedSleep = Math.round(sleep * 10.0 )/ 10.0;
		
		System.out.format("Name : %s %s%n", firstName, lastName);
		System.out.format("Age : %d years%n", age);
		System.out.format("Sleep : %.1f hours/day%n", roundedSleep);
		
		input.close();				
	}

}
