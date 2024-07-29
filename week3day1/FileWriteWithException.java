package week3day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteWithException {
	
	public static void main(String[] args) {
		
		FileInputStream file1 = null;
		Scanner scnr = null;
		
		FileOutputStream file2 = null;
		PrintWriter pw = null;
		
		String str;
		
		try {
			file1 = new FileInputStream("src/temp.txt");
			scnr = new Scanner(file1);
			file2 = new FileOutputStream("src/records2.txt");
			pw = new PrintWriter(file2);
			
			pw.println("----------------------------------------------------------------");
			
			while (scnr.hasNext()) {
				str = scnr.nextLine();
				pw.printf("| %-60s |\n", str);
			}
			pw.println("----------------------------------------------------------------");
			pw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (scnr != null) {
				scnr.close();
			}
			
			if (pw != null) {
				pw.close();
			}
			
			if (file1 != null) {
				try {
					file1.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			
			if (file2 != null) {
				try {
					file2.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("Done");
		}
		
		
		
	}

}
