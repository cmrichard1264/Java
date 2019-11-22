package day38_CustomClassContinue;

public class BankAccount{

	
	
	String accountHolder;
	long accountNumber;
	double balance;
	String username, password;
	
	public BankAccount(String username, String password) {
		this.username = username;
	}
	
	public BankAccount() {
		
	}
	
	public BankAccount(String accountHolder, long accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	
	
	public void showBalance() {
		System.out.println("----------------------");
		String account = ""+accountNumber;
		String accountNumber = "*********"+account.substring(12);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Available Balance: $"+ balance);
		System.out.println("-----------------------");
	}
	
	
	public void Deposit(double amount){

		System.out.println("-----------------------");
		String account = ""+accountNumber;
		String accountNumber = "*********"+account.substring(12);
		System.out.println("Depositting "+amount+" to the account "+accountNumber);
		balance += amount;
		System.out.println("New balance: $"+balance);
		System.out.println("------------------------");
		
	}
	
	public void withDraw(double amount) {
		System.out.println("--------------------");
		if(balance <= 0) {
			System.out.println("Balance is $0.0");
			return;
		}
		String account = ""+accountNumber;
		String accountNumber = "*********"+account.substring(12);
		System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);
		balance -= amount;
		
		if(balance < 0) {
			balance -= 35;
		}
		
		System.out.println("New balance: $"+balance);
		System.out.println("---------------------");
	}
	
	public void accountSetUp(String name, long accountNum) {
		accountHolder = name;
		accountNumber = accountNum;
	}
	
	
	
	
	
	
	
	
	
	
}
