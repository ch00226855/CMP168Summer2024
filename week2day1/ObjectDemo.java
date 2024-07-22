package week2day1;

public class ObjectDemo {// Every class will extend the Object class

	public static void main(String[] args) {
		
		Restaurant r1 = new Restaurant("Outback Steakhouse", 8);
		System.out.println(r1.getName());
		System.out.println(r1.getRating());
		System.out.println(r1.getClass());
		
		Restaurant r2 = new Restaurant("Peter Luger's", 10);
		System.out.println(r1.equals(r2)); // Don't use r1 == r2
		
		// The default toString() returns class name and the reference
		System.out.println(r1.toString()); 
		
		// The default equals() method only checks the references
		Restaurant r3 = new Restaurant("Outback Steakhouse", 8);
		System.out.println(r1.equals(r3));
		
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		// Test equals method
		System.out.println(r1.equals(null));
		System.out.println(r1.equals(2.3));
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
		r1.printMenu();
	}

}
