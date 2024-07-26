package week2day3;

public class NegativeWeightException extends Exception {
	
	public NegativeWeightException(String message) {
		super("Negative weight error: " + message);
	}

}
