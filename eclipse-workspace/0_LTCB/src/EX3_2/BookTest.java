package EX3_2;
import junit.framework.*;
public class BookTest  extends TestCase{
	/**
	 * Test for constructor of Book
	 */
	public void testConstructor () {
		new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
		new Book("Football Skills",new Author("H10",1991),2003,0.0);
	} 
	/**
	 * Test for currentBook()
	 */
	public void testCurrentBook() {
		Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
		Book Book3 = new Book("Football Skills",new Author("H10",1935),2003,0.0);
		assertFalse(Book1.currentBook());
	    assertFalse(Book2.currentBook());
	    assertTrue(Book3.currentBook());
	}
	/**
	 * Test for currentAuthor() 
	 */
	public void testCurrentAuthor() {
	   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   Book Book3 = new Book("Football Skills",new Author("H10",1935),2003,0.0);
	   assertFalse(Book1.currentAuthor());
	   assertFalse(Book2.currentAuthor());
	   assertFalse(Book3.currentAuthor());
	}
	/**
	 * Test for thisAuthor() 
	 */
	public void testThisAuthor() {
		Author a = new Author("Thich Nhat Hanh",1926);
		   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		   assertTrue(Book1.thisAuthor(a));
		   Author b  = new Author("Joseph Conrad",1857);
		   assertFalse(Book1.thisAuthor(b));
	}
	/**
	 * Test for sameAuthor()
	 */
	public void testSameAuthor() {
	   Author a = new Author("Thich Nhat Hanh",1926);
	   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   assertFalse(Book1.sameAuthor(Book2));
	}
	/**
	 * Test for sameGeneration()
	 */
	public void testSameGeneration() {
	   Book Book1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	   Book Book2 = new Book("Heart of Darkness",new Author("Joseph Conrad",1857),1902,12.80);
	   Book Book3 = new Book("Football Skills",new Author("H10",1935),2003,0.0);
	   assertFalse(Book1.sameGeneration(Book2));
	   assertTrue(Book1.sameGeneration(Book3));
	}
}
