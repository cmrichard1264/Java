package day39_JavaReview;

public class CellPhoneObject {

	public static void main(String[] args) {
		
		
		CellPhone phone1 = new CellPhone();
		System.out.println(phone1.brand);
		System.out.println(phone1.color);
		System.out.println(phone1.model);
		System.out.println(phone1.price);
		System.out.println(phone1.screenSize);
		
		
		CellPhone phone2 = new CellPhone("Samsung", 599.99, "blue", 4.8, "V3") ;
		phone2.getInfo();
		
		CellPhone phone3 = new CellPhone("Nokia", 259.99, "Silver", 6, "3310");
		phone3.getInfo();
		
		CellPhone [] phones = {phone1, phone2, phone3};
		System.out.println(phones[2].brand);
		phone2.getInfo();		
		
		
		
		
	}
}
