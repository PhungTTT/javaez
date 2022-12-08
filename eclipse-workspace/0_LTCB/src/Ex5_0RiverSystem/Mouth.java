package Ex5_0RiverSystem;

public class Mouth extends ARiver {
	private ARiver stream;
	/**
	 * This is Constructor of class Mouth
	 * 
	 * @param loc
	 * @param length
	 * @param stream
	 */
	public Mouth(Location loc, double length, ARiver stream) {
		super(loc, length);
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Mouth:"+ super.toString() +"\t"+ this.stream ;
	}
	
	

}
