package lab3_task1;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
private int[] array;
	public MyArray(int[] array) {
	this.array = array;
	}
/*
 * Task 1_1: linear search
 */
	// To find the index of the target in the array. If the target
	// is not found	
	// in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		for(int i=0;i<array.length;i++) {
			if(target==array[i]) return i;
		}
		return -1;
	}
	// To find the index of the target in the array. If the target
	// is not found
	// in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearchHelp(target,array.length-1);
	}
	public int recursiveLinearSearchHelp(int target, int n) {
		if(n<0) {
			return -1;
		}else {
			if(target == array[n]) {
				return n;
			}else {
				return recursiveLinearSearchHelp(target, --n);
			}
		}
	}
/*
 * Task 1_2: BinarySearch
 */
	// To find the index of the target in the sorted array. If the target is not
	// found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int left =0;
		int right = array.length-1;
		
		while (left<=right) {
			int mid = (right+left)/2;
			if(array[mid]==target) return mid;
			if(array[mid]>target) {
				right= mid -1;
			}else {
				left = mid +1;
			}
		}
	return -1;
	}
	// To find the index of the target in the sorted array. If the target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {
		Arrays.sort(array);
		return recursiveBinarySearchHelp(target,0,array.length-1);
	}
	public int recursiveBinarySearchHelp(int target,int left,int right) {
		if(left<=right) {
			int mid = (left+right)/2;
			if(array[mid] == target) return mid;
			if(array[mid] > target) {
				return recursiveBinarySearchHelp(target, left, mid-1);
			}else {
				return recursiveBinarySearchHelp(target, mid+1, right);
			}
		}else {
			return -1;
		}
	}
	/*
	 * TEST
	 */
	public static void main(String[] args) {
		int arr[] = {2,3,11,8,4,6,3,8};
		System.out.println(Arrays.toString(arr));
		System.out.println("Input targe?");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		MyArray m = new MyArray(arr);
		System.out.println("LinearSearch: "
				+m.iterativeLinearSearch(t)
				+" & "+m.recursiveLinearSearch(t));
		
		System.out.println("BinarySearch: "
				+m.iterativeBinarySearch(t)
				+" & "+m.recursiveBinarySearch(t));
	}
}
