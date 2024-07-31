package week3day2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Alex");
		names.add("Bob");
		names.add("Clare");
		names.add("Doug");
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println(names.size());
		
		names.add("Eve");
		System.out.println(names.size());
		
		names.add(3, "Fred");
		names.remove("Doug");
		
		// Go through all elements in an arraylist
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
