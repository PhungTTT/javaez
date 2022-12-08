package Ex2_1;
import junit.framework.*;
public class EmployeeTest extends TestCase{
public void testConstructor () {                             
	new Employee("Nam", 20);
	new Employee("Mai", 30);
	new Employee("Minh", 102);}
public void testWage() {                                     

	assertEquals(new Employee("Nam", 20).wage(), 240);

	Employee aEmployee1 = new Employee("Mai", 30);
	Employee aEmployee2 = new Employee("Minh", 102);
    assertEquals(aEmployee1.wage(), 360);
    assertEquals(aEmployee2.wage(), 1224);
}
public void testTax() {                                      

   assertEquals(new Employee("Nam", 40).tax(), 72.0, 0.001);

   Employee aEmployee1 = new Employee("Mai", 30);
   Employee aEmployee2 = new Employee("Minh", 102);
   assertEquals(aEmployee1.tax(), 54.0, 0.001);
   assertEquals(aEmployee2.tax(), 183.6, 0.001);
}
public void testNetpay() {                                  
   assertEquals(new Employee("Nam",40).netpay(),408.0, 0.001);
   Employee aEmployee1 = new Employee("Mai", 30);
   Employee aEmployee2 = new Employee("Minh", 102);
   assertEquals(aEmployee1.netpay(), 306.0, 0.01);
   assertEquals(aEmployee2.netpay(), 1040.4, 0.01);
}

public void testRaisedWage() {                             
   assertEquals(new Employee("Nam", 20).raisedWage(),254, 0.001);
   Employee aEmployee1 = new Employee("Mai", 30);
   Employee aEmployee2 = new Employee("Minh", 102);
   assertEquals(aEmployee1.raisedWage(), 374.0, 0.001);
   assertEquals(aEmployee2.raisedWage(), 1238.0, 0.001);
}

public void testCheckOverTime() {                          
   assertFalse(new Employee("Nam", 20).checkOverTime());
   Employee aEmployee1 = new Employee("Mai", 30);
   Employee aEmployee2 = new Employee("Minh", 102);
   assertFalse(aEmployee1.checkOverTime());
   assertTrue(aEmployee2.checkOverTime());
}
public void testTaxWithRate() {                            
   assertEquals(new Employee("Nam", 20).taxWithRate(),0.0, 0.001);
   Employee aEmployee1 = new Employee("Mai", 30);
   assertEquals(aEmployee1.taxWithRate(), 54.0, 0.001);
   Employee aEmployee2 = new Employee("Minh", 102);
   assertEquals(aEmployee2.taxWithRate(), 342.72, 0.001);
}
public void testNetpayWithRate() {
   assertEquals(new Employee("Nam", 20).netpayWithRate(),240.0, 0.001);
   Employee aEmployee1 = new Employee("Mai", 30);
   assertEquals(aEmployee1.netpayWithRate(), 306.0, 0.001);
   Employee aEmployee2 = new Employee("Minh", 102);
   assertEquals(aEmployee2.netpayWithRate(), 881.28, 0.001);
}
}