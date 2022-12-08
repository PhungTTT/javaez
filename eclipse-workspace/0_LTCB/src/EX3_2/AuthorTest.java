package EX3_2;
import junit.framework.TestCase;
public class AuthorTest  extends TestCase{
	/**
	 * Test for constructor of Author
	 */
	public void testConstructor () {
		new Author("Daniel Defoe",1600);
		new Author("Joseph Conrad",1857);
		new Author("Pat Conroy",1945);

}
}