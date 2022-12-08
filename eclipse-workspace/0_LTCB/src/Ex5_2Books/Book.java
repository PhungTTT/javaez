package Ex5_2Books;

public class Book {
	private String title;
	private Author author;
	private int year_of_publication;
	private double price;
	/*
	 * This is constructor of Book
	 * Example:
	 *new Book("Old Path White Clouds",new Author("Thich Nhat Hanh",1926),1987, 16.99);
	  new Book("My Love",new Author("=)",2003),2015,12.80);
	  new Book("Dream",new Author("H10",1991),2003,0.0);
	 * 
	 * @param (String title, Author author,int year_of_publication,double price)
	 */
	public Book(String title, Author author,int year_of_publication,double price) {
		this.title=title;
		this.author = author;
		this.year_of_publication =year_of_publication;
		this.price=price;
	}
}
