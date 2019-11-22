package day44_AccessModifiers;

public class BankAccount {
	
		/*WarmUp: creata a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountName, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requiremnets:
            1. apply encapsulations
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
*/
      
       private String accountHolder;
       private long accountNumber;
       private double availableBalance;

       //getter
       public String getAccountHolder() {
		return accountHolder;
	}
      
       public long getAccountNumber() {
    	   return accountNumber;
       }
       
       public double getAvailableBalance() {
    	   return availableBalance;
       }
       
       
       //setter
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
    
	public void setAccountBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	//Actions:
	//deposit:
	public void deposit(double amount) {
		availableBalance += amount;
	}
	//withdrawal
	public void withDraw(double amount) {
		if(availableBalance <= 0) {
			System.out.println("Account Balnce is less & equal to \"0\"");
			return;
		}
		if (amount > availableBalance) {
			availableBalance -= 35;
		}
		availableBalance -= amount;
	}
	
	//checking balance:
	public void showBalance() {
		System.out.println("Available Balance is: "+"\""+availableBalance + "\"");
	}
	
	//get account info:
	public void getInfo() {
		System.out.println("Name: "+getAccountHolder());
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Available Balance"+ getAvailableBalance());
	}
}
