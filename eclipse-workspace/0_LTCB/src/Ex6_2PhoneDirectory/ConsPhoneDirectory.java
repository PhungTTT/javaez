
package Ex6_2PhoneDirectory;

public class ConsPhoneDirectory implements IPhoneDirectory {
	private APhone first;
	private IPhoneDirectory rest;
	/**
	 * This is Constructor of ConsPhoneDirectory
	 * Example:
	 * APhone p1 = new APhone("Long Dai Hiep",0365874529);
	 * APhone p2 = new APhone(" O ",0354058723);
	 * APhone p3 = new APhone("Mr.Michen",0354058723);
	 * 
	 * APhoneDirectory d1 = new ConsPhoneDirectory(p1,new MTPhoneDirectory());
	 * APhoneDirectory d2 = new ConsPhoneDirectory(p2,d1);
	 * APhoneDirectory d3 = new ConsPhoneDirectory(p3,d2);
	 * 
	 * APhoneDirectory all = new ConsPhoneDirectory(p3,
								new ConsPhoneDirectory(p2,
									new ConsPhoneDirectory(p1,new MTPhoneDirectory()));
	 * @param first
	 * @param rest
	 */
	public ConsPhoneDirectory(APhone first, IPhoneDirectory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	
	@Override
	//Method toString
	public String toString() {
		return  first + "," + rest ;
	}
	//Method equals
			public boolean equals(Object obj) {
				if (obj == null || !(obj instanceof ConsPhoneDirectory))
					return false;
				else {
					ConsPhoneDirectory that = (ConsPhoneDirectory) obj;
					return this.first.equals(that.first)&&
							this.rest.equals(that.rest);
				}
			}


	/**
	 * TIM name THONG QUA phoneNumberFind
	 */
	public IPhoneDirectory whoseNumber(String nameORNumberFind) {
		if(this.first.comparePhoneNumbers(nameORNumberFind)) 
			return new ConsPhoneDirectory(this.first,this.rest.whoseNumber(nameORNumberFind));
		else 
			return this.rest.whoseNumber(nameORNumberFind);
		}

}
