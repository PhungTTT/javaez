package BaiTapNLU;

import java.util.Scanner;

public class BT22_PtBac2 {

	public static void main(String[] args) {
		System.out.println("PT Bac Hai: ");
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.print("a= ");
		a = sc.nextDouble();
		
		System.out.print("b= ");
		b = sc.nextDouble();
		
		System.out.print("c= ");
		c = sc.nextDouble();
		/**
		 * Thuat Toan
		 */
		//Delta
		double delta = Math.pow(b, 2)-4*a*c;
		//Giai
		if (a == 0) {
			double x = -1*c/b;
			System.out.println("PHUONG TRINH CO NGHIEM: "+ "x= "+ x);
			}
					
		else { 
			if(delta < 0) {
			System.out.println("PHUONG TRINH VO NGHIEM!");
			}
			else if(delta == 0) {
			double k = -b/(2*a);
			System.out.println("PHUONG TRINH CO NGHIEM KEP: "+ "x1=x2= "+k);
			}
			else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("PHUONG TRINH CO 2 NGHIEM: " +"x1= "+ x1 + "\t"+"x2= "+ x2);
			}	
		}
	}
}
