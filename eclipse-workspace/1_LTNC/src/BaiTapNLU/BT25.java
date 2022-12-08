package BaiTapNLU;

import java.util.Scanner;

public class BT25 {
	//n!
	public static long gt(int n) {
		long gt = 1;
		for(int i =1; i <= n;i++) {
			gt *=i;
		}
		return gt;
	}
	//a) 1 + 1/1! + 1/2! +...+ 1/n! khi 1/n! < c
	
	public static double e1(int x, double c) {
		double e =1;
		for(int i =1;(double) 1/gt(i) < c;i++) {
			System.out.println((double) 1/gt(i));
				e += (double) 1/gt(i);
		}
		return e;
	}
	//b) e^x = 1 + x/1! + x^2/2! + ... + x^n/n! khi x^(n+1)/(n+1)! < c
	public static double e2(int x, double c) {
		double e = 1;
		for(int i =1;Math.pow(x,i+1)/gt(i+1) < c;i++) {
			e += Math.pow(x, i)/gt(i);
		}
		return e;
	}
	//c) sin(x) = x -x^3/3! +x^5/5!-x^7/7!+...+(-1)^n. (x^(2n+1))/(2n+1)! 
										//khi (x^(2n+1))/(2n+1)! <c
	public static double sin(int x, double c) {
		double sin = x;
		for(int i =1; (Math.pow(x, 2*i+1 ))/gt(2*i+1) < c; i+=2) {
			sin += Math.pow(i,(i+1)/2)* (Math.pow(x, i))/i;
		}
		return sin;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.CT: e = 1 + 1/1! + 1/2! +...+ 1/n!					khi 1/n! < c\n"
					   + "2.CT: e^x = 1 + x/1! + x^2/2! + ... + x^n/n! 			 	khi x^(n+1)/(n+1)! < c\n"
					   + "3.CT: sin(x) = x -x^3/3! +x^5/5!-x^7/7!+...+(-1)^n.(x^(2n+1))/(2n+1)!   khi (x^(2n+1))/(2n+1)! <c\n ---Nhap lua chon---");
		int luaChon = sc.nextInt();
		System.out.print("Nhap x:");
			int x = sc.nextInt();
		System.out.print("Nhap sai so c:");
			double c = sc.nextDouble();
		switch(luaChon) {
		case 1: System.out.println(e1(x,c));
		break;
		case 2: System.out.println(e2(x,c));
		break;
		case 3: System.out.println(sin(x,c));
		break;
		case 4:System.out.println(1/gt(5));
		System.out.println((double) 1/gt(5));
		System.out.println((double) (1/gt(5)));
		}
	}
}
