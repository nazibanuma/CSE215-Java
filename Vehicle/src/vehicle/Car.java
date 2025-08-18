package vehicle;

public class Car extends Vehicle {

    private int seats;

    public Car(int seats, int id, String brand, int year) {
        super(id, brand, year);
        this.seats = seats;
    }

    public String getType() {
        return "Car";
    }

    public int getSeats() {
        return seats;
    }

    public String toString() {
        return super.toString() + ",Seats: "+getSeats();
    }
}
