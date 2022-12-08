package Ex2_5;
import junit.framework.*;
public class JetFuelTest extends TestCase {
	public void testConstructor() {
		new JetFuel(40000,"low",3.16);
		new JetFuel(30000,"medium",4.68);
	}
	public void testtotalCost () {
		assertEquals(new JetFuel(110000,"low",3.16).totalCost(),347600.0);
		assertEquals(new JetFuel(60000,"medium",4.68).totalCost(),280800.0);
	}
	public void testdiscountPrice() {
		assertEquals(new JetFuel(110000,"low",3.16).discountPrice(),312840.0);
		assertEquals(new JetFuel(60000,"medium",4.68).discountPrice(),280800.0);
	}

}
