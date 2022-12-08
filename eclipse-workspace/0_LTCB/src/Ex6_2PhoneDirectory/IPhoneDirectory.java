package Ex6_2PhoneDirectory;

public  interface  IPhoneDirectory {
	/**
	 * 
	 * Example:
	 * APhone p1 = new APhone("Long Dai Hiep","0365874529");
		APhone p2 = new APhone(" O ","0354058723");
		APhone p3 = new APhone("Mr.Michen","0354058723");
		APhoneDirectory d0 = new MTPhoneDirectory();
		APhoneDirectory d1 = new ConsPhoneDirectory(p1,new MTPhoneDirectory());
		APhoneDirectory d2 = new ConsPhoneDirectory(p2,d1);
		APhoneDirectory d3 = new ConsPhoneDirectory(p3,d2);
		  
		APhoneDirectory all = new ConsPhoneDirectory(p3,
									new ConsPhoneDirectory(p2,
										new ConsPhoneDirectory(p1,new MTPhoneDirectory())));
		assertEquals(all.whoseNumber("0365874529"),"Long Dai Hiep");
	 * @param phoneNumberFind
	 */
	public IPhoneDirectory whoseNumber(String nameORNumberFind);
}
