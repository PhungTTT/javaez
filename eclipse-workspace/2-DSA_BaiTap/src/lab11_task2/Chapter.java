package lab11_task2;

public class Chapter {
	private String title;
	private int pageNumber;
	/**
	 * @param title
	 * @param pageNumber
	 */
	public Chapter(String title, int pageNumber) {
		this.title = title;
		this.pageNumber = pageNumber;
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
	
}
