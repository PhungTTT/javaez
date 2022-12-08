package bai1_ordermanager;

public class OrderItem {
	private Product item;
	private int amount;
	/**
	 * @param item
	 * @param amount
	 */
	public OrderItem(Product item, int amount) {
		this.item = item;
		this.amount = amount;
	}
	public Product getItem() {
		return item;
	}
	public void setItem(Product item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	//
	@Override
	public String toString() {
		return "OrderItem [item=" + item + ", amount=" + amount + "]";
	}
	
	//Tong so tien trong 1 OrderItem
	public int costItem() {
		return amount*getItem().getPrice();
	}
	
}
