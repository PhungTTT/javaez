package EX2_7;
import junit.framework.TestCase;
public class TransactionBankTest extends TestCase {
	public void testConstructor() {
		new TransactionBank("Nguyen Van A", 7000,5);
		new TransactionBank("Le Ba P", 1300,2 );
		new TransactionBank("Nguyen Thuy H", 500,2 );
	}
TransactionBank TransactionBank1 = new TransactionBank("Le Ba P", 1300,2 );
TransactionBank TransactionBank2 = new TransactionBank("Nguyen Thuy H", 500,2 );
	/**
	 * Test for  interest()
	 */
	public void testInterest() {
		assertEquals(new TransactionBank("Nguyen Van A", 7000, 4).interest(),350.0);
		assertEquals(TransactionBank1.interest(),58.5);
		assertEquals(TransactionBank2.interest(),20.0);
	}
	/**
	 * Test for payBack (double chargerAmount)
	 */
	public void testpayBack() {
		assertEquals(new TransactionBank("Nguyen Van A", 7000, 4).payBack(3000),18.75);
		assertEquals(TransactionBank1.payBack(10),0.025);
		assertEquals(TransactionBank2.payBack(450),1.125);
	}
}