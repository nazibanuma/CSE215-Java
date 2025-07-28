
package abstractclass;
public class FictionBook extends Book {

    private String genre;

    public FictionBook() {
    }

    public FictionBook(String genre, String name, String author) {
        super(name, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("NAme: " + getName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
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
    //public class FictionBook extends Book {
//
//    private String genre;
//
//    public FictionBook() {
//    }
//
//    public FictionBook(String genre, String name, String author) {
//        super(name, author);
//        this.genre = genre;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public void displayInfo() {
//        System.out.println("NAme: " + getName());
//        System.out.println("Author: " + getAuthor());
//        System.out.println("Genre: " + getGenre());
//    }
//
//    public boolean isRecommendedForAge(int age) {
//        if (age >= 14) {
//            System.out.println("Can read");
//            return true;
//        } else {
//            System.out.println("Cant read");
//            return false;
//        }
//    }
//}