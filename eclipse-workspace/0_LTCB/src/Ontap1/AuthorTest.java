package Ontap1;

import junit.framework.TestCase;
public class AuthorTest  extends TestCase{
	public void testConstructor () {
		new Author("Thich Nhat Hanh",1926);
		new Author("Joseph Conrad",1857);
		new Author("Pat Conroy",1945);

	}
	public void testSame() {
		Author felleisen = new Author("Matthias Felleisen", 1960);
		 assertTrue(felleisen.same(felleisen));
	}
}