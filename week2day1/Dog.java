package week2day1;

public class Dog extends Pet {
	
	// Challenge: Add a counter to count how many dogs are created.
	private static int dogCounter = 0;
	
	private String favoriteToy;
	
	public Dog() {
//		name = ""; // This is not allowed as name is private.
		
		// Solution 1: Use setter methods
//		setName("");
//		setFavoriteFood("");
//		setGoesOutside(true);
		
		// Solution 2: Use a constructor from the superclass.
		super("", "", true);
		favoriteToy = "";
		dogCounter++;
	}
	
	public Dog(String name, String favoriteFood,
				String favoriteToy) {
		super(name, favoriteFood, true);
		this.favoriteToy = favoriteToy;
		dogCounter++;
	}

	public String getFavoriteToy() {
		return favoriteToy;
	}

	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}
	
	@Override
	public void play() {
		System.out.println(getName() + 
				" is playing with its favorite toy " +
				favoriteToy + ".");
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str += ", " + favoriteToy;
		return str;
	}
	
	@Override
	public boolean equals(Object o) {
		// if they are equal as Pets, continue to check the 
		// new attributes
		if (super.equals(o)) {
			if (o instanceof Dog) {
				Dog d = (Dog) o;
				if (this.favoriteToy.equals(d.favoriteToy)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int getDogCount() {
		return dogCounter;
	}

}
