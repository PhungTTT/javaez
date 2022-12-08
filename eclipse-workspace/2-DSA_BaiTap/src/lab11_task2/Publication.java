package lab11_task2;

public abstract class Publication {
	//title, page number, year, publication, author, price
	protected String title;
	protected int pageNumber;
	protected int yearPublication;
	protected String author;
	protected double price;
	/**
	 * Constructor of Publication
	 * @param title
	 * @param pageNumber
	 * @param yearPublication
	 * @param author
	 * @param price
	 */
	public Publication(String title, int pageNumber, int yearPublication, String author, double price) {
		this.title = title;
		this.pageNumber = pageNumber;
		this.yearPublication = yearPublication;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getYearPublication() {
		return yearPublication;
	}
	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//getType
	public abstract String type();
	//mostPageChaptersReferenceBook
	public abstract Chapter mostPageChaptersReferenceBook();
	//getMagazineName
	public abstract String getMagazineName();
}
