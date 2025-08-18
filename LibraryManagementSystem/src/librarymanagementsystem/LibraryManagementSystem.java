package librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        BookManagement a = new BookManagement();
        try {
            a.addBook();
            a.addBook();
            a.addBook();
            a.deleteBook(0);
            a.printAll();
            a.saveToFile();
            a.loadFromFile();
        } catch (Exception e) {
            System.out.println("Error: ");
        }
    }

}
