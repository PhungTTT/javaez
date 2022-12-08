package BaiEmployee;

import java.sql.Date;

public class Employee {
	private int id;
	private String name;
	private Date birhtDay;
	private String sex;
	private double salary;
	/**
	 * @param id
	 * @param name
	 * @param birhtDay
	 * @param sex
	 * @param salary
	 */
	public Employee(int id, String name, Date birhtDay, String sex, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birhtDay = birhtDay;
		this.sex = sex;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "NhanVien:" + id + ", " + name + ", " + birhtDay + ", " + sex + ", "
				+ salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirhtDay() {
		return birhtDay;
	}
	public void setBirhtDay(Date birhtDay) {
		this.birhtDay = birhtDay;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
