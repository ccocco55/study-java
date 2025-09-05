package task.library;

public class Book {
    private String title;
    private String author;
    private String genre;

    public Book() {;}

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    public void setAuthor(String author) { this.author = author; }

    @Override
    public String toString() {
        return title + " / " + author + " / " + genre;
    }
}
