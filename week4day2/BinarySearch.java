package week4day2;

public class BinarySearch {

	public static void main(String[] args) {
		int[] testArray = {0, 1, 4, 8, 10, 24, 38, 65, 79, 100};
		int target = 55;
		System.out.println("Index: " + binarySearch(testArray, target));
	}
	
	// Returns the index of target in ary.
	public static int binarySearch(int[] ary, int target) {
		return binarySearchHelper(ary, target, 0, ary.length-1);
	}
	
	// Returns the index of target between ary[lowVal] and ary[highVal].
	private static int binarySearchHelper(int[] ary, int target, 
										int lowVal, int highVal) {
		// Base case: lowVal > highVal
		if (lowVal > highVal) {
			return -1;
		}
		
		// General case:
		// 1. Compare target with the middle element
		// 2. If they are equal, return the index of the middle element.
		// 3. If target < middle element, make a recursive call for the lower half range
		// 4. If target > middle element, make a recursive call for the upper half range.
		int middleIndex = (lowVal + highVal) / 2;
		System.out.printf("Searching in the range: %d - %d\n", lowVal, highVal);
		System.out.println("The middle value is: " + ary[middleIndex]);
		if (target == ary[middleIndex]) {
			System.out.println("Target is found at index: " + middleIndex);
			return middleIndex;
		} else if (target < ary[middleIndex]) {
			System.out.println("target < middle value, continue searching...");
			return binarySearchHelper(ary, target, lowVal, middleIndex-1);
		} else {// target > ary[middleIndex]
			System.out.println("target > middle value, continue searching...");
			return binarySearchHelper(ary, target, middleIndex+1, highVal);
		}
	}

}
