import java.io.FileOutputStream;
import java.io.IOException;

public class NameToFile {

    public static void main(String[] args) {
        // Replace with your name
        String name = "Joao Victor de Almeida";
        byte[] nameBytes = name.getBytes();

        try {
            // Replace with the desired file path
            FileOutputStream fileOutputStream = new FileOutputStream("nameFile.txt");
            fileOutputStream.write(nameBytes);
            fileOutputStream.close();

            System.out.println("Name written to file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
