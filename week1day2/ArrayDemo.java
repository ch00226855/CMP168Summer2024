package week1day2;

public class ArrayDemo {

	public static void main(String[] args) {
		// Iterate through an array
		int[] grades = {50, 60, 70, 80, 90};
		
		for (int i=0; i < grades.length; i++) {
			// use grades[i] to go through all elements.
			System.out.println(grades[i]);
		}

		// Print the value like this: 50, 60, 70, 80, 90
		for (int i=0; i < grades.length; i++) {
			// use grades[i] to go through all elements.
			
			// If the value is not the last value, add ", "
			if (i != grades.length - 1) {
				System.out.print(grades[i] + ", ");
			} else {
			// If the value is the last value, just print the number.
				System.out.print(grades[i]);
			}	
		}
		
		System.out.println();
		
		// Alternatively:
		for (int i = 0; i < grades.length; i++) {
			
			if (i == grades.length - 1) {
				System.out.print(grades[i]);
			} else {
				System.out.print(grades[i] + ", ");
			}
		}
		System.out.println();
		
		// Print all grades in reverse order.
		for (int i = grades.length - 1; i >= 0; i--) {
		    System.out.println(grades[i]);
		}
	}

}
