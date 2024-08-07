# Week 1 Day 3
# Chapter 10 Classes and Objects

To keep programs understandable, programmers often deal with higher-level groupings of variables and methods known as **objects**. Programmers use **classes** to describe how different types of objects should be constructed.
 
**Example**: Define a restaurant class
```java
public class RestaurantSimple {
	
	String name;
	int rating;
	
	public void printInfo() {
		System.out.println(name + " - " + rating);
	}

}
```

```java
public class RestaurantDriver {

	public static void main(String[] args) {
		
		RestaurantSimple r1 = new RestaurantSimple();
		r1.name = "Mc Dononld's";
		r1.rating = 7;
		r1.printInfo();

	}

}
```

**Are there any problems with the above approach?**
- If we forget to assign values to those member variables, their default values may cause problems.
- Anyone can change the values for the member variables.

### Defining a Class

A class consists of:
- **member variables** (also called fields or instance variables): restaurant name, restaurant rating
- **constructor(s)**: used to create a restaurant object
- **methods**: `setRating()`, `getRating()`, `setName()`, `getName()`, `printInfo()`

**How to create a class to represent an object?**
- Declare a class: `public class Restaurant`
- Declare (private) member variables:
```java
private String restaurantName;
private int restaurantRating;
```
- Define the default constructor: initialize the member variables to their default values
```java
public Restaurant() {
  restaurantName = "";
  restaurantRating = 0;
}
```
- Define overloaded constructors: create an object with specific values
```java
public Restaurant(String name, String rating) {
  restaurantName = name;
  restaurantRating = rating;
}
```
- Create public methods to modify the object's data: mutator (setter) methods
```java
public void setName(String name) {
  restaurantName = name;
}

public void setRating(int rating) {
  restaurantRating = rating;
}
```
- Create public methods to access the object's data: accessor (getter) methods
```java
public String getName() {
  return restaurantName;
}

public int getRating() {
  return restaurantRating;
}
```
- Create additional public methods: define the object's behaviors
```java
public void printInfo() {
  System.out.println("Name:" + restaurantName + " | Rating:" + restaurantRating);
}
```
- Create additional private helper methods
```java
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
```

### Create Objects

A programmer can create one or more objects of the same class:
```java
Restaurant favBreakfastPlace = new Restaurant("Brooklyn Deli", 4.5);
Restaurant favLunchPlace = new Restaurant("Chipotle", 4.9);
Restaurant favDinnerPlace = new Restaurant();
```
- Declare the object's name and class type
- Include the `new` operator so that memory space will be allocated.
- Call a constructor to create the object.

### Modify an Object's Data

It is a _good practice_ to use public setter methods to modify an object. In this way the programmer doesn't need to worry about how the information is handled internally.

- Change `favLunchPlace`'s name to Popeyes.
- Change `favDinnerPlace`'s name and rating to Outback Steakhouse and 5.

### Access an Object's Data

It is a _good practice_ to use public getter methods to access an object's data.

- Print the rating of `favBreakfastPlace`
- Find the highest rated restaurant

**Exercises**:
- c10.3.2: Basic class use
- c10.3.3: Basic class definition
- c10.5.2: Initialization and constructors.
- c10.8.2: Unit testing of a class
- c10.9.2: Constructor overloading

### Keyword `this`

Within an instance method or a constructor, this refers to the current object (the object whose method or constructor is being called). It is helpful to make the program easier to understand.
- Use `this` in a constructor: `this` followed by `()` refers to a constructor method.
- Use `this` in getter/setter methods: Typical use case: `this.name = name;`
- Use `this` in other methods: `this.variable` will always refer to the class member variable instead of a local variable. Using this expression may avoid confusion.

**Exercise**: c10.11.2: The this implicit parameter

### Unified Modeling Language (UML)

**Unified Modeling Language (UML)** is a language used to define class models and specify the details of use cases.

Restaurant
___
\- restaurantName: String

\- restaurantRating: int

\+ Restaurant()

\+ Restaurant(String, int)

\+ setName(String): void

\+ setRating(int): void

\+ getName(): String

\+ getRating(): int

\+ printInfo(): void

**Access modifiers in UML:**
- `-`: private
- `+`: public
- `#`: protected
- `UPPER_CASE_UNDERSCORED`: final variable
- <ins>underlined</ins>: static variable or method

### Wrapper Class Conversions
Java created a **wrapper class** for each primitive variable type, so that additional operations can be applied to these values. A very convenient operation is to parse values from a string.
```java
String str1 = "32";
int val = Integer.parseInt(str1); // Returns 32
```

### Java Documentation for Classes
The **Javadoc** tool parses source code along with specially formatted comments to generate documentation. The documentation generated by Javadoc is known as an **API** for classes and class members. API is short for **application programming interface**.

The specially formatted comments for Javadoc are called **Doc comments**, which are multi-line comments consisting of all text enclosed between the /** and */ characters. Importantly, Doc comments are distinguished by the opening characters /**, which include two asterisks. The following illustrates.

Useful tags:
- @author
- @version
- @param
- @return
- @see

**Generate Javadoc on Eclipse:** File -> Export -> Java -> Javadoc.

### Static Fields and Methods
The keyword `static` indicates a variable is allocated in memory only once during a program's execution. Static variables reside in the program's static memory region and have a global scope. Thus, static variables can be accessed from anywhere in a program.

A **static field** is a field of the class instead of a field of each class object. Thus, static fields are independent of any class object, and can be accessed without creating a class object.

A static member method is a class method that is independent of class objects. Static member methods are typically used to access and mutate private static fields from outside the class. A static member method can only access a class' static fields.

- Add a static variable `numRestaurants` to the `Restaurant` class.
- Add static methods `updateNumRestaurants()` and `getNumRestaurants()` to the `Restaurant` class.

**Exercise**: c10.16.1: A class with static members
