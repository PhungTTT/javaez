package BaiTapNLU;

import java.util.ArrayList;
import java.util.Scanner;

public class BT21_number_ArrayList {
	public static void main(String[] args) {
		//Them phan tu
		ArrayList<Integer> number= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Cac So Nguyen Duong, Nhan 0 la so cuoi cung! ");
		loop: while(true) {
			number.add(sc.nextInt());
			if(number.get(number.size()-1)==0){
				break loop;
			}
		}
		// IN 
		System.out.print("Result: ");
		for(int i =  0; i< number.size();i++) {
			System.out.print(number.get(i)+" ");
		}
		//So lan nguoi dung nhap:
		System.out.println("\nCount : "+ number.size());
		//Average:
		double aver;
		int sum=0;
		for(int i = 0;i< number.size()-1;i++) {
			sum += number.get(i);
		}
		aver = (double) sum/number.size();
		System.out.println("Average: "+ aver);
}
	
}
