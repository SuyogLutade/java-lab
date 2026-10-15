package com.example.employee;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class EmployeeTest {
 @Test
 public void testGrossSalary() {
 Employee emp = new Employee(
 101,
 "Neha",
 "Software Developer",
 50000
 );
 double expected = 65000;
 assertEquals(expected, emp.calculateGrossSalary());
 }
}