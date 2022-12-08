package task2;
import java.util.Arrays;

import junit.framework.TestCase;

public class ProductManagementTest extends TestCase {
	Product  p1 = new DomesticProduct("V1","Hao Hao", 3500);
	Product  p2 = new DomesticProduct("V2","Sua tuoi Vinamilk", 8000);
	Product  p3 = new DomesticProduct("V3","Dep to ong", 10000);
	Product  p4 = new ImportedProduct("N1","Iphone 14 Pro Max 1TB",50000000,"My");
	 
	Product[] products = {p1,p2,p3,p4};
	ProductManagement list = new ProductManagement(products);
	//Test COntructor
	public void testConstrucctor() {
		list.display();
	}
	//Test howManyDomesticProducts Method
	public void testHowManyDomesticProducts() {
		assertEquals(list.howManyDomesticProducts(),3);
		System.out.println("howManyDomesticProducts? =>"+list.howManyDomesticProducts());
	}
	//Test filterProductsByPrice Method
	public void testFilterProductsByPrice() {
		System.out.println("Sau khi loc: \n"+Arrays.toString(this.list.filterProductsByPrice(5000)));
	}
}
