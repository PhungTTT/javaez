package Thi2022_Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		//Vehicle
		Vehicle v1 = new Vehicle(101, "Xe Tai", 2020);
		Vehicle v2 = new Vehicle(102,"Xe Khach",2016);
		Vehicle v3 = new Vehicle(103, "Xe Bus", 2012);
		Vehicle v4 = new Vehicle(104, "Xe Ban Tai", 2010);
		//Employee
		Staff e1 = new Staff(101,"Le Nhan Minh", new Date(2,8,1994), 1.2,"Giao hang");
		Staff e2 = new Staff(102,"Ai Nguyen", new Date(1,1,1989), 1.5,"Ke Toan");
		
		Driver e3 = new Driver(201,"Ta Phap Quang", new Date(2,5,1989), 2.5,
								new ConsVehicle(v1, new ConsVehicle(v2, new ConsVehicle(v4, new MTVehicle()))));
		Driver e4 = new Driver(202, "Thien Dinh",new Date(1,9,1989), 2.2,
						new ConsVehicle(v1, new ConsVehicle(v3, new MTVehicle())));
		Driver e5 = new Driver(203, "Tran Tuan Minh", new Date(8,10,1992), 2,
						new ConsVehicle(v3, new ConsVehicle(v4, new MTVehicle())));
		//ListEmployee
		System.out.println("-->Danh Sach:");
		IEmployee i1 = new MTEmployee();
		IEmployee i2 = new ConsEmployee(e1,i1);
		IEmployee i3 = new ConsEmployee(e2,i2);
		IEmployee i4 = new ConsEmployee(e3,i3);
		IEmployee i5 = new ConsEmployee(e4,i4);
		IEmployee i6 = new ConsEmployee(e5,i5);
		System.out.println(i6);
		
		/**
		 * Test getBirthday method
		 */
		System.out.println(i6.getBirthday(102));
		/**
		 *Test salary method
		 */
		System.out.println(i6.salary(102));
		/**
		 * Test howManyEmployee
		 */
		System.out.println("So nhan vien: "+i6.howManyEmployee());
		/**
		 * Test getDrivers 
		 */
		System.out.println(i6.getDrivers(103));
		i6.sortByEmployee();
		System.out.println("-----Sap xep namSX tang dan------ \n"+i6);
	}
}
