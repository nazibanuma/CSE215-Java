package abstractclass;

public class AbstractClass {

    public static void main(String[] args) {
        FictionBook book1 = new FictionBook("Romance", "Love Psychosis", "Colleen Hover");
        NonFictionBook book2 = new NonFictionBook("Thriller", "The Silent Patient", "Alex");

        book1.displayInfo();
        book2.displayInfo();

        book1.isRecommendedForAge(12);
        book2.isRecommendedForAge(18);

    }

}