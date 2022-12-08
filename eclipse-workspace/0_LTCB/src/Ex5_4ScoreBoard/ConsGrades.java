package Ex5_4ScoreBoard;

public class ConsGrades extends AGrades{
	private GradeRecord first;
	private AGrades rest;
	/**
	 * This is Constructor of class ConsGrades
	 * @param first
	 * @param rest
	 */
	public ConsGrades(GradeRecord first, AGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return   first + "\n" + rest;
	}
	
}
