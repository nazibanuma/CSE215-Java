package exception_throws;

public class MyException extends Exception {

    MyException() {
        super();

    }

    public String toString() {
        return "Radius Cant be negative";
    }
}
