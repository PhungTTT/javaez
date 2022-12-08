package bai1_ordermanager;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class OrderManger {
	private List<Order> orders;

	/**
	 * @param orders
	 */
	public OrderManger(List<Order> orders) {
		this.orders = orders;
	}
	/*
	 * Tim sp co price cao nhat
	 */
	public Product maxProduct() {
		Product re = orders.get(0).maxProduct();
		for(int i =1; i<orders.size();i++) {
			if(re.getPrice()<orders.get(i).maxProduct().getPrice()) {
				re = orders.get(i).maxProduct();
			}
		}
		return re;
	}
	/*
	 * Tra ve loai san pham va so luong ban ra cho moi loai
	 */
	public HashMap<String, Integer> productTypesStatistic(){
		HashMap<String, Integer> re = orders.get(0).productTypesStatistics();
		for(int i=1;i<this.orders.size();i++) {
			//Thiet la moi me
			HashMap<String, Integer> temp = orders.get(i).productTypesStatistics();
			 for (java.util.Map.Entry<String, Integer> entry : temp.entrySet()) {
			        Integer old = re.get(entry.getKey());
			        Integer val = entry.getValue();
			        re.put(entry.getKey(), old != null ? old + val : val);
			    }
		}
		return re;
	}
	/**
	 * Tra ve hao don sap xep giam dan theo gia tri hoa don.Neu 2 hoa don cung gia tri xep theo ngay
	 */
	public TreeSet<Order> ordersByCost() {
		TreeSet<Order> re = new TreeSet<>();
		for(int i=0;i<this.orders.size();i++) {
			re.add(orders.get(i));
		}
		return re;
		
	}
	public static void main(String[] args) {
		Product p1 = new Product("Cocacola", "Nuoc Uong", 15000, new Date(2022,4,5));
		Product p2 = new Product("7Up", "Nuoc Uong", 15000, new Date(2022,4,5));
		Product p3 = new Product("Nuoc Suoi", "Nuoc Uong", 10000, new Date(2022,4,5));
		Product p4 = new Product("Kem", "Thuc An", 25000, new Date(2022,4,5));
		Product p5 = new Product("Banh Mi", "Thuc An", 15000, new Date(2022,4,5));
		
		OrderItem i1 = new OrderItem(p1, 50);OrderItem i2 = new OrderItem(p2, 25);
		OrderItem i3 = new OrderItem(p3, 100);OrderItem i4 = new OrderItem(p4, 20);
		OrderItem i5 = new OrderItem(p5, 30);
		
		OrderItem[] listItem1 = {i1,i2,i3,i4,i5};
		Order o1 = new Order("01", "Mr A","lbp", new Date(2022, 11, 1), Arrays.asList(listItem1));
		OrderItem[] listItem2 = {i1,i2};
		
		Order o2 = new Order("02", "Mrs B","lbp", new Date(2022, 10, 1), Arrays.asList(listItem2));
		
		OrderItem[] listItem3 = {i1,i2};
		Order o3 = new Order("03", "Mr C","lbp", new Date(2022, 9, 30), Arrays.asList(listItem3));
		//
		Order[] listOrder = {o1,o2,o3};
		OrderManger m = new OrderManger(Arrays.asList(listOrder));
		System.out.println("max price: "+m.maxProduct());//test method 1
		System.out.println("SL da ban: "+m.productTypesStatistic());//test method 2
		m.ordersByCost().forEach(t -> System.out.println(t));//test method 3
	}
}
