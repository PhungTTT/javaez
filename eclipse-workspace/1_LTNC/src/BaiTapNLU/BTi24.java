package BaiTapNLU;

import java.util.Scanner;

public class BTi24 {
	//a) S = 1+1+..+n
	public static long s(int n) {
		int s =0;
		for(int i =0; i<=n;i++) {
			s+=i;
		}
		System.out.println("result: s="+s);
		return s;
	}
	//b) In n! = 1 x 2 x...x n.
	public static void giaiThua(int n) {
		long gt =1;
		System.out.print(n+"! =");
		for(int i =1; i<=n;i++) {
			System.out.print(i);
			if(i != n) {
				System.out.print(" x ");
			}else {
				System.out.print(".");
			}
			gt *=i;
		}
		System.out.println("\nResult: n!="+gt);
	}
	//Test
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		s(n);
		giaiThua(n);
	}
}
