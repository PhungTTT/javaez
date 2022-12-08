package Ex6_2PhoneDirectory;

public class APhone {
	private String name;
	private String phoneNumber;
	/**
	 * This is Constructor of APhone
	 * Example:
	 * APhone p1 = new APhone("Long Dai Hiep",0365874529);
	 * APhone p2 = new APhone(" O ",0354058723);
	 * APhone p3 = new APhone("Mr.Michen",0354058723);
	 * @param name
	 * @param phoneNumber
	 */
	public APhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	//Method toString
	public String toString() {
		return "name:" + name + " - phoneNumber:" + phoneNumber ;
	}
	//Method equals
		public boolean equals(Object obj) {
			if (obj == null || !(obj instanceof APhone))
				return false;
			else {
				APhone that = (APhone) obj;
				return this.name.equals(that.name)
						&& this.phoneNumber.equals(that.phoneNumber);
			}
		}
	

	public boolean comparePhoneNumbers(String nameORNumberFind) {
		if( this.phoneNumber.equals(nameORNumberFind)
				|| this.name.equals(nameORNumberFind))
				return true;
		else return false;
	}
		//Method getters 
		public String getName() {
			return name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
}
