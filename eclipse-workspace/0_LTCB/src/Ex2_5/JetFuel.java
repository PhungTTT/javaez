package Ex2_5;

public class JetFuel {
	int quantitySold;    //So luong da ban (gallon)
	String quantityLevel;//Chat luong: low,medium,large
	double basePrice;    //Gia co ban: (cents/gallon)
	public JetFuel(int quantitySold, String quantityLevel, double basePrice) {
		this.quantitySold = quantitySold;
		this.quantityLevel = quantityLevel;
		this.basePrice = basePrice;
	}
	/**Xac dinh tong chi phi da ban
	 * 
	 * @return double
	 * Ex: new JetFuel(110000,"low",3.16).totalCost(),347600.0;
	 */
	double totalCost() {
	    return this.basePrice * this.quantitySold;
	}
	/** Chuong trinh giam gia 10% khi mua tren 100000 gallon
	 * 
	 * @return double
	 * Ex: new JetFuel(110000,"low",3.16).discountPrice(),312840.0;
	 */
	double discountPrice() {
		if(this.quantitySold > 100000) return this.basePrice * this.quantitySold*0.9;
		else return this.quantitySold * this.basePrice;
	}
}
