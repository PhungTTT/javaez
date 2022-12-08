package Cau1;


public class cau1 {
	public static int count(int[] array,int k) {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==k) {
				count++;
			}
		}
		return count;
	}
	// cau a
	public static void apear1Time(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(count(array,array[i])==1) {
				System.out.println("Cac so chi xuat hien 1 lan la: "+array[i]);
			}
		}
	}
	// cau b
	public static void appearTime (int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if(!exited(array,i))
			System.out.println("So lan xuat hien: f("+array[i]+")="+count(array,array[i]));
		}
	}
	private static boolean exited(int[] array, int i) {
		for (int j = i-1; j >=0; j--) {
			if(array[i]==array[j]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array= {7,7,5,12,5,12,7,3,5,7};
		System.out.println(exited(array,5));
		apear1Time(array);
		appearTime(array);
	}
}
