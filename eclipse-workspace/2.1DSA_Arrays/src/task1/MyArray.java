package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
	private int[] array;
	
	
	public MyArray(int[] array) {
		this.array = array;
	}
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	// Count the number of odd numbers in the array
	// Dem Le
	public int countOddNumbers() {
		int count = 0;
		for(int i=0; i<array.length;i++) {
			if(array[i]%2!=0) count++;
		}
		return count;
	}

	// get the index of the second even number in the array return -1 (if not)
	// Lay chan thu 2, neu ko co=> return -1
	public int indexOfSecondEvenNumber() {
		int count =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) count++;
			if(count==2) {
				return array[i];
			}
		}
		return -1;
	}

	// Method mirror that outputs the contents of an array in a reverse 	
	//order like a mirror 
	//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int[] result = new int[array.length*2];
		System.arraycopy(array, 0, result, 0,(result.length/2));
		
		for(int i=0; i< array.length; i++) {
			int k =result.length-(i+1);
			result[k] = array[i];
		}
		return result;
	}

	// GET the element which its occurence is the most in the array.
	//Xuat hien nhieu nhat => idea: sap xep roi tim
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 10
	public int getMode() {
		//tao mang chua count 
		int[] temp = new int[array.length];
		
		for(int i =0; i<array.length;i++) {
			int count =0;
			for(int j=0; j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
				}
			}
			temp[i]=count;
		}
		//Tim max va Vt
		int vt1 =0;
		int max = temp[0];
		for(int i =0; i<temp.length; i++) {
			if(max < temp[i]) {
				max = temp[i];
				vt1 = i;
			}
		}
		return array[vt1];
	}

	// GET uniqueb elements in the array.
	// Cac phan tu duy nhat
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 9, 2
	public int[] getUniqueElements() {
		int[] result = new int[array.length];

		for(int i =0; i<array.length;i++) {
			int count =0;
			for(int j=0; j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
				}
			}
			if(count==1) {
				result[i]=array[i];
			}
		}
		return result;
	}

	// GET distinct elements in the array.
	// Cac phan tu rieng biet
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 10, 9, 45, 2
	public int[] getDistinctElements() {
			int[] result = new int[array.length];
		for(int n=0;n<array.length;n++) {
			if(n==0) {
				if(array[n]!=array[1]) {
					result[n] = array[0];
				}
			}else if(n==array.length-1) {
				if(array[n]!=array[n-1]) {
					result[n] = array[n];
				}
			}else {
				if(array[n]!=array[n-1]&&array[n]!=array[n+1]) {
					result[n] =  array[n];
				}
			}
		}
		return result;
	}

	public static void display() {
	}
}
