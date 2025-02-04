import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File inputFile = new File("C:/Users/HP/OneDrive/Documents/gaurav.12219846@lpu.in.txt");
        // Using try-with-resources for both Scanner and FileWriter to ensure they are closed properly.
        try (Scanner dataReader = new Scanner(inputFile);
             FileWriter writer = new FileWriter("C:/Users/HP/OneDrive/Documents/saifjava.txt")) {
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData); // Print to console
                writer.write(fileData + System.lineSeparator()); // Write to file and add a new line
            }
        } catch (IOException e) { // FileNotFoundException is a subclass of IOException
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
