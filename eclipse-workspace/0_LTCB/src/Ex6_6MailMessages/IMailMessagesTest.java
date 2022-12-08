package Ex6_6MailMessages;

import junit.framework.TestCase;

public class IMailMessagesTest extends TestCase {
	public void testSortByDate() {
		Information in1 = new Information("21130482@st.hcmuaf.edu.vn",
				new Date(27,2,2022),":)");
		Information in2 = new Information("21130482@st.hcmuaf.edu.vn",
				new Date(25,2,2022),":)");					
		Information in3 = new Information("21130482@st.hcmuaf.edu.vn",
				new Date(26,2,2022),":)");
		Information in4 = new Information("21130482@st.hcmuaf.edu.vn",
				new Date(8,1,2022),"good luck!:)");
		Information in5 = new Information("21130482@st.hcmuaf.edu.vn",
				new Date(1,1,2023),"HAppy new year:)");
		Information in6 = new Information("21130482@st.hcmuaf.edu.vn",
				new Date(3,3,2022),"Thi!");
		
		ConsMailMessages c1 = new ConsMailMessages(in1, new MTMailMessages());
		ConsMailMessages c2 = new ConsMailMessages(in2, c1);
		ConsMailMessages c3 = new ConsMailMessages(in3, c2);
		ConsMailMessages c4 = new ConsMailMessages(in4, c3);
		ConsMailMessages c5 = new ConsMailMessages(in5, c4);
		ConsMailMessages c6 = new ConsMailMessages(in6, c5);
		
		System.out.println(c6.sortByDate());
	}
}
