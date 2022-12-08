package Ex6_7ShoppingList;

public class Coffee extends AnItem {
	private String lable;
	/**
	 * This is Constructor of Coffee
	 * Example:
	 * Coffee c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
	 * Coffee c2 = new Coffee("TN", 300.0, 5.0, "regular");
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param lable
	 */
	public Coffee(String brandName, double weight, double price, String lable) {
		super(brandName, weight, price);
		this.lable = lable;
	}
	@Override
	public String toString() {
		return "Coffee: -lable:" + lable;
	}
	

}
