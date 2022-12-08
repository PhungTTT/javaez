package Ex4_1BankAccount;

public class CD  extends ABankAccount  {
	private double interest; //%
	private Date maturity;
	/**
	 * 	This is Constructor of CD
	 * Example:
	 * CD cd1 = new CD("Ima Flatt", 1729, 10123.0, 4.0, new Date(1,6,2005));
	 */
	public CD(String nameCustomer, int id, double currentBalance, double interest, Date maturity) {
		super(nameCustomer, id, currentBalance);
		this.interest = interest;
		this.maturity = maturity;
	}
}
