package bai4_account_management;

import java.util.Arrays;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Transaction t1 = new WithdrawalTransaction(1, new Date(2022,11,9), 200000);//rut
		Transaction t2 = new DepositTransaction(2, new Date(2022,11,9), 3000000);//goi
		
		Transaction t3 = new TransferTransaction(3, new Date(2022,11,7), 100000,12345);
		Transaction t4 = new TransferTransaction(4, new Date(2022,11,4), 3000000,54321);
		Transaction t5 = new TransferTransaction(5, new Date(2022,11,2), 2000000,12345);
		Transaction t6 = new TransferTransaction(6, new Date(2022,11,10), 5000000,99999);
		
		Transaction[] t = {t1,t2,t3,t4,t5,t6};
		Account a1 = new Account(77777, "lungbaphe", 2000000, "Chi Nhanh NLU", Arrays.asList(t));
		
		System.out.println(a1.transferOver2Million());
	}
}
