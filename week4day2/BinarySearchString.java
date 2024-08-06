package week4day2;

import java.util.Arrays;

public class BinarySearchString {

	public static void main(String[] args) {
		String[] testArray = {"McDonald's", "Burger King",
				"Chipotle", "Papa John's", "Domino's", 
				"Chick-fil-A", "Shake Shack", "Starbucks",
				"KFC", "Wendy's", "Panda Express"};
		Arrays.sort(testArray);
		System.out.println("Array: " + Arrays.toString(testArray));
		String target = "Starbucks";
		System.out.println("Index: " + binarySearch(testArray, target));
	}
	
	public static int binarySearch(String[] ary, String target) {
		return binarySearchHelper(ary, target, 0, ary.length-1);
	}
	
	private static int binarySearchHelper(String[] ary, String target,
										int lowVal, int highVal) {
		// Base case: lowVal > highVal
		if (lowVal > highVal) {
			return -1;
		}
		
		// General Case:
		int middleIndex = (lowVal + highVal) / 2;
		if (target.equals(ary[middleIndex])) {
			return middleIndex;
		} else if (target.compareTo(ary[middleIndex]) < 0) {
			return binarySearchHelper(ary, target, lowVal, middleIndex-1);
		} else {
			return binarySearchHelper(ary, target, middleIndex+1, highVal);
		}
		
	}

}
