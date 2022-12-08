package Ex6_6MailMessages;

public class Information {
	private String from;
	private Date date;
	private String message;
	/**
	 * This is Constructor of class Information
	 * Example:
	 * Information in1 = new Information("21130482@st.hcmuaf.edu.vn",
											new Date(25,2,2022),"va gio la 11 h toi :)");
	 * Information in2 = new Information("21130482@st.hcmuaf.edu.vn",
											new Date(26,2,2022),"2 - va gio la 11 h toi :)");					
	 * Information in3 = new Information("21130482@st.hcmuaf.edu.vn",
											new Date(27,2,2022),"3 - va gio la 11 h toi :)");	
	 * @param from
	 * @param date
	 * @param message
	 */
	public Information(String from, Date date, String message) {
		super();
		this.from = from;
		this.date = date;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Information:\t " + "Tu: "+from + " \n\t\t Ngay: " + date + " \n\t\t Noi Dung: " + message;
	}
	public boolean dateThan(Information in4) {
		if(in4.date.getYear() == this.date.getYear()) {
			if((in4.date.getMonth() == this.date.getMonth()) && 
				(in4.date.getDay() < this.date.getDay()))
				return true;
			else if((in4.date.getMonth() == this.date.getMonth()) && 
					(in4.date.getDay() >= this.date.getDay()))
				return false;
			else if((in4.date.getMonth() < this.date.getMonth()))
					return true;
		}
		else if (in4.date.getYear() < this.date.getYear()) {
					return true;}
				else
					return false;
		
		return false;
	}
}
