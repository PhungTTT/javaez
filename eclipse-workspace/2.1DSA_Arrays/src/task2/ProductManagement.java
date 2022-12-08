package task2;

import java.lang.reflect.Array;

public class ProductManagement {
	private Product[] products;

	public ProductManagement(Product[] products) {
		this.products = products.clone();
	}
	/*
	 * Display
	 */
	public void display() {
		for(int i=0; i<this.products.length;i++) {
			System.out.println(products[i]);
		}
	}
	// How many domestic products?
	// Co bao nhieu san pham noi dia?
	public int howManyDomesticProducts() {
		int result = 0;
		for(int i=0; i<this.products.length;i++) {
			if(products[i].isDomestic()==true) {
				result += 1;
			}
		}
		return result;
		
	}

	// Get the country name which most products are imported from
	// Lay ten quoc gia nhap khau nhieu nhat
	public String getCountryHavingMostImportedProducts() {
		String result = null;
		
		return result;
	}

	// Filter products having prices higher than a given price
	// Loc san pham co gia cao h�n price
	public Product[] filterProductsByPrice(double price) {
		Product[] result = new Product[this.products.length];
		
		for(int i=0,j=0; i<this.products.length && j<result.length;i++) {
				if(this.products[i].getPrice()>price) {
					result[j]=this.products[i];
					j++;
				}
		}
		return result;
	}
}
