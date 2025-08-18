package vehicle;

public class VehicleMain {

    public static void main(String[] args) {
        VehicleManagement a = new VehicleManagement(0);

        try {

            a.addVehicle();
            a.deleteVehicle(1);
            a.printAll();
            a.saveToFile();
            a.loadFromFile();
        } catch (VehicleNotFoundException e) {
            System.out.println("Error: ");
        }

    }

}
