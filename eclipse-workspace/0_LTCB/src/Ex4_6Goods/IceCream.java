package Ex4_6Goods;

public class IceCream extends AGoods {
	private String flavor;
	private String packaged; //sorbet, frozen yogurt, or regular
	/**
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
	public IceCream(String brandName, double weight, double price, String flavor, String packaged) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packaged = packaged;
	}
	
	
}
