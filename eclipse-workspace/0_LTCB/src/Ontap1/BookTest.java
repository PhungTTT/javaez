package Ontap1;


import junit.framework.*;
public class BookTest  extends TestCase{
	public void testConstructor () {
		new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
		new Book("Beach Music",new Author("Pat Conroy",1945),1996,9.50);
	}
	/*
	 * Test for currentAuthor()
	 */
	public void testCurrentBook() {
		Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
		Book Book3 =new Book("Beach Music",new Author("Pat Conroy",1945),1996,9.50);
		assertFalse(Book1.currentAuthor());
		assertFalse(Book2.currentAuthor());
		assertFalse(Book3.currentAuthor());
	}
	/**
	 * Test for currentAuthor() 
	 */
	public void testCurrentAuthor() {
	    Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	    Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	    Book Book3 = new Book("Beach Music",new Author("Pat Conroy",1945),1996,9.50);
	    assertFalse(Book1.currentAuthor());
	    assertFalse(Book2.currentAuthor());
	    assertFalse(Book3.currentAuthor());
	}
	/**
	 * Test for thisAuthor() 
	 */
	public void testThisAuthor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
	    Book HTDCH = new Book("How to Design Class Hierarchies",felleisen, 2004, 0.0);
	    assertTrue(HTDCH.thisAuthor(felleisen));
	    Author friedman = new Author("Daniel P. Friedman", 1939);
	    assertFalse(HTDCH.thisAuthor(friedman));
	}
	/**
	 * Test for sameAuthor()
	 */
	public void testSameAuthor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book HTDCH = new Book("How to Design Class Hierarchies",felleisen,2004, 0.0);
		Book HTDP = new Book("How to Design Programs",felleisen,2002,0.0);
		assertTrue(HTDCH.sameAuthor(HTDP));
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book ALJAFP = new Book("A Little Java, A Few Pattern",friedman, 1998, 25.9);
		assertFalse(ALJAFP.sameAuthor(HTDCH));
	}
	/**
	 * Test for sameGeneration()
	 */
	public void testSameGeneration() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		Book HTDCH = new Book("How to Design Class Hierarchies",felleisen,2004, 0.0);
		Book HTDP = new Book("How to Design Programs",felleisen,2002,0.0);
		Author friedman = new Author("Daniel P. Friedman", 1939);
		Book ALJAFP = new Book("A Little Java, A Few Pattern",friedman, 1998, 25.9);
		assertFalse(ALJAFP.sameGeneration(HTDP));
		assertTrue(HTDP.sameGeneration(HTDCH));
	}
}

