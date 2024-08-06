package week4day2;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 11;
		System.out.println(factorial(n));
		System.out.println(factorialWithLoop(n));

	}
	
	public static int factorial(int n) {
		// base case
		if (n == 1) {
			return 1;
		}
		
		return n * factorial(n-1); 
	}
	
	public static int factorialWithLoop(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}

}
