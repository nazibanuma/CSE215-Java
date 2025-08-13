package fileio2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIO2 {

    public static void main(String[] args) {

        String filepath = "F:\\github\\CSE215-Java\\FilePractise1\\src\\lines.txt";
        try {
            File file = new File(filepath);

            FileWriter writer = new FileWriter(filepath, true);
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Write a line:");
                String line = input.nextLine();
                String stop = line.toLowerCase();

                if (stop.equals("stop")) {
                    break;
                } else {
                    writer.write(line + "\n");
                    writer.flush();
                }

            }

            Scanner reader = new Scanner(file);

            int count = 0;
            while (reader.hasNextLine()) {
                String currentline = reader.nextLine();
                System.out.println("[" + currentline + "]");
                if (!(currentline.isEmpty())) {
                    count++;
                }

            }
            System.out.println("Non empty lines: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

    }
}
