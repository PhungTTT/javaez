package lab3_task2;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManagement{
	private Student[] students;
	
	public StudentManagement(Student[] students) {
		super();
		this.students = students;
	}
	//SortId
	public void sortId() {
		Arrays.sort(this.students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
	}
	//SortYob
		public void sortYob() {
			Arrays.sort(this.students,new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					if(o1.getYob() < o2.getYob()) return -1;
					else if(o1.getYob() > o2.getYob()) return 1;
					else return 0;
				}
			});
		}
	//SortYob
			public void sortGpa() {
				Arrays.sort(this.students,new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						if(o1.getGpa() < o2.getGpa()) return -1;
						else if(o1.getGpa() > o2.getGpa()) return 1;
						else return 0;
					}
				});
			} 
	/**
	 * find the student based on the given id using binary search
	 */
	//Tim theo id
	public Student findStudent(String id) {
		sortId();
		int left =0;
		int right = students.length-1;
	
		while (left<=right) {
			int mid = (right+left)/2;
			if(students[mid].getId().equals(id)) return students[mid];
			else if(students[mid].getId().compareTo(id)>0) {// id mid
				right= mid -1;
			}else {
				left = mid +1;
			}
		}
	return null;
	}
	//Tim theo nam sinh
	public Student[] findByYoB(int yob) {
		sortYob();
		int first =-1;
		int end = -1;
		int l;
		for(int i =0;i<students.length;i++) {
			if(students[i].getYob()==yob) {
				first = i;
				break;
			}
		}
		for(int j=students.length-1;j>=0;j--) {
			if(students[j].getYob()==yob) {
				end = j;
				break;
			}
		}
		if(first==-1 && end==-1) {
			l=0;
		}
		else if(first==end) {
			l =1;
		}else l=end-first+1;
		//
		Student[] result = new Student[l];
		for(int i=0;i<l;i++) {
			result[i] = students[first];
			first++;
		}
		return result;
	}
	
	//Hoc sinhh diemTB lon tu 2
	public Student findSecondLargestGPAStudent() {
		sortGpa();
	return students[students.length-2];
	}
}
