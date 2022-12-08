package Bai19_StudentManagement;

import java.util.ArrayList;

public class Student{
	private String nameStudent;
	private String idStudent;
	private Date dateBirth;
	private ArrayList<Subject> listSubject;
	/**
	 * This is Constructor of Student
	 * @param nameStudent
	 * @param idStudent
	 * @param dateBirth
	 * @param listSubject
	 */
	public Student(String nameStudent, String idStudent, Date dateBirth, ArrayList<Subject> listSubject) {
		super();
		this.nameStudent = nameStudent;
		this.idStudent = idStudent;
		this.dateBirth = dateBirth;
		this.listSubject = listSubject;
	}
	
	@Override
	public String toString() {
		return "STUDENT: nameStudent:" + nameStudent + ", idStudent:" + idStudent + ", dateBirth:" + dateBirth
				+ ", listSubject:" + listSubject;
	}

		//Getter & Setter
		public String getNameStudent() {
			return nameStudent;
		}
		public void setNameStudent(String nameStudent) {
			this.nameStudent = nameStudent;
		}
		public String getIdStudent() {
			return idStudent;
		}
		public void setIdStudent(String idStudent) {
			this.idStudent = idStudent;
		}
		public Date getDateBirth() {
			return dateBirth;
		}
		public void setDateBirth(Date dateBirth) {
			this.dateBirth = dateBirth;
		}
		public ArrayList<Subject> getListSubject() {
			return listSubject;
		}
		public void setListSubject(ArrayList<Subject> listSubject) {
			this.listSubject = listSubject;
		}
	//Them mon hoc
		public void addSubject(String nameSubject, String idSubject, double scorreSubject) {
			Subject subject = new Subject(nameSubject, idSubject, scorreSubject);
			this.listSubject.add(subject);
		}
	//Diem TB
		public double averageScore() {
			double sum = 0;
			double averageScore;
			for(int i = 0; i< this.listSubject.size();i++) {
				sum += listSubject.get(i).getScorreSubject();
			}//Lam tron 2 chu so thap phan
			return averageScore = (double) Math.round(sum/listSubject.size()*100)/100;
		}
}
