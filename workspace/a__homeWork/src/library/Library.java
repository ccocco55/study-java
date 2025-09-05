package library;

import java.util.ArrayList;


public class Library {
	public void addBooks(Book book) {
		DBBook.books.add(book);
	}
	
	 public ArrayList<Book> searchPublisher(String publisher) {
		 ArrayList<Book> result = new ArrayList<>();
	        for (Book book : DBBook.books) {
	            if (book.getPublisher().equals(publisher)) {
	                result.add(book);
	            }
	        }
	        return result;
	    }
	
//	저자 이름 대문자로 출력
	public void exchange(ArrayList<Book> books) {
		for (Book book: books) {
			System.out.println(book.getAuthor().toUpperCase());
		}
	}
}
