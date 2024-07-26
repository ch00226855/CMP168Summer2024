package week2day3;

import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		try {
			int[] ary = {1, 2, 3, 4, 5, 0};
			System.out.println("Enter an index:");
			int ind = scnr.nextInt();
			int x = ary[ind];
			System.out.println(x);
			System.out.println(10 / x);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();;
		} finally {// Make sure the scanner is closed no matter what happened.
			scnr.close();
			System.out.println("Scanner is closed.");
		}
		
	}

}
