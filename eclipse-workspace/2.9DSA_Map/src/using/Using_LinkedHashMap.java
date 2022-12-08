package using;

import java.util.LinkedHashMap;
import java.util.Map;

public class Using_LinkedHashMap {
	public static void main(String[] args) {
		Map<Integer, String> lm = new LinkedHashMap<>();
		
		lm.put(1, "Dai");
		lm.put(3, "Hoc");
		lm.put(2, "Nong");
		lm.put(4, "Lam");
		
		System.out.println(lm);
	}
}
