package Ex2_2;
import junit.framework.*;
public class TheaterTest extends TestCase {
	public void testConstrcutor () {
		new Theater(5,20,0.5);
		new Theater(8,25,0.5);
		new Theater(4,20,0.5);
	}
	public void totalProfit() {
		assertEquals(new Theater(5,20,0.5).totalProfit(1000),4480);
		Theater Theater1 = new Theater(8,25,0.5);
		Theater Theater2 = new Theater(10,30,0.5);
		assertEquals(Theater1.totalProfit(800),5975);
		assertEquals(Theater2.totalProfit(800),7570);
	}
}		