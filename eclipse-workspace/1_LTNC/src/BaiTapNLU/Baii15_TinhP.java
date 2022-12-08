package BaiTapNLU;

import java.util.Scanner;

public class Baii15_TinhP {
	/*
	 * P=1+x+x2+...+nx
	 */
	public static void tinhP1(int x, int n) {
		long p = 1;
		for(int i = 1; i<=n; i++) {
			p +=i*x;
		}
		System.out.println("result: "+p);
	}
	/*
	 * P=1-x+x2-...+nx
	 */
	public static void tinhP2(int x, int n) {
		double p = 1;
		for(int i = 1; i<=n; i++) {
			if(i%2 == 0) {
				p +=(double)i*x;
			}
			else {
				int j=i*-1;
				p +=(double)j*x;
			}
		}
		System.out.println("result: "+p);
	}
	/*
	 *  S = 1+ x/1! +(x^2)/2! +...+(x^n)/n!
	 */
	
	//Tinh Giai Thua n!
	public static  long tinhGiaiThua(int n) {
		long gt = 1;
		for(int i =1; i <= n;i++) {
			gt *=i;
		}
		return gt;
	}
	//Bai toan
	public static void tinhP3(int x, int n) {
		double s =1;
		for(int i =1; i<=n;i++) {
			s +=(double) Math.pow(x, i)/tinhGiaiThua(i);
		}
		System.out.println("result: "+s);
	}
	/**
	 * Test
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lua chon cong thuc! Chon 1,2,3 lan luot theo cong thuc sau!\n"
				+ "1. P=1+x+x2+...+nx\n"
				+ "2. P=1-x+x2-...+nx\n"
				+ "3. S = 1+ x/1! +(x^2)/2! +...+(x^n)/n!");
		int luaChon =sc.nextInt();
		
		System.out.println("Nhap x & n:");
		int x = sc.nextInt();
		int n = sc.nextInt();
		if((0<luaChon) && (luaChon<4)){
			switch(luaChon) {
			case 1: tinhP1(x,n);
				break;
			case 2: tinhP2(x,n);
				break;
			case 3: tinhP3(x,n);
				break;
			}
		}
	}
}
