package BaiTapNLU;

import java.util.Arrays;
import java.util.Scanner;

public class Baii_10_SXTrongMang {
	
	/**
	 * Sap xep
	 * @param args
	 */
		//Tang Dan:
			public static void tangDan(int[] a) {//a={3,2,5,4}
				for(int i = 0; i < a.length-1; i++) { //i= 0 -> 2
					int temp = a[i];//temp =3 2 5 4 
					for(int j = i+1; j < a.length;j++) { //j =1 -> 3
						if(temp > a[j]) {
							a[i] = a[j];
							a[j] = temp;
							temp =a[i];
						}
					}
				}
				System.out.print("SX TANG DAN: "+Arrays.toString(a));
			}
		//Giam Dan:
				public static void giamDan(int[] a) {
					for(int i = 0; i < a.length-1; i++) {
						int temp = a[i];
						for(int j = i+1; j < a.length;j++) {
							if(temp < a[j]) {
								a[i] = a[j];
								a[j] = temp;
								temp =a[i];
							}
						}
					}
					System.out.print("SX GIAM DAN: "+Arrays.toString(a));
				}
	/**
	 * Test
	 * @param args
	 */
			public static void main(String[] args) {
			//Nhap cac phan tu trong mang
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap do dai cua mang: ");
				int n = sc.nextInt();
				int[] a = new int[n];
				
				System.out.println("Nhap phan tu cua Mang:");
				for(int i=0; i<a.length;i++) {
					a[i] = sc.nextInt();
				}
				
				System.out.print("Mang nhan duoc: ");
					System.out.println(Arrays.toString(a));
					
			//Sap Xep
					System.out.println("\n---Nhap 1 de SX Tang Dan, 0 de Giam Dan---");
					int luaChon = sc.nextInt();
				if(luaChon == 1 ) {tangDan(a);
				}
				else { if(luaChon == 0) {
						giamDan(a);
					}System.out.println("NHap sai!");
				}
	}
}
	
