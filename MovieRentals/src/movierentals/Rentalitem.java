package movierentals;

public abstract class Rentalitem {

    protected int id;
    protected String title;
    protected double rentalPrice;
    protected int rentCount;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public int getRentCount() {
        return rentCount;
    }

    public abstract void incrementRentCount();

    public abstract String toString();

}
