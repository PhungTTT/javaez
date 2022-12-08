package BaiTapNLU;

import java.util.Scanner;

public class Bai2_2KtSNT {
		//check soNT
		//input--> so nguyen
		//out--> true/false
		//proposed method: 1 so la so NT khi:
		// chi chi het cho va chinh no
		// so chia het %--> phan du =0
		//
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
		
		/*
		 * Test
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vui long nhap so nguyen: ");
			int x = sc.nextInt();
			
			System.out.println(ktSNT(x));
		}
	}
