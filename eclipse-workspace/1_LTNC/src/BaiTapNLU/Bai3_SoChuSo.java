package BaiTapNLU;

import java.util.Scanner;

public class Bai3_SoChuSo {
	/*
	 * Thuat Toan
	 */
	public static int countDigit(int number) {
		int count =0;
		if(number == 0) {
			return ++count;
		}
		else {
		while (number != 0) {
			number /= 10;
			++count;	
	}
			return count;
		}
	}
	/*
	 * Test
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nhap So: ");
		int x = sc.nextInt();
		
		System.out.println("KQ: "+countDigit(x));
	}
}
