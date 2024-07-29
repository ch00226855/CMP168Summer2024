package week3day1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadWithResources {

	public static void main(String[] args) {
		
		// Use ".." to jump outside of the current folder.
//		try (FileInputStream file = new FileInputStream("../Homework2/src/Array.java");
		try (FileInputStream file = new FileInputStream("src/temp.txt");	
				Scanner scnr = new Scanner(file))
		{
			System.out.println(scnr.nextLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
