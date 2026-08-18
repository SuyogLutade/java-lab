import java.util.Scanner;

class Employee {

    void calcSalary(Scanner sc) {
        // Base method
    }
}

class Manager extends Employee {

    @Override
    void calcSalary(Scanner sc) {

        System.out.println("Enter the GST percentage: ");
        double gst = sc.nextDouble();

        double baseSalary = 60000;
        double totalSalary = baseSalary - (baseSalary * (gst / 100));

        System.out.println("Salary of the Manager is: " + totalSalary);
    }
}

class Programmer extends Employee {

    @Override
    void calcSalary(Scanner sc) {

        System.out.println("Enter the number of hours the programmer worked: ");
        int hr = sc.nextInt();

        System.out.println("Enter the GST percentage: ");
        double gst = sc.nextDouble();

        System.out.println("Enter the base payment per hour of programmer: ");
        double base = sc.nextDouble();

        double totalEarnings = base * hr;
        double deduction = totalEarnings * (gst / 100);
        double salary = totalEarnings - deduction;

        System.out.println("Salary of the Programmer is: " + salary);
    }
}

public class prac2A_java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee mngr = new Manager();
        Employee prgmer = new Programmer();

        System.out.println("--- Manager Salary Calculation ---");
        mngr.calcSalary(sc);

        System.out.println("\n--- Programmer Salary Calculation ---");
        prgmer.calcSalary(sc);

        sc.close();
    }
}