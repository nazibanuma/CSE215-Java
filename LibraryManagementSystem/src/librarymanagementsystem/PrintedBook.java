package librarymanagementsystem;

public class PrintedBook extends Book {

    private int pages;

    public PrintedBook(int pages, int id, String title, String author, int year) {
        super(id, title, author, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return super.toString() + " Pages: " + getPages();
    }

    public String getType() {
        return "Printed Book";
    }

}
