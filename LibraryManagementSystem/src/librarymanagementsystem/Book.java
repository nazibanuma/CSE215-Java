package librarymanagementsystem;

public abstract class Book implements Readable {

    private int id;
    private String title;
    private String author;
    private int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public abstract String getType();

    public String toString() {
        return "ID: " + getId() + "Title: " + getTitle() + "Author: " + getAuthor() + " Year: " + getYear();
    }
}
