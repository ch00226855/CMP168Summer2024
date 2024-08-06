package week4day2;

public class FibonacciNumbers {
	
	// Returns the n-th Fibonacci number.
	public static int fib(int n) {
		// Base case: n == 0
		if (n == 0) {
//			System.out.println("Base case 0 is reached. Return 0.");
			return 0;
		}
		// Base case: n == 1
		if (n == 1) {
//			System.out.println("Base case 1 is reached. Return 1.");
			return 1;
		}
		
		// General case: n > 1
//		System.out.printf("Perform two recursive calls: fib(%d) + fib(%d)\n",
//								(n-1), (n-2));
		int result = fib(n-1) + fib(n-2);
		return result;
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println("" + fib(n));
	}

}
