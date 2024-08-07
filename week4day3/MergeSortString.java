package week4day3;

import java.util.Arrays;

public class MergeSortString {

	public static void main(String[] args) {
		String[] testArray = {"McDonald's", "Burger King",
				"Chipotle", "Papa John's", "Domino's", 
				"Chick-fil-A", "Shake Shack", "Starbucks",
				"KFC", "Wendy's", "Panda Express"};
		System.out.println("Before: " + Arrays.toString(testArray));
		mergeSort(testArray);
		System.out.println("After:  " + Arrays.toString(testArray));
		
	}
	
	public static void mergeSort(String[] ary) {
		mergeSortHelper(ary, 0, ary.length-1);
	}
	
	// The helper method will sort ary between lowIndex and highIndex.
		public static void mergeSortHelper(String[] ary, int lowIndex, int highIndex) {
			
			// Base case: There is 0, 1, 2 elements in the range.
			if (lowIndex >= highIndex) {// 0 or 1 element in the range
				return;
			}
			
			if (highIndex == lowIndex + 1) {// 2 elements in the range
				if (ary[lowIndex].compareTo(ary[highIndex]) > 0) {
					String temp = ary[lowIndex];
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
			String[] tempAry = new String[highIndex - lowIndex + 1];
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
				} else if (ary[leftIndex].compareTo(ary[rightIndex]) < 0) {
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
			System.out.printf("Sort between %d to %d:\n", lowIndex, highIndex);
			System.out.println(Arrays.toString(ary));
		}
}
