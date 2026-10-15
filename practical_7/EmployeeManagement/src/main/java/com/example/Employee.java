package com.example.employee;
public class Employee {
 private int id;
 private String name;
 private String designation;
 private double basicSalary;
 public Employee(int id, String name, String designation,
 double basicSalary) {
 this.id = id;
 this.name = name;
 this.designation = designation;
 this.basicSalary = basicSalary;
 }
 public double calculateHRA() {
 return basicSalary * 0.20;
 }
 public double calculateDA() {
 return basicSalary * 0.10;
 }
 public double calculateGrossSalary() {
 return basicSalary + calculateHRA() + calculateDA();
 }
 public void display() {
 System.out.println("Employee ID : " + id);
 System.out.println("Name : " + name);
 System.out.println("Designation : " + designation);
 System.out.println("Basic Salary: " + basicSalary);
 System.out.println("HRA : " + calculateHRA());
 System.out.println("DA : " + calculateDA());
 System.out.println("Gross Salary: " + calculateGrossSalary());
 }
}
