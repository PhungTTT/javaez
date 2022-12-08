package BaiTapNLU;

import java.util.Scanner;

public class Baii18_MaTrix {
	/**
	 * Cong 2 ma tran
	 */
	public static int[][] sumMatrix(int[][] mt1, int[][] mt2){
		 int[][] mt3 = new int[mt1.length][mt1[0].length];
		 
		 for(int i = 0; i< mt1.length;i++) {
			 for(int j =0 ; j<mt1[i].length;j++) {
				 mt3[i][j]= mt1[i][j] + mt2[i][j];
			 }
		 }
		 return mt3;
	}
	/**
	 * Nhan 2 ma tran
	 */
	
	public static int[][] multiplyMatrix(int[][] mt1, int[][] mt2){
		int[][] mt3 = new int [mt1.length][mt2[0].length];
		
		for(int i = 0; i< mt1.length;i++) {
			for(int j =0; j<mt2[0].length;j++) {
				for(int l =0; l< mt1[0].length;l++) {
					mt3[i][j] += mt1[i][l]*mt2[l][j];
				}
			}
		}
		return mt3;
	}
	
	public static int[][] input() {
		// Khai bao dong(r) va cot(c)
	    int soDong, soCot;
	    
	    Scanner sc = new Scanner(System.in);
	        
	    System.out.print("Nhap so dong: ");
	    soDong = sc.nextInt();
	    System.out.print("Nhap so cot: ");
	    soCot = sc.nextInt();
	        
	    // input
	    int[][] A = new int[soDong][soCot];
	  
	    for (int i = 0; i < soDong; i++) {
	        for (int j = 0; j < soCot; j++) {
	            System.out.print("Nhap phan tu thu [" + (i+1) + ", " + (j+1) + "]: ");
	            A[i][j] = sc.nextInt();
	        }
	    }
		return A;
	}
	        
	    // output to screen
	    public static void output(int[][] mt3) {
		for (int i = 0; i < mt3.length; i++) {
            for (int j = 0; j < mt3[0].length; j++) {
                System.out.print(mt3[i][j] + " ");
            }
            System.out.println("");
	}
	}
	    /**
	     * Test
	     */
	    public static void main(String[] args) {
	    	int[][] mt3;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap lua chon:(1.Cong hai mang; 2.Nhan hai mang)");
			int luaChon = sc.nextInt();
			System.out.println("---Nhap ma tran 1---");
			int[][] mt1 = input();
			System.out.println("---Nhap ma tran 2---");
			int[][] mt2 = input();
			System.out.println("KetQua: ");
			switch(luaChon) {
			case 1:
				mt3 = sumMatrix(mt1, mt2);
				output(mt3);
				break;
			case 2: 
				mt3 = multiplyMatrix(mt1,mt2);
				output(mt3);
			}
			
		}
}
