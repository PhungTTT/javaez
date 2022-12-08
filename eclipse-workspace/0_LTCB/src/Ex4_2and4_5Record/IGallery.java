package Ex4_2and4_5Record;

public interface IGallery {
	/*
	 * which computes how long it takes to download a file at some network connection speed
	 * typically given in bytes per second
	 * Example:
	 * 	IRecord g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertEquals(g1.timeToDownload(5*1024),0.01,0.01);
	    
	    IRecord t1 = new TXT("stored in welcome", 5.312, 830);
		assertEquals(t1.timeToDownload(1024),0.0052,0.0001);
		
		IRecord m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertEquals(m1.timeToDownload(1*1024*1024),0.039,0.001);
	 * @param  networkSpeed  (double)
	 * @return  double
	 */
	public double timeToDownload(double networkSpeed);
	/**
	 * which determines whether the file is smaller than some given maximum size that can be
	 *  mailed as an attachment
	 *  Example:
	 *  IRecord g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertTrue(g1.smallerThan(60.12));
	    assertFalse(g1.smallerThan(56.32));
	    
	    IRecord t1 = new TXT("stored in welcome", 5.312, 830);
		assertTrue(t1.smallerThan(6.12));
	    assertFalse(t1.smallerThan(5.12));
		
		
		IRecord m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertTrue(m1.smallerThan(50000.24));
	    assertFalse(m1.smallerThan(34020.1));
	 *  @param sizeOther  (double)
	 *  @return boolean 
	 */
	public boolean smallerThan(double sizeOther);
	/**
	 * which determines whether the name of a file is the same as some given name.
	 * Example:
	 * 	IRecord g1 = new GIF("stored in flower", 57.234, 100.0, 50.0,"medium");
	    assertTrue(g1.sameName("stored in flower"));
	    assertFalse(g1.sameName("stored in welcome"));
	    
	    IRecord t1 = new TXT("stored in welcome", 5.312, 830);
		assertTrue(t1.sameName("stored in welcome"));
	    assertFalse(t1.sameName("stored in flower"));
		
		
		IRecord m1 = new MP3("stored in theme", 40960.0, 200.0);
		assertTrue(m1.sameName("stored in theme"));
	    assertFalse(m1.sameName("stored in flower"));
	 * @param nameOther (String)
	 * @return boolean
	 */
	public boolean sameName(String nameOther);
}

