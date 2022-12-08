package tuluyen;

import java.util.Arrays;

public class DaoNguocMang {
	public static void  reversePrint(int[] arr) {
		reversePrintHelp(arr,0,arr.length-1);
	}
	public static void  reversePrintHelp(int[] arr, int i,int j) {
		if(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			reversePrintHelp(arr,++i,--j);
		}
	}
	//Test
	public static void main(String[] args) {
		int arr[] = {3,2,9,1,0};
		System.out.print(Arrays.toString(arr));
		reversePrint(arr);
		System.out.println(" => "+Arrays.toString(arr));
	}
}
