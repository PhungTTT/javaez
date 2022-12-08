package Ex4_6Goods;
import junit.framework.*;
public class AGoodsTest extends TestCase{
	/**
	 * Test for Constructor
	 */
	public void testConstructor() {
		//Test for class IceCream
		AGoods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
		AGoods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
		//Test for class Coffee
		AGoods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
		AGoods c2 = new Coffee("TN", 300.0, 5.0, "regular");
		//Test for class Juice
		AGoods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
		AGoods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
	}
	/**
	 * Test for unitPrice()
	 */
	public void testunitPrice() {
		//Test for class IceCream
		AGoods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
		AGoods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
		assertEquals(i1.unitPrice(),0.02);
		assertEquals(i2.unitPrice(),0.027,0.001);
		//Test for class Coffee
		AGoods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
		AGoods c2 = new Coffee("TN", 300.0, 5.0, "regular");
		assertEquals(c1.unitPrice(),0.03);
		assertEquals(c2.unitPrice(),0.016,0.001);
		//Test for class Juice
		AGoods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
		AGoods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
		assertEquals(j1.unitPrice(),0.02);
		assertEquals(j2.unitPrice(),0.02);
	}
	/**
	 * Test for lowerPrice()
	 */
	public void testlowerPrice() {
		//Test for class IceCream
		AGoods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
		AGoods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
		assertTrue(i1.lowerPrice(0.025));
		assertFalse(i2.lowerPrice(0.025));
		//Test for class Coffee
		AGoods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
		AGoods c2 = new Coffee("TN", 300.0, 5.0, "regular");
		assertFalse(c1.lowerPrice(0.02));
		assertTrue(c2.lowerPrice(0.02));
		//Test for class Juice
		AGoods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
		AGoods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
		assertTrue(j1.lowerPrice(0.03));
		assertTrue(j2.lowerPrice(0.03));
	}
	/**
	 * Test for cheaperThan()
	 */
	public void testcheaperThan() {
		//Test for class IceCream
		AGoods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
		AGoods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
		assertTrue(i1.cheaperThan(i2));
		//Test for class Coffee
		AGoods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
		AGoods c2 = new Coffee("TN", 300.0, 5.0, "regular");
		assertFalse(c1.cheaperThan(c2));
		//Test for class Juice
		AGoods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
		AGoods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
		assertFalse(j1.cheaperThan(j2));
	}
}

