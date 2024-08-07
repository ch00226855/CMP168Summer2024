package week4day3;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

//		int[] testArray = { 12, 64, 25, 35, 44, 13, 57, 82, 24, 36 };
		// Create a very large array
		int arySize = 300000;
		int[] testArray = new int[arySize];
		Random rng = new Random();
		for (int i = 0; i < arySize; i++) {
			testArray[i] = rng.nextInt(1_000_000_000);
		}
		System.out.println("Before:     " + Arrays.toString(testArray));
		long start = System.currentTimeMillis();
		selectionSort(testArray);
		long end = System.currentTimeMillis();
		System.out.println("After:      " + Arrays.toString(testArray));
		System.out.printf("Time used: %.4fs.", (end - start) / 1000.0);

	}
	
	public static void selectionSort(int[] ary) {
		int minIndex;
		int temp;
		
		// Repeated swap the smallest number to the front of the array.
		for (int currIndex = 0; currIndex < ary.length; currIndex++) {
		
		// Find the smallest value in range [currIndex, length-1]
			minIndex = currIndex;
			for (int i = currIndex + 1; i < ary.length; i++) {
				if (ary[minIndex] > ary[i]) {
					minIndex = i;
				}
			}
		
		// Swap the smallest value with value at currIndex.
			temp = ary[currIndex];
			ary[currIndex] = ary[minIndex]; // Assign the min to currIndex
			ary[minIndex] = temp;
			
//			System.out.println("Iteration " + currIndex + ":" + 
//					Arrays.toString(ary));
		}
	}
	
	public static void selectionSortRecursion(int[] ary) {
		selectionSortRecursionHelper(ary, 0);
	}
	
	public static void selectionSortRecursionHelper(int[] ary, int currIndex) {
		
		// Base case:
		if (currIndex >= ary.length-1) {
			return;
		}
		
		// General case:
		// Find the smallest value in range [currIndex, length-1]
		int minIndex = currIndex;
		for (int i = currIndex + 1; i < ary.length; i++) {
			if (ary[minIndex] > ary[i]) {
				minIndex = i;
			}
		}
		
		// Swap the smallest value with value at currIndex.
		int temp = ary[currIndex];
		ary[currIndex] = ary[minIndex]; // Assign the min to currIndex
		ary[minIndex] = temp;
		
//		System.out.println(Arrays.toString(ary));
		// Make a recursive call to handle the rest of the array.
		selectionSortRecursionHelper(ary, ++currIndex);
	}

}
