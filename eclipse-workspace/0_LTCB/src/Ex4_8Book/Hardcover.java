package Ex4_8Book;

public class Hardcover extends ABook {
	/**
	 * This is Constructor of Hardcover
	 * Example:
	 * Hardcover h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987)
	 * @param title
	 * @param author
	 * @param price
	 * @param publicationYear
	 */
	public Hardcover(String title, String author, double price, int publicationYear){
		super(title, author, price, publicationYear);
	}
	/**
	 * which computes the sale price of each book:The hardcover books are sold at 20% off.
	 * Example:
	 * 
	 * @return salePrice  (double)
	 */
	public double salePrice() {
		return this.price * 0.8;
	}

}
