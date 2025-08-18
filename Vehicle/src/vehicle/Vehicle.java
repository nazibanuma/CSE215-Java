package vehicle;

public abstract class Vehicle {
    private int id;
    private String brand;
    private int year;

    public Vehicle(int id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
    
    public abstract String getType();
    
    public String toString(){
        return "ID :"+getId()+", Name: "+getBrand()+ ", Year: "+getYear();
    }
}
