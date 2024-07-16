package week1day2;

public class OversizedArray {

	public static void main(String[] args) {
		
		String[] students = new String[10]; 
		// The array can contain 10 strings
		
		int numStudents = 3;
		students[0] = "Alex";
		students[1] = "Bob";
		students[2] = "Charlene";
		// Assign 3 strings to the array.
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// Because 7 slots are empty. They are displayed as "null"

		// A better way to print names
		for (int i = 0; i < numStudents; i++) {
			System.out.println(students[i]);
		}
		
		// Oversize arrays allows further additions
		students[3] = "David";
		numStudents++;
		for (int i = 0; i < numStudents; i++) {
			System.out.println(students[i]);
		}
		
		// We can actually use numStudents to refer to the next
		// empty slot.
		students[numStudents] = "Eva";
		numStudents++;
		for (int i = 0; i < numStudents; i++) {
			System.out.println(students[i]);
		}
		
	}

}
