package week2day3;

public class Person implements Comparable<Person>{//<>: generic type
	
	private String name;
	private int ID;
	private int age;
	private double weight;
	
	public Person(String name, int ID) {
		this.name = name;
		this.ID = ID;
		this.age = 0;
	}
	
	public Person(String name, int ID, int age) {
		this.name = name;
		this.ID = ID;
		try {
			if (age > 0) {
				this.age = age;
			} else {
				throw new Exception("Negative age: " + age + ", setting age to 0.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			this.age = 0;
		}		
	}
	
	public Person(String name, int ID, int age, double weight) throws
			NegativeWeightException {
		this(name, ID, age);
		if (weight > 0.0) {
			this.weight = weight;
		} else {
			throw new NegativeWeightException("Negative weight: " + weight);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Name: %10s |ID: %4d", name, ID);
	}
	
	@Override
	public int compareTo(Person obj) {
		if (this.ID < obj.ID) {
			return -1;
		} else if (this.ID > obj.ID) {
			return 1;
		} else {
			return 0;
		}
	}

}
