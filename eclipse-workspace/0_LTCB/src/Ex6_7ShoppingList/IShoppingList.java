package Ex6_7ShoppingList;

public interface IShoppingList {
	/**
	 * Which computes the number of items on the shopping list;
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
	 * IShoppingList s1 = new ConsShoppingList(a1,new MTShoppingList());
	 * IShoppingList s2 = new ConsShoppingList(a2,s1);
	 * IShoppingList s3 = new ConsShoppingList(a3,s2);
	 * IShoppingList s4 = new ConsShoppingList(a4,s3);
	 * IShoppingList s5 = new ConsShoppingList(a5,s4);
	 * IShoppingList s6 = new ConsShoppingList(a6,s5);
	 * 
	 * assertEquals(s6.howMany());
	 * @return int
	 */
	public int howMany();
}
