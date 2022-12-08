package EX3_2;

public class Author {
	private String name;
	private int birthYear;
	Author(String name,int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	}
	/**
	 * 
	 * @return
	 */
	boolean currentAuthor() {
		return this.birthYear >= 1940;
	}
	/**
	 * 
	 */
	boolean same(Author that) {
		return (this.name.equals(that.name)) &&
		(this.birthYear == that.birthYear);
	}
	/**
	 * 
	 */
	boolean sameGeneration(Author that) {
		return Math.abs(this.birthYear - that.birthYear) <= 10;
	}
	
}
