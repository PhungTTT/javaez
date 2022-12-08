package Thi2022_Employee;

public abstract class AEmployee {
	protected int eid;
	protected String name;
	protected Date birthday;
	protected double salaryRate;
	/**
	 * THis is Constructor of AEmployee
	 * @param eid
	 * @param name
	 * @param birthday
	 * @param salaryRate
	 */
	public AEmployee(int eid, String name, Date birthday, double salaryRate) {
		super();
		this.eid = eid;
		this.name = name;
		this.birthday = birthday;
		this.salaryRate = salaryRate;
	}
	/**
	 * getter and setter
	 */
			public int getEid() {
				return eid;
			}
			public void setEid(int eid) {
				this.eid = eid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Date getBirthday() {
				return birthday;
			}
			public void setBirthday(Date birthday) {
				this.birthday = birthday;
			}
			public double getSalaryRate() {
				return salaryRate;
			}
			public void setSalaryRate(double salaryRate) {
				this.salaryRate = salaryRate;
			}
			/**
			 * salary Method: tinh luong:LCB*salaryRate
			 * biet: LCB Staff 1.000.000, Driver 900.000
			 * 
			 */
			public abstract double salary();
			/**
			 *  method:Kiem tra Driver theo iid
			 * @return
			 */
			public abstract boolean checkDriver(int iid);
			/**
			 * 
			 */
			public abstract void sortByVehicle();
}
