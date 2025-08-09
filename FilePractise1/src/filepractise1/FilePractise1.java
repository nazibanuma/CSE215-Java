package filepractise1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FilePractise1 {

    public static void main(String[] args) {
        String filepath = "F:\\github\\CSE215-Java\\FilePractise1\\src\\filepractise1\\test.txt";

        try {
            File obj = new File(filepath);
            if (obj.createNewFile()) {
                System.out.println("File name : " + obj.getName());

            } else {
                System.out.println("File already exists");
            }

            Scanner input = new Scanner(System.in);
            FileWriter writer = new FileWriter(filepath);

            while (true) {
                System.out.print("Enter integer numbers: ");
                int num = input.nextInt();
                if (num < 0) {
                    System.out.println("Alas its a negative interger");
                    break;
                } else {
                    writer.write(num + "\n");
                    writer.flush();
                }
            }

            Scanner input1 = new Scanner(obj);
            int count = 0;
            int sum = 0;
            while (input1.hasNextInt()) {
                int number = input1.nextInt();
                System.out.println(number);

                sum = sum + number;
                count++;

            }
            double average =((double)sum / count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
