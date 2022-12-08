 package Ex5_4ScoreBoard;
//Bang Diem == score board
public class ScoreBoard {
	private String name;
	private String cLass;
	private AGrades grades;  // Diem == grades
	/**
	 * This is COnstructor of class ScoreBoard
	 * Example:
	 * GradeRecord g1 = new GradeRecord(211, "DF",3,7.5);
	 * GradeRecord g2 = new GradeRecord(220, "BP",2,5.0);
	 * GradeRecord g3 = new GradeRecord(690, "Algorithms",4,7.0);
	 * GradeRecord g4 = new GradeRecord(721, "DS",4,8.0);
	 * 
	 * ConsGrades c1 = new ConsGrades(g1, new MTGrades());
	 * ConsGrades c2 = new ConsGrades(g2,c1);
	 * ConsGrades c3 = new ConsGrades(g3,c2);
	 * ConsGrades c4 = new ConsGrades(g4,c3);
	 * 
	 * ScoreBoard sv = new ScoreBoard("LE BA P","K47",c4);
	 * @param name
	 * @param cLass
	 * @param grades
	 */
	public ScoreBoard(String name, String cLass, AGrades grades) {
		super();
		this.name = name;
		this.cLass = cLass;
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Ten SV:" + name + " \t  Khoa:" + cLass +"\n" + "Thong Tin Diem So: \n \n" + grades;
	}
	
}
