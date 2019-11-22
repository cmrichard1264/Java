package day38_CustomClassContinue;

public class BankAccountObjects {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		account1.accountHolder = "Madina Richard";
		account1.accountNumber = 1000000023456789L;
		
		account1.showBalance();
		account1.Deposit(5000);
		account1.withDraw(3000);
		account1.withDraw(2001);
		account1.withDraw(5);
		
		BankAccount account2 = new BankAccount();
		account2.accountSetUp("Ava Richard", 1234500000987654L );
		account2.showBalance();
		
		BankAccount account3 = new BankAccount("Adrien Richard", 1234567891234670L);
		account3.showBalance();
		account3.Deposit(12500);
		account3.withDraw(7500);
		account3.showBalance();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
