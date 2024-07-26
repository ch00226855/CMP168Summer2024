package week2day3;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alex", 1234);
		Person p2 = new Person("Bob", 4321);
		Person p3 = new Person("Clare", 5678);
		Person p4 = new Person("David", 1357);
		Person p5 = new Person("Edward", 3579);
		
		Person[] ary = {p1, p2, p3, p4, p5};
		
		System.out.println(p1.compareTo(p2));
		System.out.println(p3.compareTo(p4));
		
		// Sort the array using Arrays.sort()
		System.out.println("Before: " + Arrays.toString(ary));
		Arrays.sort(ary);
		System.out.println("After: " + Arrays.toString(ary));

		// Create a Person with negative age
		Person p6 = new Person("Fred", 7654, -24);
	}

}
