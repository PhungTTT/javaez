package lab11_task2;

import java.util.List;

public class ReferenceBook extends Publication {
	//Sach tham khao
	private String field;
	private List<Chapter> chapters;
	/**
	 * @param title
	 * @param pageNumber
	 * @param yearPublication
	 * @param author
	 * @param price
	 * @param field
	 * @param chapters
	 */
	public ReferenceBook(String title, int pageNumber, int yearPublication, String author, double price, String field,
			List<Chapter> chapters) {
		super(title, pageNumber, yearPublication, author, price);
		this.field = field;
		this.chapters = chapters;
	}
	@Override
	public String type() {
		return "ReferenceBook";
	}
	@Override
	public Chapter mostPageChaptersReferenceBook() {
		Chapter re = chapters.get(0);
		for(int i=1;i<chapters.size();i++) {
			if(re.getPageNumber() < chapters.get(i).getPageNumber()) {
				re = chapters.get(i);
			}
		}
		return re;
	}
	@Override
	public String getMagazineName() {
		return "";
	}
	
	
}
