package Ex5_2Books;

import junit.framework.TestCase;

public class IBooksTest extends TestCase {
	public void testIBook() {
		Book b1 = new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
		Book b2 = new Book("My Love",new Author("=)",2003),2015,12.80);
		Book b3 = new Book("Dream",new Author("H10",1991),2003,0.0);
		
		IBooks i1 = new ConsBook(b1,new MTBook());
		IBooks i2 = new ConsBook(b1,new MTBook());
		IBooks i3 = new ConsBook(b1,new MTBook());
		
	};
}
