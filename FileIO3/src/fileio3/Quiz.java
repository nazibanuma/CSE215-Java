package fileio3;

public class Quiz {

    int Id;
    double mark;

    public Quiz(int Id, double mark) {
        this.Id = Id;
        this.mark = mark;
    }

    public String toString() {
        return "Id: " + Id + " ,mark: " + mark;
    }
}
