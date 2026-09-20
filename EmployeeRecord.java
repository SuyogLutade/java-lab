import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeRecord {
    public static void main(String[] args) {
        String fileName = "employee.txt";

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("ID: 101, Name: John Doe, Department: IT, Salary: $75000\n");
            writer.write("ID: 102, Name: Jane Smith, Department: HR, Salary: $68000\n");
            System.out.println("Employee records written successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        
        System.out.println("--- Employee File Contents ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}