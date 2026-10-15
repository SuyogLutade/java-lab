
package com.example.student;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", "CSE", 85);
        Student s2 = new Student(102, "Priya", "CSE", 72);
        Student s3 = new Student(103, "Amit", "CSE", 45);

        System.out.println("STUDENT GRADE MANAGEMENT");
        System.out.println("========================");

        s1.display();
        s2.display();
        s3.display();
    }
}
