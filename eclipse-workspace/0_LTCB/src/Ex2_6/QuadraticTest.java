package Ex2_6;
import junit.framework.TestCase;
public class QuadraticTest extends TestCase {
	public void testConstructor() {
		new Quadratic(0,1,3);
		new Quadratic(1,2,1);
		new Quadratic(-2,1,1);
		new Quadratic(2,2,3);
	}
Quadratic PT1 =  new Quadratic(1,2,1);
Quadratic PT2 = new Quadratic(-2,1,1);
Quadratic PT3 = new Quadratic(2,2,3);
	public void testcomputeDelta() {
		assertEquals(new Quadratic(0,1,3).computeDelta(),1.0);
		assertEquals(PT1.computeDelta(),0.0);
		assertEquals(PT2.computeDelta(),9.0);
		assertEquals(PT3.computeDelta(),-20.0);
	}
	public void testwhatKind() {
		assertEquals(new Quadratic(0,1,3).whatKind(),"degenerate");
		assertEquals(PT1.whatKind(),"one solution");
		assertEquals(PT2.whatKind(),"two solution");
		assertEquals(PT3.whatKind(),"none");
	}
}
