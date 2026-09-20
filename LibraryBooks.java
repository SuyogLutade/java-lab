import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LibraryBooks {
    public static void main(String[] args) {
        String fileName = "books.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Book ID: B101, Title: Java Programming, Author: James Gosling\n");
            writer.write("Book ID: B102, Title: Clean Code, Author: Robert C. Martin\n");
            System.out.println("Book details written successfully.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }

        System.out.println("--- Library Books Contents ---");
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }
}