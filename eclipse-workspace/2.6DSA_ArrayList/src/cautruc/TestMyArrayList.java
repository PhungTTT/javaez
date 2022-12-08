package cautruc;

import java.util.ArrayList;

public class TestMyArrayList {
	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<>(3);
		
		System.out.println("Test isEmpty: "+list.isEmpty());
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(null);
		list.add(6);
		list.add(3);
		System.out.println("Size: "+list.size());
		System.out.println("Test isEmpty: "+list.isEmpty());
		System.out.println("Test toString: "+list.toString());
		
		list.add(2, 7);
		System.out.println("Test addAt: "+list.toString());
//		
		
	}
}
