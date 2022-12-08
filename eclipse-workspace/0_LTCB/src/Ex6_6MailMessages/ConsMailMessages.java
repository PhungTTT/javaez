package Ex6_6MailMessages;

public class ConsMailMessages implements IMailMessages {
	private Information first;
	private IMailMessages rest;
	/**
	 * This is COnstructor of ConsMailMessages
	 * Exanmple:
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsMailMessages(Information first, IMailMessages rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public IMailMessages insertDate(Information in4) {
		// TODO Auto-generated method stub
		if(in4.dateThan(first)) {
			return new ConsMailMessages(in4, this);
		}
		else {
			return new ConsMailMessages(this.first, rest.insertDate(in4));
		}
	}

	@Override
	public IMailMessages sortByDate() {
		// TODO Auto-generated method stub
		return this.rest.sortByDate().insertDate(first);
	}

	@Override
	public String toString() {
		return  first + "\n" + rest;
	}

}
