package BaiTapNLU;

import java.util.Scanner;

public class BT20_Chia_Cho_5 {
	/*
	 * Chia cho 5
	 */
	public static int chiaHet(int x) {
		int count =0;
		
	switch(x) {
	//Chia het
	case 0: 
		for(int i =0; i<=100; i++) {
			if(i%5==0) {
				System.out.print(i+" ");
				count++;
			}
		}
	//Chia het du 1
	case 1:
			for(int i =0; i<=100; i++) {
				if(i%5==1) {
					System.out.print(i+" ");
					count++;
				}
			}
	case 2: 
			for(int i =0; i<=100; i++) {
				if(i%5==2) {
					System.out.print(i+" ");
					count++;
				}
			}
	case 3: 
			for(int i =0; i<=100; i++) {
				if(i%5==3) {
					System.out.print(i+" ");
					count++;
				}
			}
	case 4: 
		for(int i =0; i<=100; i++) {
			if(i%5==4) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
		System.out.println("\n=>count: "+count);
		return count;
	}
	/*
	 * Test
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so du khi chia cho 5(0-4): ");
		int x = sc.nextInt();
		chiaHet(x);
	}
}
