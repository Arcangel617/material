/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisenine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student student;
    private String studentName = "studentName";
    private String studentAddress = "studentAddress";
    private String studentProgram = "studentProgram";
    private int studentYear = 9999;
    private double studentFee = 1000;

    @Before
    public void setup() {
        student = new Student(studentName, studentAddress, studentProgram, studentYear, studentFee);
    }

    @Test
    public void shouldBuildAStudentObject() {
        String expected = "Student[Person[name=" + studentName + ",address=" + studentAddress + "],program=" +
                studentProgram + ",year=" + studentYear + ",fee=" + studentFee + "]";
        assertEquals(expected, student.toString());
    }

    @Test
    public void shouldReturnStudentProgram() {
        assertEquals(studentProgram,student.getProgram());
    }

}