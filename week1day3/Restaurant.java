package week1day3;

public class Restaurant {
	
	// fields (or member variables)
	private String restaurantName;
	private int restaurantRating;
	
	// Constructors (must have the same name as the class, it has
	// no return value)
	public Restaurant() {
		restaurantName = "";
		restaurantRating = 0;
	}
	
	public Restaurant(String name, int rating) {
		restaurantName = name;
		restaurantRating = rating;
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

}
