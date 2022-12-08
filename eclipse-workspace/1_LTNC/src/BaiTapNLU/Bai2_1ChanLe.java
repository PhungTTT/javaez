package BaiTapNLU;
import java.util.Scanner;
public class Bai2_1ChanLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		try {
			
			System.out.println(" Nhap So Nguyen: ");
			 x = sc.nextInt();
			
			if(x%2 == 0 || x ==2) {
				System.out.println(x + " La so Chan");
			}
			else {
				System.out.println(x + " La so Le");
			}
		}catch(Exception e){
			System.out.println("Vui long Nhap So Nguyen!");
		}
	}
}
