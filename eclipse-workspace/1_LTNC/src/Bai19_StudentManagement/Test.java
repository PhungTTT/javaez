package Bai19_StudentManagement;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList <Student> listStudent = new ArrayList<Student> ();
		StudentManagement studentManagement = new StudentManagement(listStudent);
		
		ArrayList <Subject> listSubject_1 = new ArrayList<Subject> ();
		Student student_1 = new Student("Le Ba P","21130482",new Date(7,4,2003),listSubject_1);
		listSubject_1.add(new Subject("LTNC", "03", 9));
		listSubject_1.add(new Subject("A3","04",8));
		
		
		ArrayList <Subject> listSubject_2 = new ArrayList<Subject> ();
		Student student_2 = new Student("Kante","21130483",new Date(9,9,2003),listSubject_2);
		listSubject_2.add(new Subject("LTNC", "03", 5));
		listSubject_2.add(new Subject("A3","04",4));
		
		//Them Sv
		studentManagement.addStudent(student_1);
		studentManagement.addStudent(student_2);
		
		//Them Diem cho SV: Neu mon hoc da co thi se sua diem. Con khong thi them mot Subject moi
		studentManagement.addScoreSubject("21130482", "LTNC", "03",10);
		studentManagement.addScoreSubject("21130483", "CTMT ", "03",10);
//		//Test diemTB
//		System.out.println(studentManagement.averageScore("21130482"));
//		System.out.println(studentManagement.averageScore("21130483"));
		//Tim SV
		studentManagement.findStudent("B", "21130482");
		studentManagement.findStudent("A", "21130485");
		//In ra Man Hinh
		System.out.println("DS ban dau: ");
		studentManagement.printInformation();
		//Sap xep theo ten
		System.out.println("Sap xep theo ten: ");
		studentManagement.printName();
		//Sap xep theo diemTb
		System.out.println("Sap xep theo Diem TB: ");
		studentManagement.printAScore();
		}
	
}
