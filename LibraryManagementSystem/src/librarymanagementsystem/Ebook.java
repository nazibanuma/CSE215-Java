package librarymanagementsystem;

public class Ebook extends Book {

    private double fileSizeMB;

    public Ebook(double fileSizeMB, int id, String title, String author, int year) {
        super(id, title, author, year);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String toString() {
        return super.toString() + " File Size: " + getFileSizeMB();
    }

    public String getType() {
        return "Ebook";
    }

}
