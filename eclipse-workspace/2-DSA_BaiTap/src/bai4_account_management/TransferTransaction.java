package bai4_account_management;

import java.util.Date;

public class TransferTransaction extends Transaction{
	private int recipientAccountNumber;//So Tk nhan

	//This is Constructor of TransferTransaction
	public TransferTransaction(int id, Date date, double amount, int recipientAccountNumber) {
		super(id, date, amount);
		this.recipientAccountNumber = recipientAccountNumber;
	}
	//getter & setter
	public int getRecipientAccountNumber() {
		return recipientAccountNumber;
	}

	public void setRecipientAccountNumber(int recipientAccountNumber) {
		this.recipientAccountNumber = recipientAccountNumber;
	}
	@Override
	public String toString() {
		return "TransferTransaction: "+ "id=" + id 
				+", date=" + date.getDay()+"/"+date.getMonth()+"/"+date.getYear()
				+ ", amount=" + amount +", soTK nhan: "+ recipientAccountNumber +"]";
	}
	
	@Override
	public Transaction over2Million() {
		if(this.amount >= 2000000) return this;
		else return null;
	}
}
