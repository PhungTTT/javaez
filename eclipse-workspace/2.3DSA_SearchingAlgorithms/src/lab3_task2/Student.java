package lab3_task2;

public class Student {
	private String id;
	private String name;
	private int yob;//birth year
	private double gpa;
	public Student(String id, String name, int yob, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.yob = yob;
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student(" + id + ", " + name + ", " + yob + ", " + gpa + ")";
	}
	
}
