package BaiEmployee;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeManagerment {
	private ArrayList<Employee> list;

	/**
	 * @param list
	 */
	public EmployeeManagerment(ArrayList<Employee> list) {
		super();
		this.list = list;
	}
	/*
	 * addEmployee Method
	 */
	public void addEmployee(Employee e) {
		int count =0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==e.getId()) {
				System.out.println("Da ton tai Nhan vien!");
				break;
			}else count++;
		}
		if(count==list.size()) {
			list.add(e);
		}
	}
	/*
	 * removeEmployee Method
	 */
	public void removeEmployee(int idFind) {
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getId()==idFind) {
				list.remove(i);
			}
		}
	}
	/**
	 * removeAll Method
	 */
	public void removeAll() {
		list.removeAll(list);
	}
	/**
	 * Sort theo ten
	 */
	public void sortName() {
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
	}
	/**
	 * Sort theo luong:Giam dan
	 */
	public void sortSalary() {
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) return -1;
				else if(o1.getSalary()<o2.getSalary()) return 1;
				else return 0;
			}
			
		});
	
		}
	/*
	 * In list
	 */
		public void display() {
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
	}

			
}
