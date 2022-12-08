package Ontap1;


public class Book {
	String title;
	Author author;
	int year_of_publication;
	double price;
	Book(String title, Author author,int year_of_publication,double price) {
		this.title=title;
		this.author = author;
		this.year_of_publication =year_of_publication;
		this.price=price;
	}
	/**Checks whether the book was published in 2010 or 2009;
	 * 
	 * @return boolean
	 * Example:
	 * Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
		Book Book3 =new Book("Beach Music",new Author("Pat Conroy",1945),1996,9.50);
		assertFalse(Book1.currentAuthor());
		assertFalse(Book2.currentAuthor());
		assertFalse(Book3.currentAuthor());
	 */
	boolean currentBook() {
		return (this.year_of_publication == 2010) ||
		(this.year_of_publication == 2009);
	}
	/**Determines whether a book was written by a current author (born after 1975);
	 * 
	 * @return boolean
	 * Example:
	 * Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	    Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	    Book Book3 = new Book("Beach Music",new Author("Pat Conroy",1945),1996,9.50);
	    assertFalse(Book1.currentAuthor());
	    assertFalse(Book2.currentAuthor());
	    assertFalse(Book3.currentAuthor());
	 */
	boolean currentAuthor() {
		return this.author.birthyear >= 1975;
	}
	/**Determines whether a book was written by the specified author;
	 * @param that (Author)
	 * @return boolean
	 * Example:
	 * 	Author felleisen = new Author("Matthias Felleisen", 1960);
	    Book HTDCH = new Book("How to Design Class Hierarchies",felleisen, 2004, 0.0);
	    assertTrue(HTDCH.thisAuthor(felleisen));
	    Author friedman = new Author("Daniel P. Friedman", 1939);
	    assertFalse(HTDCH.thisAuthor(friedman));
	 */
	boolean thisAuthor(Author that) {
		return this.author.same(that);
	}
	/**Determines whether one book was written by the same author as some other book;
	 * @param that (Book)
	 * @return boolean
	 * Example:
	 * Author felleisen = new Author("Matthias Felleisen", 1960);
		Book HTDCH = new Book("How to Design Class Hierarchies",felleisen,2004, 0.0);
		Book HTDP = new Book("How to Design Programs",felleisen,2002,0.0);
		assertTrue(HTDCH.sameAuthor(HTDP));
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book ALJAFP = new Book("A Little Java, A Few Pattern",friedman, 1998, 25.9);
		assertFalse(ALJAFP.sameAuthor(HTDCH));
	 */
	boolean sameAuthor(Book that) {
		return this.author.same(that.author);
	}
	/**Determines whether two books were written by two authors born less than 10 year apart
	 * @param that (Book)
	 * @return boolean
	 * Example:
	 * Author felleisen = new Author("Matthias Felleisen", 1960);
		Book HTDCH = new Book("How to Design Class Hierarchies",felleisen,2004, 0.0);
		Book HTDP = new Book("How to Design Programs",felleisen,2002,0.0);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book ALJAFP = new Book("A Little Java, A Few Pattern",friedman, 1998, 25.9);
		assertFalse(ALJAFP.sameGeneration(HTDP));
		assertTrue(HTDP.sameGeneration(HTDCH));
	 */
	boolean sameGeneration(Book that) {
		if(Math.abs(this.author.birthyear - that.author.birthyear) <= 10) 
			return true;
		else return false;
	}
}
