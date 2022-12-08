package task1;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,4,4,3,5,2,3};
		System.out.println("Array = "+Arrays.toString(arr));
		MyArray m = new MyArray(arr);
		System.out.println("Dem Le: "+m.countOddNumbers());
		System.out.println("So Chan Thu 2: "+m.indexOfSecondEvenNumber());
		System.out.println("Test mirror():  "+Arrays.toString(m.mirror()));
		System.out.println(	m.getMode());
		System.out.println("Test getUniqueElements: "+Arrays.toString(m.getUniqueElements()));
		System.out.println("getDistinctElements: "+Arrays.toString(m.getDistinctElements()));
	}
}
