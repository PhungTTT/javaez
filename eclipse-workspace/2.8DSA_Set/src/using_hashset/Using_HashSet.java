package using_hashset;

import java.awt.Desktop;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;

public class Using_HashSet {
	/*
	 * 1. HashSet sap xep theo hashCode: hashcode mac dinh
	 * 2. Loai bo 2 doi tuong trung nhau ma dc bo nho khac nhau??
		   => hashCode() + equals() phu hop => OK
	 */
	public static void main(String[] args) {
		//Test 1
		Set<String> hashSet1 = new HashSet<>();
		hashSet1.add("A");hashSet1.add("D");
		hashSet1.add("C");hashSet1.add("B");
		hashSet1.add(new String("A"));
		
		System.out.println(hashSet1);
		
		System.out.println("===========");
		//Test2:
		Set<Student> students = new HashSet<Student>();
		students.add(new Student(1,"A", 5));
		students.add(new Student(1,"A", 5));
		students.add(new Student(2,"C", 7));
		students.add(new Student(5,"B", 5));
		students.add(new Student(4,"B", 5));
		students.add(new Student(new Integer(4),"B", 9));
		System.out.println("HashSet: "+students);
		
		//C1:Xoa phan tu id = 4?
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			if(iter.next().getId()==4) {
				iter.remove();
			}
		}
		System.out.println(students);
		//C2: Xoa phan tu id = 5?
		for (Student student : students) {
			if(student.getId() == 5) {
				students.remove(student);
			}
		}
		System.out.println(students);
		//Lay phan tu: iterator() or foreach()
		for (Student student : students) {
			if(student.getId() == 1) {
				System.out.println(student);
			}
		}
		students.add(new Student(5,"B", 5));
		students.add(new Student(4,"B", 5));
		Student s = new Student(4,"B", 5);
		
	}
}
