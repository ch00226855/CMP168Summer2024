package week2day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PetDemo {

	public static void main(String[] args) {
		// Generate 2 cats
		Cat cat1 = new Cat("Leo", "Waffle", "Rainy");
		Cat cat2 = new Cat();
		cat2.setName("Mishu");
		cat2.setFavoriteFood("Fish");
		cat2.setFavoriteWeather("Sunny");
		
		cat1.play();
		cat2.play();
		
		System.out.println(cat1);
		System.out.println(cat2.toString());
		
		System.out.println("Is cat1 = cat2? " + cat1.equals(cat2));
		System.out.println("Is cat1 = cat1? " + cat1.equals(cat1));
		
		// Generate 2 dogs
		Dog dog1 = new Dog();
		dog1.setName("Thunder");
		dog1.setFavoriteFood("Meatballs");
		dog1.setFavoriteToy("Bone Toy");
		Dog dog2 = new Dog("Flash", "Bones", "Tennis ball");
		
		// Print the details of these dogs.
		System.out.println(dog1.toString());
		System.out.println(dog2);
		
		// Create an array to include all 4 objects
		Pet[] petArray = new Pet[4];
		petArray[0] = cat1;
		petArray[1] = cat2;
		petArray[2] = dog1;
		petArray[3] = dog2;
		
		System.out.println("Printing the pet array...");
		for (int i = 0; i < petArray.length; i++) {
			System.out.println(petArray[i].toString());
		}
		
		// Alternatively
		Pet[] petArray2 = {cat1, cat2, dog1, dog2};
		System.out.println(Arrays.toString(petArray2));
		
		// Display the counters
		System.out.println("Number of dogs: " + Dog.getDogCount());
		System.out.println("Number of cats: " + Cat.getCatCount());
		System.out.println("Number of pets: " + Pet.getPetCount());
		
		// Let all pets play
		System.out.println("Let all pets play...");
		letPetsPlay(petArray);
		
		System.out.println("==============================");
		// Test the eating functions
		dog1.eat();
		Food f1 = new Food("Meat", 1500, 1);
		dog2.eat(f1);
		
		cat1.eat();
		cat2.eat(new Food("Fish", 1000, 2));
		
		for (int i = 0; i < petArray.length; i++) {
			petArray[i].metabolizeFood(f1);
		}
		
		System.out.println("==============================");
		// We can use interface to define an array
		FoodEater[] eaterArray = {cat1, cat2, dog1, dog2};
		
		
		
		
	}
	
	public static void letPetsPlay(Pet[] petArray) {
		for (int i = 0; i < petArray.length; i++) {
			petArray[i].play();
		}
	}

}
