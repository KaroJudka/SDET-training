package oop;

public class BankAccount {
	String accountNumber;
	String routingNumber;
	String name;
	String ssn;
	
	BankAccount() {
		System.out.println("new account created");
	}
	BankAccount(String accountType) {
		System.out.println("new account created " + accountType);
	}
	BankAccount(String accountType, double inicialDeposit) {
		System.out.println("Initial deposit of $: " + inicialDeposit );
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
}
