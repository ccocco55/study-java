package task.library;

import task.DBConnecter;

public class LibraryManager {
//    책 추가 (제목, 저자, 장르)
    public void addBook(Book book) {
    	DBConnecter.books.add(book);
    }
    

//    제목으로 책 검색
    public String searchByTitle(String title) {
        for (Book book : DBConnecter.books) {
            if (book.getTitle().equals(title)) {
                return book.getGenre();
            }
        }
        return null;
    }
    
//    특정 장르의 책 목록 출력
    public String searchByGenre(String genre) {
        String result = "";
        for (Book book : DBConnecter.books) {
            if (book.getGenre().equals(genre)) {
                result += book.toString() + "\n";
            }
        }
        return result.isEmpty() ? null : result;
    }
    
//    책 정보 수정 (제목으로 찾아서 저자 변경)
    public boolean updateAuthor(String title, String newAuthor) {
        for (Book book : DBConnecter.books) {
            if (book.getTitle().equals(title)) {
                book.setAuthor(newAuthor);
                return true;
            }
        }
        return false;
    }
//		특정 장르의 책 수 출력
    public int countByGenre(String genre) {
        int count = 0;
        for (Book book : DBConnecter.books) {
            if (book.getGenre().equals(genre)) {
                count++;
            }
        }
        return count;
    }
}
