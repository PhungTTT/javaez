package Ex6_7ShoppingList;

public class Juice extends AnItem{
	private String flavor;
	private String _package;
	/**
	 * /**
	 * This is Constructor of Juice
	 * Example:
	 * Juice j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
	 * Juice j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param packeged
	 */
	public Juice(String brandName, double weight, double price, String flavor, String _package) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this._package = _package;
	}
	@Override
	public String toString() {
		return "Juice: -flavor:" + flavor + "----package:" + _package ;
	}
	
	

}
