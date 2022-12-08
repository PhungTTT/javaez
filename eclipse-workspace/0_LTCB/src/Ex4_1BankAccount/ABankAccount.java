package Ex4_1BankAccount;

public abstract class ABankAccount implements BankAccount {
	protected String nameCustomer;
	protected int id;//#
	double currentBalance; // $
	/**
	 * This is Constructor of ABankAccount
	 * @param nameCustomer
	 * @param id
	 * @param currentBalance
	 */
	public ABankAccount(String nameCustomer, int id, double currentBalance) {
		super();
		this.nameCustomer = nameCustomer;
		this.id = id;
		this.currentBalance = currentBalance;
	}
	
}
