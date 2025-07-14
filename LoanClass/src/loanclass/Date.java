//package loanclass;

public class Date {

    int day;
    int month;
    int year;

    Date(int date, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String date = (+ this.day + "/" + this.month + "/" + this.year);
        return date;
    }
}
