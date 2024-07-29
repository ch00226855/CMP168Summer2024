package week3day1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {

	// For now, let's not consider how to handle IOException.
	public static void main(String[] args) throws IOException {
		
		// Print the default folder
		System.out.println("Default directory: " + System.getProperty("user.dir"));
		
//		FileInputStream file = new FileInputStream("src/temp.txt");
		FileInputStream file = new FileInputStream("C:/Users/Liang Zhao/eclipse-workspace/CMP168/src/temp.txt");
		Scanner scnr = new Scanner(file);
		
		// Print the first line of the file.
		String line = scnr.nextLine();
		System.out.println(line);
		
		line = scnr.nextLine();
		System.out.println(line);
		
		// Load the entire file.
		while (scnr.hasNext()) {
			line = scnr.nextLine();
			System.out.println(line);
		}
		
		// It is a good practice to close file-related objects 
		// before exiting.
		file.close();
		scnr.close();
		System.out.println("Done.");
	}

}
