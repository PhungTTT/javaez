package Ex4_2and4_5Record;

public abstract class AGallery implements IGallery {
	protected String name;
	protected double size;
	/**
	 * 
	 * @param name
	 * @param size
	 */
	public AGallery(String name, double size) {
		super();
		this.name = name;
		this.size = size;
	}
	/**
	 * which computes how long it takes to download a file at some network connection speed
	 * typically given in bytes per second
	 * Example:
	 * 	ARecord g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertEquals(g1.timeToDownload(5*1024),0.01,0.01);
	    
	    ARecord t1 = new TXT("stored in welcome", 5.312, 830);
		assertEquals(t1.timeToDownload(1024),0.0052,0.0001);
		
		ARecord m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertEquals(m1.timeToDownload(1*1024*1024),0.039,0.001);
	 * @param networkSpeed  (double)
	 * @return double
	 */
	public double timeToDownload(double networkSpeed) {
		return this.size / networkSpeed;
	}
	/**
	 * which determines whether the file is smaller than some given maximum size that can be
	 *  mailed as an attachment
	 *  Example:
	 *  ARecord g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertTrue(g1.smallerThan(60.12));
	    assertFalse(g1.smallerThan(56.32));
	    
	    ARecord t1 = new TXT("stored in welcome", 5.312, 830);
		assertTrue(t1.smallerThan(6.12));
	    assertFalse(t1.smallerThan(5.12));
		
		
		ARecord m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertTrue(m1.smallerThan(50000.24));
	    assertFalse(m1.smallerThan(34020.1));
	 *  @param sizeOther  (double)
	 *  @return boolean 
	 */
	public boolean smallerThan(double sizeOther) {
		return this.size < sizeOther;
	}
	/**
	 * which determines whether the name of a file is the same as some given name.
	 * Example:
	 * 	ARecord g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertTrue(g1.sameName("stored in flower"));
	    assertFalse(g1.sameName("stored in welcome"));
	    
	    ARecord t1 = new TXT("stored in welcome", 5.312, 830);
		assertTrue(t1.sameName("stored in welcome"));
	    assertFalse(t1.sameName("stored in flower"));
		
		
		ARecord m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertTrue(m1.sameName("stored in theme"));
	    assertFalse(m1.sameName("stored in flower"));
	 * @param nameOther (String)
	 * @return boolean
	 */
	public boolean sameName(String nameOther) {
		return this.name.equals(nameOther);
	}
}
