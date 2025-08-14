package vehiclerentalsystem;

public abstract class Vehicle implements Drivable {

    private String model;
    private int year;
    private double fuellevel;
    private boolean isRented;

    public Vehicle(String model, int year, double fuellevel) {
        this.model = model;
        this.year = year;
        this.fuellevel = fuellevel;
        isRented = false;
        if (this.fuellevel < 0) {
            fuellevel = 0;
        } else if (this.fuellevel > 50) {
            fuellevel = 50;
        } else {
            this.fuellevel = fuellevel;
        }
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuellevel() {
        return fuellevel;
    }

    public boolean isIsRented() {
        return isRented;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFuellevel(double fuellevel) {
        this.fuellevel = fuellevel;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public abstract double calculateMaintenanceCost();

    public abstract void refuel(double amount) throws InvalidFuelAmountException;

}
