package bai4_account_management;

import java.util.Date;

public class DepositTransaction extends Transaction {

	public DepositTransaction(int id, Date date, double amount) {
		super(id, date, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Transaction over2Million() {
		//Gui tien => null
		return null;
	}
	
}
