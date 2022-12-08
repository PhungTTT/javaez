package Ex4_1BankAccount;
import junit.framework.*;
public class BankAccountTest extends TestCase{
	/*
	 * Test for Constructor
	 */
	public void testConstructor() {
		//Test for CheckingAcccount
		BankAccount c1 = new CheckingAccount("Earl Gray", 1729, 1250.0,500.0);
		//Test for SavingsAccount
		BankAccount s1 = new SavingsAccount("Annie Proulx", 2992, 800.0, 3.5);
		//Test for CD 
		BankAccount cd1 = new CD("Ima Flatt", 1729, 10123.0, 4.0, new Date(1,6,2005));
	}
}
