package week2day2;

public class Cat extends Pet implements FoodEater {
	
	private static int catCounter;
	
	private String favoriteWeather;
	
	public Cat() {
		super("Unspecified", "NA", false);
		favoriteWeather = "Unspecified";
		catCounter++;
	}
	
	public Cat(String name, String food, String weather) {
		super(name, food, false);
		favoriteWeather = weather;
		catCounter++;
	}
	
	public String getFavoriteWeather() {
		return favoriteWeather;
	}

	public void setFavoriteWeather(String favoriteWeather) {
		this.favoriteWeather = favoriteWeather;
	}

	@Override
	public void play() {
		System.out.println("Cat " + getName() + 
				" sits under a " + favoriteWeather.toLowerCase()
				+ " weather.");
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str = str + ", " + favoriteWeather;
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Check if obj is null
		if (obj == null) {
			return false;
		}
		
		// Check if obj is an instance of Cat
		if (obj instanceof Cat) {
			// Converting obj to Cat
			Cat c = (Cat) obj;
			
			// Check if all attributes match
			if (this.getName().equals(c.getName()) &&
				this.getFavoriteFood().equals(c.getFavoriteFood()) &&
				this.isGoesOutside() == c.isGoesOutside() &&
				this.favoriteWeather.equals(c.favoriteWeather)) {
				return true;
			}
		}
		return false;
	}

	public static int getCatCount() {
		return catCounter;
	}
	
	@Override
	public void eat() {
		System.out.println("Cat " + getName() + " is eating.");
	}
	
	@Override
	public void eat(Food f) {
		System.out.println("Cat " + getName() + " is eating " + 
						f.getName() + ".");
	}
	
	@Override
	public double  metabolizeFood(Food f) {
		double foodToWeight = 500;
		double weightGain = f.getCalories() / foodToWeight;
		System.out.println("Cat " + getName() + " has gained " +
						weightGain + " lbs.");
		return weightGain;
	}
	
}
