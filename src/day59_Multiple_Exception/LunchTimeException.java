package day59_Multiple_Exception;

public class LunchTimeException extends Exception {

	public LunchTimeException() {
		super("It's a Lunch Time");
		System.err.println("Time to stop the class");
	}
}
