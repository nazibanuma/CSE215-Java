package exception_throws;

public class MyException extends Exception {

    MyException() {

    }

    public String ToString() {
        return "Radius Cant be negative";
    }
}
