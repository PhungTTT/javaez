package Ex6_7ShoppingList;

public class IceCream extends AnItem{
	private String flavor;
	private String _package;
	/**
	 * /**
	 * This is Constructor of IceCream
	 * Example:
	 * IceCream i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
	 * IceCream i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param flavor
	 * @param packaged
	 */
	public IceCream(String brandName, double weight, double price, String flavor, String _package) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this._package = _package;
	}
	@Override
	public String toString() {
		return "IceCream: -flavor:" + flavor + "----package:" + _package;
	}
	
}
