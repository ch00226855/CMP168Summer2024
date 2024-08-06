package week4day2;

import java.util.Arrays;

public class SearchDemo {
	
	public static void main(String[] args) {
		int[] testArray = {2, 7, 1, 8, 5, 4, 6, 10};
		int target = 10;
		System.out.println("Index: " + searchWithLoop(testArray, target));
		System.out.println("Index: " + searchWithRecursion(testArray, target));
		System.out.println("Index: " + searchWithRecursion2(testArray, target, 0));
	}
	
	public static int searchWithLoop(int[] ary, int target) {
		for (int i = 0; i < ary.length; i++) {
			if (target == ary[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int searchWithRecursion(int[] ary, int target) {
		// Base case: The input array is empty.
		if (ary.length == 0) {
			return -1;
		}
		
		// General case:
		// 1. Check if the first elements equals to target.
		// 2. Use a recursive call to search the rest of the array.
		if (ary[0] == target) {
			return 0;
		} else {
			// Put the rest of the array into a new array
			int[] subArray = Arrays.copyOfRange(ary, 1, ary.length);
			// Search for the target value in the new array
			int index = searchWithRecursion(subArray, target);
			// Return the index of the target in the original array
			if (index == -1) {
				return -1;
			} else {
				return index + 1;
			}
		}
	}
	
	// Search for the target value starting from startIndex
	public static int searchWithRecursion2(int[] ary, int target, int startIndex) {
		// base case: startIndex >= length
		if (startIndex >= ary.length) {
			return -1;
		}
		
		// general case: compare target with element at startIndex. 
		// If unequal, call the method with startIndex + 1.
		if (ary[startIndex] == target) {
			return startIndex;
		} else {
			return searchWithRecursion2(ary, target, startIndex + 1);
		}
	}

}
