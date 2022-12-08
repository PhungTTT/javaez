package Ontap1;

public class Author {
	String name;
	int birthyear;
	Author(String name,int birthyear) {
		this.name=name;
		this.birthyear=birthyear;
	}
	/**Determines whether a author was  the specified author;
	 * @param that (Author)
	 * @return boolean
	 * Example:
	 * Author felleisen = new Author("Matthias Felleisen", 1960);
	 * assertTrue(felleisen.same(felleisen));
	 * 
	 */
	boolean same(Author that) {
		return (this.name.equals(that.name)) &&
		(this.birthyear == that.birthyear);
	}
}
