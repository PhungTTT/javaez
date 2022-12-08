package BaiTapNLU;

import java.util.Arrays;

public class Baii17_maxMinInArray {
		//MAX
		public static int findMaxItem(int[] arr) {
			int max = arr[0];
			for(int i = 1; i<arr.length;i++) {
				if(arr[i] > max) {
					max =arr[i];
				}
			}
			return max;
		}
		//MIN
		public static int findMinItem(int[] arr) {
			int min = arr[0];
			for(int i = 1; i<arr.length;i++) {
				if(arr[i] < min) {
					min =arr[i];
				}
			}
			return min;
		}
		//position
		public static int pos(int[] arr) {
			int max = findMaxItem(arr);
			int i;
			for(i = 0;i< arr.length;i++) {
				if(arr[i]==max) break;
			}
			return i;
			
		}
		//Sum
		public static int s(int[] arr) {
			int max = findMaxItem(arr);
			int count = 0;
			for(int i =0; i<arr.length;i++) {
				if(arr[i]==max) {
					count++;
				}
			}
			int s=max*count;
			return s;
		}
		
		//Test
		public static void main(String[] args) {
			int[] arr= {3,2,9,6,1,9};
			System.out.println(Arrays.toString(arr));
			System.out.println("Max:"+findMaxItem(arr));
			System.out.println("Min:"+findMinItem(arr));
			System.out.println("Firts_Max_Position: "+pos(arr));
			System.out.println("SumMax: "+s(arr));
		}
}
