package EX3_2;

public class Book {
	private String title;
	private Author author;
	private int year_of_publication;
	private double price;
	/*
	 * This is constructor of Book
	 * Example:
	 *new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	  new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	  new Book("Football Skills",new Author("H10",1991),2003,0.0);
	 * 
	 * @param (String title, Author author,int year_of_publication,double price)
	 */
	Book(String title, Author author,int year_of_publication,double price) {
		this.title=title;
		this.author = author;
		this.year_of_publication =year_of_publication;
		this.price=price;
	}
	/**Checks whether the book was published in 2004 or 2003;
	 * 
	 * @return boolean 
	 * Example: 
	 * Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   Book Book3 = new Book("Football Skills",new Author("H10",1935),2003,0.0);
	   assertFalse(Book1.currentBook());
	   assertFalse(Book2.currentBook());
	   assertTrue(Book3.currentBook());
	 */
	boolean currentBook() {
		return (this.year_of_publication == 2004) ||
		(this.year_of_publication == 2003);
	}
	/**Determines whether a book was written by a current author (born after 1940);
	 * 
	 * @return boolean
	 * Example:
	 * Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   Book Book3 = new Book("Football Skills",new Author("H10",1935),2003,0.0);
	   assertFalse(Book1.currentAuthor());
	   assertFalse(Book2.currentAuthor());
	   assertFalse(Book3.currentAuthor());
	 */
	boolean currentAuthor() {
		return this.author.currentAuthor();
	}
	/**Determines whether a book was written by the specified author;
	 * @param: Author that
	 * @return: boolean
	 * Example:
	 * Author a = new Author("Thich Nhat Hanh",1926);
	   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   assertTrue(Book1.thisAuthor(a));
	   Author b  = new Author("Joseph Conrad",1857);
	   assertFalse(Book1.thisAuthor(b));
	 * 
	 */
	boolean thisAuthor(Author that) {
		return this.author.same(that);
	}
	/**Determines whether one book was written by the same author as some other book;
	 * @param: Book that
	 * @return: boolean
	 * Example:
	 * Author a = new Author("Thich Nhat Hanh",1926);
	   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   assertFalse(Book1.sameAuthor(Book2));
	 * 
	 */
	boolean sameAuthor(Book that) {
		return this.author.same(that.author);
	}
	/**Determines whether two books were written by two authors born less than 10 year apart.
	 * @param: Book that
	 * @return: boolean
	 * Example:
	   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   Book Book3 = new Book("Football Skills",new Author("H10",1935),2003,0.0);
	   assertFalse(Book1.sameGeneration(Book2));
	   assertTrue(Book1.sameGeneration(Book3));
	 */
	boolean sameGeneration(Book that) {
		return this.author.sameGeneration(that.author);
	}
}
