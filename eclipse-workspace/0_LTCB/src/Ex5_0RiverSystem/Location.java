package Ex5_0RiverSystem;

public class Location {
	private String name;
	private int x;
	private int y;
	/**
	 * This is Constructor of class Location
	 * Example:
	 * Location l1 = new Location("s",1,1);
	 * Location l2 = new Location("t",1,5);
	 * Location l3 = new Location("u",3,7);
	 * Location l4 = new Location("b",3,3);
	 * Location l5 = new Location("a",5,5);
	 * Location l6 = new Location("m",7,5);
	 * @param name
	 * @param x
	 * @param y
	 */
	public Location(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return this.name+"("+this.x+","+this.y+")";
	}
	
	
}
