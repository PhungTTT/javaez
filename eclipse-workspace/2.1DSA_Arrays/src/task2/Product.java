package task2;

public abstract class Product {
	protected String id;
	protected String name;
	protected double price;
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Product(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public double getPrice() {
		return price;
	}

	public abstract boolean isDomestic();
	
}
