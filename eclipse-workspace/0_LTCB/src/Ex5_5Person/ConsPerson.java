package Ex5_5Person;

public class ConsPerson extends APerson {
	private String name;
	private int yearBirth;
	private APerson father;
	private APerson mother;
	/***
	 * This is Constructor of ConsPerson
	 * @param name
	 * @param yearBirth
	 * @param father
	 * @param mother
	 */
	public ConsPerson(String name, int yearBirth, APerson father, APerson mother) {
		super();
		this.name = name;
		this.yearBirth = yearBirth;
		this.father = father;
		this.mother = mother;
	}
	@Override
	public String toString() {
		return "name=" + name + ","+ yearBirth + ", { father:" + father + " and " + "mother:" + mother + "}"
				+ " \n \t ";
	}
	
}
