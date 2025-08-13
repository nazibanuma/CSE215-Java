package iah_exception;

public class IAH_exception {

    public static void courseNumber(int num) throws WrongCourseException {
        if (num != 215) {
            throw new WrongCourseException("This course is not CSE 215");
        }
    }

    public static void main(String[] args) {
        try {
            courseNumber(110);
        } catch (WrongCourseException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
