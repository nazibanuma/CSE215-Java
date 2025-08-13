package fileio3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class QuizClass {

    public static void main(String[] args) {

        String filepath = "F:\\github\\CSE215-Java\\FileIO3\\QuizClass.txt";
        try {
            File file = new File(filepath);

            if (file.createNewFile()) {
                System.out.println("File name: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            Scanner input = new Scanner(System.in);
            FileWriter writer = new FileWriter(filepath, true);

            Quiz quiz[] = new Quiz[3];

            double max = 0;
            int maxId = 0;
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter ID and mark: ");
                int idno = input.nextInt();
                if (idno < 0) {
                    throw new ArithmeticException();
                }
                double markno = input.nextDouble();
                quiz[i] = new Quiz(idno, markno);
                writer.write("ID: " + idno + " Marks: " + markno + "\n");

                for (int j = 0; j < 3; j++) {
                    if (quiz[i].mark > max) {
                        max = quiz[i].mark;
                        maxId = quiz[i].Id;
                    }
                }

            }

            writer.flush();

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
                System.out.println("Highest marks ID: " + maxId);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

    }

}
