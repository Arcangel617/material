/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

import java.util.ArrayList;

class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}

class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}

class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[" + super.toString() + ",school= " + school + ", pay=" + pay + "]";
    }
}

public class Ejercicio9 {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Student("Arcangel", "Corrientes", "Programming II", 2016 ,600));
        people.add(new Student("Mariano", "Resistencia", "Programming II", 2015 ,600));
        people.add(new Staff("UEP53", 2000, "Facundo", "Resistencia"));

        for (Person person : people) {
            System.out.println(person);
        }
    }

}
