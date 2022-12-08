package listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex1 {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		
		countries.add("Viet Nam");countries.add("Lao");
		countries.add("Nga");countries.add("USA");
		
		//Using ListIterator to display contents of countries list
		ListIterator<String> iter = countries.listIterator();
		while(iter.hasNext()) {
			String element = iter.next();
			iter.set(element+" 1");
			System.out.println(element);
		}
		//
		while(iter.hasPrevious()) {
			String element = iter.previous();
			System.out.println(element);
		}
	}
}
