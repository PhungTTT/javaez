package using;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

	class Student {
		private String name;
		private int age;
		/**
		 * @param name
		 * @param age
		 */
		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student (" + name + ", " + age + ") ";
		}
		@Override
		public int hashCode() {
			return Objects.hash(age, name);//return name.hashCode(),...
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return age == other.age && Objects.equals(name, other.name);
		}
		
}
	public class Using_HashMap {
	public static void main(String[] args) {
		//Test 1
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("Dai",1);
		hm.put("Hoc",1);
		hm.put("Nong",2);
		hm.put("Lam",2);
		hm.put("Dai",9);
		
		System.out.println("Size: "+hm.size());
		System.out.println(hm);
		/*
		 * Test 2: Tra ve kieu doi tuong?
		 */
		HashMap<Student, Double> map = new HashMap<>();
		map.put(new Student("C", 19), 9.0);
		map.put(new Student("A", 19), 8.4);
		map.put(new Student("B", 19), 8.8);
		map.put(new Student("D", 19), 9.0);
		map.put(new Student("D", 19), 9.0);
		/*
		 * In ra man hinh
		 */
//		System.out.println(map);
		map.forEach((t, u) -> System.out.println(t+"="+u));
		/*
		 * Method?
		 */
		
	}
}