
import java.io.File;
import java.io.IOException;

public class neewfile {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\HP\\OneDrive\\Documents\\";
        String fileName = "Saiful.txt";
        File obj = new File(basePath + fileName);

        try {
            if (obj.exists()) {
                int count = 1;
                do {
                    fileName = "Saiful" + count + ".txt";
                    obj = new File(basePath + fileName);
                    count++;
                } while (obj.exists());
            }

            if (obj.createNewFile()) {
                System.out.println("File " + obj.getName() + " is created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error");
            exception.printStackTrace();
        }

        System.out.println("Path: " + obj.getAbsolutePath());
        System.out.println("Writable: " + obj.canWrite());
        System.out.println("Readable: " + obj.canRead());
        System.out.println("Length in bytes: " + obj.length());
    }
}



