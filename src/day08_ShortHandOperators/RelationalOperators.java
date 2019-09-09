package day08_ShortHandOperators;

public class RelationalOperators {

	public static void main(String[] args) {

		// >= <=

		System.out.println(10 > 9); // true
		boolean resultA = 10 > 9;
		System.out.println(resultA); // true

		System.out.println(10 >= 9); // true
		boolean resultB = 10 >= 9;
		System.out.println(resultB); // true

		System.out.println(10 <= 9); // false
		boolean resultD = 1100 < 1200; //
		System.out.println(resultD); // true
		System.out.println(1000 <= 1000); // true

		// ==

		boolean resultG = 19 == 19;
		System.out.println(resultG); // true

		// !:
		boolean resultH = 20 != 20;
		System.out.println(resultH); // false

		boolean A = !false;
		System.out.println(A); // true

		boolean B = !true;
		System.out.println(B); // false

		boolean C = !false != !true;
		System.out.println(C); // true

		boolean D = true == !false;
		System.out.println(D); // true

		boolean F = 10 > 9 == 9 < 10;
		System.out.println(F); // true

	}

}
