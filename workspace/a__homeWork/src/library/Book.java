package library;

import java.util.Objects;

public class Book {

	private String name;
	private String publisher;
	private String author;
	private int price;
	
	public Book() {;}
	
	public Book(Book book) {
		this(book.name, book.publisher, book.author, book.price);
	}
	
	public Book(String name, String publisher, String author, int price) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPublisher() {
		return publisher;
	}

	protected void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	protected String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", publisher=" + publisher + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
}
