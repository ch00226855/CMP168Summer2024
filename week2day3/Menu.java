package week2day3;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	
	private static Course[] courses = new Course[10];
	private static int numCourses;

	public static void main(String[] args) {
		// Demonstrate how to create a menu system in the console.
		boolean exit = false;
		Scanner scnr = new Scanner(System.in);
		int userOption; 
		
		while (!exit) {
		
			// Display a static menu
			System.out.println("***************************");
			System.out.println("* 1. Create a new course  *");
			System.out.println("* 2. Create a new faculty *");
			System.out.println("* 3. Create a new staff   *");
			System.out.println("* 4. Create a new student *");
			System.out.println("* 0. Exit                 *");
			System.out.println("***************************");
			
			// Ask the user for an option.
			
			System.out.println("Please choose an option:");
			userOption = scnr.nextInt();
			
			// Respond to the option:
			switch (userOption) {
			case 1:
				createCourse(scnr);
				break;
			case 2:
				createFaculty();
				break;
			case 3:
				createStaff();
				break;
			case 4:
				createStudent();
				break;
			case 0:
				exit = true;
				break;
			default:
				System.out.println("Invalid option: " + userOption);
			}
		}
		
		///////////////Test//////////////////
		System.out.println(Arrays.toString(courses));
		
		scnr.close();
		System.out.println("Program finished. Thank you for using our product.");
	}
	
	public static void createCourse(Scanner scnr) {
		// Ask the user for the attributes of the new course.
		System.out.println("Creating a new course...");
		
		System.out.println("Please enter the course number:");
		int courseNum = scnr.nextInt();
		scnr.nextLine(); // exhaust the rest of the line.
		
		System.out.println("Please enter the course department:");
		String courseDept = scnr.next();
		scnr.nextLine();
		
		System.out.println("Please enter the number of credits:");
		int numCredits = scnr.nextInt();
		scnr.nextLine();
		
		System.out.println("Please indicate whether this is a graudate course (Y/N):");
		char response = scnr.nextLine().charAt(0);
		boolean isGraduateCourse = (response == 'Y') ? true : false;
		
		// Create a new course object
		Course c = new Course(isGraduateCourse, courseNum,
							courseDept, numCredits);
		
		// Add the course object to the course array.
		if (numCourses == courses.length - 1) {
			System.out.println("Database is full. Failed to add a new course.");
		} else {
			courses[numCourses] = c;
			numCourses++;
		}
	}
	
	public static void createFaculty() {
		System.out.println("A new faculty is created.");
	}
	
	public static void createStaff() {
		System.out.println("A new staff is created.");
	}
	
	public static void createStudent() {
		System.out.println("A new student is created.");
	}

}
