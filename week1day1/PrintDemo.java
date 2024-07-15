package week1day1;

public class PrintDemo {

	public static void main(String[] args) {
		
		// Use print
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		
		// Start a new line
		System.out.println();
		
		// Use println
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// Formatted Printing
		String account = "Prime";
		double total = 210.35;
		int years = 5;

		System.out.printf("The %s account saved you $%.2f over %d years\n",
		    account, total, years);
		
		// Alternatively, create the string first.
		String output1 = String.format("The %s account saved you ", account);
		String output2 = String.format("$%.2f over %d years\n", 
										total, years);
		System.out.println(output1 + output2);
	}

}
