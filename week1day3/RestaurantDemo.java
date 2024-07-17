package week1day3;

public class RestaurantDemo {

	public static void main(String[] args) {
		
		Restaurant r1 = new Restaurant();
		r1.printInfo();
		
		r1.setName("Mc Donald's");
		r1.setRating(7);
		r1.printInfo();
		
		Restaurant r2 = new Restaurant("Burger King", 6);
		r2.printInfo();
		r2.printInfo2();
		
		System.out.println("Name of r2:" + r2.getName());

	}

}
