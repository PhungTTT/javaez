package bai2_bookstore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.ActionMapUIResource;

public class BookStore {
	private String name;
	private String address;
	private List<Book> books;
	/**
	 * @param name
	 * @param address
	 * @param books
	 */
	public BookStore(String name, String address, List<Book> books) {
		this.name = name;
		this.address = address;
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	//lay ra tieu de chuong sach  co nhieu trang nhat
	public Chapter maxPageChapter() {
		Book b = Collections.max(this.books, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.maxPageChapter().getPages()-o2.maxPageChapter().getPages();
			}
		});
		return b.maxPageChapter();
	}
	/*
	 * Thong ke tong so trang cua moi quyen sach key = nam xuat ban(pubYear)
	 * 			value=danh sach cac sach xuat ban nam do
	 */
	public Map<Integer, ArrayList<Book>> statBookByYear() {
		Map<Integer, ArrayList<Book>> re = new HashMap<>();
		
		for(int i=0;i<this.books.size();i++) {
			if(re.containsKey(books.get(i).getPubYear())) {
				ArrayList<Book> a = re.get(books.get(i).getPubYear());
				a.add(books.get(i));
 				re.put(books.get(i).getPubYear(), a);
			}else {
				ArrayList<Book> a = new ArrayList<>();
				a.add(books.get(i));
 				re.put(books.get(i).getPubYear(), a);
			}
		}
		return re;
	}
	/*
	 * Lay ra cac quyen sach co nha xuat ban la publisherName
	 * Ket qua sap xep giam dan theo nam xuat ban, neu cung nam thi sx theo tieu de
	 * => vay la 1 nam chi xuat ban 1 sach :))))
	 */
	public Set<Book> getBooks(String publisherName) {
		Set<Book> re = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if(o1.getPubYear()!=o2.getPubYear()) {
					return o1.getPubYear()-o2.getPubYear();
				}else{
					return o1.getTitle().compareTo(o2.getId());
				}
			}
		});
		
		for(Book b : books) {
			if(b.getPublisher().equals(publisherName)) {
				re.add(b);
			}
		}
		return re;
	}
	//Test

	//
	public static void main(String[] args) {
		Chapter c1 = new Chapter("A", 4, "A");
		Chapter c2 = new Chapter("B", 2, "A");
		Chapter c3 = new Chapter("D", 5, "A");
		Chapter c4 = new Chapter("C", 1, "A");
		
		Chapter[] l1 = {c1,c2};
		Book b1 = new Book("01", "Bai", "lungbaphe", 100000,2017, Arrays.asList(l1));
		
		Chapter[] l2 = {c2,c4};
		Book b2 = new Book("02", "Hello", "trong", 100000,2022, Arrays.asList(l2));
		
		Chapter[] l3 = {c1,c3};
		Book b3 = new Book("03", "Hello World", "trong", 100000,2020, Arrays.asList(l2));
		
		Book[] lb = {b1,b2,b3};
		BookStore bs = new BookStore("Haha", "ABC", Arrays.asList(lb));
		System.out.println(bs.maxPageChapter());
		
		bs.statBookByYear().forEach((t, u) -> System.out.println(t+"="+u));
		System.out.println("====");
		bs.getBooks("trong").forEach(t -> System.out.println(t));
	}
}
