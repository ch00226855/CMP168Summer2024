package week2day2;

public class Food {

	private String name;
	private int calories;
	private int weight;
	
	public Food(String name, int calories, int weight) {
		this.name = name;
		this.calories = calories;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %10s | Calories: %4d | Weight: %3d",
				name, calories, weight);
	}
	
}
