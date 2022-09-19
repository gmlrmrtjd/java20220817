package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C04SortedSet {
	public static void main(String[] args) {
		TreeSet<Book> books = new TreeSet<>((b1, b2) -> b1.getPrice() - b2.getPrice());
		books.add(new Book("java", 1000));
		books.add(new Book("css", 500));
		books.add(new Book("jsp", 700));
		
		System.out.println(books);
		
		System.out.println(books.first());
		System.out.println(books.last());
	}
}

class Book {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + ":" + price;
	}
}



