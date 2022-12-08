package EX2_7;

public class TransactionBank {
	String customerName;//Ten khach hang
	double depositAmount;//So tien goi vao Ngan hang:$
	int maturity;//Thoi gian dao han: nam
	TransactionBank(String customerName, double depositAmount,int maturity) {
			this.customerName = customerName;
			this.depositAmount = depositAmount;
			this.maturity = maturity;
		}
	/**Xac dinh so tien lai 
	 * The bank pays:
		 *  a flat 4% per year for deposits of up to $1,000,
		 *  a flat 4.5% for deposits of up to $5,000,
		 *  and a flat 5% for deposits of more than $5,000
		 *    
	 * @return Tien lai (double)
	 * Ex: new TransactionBank("Nguyen Van A", 7000, 4).interest(),350.0;
	 */
	double interest() {
		if (this.depositAmount < 1000) return this.depositAmount*0.04;
		if((this.depositAmount >= 1000) && (this.depositAmount <= 5000)) return this.depositAmount * 0.045;
		else return this.depositAmount * 0.05;
	}
	/**Xac dinh so tien duoc hoan von khi chi tieu
	 * One company returns
		 * 0.25% for the first $500 of charges,
		 * 0.50% for the next $1000,
		 * 0.75% for the next $1000 
		 * and 1.0% for everything above $2500.
	 * 
	 * @param chargerAmount (double):So tien chi tu the tin dung
	 * @return Tien hoan von (double)
	 * Ex: new TransactionBank("Nguyen Van A", 7000, 4).payBack(3000),18.75;
	 */
	double payBack (double chargerAmount) {
		if (chargerAmount <= 500) return 
				chargerAmount * 0.0025;
		if ((chargerAmount >500) && (chargerAmount <= 1500)) return 
				500 * 0.0025 + (chargerAmount - 500) * 0.005;
		if ((chargerAmount >1500) && (chargerAmount <= 2500)) return 
				500*0.0025 + 1000*0.005 + (chargerAmount - 1500)*0.0075; 
		else return
				500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 +(chargerAmount - 2500)* 0.01;
	}
}
