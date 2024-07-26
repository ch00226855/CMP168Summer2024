package week2day3;

import java.util.Scanner;

public class ExceptionDemo {
	
	private static int count = 0;

	public static void main(String[] args) {
		// OutOfMemoryError
//		int num = 1_000_000_000;
//		Scanner[] ary = new Scanner[num];
//		for (int i = 0; i < num; i++) {
//			ary[i] = new Scanner(System.in);
//			if (i % 1000 == 0) {
//				System.out.println(i + " scanners created.");
//			}
//		}
		
		// StackOverFlowError
//		recursiveMethod();
		
		// ArrayIndexOutOfBoundsException
//		int[] ary = {1, 2, 3, 4, 5};
//		System.out.println(ary[10]);

		// ArithmeticException
//		System.out.println(5 / 0);
		
		// NullPointerException
//		Scanner obj = null;
//		System.out.println(obj.nextInt());
		
//		String[] ary = new String[10];
//		System.out.println(ary[0].toLowerCase());
		
		// ClassCastException
//		Double num = 1.234;
//		System.out.println((String)num);
		
		// IllegalArgumentException
//		recursiveMethod(1.23);
	}
	
	public static void recursiveMethod() {
		System.out.println("The recursive method calls itself: " + count);
		count++;
		recursiveMethod();
		System.out.println("The method call completed.");
	}

}
