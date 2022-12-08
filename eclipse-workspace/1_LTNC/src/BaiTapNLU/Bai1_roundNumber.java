package BaiTapNLU;
public class Bai1_roundNumber {
	
	public static int roundNumber(double number) {//5.5	
		int x = (int) number;//5	
		if(x != number) {
			double z = Math.abs(x-number);//0.5
			
			if(z >= 0.5) {
				x++;
			}
		}
		System.out.println("KQ: "+x);
		return x;
	}
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		roundNumber(4.6);
	}
}
