package using;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Using_TreeMap {
	public static void main(String[] args) {
		Map<Integer, String> tm = new TreeMap<>();
			
			tm.put(1, "Dai");
			tm.put(3, "Hoc");
			tm.put(2, "Nong");
			tm.put(4, "Lam");
			
			System.out.println(tm);
		
			
			Set<Map.Entry<Integer, String>> i = tm.entrySet();
			
			for(Map.Entry<Integer, String> e : tm.entrySet()) {
				tm.put(2, tm.get(9999)+"haha");
			}
			
			System.out.println("======");
			System.out.println(tm);
			
			
			
		/*
		 * Set<Map.Entry<K, V>> entrySet(): key & value luu trong 1 Set
		 */
//		Set<Map.Entry<Integer, String>> entry = tm .entrySet();
//		System.out.println(entry);
//		for(Map.Entry<Integer, String> e : entry) {
//			System.out.print(e.getKey()+" ");//duyet de lay tung key
//			System.out.print(e.getValue()+" ");//duyet de lay tung value
//		}
		
		/*
		 * Set keySet():
		 */
//		System.out.println(tm.keySet());
		/*
		 * Collection<V> value()
		 */
		System.out.println(tm.values());
		
		/*
		 * Thay doi value
		 */
//		for(Integer k : tm.keySet()) {
//			tm.put(k, tm.get(k)+"-");
//		}
//		System.out.println(tm);
		/*
		 * Tim key bang value
		 */
//		for(Map.Entry<Integer, String> e : tm.entrySet()) {
//			Integer k = e.getKey();
//			String v = e.getValue();
//			if(v.equals("Nong-")) {
//				System.out.println("key cua Nong: " +k);
//			}
//		}
	}
}
