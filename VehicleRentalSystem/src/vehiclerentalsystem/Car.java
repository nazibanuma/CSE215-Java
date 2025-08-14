package vehiclerentalsystem;

public class Car extends Vehicle {

    private int numDoors;

    public Car(String model, int year, double fuellevel, int numDoors) {
        super(model, year, fuellevel);
        this.numDoors = numDoors;
    }
    
    public double calculateMaintenanceCost(){
        double cost = 0;
        cost = cost+numDoors;
        return cost;
    }

    
}
