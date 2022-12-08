package splitIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.Locale.IsoCountryCode;

public class Ex {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		
		countries.add("Viet Nam");countries.add("Lao");
		countries.add("Nga");countries.add("USA");
		
		Spliterator<String> iter = countries.spliterator();
		
		while(iter.tryAdvance(country -> System.out.println(country+ " ")));
		// same 
		iter.forEachRemaining(country -> System.out.println(country +" "));
	}
}
