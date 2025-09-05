package homeWork;

import java.util.Scanner;

//title (도서 제목, String)
//author (저자, String)
//isBorrowed (대여 여부, boolean)
//메서드
//
//생성자 Book(String title, String author)
//borrowBook() : 책을 대여하고 isBorrowed를 true로 바꿈. 이미 대여 중이면 메시지 출력
//returnBook() : 책을 반납하고 isBorrowed를 false로 바꿈. 대여 중이 아니라면 메시지 출력
//getStatus() : "대여 중" 또는 "대여 가능"이라는 상태 문자열 반환
//printInfo() : 책의 제목, 저자, 상태 출력

class Book {
	String title;
	String author;
	boolean isBorrowed;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	void borrowBook() {
		isBorrowed = true;
	}

	void returnBook() {
		isBorrowed = false;
	}

	String getStatus() {
		return isBorrowed ? "대여중" : "대여가능";
	}

	String printInfo() {

		return String.format("책 제목: %s \n저자: %s \n대여 상태: %s \n", title, author, getStatus());
	}
	
	boolean borrowedStatus() {
		return isBorrowed;
	}

}

public class HomeWork03 {
	public static void main(String[] args) {
//	 main()에서 해야 할 일

//	 미리 책 3권을 생성해 배열에 넣어두기
//	 사용자에게 메뉴를 보여주고 반복 실행
//
//	 1. 전체 도서 목록 보기
//	 2. 도서 대여
//	 3. 도서 반납
//	 4. 종료

		Book[] arBook = new Book[3];

		Scanner scanner = new Scanner(System.in);

		arBook[0] = new Book("자바의 정석", "남궁성");
		arBook[1] = new Book("객체지향의 사실과 오해", "조영호");
		arBook[2] = new Book("Effective Java", "조슈아 블로크");

		while (true) {
			System.out.println(" 1. 전체 도서 목록 보기 \n 2. 도서 대여 \n 3. 도서 반납 \n 4. 종료");

			int number = scanner.nextInt();

			if (number == 1) {
				for (int i = 0; i < arBook.length; i++) {

					System.out.println(arBook[i].printInfo());
				}
			} else if (number == 2) {
				System.out.println("몇 번쩨 도서를 대여하시겠습니까?");
				System.out.println(" 1. 자바의 정석 \n 2. 객체지향의 사실과 오해 \n 3. Effective Java");

				int n = scanner.nextInt();

				for (int i = 0; i < arBook.length; i++) {
					if (arBook[i].borrowedStatus()) {
						System.out.println("이미 대여중입니다.");
					}
					else {
						arBook[i].borrowBook();
						break;
					}
				}
			} else if (number == 3) {
				System.out.println("몇 번쩨 도서를 반납하시겠습니까?");
				System.out.println(" 1. 자바의 정석 \n 2. 객체지향의 사실과 오해 \n 3. Effective Java");

				int n = scanner.nextInt();

				for (int i = 0; i < arBook.length; i++) {
					if (arBook[i].borrowedStatus() == false) {
						System.out.println("이미 반납했습니다.");
					}
					else {
						arBook[i].returnBook();
						break;
					}
				}
			} else if (number == 4) {
				break;
			} else {
				System.out.println("1 -4 번호를 입력해 주세요.");
			}

		}
	}
}
