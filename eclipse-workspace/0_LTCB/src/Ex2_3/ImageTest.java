package Ex2_3;

import junit.framework.TestCase;
public class ImageTest extends TestCase {
	
	public void testConstructor() {
		new Image(5,10, "small.fif","low");
		new Image (120,200,"med.gif","loe");
		new Image (1200,1000, "large.gif","hight");
	}
		Image Image1 = new Image(5,10, "small.fif","low");
		Image Image2 = new Image (120,200,"med.gif","loe");
		Image Image3 = new Image (1200,1000, "large.gif","hight");
	
	public void testisPortrait() {
		assertFalse(Image1.isPortrait());
	    assertFalse(Image2.isPortrait());
        assertTrue(Image3.isPortrait());}
	
	public void testsize() {
		assertEquals(new Image(5,10, "small.fif","low").size(),50.0);
		assertEquals(Image2.size(),24000.0);
		assertEquals(Image3.size(),1200000.0);
	}
	public void testisLager() {
		Image Image2 = new Image (120,200,"med.gif","loe");
		assertFalse(new Image(5,10, "small.fif","low").isLarger(Image2));
		assertTrue(Image3.isLarger(Image2));
		assertFalse(Image1.isLarger(Image3));
	}
	public void testsame() {
		assertTrue(Image1.same(new Image(10,5,"med.gif","loe")));
		assertTrue(Image1.same(Image2));
		assertTrue(Image1.same(Image3));
	}
	public void testsizeString() {
		assertEquals(new Image(5,10, "small.fif","low").sizeString(),"small");
		assertEquals(Image2.sizeString(),"medium");
		assertEquals(Image3.sizeString(),"large");
	}
	
	
	
	
}
