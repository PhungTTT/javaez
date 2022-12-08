package using_treeset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import using_hashset.Student;

public class Using_TreeSet {
	public static void main(String[] args) {
		Set<Student> students = new TreeSet<Student>();
		students.add(new Student(1,"A", 5));
		students.add(new Student(3,"A", 6));
		students.add(new Student(2,"C", 7));
		students.add(new Student(4,"B", 9));
		students.add(new Student(5,"B", 5));
		students.add(new Student(8,"D", 8));
		/*
		 * Chi Can Comparable/Comparator de TreeSet sapxep va cung đe xac dinh 2 ptu trung nhau
		 */
		System.out.println("TreeSet: "+students);
	}
}
