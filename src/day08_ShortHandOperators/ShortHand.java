package day08_ShortHandOperators;

public class ShortHand {
     
	public static void main(String[] args) {
	
		// +=: addition
		
		int a = 9;
		a += 3;
		System.out.println(a);
		
		
		int b = a += 5; 
		System.out.println(b);
		
		int c = a += b;    
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		int d = a+=c;
		System.out.println(d);
		
		int e = (d+=b) * 2;
		System.out.println(a); //68
		System.out.println(b); //17
		System.out.println(c); //34
		System.out.println(d); //85
		System.out.println(e); //170
		
		int f = b += d * 2;
		System.out.println(f);//187
		System.out.println(b);//187
		System.out.println(d);//85
		
		// -=: Subtraction
		
		int g = 101;
		int h = g -= 1; 
		System.out.println(g); //100
		System.out.println(h);  //100
		
		int i = g += h +5;
		System.out.println(i); //205
		System.out.println(g); //205 
		System.out.println(h); //100
		
		int j = h += g % i;
		System.out.println(j); //100
		System.out.println(h); //100
		System.out.println(g); //205
		
		int k = j -= h * 2 % 5;
		System.out.println(k); //100
		System.out.println(j); //100
		System.out.println(h); //100
		
		// *=: multiplication
		
		int A = 100;
		A  *= 200; 
		System.out.println(A); //20 000
		
		int B = 100;
		B *= 100 / 10;
		System.out.println(B); //1 000
		
		B *= B -= 1000;
		System.out.println(B); //0
		
		
		// /=: division
		
		int C = 1000;
		C /= 5;
		System.out.println(C); //200
		int D = 10;
		
		C /= D + 10;
		System.out.println(C); //10
		System.out.println(D); //10
		
		
		// %=: remainder
		
		int E = 10;
		E %= 2;
		System.out.println(E); //0
		
		int F = 100;
		F %= 102;
		System.out.println(F); //0
		
		System.out.println(-100%3);
		System.out.println(10.5 %3); // 1.5: 3*3=9
		
		int J = 300;
		int K = 10;
		
		J += J%= K;
		System.out.println(J); //300
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
	
	
}
