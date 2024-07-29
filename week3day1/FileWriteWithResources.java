package week3day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteWithResources {

	public static void main(String[] args) {
		
		String str;
		
		try (FileInputStream file1 = new FileInputStream("src/temp.txt");
				Scanner scnr = new Scanner(file1);
				FileOutputStream file2 = new FileOutputStream("src/records3.txt", true);
				PrintWriter pw = new PrintWriter(file2)) {
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
		}
		
		System.out.println("Done.");

	}

}
