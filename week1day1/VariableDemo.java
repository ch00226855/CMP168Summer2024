package week1day1;

import java.util.Scanner;

public class VariableDemo {

	public static void main(String[] args) {
		
		int i; // variable declaration
		i = 1; // variable assignment
		
		boolean j = true;
		boolean k = false;
		
		System.out.println(j);
		System.out.println(k);
		
		String name = "Liang";
		
		// Create a scanner object watching input resource
		System.out.println("Please enter something:");
		Scanner scnr = new Scanner(System.in); 
		String userInput = scnr.nextLine();
		System.out.println(userInput);
		
		userInput = scnr.nextLine();
		System.out.println(userInput);
		scnr.close();
		
		// Can a variable name start with $?
		int $name = 123;
		System.out.println($name);
	}

}
