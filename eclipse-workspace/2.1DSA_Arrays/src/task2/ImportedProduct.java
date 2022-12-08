package task2;
//Sp nhap khau
public class ImportedProduct extends Product {
	private String country;
	
	/**
	 * Constuctor of ImportedProduct
	 * @param id
	 * @param name
	 * @param price
	 * @param country
	 */
	public ImportedProduct(String id, String name, double price, String country) {
		super(id, name, price);
		this.country = country;
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", country=" + country +"]";
	}


	@Override
	public boolean isDomestic() {
		return false;
	}

	public String getCountry() {
		return country;
	}

}
