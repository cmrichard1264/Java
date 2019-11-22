package day44_AccessModifiers;

import java.util.ArrayList;

public class CyberBank {

	public static void main(String[] args) {
		
	
	BankAccount Madina = new BankAccount();
	Madina.setAccountHolder("Madina Richard");
	Madina.setAccountNumber(123456789L);
	
	System.out.println("Name: "+Madina.getAccountHolder());
	System.out.println("Account number "+ Madina.getAccountNumber());
	System.out.println("Available balance: "+ Madina.getAvailableBalance());
	
	Madina.deposit(5000);
	Madina.showBalance();
	
	Madina.withDraw(2500);
	Madina.showBalance();
	Madina.deposit(15000);
	Madina.showBalance();
	
	
	BankAccount Suna = new BankAccount();
	Suna.setAccountHolder("Suna Tatar");
	Suna.setAccountNumber(987654321L);
	
	Suna.deposit(10000);
	Suna.showBalance();  // 100000
	Suna.withDraw(3000);
     
     Suna.getInfo();
	
	BankAccount[] accounts = {Madina, Suna};
	

}
}