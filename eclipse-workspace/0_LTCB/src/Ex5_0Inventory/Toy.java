package Ex5_0Inventory;

public class Toy {
	private String name;
	private double price;
	private int available;
	/**
	 * This is Constructor of class Toy
	 * Example:
	 * 	new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy ("gun", 15.0, 4);
	 * @param name
	 * @param price
	 * @param available
	 */
	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	//@Override
	public String toString() {

		return "name: " + this.name

		+ ", price: " + this.price

		+ ", available: " + this.available;

		}

	//@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Toy))
			return false;
		else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name)
					&& this.price == that.price 
					&& this.available== that.available;
		}
	}
	public boolean isName(String toyName) {
		// TODO Auto-generated method stub
		return this.name.equals(toyName);
	}
	public boolean ispriceBelow(double threshold) {
		// TODO Auto-generated method stub
		return this.price < threshold;
	}
	public Toy copyWithRaisePrice(double rate) {
		// TODO Auto-generated method stub
		return new Toy(this.name, this.price*(1+ rate), this.available);
	}
	public void setNewPrice(double rate) {
		// TODO Auto-generated method stub
		this.price = this.price*(1+ rate);
	}
	/**
	 * Getters  & Setters
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	/**
	 * 
	 * @param findName
	 * @param replaceName
	 */
	public void replaceName(String findName, String replaceName) {
		if(this.name.equals(findName))
			this.name=replaceName;
	}
	
		
}
