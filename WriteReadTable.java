import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadTable {

  public static void main(String[] args) {
    String fileName = "table1.txt";
    int tableSize = 5;

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
      // Write table headers
      writer.write("Column 1\tColumn 2\n");

      // Write table rows
      for (int i = 1; i <= tableSize; i++) {
        writer.write(i + "\t" + (i * 2) + "\n");
      }

      System.out.println("Table written to file: " + fileName);
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  }
}
