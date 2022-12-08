package task2;
//Sp noi dia
public class DomesticProduct extends Product {
	/**
	 * Constuctor of DomesticProduct
	 * @param id
	 * @param name
	 * @param price
	 */
	public DomesticProduct(String id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public boolean isDomestic() {
		return true;
	}
}
