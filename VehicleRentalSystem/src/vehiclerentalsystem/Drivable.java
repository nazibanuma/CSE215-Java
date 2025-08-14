package vehiclerentalsystem;

public interface Drivable {

    public void drive(double distance) throws LowfuelException;

    public double getFuelEfficiency();

}
