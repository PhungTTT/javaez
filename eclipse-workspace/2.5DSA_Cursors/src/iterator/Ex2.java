package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		
		countries.add("Viet Nam");countries.add("Lao");
		countries.add("Nga");countries.add("USA");
		
		//Using Iterator to display contents of countries list
		Iterator<String> iter = countries.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
	}
}
