package week3day1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadWithException {

	public static void main(String[] args) {
		
		// Declare the file objects prior to the try block.
		FileInputStream file = null;
		Scanner scnr = null;
		
		try {
			 file = new FileInputStream("src/tem.txt");
			 scnr = new Scanner(file);
			
			System.out.println(scnr.nextLine());
			
			// Cannot put the close statements here because they may not get executed.
//			file.close();
//			scnr.close();
//			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {// The finally block will always be executed.
			if (file != null && scnr!= null) {
				try {
					file.close();
					scnr.close();
				} catch (IOException err) {
					System.out.println(err.getMessage());
				}
			}
		}
		
		System.out.println("Done.");

	}

}
