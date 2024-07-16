package week1day2;

public class ArrayRisizing {

	public static void main(String[] args) {
		
		// Let's start with a full array
		int[] numbers = {0, 1, 2, 3, 4, 5};
		int length = 6;
		
		// What if we want to add a new number to the array?
		// Step 1: Create a longer array
		int[] numbersNew = new int[12];
		
		// Step 2: Copy all the existing number here
		for (int i = 0; i < length; i++) {
			numbersNew[i] = numbers[i];
		}
		
		// Step 3: Add the new number
		numbersNew[length] = 6;
		length++;
		
		// Step 4: Replace the old array with the new array.
		numbers = numbersNew;
		
		// Verify that 6 is indeed included in numbers
		System.out.println(numbers[6]);
		
		// The old array will be removed from memory by Java's
		// garbage collection mechanism.
	}

}
