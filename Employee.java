import java.util.*;

public class Employee {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Suyog");
        names.add("Samyak");
        names.add("Shubham");
        names.add("Samyak");
        names.add("abhijeet");

        HashMap<Integer , String> EmployeeMap = new HashMap<>();
        EmployeeMap.put(66, "Samyak");
        EmployeeMap.put(67, "Shamik");
        EmployeeMap.put(71, "abhijeet");
        EmployeeMap.put(27, "Shubham");
        EmployeeMap.put(21, "Suyog");

        TreeSet<Integer> EmployeeSalary = new TreeSet<>();
        EmployeeSalary.add(85000);
        EmployeeSalary.add(92000);
        EmployeeSalary.add(78000);
        EmployeeSalary.add(42000);
        EmployeeSalary.add(88000);

        System.out.println();
        System.out.println("1. ArrayList (Employee Names):");
        for (String name : names ) {
            System.out.println(" - Name: " + name);
        }
        System.out.println("2. TreeSet (Employee Salary):");
        for (int mark : EmployeeSalary) {
            System.out.println(" - Salary: " + mark);
        }
        System.out.println("\n3. Hashtable (Id -> Name):");
        for (Map.Entry<Integer, String> entry : EmployeeMap.entrySet()) {
            System.out.println(" - Employee Id: " + entry.getKey() + " | Employee Name: " + entry.getValue());
        }
    }
}
