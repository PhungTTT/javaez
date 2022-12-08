package lab7.set_student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class MyPredicates {
	// Remove every object, obj, from coll for which p.test(obj)
	// is true. (This does the same thing as coll.removeIf(p).)
	//Xoa phan tu theo dieu kien p true
	public static <T> void remove(Collection<T> coll, Predicate<T> p) {
		Iterator<T> iter = coll.iterator();
		while(iter.hasNext()) {
			T next = iter.next();
			if(p.test(next)) {
				iter.remove();
			}
		}
	}

	// Remove every object, obj, from coll for which
	// pr.test(obj) is false. (That is, retain the
	// objects for which the predicate is true.)
	//Xoa phan tu theo dieu kien p false
	public static <T> void retain(Collection<T> coll, Predicate<T> p) {
		Iterator<T> iter = coll.iterator();
		while(iter.hasNext()) {
			T next = iter.next();
			if(!p.test(next)) {
				iter.remove();
			}
		}
	}

	// Return a Set that contains all unique objects, obj,
	// from the collection, coll, such that p.test(obj)
	// is true.
	// unique => Tra ve Set
	public static <T> Set<T> collect(Collection<T> coll, Predicate<T> p) {
			Set<T> re = new HashSet<T>();
			Iterator<T> iter = coll.iterator();
			while(iter.hasNext()) {
				T next = iter.next();
				if(p.test(next)) {
					re.add(next);
				}
			}
		return re;
	}

	// Return the index of the first item in list
	// for which the predicate is true, if any.
	// If there is no such item, return -1.
	//Tra ve index ma p.test == true
	public static <T> int find(Collection<T> coll, Predicate<T> p) {
		int index =0;
		for(T l : coll) {
			if(p.test(l)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	/*
	 * Test
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(7);list.add(3);
		list.add(4);list.add(9);list.add(3);
		System.out.println("Before: "+list);
		MyPredicates.remove(list, new Even());
		System.out.println("After remove: "+list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);list2.add(7);list2.add(3);
		list2.add(4);list2.add(9);list2.add(3);
		MyPredicates.retain(list2, new Even());
		System.out.println("After retain: "+list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);list3.add(7);list3.add(3);
		list3.add(4);list3.add(9);list3.add(3);
		MyPredicates.collect(list3, new Even());
		System.out.println("After collect: "+list3);
		
		System.out.println("find: " + MyPredicates.find(list3, new Even()));
	}
}
