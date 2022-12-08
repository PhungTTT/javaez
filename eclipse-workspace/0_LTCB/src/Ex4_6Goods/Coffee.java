package Ex4_6Goods;

public class Coffee extends AGoods {
	private String label; //regular or decaffeinated
	/**
	 * This is Constructor of Coffee
	 * Example:
	 * Coffee c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
	 * Coffee c2 = new Coffee("TN", 300.0, 5.0, "regular");
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param label
	 */
	public Coffee(String brandName, double weight, double price, String label) {
		super(brandName, weight, price);
		this.label = label;
	}
	

}
