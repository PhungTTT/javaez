package Ex4_8Book;
import junit.framework.*;
public class ABookTest extends TestCase{
	/**
	 * Test For Constructor 
	 */
	public void testConstructor() {
		ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
		ABook p1 = new Paperback("BiaMen","Anh T",50.2,1995);
		ABook s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
	}
	/**
	 * Test for salePrice()
	 */
	public void testSalePrice() {
		ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
		assertEquals(h1.salePrice(),65.39*0.8);
		ABook p1 = new Paperback("BiaMen","Anh T",50.2,1995);
		assertEquals(p1.salePrice(),50.2);
		
		ABook s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
		assertEquals(s1.salePrice(),8.16*0.5);
	}
	/**
	 * Test for cheaperThan()
	 */
	public void testCheaperThan() {
		ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
		ABook p1 = new Paperback("BiaMen","Anh T",50.2,1995);
		assertTrue(p1.cheaperThan(h1));
		
		ABook s1 = new Sale("My love", "Nguyen Van A", 8.16,1890);
		assertTrue(s1.cheaperThan(p1));
		assertTrue(s1.cheaperThan(h1));
	}
	/*
	 * Test for sameAuthor()
	 */
	public void testSameAuthor() {
		ABook h1 = new Hardcover("BiaCung", "Chi T", 65.39, 1987);
		ABook h2 = new Hardcover("Smile", "Chi T", 12.39, 2000);
		assertTrue(h1.sameAuthor(h2));
	}

}
