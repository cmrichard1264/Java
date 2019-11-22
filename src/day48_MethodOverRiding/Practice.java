package day48_MethodOverRiding;

class WebDriver{
	public void get() {
		System.out.println("Opens browser");
	}
}

class ChromeDriver extends WebDriver{
	@Override
	public void get() {
		System.out.println("Opens Chrome Browser");
	}
}

class FireFoxDriver extends WebDriver{
	@Override
	public void get() {
		System.out.println("Opens FireFox Browser");
	}
}

public class Practice {

	public static void main(String[] args) {
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get();
		
		FireFoxDriver driver2 = new FireFoxDriver();
		driver2.get();
	}
}
