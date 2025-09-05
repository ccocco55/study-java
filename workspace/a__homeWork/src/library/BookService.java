package library;

import java.util.Collections;

public class BookService {

	
	public static void main(String[] args) {
		Library library = new Library();
		
//	책 추가
		DBBook.books.add(new Book("안녕이라 그랬어","문학동네", "Kim Aeran", 16000));
		DBBook.books.add(new Book("모순","쓰다", "양귀자", 12000));
		DBBook.books.add(new Book("메리골드 마음 식물원","북로망스", "윤정은", 20000));
		DBBook.books.add(new Book("급류","민음사", "정대건", 13000));
		DBBook.books.add(new Book("궤도","서해문집", "Summensah Harvey", 22000));
		DBBook.books.add(new Book("싯다르타","민음사", "Hermann Hesse", 21000));
		 
//	책 목록 전체 출력
		DBBook.books.forEach(System.out::println);
		
//	특정 출판사만 필터해서 출력
		try {
			library.searchPublisher("민음사").forEach(System.out::println);
		} catch (java.lang.NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("해당 출판사의 자료가 없습니다.");
		}
		
		
//	저자 이름 대문자로 출력
		library.exchange(DBBook.books);
		
//	가격 기준 정렬 (오름차순/내림차순)
		DBBook.books.stream().sorted((n1, n2) -> n1.getPrice() - n2.getPrice()).forEach(System.out::println);
		
		DBBook.books.stream().sorted(Collections.reverseOrder((n1, n2) -> n1.getPrice() - n2.getPrice())).forEach(System.out::println);		
		
//	2만원 이상 도서만 리스트 출력
		DBBook.books.stream().filter(book -> book.getPrice() >= 20000).forEach(System.out::println);
		
	}
}
