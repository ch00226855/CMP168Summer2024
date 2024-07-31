package week3day2;

public class Demo2DArray {

	public static void main(String[] args) {
		
		// Create a 3x4 2D array.
		String[][] names = new String[3][4];
		
		names[0][0] = "Alex";
		names[0][1] = "Bob";
		names[0][2] = "Clare";
		names[0][3] = "Doug";
		names[1][0] = "Eve";
		names[1][1] = "Fred";
		names[1][2] = "Gill";
		names[1][3] = "Harold";
		names[2][0] = "Icarus";
		names[2][1] = "Jill";
		names[2][2] = "Kepler";
		names[2][3] = "Leo";
		
		// Print all strings 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				// print names[i][j]
				System.out.println(names[i][j]);
			}
		}
		
		System.out.println("---------------------------");
		
		// Create a 2D array with rows of different sizes.
		String[] row1 = {"Alex", "Bob", "Clare", "Doug"};
		String[] row2 = {"Eve", "Fred"};
		String[] row3 = {"Icarus", "Jill", "Kepler"};
		String[][] names2 = {row1, row2, row3}; // A 2D array is just an array of arrays.
		
		// Print all strings 
			for (int i = 0; i < names2.length; i++) {
				for (int j = 0; j < names2[i].length; j++) {
					// print names[i][j]
					System.out.println(names2[i][j]);
				}
			}

	}

}
