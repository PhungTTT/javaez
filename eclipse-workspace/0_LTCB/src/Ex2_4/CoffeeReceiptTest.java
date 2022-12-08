package Ex2_4;
import junit.framework.*;
public class CoffeeReceiptTest extends TestCase {
	public void testConstructor() {
		new CoffeeReceipt("Hawaiian Kona",0.66,4000);
		new CoffeeReceipt("Ethiopian",0.75,6000);
		new CoffeeReceipt("Colombian Supreme",0.5,21000);
	}
	public void testcostCoffee() {
		assertEquals(new CoffeeReceipt("Hawaiian Kona",0.66,4000).costCoffee(),2640.0);
		CoffeeReceipt CoffeeReceipt1 = new CoffeeReceipt("Ethiopian",0.75,6000);
		CoffeeReceipt CoffeeReceipt2 = new CoffeeReceipt("Colombian Supreme",0.5,21000);
		assertEquals(CoffeeReceipt1.costCoffee(),4050.0);
		assertEquals(CoffeeReceipt2.costCoffee(),7875.0);
	}

}
