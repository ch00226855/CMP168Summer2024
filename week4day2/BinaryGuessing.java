package week4day2;

import java.util.Scanner;

public class BinaryGuessing {

	public static void main(String[] args) {
		
		System.out.println("Please pick a number between 0 and 1000:");
		Scanner scnr = new Scanner(System.in);
		guessNumber(0, 1000, scnr);
	}
	
	public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
		// Base case: lowVal > highVal
		if (lowVal > highVal) {
			System.out.println("There is no possible number!");
			return;
		}
		
		int guess = (lowVal + highVal) / 2;
		System.out.println("Is your number: " + guess + "?");
		System.out.println("Please answer Yes/Lower/Higher.");
		String response = scnr.nextLine();
		
		switch(response) {
		case "Yes":
			System.out.println("Nice!");
			break;
		case "Lower":
			guessNumber(lowVal, guess-1, scnr);
			break;
		case "Higher":
			guessNumber(guess+1, highVal, scnr);
			break;
		default:
			System.out.println("Invalid input.");
		}
	}

}
