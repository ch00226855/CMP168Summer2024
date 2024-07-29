package week3day1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	// Load everything from temp.txt, and write the strings to another file.
	public static void main(String[] args) throws IOException {
		
		FileInputStream file1 = new FileInputStream("src/temp.txt");
		Scanner scnr = new Scanner(file1);
		
		FileOutputStream file2 = new FileOutputStream("src/records.txt");
		PrintWriter pw = new PrintWriter(file2);
		
		String line;
		int lineNum = 0;
		
		while (scnr.hasNext()) {
			line = scnr.nextLine();
			pw.println(lineNum + ": " + line);
			lineNum++;
		}
		
		pw.flush(); // Force the buffered texts to be written to the file.
		
		file1.close();
		file2.close();
		scnr.close();
		pw.close();

	}

}
