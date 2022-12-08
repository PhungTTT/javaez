package Ex6_5Log;

public class MTLog implements ILog {
	public MTLog() { }
	/**
	 * Method toString()
	 */
	@Override
	public String toString() {
		return " ";
	}
	/**
	 * 
	 */
	@Override
	public ILog insertV(Entry e) {
		// TODO Auto-generated method stub
		return new ConsLog(e, new MTLog());
	}
	@Override
	public ILog sortByV() {
		// TODO Auto-generated method stub
		return new MTLog();
	}

}