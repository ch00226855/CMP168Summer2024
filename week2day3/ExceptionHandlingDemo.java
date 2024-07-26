package week2day3;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		// Handle index out of bound
		String[] ary = {"A", "B", "C", "D"};
		try {
			System.out.println(ary[0]);
			System.out.println(ary[3]);
//			System.out.println(ary[5]);
//			System.out.println(5 / 0);
			// Create our own exception object
			System.out.println("Generating a new exception...");
//			Exception err = new Exception("Toy exception");
//			throw err;
			throw new Exception("Another toy exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds.");
		} catch (ArithmeticException e) {
			System.out.println("The arithmetic doen't look right...");
		} catch (Exception e) {
			// Standard approach 1: display the error message
			System.err.println(e.getMessage());
			// Standard approach 2: indicate the location of the exception
			e.printStackTrace();
		}
		
		// Generate a Person with negative weight.
		System.out.println("========================");
		try {
			Person p1 = new Person("John", 1245, 34, -10.0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		// Keep ask the user for the valid weight value.
		Scanner scnr = new Scanner(System.in);
		boolean objectCreated = false;
		Person p1;
		double weight;
		
		while (!objectCreated) {
			try {
				System.out.println("Please enter a weight value:");
				weight = scnr.nextDouble();
				p1 = new Person("John", 1245, 34, weight);
				objectCreated = true;
			} catch (NegativeWeightException e) {
				System.out.println("Invalid value, enter again.");
				scnr.nextLine(); // Exhaust the invalid input.
			}
		}
		
		scnr.close();
		System.out.println("The program ends properly.");

	}

}
