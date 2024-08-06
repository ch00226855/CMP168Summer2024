package week4day2;

import java.util.Arrays;

public class BinarySearchName {
	
	public static void main(String[] args) {
		Name[] names = {
			new Name("Harry", "Porter"), 
			new Name("Hermione", "Granger"), 
			new Name("Ron", "Weasley"), 
			new Name("Ginny", "Weasley"), 
			new Name("Draco", "Malfoy"), 
			new Name("Lucius", "Malfoy"),
			new Name("Albus", "Dumbledore"), 
			new Name("Lord", "Voldemort"), 
			new Name("Severus", "Snape")
		};
		Arrays.sort(names);
		System.out.println("Array:");
		System.out.println(Arrays.toString(names));
		Name target = new Name("Harry", "Porter");
		System.out.println("Index: " + binarySearch(names, target));
	}
	
	public static int binarySearch(Name[] ary, Name target) {
		return binarySearchHelper(ary, target, 0, ary.length-1);
	}
	
	private static int binarySearchHelper(Name[] ary, Name target,
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
