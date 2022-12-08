package Ex5_4ScoreBoard;

import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {
	/**
	 * Test for COnstructor
	 */
	public void testScoreBoard() {
		GradeRecord g1 = new GradeRecord(211, "Database Fundamentals",3,7.5);
		GradeRecord g2 = new GradeRecord(220, "Basic Programming",2,5.0);
		GradeRecord g3 = new GradeRecord(690, "Algorithms",4,7.0);
		GradeRecord g4 = new GradeRecord(721, "Data Structure",4,8.0);
		
		ConsGrades c1 = new ConsGrades(g1, new MTGrades());
		ConsGrades c2 = new ConsGrades(g2,c1)
				;
		ConsGrades c3 = new ConsGrades(g3,c2);
		ConsGrades c4 = new ConsGrades(g4,c3);
		
		
		ScoreBoard sv = new ScoreBoard("LE BA P","K47",c4);
		
		System.out.println(sv);
		
	}
}
