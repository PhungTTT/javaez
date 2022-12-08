package Ex4_6Goods;

public abstract class AGoods {
	protected String brandName;
	protected double weight; //gram
	protected double price;//cents
	/**
	 * This is Constructor of Goods
	 * Example:
	 * 
	 * @param brandName
	 * @param weight
	 * @param price
	 */
	public AGoods(String brandName, double weight, double price) {
		super();
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}
	/**
	 * which computes the unit price (cents per gram) of some grocery item;
	 * Example:
	 * Goods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", regular);
	 * Goods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", sorbet);
	 * assertEquals(i1.unitPrice(),0.02);
	 * assertEquals(i2.unitPrice(),0.027,0.001);
	 * 
	 * Goods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
	 * Goods c2 = new Coffee("TN", 300.0, 5.0, "regular");
	 * assertEquals(c1.unitPrice(),0.03);
	 * assertEquals(c2.unitPrice(),0.016,0.001);
	 * 
	 * Goods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
	 * Goods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
	 * assertEquals(j1.unitPrice(),0.02);
	 * assertEquals(j2.unitPrice(),0.02);
	 * @return double
	 */
	public double unitPrice() {
		return this.price / this.weight;
	}
	/**
	 * which determines whether the unit price of some grocery item is 
	 * lower than some given amount;
	 * Example:
	 * 	Goods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
		Goods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
		assertTrue(i1.lowerPrice(0.025));
		assertFalse(i2.lowerPrice(0.025));
		
		Goods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
		Goods c2 = new Coffee("TN", 300.0, 5.0, "regular");
		assertFalse(c1.lowerPrice(0.02));
		assertTrue(c2.lowerPrice(0.02));
		
		Goods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
		Goods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
		assertTrue(j1.lowerPrice(0.03));
		assertTrue(j2.lowerPrice(0.03));
	 * @param amount (double )
	 * @return boolean
	 */
	public boolean lowerPrice(double amount) {
		return this.unitPrice() < amount;
	/**
	 * which determines whether a grocery item 
	 * is cheaper than some other, given one in terms of the unit cost.
	 * Example:
	 * 	Goods i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
		Goods i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
		assertTrue(i1.cheaperThan(i2));
		
		Goods c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
		Goods c2 = new Coffee("TN", 300.0, 5.0, "regular");
		assertFalse(c1.cheaperThan(c2));
		
		Goods j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
		Goods j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
		assertFalse(j1.cheaperThan(j2));
	 * @param other (Goods)
	 * @return boolean 
	 */
	}
	public boolean cheaperThan(AGoods other) {
		return this.unitPrice() < other.unitPrice();
	}
}
