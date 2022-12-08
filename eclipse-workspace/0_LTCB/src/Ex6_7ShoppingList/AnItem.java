package Ex6_7ShoppingList;

public abstract class AnItem {
	private String brandName;
	private double weight;
	private double price;
	/**
	 * This is Constructor of AnItem
	 * Example:
	 * IceCream i1 = new IceCream("KHK", 150.0, 3.0, "Orange", "regular");
	 * IceCream i2 = new IceCream("KHK", 150.0, 4.0, "Orange", "sorbet");
	 * Coffee c1 = new Coffee("TN", 200.0, 6.0,"decaffeinated");
	 * Coffee c2 = new Coffee("TN", 300.0, 5.0, "regular");
	 * Juice j1 = new Juice("TTT",250.0, 5.0,"Strawberry", "fresh");
	 * Juice j2 = new Juice("AAA", 200, 4.0,"Orange", "bottled");
	 * 
	 * AnItem a1 = i1;
	 * AnItem a2 = i2;
	 * AnItem a3 = c1;
	 * AnItem a4 = c2;
	 * AnItem a5 = j1;
	 * AnItem a6 = j2;
	 * @param brandName
	 * @param weight
	 * @param price
	 */
	public AnItem(String brandName, double weight, double price) {
		super();
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
