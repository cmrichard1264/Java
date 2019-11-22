package day28_JavaRecap;

public class KmToMiles_GallonsToLiters {
	
public static void main(String[] args) {
	
	kmToMiles(800);
	GallonToLiter(25);
	
}

	    // km to miles converter   1 km = 0.612 miles

	    public static void kmToMiles( double km) {
		double miles = km * 0.612;
		System.out.println(km+" km equals to "+miles+" miles");

	}
	
	
	
	
	
	
	
	// gallons to liters   1 gallon = 3.75 liters
	
	    public static void GallonToLiter( long gallon) {
		double liters = gallon * 3.75;
		System.out.println(gallon+" gallons equals to "+liters+" liters");
	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
