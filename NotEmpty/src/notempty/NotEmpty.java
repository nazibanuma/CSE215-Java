package notempty;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotEmpty {

    public static void main(String[] args) {
        String filepath = "F:\\github\\CSE215-Java\\NotEmpty\\src\\notempty\\notes.txt";

        try {
            File file = new File(filepath);

            if (file.createNewFile()) {
                System.out.println("File name: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            Scanner input = new Scanner(System.in);
            FileWriter writer = new FileWriter(filepath, true);

            String line = input.nextLine();
            if (line.isEmpty()) {
                throw new BlankInputException("Its Blank~!");
            }
            writer.write(line);
            writer.flush();

        } catch (IOException e) {
            System.out.println("IO Exception");

        } catch (BlankInputException e) {
            System.out.println("Blank Input");
        }
    }

}
