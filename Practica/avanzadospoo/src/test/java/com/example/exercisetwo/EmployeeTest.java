package com.example.exercisetwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    private Employee employee;
    private String firstName = "firstName";
    private String lastName = "lastName";
    private int salary = 1000;

    @BeforeEach
    public void setup() {
        employee = new Employee(1,firstName,lastName,salary);
    }

    @Test
    public void shouldBuildAnEmployeeObject() {
        String expected = "Employee[id=1,name=" + firstName + " " + lastName + ",salary=" + salary + "]";
        assertEquals(expected, employee.toString());
    }

    @Test
    public void shouldReturnEmployeeId() {
        assertEquals(1, employee.getId());
    }

    @Test
    public void shouldReturnEmployeeFirstName() {
        assertEquals(firstName, employee.getFirstName());
    }

    @Test
    public void shouldReturnEmployeeLastName() {
        assertEquals(lastName,employee.getLastName());
    }

    @Test
    public void shouldReturnEmployeeSalary() {
        assertEquals(salary,employee.getSalary());
    }

    @Test
    public void shouldReturnEmployeeName() {
        assertEquals(firstName + " " + lastName,employee.getName());
    }

    @Test
    public void shouldUpdateEmployeeSalary() {
        int newSalary = 2000;
        assertEquals(salary,employee.getSalary());
        employee.setSalary(newSalary);
        assertEquals(newSalary,employee.getSalary());
    }

    @Test
    public void shouldReturnEmployeeAnnualSalary() {
        int expectedAnnualSalary = salary * 12;
        assertEquals(expectedAnnualSalary,employee.getAnnualSalary());
    }

    @Test
    public void shouldReturnEmployeeraiseSalary() {
        assertEquals(11000,employee.raiseSalary(10));
    }
}