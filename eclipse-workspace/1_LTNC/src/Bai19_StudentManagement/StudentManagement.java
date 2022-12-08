package Bai19_StudentManagement;

import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement {
	private ArrayList<Student> listStudent;

	public StudentManagement(ArrayList<Student> listStudent) {
		super();
		this.listStudent = listStudent;
	}
	//Them Sinh Vien
	public void addStudent(Student student) {
		listStudent.add(student);
	}
	//Them diem cho 1 Sinh Vien
	public void addScoreSubject(String findIdStudent,String nameSubject, String idSubject, double scorreSubject) {
		int count =0;
		for(int i = 0; i< this.listStudent.size();i++) {
			if(this.listStudent.get(i).getIdStudent().equals(findIdStudent)) {
				for(int j =0; j< this.listStudent.get(i).getListSubject().size();j++) {

					if(this.listStudent.get(i).getListSubject().get(j).getNameSubject().equals(nameSubject)) {
						this.listStudent.get(i).getListSubject().get(j).setScorreSubject(scorreSubject);
					}else {
						count++;
						}
					}
				if(count == this.listStudent.get(i).getListSubject().size()) {
					this.listStudent.get(i).getListSubject().add(new Subject(nameSubject,idSubject,scorreSubject));
				}
			}
		}
	}
	//Tinh diem TB
	public double averageScore(String findIdStudent) {
		double averageScore = 0;
		for(int i = 0; i< this.listStudent.size();i++) {
			if(this.listStudent.get(i).getIdStudent().equals(findIdStudent)) {
				averageScore =  this.listStudent.get(i).averageScore();
			}
		}
		return averageScore;
	}
	//Tim SV theo ho ten va ma Sinh Vien
	public void findStudent(String findnameStudent,String findIdStudent ) {
		for(int i = 0; i< this.listStudent.size();i++) {
			if(findnameStudent.equals(this.listStudent.get(i).getNameStudent()) &&
					(findIdStudent.equals(this.listStudent.get(i).getIdStudent()))){
				System.out.println(this.listStudent.get(i));
			}
		}
	}
	//In danh sach sap xep theo ten
	public void printName() {
		listStudent.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				//Theo ten
					return o1.getNameStudent().compareTo(o2.getNameStudent());
			}
		});
		this.printInformation();
	}
	//In danh sach sap xep theo diem TB
		public void printAScore() {
			listStudent.sort(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					//Theo diem Giam dan
					if(o1.averageScore() < o2.averageScore()) {
						return 1;
					}else{if(o1.averageScore() > o2.averageScore()) {
						return -1;
					}else return 0;
				}
				}
			});
			this.printInformation();
		}
	
	//In
	public void printInformation() {
		for(int i = 0; i< this.listStudent.size();i++) {
			System.out.println(this.listStudent.get(i).getIdStudent()+"   "+this.listStudent.get(i).getNameStudent()+
					"   "+averageScore(this.listStudent.get(i).getIdStudent()) );
		}
	}
}
