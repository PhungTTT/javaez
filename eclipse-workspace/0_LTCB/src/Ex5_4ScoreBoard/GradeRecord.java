package Ex5_4ScoreBoard;

public class GradeRecord {
	private int number;
	private String title;
	private int credits;
	private double grade;
	/**
	 * This is COnstructor of GradeRecord
	 * Example:
	 * GradeRecord g1 = new GradeRecord(211, "DF",3,7.5);
	 * GradeRecord g2 = new GradeRecord(220, "BP",2,5.0);
	 * GradeRecord g3 = new GradeRecord(690, "Algorithms",4,7.0);
	 * GradeRecord g4 = new GradeRecord(721, "DS",4,8.0);
	 * @param number
	 * @param title
	 * @param credits
	 * @param grade
	 */
	public GradeRecord(int number, String title, int credits, double grade) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Ma So MH: "+number + ", Ten MH:" + title + ", "
				+ " So Tc:" + credits + ", Diem:" + grade ;
	}
	
}
