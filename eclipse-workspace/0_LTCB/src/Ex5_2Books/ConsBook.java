package Ex5_2Books;

public class ConsBook implements IBooks {
	private Book first;
	private IBooks rest;
	/**
	 * This is COnstructor of ConsBook
	 * @param first
	 * @param rest
	 */
	public ConsBook(Book first, IBooks rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
}
