package Ex6_5Log;

public class ConsLog implements ILog {
	private Entry  first;
	private ILog rest;
	/**
	 * This is Constructor of ConsLog
	 * new ConsLog(
	 * @param first
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Method toString()
	 */
	@Override
	public String toString() {
		return  first +"\n"+ rest;
	}
	/**
	 * 
	 */
	@Override
	public ILog insertV(Entry e) {
		if(e.v() > this.first.v())
			return new ConsLog(e,this);
		else {
			return new ConsLog(this.first,this.rest.insertV(e));
		}
	}
	@Override
	public ILog sortByV() {
	// TODO Auto-generated method stub
		return this.rest.sortByV().insertV(this.first);
	}
}

