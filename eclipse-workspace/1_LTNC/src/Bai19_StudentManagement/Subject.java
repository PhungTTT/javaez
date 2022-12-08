package Bai19_StudentManagement;

public class Subject {
	private String nameSubject;
	private String idSubject;
	private double scorreSubject;
	/**
	 * This is Constructor of Subject
	 * @param nameSubject
	 * @param idSubject
	 * @param scorreSubject
	 */
	public Subject(String nameSubject, String idSubject, double scorreSubject) {
		super();
		this.nameSubject = nameSubject;
		this.idSubject = idSubject;
		this.scorreSubject = scorreSubject;
	}
	
	@Override
	public String toString() {
		return "{" + nameSubject + "-" + idSubject + "-" + scorreSubject
				+ "}";
	}

		//Getter & Setter
		public String getNameSubject() {
			return nameSubject;
		}
		public void setNameSubject(String nameSubject) {
			this.nameSubject = nameSubject;
		}
		public String getIdSubject() {
			return idSubject;
		}
		public void setIdSubject(String idSubject) {
			this.idSubject = idSubject;
		}
		public double getScorreSubject() {
			return scorreSubject;
		}
		public void setScorreSubject(double scorreSubject) {
			this.scorreSubject = scorreSubject;
		}	
}
