package week1day2;

public class VariableScopes {
	
	public static void printX() {
		int x = 10;
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		printX();
		int x = 20;
		System.out.println(x);
	}

}
