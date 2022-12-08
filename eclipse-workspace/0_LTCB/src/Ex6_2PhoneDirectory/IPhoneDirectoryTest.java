
package Ex6_2PhoneDirectory;

import junit.framework.TestCase;

public class IPhoneDirectoryTest extends TestCase {
	/**
	 * Test for Constructor
	 */
	public void testConstructor() {
		APhone p1 = new APhone("Long Dai Hiep","0365874529");
		APhone p2 = new APhone(" O ","0354058723");
		APhone p3 = new APhone("Mr.Michen","0354058723");
		  
		IPhoneDirectory d1 = new ConsPhoneDirectory(p1,new MTPhoneDirectory());
		IPhoneDirectory d2 = new ConsPhoneDirectory(p2,d1);
		IPhoneDirectory d3 = new ConsPhoneDirectory(p3,d2);
		  
		IPhoneDirectory all = new ConsPhoneDirectory(p3,
									new ConsPhoneDirectory(p2,
										new ConsPhoneDirectory(p1,new MTPhoneDirectory())));
	}
	/**
	 * Test for whoseNumber()
	 */
	public void testWhoseNumber() {
		APhone p1 = new APhone("Long Dai Hiep","0365874529");
		APhone p2 = new APhone(" O ","0354058723");
		APhone p3 = new APhone("Mr.Michen","0354058723");

		IPhoneDirectory d1 = new ConsPhoneDirectory(p1,new MTPhoneDirectory());
		IPhoneDirectory d2 = new ConsPhoneDirectory(p2,d1);
		IPhoneDirectory d3 = new ConsPhoneDirectory(p3,d2);
		  
		IPhoneDirectory all = new ConsPhoneDirectory(p3,
									new ConsPhoneDirectory(p2,
										new ConsPhoneDirectory(p1,new MTPhoneDirectory())));
		
		System.out.println(all.whoseNumber("0365874529"));
		System.out.println(all.whoseNumber("Mr.Michen"));
		
		
	}
}
