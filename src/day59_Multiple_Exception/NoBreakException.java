package day59_Multiple_Exception;

public class NoBreakException extends RuntimeException {
	public NoBreakException() {
    super("No Break!");
	System.err.println("Untill end of school");
}
}


