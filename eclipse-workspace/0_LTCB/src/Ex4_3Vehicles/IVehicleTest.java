package Ex4_3Vehicles;
import junit.framework.*;
public class IVehicleTest extends TestCase{
	/**
	 * test for Constructor 
	 */
	public void testConstructor() {

	  AVehicle b1 = new Buses(30,3000.0);
	  AVehicle l1 = new Limos(7,750000.0);
	  AVehicle s1 = new Subways(500, 15000.0);
	  AVehicle c1= new Cars(4,200000.0);
	}
}

