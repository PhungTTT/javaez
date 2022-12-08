package BaiEmployee;

import java.sql.Date;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList< Employee> list = new ArrayList<Employee>();
		EmployeeManagerment listEmployee = new EmployeeManagerment(list);
		
		//Tao DL
		listEmployee.addEmployee(new Employee(01, "T", new Date(2003, 7, 7), "Nam", 100));
		//add
		Employee e = new Employee(02, "P",new Date(2003, 7, 7) , "Nam", 50);
		listEmployee.addEmployee(e);
		listEmployee.display();
		Employee e2 = new Employee(02, "P",new Date(2003, 7, 7) , "Nam", 50);
		listEmployee.addEmployee(e2);
		//Xoa
//		listEmployee.removeAll();
//		listEmployee.display();
		//sort
		listEmployee.sortName();
		listEmployee.display();
		listEmployee.sortSalary();
		listEmployee.display();
	}
}
