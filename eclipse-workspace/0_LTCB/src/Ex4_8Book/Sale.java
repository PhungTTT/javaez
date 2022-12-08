package Ex4_8Book;

public class Sale extends ABook{
	/**
	 * This is Constructor of Sale
	 * Example:
	 * Sale s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicationYear
	 */
	public Sale(String title, String author, double price, int publicationYear){
		super(title, author, price, publicationYear);
	}
	/**
	 * which computes the sale price of each book:The sale books are sold at 50% off.
	 * Example:
	 * 
	 * @return salePrice  (double)
	 */
	public double salePrice() {
		return this.price * 0.5;
	}
}
