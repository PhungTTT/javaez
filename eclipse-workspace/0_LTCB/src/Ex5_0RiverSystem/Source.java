package Ex5_0RiverSystem;

public class Source extends ARiver{
	/**
	 * This is COnstructor of Source
	 * Example:
	 * Location l1 = new Location("s",1,1);
	 * Location l2 = new Location("t",1,5);
	 * Location l3 = new Location("u",3,7);
	 * 
	 * Source s1 = new Source(l1,120.0);
	 * Source s2 = new Source(l2,50.0);
	 * Source s3 = new Source(l3,100.0);
	 * @param loc
	 * @param length
	 */
	public Source(Location loc,double length) {
		super(loc,length);
	}
	@Override
	public String toString() {
		return "Source:"+ super.toString();
	}

}
