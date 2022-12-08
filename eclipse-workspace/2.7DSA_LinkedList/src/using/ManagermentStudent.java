package using;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ManagermentStudent {
	public static void main(String[] args) {
		List<Student> students = new LinkedList<Student>();
		
		students.add(new Student("HS 1", 19, 9));
		students.add(new Student("HS 2",19, 8));
		students.add(new Student("HS 3", 19, 7.6));
		students.add(new Student("HS 7", 20, 5.5));
		Student s6 = new Student("HS 6", 21, 9);
//		students.add(s6);
		students.add(new Student("HS 5", 18, 8.7));
		students.add(new Student("HS 4", 19, 7));
		
		
		System.out.println("DS ban dau:\n"+students.toString());
		/*
		 * contains(): -> true: khi truy cap dung vi tri bo nho
		 */
		System.out.println(students.contains(new Student("HS 4", 19, 6.7)));
		/*
		 * remove(): mac dinh xoa head, co the truyen vao index,object(dung vi tri cua bo nho)
		 */
		students.add(s6);
		System.out.println(students.toString());
		/*
		 * toArray
		 */
//		Object[] arr = students.toArray();
//		for (Object o : arr) {
//			System.out.print(o);
//		}
//		System.out.println();
//		/*
//		 * indexOf(): lay vi tri xuat hien dau, lastIndexIf(): lay vi tri xuat hien cuoi
//		 * => Ui object cung 1 bo nho thif chi co 1
//		 */
//		students.add(s6);
//		System.out.println(students.indexOf(s6));
//		System.out.println(students.lastIndexOf(s6));
//		/*
//		 * listIterator(): duyet
//		 */
//		ListIterator<Student> iter = students.listIterator();
//		while(iter.hasNext()) {
//			System.out.print(iter.next());
//		}
//		
	}
}
