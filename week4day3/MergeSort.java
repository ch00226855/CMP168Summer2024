package week4day3;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	
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
		mergeSort(testArray);
		long end = System.currentTimeMillis();
		System.out.println("After:      " + Arrays.toString(testArray));
		System.out.printf("Time used: %.4fs.", (end - start) / 1000.0);

	}
	
	public static void mergeSort(int[] ary) {
		mergeSortHelper(ary, 0, ary.length-1);
	}
	
	// The helper method will sort ary between lowIndex and highIndex.
	public static void mergeSortHelper(int[] ary, int lowIndex, int highIndex) {
		
		// Base case: There is 0, 1, 2 elements in the range.
		if (lowIndex >= highIndex) {// 0 or 1 element in the range
			return;
		}
		
		if (highIndex == lowIndex + 1) {// 2 elements in the range
			if (ary[lowIndex] > ary[highIndex]) {
				int temp = ary[lowIndex];
				ary[lowIndex] = ary[highIndex];
				ary[highIndex] = temp;
			}
		}
		
		// General case:
		// 1. Divide the range into two halves.
		int middleIndex = (lowIndex + highIndex) / 2;
		
		// 2. Make two recursive calls to have the two halves sorted.
		mergeSortHelper(ary, lowIndex, middleIndex); // sort the lower half
		mergeSortHelper(ary, middleIndex+1, highIndex); // sort the upper half
		
		// 3. Merge them back.
		int[] tempAry = new int[highIndex - lowIndex + 1];
		int currIndex = 0;
		int leftIndex = lowIndex;
		int rightIndex = middleIndex+1;
		
		while (leftIndex <= middleIndex || rightIndex <= highIndex) {
			if (leftIndex > middleIndex) {// There is no element on the left
				tempAry[currIndex] = ary[rightIndex];
				currIndex++;
				rightIndex++;
			} else if (rightIndex > highIndex) {// No element on the right
				tempAry[currIndex] = ary[leftIndex];
				currIndex++;
				leftIndex++;
			} else if (ary[leftIndex] < ary[rightIndex]) {
				tempAry[currIndex] = ary[leftIndex];
				currIndex++;
				leftIndex++;
			} else {
				tempAry[currIndex] = ary[rightIndex];
				currIndex++;
				rightIndex++;
			}
		}		
		
		// Put the tempAry back to the original array.
		for (int i = 0; i < tempAry.length; i++) {
			ary[lowIndex + i] = tempAry[i];
		}
//		System.out.printf("Sort between %d to %d:\n", lowIndex, highIndex);
//		System.out.println(Arrays.toString(ary));
	}

}
