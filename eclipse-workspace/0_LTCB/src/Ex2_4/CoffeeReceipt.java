package Ex2_4;

public class CoffeeReceipt {
	String kind;
	double price; //Gia co ban:$/pounds
	double weight;//Trong luong: pounds
	public CoffeeReceipt(String kind, double price, double weight) {
		super();
		this.kind = kind;
		this.price = price;
		this.weight = weight; 
	}
	/**Xac dinh chi phi phai tra
	 * trong luong < 5000 thi khong giam gia
	 * 5000 <= Trong luong <20000 thi giam 10%
	 * 20000 < Trong luong thi giam 25%
	 * @return double
	 * Ex: new CoffeeReceipt("HawaiianKona",0.66,4000).CoffeeReceipt(),2640;
	 */
	double costCoffee() {
		if (this.weight < 5000) return this.price*this.weight;
		else {
			if(5000 <= this.weight && this.weight < 20000) return 
					this.price*this.weight*0.9;
			else return this.price*this.weight*0.75;
		}
	}
}

