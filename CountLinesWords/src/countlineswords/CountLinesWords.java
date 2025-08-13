package countlineswords;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CountLinesWords {

    public static void main(String[] args) {
        String filepath = "F:\\github\\CSE215-Java\\FileCopy\\input.txt";

        try {
            File file = new File(filepath);

            if (file.exists()) {
                System.out.println("File exists");
            } else {
                System.out.println("No Story available!");
            }

            Scanner input = new Scanner(System.in);
            FileWriter writer = new FileWriter(filepath, true);

            String line = input.nextLine();
            writer.write(line);
            writer.flush();

            int ch;
            int countChar = 0;
            ;
            FileReader reader = new FileReader(file);
            
            while ((ch = reader.read()) != -1) {
                
                for (int i = 0; i < ch; i++) {
                    if (ch >= 65 || ch <= 90 || ch <= 122 || ch >= 97) {
                        countChar++;
                    }
                    else if(ch !=32){
                        
                    }

                }
            }

        } catch (Exception e) {

        }
    }

}
