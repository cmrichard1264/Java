package day48_MethodOverRiding;

public class Bank {
	
	
	public void InterestRate() {
		System.out.println("9 percent");
	}
public static void main(String[] args) {
	BankOfAmerica BOA = new BankOfAmerica();
	BOA.InterestRate();
	
	Chase Chase = new Chase();
	Chase.InterestRate();
	
	CapitalOne CO = new CapitalOne();
	CO.InterestRate();
}
	
}

class BankOfAmerica extends Bank {
	@Override
	public void InterestRate() {
		System.out.println("5%");
	}
}

class Chase extends Bank{
	public void InterestRate() {
		System.out.println("4%");
	}
}

class CapitalOne extends Bank{
	public void InterestRate() {
		System.out.println("3%");
	}}
