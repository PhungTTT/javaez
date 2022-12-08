package bai4_account_management;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Account {
	private int accountNumber;
	private String accountHolders;
	private double balance;
	private String branch;
	private List<Transaction> listTransaction;
	//This is Constructor of Account
	public Account(int accountNumber, String accountHolders, double balance, String branch,
			List<Transaction> listTransaction) {
		this.accountNumber = accountNumber;
		this.accountHolders = accountHolders;
		this.balance = balance;
		this.branch = branch;
		this.listTransaction = listTransaction;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolders() {
		return accountHolders;
	}
	public void setAccountHolders(String accountHolders) {
		this.accountHolders = accountHolders;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public List<Transaction> getListTransaction() {
		return listTransaction;
	}
	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}
	//C2:
	public TreeSet<Transaction> transferOver2Million(){
		TreeSet<Transaction> re = new TreeSet<>(new Comparator<Transaction>() {

			@Override
			public int compare(Transaction o1, Transaction o2) {
				if(o1.date.hashCode()!=o2.date.hashCode()) {
					return o1.date.hashCode() - o2.date.hashCode();
				}else {
					return (int) (o1.over2Million().getAmount()-o2.over2Million().getAmount());
				}
			}
		});
		
		for(Transaction t : listTransaction) {
			if(t.over2Million()!=null) {
				re.add(t);
			}
		}
		return re;
	}
}
