package lab3_task2;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("A", "Le Ba Phung", 2003, 8.5);
		Student s2 = new Student("C", "PBlue", 2022, 9);
		Student s3 = new Student("B", "Haha", 2000, 8);
		Student s4 = new Student("E", "kkkk", 2003, 8.75);
		Student s5 = new Student("K", "Hehe", 2003, 10);//
		Student[] students = {s1,s2,s3,s4,s5};
		StudentManagement list = new StudentManagement(students);
		//Test findStudent mehthod
		System.out.println("1.Tim kiem theo Id = A: "+list.findStudent("A"));
		//Test findByYoB Method
		System.out.println("2.DS theo nam sinh: "+ Arrays.toString(list.findByYoB(2003)));
		System.out.println("=>SUM: "+ list.findByYoB(2003).length);
		//Test findSecondLargestGPAStudent 
		System.out.println("3.Student co GPA thu 2: "+list.findSecondLargestGPAStudent());
	}
}
