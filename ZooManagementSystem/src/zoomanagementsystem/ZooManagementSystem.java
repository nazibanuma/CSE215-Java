package zoomanagementsystem;

import java.util.Scanner;
import java.io.*;

public class ZooManagementSystem {

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        int option = (int) (Math.random() * 5) + 1;

        System.out.println("Random Option: " + option);

        try {
            switch (option) {
                case 1:
                    zoo.addAnimal();
                    break;
                case 2:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    zoo.deleteAnimal(id);
                    break;
                case 3:
                    zoo.printAll();
                    break;
                case 4:
                    zoo.saveToFile();
                    break;
                case 5:
                    zoo.loadFromFile();
                    break;
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } catch (DataNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
