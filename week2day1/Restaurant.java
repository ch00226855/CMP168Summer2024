package week2day1;

public class Restaurant {
	
	private class Menu {
		private String[] dishes;
		private double[] prices;
		
		
		public Menu() {
//			dishes = new String[] {"Burger", "Sandwich", "Fried Chicken"};
//			prices = new double[] {5.99, 7.99, 9.99};
			
			dishes = new String[3];
			dishes[0] = "Burger";
			dishes[1] = "Sandwich";
			dishes[2] = "Frided Chicken";
			
			prices = new double[3];
			prices[0] = 5.99;
			prices[1] = 7.99;
			prices[2] = 9.99;
		}
		
		public void print() {
			System.out.println("MENU");
			for (int i = 0; i < 3; i++) {
				System.out.println(dishes[i] + ": " + prices[i]);
			}
		}
	}
	
	// fields (or member variables)
	private String restaurantName;
	private int restaurantRating;
	private Menu menu;
	
	// Constructors (must have the same name as the class, it has
	// no return value)
	public Restaurant() {
		restaurantName = "";
		restaurantRating = 0;
		menu = new Menu();
	}
	
	public Restaurant(String name, int rating) {
		this();
		restaurantName = name;
		restaurantRating = rating;
	}
	
	public void printMenu() {
		menu.print();
	}
	
	// User-defined methods
	public void printInfo() {
		System.out.println("Name:" + restaurantName + " | Rating: " +
							restaurantRating);
	}
	
	public void printInfo2() {
		System.out.println("Name:" + restaurantName + " | Rating: " +
				starRating(restaurantRating));
	}
	
	// Private helper methods
	private boolean isRatingValid(int rating) {
		return (rating >= 0) && (rating <= 10);
	}
	
	private String starRating(int rating) {
		String output = "";
		for (int i = 0; i < rating; i++) {
			output += "*";
		}
		return output;
	}
	
	// Accessors (getter methods)
	public String getName() {
		return restaurantName;
	}
	
	public int getRating() {
		return restaurantRating;
	}
	
	// Mutators (setter methods)
	public void setName(String newName) {
		restaurantName = newName;
	}
	
	public void setRating(int newRating) {
		
//		if (newRating < 0 || newRating > 10) {
//			System.out.println("Failed to update rating to:" + newRating);
//		} else {
//			restaurantRating = newRating;
//		}
		if (isRatingValid(newRating)) {
			restaurantRating = newRating;
		} else {
			System.out.println("Failed to update rating to:" + newRating);
		}
	}
	
	// Update the toString method so that it returns name and rating.
	@Override
	public String toString() {
//		return (restaurantName + " - " + restaurantRating);
		
		// Return a formatted string
		String str = String.format("Name: %20s | Rating: %2d",
							restaurantName, restaurantRating);
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Check whether obj is null.
		if (obj == null) {
			return false;
		}
		// Check if obj belongs to the Restaurant class
		if (obj instanceof Restaurant) {
			// If obj belongs to the Restaurant class, 
			// convert it to a Restaurant object.
			Restaurant r = (Restaurant)obj;
			
			// Check whether all attributes match
			if (this.restaurantName.equals(r.restaurantName) &&
				this.restaurantRating == r.restaurantRating) {
				return true;
			} 
		} 
		return false;
	}
	
	
	

}
