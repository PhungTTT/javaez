package Ex6_2PhoneDirectory ;
public class MTPhoneDirectory implements IPhoneDirectory{
	public MTPhoneDirectory() {}

	@Override
	public String toString() {
		return "";
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsPhoneDirectory))
			return false;
		else {
			return true;}
		}

	/**
	 * 
	 */
	public IPhoneDirectory whoseNumber(String nameORNumberFind) {
		return new MTPhoneDirectory();
	}
}
