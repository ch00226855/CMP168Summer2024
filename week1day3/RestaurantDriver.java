package week1day3;

public class RestaurantDriver {

	public static void main(String[] args) {
		
		RestaurantSimple r1 = new RestaurantSimple();
		r1.name = "Mc Donald's";
		r1.rating = 7;
		r1.printInfo();
		
		RestaurantSimple r2 = new RestaurantSimple();
		r2.name = "Burger King";
		r2.rating = 6;
		r2.printInfo();
		
		// Let's try to exhaust the memory by creating a lot of objects
		RestaurantSimple[] ary = new RestaurantSimple[1_000_000_000];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = new RestaurantSimple();
		}
		System.out.println("Done");
	}

}
