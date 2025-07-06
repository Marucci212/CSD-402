// Justin Marucci 
// Assignment 9

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        try {
            // Create a File object
            File file = new File("data.file");

            // Check if the file exists. If not, create it.
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file created.");
            } else {
                System.out.println("File already exists.");
            }

            // Open the file in append mode
            FileWriter writer = new FileWriter(file, true);

            // Write 10 random numbers to the file
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); // number between 0–99
                writer.write(number + " ");     // add space after number
            }

            // Close the writer
            writer.close();
            System.out.println("10 random numbers were added to the file.\n");

            // Read the file and display the contents
            Scanner reader = new Scanner(file);
            System.out.println("Numbers in the file:");
            while (reader.hasNext()) {
                String data = reader.next();
                System.out.print(data + " ");
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error happened while working with the file.");
            e.printStackTrace();
        }
    }
}
