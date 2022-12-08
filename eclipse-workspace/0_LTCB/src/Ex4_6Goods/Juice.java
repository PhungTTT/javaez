package Ex4_6Goods;

public class Juice extends AGoods {
	private String flavor;
	private String packeged; //frozen, fresh, bottled, or canned
	/**
	 * This is Constructor of Juice
	 * Example:
	 * Juice j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
	 * Juice j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param packeged
	 */
	public Juice(String brandName, double weight, double price,String flavor, String packeged) {
		super(brandName, weight, price);
		this.flavor =flavor;
		this.packeged = packeged;
	}
	

}
