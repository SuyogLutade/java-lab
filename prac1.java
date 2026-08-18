class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void incrementSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    public void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : $" + salary);
        System.out.println();
    }
}

public class prac1 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alex Morgan", 50000.0);
        System.out.println("--- Before Increment ---");
        emp.display();
        emp.incrementSalary(10.0);
        System.out.println("--- After Increment (10%) ---");
        emp.display();
    }
}