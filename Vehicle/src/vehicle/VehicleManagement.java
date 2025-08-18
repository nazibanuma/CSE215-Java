package vehicle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VehicleManagement {

    private Vehicle[] vehicles;
    private int count;
    String filepath = "F:\\github\\CSE215-Java\\Vehicle\\src\\vehicle\\vehicle.txt";
    File file = new File(filepath);

    public VehicleManagement(int count) {
        this.count = 0;
        vehicles = new Vehicle[50];
    }

    public void addVehicle() {
        if (count >= 50) {
            System.out.println("Array full.Can not add more cars");
            return;
        }

        Vehicle v;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Vehicle Type: ");
        String type = input.nextLine();

        System.out.print("Input Vehicle ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Input brand Name: ");
        String name = input.nextLine();

        System.out.print("Year: ");
        int year = input.nextInt();

        if (type.equalsIgnoreCase("Car")) {
            System.out.print("Input seats amount: ");
            int seats = input.nextInt();
            v = new Car(seats, id, name, year);
        } else if (type.equalsIgnoreCase("Truck")) {
            System.out.print("Input Truck capacity: ");
            int capacity = input.nextInt();
            v = new Truck(capacity, id, name, year);
        } else {
            System.out.print("Input Motorcycle Eengine CC: ");
            int engineCC = input.nextInt();
            v = new Motorcycle(engineCC, id, name, year);
        }

        vehicles[count] = v;
        count++;

    }

    public void deleteVehicle(int id) throws VehicleNotFoundException {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getId() == id) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }
                vehicles[count - 1] = null;
                count--;
            }
        }
        if (false) {
            throw new VehicleNotFoundException("Error: ");
        }

    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i].toString());
        }
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < count; i++) {

                if (vehicles[i].getType().equalsIgnoreCase("Car")) {
                    Car c = (Car) vehicles[i];
                    writer.write(c.getType() + "," + c.getId() + "," + c.getBrand() + "," + c.getYear() + "," + c.getSeats());
                } else if (vehicles[i].getType().equalsIgnoreCase("Truck")) {
                    Truck t = (Truck) vehicles[i];
                    writer.write(t.getType() + "," + t.getId() + "," + t.getBrand() + "," + t.getYear() + "," + t.getCapacity());
                } else {
                    Motorcycle m = (Motorcycle) vehicles[i];
                    writer.write(m.getType() + "," + m.getId() + "," + m.getBrand() + "," + m.getYear() + "," + m.getEngineCC());
                }
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error: ");
        }
    }

    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] part = line.split("\\,");

                String type = part[0].trim();
                String name = part[2].trim();
                int id = Integer.parseInt(part[1].trim());
                int year = Integer.parseInt(part[3].trim());

                Vehicle a;
                if (type.equalsIgnoreCase("Car")) {
                    int seats = Integer.parseInt(part[4].trim());

                    a = new Car(seats, id, name, year);

                } else if (type.equalsIgnoreCase("Truck")) {

                    int capacity = Integer.parseInt(part[4].trim());

                    a = new Truck(capacity, id, name, year);
                } else {
                    int engineCC = Integer.parseInt(part[4].trim());

                    a = new Motorcycle(engineCC, id, name, year);
                }
                vehicles[count] = a;
                count++;
                System.out.println(count);

            }

        } catch (IOException e) {
            System.out.println("Error: ");
        }
    }

}
