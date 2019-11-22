package day43_JavaRecap;

import day44_AccessModifiers.TestData;
import day44_AccessModifiers.defaultAccessModifier;

public class Test {

	public static void main(String[] args) {
	System.out.println(TestData.name);	
	System.out.println(TestData.id);
	
	defaultAccessModifier obj = new defaultAccessModifier();
	System.out.println(obj.namePublic);
	//System.out.println(obj.namePrivate);
	//System.out.println(obj.nameDefault);
	}
}
