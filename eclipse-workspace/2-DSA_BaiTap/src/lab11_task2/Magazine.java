package lab11_task2;

public class Magazine extends Publication {
	private String magazineName;

	/**
	 * @param title
	 * @param pageNumber
	 * @param yearPublication
	 * @param author
	 * @param price
	 * @param magazineName
	 */
	public Magazine(String title, int pageNumber, int yearPublication, String author, double price,
			String magazineName) {
		super(title, pageNumber, yearPublication, author, price);
		this.magazineName = magazineName;
	}
	
	@Override
	public String type() {
		return "Magazine";
	}

	@Override
	public Chapter mostPageChaptersReferenceBook() {
		return null;
	}

	@Override
	public String getMagazineName() {
		return magazineName;
	}
	
	
}
