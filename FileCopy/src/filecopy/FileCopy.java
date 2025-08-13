package filecopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {
        String inputfilepath = "F:\\github\\CSE215-Java\\FileCopy\\input.txt";
        String outputfilepath = "F:\\github\\CSE215-Java\\FileCopy\\output.txt";

        try {
            File inputfile = new File(inputfilepath);
            File outputfile = new File(outputfilepath);

            if (inputfile.createNewFile() && outputfile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(inputfile, true);
            Scanner input = new Scanner(System.in);

            System.out.print("Write in the file: ");
            String line = input.nextLine();
            writer.write(line + "\n");
            if (line.isEmpty()) {
                throw new EmptyFileException("File Empty");
            }
            writer.flush();

            FileReader reader = new FileReader(inputfile);
            FileWriter writer2 = new FileWriter(outputfile, true);

            int ch;
            while ((ch = reader.read()) != -1) { //readds in ASCIII value
                writer2.write(ch);
            }

            reader.close();
            writer2.close();

            Scanner input1 = new Scanner(outputfile);

            while (input1.hasNextLine()) {
                System.out.println(input1.nextLine());
            }

            //         FileReader reader = new FileReader(inputfile);
        } catch (EmptyFileException e) {
            System.out.println("Empty File" + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}
