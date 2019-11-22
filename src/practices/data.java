package practices;

public class data {
	 static String name1 = "Default";
	 final static protected String name2 = "Protected";//inherited
	 static public String name3 = "Public";
	 static private String name4 = "Private";
	 String name5;
	
}


class a extends data{
	public static void main(String[] args) {
		
		final String name6;
		//System.out.println(name6);
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		//System.out.println(name4); outside the class
	}
}


