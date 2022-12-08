package bai2_bookstore;

public class Chapter {
	private String title;
	private int pages;
	private String author;
	/**
	 * @param title
	 * @param pages
	 * @param author
	 */
	public Chapter(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}
	//Getter, Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Chapter [title=" + title + ", pages=" + pages + ", author=" + author + "]";
	}
	
}
