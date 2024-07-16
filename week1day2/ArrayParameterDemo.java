package week1day2;

public class ArrayParameterDemo {
	
	public static void printArray(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
	}
	
	public static void doubleArrayValues(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			ary[i] *= 2; // double the current value.
		}
	}
	
	public static void doubleValue(int x) {
		x *= 2;
	}
	

	public static void main(String[] args) {
		
		int[] ages = {18, 24, 35, 30, 42};
		int[] grades = {100, 95, 97, 79};
		
		printArray(ages);
		printArray(grades);
		
		doubleArrayValues(ages);
		printArray(ages);
		
		// It doesn't work for primitive variables
		int age = 18;
		System.out.println(age);
		doubleValue(18);
		System.out.println(age);
		
		int[] numbers = {0, 1, 2, 3, 4};
		int[] ary = numbers;
		numbers[0] = 100;
		System.out.println(ary[0]); // 0? or 100?
		
		// Because numbers only stores the reference (address) of the array.
		// "ary = numbers" assigns the same array to ary
		// Modifying numbers also modifies ary.
	}

}
