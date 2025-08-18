
package vehicle;

public class Truck extends Vehicle {

    private int capacity;

    public Truck(int capacity, int id, String brand, int year) {
        super(id, brand, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public String getType(){
        return "Truck";
    }
    public String toString() {
        return super.toString() + ", Capacity: "+getCapacity();
    }
    
}