package Ex4_1BankAccount;

public class SavingsAccount extends ABankAccount {
	private double interest;//%
	
	/*
	 * This is Constructor of SavingsAccount
	 * Example: 
	 * SavingsAccount s1 = new SavingsAccount("Annie Proulx", 2992, 800.0, 3.5);
	 */
	public SavingsAccount(String nameCustomer, int id, double currentBalance, double interest) {
		super(nameCustomer, id, currentBalance);
		this.interest = interest;
	}
}
