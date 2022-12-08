package bai1_ordermanager;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Order implements Comparable<Order> {
	private String id;
	private String customer;
	private String employee;
	private Date date;
	private List<OrderItem> items;
	/**
	 * @param id
	 * @param customer
	 * @param employee
	 * @param date
	 * @param items
	 */
	public Order(String id, String customer, String employee, Date date, List<OrderItem> items) {
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.date = date;
		this.items = items;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "Order [id: " + id + ", customer: " + customer + ", employee: " + employee + ", date: " + date.getDay()
		+"/"+date.getMonth()+"/"+date.getYear() + ", items: "
				+ items + "]";
	}
	/*
	 * Tim sp co gia cao nhat trong 1 list hoa don
	 */
	public Product maxProduct() {
		Product re = items.get(0).getItem();
		for(int i=1;i<items.size();i++) {
			if(re.getPrice()<items.get(i).getItem().getPrice()) {
				re = items.get(i).getItem();
			}
		}
		return re;
	}
	/*
	 * Tra ve loai san pham va so luong ban ra cho moi loai
	 */
	public HashMap<String, Integer> productTypesStatistics(){
		HashMap<String, Integer> re = new HashMap<>();
		for (OrderItem i : items) {
			if(re.containsKey(i.getItem().getType())) {
				re.put(i.getItem().getType(), re.get(i.getItem().getType())+i.getAmount());
			}else {
				re.put(i.getItem().getType(), i.getAmount());	
			}
		}
		return re;
	}
	//Tong tien cua 1 Order (nhieu OrderItem)
	public int  costOrder() {
		int re = 0;
		for(int i=0;i<items.size();i++) {
			re += items.get(i).costItem();
		}
		return re;
	}
	@Override
	public int compareTo(Order o) {
		if(costOrder()!=o.costOrder()) {
			return -costOrder()+o.costOrder();
		}else {
			return date.hashCode()-date.hashCode();
		}
	}
}
