package bai4_account_management;

import java.util.Date;

public class WithdrawalTransaction extends Transaction{
	public WithdrawalTransaction(int id, Date date, double amount) {
		super(id, date, amount);
	}

	@Override
	public Transaction over2Million() {
		//Rut tien=> null
		return null;
	}

}
