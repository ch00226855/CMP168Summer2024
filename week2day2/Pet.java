package week2day2;

public abstract class Pet implements FoodEater {
	
	private static int petCounter;
	
	private String name;
	private String favoriteFood;
	private boolean goesOutside;
	
	public Pet(String name, String favoriteFood, boolean goesOutside) {
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.goesOutside = goesOutside;
		petCounter++;
	}
	
	public abstract void play();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public boolean isGoesOutside() {
		return goesOutside;
	}

	public void setGoesOutside(boolean goesOutside) {
		this.goesOutside = goesOutside;
	}
	
	@Override 
	public String toString() {
		return name + ", " + favoriteFood;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (o instanceof Pet) {
			Pet p = (Pet) o;
			if (this.name.equals(p.name) &&
				this.favoriteFood.equals(p.favoriteFood) &&
				this.goesOutside == p.goesOutside) {
				return true;
			}
		}
		return false;
	}
	
	public static int getPetCount() {
		return petCounter;
	}

}
