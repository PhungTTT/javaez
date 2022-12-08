package Cau2_model;

public class Manufactor {
	private String companyName;
	private String country;
	/**
	 * This is COnstructor of Manufactor
	 * @param companyName
	 * @param country
	 * Ex: new Manufactor("HonDa","Japan");
	 */
	public Manufactor(String companyName, String country) {
		super();
		this.companyName = companyName;
		this.country = country;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return companyName + "," + country;
	}
}
