package Ex4_2and4_5Record;
import junit.framework.*;
public class IGalleryTest extends TestCase {
	/**
	 * Test for Constructor
	 */
	public void testConstructor() {
		// Test for class GIF
		IGallery g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
		// Test for class TXT
		IGallery t1 = new TXT("stored in welcome", 5.312, 830);
		//Test for class MP3
		IGallery m1 = new MP3("stored in theme", 40960.0, 200.0);
	}
	/**
	 * Test for timeToDownload()
	 */
	public void testTimeToDownload() {
		// Test for class GIF
		IGallery g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
		assertEquals(g1.timeToDownload(5*1024),0.01,0.01);
		// Test for class TXT
		IGallery t1 = new TXT("stored in welcome", 5.312, 830);
		assertEquals(t1.timeToDownload(1024),0.0052,0.0001);
		//Test for class MP3
		IGallery m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertEquals(m1.timeToDownload(1*1024*1024),0.039,0.001);
	}
	/**
	 * Test for smallerThan()
	 */
	public void testSmallerThan() {
		//Test for class GIF
		IGallery g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertTrue(g1.smallerThan(60.12));
	    assertFalse(g1.smallerThan(56.32));
	    // Test for class TXT
	    IGallery t1 = new TXT("stored in welcome", 5.312, 830);
		assertTrue(t1.smallerThan(6.12));
		assertFalse(t1.smallerThan(5.12));
		//Test for class MP3
		IGallery m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertTrue(m1.smallerThan(50000.24));
	    assertFalse(m1.smallerThan(34020.1));
	}
	/**
	 * Test for sameName()
	 */
	public void testSameName() {
		IGallery g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertTrue(g1.sameName("stored in flower"));
	    assertFalse(g1.sameName("stored in welcome"));
	    
	    IGallery t1 = new TXT("stored in welcome", 5.312, 830);
		assertTrue(t1.sameName("stored in welcome"));
	    assertFalse(t1.sameName("stored in flower"));
		
		
		IGallery m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertTrue(m1.sameName("stored in theme"));
	    assertFalse(m1.sameName("stored in flower"));
	}
}
