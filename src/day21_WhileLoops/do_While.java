package day21_WhileLoops;

public class do_While {
public static void main(String[] args) {
	
	
	
	boolean a = false;
	
	while(a) {
		System.out.println("Hello World");
	}
	
	
	
	//do While Loop
	
	do {
		System.out.println("Hello World");
	} while(a);
	
	
	
	//example1
	int num = 1;
	do {
		if(num%2==0) {
			System.out.print(num+" ");
		}
		num++;
	} while(num <= 50);
	
	System.out.println();
	
	
	
	//example2
	
	do {
		System.out.println("Hello world");
		break;
	}while(true);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
