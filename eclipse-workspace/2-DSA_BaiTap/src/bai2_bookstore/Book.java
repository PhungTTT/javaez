package bai2_bookstore;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Book {
	private String id;
	private String title;
	private String publisher;//nha xuat ban
	private int price;
	private int pubYear;
	private List<Chapter> chapters;
	/**
	 * @param id
	 * @param title
	 * @param publisher
	 * @param price
	 * @param pubYear
	 * @param chapters
	 */
	public Book(String id, String title, String publisher, int price, int pubYear, List<Chapter> chapters) {
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.pubYear = pubYear;
		this.chapters = chapters;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPubYear() {
		return pubYear;
	}
	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(pubYear, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(chapters, other.chapters) && Objects.equals(id, other.id) && price == other.price
				&& pubYear == other.pubYear && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book:" + id + ", " + title + ", " + publisher + ", " + price + ", "
				+ pubYear + ", chapters=" + chapters + "]";
	}
	/*
	 * maxPageChapter
	 */
	//c1: ton time
	public Chapter maxPageChapter() {
		 return Collections.max(this.chapters, new Comparator<Chapter>() {
			@Override
			public int compare(Chapter o1, Chapter o2) {
				return o1.getPages()-o2.getPages();
			}
		});
	}
	//c2:
	public Chapter maxPageChapter2() {
		Chapter re = chapters.get(0);
		for(int i=1; i<this.chapters.size();i++) {
			if(re.getPages()<chapters.get(i).getPages()) {
				re = chapters.get(i);
			}
		}
		return re;
	}
}
