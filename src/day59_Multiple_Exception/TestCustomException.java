package day59_Multiple_Exception;

public class TestCustomException {

	public static void main(String[] args) throws LunchTimeException  {
		//throw new NoBreakException();
		//throw new RuntimeException("There is a runtime exception");
		boolean breakTime = true;
		
		if(breakTime) {
			throw new NoBreakException();
		}else {
			System.out.println("Class dismissed");
		}
		
		
		System.out.println("Work done");
		
		
		try {
			throw new NoBreakException();
		}catch(NoBreakException e) {
			System.out.println("Break time, no more Java");
		}
		
	//	throw new Exception("12345");
		
		throw new LunchTimeException();
		
		
	}
}
