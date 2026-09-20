import java.util.*;

public class student {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Suyog");
        names.add("Samyak");
        names.add("Shubham");
        names.add("Samyak");
        names.add("abhijeet");

        HashMap<Integer , String> studentdata = new HashMap<>();
        studentdata.put(66, "Samyak");
        studentdata.put(67, "Shamik");
        studentdata.put(71, "abhijeet");
        studentdata.put(27, "Shubham");
        studentdata.put(21, "Suyog");

        TreeSet<Integer> studentMasks = new TreeSet<>();
        studentMasks.add(85);
        studentMasks.add(92);
        studentMasks.add(78);
        studentMasks.add(42);
        studentMasks.add(88);

        System.out.println();
        System.out.println("1. ArrayList (Student Names):");
        for (String name : names ) {
            System.out.println(" - Name: " + name);
        }
        System.out.println("2. TreeSet (Student Marks):");
        for (int mark : studentMasks) {
            System.out.println(" - Mark: " + mark);
        }
        System.out.println("\n3. Hashtable (Id -> Name):");
        for (Map.Entry<Integer, String> entry : studentdata.entrySet()) {
            System.out.println(" - Student Id: " + entry.getKey() + " | Student Name: " + entry.getValue());
        }
    }
}
