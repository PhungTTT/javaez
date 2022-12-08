package Ex5_0Inventory;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;
	/**
	 * This is Constructor of class ConsInventory
	 * Example:
	 * 	ConsInventory i1 = new ConsInventory(gun, empty);
		ConsInventory i2 = new ConsInventory(robot, i1);
		ConsInventory i3 = new ConsInventory(doll, i2);
	 * @param first
	 * @param rest
	 */
	public ConsInventory(Toy first, Inventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
		@Override
		//Method toString
		public String toString() {
			return this.first.toString() + "\n" +
					this.rest.toString();
		}
	/**
	 * This is method contains(String toyName) of ConsIventory
	 */
	public boolean contains(String toyName) {
		return this.first.isName(toyName) 
				|| this.rest.contains(toyName);
	}
	/**
	 * 
	 */
	public boolean isBelow(double threshold) {
		return this.first.ispriceBelow(threshold) 
				&& this.rest.isBelow(threshold);
	}
	/**
	 * This is method howMany() of ConsIventory
	 */
	public int howMany() {
		return 1 + this.rest.howMany();
	}
	/**
	 * This is method raisePrice(double rate) of ConsInventory
	 */
	public Inventory raisePrice(double rate) {
		Toy aToy = this.first.copyWithRaisePrice(rate);
		return new ConsInventory(aToy, this.rest.raisePrice(rate));
		}
		@Override
		// Method equals
		public boolean equals(Object obj) {
			if (obj == null || !(obj instanceof ConsInventory)) 
				return false;
			else {
				ConsInventory that = (ConsInventory) obj;
				return this.first.equals(that.first)
						&& this.rest.equals(that.rest);
			}
	}
	/**
	 * This is method raisePriceMutable(double rate) of ConsInventory
	 */
	public void raisePriceMutable(double rate) {
		this.first.setNewPrice(rate);
		this.rest.raisePriceMutable(rate);
	}
	/**
	 * This is method totalPrice() of ConsInventory
	 */
	public double totalPrice() {
		return this.first.getPrice()+this.rest.totalPrice();
	}
	/**
	 * This is method averagePrice() of ConsInventory
	 */
	public double averagePrice() {
		return this.totalPrice()/this.howMany();
	}
	/**
	 * This is method replaceName(String findName, String replaceName) of ConsInventory
	 */
	public void replaceName(String findName, String replaceName) {
		 this.first.replaceName(findName, replaceName);
			this.rest.replaceName(findName, replaceName);
	}
	/**
	 * This is method eliminate(String toyOfName) of ConsInventory
	 */
	public Inventory eliminate(String toyOfName) {
		if(this.first.isName(toyOfName)) {
			return this.rest.eliminate(toyOfName);
		}
		else {
			return new ConsInventory(first,this.rest.eliminate(toyOfName));
		}
	}

}
