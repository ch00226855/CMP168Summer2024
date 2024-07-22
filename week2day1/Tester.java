package week2day1;

public class Tester {

	public static void main(String[] args) {
		
		// 1. Create 2 Dog objects
		Dog dog1 = new Dog();
		dog1.setName("Thunder");
		dog1.setFavoriteFood("Meatballs");
		dog1.setFavoriteToy("Bone Toy");
		Dog dog2 = new Dog("Flash", "Bones", "Tennis ball");
		
		// Print the details of these dogs.
		System.out.println(dog1.toString());
		System.out.println(dog2);
		
		// 3. Try to create a Pet object (This will cause error)
//		Pet pet1 = new Pet();
		
		// 4&5. Create an array of Pets and print the details
		Dog[] dogArray = new Dog[2];
		dogArray[0] = dog1;
		dogArray[1] = dog2;
		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i]); 
			// The toString method will be automatically called
			// when we try to print the objects
		}
		
		Pet[] petArray = new Pet[2];
		petArray[0] = dog1;
		petArray[1] = dog2;
		for (int i = 0; i < petArray.length; i++) {
			System.out.println(petArray[i]); 
		}
		
		// 6. Call their play method.
		for (int i = 0; i < petArray.length; i++) {
			petArray[i].play();
		}
		
		// Challenge 1: Add a dog counter
		System.out.println("Dogs created so far:" + 
							Dog.getDogCount());
	}

}
