package abstractclass;

public class NonFictionBook extends Book {

    private String subject;

    public NonFictionBook() {
    }

    public NonFictionBook(String subject, String name, String author) {
        super(name, author);
        this.subject = subject;
    }

    public String getSubejct() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayInfo() {
        System.out.println("NAme: " + getName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getSubejct());
    }

    public boolean isRecommendedForAge(int age) {
        if (age >= 14) {
            System.out.println("Can read");
            return true;
        } else {
            System.out.println("Cant read");
            return false;
        }
    }
}
