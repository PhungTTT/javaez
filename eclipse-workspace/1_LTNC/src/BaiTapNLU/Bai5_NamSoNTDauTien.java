package BaiTapNLU;

import java.util.Scanner;

public class Bai5_NamSoNTDauTien {
	/**
	 * Thuat Toan
	 */
	
		//check SNT
		public static boolean ktSNT(int n) {
			int count=0;//dem so lan chia het cua n
			
			for (int i = 1; i <=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count>2) return false;
			return true;
		}
		// Xuat 5 So Nguyen To bat dau tu max(a,b)
		public static void NamSoNT(int a, int b) {
			int max = Math.max(a, b);
			int count =0;
			while(count <= 5) {
				if(ktSNT(++max)) {
					count++;	
					System.out.print(max +", ");
				}
			}
			System.out.println();
		}
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap lan luot a va b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("KQ: ");
			NamSoNT(a,b);
		}
}
