package day46_SuperKeyword;

import day45_Protected_Default.ProtectedVariables;

class Data{
	public int num1 = 10;
	protected int num2 = 20;
	private int num3 = 30;
	int num4 = 40;
}




public class InheritanceReview extends Data {
   public static void main(String[] args) {
	   InheritanceReview obj = new InheritanceReview();
	   
	obj.num1 = 50;
	obj.num2 = 100;
	//obj.num3 = 150;//private
	obj.num4 = 200;
	
   }
}
	
	

class Variables extends ProtectedVariables{
	public static void main(String[] args) {
		
ProtectedVariables obj3 = new ProtectedVariables();
	
	//obj3.name = "Madina"; PROTECTED
	obj3.name2 = "Suna";
	}
}
	
	



