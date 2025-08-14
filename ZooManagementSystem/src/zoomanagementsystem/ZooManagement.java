package zoomanagementsystem;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;

public class ZooManagement {

    Animal[] animals;
    private int count;
    private static int newID = 1;
    String filepath = "F:\\github\\CSE215-Java\\ZooManagementSystem\\src\\zoomanagementsystem\\zoo.txt";
    File file = new File(filepath);

    public ZooManagement() {
        animals = new Animal[50];
        count = 0;
    }

    public void addAnimal() {
        Animal a = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new animal name: ");
        String name = input.nextLine();
        System.out.println("Enter new animal age: ");
        int age = input.nextInt();
        int type = (int) (Math.random() * 3) + 1;

        if (type == 1) {
            a = new Lion(newID++, name, age);
        } else if (type == 2) {
            a = new Elephant(newID++, name, age);
        } else {
            a = new Parrot(newID++, name, age);
        }

        if (count < animals.length) {
            animals[count++] = a;
        } else {
            System.out.println("Zoo full");
        }
    }

    public void deleteAnimal(int id) {
        for (int i = 0; i < count; i++) {
            if (animals[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    animals[j] = animals[j + 1];
                    count--;
                }
            } else {
                System.out.println("Id not found");
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].toString());
            System.out.println("");
            animals[i].makeSound();
            System.out.println("");
            animals[i].getFoodType();
        }
    }

    public void saveToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        try {
            for (int i = 0; i < count; i++) {
                String name = animals[i].getName();
                int age = animals[i].getAge();
                int id = animals[i].getId();
                writer.write(name + "|" + age + "|" + id + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void loadFromFile() throws IOException, DataNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        count = 0;
        try {
            if (!file.exists() || file.length() == 0) {
                throw new DataNotFoundException("Its Empty");
            } else {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    int id = Integer.parseInt(parts[2].trim());
                    if (id == 1) {
                        animals[count++] = new Lion(id, name, age);
                    } else if (id == 2) {
                        animals[count++] = new Elephant(id, name, age);
                    } else if (id == 3) {
                        animals[count++] = new Parrot(id, name, age);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (DataNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
