package JDBC_CRUD;
import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "USERNAME";
        String password = "password";

        try {
            Connection con = DriverManager.getConnection(
                url, user, password
            );

            System.out.println("Database connected!");

            while (true) {
                System.out.println("\n1. Insert Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Marks");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    String sql =
                        "INSERT INTO student VALUES (?, ?, ?)";

                    PreparedStatement ps =
                        con.prepareStatement(sql);

                    ps.setInt(1, roll);
                    ps.setString(2, name);
                    ps.setDouble(3, marks);

                    ps.executeUpdate();
                    System.out.println("Student inserted!");

                    ps.close();

                } else if (choice == 2) {
                    String sql = "SELECT * FROM student";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while (rs.next()) {
                        System.out.println(
                            rs.getInt("roll_no") + " " +
                            rs.getString("name") + " " +
                            rs.getDouble("marks")
                        );
                    }

                    rs.close();
                    st.close();

                } else if (choice == 3) {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter new marks: ");
                    double marks = sc.nextDouble();

                    String sql =
                        "UPDATE student SET marks = ? WHERE roll_no = ?";

                    PreparedStatement ps =
                        con.prepareStatement(sql);

                    ps.setDouble(1, marks);
                    ps.setInt(2, roll);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Student updated!");
                    else
                        System.out.println("Student not found!");

                    ps.close();

                } else if (choice == 4) {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();

                    String sql =
                        "DELETE FROM student WHERE roll_no = ?";

                    PreparedStatement ps =
                        con.prepareStatement(sql);

                    ps.setInt(1, roll);

                    int rows = ps.executeUpdate();

                    if (rows > 0)
                        System.out.println("Student deleted!");
                    else
                        System.out.println("Student not found!");

                    ps.close();

                } else if (choice == 5) {
                    con.close();
                    sc.close();
                    System.out.println("Program ended.");
                    break;

                } else {
                    System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// CREATE DATABASE college;
// USE college;

// CREATE TABLE student (
//     roll_no INT PRIMARY KEY,
//     name VARCHAR(50),
//     marks DOUBLE
// );