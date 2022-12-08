package BaiTapNLU;

import java.util.Random;
import java.util.Scanner;

public class Bai7_random {
	/**
	 * 
	 */
	public static int chonSo() {
		System.out.println("\n---Moi nguoi chi co 2 luot choi!---");
		Scanner sc =new Scanner(System.in);
		System.out.print("Moi ban chon So(1-100): ");
		int x =sc.nextInt();
		
		if((0>=x)||(x>100)) {
		System.out.println("Chon khong dung se khong trung!!! :>");
		}
		System.out.println("So ban vua chon: "+x);
		return x;
	}
	/**
	 * 
	 */
	public static void ketQua() {
		int i = chonSo();
		Random r = new Random();
		int kQ = r.nextInt(100);
		int c =1;
		
		while(true) {
			if(i==kQ) {
				System.out.println("***Chuc mung ban da doan dung***");
				break;
			}
			else {
				if(i < kQ) {
					System.out.println("So ban chon nho hon KQ! Moi ban doan lai");
					int i1= chonSo();
					i  = i1;
				}else {
					System.out.println("So ban chon lon hon KQ! Moi ban doan lai");
					int i1= chonSo();
					i  = i1;
				}
			}
			c++;
			int l = 2-c;
			System.out.println("So luot choi con lai:"+l);
			if(c==2) {
				System.out.println("Het luot choi!");
				break;
			}
		}
	}
	/**
	 * Test
	 */
	public static void main(String[] args) {
		ketQua();
	}
}
