package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Ex1 {
	public static void main(String[] args) {
		Integer[] arr = {1,3,5,7,9};
		Iterator<Integer> iter = Arrays.asList(arr).iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
