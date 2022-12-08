package Ex4_8Book;

public abstract class ABook {
	protected String title;
	protected String author;
	protected double price; //$
	protected int publicationYear;
	/**
	 * This is Constructor of Book
	 * Example:
	 * ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
	 * ABook p1 = new Paperback("BiaMen","Anh T",50.2,1995);
	 * ABook s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
	 * @param title
	 * @param author
	 * @param price
	 * @param publicationYear
	 */
	public ABook(String title, String author, double price, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	/**
	 * which computes the sale price of each book;
	 * Example:
	 * ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
	 * assertEquals(h1.salePrice(),65.39*0.8);
	 * 
	 * ABook p1 = new Paperback("BiaMen","Anh T",50.2,1995);
	 * assertEquals(p1.salePrice(),50.2);
	 * 
	 * ABook s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
	 * assertEquals(s1.salePrice(),8.16*0.5);
	 * @return salePrice  (double)
	 */
	public abstract double salePrice();
	
	/**
	 * which determines whether a book is cheaper than another book;
	 * Example:
	 * ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
	 * ABook p1 = new Paperback("BiaMen","Anh T",50.2,1995);
	 * assertTrue(p1.cheaperThan(h1));
	 * 
	 * ABook s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
	 * assertTrue(s1.cheaperThan(p1));
	 * assertTrue(s1.cheaperThan(h1));
	 * @param that (Book)
	 * @return cheaperThan (boolean)
	 */
	public boolean cheaperThan(ABook that) {
		return this.salePrice() < that.salePrice();
	}
	/**
	 * which determines whether a book was written by some given author which wrote another book.
	 * Example:
	 * ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
	 * ABook h2 = new Hardcover("Smile", "Chi T", 12.39, 2000);
	 * assertTrue(h1.sameAuthor(h2));
	 * @param that (Book)
	 * @return sameAuthor  (boolean)
	 */
	public boolean sameAuthor(ABook that) {
		return this.author.equals(that.author);
	}
}
