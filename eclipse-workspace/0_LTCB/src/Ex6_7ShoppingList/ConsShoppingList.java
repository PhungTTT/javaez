package Ex6_7ShoppingList;

public class ConsShoppingList implements IShoppingList {
	private AnItem first;
	private IShoppingList rest;
	/**
	 * This is Constructor of ConsShoppingList
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
	 * 
	 * ConsShoppingList s1 = new ConsShoppingList(a1,new MTShoppingList());
	 * ConsShoppingList s2 = new ConsShoppingList(a2,s1);
	 * ConsShoppingList s3 = new ConsShoppingList(a3,s2);
	 * ConsShoppingList s4 = new ConsShoppingList(a4,s3);
	 * ConsShoppingList s5 = new ConsShoppingList(a5,s4);
	 * ConsShoppingList s6 = new ConsShoppingList(a6,s5);
	 * @param first
	 * @param rest
	 */
	public ConsShoppingList(AnItem first, IShoppingList rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	/**
	 * This is howMany():  Which computes the number of items on the shopping list
	 */
	public int howMany() {
		return 1 + this.rest.howMany();
	}
	@Override
	public String toString() {
		return first + "; \n" + rest;
	}
	
}
