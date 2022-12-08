package Ex4_8Book;

public class Paperback extends ABook{
	/**
	 * This is Constructor of Paperback
	 * Example:
	 * Paperback p1 = new Paperback("BiaMen","Anh T",50.2,1995);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicationYear
	 */
	public Paperback(String title, String author, double price, int publicationYear){
		super(title, author, price, publicationYear);
	}
	/**
	 * which computes the sale price of each book:The paperbacks are sold at the list price.
	 * Example:
	 * 
	 * @return salePrice  (double)
	 */
	public double salePrice() {
		return this.price ;
	}
}
