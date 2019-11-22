package day45_Inheritance;

class TestBase{
	static String chromeDriver;//default
	
	public static void ScreenShot() {
		System.out.println("ScreenShot");
	}
	private static void closeBrowser() {
		System.out.println("Browser closed");
	}
}


public class Inheritance extends TestBase {
              //sub                //super
	//sub class is going to inherit all the visible or protected features from the super class
	public static void main(String[] args) {
		System.out.println(chromeDriver);
		ScreenShot();
		//closeBrowser();
		}
	}
	
	
	

