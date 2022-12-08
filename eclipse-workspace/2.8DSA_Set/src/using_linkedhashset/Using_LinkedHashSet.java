package using_linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import using_hashset.Student;

public class Using_LinkedHashSet {
	public static void main(String[] args) {
		//Duy tri vi tri con tro
		Set<Student> students = new LinkedHashSet<Student>();
		
		students.add(new Student(1,"A", 5));
		students.add(new Student(3,"A", 6));
		students.add(new Student(2,"C", 7));
		students.add(new Student(4,"B", 9));
		students.add(new Student(5,"B", 5));
		students.add(new Student(8,"D", 8));
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
	}
}
