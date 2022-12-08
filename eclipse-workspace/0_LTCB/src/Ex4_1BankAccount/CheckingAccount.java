package Ex4_1BankAccount;

public class CheckingAccount extends  ABankAccount {
	double minimumBalance;
	/*
	 * This is COnstructor of CheckingAccount
	 * Example:
	 * CheckingAcccount c1 = new CheckingAccount("Earl Gray", 1729, 1250.0,500.0);
	 */
	public CheckingAccount(String nameCustomer, int id, double currentBalance, double minimumBalance) {
		super(nameCustomer, id, currentBalance);

		this.minimumBalance = minimumBalance;
	}
}
