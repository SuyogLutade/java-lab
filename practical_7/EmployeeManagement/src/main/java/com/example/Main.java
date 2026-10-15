package com.example.employee;
public class Main {
 public static void main(String[] args) {
 Employee emp = new Employee(
 101,
 "Neha",
 "Software Developer",
 50000
 );
 System.out.println("EMPLOYEE SALARY DETAILS");
 System.out.println("=======================");
 emp.display();
 }
}