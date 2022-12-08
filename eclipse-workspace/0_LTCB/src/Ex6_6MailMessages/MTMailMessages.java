package Ex6_6MailMessages;

public class MTMailMessages implements IMailMessages {
	public MTMailMessages() {}

	@Override
	public IMailMessages insertDate(Information in4) {
		// TODO Auto-generated method stub
		return new ConsMailMessages(in4, new MTMailMessages());
	}

	@Override
	public IMailMessages sortByDate() {
		// TODO Auto-generated method stub
		return new MTMailMessages();
	}

	@Override
	public String toString() {
		return " ";
	}
	
	
}
