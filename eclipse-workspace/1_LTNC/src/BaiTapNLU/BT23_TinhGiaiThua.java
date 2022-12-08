package BaiTapNLU;

public class BT23_TinhGiaiThua {
		//Tinh Giai Thua n!
		public static  long tinhGiaiThua(int n) {
			long gt = 1;
			for(int i =1; i <= n;i++) {
				gt *=i;
			}
			System.out.println("Result: "+ gt);
			return gt;
	}
		public static void main(String[] args) {
			tinhGiaiThua(3);
		}
}
