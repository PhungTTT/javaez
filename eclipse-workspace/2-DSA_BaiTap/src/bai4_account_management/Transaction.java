package bai4_account_management;

import java.util.Date;

public abstract class Transaction {
	protected int id;//ma Giao Dich
	protected Date date;//ngay GD
	protected double amount;//So tien
	//This is Constructor of Transaction
	public Transaction(int id, Date date, double amount) {
		this.id = id;
		this.date = date;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date.getDay()+"/"+date.getMonth()+"/"+date.getYear()
		+ ", amount=" + amount + "]";
	}
	/*
	 * kiem tra chuyen tien 
	 */
	public abstract Transaction over2Million();
}
