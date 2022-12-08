package Ex5_0RiverSystem;

public abstract class ARiver implements RiverSystem{
	private Location loc;
	private double length;
	/**
	 * This is COnstructor of ARiver
	 * Example:
	 * 
	 * @param loc
	 * @param length
	 */
	public ARiver(Location loc, double length) {
		super();
		this.loc = loc;
		this.length = length;
	}
	@Override
	public String toString() {
		return  this.loc +";"+ this.length ;
	}
	
	
	
}
